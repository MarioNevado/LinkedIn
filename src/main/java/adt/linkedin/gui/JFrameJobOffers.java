/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package adt.linkedin.gui;

import adt.linkedin.model.*;
import adt.linkedin.services.*;
import adt.linkedin.tools.Utils;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;

/**
 *
 * @author Mario Nevado
 */
public class JFrameJobOffers extends javax.swing.JFrame {

    User user;
    JobOfferService offerController;
    CompanyService companyController;
    UserService userController;
    String query;
    List<JobOffer> availableOffers = new ArrayList<>();

    /**
     *
     * @param user hace referencia al usuario que realiza la búsqueda
     * @param service herramienta para consultar y modificar en la base de datos
     * @param query hace referencia a la búsqueda
     */
    public JFrameJobOffers(User user, UserService service, String query) {
        this.user = user;
        this.offerController = new JobOfferService();
        this.companyController = new CompanyService();
        this.userController = service;
        this.query = query;
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        fillList(0);
    }

    /**
     * Rellena la lista según lo que el usuario busque
     *
     * @param option será 0 si busca ofertas, 1 si busca empresas y 2 si busca
     * usuarios
     */
    private void fillList(int option) {
        int counter = 0;
        DefaultListModel model = new DefaultListModel();
        switch (option) {
            case 0:
                if (!offerController.getOffersByTitle(query).isEmpty()) {
                    for (JobOffer offer : offerController.getOffersByTitle(query)) {
                        if (!userController.hasApplied(user, offer) && offer.isOpen()) {
                            availableOffers.add(offer);
                            model.add(counter, offer);
                            counter++;
                        }
                    }
                } else {
                    model.add(0, "No se encontraron ofertas :(");
                }

                break;
            case 1:
                if (!companyController.getCompanies(query).isEmpty()) {
                    for (Company company : companyController.getCompanies(query)) {
                        model.add(counter, company);
                        counter++;
                    }
                } else {
                    model.add(0, "No se encontraron empresas :(");
                }
                break;

            case 2:
                if (!userController.getUsersByName(query).isEmpty() && !onlyContainsThis()) {
                    for (User user : userController.getUsersByName(query)) {
                        if (!this.user.equals(user)) {
                            model.add(counter, user);
                            counter++;
                        }
                    }
                } else {
                    model.add(0, "No se encontraron usuarios:(");
                }
                break;
            default:
                break;
        }
        this.jListOffers.setModel(model);
    }

    /**
     * Comprueba que en la lista de usuarios la unica coincidencia es él mismo
     *
     * @return true si es el único que se llama así, false si hay más similares
     */
    private boolean onlyContainsThis() {
        return userController.getUsersByName(query).size() == 1 && userController.getUsersByName(query).get(0).equals(user);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListOffers = new javax.swing.JList<>();
        jTextField1 = new javax.swing.JTextField();
        jToggleButtonCompanies = new javax.swing.JToggleButton();
        jToggleButtonUsers = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jListOffers.setBackground(new java.awt.Color(0, 0, 0));
        jListOffers.setBorder(javax.swing.BorderFactory.createLineBorder(Utils.PURPLE));
        jListOffers.setForeground(new java.awt.Color(255, 255, 255));
        jListOffers.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListOffers.setToolTipText("Click para apuntarte a una oferta");
        jListOffers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListOffersMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jListOffers);

        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setFont(new java.awt.Font("Liberation Sans", 2, 15)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(204, 204, 204));
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

        jToggleButtonCompanies.setBackground(Utils.PURPLE);
        jToggleButtonCompanies.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButtonCompanies.setText("Empresas");
        jToggleButtonCompanies.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jToggleButtonCompaniesItemStateChanged(evt);
            }
        });

        jToggleButtonUsers.setBackground(Utils.PURPLE);
        jToggleButtonUsers.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButtonUsers.setText("Usuarios");
        jToggleButtonUsers.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jToggleButtonUsersItemStateChanged(evt);
            }
        });

        jButton1.setBackground(Utils.PURPLE);
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("<<");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(339, 339, 339)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jToggleButtonCompanies)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButtonUsers))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(214, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButtonUsers)
                    .addComponent(jToggleButtonCompanies))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(209, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Cambia el formato al textField al pinchar sobre el
     *
     * @param evt no usado
     */
    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        this.jTextField1.setText("");
        this.jTextField1.setForeground(Utils.PURPLE);
        this.jTextField1.setFont(new Font(Utils.FONT, 0, 15));
    }//GEN-LAST:event_jTextField1MouseClicked

    /**
     * Hace una llamada recursiva a si mismo
     *
     * @param evt no usado
     */
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        this.query = jTextField1.getText();
        fillList(0);
    }//GEN-LAST:event_jTextField1ActionPerformed

    /**
     * Habilita o deshabilita el otro botón en función de si el botón está
     * seleccionado
     *
     * @param evt no usado
     */
    private void jToggleButtonCompaniesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jToggleButtonCompaniesItemStateChanged
        int option;
        if (this.jToggleButtonCompanies.isSelected()) {
            this.jToggleButtonUsers.setVisible(false);
            this.jToggleButtonCompanies.setBackground(Utils.PURPLE);
            this.jToggleButtonCompanies.setForeground(Color.WHITE);
            option = 1;
        } else {
            this.jToggleButtonUsers.setVisible(true);
            this.jToggleButtonCompanies.setForeground(Utils.PURPLE);
            this.jToggleButtonCompanies.setBackground(Color.BLACK);
            option = 0;
        }
        fillList(option);
    }//GEN-LAST:event_jToggleButtonCompaniesItemStateChanged
    
    /**
     * Habilita o deshabilita el otro botón en función de si el botón está
     * seleccionado
     *
     * @param evt no usado
     */
    private void jToggleButtonUsersItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jToggleButtonUsersItemStateChanged
        int option;
        if (this.jToggleButtonUsers.isSelected()) {
            this.jToggleButtonCompanies.setVisible(false);
            this.jToggleButtonUsers.setBackground(Utils.PURPLE);
            this.jToggleButtonUsers.setForeground(Color.WHITE);
            option = 2;
        } else {
            this.jToggleButtonCompanies.setVisible(true);
            this.jToggleButtonUsers.setBackground(Color.BLACK);
            this.jToggleButtonUsers.setForeground(Utils.PURPLE);
            option = 0;
        }
        fillList(option);

    }//GEN-LAST:event_jToggleButtonUsersItemStateChanged

    /**
     * Dependiendo de qué botón ha sido seleccionado hará diferentes acciones, si se ha pinchado en empresas se
     * cargará el perfil de esa empresa, si se ha pinchado en usuarios se cargará en el perfil de ese usuario, 
     * y si no se ha pinchado en ninguno de los dos botones, es decir, lo que se muestra son ofertas, y por lo
     * tanto añadirá una candidatura a la oferta seleccionada.
     * @param evt no usado
     */
    private void jListOffersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListOffersMouseClicked
        // TODO add your handling code here:
        if (this.jToggleButtonCompanies.isSelected()) {
            Company selectedCompany = (Company) ((Object) this.jListOffers.getSelectedValue());
            new JFrameCompany(selectedCompany, companyController).setVisible(true);
            dispose();
        } else if (this.jToggleButtonUsers.isSelected()) {
            User selectedUser = (User) ((Object) this.jListOffers.getSelectedValue());
            new JFrameUser(selectedUser, userController).setVisible(true);
            dispose();
        } else {
            System.out.println(availableOffers.get(this.jListOffers.getSelectedIndex()));
            new JDialogAddCandidature(this, true, user, userController, availableOffers.get(this.jListOffers.getSelectedIndex())).setVisible(true);
            this.availableOffers.remove(this.availableOffers.get(this.jListOffers.getSelectedIndex()));
        }
    }//GEN-LAST:event_jListOffersMouseClicked

    /**
     * Vuelve al feed principal del usuario
     * @param evt no usado
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new JFrameFeed(user, userController).setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JList<String> jListOffers;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButtonCompanies;
    private javax.swing.JToggleButton jToggleButtonUsers;
    // End of variables declaration//GEN-END:variables
}
