/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package adt.linkedin.gui;

import adt.linkedin.model.JobOffer;
import adt.linkedin.model.User;
import adt.linkedin.services.JobOfferService;
import adt.linkedin.services.UserService;
import adt.linkedin.tools.Utils;
import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author Mario Nevado
 */
public class JDialogAddCandidature extends javax.swing.JDialog {

    private File cvFile;
    private File clFile;
    private final User user;
    private final UserService controller;
    private JobOffer offer;

    /**
     *
     * @param parent indica la posición que este Dialog deberá tomar respecto a
     * su padre.
     * @param modal indica si es modal o no.
     * @param user hace referencia al usuario que quiere añadir la candidatura.
     * @param controller controlador con el que realizaremos todas las
     * operaciones de modificación en la base de datos.
     * @param offer hace referencia a la oferta que quiere aplicar el usuario.
     */
    public JDialogAddCandidature(java.awt.Frame parent, boolean modal, User user, UserService controller, JobOffer offer) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(parent);
        this.user = user;
        this.controller = controller;
        this.offer = offer;
        this.cvFile = new File("");
        this.clFile = new File("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonCV = new javax.swing.JButton();
        jButtonCL = new javax.swing.JButton();
        jTextFieldCV = new javax.swing.JTextField();
        jTextFieldCL = new javax.swing.JTextField();
        jButtonAddCandidature = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setForeground(Utils.PURPLE);
        jLabel1.setText("CV:");

        jLabel2.setForeground(Utils.PURPLE);
        jLabel2.setText("Carta de presentación:");

        jButtonCV.setBackground(Utils.PURPLE);
        jButtonCV.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCV.setText("...");
        jButtonCV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCVActionPerformed(evt);
            }
        });

        jButtonCL.setBackground(Utils.PURPLE);
        jButtonCL.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCL.setText("...");
        jButtonCL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCLActionPerformed(evt);
            }
        });

        jTextFieldCV.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldCV.setForeground(new java.awt.Color(255, 255, 255));

        jTextFieldCL.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldCL.setForeground(new java.awt.Color(255, 255, 255));

        jButtonAddCandidature.setBackground(Utils.PURPLE);
        jButtonAddCandidature.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAddCandidature.setText("Añadir candidatura");
        jButtonAddCandidature.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddCandidatureActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonAddCandidature, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldCV)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCV))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldCL, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCL)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButtonCV)
                    .addComponent(jTextFieldCV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jButtonCL)
                    .addComponent(jTextFieldCL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAddCandidature)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
     * Obtiene el curriculum abriendo un selector de archivos.
     *
     * @param evt no es usado
     */
    private void jButtonCVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCVActionPerformed
        new JDialogGetFile(this, true, true).setVisible(true);
        this.jTextFieldCV.setText(cvFile.getName());
    }//GEN-LAST:event_jButtonCVActionPerformed

    /**
     * Añade la candidatura
     * @param evt no es usado
     */
    private void jButtonAddCandidatureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddCandidatureActionPerformed
        offer = new JobOfferService().getOffer(offer.getId());
        controller.addCandidature(user, offer, this.cvFile.getName(), this.clFile.getName());
        JOptionPane.showMessageDialog(null, "Has aplicado a esta oferta con éxito, ahora solo te falta no ser un deshecho social",
                "Enhorabuena", JOptionPane.INFORMATION_MESSAGE);
        dispose();
    }//GEN-LAST:event_jButtonAddCandidatureActionPerformed

    /**
     * Obtiene la carta de presentación abriendo un selector de archivos.
     * @param evt no es usado
     */
    private void jButtonCLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCLActionPerformed
        // TODO add your handling code here:
        new JDialogGetFile(this, true, false).setVisible(true);
        this.jTextFieldCL.setText(clFile.getName());
    }//GEN-LAST:event_jButtonCLActionPerformed

    /**
     * Actualiza el valor del fichero por el curriculum seleccionado
     * @param file curriculum seleccionado desde el selector de archivos. 
     */
    public void setCvFile(File file) {
        this.cvFile = file;
    }

    /**
     * Actualiza el valor del fichero por la carta de presentación seleccionada
     * @param file carta de presentación seleccionada desde el selector de archivos. 
     */
    public void setClFile(File file) {
        this.clFile = file;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddCandidature;
    private javax.swing.JButton jButtonCL;
    private javax.swing.JButton jButtonCV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldCL;
    private javax.swing.JTextField jTextFieldCV;
    // End of variables declaration//GEN-END:variables
}
