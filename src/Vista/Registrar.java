package Vista;

import Clases.Cliente;
import Clases.Vendedor;
import Controlador.Operaciones;
import java.awt.Color;
import javax.swing.JOptionPane;

public class Registrar extends javax.swing.JDialog {

    public Registrar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public Operaciones validaciones = new Operaciones();
    public String ced = "", nom = "", pass = "", tipo = "";

    public String getTipo() {
        return tipo;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtContrasena = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        txtRepetirContrasena = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        cbUsuario = new javax.swing.JComboBox<>();
        btnIngresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setText("REGISTRAR");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setText("Cedula:");

        txtCedula.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCedula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCedulaMousePressed(evt);
            }
        });
        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setText("Nombre:");

        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setText("Contraseña:");

        txtContrasena.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel6.setText("Repetir Clave:");

        txtRepetirContrasena.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setText("Usuario:");

        cbUsuario.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cbUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "CLIENTE", "VENDEDOR" }));
        cbUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnIngresar.setBackground(new java.awt.Color(0, 134, 190));
        btnIngresar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("REGISTRAR");
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIngresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIngresarMouseExited(evt);
            }
        });
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(167, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel6))
                            .addGap(9, 9, 9)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtRepetirContrasena)
                                .addComponent(txtContrasena)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(62, 62, 62)
                            .addComponent(cbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRepetirContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        ced = txtCedula.getText();
        nom = txtNombre.getText();
        pass = txtContrasena.getText();
        String repPass = txtRepetirContrasena.getText();
        tipo = (String) cbUsuario.getSelectedItem();

        if (!validaciones.Esnumero(ced.trim()) || ced.trim().isEmpty() || Integer.parseInt(ced.trim()) < 0) {
            JOptionPane.showMessageDialog(null, "No es un número de cedula válido o debe ingresar algún id no negativo", "Validación de datos", JOptionPane.ERROR_MESSAGE);
        } else {
            if (!validaciones.Estexto(nom.toUpperCase().trim()) || nom.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "No es un nombre valido o campo vacio", "Validación de datos", JOptionPane.ERROR_MESSAGE);
            } else {
                if (!validaciones.EsContrasena(pass)) {
                    JOptionPane.showMessageDialog(null, "No es una contraseña valida, deberia de contener lo siguiente:\n - Por lo menos 8 caracteres\n - Por lo menos un Numero\n - Por lo menos una letra Mayuscula y una letra Minuscula\n - No debe de contener espacios", "Validación de datos", JOptionPane.ERROR_MESSAGE);
                } else {
                    if (!pass.equals(repPass)) {
                        JOptionPane.showMessageDialog(null, "Las Contraseñas no son iguales", "Validación de datos", JOptionPane.ERROR_MESSAGE);
                    } else {
                        if (tipo.equalsIgnoreCase("SELECCIONAR")) {
                            JOptionPane.showMessageDialog(null, "Debe seleccionar un tipo de Usuario", "Validación de datos", JOptionPane.ERROR_MESSAGE);
                        } else {
                            if ((ced.equals(Cliente.getCedula()) && nom.equals(Cliente.getNombre()) && pass.equals(Cliente.getContrasena())) || (ced.equals(Vendedor.getCedula()) && nom.equals(Vendedor.getNombre()) && pass.equals(Vendedor.getContrasena()))) {
                                JOptionPane.showMessageDialog(null, "Ese Usuario ya Existe en el Sistema", "Validación de datos", JOptionPane.ERROR_MESSAGE);
                            } else {
                                if (!Cliente.getCedula().isEmpty() && !Cliente.getNombre().isEmpty() && !Cliente.getContrasena().isEmpty() && tipo.equals("CLIENTE")) {
                                    JOptionPane.showMessageDialog(null, "Ya existe un Usuario Cliente en el Sistema", "Validación de datos", JOptionPane.ERROR_MESSAGE);
                                } else {
                                    if (!Vendedor.getCedula().isEmpty() && !Vendedor.getNombre().isEmpty() && !Vendedor.getContrasena().isEmpty() && tipo.equals("VENDEDOR")) {
                                        JOptionPane.showMessageDialog(null, "Ya existe un Usuario Vendedor en el Sistema", "Validación de datos", JOptionPane.ERROR_MESSAGE);
                                    } else {
                                        switch (tipo) {
                                            case "CLIENTE":
                                                Cliente cliente = new Cliente(ced.trim(), nom.trim(), pass, false);
                                                break;
                                            case "VENDEDOR":
                                                Vendedor vendedor = new Vendedor(ced.trim(), nom.trim(), pass, false);
                                                break;
                                        }
                                        txtCedula.setText("");
                                        txtNombre.setText("");
                                        txtContrasena.setText("");
                                        txtRepetirContrasena.setText("");
                                        cbUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"SELECCIONAR", "CLIENTE", "VENDEDOR"}));
                                        JOptionPane.showMessageDialog(null, "Usuario " + tipo + " registrado Exitosamente", "Registro", JOptionPane.INFORMATION_MESSAGE);
                                        this.dispose();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

    }//GEN-LAST:event_btnIngresarActionPerformed

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
       


    }//GEN-LAST:event_txtCedulaActionPerformed

    private void btnIngresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseEntered
        btnIngresar.setBackground(new Color(0, 156, 222));
    }//GEN-LAST:event_btnIngresarMouseEntered

    private void btnIngresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseExited
        btnIngresar.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_btnIngresarMouseExited

    private void txtCedulaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCedulaMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaMousePressed

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
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Registrar dialog = new Registrar(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JComboBox<String> cbUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtRepetirContrasena;
    // End of variables declaration//GEN-END:variables
}
