package GUI;

import Logica.Automata;
import java.awt.Color;

import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.text.DecimalFormat;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicTabbedPaneUI;

public class principal extends javax.swing.JFrame implements Runnable {

    Automata i1;
    Automata i2;
    Automata i3;

    boolean termino1 = false;
    boolean termino2 = false;
    boolean termino3 = false;

    public principal() {
        initComponents();
        this.configurarFrame();
        this.ocultarPestañas();

        new Thread(this).start();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg_instrumento1 = new javax.swing.ButtonGroup();
        bg_instrumento2 = new javax.swing.ButtonGroup();
        bg_instrumento3 = new javax.swing.ButtonGroup();
        configuracion = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        Base = new javax.swing.JPanel();
        lbl_Instrumento1 = new javax.swing.JLabel();
        lbl_Instrumento2 = new javax.swing.JLabel();
        lbl_Instrumento3 = new javax.swing.JLabel();
        lbl_base_1 = new javax.swing.JLabel();
        base_2_1 = new javax.swing.JRadioButton();
        base_4_1 = new javax.swing.JRadioButton();
        base_3_1 = new javax.swing.JRadioButton();
        base_5_1 = new javax.swing.JRadioButton();
        jLabel17 = new javax.swing.JLabel();
        txt_transición1 = new javax.swing.JTextField();
        list_instrumento1 = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txt_regla1 = new javax.swing.JTextField();
        verificar_1 = new javax.swing.JButton();
        lbl_base_2 = new javax.swing.JLabel();
        base_2_2 = new javax.swing.JRadioButton();
        base_3_2 = new javax.swing.JRadioButton();
        base_4_2 = new javax.swing.JRadioButton();
        base_5_2 = new javax.swing.JRadioButton();
        jLabel20 = new javax.swing.JLabel();
        txt_transición2 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        list_instrumento2 = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        txt_regla2 = new javax.swing.JTextField();
        verificar_2 = new javax.swing.JButton();
        lbl_base_3 = new javax.swing.JLabel();
        base_2_3 = new javax.swing.JRadioButton();
        base_3_3 = new javax.swing.JRadioButton();
        base_4_3 = new javax.swing.JRadioButton();
        base_5_3 = new javax.swing.JRadioButton();
        jLabel23 = new javax.swing.JLabel();
        txt_transición3 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        list_instrumento3 = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        txt_regla3 = new javax.swing.JTextField();
        verificar_3 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        panelDibujo1 = new GUI.PanelDibujo();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sp_2 = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        panelDibujo2 = new GUI.PanelDibujo();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        sp_3 = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        panelDibujo3 = new GUI.PanelDibujo();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        sp_4 = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        configuracion.setBackground(new java.awt.Color(255, 255, 255));
        configuracion.setForeground(new java.awt.Color(0, 51, 51));

        Base.        setBackground(new Color(41, 45, 89));
        Base.setBackground(new Color(41, 45, 89));

        lbl_Instrumento1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Instrumento1.setText("Instumento1");

        lbl_Instrumento2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Instrumento2.setText("Instumento2");

        lbl_Instrumento3.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Instrumento3.setText("Instumento3");

        lbl_base_1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_base_1.setText("Base");

        bg_instrumento1.add(base_2_1);
        base_2_1.setSelected(true);
        base_2_1.setText("2");
        base_2_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                base_2_1MouseClicked(evt);
            }
        });
        base_2_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                base_2_1ActionPerformed(evt);
            }
        });

        bg_instrumento1.add(base_4_1);
        base_4_1.setText("4");
        base_4_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                base_4_1MouseReleased(evt);
            }
        });
        base_4_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                base_4_1ActionPerformed(evt);
            }
        });

        bg_instrumento1.add(base_3_1);

        base_3_1.setText("3");
        base_3_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                base_3_1MouseReleased(evt);
            }
        });
        base_3_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                base_3_1ActionPerformed(evt);
            }
        });

        bg_instrumento1.add(base_5_1);
        base_5_1.setText("5");
        base_5_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                base_5_1ActionPerformed(evt);
            }
        });

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Ingrese el vector inicial");

        txt_transición1.setText("000010000");
        txt_transición1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_transición1ActionPerformed(evt);
            }
        });
        txt_transición1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_transición1KeyTyped(evt);
            }
        });

        list_instrumento1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BANJO", "CLARINET", "DOUBLE-BASS", "FLUTE", "GUITAR", "MANDOLIN", "SAXOPHONE", "TROMPETA", "VIOLA", "VIOLIN" }));

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Instrumento");

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Regla");

        txt_regla1.setText("90");
        txt_regla1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_regla1KeyTyped(evt);
            }
        });

        verificar_1.setBackground(Color.RED);
        verificar_1.setText("Verificar");
        verificar_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verificar_1ActionPerformed(evt);
            }
        });

        lbl_base_2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_base_2.setText("Base");

        bg_instrumento2.add(base_2_2);
        base_2_2.setSelected(true);
        base_2_2.setText("2");
        base_2_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                base_2_2MouseClicked(evt);
            }
        });
        base_2_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                base_2_2ActionPerformed(evt);
            }
        });

        bg_instrumento2.add(base_3_2);
        base_3_2.setText("3");
        base_3_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                base_3_2ActionPerformed(evt);
            }
        });

        bg_instrumento2.add(base_4_2);
        base_4_2.setText("4");
        base_4_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                base_4_2ActionPerformed(evt);
            }
        });

        bg_instrumento2.add(base_5_2);
        base_5_2.setText("5");
        base_5_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                base_5_2ActionPerformed(evt);
            }
        });

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Ingrese el vector inicial");

        txt_transición2.setText("01001000100111");
        txt_transición2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_transición2ActionPerformed(evt);
            }
        });
        txt_transición2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_transición2KeyTyped(evt);
            }
        });

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Instrumento");

        list_instrumento2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BANJO", "CLARINET", "DOUBLE-BASS", "FLUTE", "GUITAR", "MANDOLIN", "SAXOPHONE", "TROMPETA", "VIOLA", "VIOLIN" }));

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Regla");

        txt_regla2.setText("90");
        txt_regla2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_regla2KeyTyped(evt);
            }
        });

        verificar_2.setBackground(Color.RED);
        verificar_2.setText("Verificar");
        verificar_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verificar_2ActionPerformed(evt);
            }
        });

        lbl_base_3.setForeground(new java.awt.Color(255, 255, 255));
        lbl_base_3.setText("Base");

        bg_instrumento3.add(base_2_3);
        base_2_3.setSelected(true);
        base_2_3.setText("2");
        base_2_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                base_2_3MouseClicked(evt);
            }
        });
        base_2_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                base_2_3ActionPerformed(evt);
            }
        });

        bg_instrumento3.add(base_3_3);
        base_3_3.setText("3");
        base_3_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                base_3_3ActionPerformed(evt);
            }
        });

        bg_instrumento3.add(base_4_3);
        base_4_3.setText("4");
        base_4_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                base_4_3ActionPerformed(evt);
            }
        });

        bg_instrumento3.add(base_5_3);
        base_5_3.setText("5");
        base_5_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                base_5_3ActionPerformed(evt);
            }
        });

        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Ingrese el vector inicial");

        txt_transición3.setText("01010101010101010101011111");
        txt_transición3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_transición3KeyTyped(evt);
            }
        });

        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Instrumento");

        list_instrumento3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BANJO", "CLARINET", "DOUBLE-BASS", "FLUTE", "GUITAR", "MANDOLIN", "SAXOPHONE", "TROMPETA", "VIOLA", "VIOLIN" }));

        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Regla");

        txt_regla3.setText("90");
        txt_regla3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_regla3KeyTyped(evt);
            }
        });

        verificar_3.setBackground(Color.RED);
        verificar_3.setText("Verificar");
        verificar_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verificar_3ActionPerformed(evt);
            }
        });

        jButton3.setText("Aceptar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BaseLayout = new javax.swing.GroupLayout(Base);
        Base.setLayout(BaseLayout);
        BaseLayout.setHorizontalGroup(
            BaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BaseLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(BaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Instrumento1)
                    .addComponent(lbl_base_1)
                    .addComponent(verificar_1)
                    .addGroup(BaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel19)
                        .addComponent(jLabel18)
                        .addGroup(BaseLayout.createSequentialGroup()
                            .addComponent(base_2_1)
                            .addGap(18, 18, 18)
                            .addComponent(base_3_1)
                            .addGap(18, 18, 18)
                            .addComponent(base_4_1)
                            .addGap(18, 18, 18)
                            .addComponent(base_5_1))
                        .addComponent(jLabel17)
                        .addComponent(txt_transición1)
                        .addComponent(list_instrumento1, 0, 246, Short.MAX_VALUE)
                        .addComponent(txt_regla1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 194, Short.MAX_VALUE)
                .addGroup(BaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Instrumento2)
                    .addComponent(lbl_base_2)
                    .addComponent(verificar_2)
                    .addGroup(BaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel22)
                        .addComponent(jLabel21)
                        .addGroup(BaseLayout.createSequentialGroup()
                            .addComponent(base_2_2)
                            .addGap(18, 18, 18)
                            .addComponent(base_3_2)
                            .addGap(18, 18, 18)
                            .addComponent(base_4_2)
                            .addGap(18, 18, 18)
                            .addComponent(base_5_2))
                        .addComponent(jLabel20)
                        .addComponent(txt_transición2)
                        .addComponent(list_instrumento2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_regla2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(141, 141, 141)
                .addGroup(BaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Instrumento3)
                    .addComponent(lbl_base_3)
                    .addComponent(verificar_3)
                    .addGroup(BaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel25)
                        .addComponent(jLabel24)
                        .addGroup(BaseLayout.createSequentialGroup()
                            .addComponent(base_2_3)
                            .addGap(18, 18, 18)
                            .addComponent(base_3_3)
                            .addGap(18, 18, 18)
                            .addComponent(base_4_3)
                            .addGap(18, 18, 18)
                            .addComponent(base_5_3))
                        .addComponent(jLabel23)
                        .addComponent(txt_transición3)
                        .addComponent(list_instrumento3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_regla3, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BaseLayout.createSequentialGroup()
                .addContainerGap(969, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(132, 132, 132))
        );
        BaseLayout.setVerticalGroup(
            BaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BaseLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(BaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BaseLayout.createSequentialGroup()
                        .addComponent(lbl_Instrumento2)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_base_2)
                        .addGap(18, 18, 18)
                        .addGroup(BaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(base_2_2)
                            .addComponent(base_3_2)
                            .addComponent(base_4_2)
                            .addComponent(base_5_2))
                        .addGap(26, 26, 26)
                        .addComponent(jLabel20)
                        .addGap(18, 18, 18)
                        .addComponent(txt_transición2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(list_instrumento2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_regla2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(verificar_2))
                    .addGroup(BaseLayout.createSequentialGroup()
                        .addGroup(BaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Instrumento1)
                            .addComponent(lbl_Instrumento3))
                        .addGroup(BaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BaseLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(lbl_base_1)
                                .addGap(18, 18, 18)
                                .addGroup(BaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(base_2_1)
                                    .addComponent(base_3_1)
                                    .addComponent(base_4_1)
                                    .addComponent(base_5_1))
                                .addGap(26, 26, 26)
                                .addComponent(jLabel17)
                                .addGap(18, 18, 18)
                                .addComponent(txt_transición1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(list_instrumento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_regla1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(verificar_1))
                            .addGroup(BaseLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lbl_base_3)
                                .addGap(18, 18, 18)
                                .addGroup(BaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(base_2_3)
                                    .addComponent(base_3_3)
                                    .addComponent(base_4_3)
                                    .addComponent(base_5_3))
                                .addGap(26, 26, 26)
                                .addComponent(jLabel23)
                                .addGap(18, 18, 18)
                                .addComponent(txt_transición3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(list_instrumento3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_regla3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(verificar_3)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(84, 84, 84))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Base, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Base, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        configuracion.addTab("tab5", jPanel1);

        jPanel3.setBackground(new Color(41, 45, 89));

        javax.swing.GroupLayout panelDibujo1Layout = new javax.swing.GroupLayout(panelDibujo1);
        panelDibujo1.setLayout(panelDibujo1Layout);
        panelDibujo1Layout.setHorizontalGroup(
            panelDibujo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 665, Short.MAX_VALUE)
        );
        panelDibujo1Layout.setVerticalGroup(
            panelDibujo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 635, Short.MAX_VALUE)
        );

        jButton1.setText("Siguiente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Instrumento: ");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Regla:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nota:");

        sp_2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sp_2.setModel(new javax.swing.SpinnerNumberModel(100, 100, 2000, 100));
        sp_2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sp_2StateChanged(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Retraso:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDibujo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(79, 79, 79))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(sp_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(300, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel1)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel2)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel3)
                        .addGap(52, 52, 52)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(sp_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(panelDibujo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        configuracion.addTab("tab7", jPanel3);

        jPanel2.setBackground(new Color(41, 45, 89));

        javax.swing.GroupLayout panelDibujo2Layout = new javax.swing.GroupLayout(panelDibujo2);
        panelDibujo2.setLayout(panelDibujo2Layout);
        panelDibujo2Layout.setHorizontalGroup(
            panelDibujo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 665, Short.MAX_VALUE)
        );
        panelDibujo2Layout.setVerticalGroup(
            panelDibujo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 635, Short.MAX_VALUE)
        );

        jButton2.setText("Siguiente");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("Anterior");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nota:");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Regla:");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Instrumento: ");

        sp_3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sp_3.setModel(new javax.swing.SpinnerNumberModel(100, 100, 2000, 100));
        sp_3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sp_3StateChanged(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Retraso:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDibujo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 319, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sp_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton4))
                        .addGap(26, 26, 26)
                        .addComponent(jLabel6)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel5)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel4)
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(sp_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(panelDibujo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        configuracion.addTab("tab6", jPanel2);

        jPanel4.setBackground(new Color(41, 45, 89));

        javax.swing.GroupLayout panelDibujo3Layout = new javax.swing.GroupLayout(panelDibujo3);
        panelDibujo3.setLayout(panelDibujo3Layout);
        panelDibujo3Layout.setHorizontalGroup(
            panelDibujo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 665, Short.MAX_VALUE)
        );
        panelDibujo3Layout.setVerticalGroup(
            panelDibujo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 635, Short.MAX_VALUE)
        );

        jButton5.setText("Anterior");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nota:");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Regla:");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Instrumento: ");

        sp_4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sp_4.setModel(new javax.swing.SpinnerNumberModel(100, 100, 2000, 100));
        sp_4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sp_4StateChanged(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Retraso:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDibujo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 408, Short.MAX_VALUE)
                        .addComponent(jButton5)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sp_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel9)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel8)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel7)
                        .addGap(67, 67, 67)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(sp_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(panelDibujo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        configuracion.addTab("tab4", jPanel4);

        getContentPane().add(configuracion);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void sp_3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sp_3StateChanged
        panelDibujo2.time = (int) sp_3.getValue();        //   panelDibujo3.time = (int) sp_3.getValue();
    }//GEN-LAST:event_sp_3StateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cambiarEscenario(2);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (termino1 && termino2 && termino3) {

            i1.recorrerD();
            panelDibujo1.instrumento = i1;
            panelDibujo1.run = true;

            i2.recorrerD();
            panelDibujo2.instrumento = i2;
            panelDibujo2.run = true;

            i3.recorrerD();
            panelDibujo3.instrumento = i3;
            panelDibujo3.run = true;

            cambiarEscenario(1);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void verificar_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verificar_3ActionPerformed
        if (txt_transición3.getText().length() >= 8 && txt_regla3.getText().length() > 0) {
            verificar_3.setBackground(Color.green);

            base_2_3.setEnabled(false);
            base_3_3.setEnabled(false);
            base_4_3.setEnabled(false);
            base_5_3.setEnabled(false);

            txt_transición3.setEditable(false);
            list_instrumento3.setEnabled(false);
            txt_regla3.setEditable(false);

            termino3 = true;

            final int numeroEstado = escogerBase3();
            final String instrumento = (String) list_instrumento3.getSelectedItem();
            final int posibilidades = calcularPosibilidades(numeroEstado);
            final int regla = Integer.parseInt(txt_regla3.getText());
            i3 = new Automata(instrumento, numeroEstado, txt_transición3.getText(), posibilidades, regla);

         
            i3.d = llenarPosiblesEstados(numeroEstado, posibilidades);
           

        } else {

            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos correctamente");
        }
    }//GEN-LAST:event_verificar_3ActionPerformed

    private void txt_regla3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_regla3KeyTyped
        String letra = evt.getKeyChar() + "";

        int limite = 255;
        if (base_2_3.isSelected()) {
            limite = 255;
        }
        if (base_3_3.isSelected()) {
            limite = 6560;
        }
        if (base_4_3.isSelected()) {
            limite = 65535;
        }
        if (base_5_3.isSelected()) {
            limite = 390624;
        }

        try {

            int code = Integer.parseInt(txt_regla3.getText() + letra);
            if (code >= 0 && code <= limite) {

            } else {
                Toolkit.getDefaultToolkit().beep();
                evt.consume();
            }

        } catch (Exception e) {

            Toolkit.getDefaultToolkit().beep();
            evt.consume();

        }
    }//GEN-LAST:event_txt_regla3KeyTyped

    private void txt_transición3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_transición3KeyTyped
        String letra = evt.getKeyChar() + "";

        int limite = 1;
        if (base_2_3.isSelected()) {
            limite = 1;
        }
        if (base_3_3.isSelected()) {
            limite = 2;
        }
        if (base_4_3.isSelected()) {
            limite = 3;
        }
        if (base_5_3.isSelected()) {
            limite = 4;
        }

        try {
            int code = Integer.parseInt(letra);
            if (code >= 0 && code <= limite && txt_transición3.getText().length() < 30) {

            } else {
                Toolkit.getDefaultToolkit().beep();
                evt.consume();
            }

        } catch (Exception e) {

            Toolkit.getDefaultToolkit().beep();
            evt.consume();

        }
    }//GEN-LAST:event_txt_transición3KeyTyped

    private void base_5_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_base_5_3ActionPerformed
        txt_transición3.setText("");
        txt_regla3.setText("");
    }//GEN-LAST:event_base_5_3ActionPerformed

    private void base_4_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_base_4_3ActionPerformed
        txt_transición3.setText("");
        txt_regla3.setText("");
    }//GEN-LAST:event_base_4_3ActionPerformed

    private void base_3_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_base_3_3ActionPerformed
        txt_transición3.setText("");
        txt_regla3.setText("");
    }//GEN-LAST:event_base_3_3ActionPerformed

    private void base_2_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_base_2_3ActionPerformed
        txt_transición3.setText("");
        txt_regla3.setText("");
    }//GEN-LAST:event_base_2_3ActionPerformed


    private void verificar_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verificar_2ActionPerformed
        if (txt_transición2.getText().length() >= 8 && txt_regla2.getText().length() > 0) {
            verificar_2.setBackground(Color.green);

            base_2_2.setEnabled(false);
            base_3_2.setEnabled(false);
            base_4_2.setEnabled(false);
            base_5_2.setEnabled(false);

            txt_transición2.setEditable(false);
            list_instrumento2.setEnabled(false);
            txt_regla2.setEditable(false);

            termino2 = true;

            final int numeroEstado = escogerBase2();
            final String instrumento = (String) list_instrumento2.getSelectedItem();
            final int posibilidades = calcularPosibilidades(numeroEstado);
            final int regla = Integer.parseInt(txt_regla2.getText());
            i2 = new Automata(instrumento, numeroEstado, txt_transición2.getText(), posibilidades, regla);

           
            i2.d = llenarPosiblesEstados(numeroEstado, posibilidades);
        
        } else {

            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos correctamente");
        }
    }//GEN-LAST:event_verificar_2ActionPerformed

    private void txt_regla2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_regla2KeyTyped
        String letra = evt.getKeyChar() + "";

        int limite = 255;
        if (base_2_2.isSelected()) {
            limite = 255;
        }
        if (base_3_2.isSelected()) {
            limite = 6560;
        }
        if (base_4_2.isSelected()) {
            limite = 65535;
        }
        if (base_5_2.isSelected()) {
            limite = 390624;
        }

        try {

            int code = Integer.parseInt(txt_regla2.getText() + letra);
            if (code >= 0 && code <= limite) {

            } else {
                Toolkit.getDefaultToolkit().beep();
                evt.consume();
            }

        } catch (Exception e) {

            Toolkit.getDefaultToolkit().beep();
            evt.consume();

        }
    }//GEN-LAST:event_txt_regla2KeyTyped

    private void txt_transición2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_transición2KeyTyped
        String letra = evt.getKeyChar() + "";

        int limite = 1;
        if (base_2_2.isSelected()) {
            limite = 1;
        }
        if (base_3_2.isSelected()) {
            limite = 2;
        }
        if (base_4_2.isSelected()) {
            limite = 3;
        }
        if (base_5_2.isSelected()) {
            limite = 4;
        }

        try {
            int code = Integer.parseInt(letra);
            if (code >= 0 && code <= limite && txt_transición2.getText().length() < 30) {

            } else {
                Toolkit.getDefaultToolkit().beep();
                evt.consume();
            }

        } catch (Exception e) {

            Toolkit.getDefaultToolkit().beep();
            evt.consume();

        }
    }//GEN-LAST:event_txt_transición2KeyTyped

    private void base_5_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_base_5_2ActionPerformed
        txt_transición2.setText("");
        txt_regla2.setText("");      
    }//GEN-LAST:event_base_5_2ActionPerformed

    private void base_4_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_base_4_2ActionPerformed
        txt_transición2.setText("");
        txt_regla2.setText("");
    }//GEN-LAST:event_base_4_2ActionPerformed

    private void base_3_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_base_3_2ActionPerformed
        txt_transición2.setText("");
        txt_regla2.setText("");
    }//GEN-LAST:event_base_3_2ActionPerformed

    private void base_2_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_base_2_2ActionPerformed
        txt_transición2.setText("");
        txt_regla2.setText("");
    }//GEN-LAST:event_base_2_2ActionPerformed


    private void verificar_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verificar_1ActionPerformed
        if (txt_transición1.getText().length() >= 8 && txt_regla1.getText().length() > 0) {
            verificar_1.setBackground(Color.green);

            base_2_1.setEnabled(false);
            base_3_1.setEnabled(false);
            base_4_1.setEnabled(false);
            base_5_1.setEnabled(false);

            txt_transición1.setEditable(false);
            list_instrumento1.setEnabled(false);
            txt_regla1.setEditable(false);

            termino1 = true;

            final int numeroEstado = escogerBase1();
            final String instrumento = (String) list_instrumento1.getSelectedItem();
            final int posibilidades = calcularPosibilidades(numeroEstado);
            final int regla = Integer.parseInt(txt_regla1.getText());
            i1 = new Automata(instrumento, numeroEstado, txt_transición1.getText(), posibilidades, regla);

          
            i1.d = llenarPosiblesEstados(numeroEstado, posibilidades);
         

        } else {

            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos correctamente");
        }
    }//GEN-LAST:event_verificar_1ActionPerformed

    private void txt_regla1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_regla1KeyTyped

        String letra = evt.getKeyChar() + "";

        int limite = 255;
        if (base_2_1.isSelected()) {
            limite = 255;
        }
        if (base_3_1.isSelected()) {
            limite = 6560;
        }
        if (base_4_1.isSelected()) {
            limite = 65535;
        }
        if (base_5_1.isSelected()) {
            limite = 390624;
        }

        try {

            int code = Integer.parseInt(txt_regla1.getText() + letra);
            if (code >= 0 && code <= limite) {

            } else {
                Toolkit.getDefaultToolkit().beep();
                evt.consume();
            }

        } catch (Exception e) {

            Toolkit.getDefaultToolkit().beep();
            evt.consume();

        }
    }//GEN-LAST:event_txt_regla1KeyTyped

    private void txt_transición1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_transición1KeyTyped
        String letra = evt.getKeyChar() + "";

        int limite = 1;
        if (base_2_1.isSelected()) {
            limite = 1;
        }
        if (base_3_1.isSelected()) {
            limite = 2;
        }
        if (base_4_1.isSelected()) {
            limite = 3;
        }
        if (base_5_1.isSelected()) {
            limite = 4;
        }

        try {
            int code = Integer.parseInt(letra);
            if (code >= 0 && code <= limite && txt_transición1.getText().length() < 30) {

            } else {
                Toolkit.getDefaultToolkit().beep();
                evt.consume();
            }

        } catch (Exception e) {

            Toolkit.getDefaultToolkit().beep();
            evt.consume();

        }
    }//GEN-LAST:event_txt_transición1KeyTyped


    private void base_5_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_base_5_1ActionPerformed
        txt_transición1.setText("");
        txt_regla1.setText("");   
    }//GEN-LAST:event_base_5_1ActionPerformed

    private void base_3_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_base_3_1ActionPerformed
        txt_transición1.setText("");
        txt_regla1.setText("");     
    }//GEN-LAST:event_base_3_1ActionPerformed


    private void base_4_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_base_4_1ActionPerformed

        txt_transición1.setText("");
        txt_regla1.setText("");       
    }//GEN-LAST:event_base_4_1ActionPerformed

    private void base_2_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_base_2_1ActionPerformed
        txt_transición1.setText("");
        txt_regla1.setText("");        
    }//GEN-LAST:event_base_2_1ActionPerformed

    private void base_2_1MouseClicked(java.awt.event.MouseEvent evt) {
        txt_transición1.setText("");
        txt_regla1.setText("");
    }

    private void base_2_2MouseClicked(java.awt.event.MouseEvent evt) {

    }
    private void  base_2_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_base_2_1MouseClicked

    }//GEN-LAST:event_base_2_1MouseClicked

    private void base_4_1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_base_4_1MouseReleased
       
    }//GEN-LAST:event_base_4_1MouseReleased

    private void txt_transición2ActionPerformed(java.awt.event.ActionEvent evt) {
        
    }
     private void txt_transición1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_transición2ActionPerformed
         
    }//GEN-LAST:event_txt_transición2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        cambiarEscenario(1);        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        cambiarEscenario(3);        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        cambiarEscenario(2);        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void sp_2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sp_2StateChanged
        panelDibujo1.time = (int) sp_2.getValue();       
    }//GEN-LAST:event_sp_2StateChanged

    private void sp_4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sp_4StateChanged
        panelDibujo3.time = (int) sp_4.getValue();       
    }//GEN-LAST:event_sp_4StateChanged

    private void base_3_1MouseReleased(java.awt.event.MouseEvent evt) {
        
    }

    private void ocultarPestañas() {
        configuracion.setUI(new BasicTabbedPaneUI() {
            @Override
            public void paint(Graphics grphcs, JComponent jc) {

            }

            @Override
            protected int calculateTabHeight(int i, int i2, int i3) {

                return 0;
            }

            @Override
            protected int calculateTabWidth(int i, int i2, FontMetrics fm) {

                return 0;
            }
        });

    }

    private int escogerBase1() {
        if (base_2_1.isSelected()) {
            return 2;
        } else if (base_3_1.isSelected()) {
            return 3;
        } else if (base_4_1.isSelected()) {
            return 4;
        } else if (base_5_1.isSelected()) {
            return 5;
        }
        return -1;
    }

    private int escogerBase2() {
        if (base_2_2.isSelected()) {
            return 2;
        } else if (base_3_2.isSelected()) {
            return 3;
        } else if (base_4_2.isSelected()) {
            return 4;
        } else if (base_5_2.isSelected()) {
            return 5;
        }
        return -1;
    }

    private int escogerBase3() {
        if (base_2_3.isSelected()) {
            return 2;
        } else if (base_3_3.isSelected()) {
            return 3;
        } else if (base_4_3.isSelected()) {
            return 4;
        } else if (base_5_3.isSelected()) {
            return 5;
        }
        return -1;
    }

    private String[] llenarPosiblesEstados(int numeroEstado, int posibilidades) {
        String[] regla = new String[posibilidades];
        String formatoDeseado = "000";
        DecimalFormat formateador = new DecimalFormat(formatoDeseado);
        for (int i = 0; i < posibilidades; i++) {
            regla[i] = formateador.format(convertirBase(numeroEstado, i));
           
        }

        return regla;
    }

    private int convertirBase(int base, int numero) {
        String digitos[] = new String[base];

        for (int i = 0; i < base; i++) {
            digitos[i] = String.valueOf(i);
        }

        String baseNueva = "";
        int resto, aux = numero;

        while (aux > 0) {
            resto = aux % base;
            baseNueva = digitos[resto] + baseNueva;
            aux /= base;
        }

        return numero == 0 ? 0 : Integer.parseInt(baseNueva);
    }

    private int calcularPosibilidades(int numeroEstados) {
        final int VECINOS = 3;
        return (int) Math.pow(numeroEstados, VECINOS);
    }
    // <editor-fold defaultstate="collapsed" desc="Configuración del Frame">         

    private void cambiarEscenario(int i) {
        configuracion.setSelectedIndex(i);
    }

    private void configurarFrame() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

    }

// </editor-fold>  
    // <editor-fold defaultstate="collapsed" desc="Main">     
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    //</editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Variables GUI">  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Base;
    private javax.swing.JRadioButton base_2_1;
    private javax.swing.JRadioButton base_2_2;
    private javax.swing.JRadioButton base_2_3;
    private javax.swing.JRadioButton base_3_1;
    private javax.swing.JRadioButton base_3_2;
    private javax.swing.JRadioButton base_3_3;
    private javax.swing.JRadioButton base_4_1;
    private javax.swing.JRadioButton base_4_2;
    private javax.swing.JRadioButton base_4_3;
    private javax.swing.JRadioButton base_5_1;
    private javax.swing.JRadioButton base_5_2;
    private javax.swing.JRadioButton base_5_3;
    private javax.swing.ButtonGroup bg_instrumento1;
    private javax.swing.ButtonGroup bg_instrumento2;
    private javax.swing.ButtonGroup bg_instrumento3;
    private javax.swing.JTabbedPane configuracion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbl_Instrumento1;
    private javax.swing.JLabel lbl_Instrumento2;
    private javax.swing.JLabel lbl_Instrumento3;
    private javax.swing.JLabel lbl_base_1;
    private javax.swing.JLabel lbl_base_2;
    private javax.swing.JLabel lbl_base_3;
    private javax.swing.JComboBox<String> list_instrumento1;
    private javax.swing.JComboBox<String> list_instrumento2;
    private javax.swing.JComboBox<String> list_instrumento3;
    private GUI.PanelDibujo panelDibujo1;
    private GUI.PanelDibujo panelDibujo2;
    private GUI.PanelDibujo panelDibujo3;
    private javax.swing.JSpinner sp_2;
    private javax.swing.JSpinner sp_3;
    private javax.swing.JSpinner sp_4;
    private javax.swing.JTextField txt_regla1;
    private javax.swing.JTextField txt_regla2;
    private javax.swing.JTextField txt_regla3;
    private javax.swing.JTextField txt_transición1;
    private javax.swing.JTextField txt_transición2;
    private javax.swing.JTextField txt_transición3;
    private javax.swing.JButton verificar_1;
    private javax.swing.JButton verificar_2;
    private javax.swing.JButton verificar_3;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {

        while (true) {
            try {
                Thread.sleep(50);

                jLabel1.setText("instrumento: " + i1.instrumento);
                jLabel6.setText("instrumento: " + i2.instrumento);
                jLabel9.setText("instrumento: " + i3.instrumento);

                jLabel2.setText("regla: " + i1.regla);
                jLabel5.setText("regla: " + i2.regla);
                jLabel8.setText("regla: " + i3.regla);

                jLabel3.setText("nota: " + i1.notaActual);
                jLabel4.setText("nota: " + i2.notaActual);
                jLabel7.setText("nota: " + i3.notaActual);

            } catch (Exception e) {
            }

        }
    }

//</editor-fold>
}
