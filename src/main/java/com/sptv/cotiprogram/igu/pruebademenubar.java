
package com.sptv.cotiprogram.igu;


import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;


public class pruebademenubar extends javax.swing.JFrame {
    

    public pruebademenubar() {
        initComponents();
        customComponents();
        setLocationRelativeTo(null);
    }
    public final void customComponents(){
        JPanel Panel = new JPanel();
        Panel.setLayout(new BoxLayout(Panel, BoxLayout.Y_AXIS));
        Panel.setBackground(Color.LIGHT_GRAY);
        
        JButton btnDashboard = new JButton("Dashboard");
        JButton btnClientes = new JButton("Clientes");
        JButton btnProductos = new JButton("Productos");
        JButton btnCotizaciones = new JButton("Cotizaciones");
        
        Panel.add(btnDashboard);
        Panel.add(btnClientes);
        Panel.add(btnProductos);
        Panel.add(btnCotizaciones);
        
        JPanel mainPanel = new JPanel(new CardLayout());
        
        JPanel dashboardPanel = new JPanel();
        dashboardPanel.add(new JLabel("Bienvenido al Dashboard"));
        mainPanel.add(dashboardPanel, "Dashboard");

        JPanel clientesPanel = new JPanel();
        clientesPanel.add(new JLabel("Gestión de Clientes"));
        mainPanel.add(clientesPanel, "Clientes");

        JPanel productosPanel = new JPanel();
        productosPanel.add(new JLabel("Gestión de Productos"));
        mainPanel.add(productosPanel, "Productos");

        JPanel cotizacionesPanel = new JPanel();
        cotizacionesPanel.add(new JLabel("Gestión de Cotizaciones"));
        mainPanel.add(cotizacionesPanel, "Cotizaciones");
        
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, Panel, mainPanel);
        splitPane.setDividerLocation(200);
        add(splitPane);
        
        btnDashboard.addActionListener((ActionEvent e) -> {
            CardLayout cl = (CardLayout) (mainPanel.getLayout());
            cl.show(mainPanel, "Dashboard");
        });

        btnClientes.addActionListener((ActionEvent e) -> {
            CardLayout cl = (CardLayout) (mainPanel.getLayout());
            cl.show(mainPanel, "Clientes");
        });

        btnProductos.addActionListener((ActionEvent e) -> {
            CardLayout cl = (CardLayout) (mainPanel.getLayout());
            cl.show(mainPanel, "Productos");
        });

        btnCotizaciones.addActionListener((ActionEvent e) -> {
            CardLayout cl = (CardLayout) (mainPanel.getLayout());
            cl.show(mainPanel, "Cotizaciones");
        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        sidePanel = new javax.swing.JPanel();
        btnexit = new javax.swing.JPanel();
        txtexit = new javax.swing.JLabel();
        mainpanell = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        btnexit.setToolTipText("");

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
            .addComponent(txtexit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
        );
        btnexitLayout.setVerticalGroup(
            btnexitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnexitLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtexit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainpanellLayout = new javax.swing.GroupLayout(mainpanell);
        mainpanell.setLayout(mainpanellLayout);
        mainpanellLayout.setHorizontalGroup(
            mainpanellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 222, Short.MAX_VALUE)
        );
        mainpanellLayout.setVerticalGroup(
            mainpanellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 689, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(mainpanell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 737, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainpanell, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(bg, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtexitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtexitMouseExited
        btnexit.setBackground(Color.white);
        txtexit.setForeground(Color.black);
    }//GEN-LAST:event_txtexitMouseExited

    private void txtexitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtexitMouseEntered
        btnexit.setBackground(Color.red);
        txtexit.setForeground(Color.white);
    }//GEN-LAST:event_txtexitMouseEntered

    private void txtexitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtexitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_txtexitMouseClicked
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel btnexit;
    private javax.swing.JPanel mainpanell;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JLabel txtexit;
    // End of variables declaration//GEN-END:variables
}
