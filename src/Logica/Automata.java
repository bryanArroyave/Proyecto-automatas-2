package Logica;

import java.applet.AudioClip;
import java.awt.Font;
import java.text.DecimalFormat;
import java.util.HashMap;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class Automata {

    public String instrumento;
    public int numeroEstados;
    int numeroTrancisiones;
    int posibilidades;
    public int regla;

    public HashMap<Integer, String> conversorNota;
    public HashMap<String, String> mapRegla;
    public String[] Matriz;
    public String[] d;
    public String vectorInicial;
    public String vectorRegla;

    public AudioClip[] Sonando2;

    public String notaActual = "NA";

    public Automata(String instrumento, int numeroEstados, String vectorInicial, int posibilidades, int regla) {
        this.instrumento = instrumento;
        this.numeroEstados = numeroEstados;
        this.vectorInicial = vectorInicial;
        this.numeroTrancisiones = vectorInicial.length();
        this.regla = regla;
        this.posibilidades = posibilidades;
        this.Matriz = new String[numeroTrancisiones];
        this.d = new String[numeroTrancisiones];
        this.llenarSonando2();
        this.llenarInicial();

    }

    public void llenarSonando2() {
        Sonando2 = new AudioClip[10];

        conversorNota = new HashMap<>();
        conversorNota.put(0, "do");
        conversorNota.put(1, "do");
        conversorNota.put(2, "re");
        conversorNota.put(3, "mi");
        conversorNota.put(4, "fa");
        conversorNota.put(5, "sol");
        conversorNota.put(6, "la");
        conversorNota.put(7, "si");
        conversorNota.put(8, "do");
        conversorNota.put(9, "do");
        try {
            Sonando2[0] = java.applet.Applet.newAudioClip(getClass().getResource("/Musica/" + instrumento + "/" + "_do" + ".wav"));
            Sonando2[1] = java.applet.Applet.newAudioClip(getClass().getResource("/Musica/" + instrumento + "/" + "_do" + ".wav"));
            Sonando2[2] = java.applet.Applet.newAudioClip(getClass().getResource("/Musica/" + instrumento + "/" + "_re" + ".wav"));
            Sonando2[3] = java.applet.Applet.newAudioClip(getClass().getResource("/Musica/" + instrumento + "/" + "_mi" + ".wav"));
            Sonando2[4] = java.applet.Applet.newAudioClip(getClass().getResource("/Musica/" + instrumento + "/" + "_fa" + ".wav"));
            Sonando2[5] = java.applet.Applet.newAudioClip(getClass().getResource("/Musica/" + instrumento + "/" + "_sol" + ".wav"));
            Sonando2[6] = java.applet.Applet.newAudioClip(getClass().getResource("/Musica/" + instrumento + "/" + "_la" + ".wav"));
            Sonando2[7] = java.applet.Applet.newAudioClip(getClass().getResource("/Musica/" + instrumento + "/" + "_si" + ".wav"));
            Sonando2[8] = java.applet.Applet.newAudioClip(getClass().getResource("/Musica/" + instrumento + "/" + "_do" + ".wav"));
            Sonando2[9] = java.applet.Applet.newAudioClip(getClass().getResource("/Musica/" + instrumento + "/" + "_do" + ".wav"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "no se encontro el instrumento " + instrumento);
        }
    }

    public void recorrerD() {
        String reglaBase = convertirReglaBase();
        mapRegla = new HashMap<>();
        for (int i = 0; i < d.length; i++) {

            mapRegla.put(d[i], String.valueOf(reglaBase.charAt(i)));

        }
    }

    public void actualizarNota(int actual) {
        notaActual = conversorNota.get(actual);

    }

    private void llenarInicial() {
        for (int i = 0; i < Matriz.length; i++) {
            if (i == 0) {
                Matriz[i] = vectorInicial;
            } else {
                String cad = "";
                for (int j = 0; j < vectorInicial.length(); j++) {
                    cad += "0";
                }
                Matriz[i] = cad;
            }
        }
        vectorRegla = vectorInicial.substring(0, 4) + vectorInicial.substring(vectorInicial.length() - 5, vectorInicial.length() - 1);

    }

    public String toString() {

        return "instumento: " + instrumento
                + "\nnumeroEstados: " + numeroEstados
                + "\nnumeroTrancisiones: " + numeroTrancisiones
                + "\nposibilidades: " + posibilidades
                + "\nregla: " + regla;
    }

    private String calcularFormato() {
        String cad = "";
        for (int i = 0; i < d.length; i++) {
            cad += "0";
        }
        return cad;
    }

    private String convertirReglaBase() {

        String formatoDeseado = calcularFormato();
        String formato8 = "00000000";
        DecimalFormat formateador = new DecimalFormat(formato8);
        String digitos[] = new String[numeroEstados];

        for (int i = 0; i < numeroEstados; i++) {
            digitos[i] = String.valueOf(i);
        }

        String baseNueva = "";
        int resto, aux = regla;

        while (aux > 0) {
            resto = aux % numeroEstados;
            baseNueva = digitos[resto] + baseNueva;
            aux /= numeroEstados;
        }
        String cad = "";
        int cont = 0;

        baseNueva = formateador.format(Integer.parseInt(baseNueva));
        if (numeroEstados > 2) {
            for (int i = 0; i < calcularFormato().length() - 8; i++) {
                if (cont == 8) {
                    cont = 0;
                }
                cad += baseNueva.charAt(cont);

                cont++;
            }
        }

        baseNueva = cad + baseNueva;

        return regla == 0 ? formatoDeseado : baseNueva;

    }

}
