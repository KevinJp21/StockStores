package Vista;

import Clases.Cliente;
import Clases.Vendedor;
import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.time.LocalDate;
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
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/onlineshop.png")));
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int dia = now.getDayOfMonth();
        int month = now.getMonthValue();
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", " ;Septiembre",
            "Octubre", "Noviembre", "Diciemrbre"};
        fecha.setText("Hoy es " + dia + " de " + meses[month - 1] + " de " + year);
        Bienvenido bn = new Bienvenido();

        bn.setSize(836, 425);
        bn.setLocation(0, 0);

        content.removeAll();
        content.add(bn, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    public void mostrarPanelVendedor() {
        MPESCRITORIO.add(panelVend);
        panelVend.setVisible(true);
        panelVend.toFront();
        panelVend.setLocation(MPESCRITORIO.getWidth() / 2 - panelVend.getWidth() / 2, MPESCRITORIO.getHeight() / 2 - panelVend.getHeight() / 2);
        fecha.setVisible(false);
    }

    public void mostrarPanelCliente() {
        MPESCRITORIO.add(panelCli);
        panelCli.setVisible(true);
        panelCli.toFront();
        panelCli.setLocation(MPESCRITORIO.getWidth() / 2 - panelCli.getWidth() / 2, MPESCRITORIO.getHeight() / 2 - panelCli.getHeight() / 2);
        fecha.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MPESCRITORIO = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        content = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        city = new javax.swing.JLabel();
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
        MPESCRITORIO.setPreferredSize(new java.awt.Dimension(1570, 850));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(32767, 32767));
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1570, 850));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombre.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        lblNombre.setText(" ");
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 30, 400, -1));

        lblUser.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        lblUser.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser.setText(" ");
        jPanel1.add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(1125, 30, 400, -1));

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        jPanel1.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 840, 500));

        Header.setBackground(new java.awt.Color(25, 118, 210));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Administración/Control/Tienda");

        fecha.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        fecha.setForeground(new java.awt.Color(255, 255, 255));
        fecha.setText("Hoy es Sábado 28 de Abril de 2018");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(fecha))
                .addContainerGap(910, Short.MAX_VALUE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        jPanel1.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 1350, 150));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.png"))); // NOI18N
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 380, 260, -1));

        Name.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        Name.setForeground(new java.awt.Color(255, 255, 255));
        Name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Name.setText("StockStores");
        jPanel1.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(1128, 530, 260, -1));

        city.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/city.png"))); // NOI18N
        city.setText("jLabel1");
        jPanel1.add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 260, 260, 520));

        MPESCRITORIO.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout MPESCRITORIOLayout = new javax.swing.GroupLayout(MPESCRITORIO);
        MPESCRITORIO.setLayout(MPESCRITORIOLayout);
        MPESCRITORIOLayout.setHorizontalGroup(
            MPESCRITORIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MPESCRITORIOLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        MPESCRITORIOLayout.setVerticalGroup(
            MPESCRITORIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MPESCRITORIOLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jSesion.setText("Sesion");

        jmRegistrar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmRegistrar.setText("Registrar");
        jmRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmRegistrarActionPerformed(evt);
            }
        });
        jSesion.add(jmRegistrar);

        jmLogin.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmLogin.setText("Login");
        jmLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmLoginActionPerformed(evt);
            }
        });
        jSesion.add(jmLogin);

        jmCerrarSesion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jmCerrarSesion.setText("Cerrar Sesion");
        jmCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCerrarSesionActionPerformed(evt);
            }
        });
        jSesion.add(jmCerrarSesion);

        MENUBAR.add(jSesion);

        jSalir.setText("Salir");

        jmSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
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
                .addComponent(MPESCRITORIO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MPESCRITORIO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmRegistrarActionPerformed
        
        if ((Cliente.getCedula().isEmpty() && Cliente.getNombre().isEmpty() && Cliente.getContrasena().isEmpty()) || (Vendedor.getCedula().isEmpty() && Vendedor.getNombre().isEmpty() && Vendedor.getContrasena().isEmpty())) {
          content.setVisible(false);
        logo.setVisible(false);
        city.setVisible(false);
        Name.setVisible(false);
            if (!Cliente.isActivo() && !Vendedor.isActivo()) {
                registrar.setModal(true);
                registrar.setVisible(true);
                registrar.toFront();
                content.setVisible(true);
                logo.setVisible(true);
                city.setVisible(true);
                Name.setVisible(true);
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
            content.setVisible(false);
        logo.setVisible(false);
        city.setVisible(false);
        Name.setVisible(false);
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
                        content.setVisible(false);
                        logo.setVisible(false);
                        city.setVisible(false);
                        Name.setVisible(false);
                        mostrarPanelCliente();
                    } else {
                        if (login.getTipo().equals("VENDEDOR")) {
                            tipoUsuario = login.getTipo();
                            nombreUsuario = Vendedor.getNombre();
                            lblNombre.setText("¡Bienvenido, " + nombreUsuario + "!");
                            lblUser.setText("Usuario: " + tipoUsuario);
                            content.setVisible(false);
                            logo.setVisible(false);
                            city.setVisible(false);
                            Name.setVisible(false);
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
                fecha.setVisible(true);
                content.setVisible(true);
                logo.setVisible(true);
                city.setVisible(true);
                Name.setVisible(true);
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
    private javax.swing.JPanel Header;
    private javax.swing.JMenuBar MENUBAR;
    private javax.swing.JDesktopPane MPESCRITORIO;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel city;
    private javax.swing.JPanel content;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu jSalir;
    private javax.swing.JMenu jSesion;
    private javax.swing.JMenuItem jmCerrarSesion;
    private javax.swing.JMenuItem jmLogin;
    private javax.swing.JMenuItem jmRegistrar;
    private javax.swing.JMenuItem jmSalir;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
