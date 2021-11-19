package Vista;

import Clases.Cliente;
import Clases.Vendedor;
import javax.swing.JOptionPane;

public class MenuPrincipal extends javax.swing.JFrame {

    Login login = new Login(this, true);
    Registrar registrar = new Registrar(this, true);
    PanelVendedor panelVend = new PanelVendedor();
    PanelCliente panelCli = new PanelCliente();
    public String tipoUsuario, nombreUsuario;

    public MenuPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("STOCKSTORES");
    }

    public void mostrarPanelVendedor() {
        MPESCRITORIO.add(panelVend);
        panelVend.setVisible(true);
        panelVend.toFront();
        panelVend.setLocation(MPESCRITORIO.getWidth() / 2 - panelVend.getWidth() / 2, MPESCRITORIO.getHeight() / 2 - panelVend.getHeight() / 2);
    }

    public void mostrarPanelCliente() {
        MPESCRITORIO.add(panelCli);
        panelCli.setVisible(true);
        panelCli.toFront();
        panelCli.setLocation(MPESCRITORIO.getWidth() / 2 - panelCli.getWidth() / 2, MPESCRITORIO.getHeight() / 2 - panelCli.getHeight() / 2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MPESCRITORIO = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        MENUBAR = new javax.swing.JMenuBar();
        jSesion = new javax.swing.JMenu();
        jmRegistrar = new javax.swing.JMenuItem();
        jmLogin = new javax.swing.JMenuItem();
        jmCerrarSesion = new javax.swing.JMenuItem();
        jSalir = new javax.swing.JMenu();
        jmSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        MPESCRITORIO.setBackground(new java.awt.Color(255, 153, 153));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblNombre.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        lblNombre.setText(" ");

        lblUser.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        lblUser.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser.setText(" ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(lblUser))
                .addContainerGap(733, Short.MAX_VALUE))
        );

        MPESCRITORIO.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout MPESCRITORIOLayout = new javax.swing.GroupLayout(MPESCRITORIO);
        MPESCRITORIO.setLayout(MPESCRITORIOLayout);
        MPESCRITORIOLayout.setHorizontalGroup(
            MPESCRITORIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        MPESCRITORIOLayout.setVerticalGroup(
            MPESCRITORIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jSesion.setText("Sesion");

        jmRegistrar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jmRegistrar.setText("Registrar");
        jmRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmRegistrarActionPerformed(evt);
            }
        });
        jSesion.add(jmRegistrar);

        jmLogin.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jmLogin.setText("Login");
        jmLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmLoginActionPerformed(evt);
            }
        });
        jSesion.add(jmLogin);

        jmCerrarSesion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_MASK));
        jmCerrarSesion.setText("Cerrar Sesion");
        jmCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCerrarSesionActionPerformed(evt);
            }
        });
        jSesion.add(jmCerrarSesion);

        MENUBAR.add(jSesion);

        jSalir.setText("Salir");

        jmSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.SHIFT_MASK));
        jmSalir.setText("Salir de la Aplicacion");
        jmSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmSalirActionPerformed(evt);
            }
        });
        jSalir.add(jmSalir);

        MENUBAR.add(jSalir);

        setJMenuBar(MENUBAR);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MPESCRITORIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MPESCRITORIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmRegistrarActionPerformed
        if ((Cliente.getCedula().isEmpty() && Cliente.getNombre().isEmpty() && Cliente.getContrasena().isEmpty()) || (Vendedor.getCedula().isEmpty() && Vendedor.getNombre().isEmpty() && Vendedor.getContrasena().isEmpty())) {
            if (!Cliente.isActivo() && !Vendedor.isActivo()) {
                registrar.setModal(true);
                registrar.setVisible(true);
                registrar.toFront();
            } else {
                JOptionPane.showMessageDialog(null, "Debes Cerrar Sesion para poder Registrar otro Usuario", "Validación de Entrada", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ambos Usuarios ya estan Registrados", "Validación de Entrada", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jmRegistrarActionPerformed

    private void jmLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmLoginActionPerformed
        if ((Cliente.getCedula().isEmpty() && Cliente.getNombre().isEmpty() && Cliente.getContrasena().isEmpty()) && (Vendedor.getCedula().isEmpty() && Vendedor.getNombre().isEmpty() && Vendedor.getContrasena().isEmpty())) {
            JOptionPane.showMessageDialog(null, "Por favor Registrar al menos un Usuario para Ingresar al Sistema", "Validación de Entrada", JOptionPane.ERROR_MESSAGE);
        } else {
            if (!Cliente.isActivo() && !Vendedor.isActivo()) {
                login.setModal(true);
                login.setVisible(true);
                login.toFront();
                if (!login.getTipo().isEmpty() && !login.getUsername().isEmpty() && !login.getPass().isEmpty() && login.isIngresado() == true) {
                    if (login.getTipo().equals("CLIENTE")) {
                        tipoUsuario = login.getTipo();
                        nombreUsuario = Cliente.getNombre();
                        lblNombre.setText("¡Bienvenido, " + nombreUsuario + "!");
                        lblUser.setText("Usuario: " + tipoUsuario);
                        mostrarPanelCliente();
                    } else {
                        if (login.getTipo().equals("VENDEDOR")) {
                            tipoUsuario = login.getTipo();
                            nombreUsuario = Vendedor.getNombre();
                            lblNombre.setText("¡Bienvenido, " + nombreUsuario + "!");
                            lblUser.setText("Usuario: " + tipoUsuario);
                            mostrarPanelVendedor();
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "El usuario " + tipoUsuario + ": " + nombreUsuario + " ya esta activo en el Sistema", "Validación de Entrada", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jmLoginActionPerformed

    private void jmSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jmSalirActionPerformed

    private void jmCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCerrarSesionActionPerformed
        if (!Cliente.isActivo() && !Vendedor.isActivo()) {
            JOptionPane.showMessageDialog(null, "No se Encuentra ningun Usuario activo por el momento", "Validación de Entrada", JOptionPane.ERROR_MESSAGE);
        } else {
            int r = JOptionPane.showOptionDialog(this, "¿Esta seguro de Cerrar Sesion?", "Validacion de Ingreso", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
            if (r == 0) {
                if (tipoUsuario.equals("CLIENTE")) {
                    Cliente.setActivo(false);
                    panelCli.dispose();
                    MPESCRITORIO.remove(panelCli);
                } else if (tipoUsuario.equals("VENDEDOR")) {
                    Vendedor.setActivo(false);
                    panelVend.dispose();
                    MPESCRITORIO.remove(panelVend);
                }
                login.setIngresado(false);
                lblNombre.setText(" ");
                lblUser.setText(" ");
            }
        }
    }//GEN-LAST:event_jmCerrarSesionActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MENUBAR;
    private javax.swing.JDesktopPane MPESCRITORIO;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu jSalir;
    private javax.swing.JMenu jSesion;
    private javax.swing.JMenuItem jmCerrarSesion;
    private javax.swing.JMenuItem jmLogin;
    private javax.swing.JMenuItem jmRegistrar;
    private javax.swing.JMenuItem jmSalir;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblUser;
    // End of variables declaration//GEN-END:variables
}
