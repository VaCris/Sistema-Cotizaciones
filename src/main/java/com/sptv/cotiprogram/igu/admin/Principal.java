package com.sptv.cotiprogram.igu.admin;


import java.awt.Color;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        setExtendedState(getExtendedState() | MAXIMIZED_BOTH);
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnRegistroCoti = new javax.swing.JButton();
        btnConsulta = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        header = new javax.swing.JPanel();
        btnexit = new javax.swing.JPanel();
        txtexit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        jPanel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegistroCoti.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnRegistroCoti.setText("Cotizar");
        btnRegistroCoti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroCotiActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistroCoti, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 151, 60));

        btnConsulta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnConsulta.setText("Consulta");
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 151, 60));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Productos");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 148, 60));

        jButton2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton2.setText("Usuario");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 152, 60));

        header.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
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
                .addContainerGap(982, Short.MAX_VALUE)
                .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistroCotiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroCotiActionPerformed
        RegistrarCotizacion coti = new RegistrarCotizacion();
        coti.setVisible(true);
        coti.setLocationRelativeTo(null);        
    }//GEN-LAST:event_btnRegistroCotiActionPerformed

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        Consulta consu = new Consulta();
        consu.setVisible(true);
        consu.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnConsultaActionPerformed

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




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnRegistroCoti;
    private javax.swing.JPanel btnexit;
    private javax.swing.JPanel header;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtexit;
    // End of variables declaration//GEN-END:variables
}
