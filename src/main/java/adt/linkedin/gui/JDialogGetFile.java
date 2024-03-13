/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package adt.linkedin.gui;

import adt.linkedin.tools.Utils;
import java.io.FileFilter;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Mario Nevado
 */
public class JDialogGetFile extends javax.swing.JDialog {

    private final JDialogAddCandidature parent;
    private final boolean isCv;

    /**
     *
     * @param parent indica la posición de este dialog y guarda el fichero
     * seleccionado
     * @param modal indica si es modal o no
     * @param isCv indica si el fichero a seleccionar será su curriculum o su
     * carta de presentación
     */
    public JDialogGetFile(JDialogAddCandidature parent, boolean modal, boolean isCv) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(parent);
        this.parent = parent;
        this.isCv = isCv;
        this.jFileChooser1.setFileFilter(new FileNameExtensionFilter("Archivos en formato pdf", "pdf"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jFileChooser1.setBackground(new java.awt.Color(0, 0, 0));
        jFileChooser1.setForeground(Utils.PURPLE);
        jFileChooser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooser1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Una vez se ha seleccionado el archivo, lo guarda en su componente padre en función de si es un cv o una carta de 
     * presentación.
     * @param evt no es usado
     */
    private void jFileChooser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooser1ActionPerformed
        if (this.jFileChooser1.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            if (isCv) {
                parent.setCvFile(this.jFileChooser1.getSelectedFile());
            } else {
                parent.setClFile(this.jFileChooser1.getSelectedFile());
            }
            dispose();
        }
    }//GEN-LAST:event_jFileChooser1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser jFileChooser1;
    // End of variables declaration//GEN-END:variables
}
