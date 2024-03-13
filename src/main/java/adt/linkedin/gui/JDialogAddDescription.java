/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package adt.linkedin.gui;

import adt.linkedin.model.Company;
import adt.linkedin.model.User;
import adt.linkedin.services.CompanyService;
import adt.linkedin.services.UserService;
import adt.linkedin.tools.Utils;
import javax.swing.JTextArea;

/**
 *
 * @author Mario Nevado
 */
public class JDialogAddDescription extends javax.swing.JDialog {
    
    private UserService controller = null;
    private User user = null;
    private CompanyService service = null;
    private Company company = null;
    private final JTextArea description;

    /**
     *
     * @param userController controlador con el que modificaremos los valores
     * del usuario en la base de datos
     * @param user usuario al que deberemos modificar
     * @param parent indica la posición que este Dialog deberá tomar
     * @param modal indica si es modal o no
     */
    public JDialogAddDescription(UserService userController, User user, java.awt.Frame parent, boolean modal, JTextArea description) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(parent);
        this.user = user;
        this.controller = userController;
        this.description = description;
    }

    public JDialogAddDescription(CompanyService companyService, Company company, java.awt.Frame parent, boolean modal, JTextArea description) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(parent);
        this.company = company;
        this.service = companyService;
        this.description = description;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setForeground(Utils.PURPLE);
        jLabel1.setText("Descripción:");

        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(jLabel1))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Actualiza la descripción del usuario o la empresa una vez pulsas Enter
     *
     * @param evt no es usado
     */
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        if (user != null) {
            this.user.setDescription(this.jTextField1.getText());
            this.jTextField1.setText("");
            this.controller.updateUser(user);
            this.description.setText(this.user.getDescription());
        }else{
            this.company.setDescription(this.jTextField1.getText());
            this.jTextField1.setText("");
            this.service.updateCompany(company);
            this.description.setText(this.company.getDescription());
        }
        dispose();
    }//GEN-LAST:event_jTextField1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
