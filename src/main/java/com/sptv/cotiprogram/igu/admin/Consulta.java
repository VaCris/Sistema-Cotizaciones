package com.sptv.cotiprogram.igu.admin;

import com.sptv.cotiprogram.logica.Cotizacion;
import com.sptv.cotiprogram.persistencia.CotizacionJpaController;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class Consulta extends javax.swing.JFrame {
    private CotizacionJpaController cotizacionController;

    public Consulta() {
        initComponents();
        cotizacionController = new CotizacionJpaController();
        cargarCotizaciones();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    private void cargarCotizaciones() {
        List<Cotizacion> cotizaciones = cotizacionController.findCotizacionEntities();
        DefaultTableModel model = (DefaultTableModel) jTCotiza.getModel();
        model.setRowCount(0);
        
        for (Cotizacion cotizacion : cotizaciones) {
            model.addRow(new Object[]{
                cotizacion.getId(),
                cotizacion.getCliente().getNombre(),
                cotizacion.getFecha(),
                cotizacion.getProductos().size()
            });
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTCoti = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTCotiza = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTCotiza.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Cliente", "Fecha", "Estado", "Productos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTCotiza);
        if (jTCotiza.getColumnModel().getColumnCount() > 0) {
            jTCotiza.getColumnModel().getColumn(0).setResizable(false);
            jTCotiza.getColumnModel().getColumn(1).setResizable(false);
            jTCotiza.getColumnModel().getColumn(2).setResizable(false);
            jTCotiza.getColumnModel().getColumn(3).setResizable(false);
            jTCotiza.getColumnModel().getColumn(4).setResizable(false);
            jTCotiza.getColumnModel().getColumn(4).setPreferredWidth(650);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 945, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Consulta Cotizacion");

        jButton2.setText("Modificar");

        jButton1.setText("Eliminar");

        btnConsultar.setText("jButton3");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jTCotiLayout = new javax.swing.GroupLayout(jTCoti);
        jTCoti.setLayout(jTCotiLayout);
        jTCotiLayout.setHorizontalGroup(
            jTCotiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTCotiLayout.createSequentialGroup()
                .addGroup(jTCotiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jTCotiLayout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addComponent(jLabel1)
                        .addGap(451, 451, 451)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jTCotiLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jTCotiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jTCotiLayout.createSequentialGroup()
                                .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 429, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(395, 395, 395))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jTCotiLayout.setVerticalGroup(
            jTCotiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTCotiLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jTCotiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jTCotiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTCoti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTCoti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        List<Cotizacion> cotizaciones = cotizacionController.findCotizacionEntities();
        DefaultTableModel model = (DefaultTableModel) jTCotiza.getModel();
        model.setRowCount(0);

        for (Cotizacion cotizacion : cotizaciones) {
            model.addRow(new Object[]{
                cotizacion.getId(),
                cotizacion.getCliente().getNombre(),
                cotizacion.getFecha(),
                cotizacion.getProductos().size(),
                cotizacion.getEstado()
            });
        }
    }//GEN-LAST:event_btnConsultarActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jTCoti;
    private javax.swing.JTable jTCotiza;
    // End of variables declaration//GEN-END:variables
}
