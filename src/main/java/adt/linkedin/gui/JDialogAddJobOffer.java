/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package adt.linkedin.gui;

import adt.linkedin.enumerations.WorkDayType;
import adt.linkedin.model.Company;
import adt.linkedin.model.JobOffer;
import adt.linkedin.services.CompanyService;
import adt.linkedin.tools.Utils;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Mario Nevado
 */
public class JDialogAddJobOffer extends javax.swing.JDialog {

    private final Company company;
    private final CompanyService companyController = new CompanyService();

    /**
     * Creates new form JDialogAddAcademicInfo
     *
     * @param company hace referencia a la empresa que añadirá una oferta.
     * @param parent indica la posición de este Dialog
     * @param modal indica si es modal o no
     */
    public JDialogAddJobOffer(Company company, java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(parent);
        this.company = company;
        initComboBox(this.jComboWorkType);
        this.jSpinnerCandidates.setForeground(Utils.PURPLE);
        this.jSpinnerCandidates.setBackground(Color.BLACK);
    }

    /**
     * Rellena el combobox con los diferentes tipos de jornada.
     * @param box combobox a rellenar
     */
    private void initComboBox(JComboBox box) {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        for (WorkDayType type : WorkDayType.values()) {
            model.addElement(type.toString());
        }
        box.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldLocation = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldDetails = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldTitle = new javax.swing.JTextField();
        jTextFieldMinSalary = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldMaxSalary = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSpinnerCandidates = new javax.swing.JSpinner();
        jComboWorkType = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel4.setForeground(Utils.PURPLE);
        jLabel4.setText("Ciudad");

        jTextFieldLocation.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldLocation.setForeground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(Utils.PURPLE);
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Añadir Oferta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setForeground(Utils.PURPLE);
        jLabel5.setText("Detalles");

        jTextFieldDetails.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldDetails.setForeground(new java.awt.Color(255, 255, 255));

        jLabel6.setForeground(Utils.PURPLE);
        jLabel6.setText("Jornada");

        jLabel1.setForeground(Utils.PURPLE);
        jLabel1.setText("Titulo");

        jLabel7.setForeground(Utils.PURPLE);
        jLabel7.setText("Número de candidatos");

        jTextFieldTitle.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldTitle.setForeground(new java.awt.Color(255, 255, 255));

        jTextFieldMinSalary.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldMinSalary.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setForeground(Utils.PURPLE);
        jLabel2.setText("Salario Mínimo");

        jTextFieldMaxSalary.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldMaxSalary.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setForeground(Utils.PURPLE);
        jLabel3.setText("Salario Máximo");

        jComboWorkType.setBackground(new java.awt.Color(0, 0, 0));
        jComboWorkType.setForeground(Utils.PURPLE);

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
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldMinSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldMaxSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboWorkType, 0, 146, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinnerCandidates, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldDetails)
                        .addGap(12, 12, 12)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldMinSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldMaxSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboWorkType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jSpinnerCandidates, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTextFieldDetails))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Añade la oferta en función de los parámetros pasados por la empresa
     * @param evt no es usado
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JobOffer offer;
        try {
            String title = this.jTextFieldTitle.getText();
            String location = this.jTextFieldLocation.getText();
            int minSalary = Integer.parseInt(this.jTextFieldMinSalary.getText());
            int maxSalary = Integer.parseInt(this.jTextFieldMaxSalary.getText());
            WorkDayType type = WorkDayType.CONTRACT.getType(this.jComboWorkType.getSelectedIndex());
            int candidates = (int) jSpinnerCandidates.getValue();
            String details = this.jTextFieldDetails.getText();
            offer = new JobOffer(title, location);
            offer.setMinSalary(minSalary);
            offer.setMaxSalary(maxSalary);
            offer.setWorkDayType(type);
            offer.setRequiredCandidates(candidates);
            offer.setDetails(details);
            offer.setOpen(true);
            companyController.addJobOffer(company, offer);
            JOptionPane.showMessageDialog(null, "Has añadido una oferta con éxito :)", "Oferta añadida", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        } catch (NumberFormatException nbe) {
            JOptionPane.showMessageDialog(null, "Eso no es un número", "Error en campos numéricos", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboWorkType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinnerCandidates;
    private javax.swing.JTextField jTextFieldDetails;
    private javax.swing.JTextField jTextFieldLocation;
    private javax.swing.JTextField jTextFieldMaxSalary;
    private javax.swing.JTextField jTextFieldMinSalary;
    private javax.swing.JTextField jTextFieldTitle;
    // End of variables declaration//GEN-END:variables
}
