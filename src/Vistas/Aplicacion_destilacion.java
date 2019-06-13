package Vistas;

import Modelo.AlcoholEtilico;
import Modelo.LiquidoAlcoholico;
import Modelo.MaquinaDestiladora;
import Modelo.Picnometro;
import Controlador.BaseDeDatosLogin;
import Controlador.Usuario;
import com.sun.awt.AWTUtilities;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
//import rojeru_san.RSPanelsSlider;
import rojerusan.RSPanelsSlider;

public class Aplicacion_destilacion extends javax.swing.JFrame {

    Usuario user = new Usuario();
    private LiquidoAlcoholico l;
    private AlcoholEtilico al;
    private MaquinaDestiladora alambique;
    private Picnometro prueba = new Picnometro();
    private Picnometro P_usar;
    private String[] options = {"Nuevo Calculo", "Proceder Destilacion"};
    private double masa_liq = 0;
    private double masa_agua = 0;

    public Aplicacion_destilacion(Usuario u) {
        //Para quitar los botones de cerrar minimizar y maximizar
        this.setUndecorated(true);
        initComponents();
        //Para centrar la ventana
        this.setLocationRelativeTo(this);
        //Para hacer transparente la ventana
        this.setTitle("Ingreso a la cuenta");
        this.user = u;
        btnGrado.setEnabled(false);
        al = new AlcoholEtilico(l);
        this.setLocationRelativeTo(null);
        this.setTitle("Aplicacion de Cálculo" + " - " + u.getNombre());
        this.lblBienvenido.setText(u.getNombre());
        AWTUtilities.setWindowOpaque(this, false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSPanelShadow2 = new rojeru_san.RSPanelShadow();
        jPanel2 = new javax.swing.JPanel();
        lblBienvenido = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        rSPanelShadow1 = new rojeru_san.RSPanelShadow();
        jPanel1 = new javax.swing.JPanel();
        btnDensidad = new rojeru_san.RSButtonRiple();
        btnGrado = new rojeru_san.RSButtonRiple();
        pnlSlider = new rojerusan.RSPanelsSlider();
        pnlDensidad = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        spinTemperatura = new javax.swing.JSpinner();
        btnObtenerAgua = new rojeru_san.RSButtonRiple();
        jLabel3 = new javax.swing.JLabel();
        txtDensidadAgua = new rojeru_san.RSMTextFull();
        jLabel8 = new javax.swing.JLabel();
        txtMasaAgua = new rojeru_san.RSMTextFull();
        jLabel9 = new javax.swing.JLabel();
        txtMasaLiquido = new rojeru_san.RSMTextFull();
        btnObtenerDensidad = new rojeru_san.RSButtonRiple();
        pnlGrado = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMostrarLiquido = new javax.swing.JTextArea();
        btnMostrarRegistro = new rojeru_san.RSButtonRiple();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMostrarAlcohol = new javax.swing.JTextArea();
        btnNuevoLiquido = new rojeru_san.RSButtonRiple();
        btnCerrarSesion = new rojeru_san.RSButtonRiple();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 112, 192));

        lblBienvenido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblBienvenido.setForeground(new java.awt.Color(255, 255, 255));
        lblBienvenido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("¡Bienvenido!");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addComponent(lblBienvenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(lblBienvenido)
                .addGap(89, 89, 89)
                .addComponent(lblTitulo)
                .addContainerGap(244, Short.MAX_VALUE))
        );

        rSPanelShadow2.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(rSPanelShadow2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 260, 540));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDensidad.setBackground(new java.awt.Color(255, 255, 255));
        btnDensidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono_operacion.png"))); // NOI18N
        btnDensidad.setText("Calcular Densidad");
        btnDensidad.setColorHover(new java.awt.Color(255, 255, 255));
        btnDensidad.setColorText(new java.awt.Color(0, 112, 192));
        btnDensidad.setColorTextHover(new java.awt.Color(0, 112, 192));
        btnDensidad.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDensidad.setSelected(true);
        btnDensidad.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnDensidad.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDensidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDensidadActionPerformed(evt);
            }
        });
        jPanel1.add(btnDensidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 160));

        btnGrado.setBackground(new java.awt.Color(255, 255, 255));
        btnGrado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono_grado.png"))); // NOI18N
        btnGrado.setText("Ejecutar Destilacion");
        btnGrado.setColorHover(new java.awt.Color(255, 255, 255));
        btnGrado.setColorText(new java.awt.Color(0, 112, 192));
        btnGrado.setColorTextHover(new java.awt.Color(0, 112, 192));
        btnGrado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGrado.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnGrado.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGradoActionPerformed(evt);
            }
        });
        jPanel1.add(btnGrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 160, 160));

        pnlDensidad.setBackground(new java.awt.Color(204, 204, 204));
        pnlDensidad.setName("pnlDensidad"); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel6.setText("Calculo de la Densidad del Liquido");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 112, 192));
        jLabel7.setText("Temperatura ºC:");

        spinTemperatura.setModel(new javax.swing.SpinnerNumberModel(0, 0, 32, 1));

        btnObtenerAgua.setText("Obtener");
        btnObtenerAgua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObtenerAguaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 112, 192));
        jLabel3.setText("Densidad del Agua:");

        txtDensidadAgua.setEditable(false);
        txtDensidadAgua.setPlaceholder("");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 112, 192));
        jLabel8.setText("Masa del Agua");

        txtMasaAgua.setPlaceholder("0.9...");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 112, 192));
        jLabel9.setText("Masa del Liquido");

        txtMasaLiquido.setPlaceholder("0.9...");

        btnObtenerDensidad.setText("Obtener Densidad");
        btnObtenerDensidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObtenerDensidadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDensidadLayout = new javax.swing.GroupLayout(pnlDensidad);
        pnlDensidad.setLayout(pnlDensidadLayout);
        pnlDensidadLayout.setHorizontalGroup(
            pnlDensidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDensidadLayout.createSequentialGroup()
                .addGroup(pnlDensidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDensidadLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel6))
                    .addGroup(pnlDensidadLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(pnlDensidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlDensidadLayout.createSequentialGroup()
                                .addGroup(pnlDensidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(38, 38, 38)
                                .addGroup(pnlDensidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMasaAgua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtMasaLiquido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(pnlDensidadLayout.createSequentialGroup()
                                .addGroup(pnlDensidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(pnlDensidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlDensidadLayout.createSequentialGroup()
                                        .addComponent(spinTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnObtenerAgua, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                    .addComponent(txtDensidadAgua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(30, 30, 30))
            .addGroup(pnlDensidadLayout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(btnObtenerDensidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlDensidadLayout.setVerticalGroup(
            pnlDensidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDensidadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGroup(pnlDensidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDensidadLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel7)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDensidadLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlDensidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spinTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnObtenerAgua, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(pnlDensidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDensidadAgua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(pnlDensidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtMasaAgua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(pnlDensidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtMasaLiquido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(btnObtenerDensidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pnlSlider.add(pnlDensidad, "card2");

        pnlGrado.setBackground(new java.awt.Color(204, 204, 204));
        pnlGrado.setName("pnlGrado"); // NOI18N
        pnlGrado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel10.setText("Registro de Grado Alcoholico");
        pnlGrado.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 11, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 112, 192));
        jLabel11.setText("Datos del Liquido");
        pnlGrado.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        txtMostrarLiquido.setEditable(false);
        txtMostrarLiquido.setBackground(new java.awt.Color(0, 112, 192));
        txtMostrarLiquido.setColumns(20);
        txtMostrarLiquido.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtMostrarLiquido.setForeground(new java.awt.Color(255, 255, 255));
        txtMostrarLiquido.setRows(5);
        txtMostrarLiquido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtMostrarLiquido.setCaretColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(txtMostrarLiquido);

        pnlGrado.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 380, -1));

        btnMostrarRegistro.setText("Iniciar Destilación");
        btnMostrarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarRegistroActionPerformed(evt);
            }
        });
        pnlGrado.add(btnMostrarRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 150, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 112, 192));
        jLabel12.setText("Datos de la muesta de alcohol etílico");
        pnlGrado.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        txtMostrarAlcohol.setBackground(new java.awt.Color(0, 112, 192));
        txtMostrarAlcohol.setColumns(20);
        txtMostrarAlcohol.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtMostrarAlcohol.setRows(5);
        txtMostrarAlcohol.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtMostrarAlcohol.setCaretColor(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(txtMostrarAlcohol);

        pnlGrado.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 374, 110));

        btnNuevoLiquido.setText("Nuevo Líquido");
        btnNuevoLiquido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoLiquidoActionPerformed(evt);
            }
        });
        pnlGrado.add(btnNuevoLiquido, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 152, -1));

        pnlSlider.add(pnlGrado, "card3");

        jPanel1.add(pnlSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 27, 460, 410));

        btnCerrarSesion.setBackground(new java.awt.Color(255, 255, 255));
        btnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono-cerrar-sesion-png-6.png"))); // NOI18N
        btnCerrarSesion.setText("Cerrar Sesión");
        btnCerrarSesion.setColorText(new java.awt.Color(0, 112, 192));
        btnCerrarSesion.setColorTextHover(new java.awt.Color(0, 112, 192));
        btnCerrarSesion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCerrarSesion.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnCerrarSesion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 160, 90));

        rSPanelShadow1.add(jPanel1, java.awt.BorderLayout.CENTER);

        getContentPane().add(rSPanelShadow1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 900, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDensidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDensidadActionPerformed
        if (!this.btnDensidad.isSelected()) {
            this.btnDensidad.setSelected(true);
            this.btnGrado.setSelected(false);
            this.pnlSlider.slidPanel(5, pnlDensidad, RSPanelsSlider.direct.Right);
        }
    }//GEN-LAST:event_btnDensidadActionPerformed

    private void btnGradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGradoActionPerformed
        if (!this.btnGrado.isSelected()) {
            this.btnDensidad.setSelected(false);
            this.btnGrado.setSelected(true);
            this.pnlSlider.slidPanel(5, pnlGrado, RSPanelsSlider.direct.Right);
        }
    }//GEN-LAST:event_btnGradoActionPerformed

    private void btnObtenerAguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObtenerAguaActionPerformed
        try {
            spinTemperatura.commitEdit();
        } catch (ParseException ex) {
            Logger.getLogger(Aplicacion_destilacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        int temperatura = Integer.parseInt(spinTemperatura.getValue().toString());
        prueba.GenerarDensidadAgua(temperatura);
        txtDensidadAgua.setText(String.valueOf(prueba.getDensidad_agua()));
    }//GEN-LAST:event_btnObtenerAguaActionPerformed

    private void btnObtenerDensidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObtenerDensidadActionPerformed
        int temperatura = Integer.parseInt(spinTemperatura.getValue().toString());
        int vacio = VerificarDatosLlenos();
        MostrarMensajesLiquido(vacio, masa_liq, masa_agua, temperatura);
        txtMostrarLiquido.setText(l.toString());
    }//GEN-LAST:event_btnObtenerDensidadActionPerformed

    private void btnMostrarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarRegistroActionPerformed
        alambique = new MaquinaDestiladora(l, al);
        Cargando c = new Cargando("Obteniendo Grado Alcoholico. . .");
        c.setVisible(true);
        new Thread(new Runnable() {

            public void run() {
                try {
                    Thread.sleep(2000);
                    c.dispose();
                    JOptionPane.showMessageDialog(null, "El proceso de destilacion ha finalizado");
                    txtMostrarAlcohol.setText(al.toString());
                    btnMostrarRegistro.setEnabled(false);

                } catch (InterruptedException ex) {
                    Logger.getLogger(Aplicacion_destilacion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }).start();

    }//GEN-LAST:event_btnMostrarRegistroActionPerformed

    private void btnNuevoLiquidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoLiquidoActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro de trabajar con otro liquido?", "Nuevo Calculo", JOptionPane.YES_NO_OPTION);
        if (resp == 0) {
            this.btnDensidad.setSelected(true);
            this.btnMostrarRegistro.setEnabled(true);
            this.btnDensidad.setEnabled(true);
            this.btnGrado.setSelected(false);
            this.btnGrado.setEnabled(false);
            this.txtMostrarAlcohol.setText(null);
            this.txtMostrarLiquido.setText(null);
            this.pnlSlider.slidPanel(5, pnlDensidad, RSPanelsSlider.direct.Right);
        }
    }//GEN-LAST:event_btnNuevoLiquidoActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro de salir?", "Cerrar Sesion", JOptionPane.YES_NO_OPTION);
        if (resp == 0) {
            this.setVisible(false);
            this.setVisible(false);
            Principal_Login l = new Principal_Login();
            l.setVisible(true);
        }
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private int VerificarDatosLlenos() {
        int vacio = 1;
        if (!txtMasaLiquido.getText().isEmpty()) {
            if (Double.parseDouble(txtMasaLiquido.getText()) < 1.0) {
                this.masa_liq = Double.parseDouble(txtMasaLiquido.getText());
            } else {
                vacio = 0;
            }
        } else {
            vacio = -1;
        }

        if (!txtMasaAgua.getText().isEmpty()) {
            if (Double.parseDouble(txtMasaAgua.getText()) < 1.0) {
                this.masa_agua = Double.parseDouble(txtMasaAgua.getText());
            } else {
                vacio = 0;
            }
        } else {
            vacio = -1;
        }

        if (!txtDensidadAgua.getText().isEmpty()) {
        } else {
            vacio = -1;
        }
        return vacio;
    }

    private void MostrarMensajesLiquido(int vacio, double masa_liq, double masa_agua, int temperatura) {
        switch (vacio) {
            case -1:
                JOptionPane.showMessageDialog(null, "Primero llene todos los datos");
                break;
            case 0:
                JOptionPane.showMessageDialog(null, "El valor de las masas deben ser menores a 1 \nya que se trabaja con muestras de 100 ml");
                break;
            case 1:
                l = new LiquidoAlcoholico(masa_liq, temperatura);
                P_usar = new Picnometro(l, masa_agua);
                l.setDensidad(P_usar.ObtenerResultado());
                Cargando c = new Cargando("        Calculando Densidad. . .");
                c.setVisible(true);
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            Thread.sleep(2000);
                            c.dispose();
                            JOptionPane.showMessageDialog(null, "La densidad del liquido alcoholico es de " + l.getDensidad() + " gr/L");
                            int x = JOptionPane.showOptionDialog(null, "¿Que desea hacer?",
                                    "Mensaje del Sistema",
                                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
                            if (x == 0) {
                                limpiar();
                            }
                            if (x == 1) {
                                btnGrado.setEnabled(true);
                                btnDensidad.setEnabled(false);
                                btnDensidad.setSelected(false);
                                btnGrado.setSelected(true);
                                pnlSlider.slidPanel(5, pnlGrado, RSPanelsSlider.direct.Right);
                                limpiar();

                            }
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Aplicacion_destilacion.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }).start();
                break;
        }
    }

    private void limpiar() {
        txtDensidadAgua.setText(null);
        txtMasaAgua.setText(null);
        txtMasaLiquido.setText(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButtonRiple btnCerrarSesion;
    private rojeru_san.RSButtonRiple btnDensidad;
    private rojeru_san.RSButtonRiple btnGrado;
    private rojeru_san.RSButtonRiple btnMostrarRegistro;
    private rojeru_san.RSButtonRiple btnNuevoLiquido;
    private rojeru_san.RSButtonRiple btnObtenerAgua;
    private rojeru_san.RSButtonRiple btnObtenerDensidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlDensidad;
    private javax.swing.JPanel pnlGrado;
    private rojerusan.RSPanelsSlider pnlSlider;
    private rojeru_san.RSPanelShadow rSPanelShadow1;
    private rojeru_san.RSPanelShadow rSPanelShadow2;
    private javax.swing.JSpinner spinTemperatura;
    private rojeru_san.RSMTextFull txtDensidadAgua;
    private rojeru_san.RSMTextFull txtMasaAgua;
    private rojeru_san.RSMTextFull txtMasaLiquido;
    private javax.swing.JTextArea txtMostrarAlcohol;
    private javax.swing.JTextArea txtMostrarLiquido;
    // End of variables declaration//GEN-END:variables
}
