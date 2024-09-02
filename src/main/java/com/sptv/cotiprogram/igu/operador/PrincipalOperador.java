package com.sptv.cotiprogram.igu.operador;

import java.awt.Color;

/**
 *
 * @author ferux
 */
public class PrincipalOperador extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalOperador
     */
    public PrincipalOperador() {
        initComponents();
        //setExtendedState(getExtendedState() | MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        btnexit = new javax.swing.JPanel();
        txtexit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

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
                .addGap(0, 1862, Short.MAX_VALUE)
                .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 500, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JPanel bg;
    private javax.swing.JPanel btnexit;
    private javax.swing.JPanel header;
    private javax.swing.JLabel txtexit;
    // End of variables declaration//GEN-END:variables
}
