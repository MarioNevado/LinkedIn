/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package adt.linkedin.gui;

import adt.linkedin.model.*;
import adt.linkedin.services.CompanyService;
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
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mario Nevado
 */
public class JFrameUser extends javax.swing.JFrame {

    final User user;
    final UserService userController;
    final CompanyService companyController = new CompanyService();
    private final List<AcademicInfo> deletedInfo = new ArrayList<>();
    private final List<Skill> deletedSkills = new ArrayList<>();
    private final List<WorkExperience> deletedExperiences = new ArrayList<>();
    private final Timer timer = new Timer(3000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            refreshTable(jTableAcademicInfo, 1);
            refreshTable(jTableSkills, 2);
            refreshTable(jTableExperience, 3);
            initTable(jTableSkills);
            initTable(jTableAcademicInfo);
            initTable(jTableExperience);
        }
    });

    /**
     * Inicializa y rellena las tablas, arranca el Trigger y establece la
     * información del usuario
     *
     * @param user obtiene el usuario loggeado
     * @param service herramienta para consultar y modificar la base de datos
     */
    public JFrameUser(User user, UserService service) {
        this.user = user;
        this.userController = service;
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        initComponents();
        this.jPanel1.setBounds(2, 2, JFrame.MAXIMIZED_HORIZ, JFrame.MAXIMIZED_VERT);
        initTable(jTableSkills);
        initTable(jTableAcademicInfo);
        initTable(jTableExperience);
        fillTable(jTableAcademicInfo, 1);
        fillTable(jTableSkills, 2);
        fillTable(jTableExperience, 3);
        this.jButtonHome.setBackground(Utils.PURPLE);
        timer.start();
        this.jLabelUserName.setText(this.user.getName());
        this.jTextAreaDescription.setText(this.user.getDescription());

    }

    /**
     * Da estilo a la tabla
     *
     * @param table tabla a editar
     */
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
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableSkills = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAcademicInfo = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableExperience = new javax.swing.JTable();
        jLabelLogOut = new javax.swing.JLabel();
        jLabelDelete = new javax.swing.JLabel();
        jButtonAddAI = new javax.swing.JButton();
        jButtonAddSkill = new javax.swing.JButton();
        jButtonAddExperience = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextAreaDescription = new javax.swing.JTextArea();
        jButtonHome = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(this.getPreferredSize());

        jPanelUser.setBackground(new java.awt.Color(255, 255, 255));
        jPanelUser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black));
        jPanelUser.setPreferredSize(this.jPanel1.getPreferredSize());
        jPanelUser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelUserPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/account_avatar_face_man_people_profile_user_icon_123197.png"))); // NOI18N
        jLabelUserPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelUserPicMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelUserPicMouseEntered(evt);
            }
        });
        jPanelUser.add(jLabelUserPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 100, 91));

        jLabelHeader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/image.png"))); // NOI18N
        jPanelUser.add(jLabelHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 960, 90));

        jLabelUserName.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabelUserName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelUserName.setText("User");
        jPanelUser.add(jLabelUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 180, -1));

        jScrollPane3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 102, 255), null));

        jTableSkills.setBackground(new java.awt.Color(0, 0, 0));
        jTableSkills.setForeground(new java.awt.Color(255, 255, 255));
        jTableSkills.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Habilidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableSkills.getTableHeader().setReorderingAllowed(false);
        jTableSkills.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableSkillsMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableSkills);
        if (jTableSkills.getColumnModel().getColumnCount() > 0) {
            jTableSkills.getColumnModel().getColumn(0).setResizable(false);
        }

        jPanelUser.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 530, 196));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 102, 255), null));

        jTableAcademicInfo.setBackground(new java.awt.Color(0, 0, 0));
        jTableAcademicInfo.setForeground(new java.awt.Color(255, 255, 255));
        jTableAcademicInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Título", "Centro", "Nota media", "Inicio", "Fin"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableAcademicInfo.setAutoscrolls(false);
        jTableAcademicInfo.setGridColor(new java.awt.Color(255, 255, 255));
        jTableAcademicInfo.setSelectionBackground(new java.awt.Color(153, 102, 255));
        jTableAcademicInfo.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jTableAcademicInfo.getTableHeader().setReorderingAllowed(false);
        jTableAcademicInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAcademicInfoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTableAcademicInfoMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAcademicInfo);
        if (jTableAcademicInfo.getColumnModel().getColumnCount() > 0) {
            jTableAcademicInfo.getColumnModel().getColumn(0).setResizable(false);
            jTableAcademicInfo.getColumnModel().getColumn(1).setResizable(false);
            jTableAcademicInfo.getColumnModel().getColumn(2).setResizable(false);
            jTableAcademicInfo.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanelUser.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 530, 190));

        jScrollPane2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 102, 255), null));

        jTableExperience.setBackground(new java.awt.Color(0, 0, 0));
        jTableExperience.setForeground(new java.awt.Color(255, 255, 255));
        jTableExperience.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Puesto", "Empresa", "Ciudad", "Inicio", "Fin"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableExperience.getTableHeader().setReorderingAllowed(false);
        jTableExperience.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableExperienceMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableExperience);
        if (jTableExperience.getColumnModel().getColumnCount() > 0) {
            jTableExperience.getColumnModel().getColumn(0).setResizable(false);
        }

        jPanelUser.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 510, 530, 220));

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
        jPanelUser.add(jLabelLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 110, 40));

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
        jPanelUser.add(jLabelDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 110, 40));

        jButtonAddAI.setBackground(Utils.PURPLE);
        jButtonAddAI.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAddAI.setText("+");
        jButtonAddAI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddAIActionPerformed(evt);
            }
        });
        jPanelUser.add(jButtonAddAI, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 100, -1, -1));

        jButtonAddSkill.setBackground(Utils.PURPLE);
        jButtonAddSkill.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAddSkill.setText("+");
        jButtonAddSkill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddSkillActionPerformed(evt);
            }
        });
        jPanelUser.add(jButtonAddSkill, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 300, -1, -1));

        jButtonAddExperience.setBackground(Utils.PURPLE);
        jButtonAddExperience.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAddExperience.setText("+");
        jButtonAddExperience.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddExperienceActionPerformed(evt);
            }
        });
        jPanelUser.add(jButtonAddExperience, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 510, -1, -1));

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

        jButtonHome.setBackground(Utils.PURPLE);
        jButtonHome.setForeground(new java.awt.Color(255, 255, 255));
        jButtonHome.setText("Home");
        jButtonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHomeActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/DefaultLogo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelUser, javax.swing.GroupLayout.PREFERRED_SIZE, 796, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonHome)
                .addContainerGap(811, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonHome)
                    .addComponent(jPanelUser, javax.swing.GroupLayout.PREFERRED_SIZE, 868, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(195, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2000, 1080));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Comprueba si la tabla contiene esa skill o esa skill ha sido eliminada
     *
     * @param table tabla a recorrer
     * @param skill skill a comprobar
     * @return false si la tabla no contiene esta skill y ésta no ha sido
     * eliminada, y true en caso contrario
     */
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

    /**
     * Comprueba si la tabla contiene esa información académico o ha sido
     * eliminada
     *
     * @param table tabla a recorrer
     * @param info información a comprobar
     * @return false si la tabla no contiene esta información y ésta no ha sido
     * eliminada, y true en caso contrario
     */
    private boolean containsValue(JTable table, AcademicInfo info) {
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

    /**
     * Comprueba si la tabla contiene esa experienci o si ha sido eliminada
     *
     * @param table tabla a recorrer
     * @param experience experiencia a comprobar
     * @return false si la tabla no contiene esta experiencia y ésta no ha sido
     * eliminada, y true en caso contrario
     */
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

    /**
     * Actualiza la tabla en función de la tabla que sea
     *
     * @param table tabla a actualizar
     * @param option será 1 si la tabla es de información académica, 2 si es de
     * habilidades, y 3 si es de experiencia laboral
     */
    private void refreshTable(JTable table, int option) {
        DefaultTableModel model;
        model = new DefaultTableModel();

        switch (option) {
            case 1:
                model.addColumn("Título");
                model.addColumn("Centro");
                model.addColumn("Nota Media");
                model.addColumn("Inicio");
                model.addColumn("Fin");
                break;
            case 2:
                model.addColumn("Habilidad");
                break;
            default:
                model.addColumn("Puesto");
                model.addColumn("Empresa");
                model.addColumn("Ciudad");
                model.addColumn("Inicio");
                model.addColumn("Fin");
                break;
        }
        table.setModel(model);
        initTable(table);
        fillTable(table, option);
    }

    /**
     * Rellena el modelo de la tabla con la información académica del usuario
     *
     * @param model modelo de la tabla
     */
    private void fillAcademicInfo(DefaultTableModel model) {
        for (AcademicInfo info : userController.getUserAcademicInfo(user)) {
            if (!containsValue(jTableAcademicInfo, info)) {
                if (info.getEndDate() != null) {
                    model.addRow(new Object[]{info.getTitle(), info.getInstitution().getName(), info.getMeanScore(), info.getInitDate(), info.getEndDate()});
                } else {
                    model.addRow(new Object[]{info.getTitle(), info.getInstitution().getName(), info.getMeanScore(), info.getInitDate(), "Actual"});
                }
            }
        }
    }

    /**
     * Rellena el modelo de la tabla con las habilidades del usuario
     *
     * @param model modelo de la tabla
     */
    private void fillSkills(DefaultTableModel model) {
        for (Skill skill : userController.getUserSkills(user)) {
            if (!containsValue(jTableSkills, skill)) {
                model.addRow(new String[]{skill.toString()});
            }
        }
    }

    /**
     * Rellena el modelo de la tabla con la experiencia laboral del usuario
     *
     * @param model modelo de la tabla
     */
    private void fillExperience(DefaultTableModel model) {
        for (WorkExperience experience : userController.getUserLaboralExperience(user)) {
            if (!containsValue(jTableExperience, experience)) {
                if (experience.getEndDate() != null) {
                    if (experience.getCompany() != null) {
                        model.addRow(new Object[]{experience.getJobTitle(), experience.getCompany().getName(), experience.getLocation(), experience.getInitDate(), experience.getEndDate()});
                    } else {
                        model.addRow(new Object[]{experience.getJobTitle(), experience.getTemporalCompany(), experience.getLocation(), experience.getInitDate(), experience.getEndDate()});
                    }

                } else {
                    if (experience.getCompany() != null) {
                        model.addRow(new Object[]{experience.getJobTitle(), experience.getCompany().getName(), experience.getLocation(), experience.getInitDate(), "Actual"});
                    }else{
                        model.addRow(new Object[]{experience.getJobTitle(), experience.getTemporalCompany(), experience.getLocation(), experience.getInitDate(), "Actual"});                        
                    }
                    
                }
            }
        }
    }

    /**
     * Llama a un método de relleno en función de la tabla que sea
     *
     * @param table tabla a rellenar
     * @param option será 1 si es de información académica, 2 si es de
     * habilidades y 3 si es de experienia laboral
     */
    private void fillTable(JTable table, int option) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        switch (option) {
            case 1: //AcademicInfo
                fillAcademicInfo(model);
                break;
            case 2: //Skills
                fillSkills(model);
                break;
            default: //Experience
                fillExperience(model);
                break;
        }
        table.setModel(model);
    }

    /**
     * Vuelve al feed principal del usuario
     *
     * @param evt no usado
     */
    private void jButtonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHomeActionPerformed
        new JFrameFeed(user, userController).setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonHomeActionPerformed

    /**
     * Pone el texto en negrita al acercar el ratón al label
     *
     * @param evt no usado
     */
    private void jLabelLogOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLogOutMouseEntered
        Utils.mouseEntered(this.jLabelLogOut);
    }//GEN-LAST:event_jLabelLogOutMouseEntered

    /**
     * Pone el texto en plano al alejar el ratón del label
     *
     * @param evt no usado
     */
    private void jLabelLogOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLogOutMouseExited
        Utils.mouseExited(this.jLabelLogOut);
    }//GEN-LAST:event_jLabelLogOutMouseExited

    /**
     * Abre un diálogo de confirmación al querer cerrar sesión
     *
     * @param evt no usado
     */
    private void jLabelLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLogOutMouseClicked
        String buttons[] = {"Salir", "Cancelar"};
        int option = JOptionPane.showOptionDialog(this, "¿Realmente desea cerrar la sesión?", "Cierre de sesión",
                0, 0, null, buttons, this);
        if (option == JOptionPane.YES_OPTION) {
            new JFrameLogIn().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jLabelLogOutMouseClicked

    /**
     * Abre un frame para añadir información académica al pulsar el botón
     *
     * @param evt no usado
     */
    private void jButtonAddAIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddAIActionPerformed
        new JDialogAddAcademicInfo(userController, user, this, true).setVisible(true);
    }//GEN-LAST:event_jButtonAddAIActionPerformed

    /**
     * Abre un frame para añadir skills al pulsar el botón
     *
     * @param evt no usado
     */
    private void jButtonAddSkillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddSkillActionPerformed
        new JDialogAddSkill(userController, user, this, true).setVisible(true);
    }//GEN-LAST:event_jButtonAddSkillActionPerformed

    /**
     * Abre un frame para modificar la descripción al pulsar sobre el label
     *
     * @param evt no usado
     */
    private void jTextAreaDescriptionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextAreaDescriptionMouseClicked
        new JDialogAddDescription(userController, user, this, true, this.jTextAreaDescription).setVisible(true);
    }//GEN-LAST:event_jTextAreaDescriptionMouseClicked

    /**
     * Al acercar el ratón al text area añade un cuadro de ayuda y cambia el
     * borde
     *
     * @param evt no usado
     */
    private void jTextAreaDescriptionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextAreaDescriptionMouseEntered
        this.jTextAreaDescription.setToolTipText("Click para cambiar la descripción");
        this.jTextAreaDescription.setBorder(new LineBorder(Utils.PURPLE));

    }//GEN-LAST:event_jTextAreaDescriptionMouseEntered

    /**
     * Al alejar el ratón del text area quita el borde
     *
     * @param evt no usado
     */
    private void jTextAreaDescriptionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextAreaDescriptionMouseExited
        // TODO add your handling code here:
        this.jTextAreaDescription.setBorder(null);
    }//GEN-LAST:event_jTextAreaDescriptionMouseExited

    /**
     * Muestra un diálogo de confirmación al pulsar sobre "Eliminar cuenta"
     *
     * @param evt no usado
     */
    private void jLabelDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDeleteMouseClicked
        String buttons[] = {"Eliminar cuenta", "Cancelar"};
        String confirmButtons[] = {"Cancelar", "SI"};
        int option = JOptionPane.showOptionDialog(this, "Esta acción es irreversible, piénsalo dos veces...", "Eliminar cuenta",
                0, 0, null, buttons, this);
        if (option == JOptionPane.YES_OPTION) {
            int confirmOption = JOptionPane.showOptionDialog(this, "¿Seguro que quieres borrar tu cuenta?",
                    "Eliminar cuenta", 0, 0, null, confirmButtons, this);
            if (confirmOption == JOptionPane.YES_OPTION) {
                this.userController.removeUser(user);
                new JFrameLogIn().setVisible(true);
                dispose();
            }
        }

    }//GEN-LAST:event_jLabelDeleteMouseClicked

    /**
     * Pone el texto en negrita al acercar el ratón a el
     *
     * @param evt no usado
     */
    private void jLabelDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDeleteMouseEntered
        Utils.mouseEntered(jLabelDelete);
    }//GEN-LAST:event_jLabelDeleteMouseEntered

    /**
     * Pone el texto en plano al alejar el ratón de el
     *
     * @param evt no usado
     */
    private void jLabelDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDeleteMouseExited
        Utils.mouseExited(jLabelDelete);
    }//GEN-LAST:event_jLabelDeleteMouseExited

    /**
     * Abre un menú con diferentes opciones
     *
     * @param evt no usado
     */
    private void jTableAcademicInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAcademicInfoMouseClicked
        initTable(jTableAcademicInfo);
        int selectedRow = this.jTableAcademicInfo.getSelectedRow();
        if (SwingUtilities.isLeftMouseButton(evt)) {
            try {
                JPopupMenu pop = initPopup(selectedRow, 1);
                pop.show(evt.getComponent(), evt.getX(), evt.getY());
            } catch (NullPointerException nEx) {
                JOptionPane.showMessageDialog(null, "Error desconocido", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_jTableAcademicInfoMouseClicked

    /**
     * Abre un menú con diferentes opciones
     *
     * @param evt no usado
     */
    private void jTableSkillsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableSkillsMouseClicked
        int selectedRow = jTableSkills.getSelectedRow();
        if (SwingUtilities.isLeftMouseButton(evt)) {
            try {
                JPopupMenu pop = initPopup(selectedRow, 2);
                pop.show(evt.getComponent(), evt.getX(), evt.getY());
            } catch (NullPointerException nEx) {
                JOptionPane.showMessageDialog(null, "Error desconocido", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jTableSkillsMouseClicked

    /**
     * Abre un menú con diferentes opciones
     *
     * @param evt no usado
     */
    private void jTableExperienceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableExperienceMouseClicked
        int selectedRow = jTableExperience.getSelectedRow();
        if (SwingUtilities.isLeftMouseButton(evt)) {
            try {
                JPopupMenu pop = initPopup(selectedRow, 3);
                pop.show(evt.getComponent(), evt.getX(), evt.getY());
            } catch (NullPointerException nEx) {
                JOptionPane.showMessageDialog(null, "Error desconocido", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jTableExperienceMouseClicked

    /**
     * Abre un frame para añadir experiencia laboral
     *
     * @param evt no usado
     */
    private void jButtonAddExperienceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddExperienceActionPerformed
        new JDialogAddExperience(userController, user, this, true).setVisible(true);
    }//GEN-LAST:event_jButtonAddExperienceActionPerformed

    private void jLabelUserPicMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelUserPicMouseEntered

    }//GEN-LAST:event_jLabelUserPicMouseEntered

    private void jLabelUserPicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelUserPicMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelUserPicMouseClicked

    private void jTableAcademicInfoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAcademicInfoMouseEntered
        initTable(jTableAcademicInfo);
    }//GEN-LAST:event_jTableAcademicInfoMouseEntered

    /**
     * Crea un menu con items funcionales en base a la table sobre la que se
     * pinche
     *
     * @param selectedRow hace referencia a la fila seleccionada
     * @param option varía en función de la tabla de la que se trate
     * @return un PopupMenu completamente funcional
     */
    private JPopupMenu initPopup(int selectedRow, int option) {
        JPopupMenu pop = new JPopupMenu();
        JMenuItem delete = new JMenuItem("Eliminar Información");
        JMenuItem change = new JMenuItem("Ver");
        getDeleteItem(delete, option, selectedRow);
        getDetailsItem(change, option, selectedRow);
        switch (option) {
            case 1:
                pop.add(change);
                pop.add(delete);
                refreshTable(jTableAcademicInfo, option);
                break;
            case 2:
                pop.add(delete);
                refreshTable(jTableSkills, option);
                break;
            default:
                pop.add(change);
                pop.add(delete);
                refreshTable(jTableExperience, option);
                break;
        }
        return pop;
    }

    /**
     * Obtiene el item y le añade funcionalidad según la tabla
     *
     * @param item item al que dar funcionalidad
     * @param option varía en función de la tabla de la que se trate
     * @param selectedRow hace referencia a la fila seleccionada
     */
    private void getDetailsItem(JMenuItem item, int option, int selectedRow) {
        if (option == 1) {
            item.addActionListener((ActionEvent e) -> {
                new JDialogSeeInfoDetails(this, true, user.getAcademics().get(selectedRow)).setVisible(true);
            });
        } else {
            item.addActionListener((ActionEvent e) -> {
                new JDialogSeeExperienceDetails(this, true, user.getExperiences().get(selectedRow)).setVisible(true);
            });
        }
    }

    /**
     * Obtiene el item y le añade funcionalidad según la tabla
     *
     * @param item item al que dar funcionalidad
     * @param option varía en función de la tabla de la que se trate
     * @param selectedRow hace referencia a la fila seleccionada
     */
    private void getDeleteItem(JMenuItem item, int option, int selectedRow) {

        switch (option) {
            case 1:
                item.addActionListener((ActionEvent e) -> {
                    deletedInfo.add(this.user.getAcademics().get(selectedRow));
                    this.user.getAcademics().remove(selectedRow);
                    this.userController.updateUser(user);
                });
                break;
            case 2:
                item.addActionListener((ActionEvent e) -> {
                    this.deletedSkills.add(this.user.getSkills().get(selectedRow));
                    this.user.getSkills().remove(selectedRow);
                    this.userController.updateUser(user);
                });
                break;
            default:
                item.addActionListener((ActionEvent e) -> {
                    deletedExperiences.add(this.user.getExperiences().get(selectedRow));
                    this.user.getExperiences().remove(selectedRow);
                    this.userController.updateUser(user);
                });
                break;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddAI;
    private javax.swing.JButton jButtonAddExperience;
    private javax.swing.JButton jButtonAddSkill;
    private javax.swing.JButton jButtonHome;
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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTableAcademicInfo;
    private javax.swing.JTable jTableExperience;
    private javax.swing.JTable jTableSkills;
    private javax.swing.JTextArea jTextAreaDescription;
    // End of variables declaration//GEN-END:variables
}
