package GUI;

import Logica.Automata;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.JPanel;

public class PanelDibujo extends JPanel implements Runnable {

    public static Color COLOR_0 = new Color(255, 255, 255);//gris
    public static Color COLOR_1 = new Color(46, 217, 71);//verde
    public static Color COLOR_2 = new Color(237, 7, 38);//rojo
    public static Color COLOR_3 = new Color(86, 137, 219);//Azul
    public static Color COLOR_4 = new Color(212, 230, 18);//amarillo

    public boolean run = false;
    public boolean pintar = false;
    public boolean mute = false;
    public int time;

    Rectangle r;

    public PanelDibujo() {
        setSize(665, 635);
        setBackground(new Color(41, 45, 89));
        new Thread(this).start();
        time = 100;



    }

    Automata instrumento;
    int iterador = 0;

    public int calcularNota() {
        String[] M = instrumento.Matriz;

        int suma = 0;
        String actual = M[iterador];

        while (actual.length() != 1) {
            for (int i = 0; i < actual.length(); i++) {
                try {
                    int c = Integer.parseInt(actual.charAt(i) + "");
                    suma += c;
                } catch (Exception e) {
                    int c = (int) (Math.random() * this.instrumento.numeroEstados);
                    suma += c;
                }

            }
            actual = suma + "";

            suma = 0;
        }
        instrumento.actualizarNota(Integer.parseInt(actual));
        return Integer.parseInt(actual);
    }

    public void run2() {
        String[] M = instrumento.Matriz;
        String nueva = "";
        if (iterador == M.length - 1) {
            M[0] = M[M.length - 1];
            iterador = 0;
        }

        for (int i = 0; i < M.length; i++) {
            if (instrumento.mapRegla.get(vecinos(iterador, i)) == null) {
                nueva += (int) (Math.random() * (this.instrumento.numeroEstados));
                System.out.println("null");
            } else {
                nueva += instrumento.mapRegla.get(vecinos(iterador, i));
            }
        }

        M[iterador + 1] = nueva;
        if (!mute) {
            sacarAudio(calcularNota());
        }
        iterador++;

    }

    public void sacarAudio(int j) {

        instrumento.Sonando2[j].play();
    }

    public String vecinos(int i, int j) {

        String anterior = "";
        String siguiente = "";

        if (j == 0) {
            anterior = instrumento.Matriz[i].charAt(instrumento.Matriz.length - 1) + "";
            siguiente = instrumento.Matriz[i].charAt(1) + "";
        } else if (j == instrumento.Matriz.length - 1) {
            anterior = instrumento.Matriz[i].charAt(instrumento.Matriz.length - 2) + "";
            siguiente = instrumento.Matriz[i].charAt(0) + "";

        } else {
            anterior = instrumento.Matriz[i].charAt(j - 1) + "";
            siguiente = instrumento.Matriz[i].charAt(j + 1) + "";
        }

        return anterior + instrumento.Matriz[i].charAt(j) + siguiente;
    }

    public void setNum(int num) {
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (instrumento != null) {

            for (int j = 0; j < instrumento.Matriz.length; j++) {

                for (int i = 0; i < instrumento.Matriz[j].length(); i++) {
                    char caracter = instrumento.Matriz[j].charAt(i);

                    switch (caracter) {
                        case '0':
                            g.setColor(COLOR_0);
                            break;
                        case '1':
                            g.setColor(COLOR_1);
                            break;
                        case '2':
                            g.setColor(COLOR_2);
                            break;
                        case '3':
                            g.setColor(COLOR_3);
                            break;
                        case '4':
                            g.setColor(COLOR_4);
                            break;

                    }
                    g.fillRect(i * 20 + 10, j * 20 + 10, 20, 20);

                }
                int R = (int) (Math.random() * 255);
                int G = (int) (Math.random() * 255);
                int B = (int) (Math.random() * 255);

            }

        } else {

        }

        if (run && pintar) {
            pintar = false;
            run2();
        }

        repaint();
    }

    @Override
    public void run() {
        while (true) {

            try {
                Thread.sleep(time);
                pintar = true;

            } catch (InterruptedException ex) {

            }
        }
    }
}
