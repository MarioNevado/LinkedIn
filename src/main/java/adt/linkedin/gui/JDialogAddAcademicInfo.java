/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package adt.linkedin.gui;

import adt.linkedin.model.*;
import adt.linkedin.services.UserService;
import adt.linkedin.tools.Utils;
import java.time.LocalDate;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Mario Nevado
 */
public class JDialogAddAcademicInfo extends javax.swing.JDialog {

    private final UserService controller;
    private final User user;

    /**
     * Creates new form JDialogAddAcademicInfo
     *
     * @param controller haremos las modificaciones que tengan que ver con el
     * usuario con este parámetro.
     * @param user indica a qué usuario añadiremos la información académica
     * @param parent indica que posición debe tomar este JDialog
     * @param modal indica si es modal o no
     */
    public JDialogAddAcademicInfo(UserService controller, User user, java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(parent);
        this.controller = controller;
        this.user = user;
        initComboBox(this.jComboYearI);
        initComboBox(this.jComboYearF);
    }

    /**
     * Rellena los JComboBox que hacen referencia a los años disponibles.
     *
     * @param box elemento a rellenar
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
        jLabel1 = new javax.swing.JLabel();
        jTextFieldTitle = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldMeanScore = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboDayI = new javax.swing.JComboBox<>();
        jComboMonthI = new javax.swing.JComboBox<>();
        jComboYearI = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jComboMonthF = new javax.swing.JComboBox<>();
        jComboYearF = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jTextFieldInstitution = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jComboDayF = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setForeground(Utils.PURPLE);
        jLabel1.setText("Título:");

        jTextFieldTitle.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldTitle.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setForeground(Utils.PURPLE);
        jLabel4.setText("Nota Media");

        jTextFieldMeanScore.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setForeground(Utils.PURPLE);
        jLabel2.setText("Fecha de Inicio:");

        jComboDayI.setBackground(new java.awt.Color(0, 0, 0));
        jComboDayI.setForeground(Utils.PURPLE);
        jComboDayI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jComboMonthI.setBackground(new java.awt.Color(0, 0, 0));
        jComboMonthI.setForeground(Utils.PURPLE);
        jComboMonthI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        jComboYearI.setBackground(new java.awt.Color(0, 0, 0));
        jComboYearI.setForeground(Utils.PURPLE);

        jLabel3.setForeground(Utils.PURPLE);
        jLabel3.setText("Fecha de Fin:");

        jComboMonthF.setBackground(new java.awt.Color(0, 0, 0));
        jComboMonthF.setForeground(Utils.PURPLE);
        jComboMonthF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        jComboYearF.setBackground(new java.awt.Color(0, 0, 0));
        jComboYearF.setForeground(Utils.PURPLE);

        jButton1.setBackground(Utils.PURPLE);
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Añadir Información Académica");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextFieldInstitution.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldInstitution.setForeground(new java.awt.Color(255, 255, 255));

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

        jLabel5.setForeground(Utils.PURPLE);
        jLabel5.setText("Institución:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldTitle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldMeanScore, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboDayI, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboMonthI, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboYearI, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboDayF, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboMonthF, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboYearF, 0, 128, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldInstitution))))
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldMeanScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboDayI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboMonthI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboYearI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox1)
                            .addComponent(jComboDayF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboMonthF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboYearF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldInstitution, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
     * Habilita o deshabilita la fecha de finalicación en caso de que la
     * formación se esté cursando actualmente o no.
     *
     * @param evt nunca es usado
     */
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

    /**
     *
     * @return La fecha de inicio de la información en caso de que no haya
     * habido ningún problema.
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
     * Comprueba que la fecha de finalización es posterior a la fecha de inicio.
     *
     * @return la fecha de finalización si no se está cursando actualmente o no
     * se lanza ninguna excepción.
     */
    private LocalDate getEndDate() {
        try {
            Integer dayF, monthF, yearF;
            dayF = Integer.valueOf(this.jComboDayF.getSelectedItem().toString());
            monthF = Integer.valueOf(this.jComboMonthF.getSelectedItem().toString());
            yearF = Integer.valueOf(this.jComboYearF.getSelectedItem().toString());
            if (LocalDate.of(yearF, monthF, dayF).compareTo(LocalDate.now()) >= 1) {
                JOptionPane.showMessageDialog(null, "La fecha de finalización no puede ser posterior a la fecha actual", "Error en fechas", JOptionPane.ERROR_MESSAGE);
                return null;
            }
            return LocalDate.of(yearF, monthF, dayF);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    /**
     * Añade la información académica al usuario en función de los valores
     * introducidos, además también gestiona posibles excepciones.
     *
     * @param evt no es usado
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AcademicInfo info;
        float meanScore;
        LocalDate init, end;
        if (this.jTextFieldMeanScore.getText().matches(Utils.MEANSCORE_REGEX)) {
            if (this.jTextFieldMeanScore.getText().contains(",")) {
                this.jTextFieldMeanScore.setText(this.jTextFieldMeanScore.getText().replace(",", "."));
            }
            meanScore = Float.parseFloat(this.jTextFieldMeanScore.getText());
            init = getInitDate();
            if (init != null) {
                if (jCheckBox1.isSelected()) {
                    info = new AcademicInfo(this.jTextFieldTitle.getText(), new Institution(this.jTextFieldInstitution.getText()), meanScore, init);
                    controller.addAcademicInfo(user, info);
                    JOptionPane.showMessageDialog(null, "Información de dudosa veracidad añadida (llevas siendo nini desde los 16)", "ENHORABUENA", JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                } else {
                    end = getEndDate();
                    info = new AcademicInfo(this.jTextFieldTitle.getText(), new Institution(this.jTextFieldInstitution.getText()), meanScore, init, end);
                    if (end != null && init.compareTo(end) >= 1) {
                        JOptionPane.showMessageDialog(null, "¿Cómo vas a terminar algo antes de empezarlo?", "Error en fechas", JOptionPane.ERROR_MESSAGE);
                    } else if (end != null) {
                        controller.addAcademicInfo(user, info);
                        JOptionPane.showMessageDialog(null, "Información de dudosa veracidad añadida (llevas siendo nini desde los 16)", "ENHORABUENA", JOptionPane.INFORMATION_MESSAGE);
                        dispose();
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Eso no es un número", "ERROR", JOptionPane.ERROR_MESSAGE);
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
    private javax.swing.JTextField jTextFieldInstitution;
    private javax.swing.JTextField jTextFieldMeanScore;
    private javax.swing.JTextField jTextFieldTitle;
    // End of variables declaration//GEN-END:variables
}
