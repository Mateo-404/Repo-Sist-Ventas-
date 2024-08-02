package Vista;

import Controladores.control_Producto;
import Controladores.control_Ventas;
import Modelos.Modelo_Producto;
import Modelos.Modelo_Venta;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ventana_Ventas extends javax.swing.JInternalFrame {

    String codBarra;

    public Ventana_Ventas() {
        initComponents();
        setTitle("Facturacion");
        this.setSize(new Dimension(900, 650));
        // Centrar el JInternalFrame en su contenedor principal
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JDesktopPane desktopPane = getDesktopPane();
                if (desktopPane != null) {
                    Dimension desktopSize = desktopPane.getSize();
                    Dimension jInternalFrameSize = getSize();
                    setLocation((desktopSize.width - jInternalFrameSize.width) / 2,
                            (desktopSize.height - jInternalFrameSize.height) / 2);
                }
            }
        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titCant = new javax.swing.JLabel();
        titCodigoBarra = new javax.swing.JLabel();
        titProducto = new javax.swing.JLabel();
        txtPrecioProducto = new javax.swing.JTextField();
        codigoBarra = new javax.swing.JTextField();
        nombreProducto = new javax.swing.JTextField();
        txtSubTotal = new javax.swing.JTextField();
        titTotal = new javax.swing.JLabel();
        registroVentas = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDescripcionVenta = new javax.swing.JTable();
        tipoPago = new javax.swing.JComboBox<>();
        titTipoPago = new javax.swing.JLabel();
        jButtonLimpiar = new javax.swing.JButton();
        jBotonBuscar = new javax.swing.JButton();
        jBotonAnadir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jwallpaper = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setClosable(true);
        setIconifiable(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(740, 441));
        setMinimumSize(new java.awt.Dimension(740, 441));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titCant.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titCant.setForeground(new java.awt.Color(0, 0, 0));
        titCant.setText("Precio");
        getContentPane().add(titCant, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, -1, -1));

        titCodigoBarra.setBackground(new java.awt.Color(255, 255, 255));
        titCodigoBarra.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titCodigoBarra.setForeground(new java.awt.Color(0, 0, 0));
        titCodigoBarra.setText("Codigo Barra");
        getContentPane().add(titCodigoBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        titProducto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titProducto.setForeground(new java.awt.Color(0, 0, 0));
        titProducto.setText("Producto");
        getContentPane().add(titProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, -1, -1));

        txtPrecioProducto.setBackground(new java.awt.Color(255, 255, 255));
        txtPrecioProducto.setForeground(new java.awt.Color(0, 0, 0));
        txtPrecioProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioProductoActionPerformed(evt);
            }
        });
        getContentPane().add(txtPrecioProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 70, 30));

        codigoBarra.setBackground(new java.awt.Color(255, 255, 255));
        codigoBarra.setForeground(new java.awt.Color(0, 0, 0));
        codigoBarra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoBarraActionPerformed(evt);
            }
        });
        getContentPane().add(codigoBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 190, 32));

        nombreProducto.setBackground(new java.awt.Color(255, 255, 255));
        nombreProducto.setForeground(new java.awt.Color(0, 0, 0));
        nombreProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreProductoActionPerformed(evt);
            }
        });
        getContentPane().add(nombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 160, 30));

        txtSubTotal.setBackground(new java.awt.Color(255, 255, 255));
        txtSubTotal.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        txtSubTotal.setForeground(new java.awt.Color(0, 0, 0));
        txtSubTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtSubTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubTotalActionPerformed(evt);
            }
        });
        getContentPane().add(txtSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 50, 250, 80));

        titTotal.setBackground(new java.awt.Color(255, 255, 255));
        titTotal.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        titTotal.setForeground(new java.awt.Color(0, 0, 0));
        titTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titTotal.setText("TOTAL");
        titTotal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(titTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, 80, 50));

        registroVentas.setBackground(new java.awt.Color(51, 255, 0));
        registroVentas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        registroVentas.setForeground(new java.awt.Color(0, 0, 0));
        registroVentas.setText("Registrar Venta");
        registroVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroVentasActionPerformed(evt);
            }
        });
        getContentPane().add(registroVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 380, 160, 110));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaDescripcionVenta.setBackground(new java.awt.Color(255, 255, 255));
        tablaDescripcionVenta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tablaDescripcionVenta.setForeground(new java.awt.Color(0, 0, 0));
        tablaDescripcionVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cant", "Detalle", "Tipo", "Precio Unitario", "Precio Total"
            }
        ));
        jScrollPane1.setViewportView(tablaDescripcionVenta);
        if (tablaDescripcionVenta.getColumnModel().getColumnCount() > 0) {
            tablaDescripcionVenta.getColumnModel().getColumn(0).setMaxWidth(55);
            tablaDescripcionVenta.getColumnModel().getColumn(1).setMaxWidth(280);
            tablaDescripcionVenta.getColumnModel().getColumn(2).setMaxWidth(200);
            tablaDescripcionVenta.getColumnModel().getColumn(3).setMaxWidth(180);
            tablaDescripcionVenta.getColumnModel().getColumn(4).setMaxWidth(180);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 420));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 630, 410));

        tipoPago.setBackground(new java.awt.Color(255, 255, 255));
        tipoPago.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tipoPago.setForeground(new java.awt.Color(0, 0, 0));
        tipoPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Efectivo", "Transferencia" }));
        tipoPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoPagoActionPerformed(evt);
            }
        });
        getContentPane().add(tipoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 300, 160, -1));

        titTipoPago.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        titTipoPago.setForeground(new java.awt.Color(0, 0, 0));
        titTipoPago.setText("Tipo de Pago:");
        getContentPane().add(titTipoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 260, 150, 20));

        jButtonLimpiar.setBackground(new java.awt.Color(204, 0, 0));
        jButtonLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 180, 160, 40));

        jBotonBuscar.setBackground(new java.awt.Color(0, 153, 204));
        jBotonBuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jBotonBuscar.setForeground(new java.awt.Color(0, 0, 0));
        jBotonBuscar.setText("Buscar");
        jBotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jBotonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 190, -1));

        jBotonAnadir.setBackground(new java.awt.Color(0, 153, 204));
        jBotonAnadir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jBotonAnadir.setForeground(new java.awt.Color(0, 0, 0));
        jBotonAnadir.setText("Añadir");
        jBotonAnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonAnadirActionPerformed(evt);
            }
        });
        getContentPane().add(jBotonAnadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 250, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Facturacion");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 200, -1));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("solo para uso de producto sin precio fijo o codigo de barra");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        jwallpaper.setBackground(new java.awt.Color(0, 0, 0));
        jwallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo4.jpg"))); // NOI18N
        getContentPane().add(jwallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Metodo para registrar una venta 
    private void registroVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroVentasActionPerformed
        control_Producto cont_p = new control_Producto();
        control_Ventas cont = new control_Ventas();

        try {
            double montoKiosco = 0;
            double montoComida = 0;
            double montoPanaderia = 0;
            double montoPostre = 0;
            double montoTotal = 0;

            // Recorrer la tabla para sumar los montos según el tipo de producto
            DefaultTableModel model = (DefaultTableModel) tablaDescripcionVenta.getModel();
            for (int i = 0; i < model.getRowCount(); i++) {
                int cantidad = Integer.parseInt(model.getValueAt(i, 0).toString()); //cantidad
                String tipoProducto = (String) model.getValueAt(i, 2);//tipo
                double precioProducto = Double.parseDouble(model.getValueAt(i, 3).toString());//precio

                double montoProducto = precioProducto * cantidad;

                switch (tipoProducto) {
                    case "Kiosco":
                        montoKiosco += montoProducto;
                        break;
                    case "Comida":
                        montoComida += montoProducto;
                        break;
                    case "Panaderia":
                        montoPanaderia += montoProducto;
                        break;
                    case "Postre":
                        montoPostre += montoProducto;
                        break;
                }

                montoTotal += montoProducto;
            }

            //formateo de datos
            String hora = java.time.LocalDateTime.now().toString();
            String detalle = (String) tipoPago.getSelectedItem();

            Modelo_Venta venta = cont.registrarVenta(montoKiosco, montoComida, montoPanaderia, montoPostre, montoTotal, hora, detalle);

            if (venta.getId() != 0) {
                JOptionPane.showMessageDialog(this, "Venta registrada con éxito");
                // Limpiar campos
                model.setRowCount(0);
                txtSubTotal.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Error al registrar la venta");

                model.setRowCount(0);
                txtSubTotal.setText("");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al registrar la venta");
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_registroVentasActionPerformed

    private void tipoPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoPagoActionPerformed
        // indica que tipo de pago realizo el cliente
    }//GEN-LAST:event_tipoPagoActionPerformed

    private void codigoBarraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoBarraActionPerformed
        buscarYAgregar();
    }//GEN-LAST:event_codigoBarraActionPerformed

    private void nombreProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreProductoActionPerformed

    }//GEN-LAST:event_nombreProductoActionPerformed

    private void txtSubTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSubTotalActionPerformed

    //metodo para limpiar o cancelar venta
    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        DefaultTableModel model = (DefaultTableModel) tablaDescripcionVenta.getModel();
        model.setRowCount(0);
        txtSubTotal.setText("");
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void txtPrecioProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioProductoActionPerformed

    //metodo de busqueda para casos particulares
    private void jBotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonBuscarActionPerformed
        Modelo_Producto pro = new Modelo_Producto();
        control_Producto cont = new control_Producto();

        if (codigoBarra.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Complete el codigo de barra");
            codigoBarra.setBackground(Color.red);
        } else {
            //recibe el valor ingresado x el usuario
            if (cont.existeProducto(codigoBarra.getText().trim())) {
                String codigo = codigoBarra.getText();
                nombreProducto.setText(cont.buscarProducto(codigo).getNombre());
//                PrecioActual.setText(String.valueOf(cont.buscarProducto(codigo).getPrecio_Actual()));

            } else {
                JOptionPane.showMessageDialog(null, "El producto seleccionado no existe");
            }
        }


    }//GEN-LAST:event_jBotonBuscarActionPerformed

    private void jBotonAnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonAnadirActionPerformed
        // Verifica si el producto ya está en la tabla
        DefaultTableModel model = (DefaultTableModel) tablaDescripcionVenta.getModel();
        control_Producto cont = new control_Producto();
        Modelo_Producto prod = cont.buscarProducto(codigoBarra.getText().trim());

        if (prod != null) {
            boolean productoExiste = false;

            // Verificar si el producto ya está en la tabla
            for (int i = 0; i < model.getRowCount(); i++) {
                String nombre = model.getValueAt(i, 2).toString();
                if (nombre.equals(prod.getNombre())) {
                    // Si el producto existe, actualizar el subtotal
                    double precio = Double.parseDouble(txtPrecioProducto.getText().trim());
                    model.setValueAt(precio, i, 4);
                    double subtotal = 1 * precio;
                    model.setValueAt(subtotal, i, 5);
                    productoExiste = true;
                    break;
                }
            }

            // Si el producto no existe en la tabla, agregarlo como una nueva fila
            if (!productoExiste) {
                int cantidad = 1;
                String nombre = prod.getNombre();
                String tipo = prod.getTipo();
                double precio = Double.parseDouble(txtPrecioProducto.getText().trim());

                double subtotal = cantidad * precio;
                model.addRow(new Object[]{cantidad, nombre, tipo, precio, subtotal});
            }

            // Limpiar campos después de agregar
            codigoBarra.setText("");
            nombreProducto.setText("");
            txtPrecioProducto.setText("");
            actualizarTotal();
        } else {
            JOptionPane.showMessageDialog(this, "El producto seleccionado no existe");
        }
    }//GEN-LAST:event_jBotonAnadirActionPerformed

    //metodo privado, actulizacion del monto total de venta
    private void actualizarTotal() {
        double total = 0.0;
        DefaultTableModel model = (DefaultTableModel) tablaDescripcionVenta.getModel();

        // Recorrer las filas de la tabla y sumar los subtotales
        for (int i = 0; i < model.getRowCount(); i++) {
            double subtotal = (double) model.getValueAt(i, 4); // 4 es el índice de la columna de subtotales
            total += subtotal;
        }

        // Actualizar el campo txtTotal con el valor calculado
        txtSubTotal.setText(String.valueOf(total));
    }

    // Método privado para búsqueda y agregado automático
    private void buscarYAgregar() {
        Modelo_Producto pro = new Modelo_Producto();
        control_Producto cont = new control_Producto();

        if (codigoBarra.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Complete el código de barra");
            codigoBarra.setBackground(Color.red);
        } else {
            String codigo = codigoBarra.getText().trim();
            if (cont.existeProducto(codigo)) {
                pro = cont.buscarProducto(codigo);
                nombreProducto.setText(pro.getNombre());
                txtPrecioProducto.setText("1");
                agregarProductoATabla(codigo);
            } else {
                JOptionPane.showMessageDialog(null, "El producto seleccionado no existe");
            }
        }
    }

    // Método privado para agregar el producto a la tabla automáticamente
    private void agregarProductoATabla(String codBarra) {
        control_Producto cont = new control_Producto();
        Modelo_Producto prod = cont.buscarProducto(codBarra);

        if (prod != null) {
            DefaultTableModel model = (DefaultTableModel) tablaDescripcionVenta.getModel();

            // Verificar si el producto ya existe en la tabla
            boolean productoExiste = false;
            for (int i = 0; i < model.getRowCount(); i++) {
                String nombre = model.getValueAt(i, 1).toString();
                if (nombre.equals(prod.getNombre())) {
                    // Si el producto existe, actualizar la cantidad y el subtotal
                    int cantidadActual = Integer.parseInt(model.getValueAt(i, 0).toString());
                    int cantidadNueva = cantidadActual + Integer.parseInt(txtPrecioProducto.getText().trim());
                    double precio = Double.parseDouble(model.getValueAt(i, 3).toString());
                    model.setValueAt(cantidadNueva, i, 0);
                    model.setValueAt(cantidadNueva * precio, i, 4);
                    productoExiste = true;
                    break;
                }
            }

            // Si el producto no existe, agregarlo como una nueva fila
            if (!productoExiste) {
                int cantidad = Integer.parseInt(txtPrecioProducto.getText().trim());
                String nombre = prod.getNombre();
                String tipo = prod.getTipo();
                double precio = prod.getPrecio_Actual();

                double subtotal = cantidad * precio;
                model.addRow(new Object[]{cantidad, nombre, tipo, precio, subtotal});
            }

            // Limpiar campos después de agregar
            codigoBarra.setText("");
            nombreProducto.setText("");
            txtPrecioProducto.setText("");
            actualizarTotal();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField codigoBarra;
    private javax.swing.JButton jBotonAnadir;
    private javax.swing.JButton jBotonBuscar;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jwallpaper;
    private javax.swing.JTextField nombreProducto;
    private javax.swing.JButton registroVentas;
    public static javax.swing.JTable tablaDescripcionVenta;
    private javax.swing.JComboBox<String> tipoPago;
    private javax.swing.JLabel titCant;
    private javax.swing.JLabel titCodigoBarra;
    private javax.swing.JLabel titProducto;
    private javax.swing.JLabel titTipoPago;
    private javax.swing.JLabel titTotal;
    private javax.swing.JTextField txtPrecioProducto;
    private javax.swing.JTextField txtSubTotal;
    // End of variables declaration//GEN-END:variables

}
