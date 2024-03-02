/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package adt.linkedin.gui;

import adt.linkedin.model.AcademicInfo;
import adt.linkedin.model.Institution;
import adt.linkedin.model.User;
import adt.linkedin.services.UserService;
import adt.linkedin.tools.Utils;
import java.time.LocalDate;
import java.time.Month;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author dev
 */
public class JDialogAddAcademicInfo extends javax.swing.JDialog {

    private UserService controller;
    private User user;

    /**
     * Creates new form JDialogAddAcademicInfo
     *
     * @param controller
     * @param user
     * @param parent
     * @param modal
     */
    public JDialogAddAcademicInfo(UserService controller, User user, java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.controller = controller;
        this.user = user;
        initComboBox(this.jComboYearI);
        initComboBox(this.jComboYearF);
    }

    private void initComboBox(JComboBox box) {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        for (Integer i = 2024; i >= 1900; i--) {
            model.addElement(i);
        }
        box.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextFieldTitle = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboDayI = new javax.swing.JComboBox<>();
        jComboMonthI = new javax.swing.JComboBox<>();
        jComboYearI = new javax.swing.JComboBox<>();
        jCheckBox1 = new javax.swing.JCheckBox();
        jComboDayF = new javax.swing.JComboBox<>();
        jComboMonthF = new javax.swing.JComboBox<>();
        jComboYearF = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldMeanScore = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldInstitution = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Título:");

        jLabel2.setText("Fecha de Inicio:");

        jLabel3.setText("Fecha de Fin:");

        jComboDayI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jComboMonthI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        jCheckBox1.setText("Actualmente");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jComboDayF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jComboMonthF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        jLabel4.setText("Nota Media");

        jButton1.setText("Añadir Información Académica");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Institución:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldTitle)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldMeanScore, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboDayI, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboMonthI, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboYearI, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboDayF, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboMonthF, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboYearF, 0, 128, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox1))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldInstitution)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldMeanScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboDayI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboMonthI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboYearI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jCheckBox1)
                    .addComponent(jComboDayF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboMonthF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboYearF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldInstitution, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        if (this.jCheckBox1.isSelected()) {
            this.jComboDayF.setEnabled(false);
            this.jComboMonthF.setEnabled(false);
            this.jComboYearF.setEnabled(false);
        } else {
            this.jComboDayF.setEnabled(true);
            this.jComboMonthF.setEnabled(true);
            this.jComboYearF.setEnabled(true);
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private LocalDate getInitDate() {
        try {
            Integer dayI, monthI, yearI;
            dayI = Integer.valueOf(this.jComboDayI.getSelectedItem().toString());
            monthI = Integer.valueOf(this.jComboMonthI.getSelectedItem().toString());
            yearI = Integer.valueOf(this.jComboYearI.getSelectedItem().toString());
            return LocalDate.of(yearI, monthI, dayI);
        } catch (NumberFormatException ex) {
            return null;
        }
    }

    private LocalDate getEndDate() {
        Integer dayF, monthF, yearF;
        dayF = Integer.valueOf(this.jComboDayF.getSelectedItem().toString());
        monthF = Integer.valueOf(this.jComboMonthF.getSelectedItem().toString());
        yearF = Integer.valueOf(this.jComboYearF.getSelectedItem().toString());
        if (LocalDate.of(yearF, monthF, dayF).compareTo(LocalDate.now()) >= 1) {
            JOptionPane.showMessageDialog(null, "La fecha de finalización no puede ser posterior a la fecha actual", "Error en fechas", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return LocalDate.of(yearF, monthF, dayF);

    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        AcademicInfo info;
        float meanScore;
        LocalDate init;
        LocalDate end = null;
            if (this.jTextFieldMeanScore.getText().matches(Utils.MEANSCORE_REGEX)) {
                if (this.jTextFieldMeanScore.getText().contains(",")) {
                    this.jTextFieldMeanScore.setText(this.jTextFieldMeanScore.getText().replace(",", "."));
                }
                meanScore = Float.parseFloat(this.jTextFieldMeanScore.getText());
                init = getInitDate();
                if (init != null) {
                    if (jCheckBox1.isSelected()) {
                        info = new AcademicInfo(this.jTextFieldTitle.getText(), new Institution(this.jTextFieldInstitution.getText()), meanScore, init);
                    } else {
                        end = getEndDate();
                        info = new AcademicInfo(this.jTextFieldTitle.getText(), new Institution(this.jTextFieldInstitution.getText()), meanScore, init, end);
                    }
                    if (end != null && init.compareTo(end) >= 1) {
                        JOptionPane.showMessageDialog(null, "La fecha de inicio no puede ser posterior a la fecha de fin", "Error en fechas", JOptionPane.ERROR_MESSAGE);
                    } else if (end != null) {
                        controller.addAcademicInfo(user, info);
                        JOptionPane.showMessageDialog(null, "Información añadida :))", "ENHORABUENA!!!", JOptionPane.INFORMATION_MESSAGE);
                        dispose();
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Eso no es un número", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboDayF;
    private javax.swing.JComboBox<String> jComboDayI;
    private javax.swing.JComboBox<String> jComboMonthF;
    private javax.swing.JComboBox<String> jComboMonthI;
    private javax.swing.JComboBox<String> jComboYearF;
    private javax.swing.JComboBox<String> jComboYearI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextFieldInstitution;
    private javax.swing.JTextField jTextFieldMeanScore;
    private javax.swing.JTextField jTextFieldTitle;
    // End of variables declaration//GEN-END:variables
}
