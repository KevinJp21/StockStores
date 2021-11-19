package Vista;

import javax.swing.ImageIcon;
import Clases.Inventario;
import Clases.Producto;
import Controlador.Operaciones;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PanelVendedor extends javax.swing.JInternalFrame {
    
    public int poslugar;
    Operaciones validaciones = new Operaciones();
    public Inventario Inventario = new Inventario();
    public Producto producto = new Producto();
    public Producto pr;
    
    public PanelVendedor() {
        initComponents();
        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("Imagenes/stock.png"));
        this.setFrameIcon(icon);
    }
    
    public void limpiarTabla() {
        for (int i = 0; i < 10; i++) {
            JTable.setValueAt("", i, 0);
            JTable.setValueAt("", i, 1);
            JTable.setValueAt("", i, 2);
            JTable.setValueAt("", i, 3);
        }
    }

    void Limpiar() {

        TXTID.setText("");
        TXTArticulo.setText("");
        TXTPrecio.setText("");
        TXTExistencias.setText("");

    }

    void habilita(boolean answer) {
        TXTID.setEnabled(answer);
        TXTArticulo.setEnabled(answer);
        TXTPrecio.setEnabled(answer);
        TXTExistencias.setEnabled(answer);
        JBAgregar.setEnabled(answer);
    }
    
    public void ImprimirLista() {
        if (Inventario.getTamano() > 0) {
            for (int j = 0; j < Inventario.getTamano(); j++) {
                JTable.setValueAt(Inventario.posicionProducto(j).getId(), j, 0);
                JTable.setValueAt(Inventario.posicionProducto(j).getArticulo().toUpperCase(), j, 1);
                JTable.setValueAt(Inventario.posicionProducto(j).getPrecio(), j, 2);
                JTable.setValueAt(Inventario.posicionProducto(j).getStock(), j, 3);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay productos guardados", "Validación de datos", JOptionPane.INFORMATION_MESSAGE);

        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel12 = new javax.swing.JPanel();
        TXTExistencias = new javax.swing.JTextField();
        TXTPrecio = new javax.swing.JTextField();
        TXTArticulo = new javax.swing.JTextField();
        TXTID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTable = new javax.swing.JTable();
        JBAgregar = new javax.swing.JButton();
        JBEliminar = new javax.swing.JButton();
        JBActualizar = new javax.swing.JButton();
        JBBuscar = new javax.swing.JButton();
        JBLimpiarCampos = new javax.swing.JButton();

        setBorder(null);
        setTitle("Panel Vendedor - Inventario");
        setPreferredSize(new java.awt.Dimension(900, 695));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setPreferredSize(new java.awt.Dimension(985, 733));

        TXTExistencias.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        TXTExistencias.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Stock:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12))); // NOI18N
        TXTExistencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTExistenciasActionPerformed(evt);
            }
        });

        TXTPrecio.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        TXTPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Precio Unitario:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12))); // NOI18N

        TXTArticulo.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        TXTArticulo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre del Articulo:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12))); // NOI18N

        TXTID.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        TXTID.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ID:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12))); // NOI18N
        TXTID.setSelectedTextColor(new java.awt.Color(204, 255, 255));

        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        JTable.setAutoCreateRowSorter(true);
        JTable.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        JTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Articulo", "Precio", "Existencias"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JTable.setSelectionBackground(new java.awt.Color(60, 63, 65));
        JTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTable);

        JBAgregar.setBackground(new java.awt.Color(102, 0, 255));
        JBAgregar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        JBAgregar.setForeground(new java.awt.Color(255, 255, 255));
        JBAgregar.setText("Agregar");
        JBAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAgregarActionPerformed(evt);
            }
        });

        JBEliminar.setBackground(new java.awt.Color(255, 0, 0));
        JBEliminar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        JBEliminar.setForeground(new java.awt.Color(255, 255, 255));
        JBEliminar.setText("Eliminar");
        JBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEliminarActionPerformed(evt);
            }
        });

        JBActualizar.setBackground(new java.awt.Color(255, 0, 153));
        JBActualizar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        JBActualizar.setForeground(new java.awt.Color(255, 255, 255));
        JBActualizar.setText("Actualizar");
        JBActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBActualizarActionPerformed(evt);
            }
        });

        JBBuscar.setBackground(new java.awt.Color(102, 0, 255));
        JBBuscar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        JBBuscar.setForeground(new java.awt.Color(255, 255, 255));
        JBBuscar.setText("Buscar");
        JBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBuscarActionPerformed(evt);
            }
        });

        JBLimpiarCampos.setBackground(new java.awt.Color(102, 0, 255));
        JBLimpiarCampos.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        JBLimpiarCampos.setForeground(new java.awt.Color(255, 255, 255));
        JBLimpiarCampos.setText("Limpiar Campos");
        JBLimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBLimpiarCamposActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TXTID, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                            .addComponent(TXTPrecio)
                            .addComponent(TXTArticulo))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JBAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JBActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JBBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(JBLimpiarCampos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(TXTExistencias, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 807, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(TXTID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TXTArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TXTPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JBAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JBActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(JBLimpiarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(TXTExistencias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(190, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 986, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 986, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 759, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, 759, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableMouseClicked
        if (evt.getClickCount() == 2) {
            int r = JOptionPane.showOptionDialog(rootPane, "Ha seleccionado el producto " + JTable.getSelectedRow() + "\n ¿Deseas cargarlo al sistema?", "Sistema de Encuestados", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
            if (r == 0) {
                int fila = JTable.getSelectedRow();
                if (fila != -1) {
                    if (producto.getTamano() == 0) {
                        JOptionPane.showMessageDialog(null, "No hay registros en la Base de Datos", "Validación de datos", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        TXTID.setText(JTable.getValueAt(fila, 0).toString());
                        TXTID.setEnabled(false);
                        JBAgregar.setEnabled(false);
                        TXTArticulo.setText(JTable.getValueAt(fila, 1).toString());
                        TXTPrecio.setText(JTable.getValueAt(fila, 2).toString());
                        TXTExistencias.setText(JTable.getValueAt(fila, 3).toString());
                        poslugar = fila;
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Debe seleccionar un producto", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_JTableMouseClicked

    private void JBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAgregarActionPerformed
        if (!validaciones.Esnumero(TXTID.getText().trim()) || TXTID.getText().trim().isEmpty() || Long.parseLong(TXTID.getText().trim()) < 0) {
            JOptionPane.showMessageDialog(null, "No es un ID válido o debe ingresar algún id no negativo", "Validación de datos", JOptionPane.ERROR_MESSAGE);
        } else {
            if (!validaciones.Estexto(TXTArticulo.getText().toUpperCase().trim()) || TXTArticulo.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "No es un nombre valido o campo vacio", "Validación de datos", JOptionPane.ERROR_MESSAGE);
            } else {
                if (!validaciones.Esnumero(TXTPrecio.getText().trim()) || TXTPrecio.getText().trim().isEmpty() || Long.parseLong(TXTPrecio.getText().trim()) < 0) {
                    JOptionPane.showMessageDialog(null, "No es un Precio válido o debe ingresar algún precio no negativo", "Validación de datos", JOptionPane.ERROR_MESSAGE);
                } else {
                    if (!validaciones.Esnumero(TXTExistencias.getText().trim()) || TXTExistencias.getText().trim().isEmpty() || Long.parseLong(TXTExistencias.getText().trim()) < 0) {
                        JOptionPane.showMessageDialog(null, "No es un numero válido o debe ingresar algún numero no negativo", "Validación de datos", JOptionPane.ERROR_MESSAGE);
                    } else {

                        producto = new Producto(TXTID.getText(), TXTArticulo.getText().toUpperCase(), TXTPrecio.getText().toUpperCase(), TXTExistencias.getText().toUpperCase(), Inventario);

                        Inventario.agregar(producto);

                        Limpiar();
                        habilita(true);
                        JOptionPane.showMessageDialog(null, "Procucto Guardado", "Ingreso de Datos", JOptionPane.INFORMATION_MESSAGE);
                        limpiarTabla();
                        ImprimirLista();
                    }
                }
            }
        }
    }//GEN-LAST:event_JBAgregarActionPerformed

    private void JBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEliminarActionPerformed
        try {
            if (!validaciones.Esnumero(TXTID.getText().trim()) || TXTID.getText().trim().isEmpty() || Long.parseLong(TXTID.getText().trim()) < 0) {
                JOptionPane.showMessageDialog(null, "No es un número de ID válido o debe ingresar algún id no negativo", "Validación de datos", JOptionPane.ERROR_MESSAGE);
            } else {
                String id = TXTID.getText().trim();
                if (Inventario.getTamano() > 0) {
                    if (Inventario.buscarProducto(id) != null) {
                        int r = JOptionPane.showOptionDialog(this, "¿Esta seguro de eliminar este producto?", "Sistema de Inventario", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                        if (r == 0) {
                            Inventario.eliminarProducto(Inventario.buscarProducto(id));
                            Limpiar();
                            habilita(true);
                            JOptionPane.showMessageDialog(null, "Producto Eliminado", "Resultados de Productos", JOptionPane.INFORMATION_MESSAGE);
                            limpiarTabla();
                            ImprimirLista();
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay registro en la base de datos con este ID" + id, "Validación de Búsqueda", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No hay resgistro en la lista", "Resultados de Acciones", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_JBEliminarActionPerformed

    private void JBActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBActualizarActionPerformed
        try {
            if (!validaciones.Esnumero(TXTID.getText().trim()) || TXTID.getText().trim().isEmpty() || Long.parseLong(TXTID.getText().trim()) < 0) {
                JOptionPane.showMessageDialog(null, "No es un ID válido o debe ingresar algún id no negativo", "Validación de datos", JOptionPane.ERROR_MESSAGE);
            } else {
                if (!validaciones.Estexto(TXTArticulo.getText().toUpperCase().trim()) || TXTArticulo.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No es un nombre valido o campo vacio", "Validación de datos", JOptionPane.ERROR_MESSAGE);
                } else {
                    if (!validaciones.Esnumero(TXTPrecio.getText().trim()) || TXTPrecio.getText().trim().isEmpty() || Long.parseLong(TXTPrecio.getText().trim()) < 0) {
                        JOptionPane.showMessageDialog(null, "No es un Precio válido o debe ingresar algún precio no negativo", "Validación de datos", JOptionPane.ERROR_MESSAGE);
                    } else {
                        if (!validaciones.Esnumero(TXTExistencias.getText().trim()) || TXTExistencias.getText().trim().isEmpty() || Long.parseLong(TXTExistencias.getText().trim()) < 0) {
                            JOptionPane.showMessageDialog(null, "No es un numero válido o debe ingresar algún numero no negativo", "Validación de datos", JOptionPane.ERROR_MESSAGE);
                        } else {
                            String id = TXTID.getText().trim();
                            if (Inventario.getTamano() > 0) {
                                if (Inventario.buscarProducto(id) != null) {
                                    Producto pro = Inventario.buscarProducto(id);
                                    pro.setArticulo(TXTArticulo.getText().toUpperCase().trim());
                                    pro.setPrecio(TXTPrecio.getText().trim());
                                    pro.setStock(TXTExistencias.getText().trim());
                                    Limpiar();
                                    habilita(true);
                                    JOptionPane.showMessageDialog(null, "Producto Actualizado", "Resultados de Acciones", JOptionPane.INFORMATION_MESSAGE);
                                    limpiarTabla();
                                    ImprimirLista();
                                } else {
                                    JOptionPane.showMessageDialog(null, "No hay registro en la base de datos con este ID " + id, "Validación de Búsqueda", JOptionPane.ERROR_MESSAGE);
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "No hay resgistro en la lista", "Resultados de Acciones", JOptionPane.INFORMATION_MESSAGE);
                            }
                        }
                    }
                }

            }

        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_JBActualizarActionPerformed

    private void JBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBuscarActionPerformed
        try {
            if (Inventario.getTamano() > 0) {
                String id = TXTID.getText().trim();
                if (Inventario.getTamano() > 0) {
                    if (Inventario.buscarProducto(id) != null) {
                        JOptionPane.showMessageDialog(null, "Existe una coincidencia:\n Id: "+TXTID.getText()+"\n Articulo: "+TXTArticulo.getText()+"\n Precio: "+TXTPrecio.getText()+"\n Existencias: "+TXTExistencias.getText(), "Resultados de Acciones", JOptionPane.INFORMATION_MESSAGE);
                        limpiarTabla();
                        ImprimirLista();
                        Limpiar();
                        habilita(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay registro en la base de datos con este ID " + id, "Validación de Búsqueda", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No hay resgistro en la lista", "Resultados de Acciones", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_JBBuscarActionPerformed

    private void JBLimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBLimpiarCamposActionPerformed
        Limpiar();
        habilita(true);
    }//GEN-LAST:event_JBLimpiarCamposActionPerformed

    private void TXTExistenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTExistenciasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTExistenciasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBActualizar;
    private javax.swing.JButton JBAgregar;
    private javax.swing.JButton JBBuscar;
    private javax.swing.JButton JBEliminar;
    private javax.swing.JButton JBLimpiarCampos;
    private javax.swing.JTable JTable;
    private javax.swing.JTextField TXTArticulo;
    private javax.swing.JTextField TXTExistencias;
    private javax.swing.JTextField TXTID;
    private javax.swing.JTextField TXTPrecio;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
