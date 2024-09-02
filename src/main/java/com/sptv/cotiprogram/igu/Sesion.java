package com.sptv.cotiprogram.igu;

import com.sptv.cotiprogram.igu.admin.Principal;
import com.sptv.cotiprogram.igu.operador.PrincipalOperador;
import com.sptv.cotiprogram.logica.Rol;
import com.sptv.cotiprogram.logica.Usuario;
import com.sptv.cotiprogram.persistencia.UsuarioJpaController;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.UIManager;


public class Sesion extends javax.swing.JFrame {
    private final UsuarioJpaController usuarioController;
    int xMouse , yMouse;
    
    public Sesion() {
        usuarioController = new UsuarioJpaController();
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        bg = new javax.swing.JPanel();
        logobg = new javax.swing.JLabel();
        jL = new javax.swing.JLabel();
        citybg = new javax.swing.JLabel();
        logoname = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        btnexit = new javax.swing.JPanel();
        txtexit = new javax.swing.JLabel();
        jlIniciosesison = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        jLusuario = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jlpass = new javax.swing.JLabel();
        jpass = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        btnentrar = new javax.swing.JPanel();
        jlsesion = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setForeground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logobg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logobg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sptv/cotiprogram/imagenes/bglogo.png"))); // NOI18N
        logobg.setPreferredSize(new java.awt.Dimension(600, 200));
        bg.add(logobg, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 40, 310, 390));

        jL.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jL.setForeground(new java.awt.Color(255, 255, 255));
        jL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL.setText("SISTEMA DE COTIZACION");
        bg.add(jL, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 450, 310, 20));

        citybg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sptv/cotiprogram/imagenes/storebg.png"))); // NOI18N
        citybg.setOpaque(true);
        bg.add(citybg, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 40, 310, 490));

        logoname.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        logoname.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sptv/cotiprogram/imagenes/logofavicon.png"))); // NOI18N
        logoname.setText("LOGO");
        logoname.setPreferredSize(new java.awt.Dimension(779, 300));
        bg.add(logoname, new org.netbeans.lib.awtextra.AbsoluteConstraints(-230, 40, 430, 120));

        header.setForeground(new java.awt.Color(51, 51, 51));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

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
                .addGap(0, 892, Short.MAX_VALUE)
                .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bg.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 40));

        jlIniciosesison.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jlIniciosesison.setText("Iniciar Sesión");
        bg.add(jlIniciosesison, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        txtusuario.setForeground(new java.awt.Color(204, 204, 204));
        txtusuario.setText("Ingrese su usuario");
        txtusuario.setBorder(null);
        txtusuario.setName("a"); // NOI18N
        txtusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtusuarioMousePressed(evt);
            }
        });
        bg.add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 430, 30));
        txtusuario.getAccessibleContext().setAccessibleName("");

        jLusuario.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLusuario.setText("USUARIO");
        bg.add(jLusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, 20));
        bg.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 430, 20));

        jlpass.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlpass.setText("CONTRASEÑA");
        bg.add(jlpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, 20));

        jpass.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jpass.setText("********");
        jpass.setToolTipText("");
        jpass.setBorder(null);
        jpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpassMousePressed(evt);
            }
        });
        bg.add(jpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 430, 30));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 430, 20));

        btnentrar.setBackground(new java.awt.Color(69, 140, 41));
        btnentrar.setForeground(new java.awt.Color(255, 255, 255));

        jlsesion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlsesion.setForeground(new java.awt.Color(255, 255, 255));
        jlsesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlsesion.setText("ENTRAR");
        jlsesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlsesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlsesionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlsesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlsesionMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnentrarLayout = new javax.swing.GroupLayout(btnentrar);
        btnentrar.setLayout(btnentrarLayout);
        btnentrarLayout.setHorizontalGroup(
            btnentrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlsesion, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        btnentrarLayout.setVerticalGroup(
            btnentrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnentrarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlsesion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bg.add(btnentrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 130, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtusuarioMousePressed(java.awt.event.MouseEvent evt) {                                        
       if(txtusuario.getText().equals("Ingrese su usuario")){
       txtusuario.setText("");
       txtusuario.setForeground(Color.black);
        }
       if(String.valueOf(jpass.getPassword()).isEmpty()){
       jpass.setText("********");
       jpass.setForeground(Color.gray);
       }
    }

    private void jpassMousePressed(java.awt.event.MouseEvent evt) {
        if(String.valueOf(jpass.getPassword()).equals("********")){
        jpass.setText("");
        jpass.setForeground(Color.black);
        }
        if(txtusuario.getText().isEmpty()){
        txtusuario.setText("Ingrese su usuario");
        txtusuario.setForeground(Color.gray);
        }
    }

    private void jlsesionMouseClicked(java.awt.event.MouseEvent evt) {
        String nombre = txtusuario.getText();
        String contrasena = String.valueOf(jpass.getPassword());
        
        UIManager.put("Button.background", new Color(0, 134, 190));
        UIManager.put("Button.foreground", Color.WHITE);
        UIManager.put("Button.select", new Color(0, 156, 223));
        UIManager.put("OptionPane.background", new Color(242,242,242));
        UIManager.put("Panel.background", new Color(242, 242, 242));
        UIManager.put("OptionPane.messageFont", new Font("Arial", Font.PLAIN, 14));
        UIManager.put("OptionPane.buttonFont", new Font("Arial", Font.BOLD, 12));
        
      
        Usuario usuario = usuarioController.findUsuarioByUsername(nombre);
        
        if(usuario != null && usuario.getContraseña().equals(contrasena)){
            for( Rol rol : usuario.getRol()){
                if(rol.getNombre().equals("Admin")){                  
                   javax.swing.JOptionPane.showMessageDialog(this, "Bienvenido Administrador", "Login Exitoso", 
                           javax.swing.JOptionPane.INFORMATION_MESSAGE,new ImageIcon(new ImageIcon(getClass().getResource("/com/sptv/cotiprogram/imagenes/check.png")).getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH)));
                   new Principal().setVisible(true);
                   this.dispose();
                   return;
                } else if(rol.getNombre().equals("Operador")){
                   javax.swing.JOptionPane.showMessageDialog(this, "Bienvenido Operador", "Login Exitoso",
                           javax.swing.JOptionPane.INFORMATION_MESSAGE,new ImageIcon(new ImageIcon(getClass().getResource("/com/sptv/cotiprogram/imagenes/check.png")).getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH)));
                   new PrincipalOperador().setVisible(false);
                   new pruebademenubar().setVisible(true);
                   this.dispose();
                   return;
                }
            }
        }else{
            javax.swing.JOptionPane.showMessageDialog(this, "Nombre de usuario o contraseña incorrectos ", "Error de Login",
                    javax.swing.JOptionPane.ERROR_MESSAGE,new ImageIcon(new ImageIcon(getClass().getResource("/com/sptv/cotiprogram/imagenes/info-alert.png")).getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH)));
        }
    }                                     

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_headerMouseDragged

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

    private void jlsesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlsesionMouseEntered
        btnentrar.setBackground(new Color(69,172,37));
    }//GEN-LAST:event_jlsesionMouseEntered

    private void jlsesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlsesionMouseExited
      btnentrar.setBackground(new Color(69,140,41));
    }//GEN-LAST:event_jlsesionMouseExited

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel btnentrar;
    private javax.swing.JPanel btnexit;
    private javax.swing.JLabel citybg;
    private javax.swing.JPanel header;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jL;
    private javax.swing.JLabel jLusuario;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel jlIniciosesison;
    private javax.swing.JLabel jlpass;
    private javax.swing.JLabel jlsesion;
    private javax.swing.JPasswordField jpass;
    private javax.swing.JLabel logobg;
    private javax.swing.JLabel logoname;
    private javax.swing.JLabel txtexit;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
