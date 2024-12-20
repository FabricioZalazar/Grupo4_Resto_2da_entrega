/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import Entidades.Detalle;
import Entidades.Mesa;
import Entidades.Pedido;
import Entidades.Producto;
import Persistencia.DetalleData;
import Persistencia.PedidoData;
import Persistencia.ProductoData;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fabricio Zalazar
 */
public class VistaCargarPedido extends javax.swing.JInternalFrame {
VistaPrincipal vista;
    private PedidoData ped = new PedidoData();
    private ProductoData con = new ProductoData();
    private DetalleData date = new DetalleData();
    private Mesa mesa;
    DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    };
    DefaultTableModel modelo2 = new DefaultTableModel() {
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    };

    public VistaCargarPedido(Mesa mesa ,VistaPrincipal vista) {
        this.mesa = mesa;
        this.vista=vista;
        initComponents();
        iniciarTablaProducto();
        llenarTablaProducto();
        iniciarTablaDetalle();
        llenarTablaDetalle();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProducto = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableDetalle = new javax.swing.JTable();
        btnCargar = new javax.swing.JButton();
        SpinnerCant = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        btnBorrar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(206, 202, 195));

        jLabel1.setFont(new java.awt.Font("SimSun-ExtB", 0, 18)); // NOI18N
        jLabel1.setText("Productos");

        tableProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProductoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableProducto);

        jLabel2.setFont(new java.awt.Font("SimSun-ExtB", 0, 18)); // NOI18N
        jLabel2.setText("Detalle");

        tableDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableDetalle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDetalleMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableDetalle);

        btnCargar.setBackground(new java.awt.Color(94, 202, 108));
        btnCargar.setText("Cargar");
        btnCargar.setEnabled(false);
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });

        jLabel3.setText("Cant :");

        btnBorrar.setBackground(new java.awt.Color(204, 0, 0));
        btnBorrar.setText("Borrar");
        btnBorrar.setEnabled(false);
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(226, 70, 70));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnCargar))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SpinnerCant, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(206, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(55, 55, 55))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnBorrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCargar)
                            .addComponent(btnBorrar))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(SpinnerCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                        .addComponent(btnSalir)
                        .addContainerGap())
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
 
        int filaSelecionada = tableProducto.getSelectedRow();
        String nombre = (String) tableProducto.getValueAt(filaSelecionada, 0);
        int cant = (int) SpinnerCant.getValue();
        if (cant > 0) {
             Producto p = con.buscarProductoPorNombre(nombre);
            if(cant<= p.getStock()){
           

            Detalle bandera = date.buscarDetallePorMesaYProducto(mesa.getNum(), p.getCodigo());
            
            if (bandera.getIdDetalle() == 0) {
                Detalle detalle = new Detalle(ped.buscarPedidoPorMesa(mesa.getNum()), p, cant);
                date.guardarDetalle(detalle);
                con.ActualizarProducto(new Producto(p.getCodigo(), p.getNombre(), (p.getStock() - cant), p.getPrecio()));
            } else {
                Detalle d = date.buscarDetallePorMesaYProducto(mesa.getNum(), p.getCodigo());

                if (cant > d.getCantidad()) {
                   
                    int diferencia = cant - d.getCantidad();
                    con.ActualizarProducto(new Producto(p.getCodigo(), p.getNombre(), (p.getStock() - diferencia), p.getPrecio()));
                } else if (cant < d.getCantidad()) {
                    
                    int diferencia = d.getCantidad() - cant;
                    con.ActualizarProducto(new Producto(p.getCodigo(), p.getNombre(), (p.getStock() + diferencia), p.getPrecio()));
                }

                Detalle detalle = new Detalle(d.getIdDetalle(), d.getPedido(), p, cant);
                date.actualizarDetalle(detalle);
                
            }
            }else{
                 JOptionPane.showMessageDialog(this, "Cantidad mayor al stock");
            }
        }else{
            JOptionPane.showMessageDialog(this, "Ingrese un numero valido");
        }
        vista.actualizarTabla();
        llenarTablaDetalle();
        llenarTablaProducto();
        btnCargar.setEnabled(false);
        btnBorrar.setEnabled(false);
    }//GEN-LAST:event_btnCargarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
       VistaPrincipal.setMesa(null);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        int filaSelecionada = tableDetalle.getSelectedRow();
        String nombre = (String) tableDetalle.getValueAt(filaSelecionada, 0);
        Producto p = con.buscarProductoPorNombre(nombre);
        Detalle d = date.buscarDetallePorMesaYProducto(mesa.getNum(), p.getCodigo());

        con.ActualizarProducto(new Producto(p.getCodigo(), p.getNombre(), (p.getStock() + d.getCantidad()), p.getPrecio()));
        date.borrarDetalle(d.getIdDetalle());
        vista.actualizarTabla();
        llenarTablaDetalle();
        llenarTablaProducto();
        btnCargar.setEnabled(false);
        btnBorrar.setEnabled(false);
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void tableDetalleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDetalleMouseClicked
        btnBorrar.setEnabled(true);
    }//GEN-LAST:event_tableDetalleMouseClicked

    private void tableProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProductoMouseClicked
        btnCargar.setEnabled(true);
    }//GEN-LAST:event_tableProductoMouseClicked

    public void iniciarTablaProducto() {
        modelo.addColumn("Nombre");
        modelo.addColumn("Stock");
        tableProducto.setModel(modelo);
    }

    public void llenarTablaProducto() {

        ArrayList<Producto> list = con.listaProductos();
        modelo.setRowCount(0);
        for (Producto p : list) {
            modelo.addRow(new Object[]{p.getNombre(), p.getStock()});
        }

    }

    public void iniciarTablaDetalle() {
        modelo2.addColumn("Nombre");
        modelo2.addColumn("Stock");
        tableDetalle.setModel(modelo2);
    }

    public void llenarTablaDetalle() {

        ArrayList<Detalle> list = date.listaDetallePorMesa(mesa.getNum());
        modelo2.setRowCount(0);
        for (Detalle d : list) {
            modelo2.addRow(new Object[]{d.getProducto().getNombre(), d.getCantidad()});
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner SpinnerCant;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableDetalle;
    private javax.swing.JTable tableProducto;
    // End of variables declaration//GEN-END:variables
}
