package com.sptv.cotiprogram.igu.admin;

import com.sptv.cotiprogram.logica.Cliente;
import com.sptv.cotiprogram.logica.Controladora;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ferux
 */
public class RegistrarCliente extends javax.swing.JFrame {
    
    Controladora control = new Controladora();
    private static final List<Cliente> clientes = new ArrayList<>();
    
    public RegistrarCliente(Principal aThis, boolean par) {
        initComponents();
        setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        txtelefono = new javax.swing.JTextField();
        txtruc = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(414, 371));

        titulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        titulo.setText("Registro de Cliente");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Nombre Completo");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Direccion");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Telefono");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Ruc");

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(titulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(txtdireccion)
                            .addComponent(txtnombre)
                            .addComponent(txtelefono)
                            .addComponent(txtruc, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE))))
                .addContainerGap(190, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(titulo)
                .addGap(8, 8, 8)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(4, 4, 4)
                .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtruc, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        int id = 0;
        String nombre = txtnombre.getText();
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
            clientes.add(cliente);
            JOptionPane.showMessageDialog(this, "Cliente registrado");
            txtnombre.setText("");
            txtdireccion.setText("");
            txtelefono.setText("");
            txtruc.setText("");
        }
           
    }//GEN-LAST:event_btnRegistrarActionPerformed
    public static List<Cliente> getClientes() {
        return clientes;
    }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtelefono;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtruc;
    // End of variables declaration//GEN-END:variables
}
