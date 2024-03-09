/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package adt.linkedin.gui;

import adt.linkedin.converters.StatusConverter;
import adt.linkedin.enumerations.Status;
import adt.linkedin.model.AcademicInfo;
import adt.linkedin.model.Candidature;
import adt.linkedin.model.Company;
import adt.linkedin.model.Institution;
import adt.linkedin.model.JobOffer;
import adt.linkedin.model.User;
import adt.linkedin.services.JobOfferService;
import adt.linkedin.services.UserService;
import adt.linkedin.tools.Utils;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.Timer;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import jdk.net.SocketFlow;

/**
 *
 * @author dev
 */
public class Feed extends javax.swing.JFrame {

    User user;
    UserService userController;
    JobOfferService offerService;
    Timer timer = new Timer(3000, (ActionEvent e) -> {
        refreshTable();
    });

    /**
     * Creates new form Feed
     *
     * @param user
     * @param service
     */
    public Feed(User user, UserService service) {
        this.user = user;
        this.userController = service;
        this.offerService = new JobOfferService();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        initComponents();
        initTable();
        timer.start();
    }

    private void initTable() {
        DefaultTableCellRenderer header = new DefaultTableCellRenderer();
        header.setBackground(Utils.PURPLE);
        header.setForeground(Color.white);
        for (int i = 0; i < this.jTable1.getColumnCount(); i++) {
            jTable1.getColumnModel().getColumn(i).setHeaderRenderer(header);
        }
    }

    private void refreshTable() {
        DefaultTableModel model;
        model = new DefaultTableModel();

        model.addColumn("Título");
        model.addColumn("Empresa");
        model.addColumn("Localización");
        model.addColumn("Estado");

        jTable1.setModel(model);
        initTable();
        fillTable();
    }

    private boolean containsValue(Candidature candidature) { //title + "  " + company+ "  " + local + "  " + status
        Object[] value;
        Candidature aux;
        if (jTable1.getRowCount() > 0 && jTable1.getColumnCount() > 0) {
            for (int i = 0; i < jTable1.getRowCount(); i++) {
                value = new Object[4];
                if (jTable1.getValueAt(i, 0) != null) {
                    for (int j = 0; j < jTable1.getColumnCount(); j++) {
                        value[j] = jTable1.getValueAt(i, j);
                    }
                    aux = new Candidature((String) value[0], null);
                    aux.setOffer(new JobOffer(null, (String) value[2]));
                    aux.getOffers().setCompany(new Company((String) value[1], null));
                    aux.setStatus(Status.valueOf((String) value[3]));
                    if ((aux.equals(candidature))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private void fillTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        for (Candidature candidature : offerService.getCandidaturesByUser(user)) {
            if (!containsValue(candidature)) {
                model.addRow(new Object[]{candidature.getOffers().getTitle(), candidature.getOffers().getCompany().getName(),
                    candidature.getOffers().getLocation(), candidature.getStatus().toString()});
            }
        }
        jTable1.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanelParent = new javax.swing.JPanel();
        jPanelUser = new javax.swing.JPanel();
        jLabelProfilePic = new javax.swing.JLabel();
        jLabelUsername = new javax.swing.JLabel();
        jLabelDescription = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 51, 255));

        jPanelParent.setBackground(new java.awt.Color(0, 0, 0));

        jPanelUser.setBackground(new java.awt.Color(0, 0, 0));
        jPanelUser.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(153, 0, 255)));

        jLabelProfilePic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/DefaultIconFeed.png"))); // NOI18N

        jLabelUsername.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabelUsername.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelUsername.setText(this.user.getName());
        jLabelUsername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelUsernameMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelUsernameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelUsernameMouseExited(evt);
            }
        });

        jLabelDescription.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanelUserLayout = new javax.swing.GroupLayout(jPanelUser);
        jPanelUser.setLayout(jPanelUserLayout);
        jPanelUserLayout.setHorizontalGroup(
            jPanelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUserLayout.createSequentialGroup()
                .addGroup(jPanelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelUserLayout.createSequentialGroup()
                        .addGroup(jPanelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelUserLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabelProfilePic, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelUserLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabelDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 18, Short.MAX_VALUE))
                    .addComponent(jLabelUsername, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelUserLayout.setVerticalGroup(
            jPanelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUserLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabelProfilePic, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabelDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(153, 51, 255)));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setBackground(new java.awt.Color(0, 0, 0));
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 803, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setFont(new java.awt.Font("Liberation Sans", 2, 15)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(204, 204, 204));
        jTextField1.setText("Buscar usuarios...");
        jTextField1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(204, 204, 204)));
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelParentLayout = new javax.swing.GroupLayout(jPanelParent);
        jPanelParent.setLayout(jPanelParentLayout);
        jPanelParentLayout.setHorizontalGroup(
            jPanelParentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelParentLayout.createSequentialGroup()
                .addGroup(jPanelParentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelParentLayout.createSequentialGroup()
                        .addComponent(jPanelUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelParentLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 882, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelParentLayout.setVerticalGroup(
            jPanelParentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelParentLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelParentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelParent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelParent, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelUsernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelUsernameMouseClicked
        // TODO add your handling code here:
        new JFrameUser(this.user, userController).setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabelUsernameMouseClicked

    private void jLabelUsernameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelUsernameMouseEntered
        // TODO add your handling code here:
        Utils.mouseEntered(jLabelUsername);
        this.jLabelUsername.setForeground(Utils.PURPLE);
    }//GEN-LAST:event_jLabelUsernameMouseEntered

    private void jLabelUsernameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelUsernameMouseExited
        // TODO add your handling code here:
        Utils.mouseExited(jLabelUsername);
        this.jLabelUsername.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabelUsernameMouseExited

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        // TODO add your handling code here:
        this.jTextField1.setText("");
        this.jTextField1.setForeground(Utils.PURPLE);
        this.jTextField1.setFont(new Font(Utils.FONT, 0, 15));
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add query
    }//GEN-LAST:event_jTextField1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelDescription;
    private javax.swing.JLabel jLabelProfilePic;
    private javax.swing.JLabel jLabelUsername;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelParent;
    private javax.swing.JPanel jPanelUser;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
