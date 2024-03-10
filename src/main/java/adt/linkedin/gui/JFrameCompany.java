/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package adt.linkedin.gui;

import adt.linkedin.model.*;
import adt.linkedin.services.CompanyService;
import adt.linkedin.services.JobOfferService;
import adt.linkedin.services.UserService;
import adt.linkedin.tools.Utils;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author dev
 */
public class JFrameCompany extends javax.swing.JFrame {

    final Company company;
    CompanyService companyController = new CompanyService();
    JobOfferService offerController = new JobOfferService();
    private final List<AcademicInfo> deletedInfo = new ArrayList<>();
    private final List<Skill> deletedSkills = new ArrayList<>();
    private final List<WorkExperience> deletedExperiences = new ArrayList<>();
    private final Timer timer = new Timer(3000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            refreshTable(jTableOffers, 1);
            refreshTable(jTableCandidatures, 2);
            initTable(jTableOffers);
            initTable(jTableCandidatures);
        }
    });

    /**
     * Creates new form User
     *
     * @param user gets the instance of the logged user
     * @param service tool to make all the queries
     */
    public JFrameCompany(Company user, CompanyService service) {
        this.company = user;
        this.companyController = service;
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        initComponents();
        this.jPanel1.setBounds(2, 2, JFrame.MAXIMIZED_HORIZ, JFrame.MAXIMIZED_VERT);
        fillTable(jTableOffers, 1);
        fillTable(jTableCandidatures, 2);
        this.jButtonHome.setBackground(Utils.PURPLE);
        timer.start();
        this.jLabelUserName.setText(this.company.getName());
        this.jTextAreaDescription.setText(this.company.getDescription());
        initTable(jTableOffers);
        initTable(jTableCandidatures);
    }

    private void initTable(JTable table) {
        DefaultTableCellRenderer header = new DefaultTableCellRenderer();
        header.setBackground(Utils.PURPLE);
        header.setForeground(Color.white);
        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setHeaderRenderer(header);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanelUser = new javax.swing.JPanel();
        jLabelUserPic = new javax.swing.JLabel();
        jLabelHeader = new javax.swing.JLabel();
        jLabelUserName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableOffers = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCandidatures = new javax.swing.JTable();
        jLabelLogOut = new javax.swing.JLabel();
        jLabelDelete = new javax.swing.JLabel();
        jButtonAddAI = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextAreaDescription = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(this.getPreferredSize());

        jPanelUser.setBackground(new java.awt.Color(255, 255, 255));
        jPanelUser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black));
        jPanelUser.setPreferredSize(this.jPanel1.getPreferredSize());
        jPanelUser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelUserPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/defaultpic.png"))); // NOI18N
        jLabelUserPic.setText("jLabel2");
        jLabelUserPic.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(153, 102, 255)));
        jLabelUserPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelUserPicMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelUserPicMouseEntered(evt);
            }
        });
        jPanelUser.add(jLabelUserPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 91, 91));

        jLabelHeader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/image.png"))); // NOI18N
        jPanelUser.add(jLabelHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 960, 90));

        jLabelUserName.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabelUserName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelUserName.setText("User");
        jPanelUser.add(jLabelUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 180, -1));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 102, 255), null));

        jTableOffers.setBackground(new java.awt.Color(0, 0, 0));
        jTableOffers.setForeground(new java.awt.Color(255, 255, 255));
        jTableOffers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Título", "Localización", "Abierta", "Salario", "Plazas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableOffers.setAutoscrolls(false);
        jTableOffers.setGridColor(new java.awt.Color(255, 255, 255));
        jTableOffers.setSelectionBackground(new java.awt.Color(153, 102, 255));
        jTableOffers.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jTableOffers.getTableHeader().setReorderingAllowed(false);
        jTableOffers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableOffersMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTableOffersMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(jTableOffers);
        if (jTableOffers.getColumnModel().getColumnCount() > 0) {
            jTableOffers.getColumnModel().getColumn(0).setResizable(false);
            jTableOffers.getColumnModel().getColumn(1).setResizable(false);
            jTableOffers.getColumnModel().getColumn(2).setResizable(false);
            jTableOffers.getColumnModel().getColumn(3).setResizable(false);
            jTableOffers.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanelUser.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 530, 190));

        jScrollPane2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 102, 255), null));

        jTableCandidatures.setBackground(new java.awt.Color(0, 0, 0));
        jTableCandidatures.setForeground(new java.awt.Color(255, 255, 255));
        jTableCandidatures.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Candidato", "Puesto", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableCandidatures.getTableHeader().setReorderingAllowed(false);
        jTableCandidatures.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCandidaturesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableCandidatures);
        if (jTableCandidatures.getColumnModel().getColumnCount() > 0) {
            jTableCandidatures.getColumnModel().getColumn(0).setResizable(false);
            jTableCandidatures.getColumnModel().getColumn(1).setResizable(false);
            jTableCandidatures.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanelUser.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 530, 220));

        jLabelLogOut.setText("Log Out");
        jLabelLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLogOutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelLogOutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelLogOutMouseExited(evt);
            }
        });
        jPanelUser.add(jLabelLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 760, 110, 40));

        jLabelDelete.setText("Delete Account");
        jLabelDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelDeleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelDeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelDeleteMouseExited(evt);
            }
        });
        jPanelUser.add(jLabelDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 720, 110, 40));

        jButtonAddAI.setBackground(Utils.PURPLE);
        jButtonAddAI.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAddAI.setText("+");
        jButtonAddAI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddAIActionPerformed(evt);
            }
        });
        jPanelUser.add(jButtonAddAI, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 110, -1, -1));

        jScrollPane4.setBorder(null);

        jTextAreaDescription.setEditable(false);
        jTextAreaDescription.setColumns(20);
        jTextAreaDescription.setLineWrap(true);
        jTextAreaDescription.setRows(5);
        jTextAreaDescription.setWrapStyleWord(true);
        jTextAreaDescription.setAlignmentX(Component.CENTER_ALIGNMENT);
        jTextAreaDescription.setBorder(null);
        jTextAreaDescription.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextAreaDescriptionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextAreaDescriptionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTextAreaDescriptionMouseExited(evt);
            }
        });
        jScrollPane4.setViewportView(jTextAreaDescription);

        jPanelUser.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 170, 180));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Link up.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelUser, javax.swing.GroupLayout.PREFERRED_SIZE, 796, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(705, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jPanelUser, javax.swing.GroupLayout.PREFERRED_SIZE, 868, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(195, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2000, 1080));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean containsValue(JTable table, Skill skill) {
        String value;
        if (deletedSkills.contains(skill)) {
            return true;
        }
        if (table.getRowCount() > 0 && table.getColumnCount() > 0) {
            for (int i = 0; i < table.getRowCount(); i++) {
                value = (String) table.getValueAt(i, 0);
                if (value != null && value.equals(skill.getName())) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean containsValue(JTable table, AcademicInfo info) { //title + "  " + institution.getName() + "  " + meanScore + "  " + initDate + "  " + endDate;
        Object[] value;
        AcademicInfo aux;
        if (deletedInfo.contains(info)) {
            return true;
        }
        if (table.getRowCount() > 0 && table.getColumnCount() > 0) {
            for (int i = 0; i < table.getRowCount(); i++) {
                value = new Object[5];
                if (table.getValueAt(i, 0) != null) {
                    for (int j = 0; j < table.getColumnCount(); j++) {
                        value[j] = table.getValueAt(i, j);
                    }
                    if (value[4] instanceof LocalDate) {
                        aux = new AcademicInfo((String) value[0], new Institution((String) value[1]), (float) value[2], (LocalDate) value[3], (LocalDate) value[4]);
                    } else {
                        aux = new AcademicInfo((String) value[0], new Institution((String) value[1]), (float) value[2], (LocalDate) value[3]);
                    }
                    if ((aux.equals(info))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean containsValue(JTable table, WorkExperience experience) {
        Object[] value;
        WorkExperience aux;
        if (deletedExperiences.contains(experience)) {
            return true;
        }
        if (table.getRowCount() > 0 && table.getColumnCount() > 0) {
            for (int i = 0; i < table.getRowCount(); i++) {
                value = new Object[5];
                if (table.getValueAt(i, 0) != null) {
                    for (int j = 0; j < table.getColumnCount(); j++) {
                        value[j] = table.getValueAt(i, j);
                    }
                    if (value[4] instanceof LocalDate) {
                        aux = new WorkExperience((String) value[0], companyController.getCompany((String) value[1]), (String) value[2], (LocalDate) value[3], (LocalDate) value[4]);
                    } else {
                        aux = new WorkExperience((String) value[0], companyController.getCompany((String) value[1]), (String) value[2], (LocalDate) value[3]);
                    }
                    if ((aux.equals(experience))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private void refreshTable(JTable table, int option) {
        DefaultTableModel model;
        model = new DefaultTableModel();

        switch (option) {
            case 1:
                model.addColumn("Título");
                model.addColumn("Localización");
                model.addColumn("Abierta");
                model.addColumn("Salario");
                model.addColumn("Plazas");
                break;
            case 2:
                model.addColumn("Candidato");
                model.addColumn("Puesto");
                model.addColumn("Estado");
                break;
            default:
                break;
        }
        table.setModel(model);
        initTable(table);
        fillTable(table, option);
    }

    private void fillOffers(DefaultTableModel model) {
        for (AcademicInfo info : userController.getUserAcademicInfo(company)) {
            if (!containsValue(jTableOffers, info)) {
                if (info.getEndDate() != null) {
                    model.addRow(new Object[]{info.getTitle(), info.getInstitution().getName(), info.getMeanScore(), info.getInitDate(), info.getEndDate()});
                } else {
                    model.addRow(new Object[]{info.getTitle(), info.getInstitution().getName(), info.getMeanScore(), info.getInitDate(), "Actual"});
                }
            }
        }
    }

    private void fillCandidatures(DefaultTableModel model) {
        for (WorkExperience experience : userController.getUserLaboralExperience(company)) {
            if (!containsValue(jTableCandidatures, experience)) {
                if (experience.getEndDate() != null) {
                    model.addRow(new Object[]{experience.getJobTitle(), experience.getCompany().getName(), experience.getLocation(), experience.getInitDate(), experience.getEndDate()});
                } else {
                    model.addRow(new Object[]{experience.getJobTitle(), experience.getCompany().getName(), experience.getLocation(), experience.getInitDate(), "Actual"});
                }
            }
        }
    }

    private void fillTable(JTable table, int option) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        switch (option) {
            case 1:
                fillOffers(model);
                break;
            case 2:
                fillCandidatures(model);
                break;
            default:
                break;
        }
        table.setModel(model);
    }

    private void jLabelLogOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLogOutMouseEntered

        Utils.mouseEntered(this.jLabelLogOut);
    }//GEN-LAST:event_jLabelLogOutMouseEntered

    private void jLabelLogOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLogOutMouseExited
        Utils.mouseExited(this.jLabelLogOut);
    }//GEN-LAST:event_jLabelLogOutMouseExited

    private void jLabelLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLogOutMouseClicked
        String buttons[] = {"Salir", "Cancelar"};
        int option = JOptionPane.showOptionDialog(this, "¿Realmente desea cerrar la sesión?", "Cierre de sesión",
                0, 0, null, buttons, this);
        if (option == JOptionPane.YES_OPTION) {
            new LogIn().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jLabelLogOutMouseClicked

    private void jButtonAddAIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddAIActionPerformed
        new JDialogAddAcademicInfo(userController, company, this, true).setVisible(true);
    }//GEN-LAST:event_jButtonAddAIActionPerformed

    private void jTextAreaDescriptionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextAreaDescriptionMouseClicked
        new JDialogAddDescription(userController, company, this, true, this.jTextAreaDescription).setVisible(true);
    }//GEN-LAST:event_jTextAreaDescriptionMouseClicked

    private void jTextAreaDescriptionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextAreaDescriptionMouseEntered
        this.jTextAreaDescription.setToolTipText("Click para cambiar la descripción");
    }//GEN-LAST:event_jTextAreaDescriptionMouseEntered

    private void jTextAreaDescriptionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextAreaDescriptionMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextAreaDescriptionMouseExited

    private void jLabelDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDeleteMouseClicked
        String buttons[] = {"Eliminar cuenta", "Cancelar"};
        String confirmButtons[] = {"Cancelar", "SI"};
        int option = JOptionPane.showOptionDialog(this, "Esta acción es irreversible, piénsalo dos veces...", "Eliminar cuenta",
                0, 0, null, buttons, this);
        if (option == JOptionPane.YES_OPTION) {
            int confirmOption = JOptionPane.showOptionDialog(this, "¿Seguro que quieres borrar tu cuenta?",
                    "Eliminar cuenta", 0, 0, null, confirmButtons, this);
            if (confirmOption == JOptionPane.YES_OPTION) {
                this.companyController.removeCompany(company);
                new LogIn().setVisible(true);
                dispose();
            }
        }

    }//GEN-LAST:event_jLabelDeleteMouseClicked

    private void jLabelDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDeleteMouseEntered

        Utils.mouseEntered(jLabelDelete);
    }//GEN-LAST:event_jLabelDeleteMouseEntered

    private void jLabelDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDeleteMouseExited

        Utils.mouseExited(jLabelDelete);
    }//GEN-LAST:event_jLabelDeleteMouseExited

    private void jTableOffersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableOffersMouseClicked
        initTable(jTableOffers);
        int selectedRow = this.jTableOffers.getSelectedRow();
        if (SwingUtilities.isLeftMouseButton(evt)) {
            try {
                JPopupMenu pop = initPopup(selectedRow, 1);
                pop.show(evt.getComponent(), evt.getX(), evt.getY());
            } catch (NullPointerException nEx) {
                JOptionPane.showMessageDialog(null, "Error desconocido", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_jTableOffersMouseClicked

    private void jTableCandidaturesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCandidaturesMouseClicked
        int selectedRow = jTableCandidatures.getSelectedRow();
        if (SwingUtilities.isLeftMouseButton(evt)) {
            try {
                JPopupMenu pop = initPopup(selectedRow, 3);
                pop.show(evt.getComponent(), evt.getX(), evt.getY());
            } catch (NullPointerException nEx) {
                JOptionPane.showMessageDialog(null, "Error desconocido", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jTableCandidaturesMouseClicked

    private void jLabelUserPicMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelUserPicMouseEntered

        this.jLabelUserPic.setToolTipText("Click para cambiar foto de perfil");
    }//GEN-LAST:event_jLabelUserPicMouseEntered

    private void jLabelUserPicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelUserPicMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelUserPicMouseClicked

    private void jTableOffersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableOffersMouseEntered
        // TODO add your handling code here:
        initTable(jTableOffers);
    }//GEN-LAST:event_jTableOffersMouseEntered

    private JPopupMenu initPopup(int selectedRow, int option) {
        JPopupMenu pop = new JPopupMenu();
        JMenuItem delete = new JMenuItem("Eliminar oferta");
        JMenuItem close = new JMenuItem("Cerrar proceso de selección");
        getDeleteItem(delete, option, selectedRow);
        getCloseItem(close, option, selectedRow);
        switch (option) {
            case 1:
                pop.add(close);
                pop.add(delete);
                refreshTable(jTableOffers, option);
                break;
            case 2:
                pop.add(close);
                pop.add(delete);
                refreshTable(jTableCandidatures, option);
                break;
            default:
                break;
        }
        return pop;
    }

    private void getCloseItem(JMenuItem item, int option, int selectedRow) {
        if (option == 1) {
            item.addActionListener((ActionEvent e) -> {
                this.offerController.closeJobOffer(offer);
            });
        } else {
            item.addActionListener((ActionEvent e) -> {
                //aceptar candidatura
            });
        }
    }

    private void getDeleteItem(JMenuItem item, int option, int selectedRow) {

        switch (option) {
            case 1:
                item.addActionListener((ActionEvent e) -> {
                    deletedInfo.add(this.company.getAcademics().get(selectedRow));
                    this.company.getAcademics().remove(selectedRow);
                    this.userController.updateUser(company);
                });
                break;
            case 2:
                item.addActionListener((ActionEvent e) -> {
                    this.deletedSkills.add(this.company.getSkills().get(selectedRow));
                    this.company.getSkills().remove(selectedRow);
                    this.userController.updateUser(company);
                });
                break;
            default:
                item.addActionListener((ActionEvent e) -> {
                    deletedExperiences.add(this.company.getExperiences().get(selectedRow));
                    this.company.getExperiences().remove(selectedRow);
                    this.userController.updateUser(company);
                });
                break;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddAI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelDelete;
    private javax.swing.JLabel jLabelHeader;
    private javax.swing.JLabel jLabelLogOut;
    private javax.swing.JLabel jLabelUserName;
    private javax.swing.JLabel jLabelUserPic;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelUser;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTableCandidatures;
    private javax.swing.JTable jTableOffers;
    private javax.swing.JTextArea jTextAreaDescription;
    // End of variables declaration//GEN-END:variables
}
