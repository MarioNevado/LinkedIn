/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package adt.linkedin.gui;

import adt.linkedin.model.*;
import adt.linkedin.services.CompanyService;
import adt.linkedin.services.UserService;
import adt.linkedin.tools.Utils;
import java.time.LocalDate;
import javax.swing.*;

/**
 *
 * @author Mario Nevado
 */
public class JDialogAddExperience extends javax.swing.JDialog {

    private final UserService controller;
    private final User user;
    private final CompanyService companyController = new CompanyService();

    /**
     * Creates new form JDialogAddAcademicInfo
     *
     * @param controller controlador con el que haremos todas las modificaciones
     * del usuario en la base de datos
     * @param user usuario a modificar
     * @param parent indica la posición de este Dialog
     * @param modal indica si es modal
     */
    public JDialogAddExperience(UserService controller, User user, java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(parent);
        this.controller = controller;
        this.user = user;
        initComboBox(this.jComboYearI);
        initComboBox(this.jComboYearF);
    }

    /**
     * Rellena el elemento con los años desde 2024 hasta 1900 de forma
     * descendente
     *
     * @param box JCombooBox a rellenar
     */
    private void initComboBox(JComboBox box) {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        for (Integer i = 2024; i >= 1900; i--) {
            model.addElement(i);
        }
        box.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jComboDayI = new javax.swing.JComboBox<>();
        jComboMonthI = new javax.swing.JComboBox<>();
        jComboYearI = new javax.swing.JComboBox<>();
        jCheckBox1 = new javax.swing.JCheckBox();
        jComboDayF = new javax.swing.JComboBox<>();
        jComboMonthF = new javax.swing.JComboBox<>();
        jComboYearF = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldTitle = new javax.swing.JTextField();
        jTextFieldLocation = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldCompany = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel3.setForeground(Utils.PURPLE);
        jLabel3.setText("Fecha de Fin:");

        jComboDayI.setBackground(new java.awt.Color(0, 0, 0));
        jComboDayI.setForeground(Utils.PURPLE);
        jComboDayI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jComboMonthI.setBackground(new java.awt.Color(0, 0, 0));
        jComboMonthI.setForeground(Utils.PURPLE);
        jComboMonthI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        jComboYearI.setBackground(new java.awt.Color(0, 0, 0));
        jComboYearI.setForeground(Utils.PURPLE);

        jCheckBox1.setBackground(new java.awt.Color(0, 0, 0));
        jCheckBox1.setForeground(Utils.PURPLE);
        jCheckBox1.setText("Actualmente");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jComboDayF.setBackground(new java.awt.Color(0, 0, 0));
        jComboDayF.setForeground(Utils.PURPLE);
        jComboDayF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jComboMonthF.setBackground(new java.awt.Color(0, 0, 0));
        jComboMonthF.setForeground(Utils.PURPLE);
        jComboMonthF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        jComboYearF.setBackground(new java.awt.Color(0, 0, 0));
        jComboYearF.setForeground(Utils.PURPLE);

        jLabel1.setForeground(Utils.PURPLE);
        jLabel1.setText("Puesto:");

        jLabel4.setForeground(Utils.PURPLE);
        jLabel4.setText("Ciudad");

        jTextFieldTitle.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldTitle.setForeground(new java.awt.Color(255, 255, 255));

        jTextFieldLocation.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldLocation.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setForeground(Utils.PURPLE);
        jLabel2.setText("Fecha de Inicio:");

        jButton1.setBackground(Utils.PURPLE);
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Añadir Experiencia Laboral");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setForeground(Utils.PURPLE);
        jLabel5.setText("Empresa:");

        jTextFieldCompany.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldCompany.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboDayI, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboMonthI, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboYearI, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldCompany))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboDayF, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboMonthF, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboYearF, 0, 144, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboDayI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboMonthI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboYearI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jCheckBox1)
                    .addComponent(jComboDayF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboMonthF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboYearF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldCompany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Habilita o deshabilita la fecha de finalización en función de si el
     * usuario sigue trabajando en ese puesto.
     *
     * @param evt no es usado
     */
    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
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

    /**
     *
     * @return La fecha de inicio en caso de que no haya saltado ninguna
     * excepción
     */
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

    /**
     * Comprueba que la decha de finalización es posterior a la fecha de inicio.
     *
     * @return La fecha de finalización en caso de que no haya saltado ninguna
     * excepción.
     */
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

    /**
     * Añade la experiencia laboral en función de los datos introducidos por el
     * usuario.
     *
     * @param evt no es usado
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        WorkExperience experience;
        LocalDate init, end = null;
        Company c;
        String temporalCompany = null;
        init = getInitDate();
        if (init != null) {
            c = companyController.getCompany(this.jTextFieldCompany.getText().trim());
            if (c == null) {
                temporalCompany = this.jTextFieldCompany.getText().trim();
            }
            if (jCheckBox1.isSelected()) {
                if (temporalCompany == null) {
                    experience = new WorkExperience(this.jTextFieldTitle.getText(), c, this.jTextFieldLocation.getText(), init);
                }else{
                    experience = new WorkExperience(this.jTextFieldTitle.getText(), temporalCompany, this.jTextFieldLocation.getText(), init);
                }
            } else {
                end = getEndDate();
                if (temporalCompany == null) {
                    experience = new WorkExperience(this.jTextFieldTitle.getText(), c, this.jTextFieldLocation.getText(), init, end);
                }else{
                    experience = new WorkExperience(this.jTextFieldTitle.getText(), temporalCompany, this.jTextFieldLocation.getText(), init, end);
                }
            }
            if (end != null && init.compareTo(end) >= 1) {
                JOptionPane.showMessageDialog(null, "¿Cómo vas a acabar algo antes de empezarlo?", "Error en fechas", JOptionPane.ERROR_MESSAGE);
            } else if (end != null) {
                controller.addJobExperience(user, experience);
                JOptionPane.showMessageDialog(null, "Experiencia de dudosa veracidad añadida (no has trabajado en tu vida)", "ENHORABUENA", JOptionPane.INFORMATION_MESSAGE);
                dispose();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed


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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldCompany;
    private javax.swing.JTextField jTextFieldLocation;
    private javax.swing.JTextField jTextFieldTitle;
    // End of variables declaration//GEN-END:variables
}
