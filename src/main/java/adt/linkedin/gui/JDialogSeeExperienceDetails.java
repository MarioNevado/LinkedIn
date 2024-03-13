/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package adt.linkedin.gui;

import adt.linkedin.model.User;
import adt.linkedin.model.WorkExperience;
import adt.linkedin.services.UserService;
import java.awt.Color;
import javax.swing.JTextArea;

/**
 *
 * @author Mario Nevado
 */
public class JDialogSeeExperienceDetails extends javax.swing.JDialog {
    
    private final WorkExperience experience;

    /**
     * Creates new form JDialogAddSkill
     * @param parent indica la posición de este Dialog
     * @param modal indica si es modal o no
     * @param experience hace referencia a la experiencia a consultar en detalle
     */
    public JDialogSeeExperienceDetails(java.awt.Frame parent, boolean modal, WorkExperience experience) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(parent);
        this.experience = experience;
        this.setBackground(Color.WHITE);
        initLabels();
        if(experience.isCurrent()){
            this.jTextAreaEnd.setText("Actualmente");
        }else{
            this.jTextAreaEnd.setText(experience.getEndDate().toString());
        }
    }
    
    /**
     * Inicializa los labels con la información de la experiencia laboral
     */
    private void initLabels(){
        this.jTextAreaName.setText(experience.getJobTitle());
        this.jTextAreaInstitution.setText(experience.getCompany().getName());
        this.jTextAreaMeanscore.setText(experience.getLocation());
        this.jTextAreaInit.setText(experience.getInitDate().toString());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextAreaEnd = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaName = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaInstitution = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaMeanscore = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextAreaInit = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Información Académica");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jScrollPane5.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane5.setBorder(null);
        jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane5.setAutoscrolls(true);

        jTextAreaEnd.setEditable(false);
        jTextAreaEnd.setBackground(this.jPanel1.getBackground());
        jTextAreaEnd.setColumns(20);
        jTextAreaEnd.setForeground(new java.awt.Color(255, 255, 255));
        jTextAreaEnd.setLineWrap(true);
        jTextAreaEnd.setRows(5);
        jTextAreaEnd.setAlignmentX(JTextArea.CENTER_ALIGNMENT);
        jTextAreaEnd.setAlignmentY(JTextArea.CENTER_ALIGNMENT);
        jTextAreaEnd.setBorder(null);
        jScrollPane5.setViewportView(jTextAreaEnd);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setAutoscrolls(true);

        jTextAreaName.setEditable(false);
        jTextAreaName.setBackground(this.jPanel1.getBackground());
        jTextAreaName.setColumns(20);
        jTextAreaName.setForeground(new java.awt.Color(255, 255, 255));
        jTextAreaName.setLineWrap(true);
        jTextAreaName.setRows(5);
        jTextAreaName.setAlignmentX(JTextArea.CENTER_ALIGNMENT);
        jTextAreaName.setAlignmentY(JTextArea.CENTER_ALIGNMENT);
        jTextAreaName.setBorder(null);
        jScrollPane1.setViewportView(jTextAreaName);

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(null);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane2.setAutoscrolls(true);

        jTextAreaInstitution.setEditable(false);
        jTextAreaInstitution.setBackground(this.jPanel1.getBackground());
        jTextAreaInstitution.setColumns(20);
        jTextAreaInstitution.setForeground(new java.awt.Color(255, 255, 255));
        jTextAreaInstitution.setLineWrap(true);
        jTextAreaInstitution.setRows(5);
        jTextAreaInstitution.setAlignmentX(JTextArea.CENTER_ALIGNMENT);
        jTextAreaInstitution.setAlignmentY(JTextArea.CENTER_ALIGNMENT);
        jTextAreaInstitution.setBorder(null);
        jScrollPane2.setViewportView(jTextAreaInstitution);

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setBorder(null);
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane3.setAutoscrolls(true);

        jTextAreaMeanscore.setEditable(false);
        jTextAreaMeanscore.setBackground(this.jPanel1.getBackground());
        jTextAreaMeanscore.setColumns(20);
        jTextAreaMeanscore.setForeground(new java.awt.Color(255, 255, 255));
        jTextAreaMeanscore.setLineWrap(true);
        jTextAreaMeanscore.setRows(5);
        jTextAreaMeanscore.setAlignmentX(JTextArea.CENTER_ALIGNMENT);
        jTextAreaMeanscore.setAlignmentY(JTextArea.CENTER_ALIGNMENT);
        jTextAreaMeanscore.setBorder(null);
        jScrollPane3.setViewportView(jTextAreaMeanscore);

        jScrollPane4.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setBorder(null);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane4.setAutoscrolls(true);

        jTextAreaInit.setEditable(false);
        jTextAreaInit.setBackground(this.jPanel1.getBackground());
        jTextAreaInit.setColumns(20);
        jTextAreaInit.setForeground(new java.awt.Color(255, 255, 255));
        jTextAreaInit.setLineWrap(true);
        jTextAreaInit.setRows(5);
        jTextAreaInit.setAlignmentX(JTextArea.CENTER_ALIGNMENT);
        jTextAreaInit.setAlignmentY(JTextArea.CENTER_ALIGNMENT);
        jTextAreaInit.setBorder(null);
        jScrollPane4.setViewportView(jTextAreaInit);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
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

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextAreaEnd;
    private javax.swing.JTextArea jTextAreaInit;
    private javax.swing.JTextArea jTextAreaInstitution;
    private javax.swing.JTextArea jTextAreaMeanscore;
    private javax.swing.JTextArea jTextAreaName;
    // End of variables declaration//GEN-END:variables
}
