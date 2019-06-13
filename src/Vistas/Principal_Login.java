package Vistas;

import Conexiones.Procedimientos;
import Controlador.BaseDeDatosLogin;
import Controlador.Usuario;
import com.sun.awt.AWTUtilities;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import rojerusan.RSPanelsSlider;

public class Principal_Login extends javax.swing.JFrame {

    ResultSet res;
    int cont;
    BaseDeDatosLogin bd = new BaseDeDatosLogin();
    Usuario u = new Usuario();

    public Principal_Login() {
        //Para quitar los botones de cerrar minimizar y maximizar
        this.setUndecorated(true);
        initComponents();
        //Para centrar la ventana
        this.setLocationRelativeTo(this);
        //Para hacer transparente la ventana
        this.setTitle("Ingreso a la cuenta");
        AWTUtilities.setWindowOpaque(this, false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSPanelShadow2 = new rojeru_san.RSPanelShadow();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rSPanelShadow1 = new rojeru_san.RSPanelShadow();
        jPanel1 = new javax.swing.JPanel();
        btnSesion = new rojeru_san.RSButtonRiple();
        btnRegistrarme = new rojeru_san.RSButtonRiple();
        pnlSlider = new rojerusan.RSPanelsSlider();
        pnlSesion = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtUsuario = new rojeru_san.RSMTextFull();
        txtContrasena = new rojeru_san.RSMPassView();
        btnIngresar = new rojeru_san.RSButtonRiple();
        lblIngreso = new javax.swing.JLabel();
        pnlRegistrar = new javax.swing.JPanel();
        btnRegistrar = new rojeru_san.RSButtonRiple();
        txtCorreo = new rojeru_san.RSMTextFull();
        txtPass = new rojeru_san.RSMPassView();
        txtConfirmPass = new rojeru_san.RSMPassView();
        txtNombre = new rojeru_san.RSMTextFull();
        txtUser = new rojeru_san.RSMTextFull();
        jLabel2 = new javax.swing.JLabel();
        lblAlerta = new javax.swing.JLabel();
        btnCerrar = new rojeru_san.RSButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 112, 192));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo destiladora.jpg"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Aplicacion de Destilación");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel5)
                .addContainerGap(142, Short.MAX_VALUE))
        );

        rSPanelShadow2.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(rSPanelShadow2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, 530));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSesion.setBackground(new java.awt.Color(255, 255, 255));
        btnSesion.setText("Iniciar Sesión");
        btnSesion.setColorHover(new java.awt.Color(240, 240, 240));
        btnSesion.setColorText(new java.awt.Color(0, 112, 192));
        btnSesion.setColorTextHover(new java.awt.Color(0, 112, 192));
        btnSesion.setSelected(true);
        btnSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSesionActionPerformed(evt);
            }
        });
        jPanel1.add(btnSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 161, 134, -1));

        btnRegistrarme.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrarme.setText("Registrarme");
        btnRegistrarme.setColorHover(new java.awt.Color(240, 240, 240));
        btnRegistrarme.setColorText(new java.awt.Color(0, 112, 192));
        btnRegistrarme.setColorTextHover(new java.awt.Color(0, 112, 192));
        btnRegistrarme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarmeActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarme, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 134, -1));

        pnlSesion.setBackground(new java.awt.Color(255, 255, 255));
        pnlSesion.setName("pnlSesion"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 112, 192));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Iniciar Sesión");

        txtUsuario.setModoMaterial(true);
        txtUsuario.setPlaceholder("Nombre de usuario");

        txtContrasena.setModoMaterial(true);
        txtContrasena.setPlaceholder("Contraseña");

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        lblIngreso.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        lblIngreso.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout pnlSesionLayout = new javax.swing.GroupLayout(pnlSesion);
        pnlSesion.setLayout(pnlSesionLayout);
        pnlSesionLayout.setHorizontalGroup(
            pnlSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSesionLayout.createSequentialGroup()
                .addGroup(pnlSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSesionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtContrasena, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pnlSesionLayout.createSequentialGroup()
                        .addGroup(pnlSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlSesionLayout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlSesionLayout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(lblIngreso)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlSesionLayout.setVerticalGroup(
            pnlSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSesionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(lblIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlSlider.add(pnlSesion, "card2");

        pnlRegistrar.setBackground(new java.awt.Color(255, 255, 255));
        pnlRegistrar.setName("pnlRegistrar"); // NOI18N

        btnRegistrar.setText("Registrarme");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        txtCorreo.setModoMaterial(true);
        txtCorreo.setPlaceholder("E-mail");

        txtPass.setModoMaterial(true);
        txtPass.setPlaceholder("Contraseña");

        txtConfirmPass.setModoMaterial(true);
        txtConfirmPass.setPlaceholder("Confirmar Contraseña");
        txtConfirmPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfirmPassActionPerformed(evt);
            }
        });

        txtNombre.setModoMaterial(true);
        txtNombre.setPlaceholder("Nombres y Apellidos");

        txtUser.setModoMaterial(true);
        txtUser.setPlaceholder("Nombre de Usuario");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 112, 192));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Registrarse");

        lblAlerta.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        lblAlerta.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout pnlRegistrarLayout = new javax.swing.GroupLayout(pnlRegistrar);
        pnlRegistrar.setLayout(pnlRegistrarLayout);
        pnlRegistrarLayout.setHorizontalGroup(
            pnlRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistrarLayout.createSequentialGroup()
                .addGroup(pnlRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRegistrarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtConfirmPass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pnlRegistrarLayout.createSequentialGroup()
                        .addGroup(pnlRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlRegistrarLayout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlRegistrarLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(pnlRegistrarLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(lblAlerta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlRegistrarLayout.setVerticalGroup(
            pnlRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRegistrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtConfirmPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(lblAlerta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlSlider.add(pnlRegistrar, "card3");

        jPanel1.add(pnlSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 57, 350, 360));

        btnCerrar.setText("x");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 20, 40, -1));

        rSPanelShadow1.add(jPanel1, java.awt.BorderLayout.CENTER);

        getContentPane().add(rSPanelShadow1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 900, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSesionActionPerformed
        if (!this.btnSesion.isSelected()) {
            this.btnSesion.setSelected(true);
            this.btnRegistrarme.setSelected(false);
            this.pnlSlider.slidPanel(5, pnlSesion, RSPanelsSlider.direct.Right);
        }
    }//GEN-LAST:event_btnSesionActionPerformed

    private void btnRegistrarmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarmeActionPerformed
        if (!this.btnRegistrarme.isSelected()) {
            this.btnSesion.setSelected(false);
            this.btnRegistrarme.setSelected(true);
            this.pnlSlider.slidPanel(5, pnlRegistrar, RSPanelsSlider.direct.Right);
        }
    }//GEN-LAST:event_btnRegistrarmeActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed

        boolean encontro = false;
        if (txtUsuario.getText().isEmpty() || txtContrasena.getText().isEmpty()) {
            lblIngreso.setText("¡Ingresa Usuario y Contraseña!");
        } else {

            try {
                Procedimientos.BuscarUsuario(txtUsuario.getText(), txtContrasena.getText());
                res = Conexiones.Conexion.Consulta("Select usuario, password from usuario");
                while (res.next()) {
                    if (res.getString(1).compareToIgnoreCase(txtUsuario.getText()) == 0 && res.getString(2).equals(txtContrasena.getText())) {
                        encontro = true;
                    }
                }
            } catch (SQLException e) {

            }
            if (encontro) {
                Cargando c = new Cargando("              Iniciando Sesión. . .");
                c.setVisible(true);
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            Thread.sleep(5000);
                            dispose();
                            c.setVisible(false);
                            Aplicacion_destilacion s = new Aplicacion_destilacion(u);
                            s.setVisible(true);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Principal_Login.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                ).start();
            } else {
                lblIngreso.setText("¡El usuario o la contraseña no existen!");
            }
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        if (txtNombre.getText().isEmpty()
                || txtCorreo.getText().isEmpty()
                || txtUser.getText().isEmpty()
                || txtPass.getText().isEmpty()
                || txtConfirmPass.getText().isEmpty()) {
            lblAlerta.setText("¡Complete todos los campos!");
        } else if (txtPass.getText().compareTo(txtConfirmPass.getText()) == 0) {
            lblAlerta.setText("¡Contraseñas coinciden!");
            lblIngreso.setText("");
            try {
                res = Conexiones.Conexion.Consulta("Select COUNT(usuario) from usuario where usuario='" + txtUser.getText() + "'");
                try {
                    while (res.next()) {
                        cont = res.getInt(1);
                    }
                } catch (SQLException e) {
                }
                if (cont >= 1) {
                    JOptionPane.showMessageDialog(this, "este usuario ya existe", "Informacion", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    Procedimientos.EntradaUsuario(txtNombre.getText(), txtCorreo.getText(), txtUser.getText(), txtPass.getText());
                    JOptionPane.showMessageDialog(this, "El usuario se agrego correctamente");
                    this.pnlSlider.slidPanel(5, pnlSesion, RSPanelsSlider.direct.Right);
                }

            } catch (SQLException e) {
            }

        } else {
            lblAlerta.setText("Contraseñas no coinciden");
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtConfirmPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfirmPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfirmPassActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButton btnCerrar;
    private rojeru_san.RSButtonRiple btnIngresar;
    private rojeru_san.RSButtonRiple btnRegistrar;
    private rojeru_san.RSButtonRiple btnRegistrarme;
    private rojeru_san.RSButtonRiple btnSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAlerta;
    private javax.swing.JLabel lblIngreso;
    private javax.swing.JPanel pnlRegistrar;
    private javax.swing.JPanel pnlSesion;
    private rojerusan.RSPanelsSlider pnlSlider;
    private rojeru_san.RSPanelShadow rSPanelShadow1;
    private rojeru_san.RSPanelShadow rSPanelShadow2;
    private rojeru_san.RSMPassView txtConfirmPass;
    private rojeru_san.RSMPassView txtContrasena;
    private rojeru_san.RSMTextFull txtCorreo;
    private rojeru_san.RSMTextFull txtNombre;
    private rojeru_san.RSMPassView txtPass;
    private rojeru_san.RSMTextFull txtUser;
    private rojeru_san.RSMTextFull txtUsuario;
    // End of variables declaration//GEN-END:variables
}
