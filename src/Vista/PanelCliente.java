package Vista;

import javax.swing.ImageIcon;
import Clases.Carrito;
import Clases.Cliente;
import Clases.Item;
import Controlador.Operaciones;
import static Vista.Solicitudes.JTableSolicitud;
import static Vista.SolicitudesRecibidas.JTableRecibidas;
import static Vista.SolicitudesRecibidas.TXTTotalRecibidas;
import static Vista.SolicitudesRecibidas.TXTUserRecibidas;
import java.awt.Color;

import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

public class PanelCliente extends javax.swing.JInternalFrame {

    public int poslugar;
    Solicitudes solicitudes = new Solicitudes(null, true);
    Operaciones validaciones = new Operaciones();
    public Carrito carrito = new Carrito();
    public Item item = new Item();
    public int total;

    public PanelCliente() {
        initComponents();
        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("Imagenes/stock.png"));
        this.setFrameIcon(icon);
        clearTable();
        clearTableItem();
    }

    public static void clearTable() {
        for (int i = 0; i < JTable2.getRowCount(); i++) {
            for (int j = 0; j < JTable2.getColumnCount(); j++) {
                JTable2.setValueAt("", i, j);
            }
        }
    }

    public static void clearTableItem() {
        for (int i = 0; i < JTableItem.getRowCount(); i++) {
            for (int j = 0; j < JTableItem.getColumnCount(); j++) {
                JTableItem.setValueAt("", i, j);
            }
        }
    }

    public void limpiarTablaItems() {
        for (int i = 0; i < 10; i++) {
            JTableItem.setValueAt("", i, 0);
            JTableItem.setValueAt("", i, 1);
            JTableItem.setValueAt("", i, 2);
            JTableItem.setValueAt("", i, 3);
            JTableItem.setValueAt("", i, 4);
            JTableItem.setValueAt("", i, 5);
        }
    }

    public void ImprimirListaItems() {
        if (carrito.getTamano() > 0) {
            for (int j = 0; j < carrito.getTamano(); j++) {
                JTableItem.setValueAt(carrito.posicionItem(j).getId(), j, 0);
                JTableItem.setValueAt(carrito.posicionItem(j).getArticulo(), j, 1);
                JTableItem.setValueAt(carrito.posicionItem(j).getPrecio(), j, 2);
                JTableItem.setValueAt(carrito.posicionItem(j).getStock(), j, 3);
                JTableItem.setValueAt(carrito.posicionItem(j).getCantidad(), j, 4);
                JTableItem.setValueAt(carrito.posicionItem(j).getSubtotal(), j, 5);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay items en el carrito guardados", "Validación de datos", JOptionPane.INFORMATION_MESSAGE);

        }
    }

    void Limpiar() {
        TXTID.setText("");
        TXTArticulo.setText("");
        TXTPrecio.setText("");
        TXTExistencias.setText("");
        TXTCantidad.setText("");
    }

    void LimpiarItems() {
        TXTIDItem.setText("");
        TXTArticuloItem.setText("");
        TXTPrecioItem.setText("");
        TXTExistenciasItem.setText("");
        TXTCantidadItem.setText("");
    }

    void deshabilitar() {
        TXTCantidad.setEnabled(false);
        TXTCantidadItem.setEnabled(false);
        JBLimpiarCamposCarrito.setEnabled(false);
        JBAgregarCarrito.setEnabled(false);
        JBActualizarItem.setEnabled(false);
        JBEliminarItem.setEnabled(false);
        JBEnviarSolicitud.setEnabled(false);
        JTable2.setEnabled(false);
        JTable2.setVisible(false);
        JTableItem.setEnabled(false);
        JTableItem.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTable2 = new javax.swing.JTable();
        JBAgregarCarrito = new javax.swing.JButton();
        JBLimpiarCamposCarrito = new javax.swing.JButton();
        TXTCantidad = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        TXTCantidadItem = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTableItem = new javax.swing.JTable();
        JBEliminarItem = new javax.swing.JButton();
        JBActualizarItem = new javax.swing.JButton();
        TXTTotal = new javax.swing.JLabel();
        TXTExistencias = new javax.swing.JTextField();
        TXTArticulo = new javax.swing.JTextField();
        TXTID = new javax.swing.JTextField();
        TXTPrecio = new javax.swing.JTextField();
        TXTIDItem = new javax.swing.JTextField();
        TXTArticuloItem = new javax.swing.JTextField();
        TXTPrecioItem = new javax.swing.JTextField();
        TXTExistenciasItem = new javax.swing.JTextField();
        JBEnviarSolicitud = new javax.swing.JButton();
        JBSolicitudes = new javax.swing.JButton();

        setBorder(null);
        setTitle("Panel Cliente - Comprar");
        setPreferredSize(new java.awt.Dimension(1530, 686));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1530, 686));

        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        JTable2.setAutoCreateRowSorter(true);
        JTable2.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        JTable2.setModel(new javax.swing.table.DefaultTableModel(
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
                "ID", "Articulo", "Precio", "Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTable2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JTable2.setSelectionBackground(new java.awt.Color(60, 63, 65));
        JTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTable2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTable2);

        JBAgregarCarrito.setBackground(new java.awt.Color(0, 134, 190));
        JBAgregarCarrito.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        JBAgregarCarrito.setForeground(new java.awt.Color(255, 255, 255));
        JBAgregarCarrito.setText("Agregar Item al Carrito");
        JBAgregarCarrito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBAgregarCarrito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBAgregarCarritoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBAgregarCarritoMouseExited(evt);
            }
        });
        JBAgregarCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAgregarCarritoActionPerformed(evt);
            }
        });

        JBLimpiarCamposCarrito.setBackground(new java.awt.Color(153, 102, 255));
        JBLimpiarCamposCarrito.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        JBLimpiarCamposCarrito.setForeground(new java.awt.Color(255, 255, 255));
        JBLimpiarCamposCarrito.setText("Limpiar Campos");
        JBLimpiarCamposCarrito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBLimpiarCamposCarrito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBLimpiarCamposCarritoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBLimpiarCamposCarritoMouseExited(evt);
            }
        });
        JBLimpiarCamposCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBLimpiarCamposCarritoActionPerformed(evt);
            }
        });

        TXTCantidad.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        TXTCantidad.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cantidad:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12))); // NOI18N
        TXTCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTCantidadActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        TXTCantidadItem.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        TXTCantidadItem.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cantidad:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12))); // NOI18N
        TXTCantidadItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTCantidadItemActionPerformed(evt);
            }
        });

        jScrollPane2.setAutoscrolls(true);
        jScrollPane2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        JTableItem.setAutoCreateRowSorter(true);
        JTableItem.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        JTableItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Articulo", "Precio", "Stock", "Cantidad", "Subtotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTableItem.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JTableItem.setSelectionBackground(new java.awt.Color(60, 63, 65));
        JTableItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTableItemMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(JTableItem);

        JBEliminarItem.setBackground(new java.awt.Color(255, 102, 102));
        JBEliminarItem.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        JBEliminarItem.setForeground(new java.awt.Color(255, 255, 255));
        JBEliminarItem.setText("Eliminar Item");
        JBEliminarItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBEliminarItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBEliminarItemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBEliminarItemMouseExited(evt);
            }
        });
        JBEliminarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEliminarItemActionPerformed(evt);
            }
        });

        JBActualizarItem.setBackground(new java.awt.Color(255, 153, 255));
        JBActualizarItem.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        JBActualizarItem.setForeground(new java.awt.Color(255, 255, 255));
        JBActualizarItem.setText("Actualizar Item");
        JBActualizarItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBActualizarItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBActualizarItemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBActualizarItemMouseExited(evt);
            }
        });
        JBActualizarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBActualizarItemActionPerformed(evt);
            }
        });

        TXTTotal.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        TXTTotal.setForeground(new java.awt.Color(220, 25, 22));
        TXTTotal.setText("TOTAL: $0");

        TXTExistencias.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        TXTExistencias.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Stock:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12))); // NOI18N
        TXTExistencias.setEnabled(false);
        TXTExistencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTExistenciasActionPerformed(evt);
            }
        });

        TXTArticulo.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        TXTArticulo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre del Articulo:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12))); // NOI18N
        TXTArticulo.setEnabled(false);
        TXTArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTArticuloActionPerformed(evt);
            }
        });

        TXTID.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        TXTID.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ID:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12))); // NOI18N
        TXTID.setEnabled(false);
        TXTID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTIDActionPerformed(evt);
            }
        });

        TXTPrecio.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        TXTPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Precio:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12))); // NOI18N
        TXTPrecio.setEnabled(false);
        TXTPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTPrecioActionPerformed(evt);
            }
        });

        TXTIDItem.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        TXTIDItem.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ID:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12))); // NOI18N
        TXTIDItem.setEnabled(false);
        TXTIDItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTIDItemActionPerformed(evt);
            }
        });

        TXTArticuloItem.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        TXTArticuloItem.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre del Articulo:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12))); // NOI18N
        TXTArticuloItem.setEnabled(false);
        TXTArticuloItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTArticuloItemActionPerformed(evt);
            }
        });

        TXTPrecioItem.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        TXTPrecioItem.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Precio:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12))); // NOI18N
        TXTPrecioItem.setEnabled(false);
        TXTPrecioItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTPrecioItemActionPerformed(evt);
            }
        });

        TXTExistenciasItem.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        TXTExistenciasItem.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Stock:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12))); // NOI18N
        TXTExistenciasItem.setEnabled(false);
        TXTExistenciasItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTExistenciasItemActionPerformed(evt);
            }
        });

        JBEnviarSolicitud.setBackground(new java.awt.Color(255, 255, 102));
        JBEnviarSolicitud.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        JBEnviarSolicitud.setForeground(new java.awt.Color(0, 0, 0));
        JBEnviarSolicitud.setText("ENVIAR SOLICITUD");
        JBEnviarSolicitud.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBEnviarSolicitud.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBEnviarSolicitudMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBEnviarSolicitudMouseExited(evt);
            }
        });
        JBEnviarSolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEnviarSolicitudActionPerformed(evt);
            }
        });

        JBSolicitudes.setBackground(new java.awt.Color(153, 102, 255));
        JBSolicitudes.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        JBSolicitudes.setForeground(new java.awt.Color(255, 255, 255));
        JBSolicitudes.setText("Solicitudes");
        JBSolicitudes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBSolicitudes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBSolicitudesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBSolicitudesMouseExited(evt);
            }
        });
        JBSolicitudes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSolicitudesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(TXTArticulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TXTCantidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXTPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TXTExistencias, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JBAgregarCarrito, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(TXTID, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JBLimpiarCamposCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(TXTArticuloItem, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
                                .addComponent(TXTIDItem))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TXTPrecioItem, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                                    .addComponent(TXTCantidadItem))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(TXTExistenciasItem, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(TXTTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(JBEnviarSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(JBActualizarItem, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                                    .addComponent(JBSolicitudes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JBEliminarItem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE))))
                        .addGap(0, 33, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 865, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(TXTIDItem, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(TXTArticuloItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(TXTExistenciasItem, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TXTPrecioItem, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(JBActualizarItem, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(JBEliminarItem, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(JBSolicitudes, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TXTCantidadItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TXTTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JBEnviarSolicitud, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TXTID, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JBLimpiarCamposCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(TXTArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TXTExistencias, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TXTPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TXTCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JBAgregarCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 62, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTable2MouseClicked
        if (evt.getClickCount() == 2) {
            int r = JOptionPane.showOptionDialog(rootPane, "Ha seleccionado el producto " + JTable2.getSelectedRow() + "\n ¿Deseas cargarlo al sistema?", "Sistema de Encuestados", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
            if (r == 0) {
                int fila = JTable2.getSelectedRow();
                if (fila != -1) {
                    if (JTable2.getValueAt(fila, 0).toString().isEmpty() && JTable2.getValueAt(fila, 1).toString().isEmpty() && JTable2.getValueAt(fila, 2).toString().isEmpty() && JTable2.getValueAt(fila, 3).toString().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "No puedes seleccionar un Producto que no existe", "Validación de datos", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        TXTID.setText(JTable2.getValueAt(fila, 0).toString());
                        TXTArticulo.setText(JTable2.getValueAt(fila, 1).toString());
                        TXTPrecio.setText(JTable2.getValueAt(fila, 2).toString());
                        TXTExistencias.setText(JTable2.getValueAt(fila, 3).toString());
                        poslugar = fila;
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Debe seleccionar un producto", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_JTable2MouseClicked


    private void JBAgregarCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAgregarCarritoActionPerformed
        int sto, can, subtot, prec;
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
                        if (!validaciones.Esnumero(TXTCantidad.getText().trim()) || TXTCantidad.getText().trim().isEmpty() || Long.parseLong(TXTCantidad.getText().trim()) < 0) {
                            JOptionPane.showMessageDialog(null, "No es un numero de cantidad válido o debe ingresar algún numero no negativo", "Validación de datos", JOptionPane.ERROR_MESSAGE);
                        } else {
                            sto = Integer.parseInt(TXTExistencias.getText().trim());
                            can = Integer.parseInt(TXTCantidad.getText().trim());
                            prec = Integer.parseInt(TXTPrecio.getText().trim());
                            if (can <= sto) {
                                String id = TXTID.getText().trim();
                                if (carrito.buscarItem(id) != null) {
                                    JOptionPane.showMessageDialog(null, "No puedes agregar un producto al carrito mas de una vez", "Validación de datos", JOptionPane.ERROR_MESSAGE);
                                } else {
                                    subtot = (prec * can);
                                    item = new Item(TXTID.getText(), TXTArticulo.getText(), TXTPrecio.getText(), TXTExistencias.getText(), TXTCantidad.getText(), Integer.toString(subtot), carrito);
                                    carrito.agregarItem(item);
                                    JOptionPane.showMessageDialog(null, "Producto Guardado en el Carrito (ver el apartado a la derecha)", "Ingreso de Datos", JOptionPane.INFORMATION_MESSAGE);
                                    limpiarTablaItems();
                                    ImprimirListaItems();
                                    Limpiar();
                                    total = carrito.calcularTotal();
                                    TXTTotal.setText("TOTAL: $" + Integer.toString(carrito.calcularTotal()));
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "No puedes elegir una cantidad mayor que el stock disponible de ese producto", "Validación de datos", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_JBAgregarCarritoActionPerformed

    private void JBLimpiarCamposCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBLimpiarCamposCarritoActionPerformed
        Limpiar();
        LimpiarItems();
    }//GEN-LAST:event_JBLimpiarCamposCarritoActionPerformed

    private void TXTCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTCantidadActionPerformed

    private void TXTCantidadItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTCantidadItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTCantidadItemActionPerformed

    private void JTableItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableItemMouseClicked
        if (evt.getClickCount() == 2) {
            int r = JOptionPane.showOptionDialog(rootPane, "Ha seleccionado el item " + JTableItem.getSelectedRow() + "\n ¿Deseas cargarlo al sistema?", "Sistema de Encuestados", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
            if (r == 0) {
                int fila = JTableItem.getSelectedRow();
                if (fila != -1) {
                    if (item.getTamano() == 0) {
                        JOptionPane.showMessageDialog(null, "No hay registros de items en la base de datos", "Validación de datos", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        if (JTableItem.getValueAt(fila, 0).toString().isEmpty() && JTableItem.getValueAt(fila, 1).toString().isEmpty() && JTableItem.getValueAt(fila, 2).toString().isEmpty() && JTableItem.getValueAt(fila, 3).toString().isEmpty() && JTableItem.getValueAt(fila, 4).toString().isEmpty() && JTableItem.getValueAt(fila, 5).toString().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "No puedes seleccionar un item que no existe", "Validación de datos", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            TXTIDItem.setText(JTableItem.getValueAt(fila, 0).toString());
                            TXTArticuloItem.setText(JTableItem.getValueAt(fila, 1).toString());
                            TXTPrecioItem.setText(JTableItem.getValueAt(fila, 2).toString());
                            TXTExistenciasItem.setText(JTableItem.getValueAt(fila, 3).toString());
                            TXTCantidadItem.setText(JTableItem.getValueAt(fila, 4).toString());
                            poslugar = fila;
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Debe seleccionar un item", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_JTableItemMouseClicked

    private void JBEliminarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEliminarItemActionPerformed
        try {
            if (!validaciones.Esnumero(TXTIDItem.getText().trim()) || TXTIDItem.getText().trim().isEmpty() || Long.parseLong(TXTIDItem.getText().trim()) < 0) {
                JOptionPane.showMessageDialog(null, "No es un número de ID válido o debe ingresar algún id no negativo", "Validación de datos", JOptionPane.ERROR_MESSAGE);
            } else {
                String id = TXTIDItem.getText().trim();
                if (carrito.getTamano() > 0) {
                    if (carrito.buscarItem(id) != null) {
                        int r = JOptionPane.showOptionDialog(this, "¿Esta seguro de eliminar este item del carrito?", "Carrito de Compra", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                        if (r == 0) {
                            carrito.eliminarItem(carrito.buscarItem(id));
                            LimpiarItems();
                            JOptionPane.showMessageDialog(null, "Item Eliminado", "Resultados de Productos", JOptionPane.INFORMATION_MESSAGE);
                            limpiarTablaItems();
                            ImprimirListaItems();
                            total = carrito.calcularTotal();
                            TXTTotal.setText("TOTAL: $" + Integer.toString(carrito.calcularTotal()));
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
    }//GEN-LAST:event_JBEliminarItemActionPerformed

    private void JBActualizarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBActualizarItemActionPerformed
        int sto, can, subtot, prec;
        try {
            if (!validaciones.Esnumero(TXTIDItem.getText().trim()) || TXTIDItem.getText().trim().isEmpty() || Long.parseLong(TXTIDItem.getText().trim()) < 0) {
                JOptionPane.showMessageDialog(null, "No es un ID válido o debe ingresar algún id no negativo", "Validación de datos", JOptionPane.ERROR_MESSAGE);
            } else {
                if (!validaciones.Estexto(TXTArticuloItem.getText().toUpperCase().trim()) || TXTArticuloItem.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No es un nombre valido o campo vacio", "Validación de datos", JOptionPane.ERROR_MESSAGE);
                } else {
                    if (!validaciones.Esnumero(TXTPrecioItem.getText().trim()) || TXTPrecioItem.getText().trim().isEmpty() || Long.parseLong(TXTPrecioItem.getText().trim()) < 0) {
                        JOptionPane.showMessageDialog(null, "No es un Precio válido o debe ingresar algún precio no negativo", "Validación de datos", JOptionPane.ERROR_MESSAGE);
                    } else {
                        if (!validaciones.Esnumero(TXTExistenciasItem.getText().trim()) || TXTExistenciasItem.getText().trim().isEmpty() || Long.parseLong(TXTExistenciasItem.getText().trim()) < 0) {
                            JOptionPane.showMessageDialog(null, "No es un numero válido o debe ingresar algún numero no negativo", "Validación de datos", JOptionPane.ERROR_MESSAGE);
                        } else {
                            if (!validaciones.Esnumero(TXTCantidadItem.getText().trim()) || TXTCantidadItem.getText().trim().isEmpty() || Long.parseLong(TXTCantidadItem.getText().trim()) < 0) {
                                JOptionPane.showMessageDialog(null, "No es un numero de cantidad válido o debe ingresar algún numero no negativo", "Validación de datos", JOptionPane.ERROR_MESSAGE);
                            } else {
                                sto = Integer.parseInt(TXTExistenciasItem.getText().trim());
                                can = Integer.parseInt(TXTCantidadItem.getText().trim());
                                prec = Integer.parseInt(TXTPrecioItem.getText().trim());
                                if (can <= sto) {
                                    String id = TXTIDItem.getText().trim();
                                    if (carrito.getTamano() > 0) {
                                        if (carrito.buscarItem(id) != null) {

                                            subtot = (prec * can);
                                            Item it = carrito.buscarItem(id);
                                            it.setArticulo(TXTArticuloItem.getText().toUpperCase().trim());
                                            it.setPrecio(TXTPrecioItem.getText().trim());
                                            it.setStock(TXTExistenciasItem.getText().trim());
                                            it.setCantidad(TXTCantidadItem.getText().trim());
                                            it.setSubtotal(Integer.toString(subtot));

                                            LimpiarItems();
                                            JOptionPane.showMessageDialog(null, "Item Actualizado", "Resultados de Acciones", JOptionPane.INFORMATION_MESSAGE);
                                            limpiarTablaItems();
                                            ImprimirListaItems();
                                            total = carrito.calcularTotal();
                                            TXTTotal.setText("TOTAL: $" + Integer.toString(carrito.calcularTotal()));
                                        } else {
                                            JOptionPane.showMessageDialog(null, "No hay registro en la base de datos con este ID " + id, "Validación de Búsqueda", JOptionPane.ERROR_MESSAGE);
                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(null, "No hay resgistro en la lista", "Resultados de Acciones", JOptionPane.INFORMATION_MESSAGE);
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "No puedes elegir una cantidad mayor que el stock disponible de ese producto", "Validación de datos", JOptionPane.ERROR_MESSAGE);
                                }
                            }
                        }
                    }
                }
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_JBActualizarItemActionPerformed

    private void TXTExistenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTExistenciasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTExistenciasActionPerformed

    private void TXTArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTArticuloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTArticuloActionPerformed

    private void TXTIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTIDActionPerformed

    private void TXTPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTPrecioActionPerformed

    private void TXTIDItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTIDItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTIDItemActionPerformed

    private void TXTArticuloItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTArticuloItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTArticuloItemActionPerformed

    private void TXTPrecioItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTPrecioItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTPrecioItemActionPerformed

    private void TXTExistenciasItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTExistenciasItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTExistenciasItemActionPerformed

    private void JBEnviarSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEnviarSolicitudActionPerformed
        if (carrito.getTamano() > 0) {
            int r = JOptionPane.showOptionDialog(this, "¿Estas seguro de enviar solicitud? No podras agregar mas productos al carrito despues de confirmar", "Carrito de Compra", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
            if (r == 0) {
                TableModel model = JTableItem.getModel();
                JTableSolicitud.setModel(model);
                JTableRecibidas.setModel(model);
                Solicitudes.JTableSolicitud.setVisible(true);
                Solicitudes.TXTTotalSolicitud.setText("TOTAL: $" + total);
                Solicitudes.TXTUser.setText("Cliente Solicitante: " + Cliente.getNombre());
                JTableRecibidas.setVisible(true);
                TXTTotalRecibidas.setText("TOTAL: $" + total);
                TXTUserRecibidas.setText("Cliente Solicitante: " + Cliente.getNombre());
                TXTTotal.setText("TOTAL: $0");
                deshabilitar();
                JOptionPane.showMessageDialog(null, "Solicitud enviada exitosamente", "Carrito de Compra", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay items en el carrito para enviar solicitud", "Validación de Datos", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_JBEnviarSolicitudActionPerformed

    private void JBSolicitudesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSolicitudesActionPerformed
        solicitudes.setModal(true);
        solicitudes.setVisible(true);
        solicitudes.toFront();
    }//GEN-LAST:event_JBSolicitudesActionPerformed

    private void JBActualizarItemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBActualizarItemMouseEntered
        JBActualizarItem.setBackground(new Color(255, 179, 255));
    }//GEN-LAST:event_JBActualizarItemMouseEntered

    private void JBEnviarSolicitudMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBEnviarSolicitudMouseEntered
        JBEnviarSolicitud.setBackground(new Color(255, 255, 153));
    }//GEN-LAST:event_JBEnviarSolicitudMouseEntered

    private void JBActualizarItemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBActualizarItemMouseExited
        JBActualizarItem.setBackground(new Color(255,153,255));
    }//GEN-LAST:event_JBActualizarItemMouseExited

    private void JBEnviarSolicitudMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBEnviarSolicitudMouseExited
        JBEnviarSolicitud.setBackground(new Color(255, 255, 102));
    }//GEN-LAST:event_JBEnviarSolicitudMouseExited

    private void JBAgregarCarritoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBAgregarCarritoMouseExited
        JBAgregarCarrito.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_JBAgregarCarritoMouseExited

    private void JBAgregarCarritoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBAgregarCarritoMouseEntered
        JBAgregarCarrito.setBackground(new Color(0, 156, 222));
    }//GEN-LAST:event_JBAgregarCarritoMouseEntered

    private void JBLimpiarCamposCarritoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBLimpiarCamposCarritoMouseEntered
        JBLimpiarCamposCarrito.setBackground(new Color(177, 140, 255));
    }//GEN-LAST:event_JBLimpiarCamposCarritoMouseEntered

    private void JBLimpiarCamposCarritoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBLimpiarCamposCarritoMouseExited
         JBLimpiarCamposCarrito.setBackground(new Color(153,102,255));
    }//GEN-LAST:event_JBLimpiarCamposCarritoMouseExited

    private void JBSolicitudesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBSolicitudesMouseExited
       JBSolicitudes.setBackground(new Color(153,102,255));
    }//GEN-LAST:event_JBSolicitudesMouseExited

    private void JBEliminarItemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBEliminarItemMouseExited
       JBEliminarItem .setBackground(new Color(255,102,102));
    }//GEN-LAST:event_JBEliminarItemMouseExited

    private void JBEliminarItemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBEliminarItemMouseEntered
        JBEliminarItem .setBackground(new Color(255,121,121));
    }//GEN-LAST:event_JBEliminarItemMouseEntered

    private void JBSolicitudesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBSolicitudesMouseEntered
        JBSolicitudes.setBackground(new Color(177, 140, 255));
    }//GEN-LAST:event_JBSolicitudesMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBActualizarItem;
    private javax.swing.JButton JBAgregarCarrito;
    private javax.swing.JButton JBEliminarItem;
    private javax.swing.JButton JBEnviarSolicitud;
    private javax.swing.JButton JBLimpiarCamposCarrito;
    private javax.swing.JButton JBSolicitudes;
    public static javax.swing.JTable JTable2;
    public static javax.swing.JTable JTableItem;
    private javax.swing.JTextField TXTArticulo;
    private javax.swing.JTextField TXTArticuloItem;
    private javax.swing.JTextField TXTCantidad;
    private javax.swing.JTextField TXTCantidadItem;
    private javax.swing.JTextField TXTExistencias;
    private javax.swing.JTextField TXTExistenciasItem;
    private javax.swing.JTextField TXTID;
    private javax.swing.JTextField TXTIDItem;
    private javax.swing.JTextField TXTPrecio;
    private javax.swing.JTextField TXTPrecioItem;
    private javax.swing.JLabel TXTTotal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
