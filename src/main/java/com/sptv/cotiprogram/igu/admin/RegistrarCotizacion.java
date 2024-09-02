package com.sptv.cotiprogram.igu.admin;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;
import com.sptv.cotiprogram.logica.Controladora;
import com.sptv.cotiprogram.persistencia.CotizacionJpaController;
import com.sptv.cotiprogram.persistencia.ProductoJpaController;
import java.awt.Color;
import java.awt.HeadlessException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import com.sptv.cotiprogram.logica.Cliente;
import com.sptv.cotiprogram.logica.Cotizacion;
import com.sptv.cotiprogram.logica.Producto;
import java.awt.Desktop;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;
//import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;


public class RegistrarCotizacion extends javax.swing.JFrame {
    private final ProductoJpaController productoController;
    private final CotizacionJpaController cotizacionController;
    private static final List<Cliente> clientes = new ArrayList<>();
    Controladora control = new Controladora();
    //private JFrame Principal;
    
    
    public RegistrarCotizacion() {
        initComponents();
        //setExtendedState(getExtendedState() | MAXIMIZED_BOTH);
        productoController = new ProductoJpaController();
        cotizacionController = new CotizacionJpaController();
        txtBusquedaProducto.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                buscarProductos();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                buscarProductos();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                buscarProductos();
            }

            private void buscarProductos() {
            }
        });
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        txtelefono = new javax.swing.JTextField();
        txtruc = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTCotizacion = new javax.swing.JTable();
        email = new javax.swing.JLabel();
        numeros = new javax.swing.JLabel();
        txtcliente = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        txtBusquedaProducto = new javax.swing.JTextField();
        header = new javax.swing.JPanel();
        btnexit = new javax.swing.JPanel();
        txtexit = new javax.swing.JLabel();
        btnpdf = new javax.swing.JPanel();
        jlpdf = new javax.swing.JLabel();
        btnguardar = new javax.swing.JPanel();
        jlsave = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("COTIZACION");
        setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setPreferredSize(new java.awt.Dimension(414, 371));

        titulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        titulo.setText("Registro de Cotizacion");

        txtelefono.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtelefono.setBorder(javax.swing.BorderFactory.createTitledBorder("Número"));

        txtruc.setBorder(javax.swing.BorderFactory.createTitledBorder("RUC"));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setText("NOMBRE EMPRESA ********");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.darkGray));

        jTCotizacion.setAutoCreateRowSorter(true);
        jTCotizacion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTCotizacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Item", "Descripción", "Codigo", "Marca", "Cantidad", "V.Unit", "P.IGV", "Descuento", "V.Venta"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.Object.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, false, true, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTCotizacion.setColumnSelectionAllowed(true);
        jTCotizacion.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTCotizacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTCotizacionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTCotizacion);
        jTCotizacion.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jTCotizacion.getColumnModel().getColumnCount() > 0) {
            jTCotizacion.getColumnModel().getColumn(0).setResizable(false);
            jTCotizacion.getColumnModel().getColumn(1).setResizable(false);
            jTCotizacion.getColumnModel().getColumn(1).setPreferredWidth(650);
            jTCotizacion.getColumnModel().getColumn(2).setResizable(false);
            jTCotizacion.getColumnModel().getColumn(3).setResizable(false);
            jTCotizacion.getColumnModel().getColumn(4).setResizable(false);
            jTCotizacion.getColumnModel().getColumn(5).setResizable(false);
            jTCotizacion.getColumnModel().getColumn(6).setResizable(false);
            jTCotizacion.getColumnModel().getColumn(7).setResizable(false);
            jTCotizacion.getColumnModel().getColumn(8).setResizable(false);
        }
        jTCotizacion.getAccessibleContext().setAccessibleName("\"INTILUZ\"");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        email.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        email.setText("CORREOEMPRESA@.COM");

        numeros.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        numeros.setText("NUMERO EMPRESA +01 | +51");

        txtcliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtcliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"));

        txtdireccion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtdireccion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Direccion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N

        txtBusquedaProducto.setBorder(null);

        header.setPreferredSize(new java.awt.Dimension(1920, 40));

        txtexit.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtexit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtexit.setText("X");
        txtexit.setToolTipText("");
        txtexit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtexit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtexitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtexitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtexitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnexitLayout = new javax.swing.GroupLayout(btnexit);
        btnexit.setLayout(btnexitLayout);
        btnexitLayout.setHorizontalGroup(
            btnexitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtexit, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
        );
        btnexitLayout.setVerticalGroup(
            btnexitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnexitLayout.createSequentialGroup()
                .addComponent(txtexit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnpdf.setBackground(new java.awt.Color(69, 140, 41));
        btnpdf.setForeground(new java.awt.Color(255, 255, 255));

        jlpdf.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlpdf.setForeground(new java.awt.Color(255, 255, 255));
        jlpdf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlpdf.setText("PDF");
        jlpdf.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlpdf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlpdfMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlpdfMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlpdfMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnpdfLayout = new javax.swing.GroupLayout(btnpdf);
        btnpdf.setLayout(btnpdfLayout);
        btnpdfLayout.setHorizontalGroup(
            btnpdfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
            .addGroup(btnpdfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jlpdf, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
        );
        btnpdfLayout.setVerticalGroup(
            btnpdfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
            .addGroup(btnpdfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jlpdf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE))
        );

        btnguardar.setBackground(new java.awt.Color(69, 140, 41));
        btnguardar.setForeground(new java.awt.Color(255, 255, 255));

        jlsave.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlsave.setForeground(new java.awt.Color(255, 255, 255));
        jlsave.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlsave.setText("GUARDAR");
        jlsave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlsave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlsaveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlsaveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlsaveMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnguardarLayout = new javax.swing.GroupLayout(btnguardar);
        btnguardar.setLayout(btnguardarLayout);
        btnguardarLayout.setHorizontalGroup(
            btnguardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 142, Short.MAX_VALUE)
            .addGroup(btnguardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jlsave, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
        );
        btnguardarLayout.setVerticalGroup(
            btnguardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
            .addGroup(btnguardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jlsave, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnpdf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                                        .addComponent(numeros, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(63, 63, 63))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                                        .addComponent(email)
                                        .addGap(86, 86, 86)))
                                .addGap(21, 21, 21))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtruc, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, Short.MAX_VALUE)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addComponent(txtBusquedaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 573, Short.MAX_VALUE))
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(titulo)
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addGap(18, 18, 18))
            .addComponent(header, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1453, Short.MAX_VALUE)
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addComponent(txtBusquedaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                                .addComponent(txtcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(email)
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(33, 33, 33)))
                                .addComponent(numeros)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtruc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnpdf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 1453, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 864, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1453, 863));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 
       private void limpiarCampos() {
        txtcliente.setText("");
        txtdireccion.setText("");
        txtelefono.setText("");
        txtruc.setText("");
        DefaultTableModel model = (DefaultTableModel) jTCotizacion.getModel();
        model.setRowCount(0);
    }
    
    public static List<Cliente> getClientes() {
        return clientes;
    }    
    private void jTCotizacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTCotizacionMouseClicked
        int filaSeleccionada = jTCotizacion.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTCotizacion.getModel();
        String descripcion = (String) model.getValueAt(filaSeleccionada, 1);
        completarProductoEnFila(filaSeleccionada, descripcion);
    }//GEN-LAST:event_jTCotizacionMouseClicked
    private void completarProductoEnFila(int row, String descripcion) {
        
        List<Producto> productos = productoController.findProductosByName(descripcion);
        

        if (!productos.isEmpty()) {
            Producto producto = productos.get(txtBusquedaProducto.CENTER);
            DefaultTableModel model = (DefaultTableModel) jTCotizacion.getModel();
            int rowCount = jTCotizacion.getRowCount();
            double igv = 1.18;
            
            for (int i = 0; i < rowCount; i++) {         
             model.setValueAt(i + 1, i, 0); 
            }
            
            model.addRow(new Object[rowCount + 1]);
            jTCotizacion.setValueAt(producto.getDescripcion(), row, 1); 
            jTCotizacion.setValueAt(producto.getCodigo(), row, 2); 
            jTCotizacion.setValueAt(producto.getMarca(), row, 3); 
            jTCotizacion.setValueAt(producto.getCantidad(), row, 4); 
            jTCotizacion.setValueAt(producto.getPunitSinIGV(), row, 5); 
            jTCotizacion.setValueAt(producto.getPunitSinIGV()* igv, row, 6); 
            jTCotizacion.setValueAt(0.0, row, 7); 
            jTCotizacion.setValueAt(producto.getTotalSinIGV(), row, 8); 
       
        }
    }  
    private void txtexitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtexitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_txtexitMouseClicked

    private void txtexitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtexitMouseEntered
        btnexit.setBackground(Color.red);
        txtexit.setForeground(Color.white);
    }//GEN-LAST:event_txtexitMouseEntered

    private void txtexitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtexitMouseExited
        btnexit.setBackground(Color.white);
        txtexit.setForeground(Color.black);
    }//GEN-LAST:event_txtexitMouseExited

    private void jlsaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlsaveMouseClicked
        String nombre = txtcliente.getText();
        String direccion = txtdireccion.getText();
        String telefono = txtelefono.getText();
        String ruc = txtruc.getText();
        
        control.agregarCliente(nombre,direccion,telefono,ruc);
        
        if(nombre.isEmpty() || direccion.isEmpty() || telefono.isEmpty() || ruc.isEmpty()){
            JOptionPane.showMessageDialog(this, "Todos los campos deben ser llenados","Error",JOptionPane.ERROR_MESSAGE);
        }else if(!direccion.matches("^.*$")){
            JOptionPane.showMessageDialog(this, "La direccion es incorrecta ", "Error", JOptionPane.ERROR_MESSAGE);
        }else if(!telefono.matches("\\b(9\\d{8}|(01|02|04|05)\\d{6})\\b")){
            JOptionPane.showMessageDialog(this, "El telefono debe ser un numero valido (movil o fijo)", "Error", JOptionPane.ERROR_MESSAGE);
        }else if(!ruc.matches("\\d{11}")){
             JOptionPane.showMessageDialog(this, "El RUC debe contener solo 11 digitos", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            Cliente cliente = new Cliente(0,nombre,direccion,telefono,ruc);
                        
            try{
                clientes.add(cliente);
            }catch(Exception ex){
                JOptionPane.showMessageDialog(this, "Error al guardar los datos: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            Date fechaActual = new Date();
            Cotizacion cotizacion = new Cotizacion(0,0, fechaActual, 0.0, cliente, new ArrayList<>(), "Pendiente");


            for (int i = 0; i < jTCotizacion.getRowCount(); i++) {
            Producto producto = new Producto();
            producto.setDescripcion((String) jTCotizacion.getValueAt(i, 1));
            producto.setCodigo((String) jTCotizacion.getValueAt(i, 2));
            producto.setMarca((String) jTCotizacion.getValueAt(i, 3));
            producto.setCantidad((Integer) jTCotizacion.getValueAt(i, 4));
            producto.setPunitSinIGV((Double) jTCotizacion.getValueAt(i, 5));
            producto.setPunitConIGV((Double) jTCotizacion.getValueAt(i, 6));
            
            cotizacion.getProductos().add(producto);
        }

        try {
            cotizacionController.create(cotizacion);
            JOptionPane.showMessageDialog(this, "Cotización Registrada");
            limpiarCampos();
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(this, "Error al guardar la cotización: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
            
        }             
    }//GEN-LAST:event_jlsaveMouseClicked

    private void jlsaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlsaveMouseEntered
        btnguardar.setBackground(new Color(69,172,37));
    }//GEN-LAST:event_jlsaveMouseEntered

    private void jlsaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlsaveMouseExited
        btnguardar.setBackground(new Color(69,140,41));
    }//GEN-LAST:event_jlsaveMouseExited

    private void jlpdfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlpdfMouseClicked
        generarPdfCotizacion();  
    }//GEN-LAST:event_jlpdfMouseClicked

    private void jlpdfMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlpdfMouseEntered
        btnpdf.setBackground(new Color(69,172,37));
    }//GEN-LAST:event_jlpdfMouseEntered

    private void jlpdfMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlpdfMouseExited
        btnpdf.setBackground(new Color(69,140,41));
    }//GEN-LAST:event_jlpdfMouseExited
    
    public void generarPdfCotizacion() {
    String cliente = txtcliente.getText();
    String direccion = txtdireccion.getText();
    String numero = txtelefono.getText();
    String ruc = txtruc.getText();

    //vacio
    if (cliente.isEmpty() || direccion.isEmpty() || numero.isEmpty() || ruc.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos antes de generar el PDF.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        String home = System.getProperty("user.home");
        File salida = new File(home + File.separator +"Downloads"+File.separator + "cotizacion.pdf");
        //System.out.println("Ruta del archivo: " + salida.getAbsolutePath());
        FileOutputStream archivo = new FileOutputStream(salida);
        //System.out.println("Archivo creado exitosamente");
        Rectangle Us = new Rectangle(612, 792);
        Document doc = new Document(Us);
        PdfWriter.getInstance(doc, archivo);
        //System.out.println("Pdf inicia");
        doc.open();
        //System.out.println("abierto");    
        
        Font fontHeader = new Font(Font.FontFamily.TIMES_ROMAN, 16, Font.BOLD);
        Font fontSubHeader = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD);
        Font fontBody = new Font(Font.FontFamily.TIMES_ROMAN, 10, Font.NORMAL);
        Font fontTableHeader = new Font(Font.FontFamily.TIMES_ROMAN, 10, Font.BOLD);
        Font fontTableBody = new Font(Font.FontFamily.TIMES_ROMAN, 9, Font.NORMAL);
         
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss a");
        String fechaActual = now.format(format);
        
        
        //header principal
        PdfPTable encabezado = new PdfPTable(2);
        encabezado.setWidthPercentage(100);
        encabezado.getDefaultCell().setBorder(Rectangle.NO_BORDER);
        float[] columnWidthsEncabezado = new float[]{20f, 90f};
        encabezado.setWidths(columnWidthsEncabezado);

        //img
        try {
            Image img = Image.getInstance(getClass().getResource("/com/sptv/cotiprogram/imagenes/bglogo.png"));
            img.scaleAbsoluteWidth(100);
            img.scaleAbsoluteHeight(50);
            PdfPCell logoCell = new PdfPCell(img, true);
            logoCell.setBorder(Rectangle.NO_BORDER);
            encabezado.addCell(logoCell);
        } catch (BadElementException | IOException e) {
            encabezado.addCell("");  //celda vacia
        }

        //info empresa
        Paragraph infoEmpresa = new Paragraph("R.U.C.: 20514299669\nNombre: INTI LUZ\nTeléfono: 9873899287\nDirección: Calle .... ", fontBody);
        PdfPCell infoEmpresaCell = new PdfPCell(infoEmpresa);
        infoEmpresaCell.setBorder(Rectangle.NO_BORDER);
        encabezado.addCell(infoEmpresaCell);
        doc.add(encabezado);

        //info coti
        Paragraph infoCotizacion = new Paragraph("COTIZACION\n 000000000-00", fontSubHeader);
        infoCotizacion.setAlignment(Element.ALIGN_RIGHT);
        doc.add(infoCotizacion);

        //cliente
        
        PdfPTable clienteInfo = new PdfPTable(2);
        clienteInfo.setWidthPercentage(100);
        clienteInfo.setSpacingBefore(10f);
        float[] columnWidthsCliente = new float[]{50f, 50f};
        clienteInfo.setWidths(columnWidthsCliente);

        PdfPCell clienteCell = new PdfPCell(new Paragraph(
                "SEÑOR(RA): " + cliente + "\n" +
                        "DIRECCIÓN: " + direccion + "\n" +
                        "RUC: " + ruc + "\n" +
                        "COND. DE PAGO: CONTADO DEPOSITO\n" +
                        "CONTACTO: " + numero + "\nMOVIL: " + numero, fontBody
        ));
        clienteCell.setBorder(Rectangle.NO_BORDER);
        clienteCell.setPadding(4);
        clienteInfo.addCell(clienteCell);

        PdfPCell fechaCell = new PdfPCell(new Paragraph(
                "F. EMISIÓN: " + fechaActual + "\n" +
                "F. VENCIMIENTO: " + fechaActual + "\n" +
                "MONEDA: SOLES\n" +
                "VENDEDOR: @", fontBody
        ));
        fechaCell.setBorder(Rectangle.NO_BORDER);
        fechaCell.setPadding(1);
        clienteInfo.addCell(fechaCell);
        doc.add(clienteInfo);
            
        //header producto
        PdfPTable tabla = new PdfPTable(9);
        tabla.setWidthPercentage(100);
        tabla.setWidths(new float[]{20f, 150f, 25f, 20f, 20f, 20f, 20f, 30f,20f});
        String[] headers = {"Ítem", "Descripción", "Código", "Marca", "Cant.", "V.Unit.","P.IGV", "Descuento", "V.Venta"};
        for (String header : headers) {
            PdfPCell cell = new PdfPCell(new Phrase(header, fontTableHeader));
            cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
            tabla.addCell(cell);
        }
        
        double totalValorVenta = 0;
        double totalDescuentos = 0;
        double totalIGV = 0;
        double importeTotal = 0;
        
        //tabla y columna (corregido)
        for (int i = 0; i < jTCotizacion.getRowCount(); i++) {
                for (int j = 0; j < jTCotizacion.getColumnCount(); j++) {
                    Object value = jTCotizacion.getValueAt(i, j);
                    PdfPCell cell = new PdfPCell(new Phrase(value != null ? value.toString() : "",fontTableBody));
                    cell.setPadding(2);
                    tabla.addCell(cell);
                }
            }
        doc.add(tabla);
        
        // foo
        Paragraph footer = new Paragraph("SON: N Soles", fontBody);
        footer.setAlignment(Element.ALIGN_LEFT);
        footer.setSpacingBefore(10f);
        doc.add(footer);    
        
        //totalValorVenta +=producto.getTotalsinIGV();
        //totalDescuento 
        //totalIGV
        //importeTotal
        
        PdfPTable totales = new PdfPTable(2);
        totales.setWidthPercentage(100);
        totales.setSpacingBefore(10f);
        float[] columnWidthsTotales = new float[]{70f, 30f};
        totales.setWidths(columnWidthsTotales);
        
        totales.addCell(new PdfPCell(new Phrase("Total Valor Venta", fontTableHeader)));
        totales.addCell(new PdfPCell(new Phrase("S/.", fontTableBody)));
        totales.addCell(new PdfPCell(new Phrase("Total Descuentos", fontTableHeader)));
        totales.addCell(new PdfPCell(new Phrase("S/", fontTableBody)));
        totales.addCell(new PdfPCell(new Phrase("Total IGV", fontTableHeader)));
        totales.addCell(new PdfPCell(new Phrase("S/", fontTableBody)));
        totales.addCell(new PdfPCell(new Phrase("Importe Total", fontTableHeader)));
        totales.addCell(new PdfPCell(new Phrase("S/", fontTableBody)));

        doc.add(totales);
      
                
        doc.close();
        archivo.close();
        //System.out.println("Documento cerrado y archivo guardado");

        //open Zc
        Desktop.getDesktop().open(salida);
    } catch (DocumentException | IOException e) {
        JOptionPane.showMessageDialog(this, "Error al generar el PDF: " + e.getMessage(), "Error",
                    JOptionPane.ERROR_MESSAGE,new ImageIcon(new ImageIcon(getClass().getResource("/com/sptv/cotiprogram/imagenes/info-alert.png")).getImage().getScaledInstance(32, 32, java.awt.Image.SCALE_SMOOTH)));
        e.printStackTrace();
    }
}
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel btnexit;
    private javax.swing.JPanel btnguardar;
    private javax.swing.JPanel btnpdf;
    private javax.swing.JLabel email;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTCotizacion;
    private javax.swing.JLabel jlpdf;
    private javax.swing.JLabel jlsave;
    private javax.swing.JLabel numeros;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField txtBusquedaProducto;
    private javax.swing.JTextField txtcliente;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtelefono;
    private javax.swing.JLabel txtexit;
    private javax.swing.JTextField txtruc;
    // End of variables declaration//GEN-END:variables

    private EntityManager getEntityManager() {
        return null;
    }
}
