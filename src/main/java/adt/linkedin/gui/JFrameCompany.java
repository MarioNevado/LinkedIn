/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package adt.linkedin.gui;

import adt.linkedin.enumerations.Status;
import adt.linkedin.model.*;
import adt.linkedin.services.CompanyService;
import adt.linkedin.services.JobOfferService;
import adt.linkedin.tools.Utils;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
public class JFrameCompany extends javax.swing.JFrame {

    final Company company;
    CompanyService companyController = new CompanyService();
    JobOfferService offerController = new JobOfferService();
    private final List<JobOffer> closedOffers = new ArrayList<>();
    private final List<JobOffer> deletedOffers = new ArrayList<>();
    private final List<Candidature> rejectedCandidatures = new ArrayList<>();
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
     * Inicializa y rellena las tablas, arranca el Trigger que se repetirá cada
     * 3 segundos y settea la información de la empresa
     *
     * @param company Obtiene la instancia de la empresa loggeada
     * @param controller controlador de compaías en la base de datos
     */
    public JFrameCompany(Company company, CompanyService controller) {
        this.company = company;
        this.companyController = controller;
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        initComponents();
        this.jPanel1.setBounds(2, 2, JFrame.MAXIMIZED_HORIZ, JFrame.MAXIMIZED_VERT);
        initTable(jTableOffers);
        initTable(jTableCandidatures);
        fillTable(jTableOffers, 1);
        fillTable(jTableCandidatures, 2);
        timer.start();
        this.jLabelUserName.setText(this.company.getName());
        this.jTextAreaDescription.setText(this.company.getDescription());
    }

    /**
     * Da estilo a las columnas de la tabla
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

        jLabelUserPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/office_business_work_workplace_home_company_icon_175608.png"))); // NOI18N
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
        jLabelUserName.setText("Company");
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

        jLabelLogOut.setText("Cerrar Sesión");
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
        jPanelUser.add(jLabelLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 110, 40));

        jLabelDelete.setText("Eliminar Cuenta");
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
        jPanelUser.add(jLabelDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 110, 40));

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/DefaultLogo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanelUser, javax.swing.GroupLayout.PREFERRED_SIZE, 796, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(879, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelUser, javax.swing.GroupLayout.PREFERRED_SIZE, 868, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(206, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2000, 1080));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Si las listas de ofertas cerradas o eliminadas contienen la oferta ni
     * siquiera se molesta en comprobar nada, en caso contrario recorrerá los
     * valores de la tabla y si alguno coincide con la oferta devolverá true.
     *
     * @param table tabla a recorrer
     * @param offer oferta a comprobar
     * @return true si la tabla contiene la oferta, false si no la contiene
     */
    private boolean containsValue(JTable table, JobOffer offer) {
        Object[] value;
        JobOffer aux;
        if (closedOffers.contains(offer) || deletedOffers.contains(offer)) {
            return true;
        }
        if (table.getRowCount() > 0 && table.getColumnCount() > 0) {
            for (int i = 0; i < table.getRowCount(); i++) {
                value = new Object[5];
                if (table.getValueAt(i, 0) != null) {
                    for (int j = 0; j < table.getColumnCount(); j++) {
                        value[j] = table.getValueAt(i, j);
                    }
                    aux = new JobOffer((String) value[0], (String) value[1]);
                    aux.setOpen((boolean) value[2]);
                    aux.setMinSalary((int) value[3]);
                    aux.setRequiredCandidates((int) value[4]);
                    if ((aux.equals(offer))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /**
     * Si la lista de candidaturas rechazadas contiene la oferta o el estado de
     * la candidatura no es pendiente ni siquiera se molesta en comprobar nada,
     * en caso contrario recorrerá los valores de la tabla y si alguno coincide
     * con la candidatura devolverá true.
     *
     * @param table tabla a recorrer
     * @param candidature candidatura a comprobar
     * @return true si contiene la candidatura, false en caso contrario
     */
    private boolean containsValue(JTable table, Candidature candidature) {
        Object[] value;
        User user;
        JobOffer offer;
        Candidature aux;
        if (rejectedCandidatures.contains(candidature) || candidature.getStatus() != Status.PENDING) {
            return true;
        }
        if (table.getRowCount() > 0 && table.getColumnCount() > 0) {
            for (int i = 0; i < table.getRowCount(); i++) {
                value = new Object[3];
                if (table.getValueAt(i, 0) != null) {
                    for (int j = 0; j < table.getColumnCount(); j++) {
                        value[j] = table.getValueAt(i, j);
                    }
                    aux = new Candidature();
                    user = new User();
                    offer = new JobOffer();
                    offer.setTitle((String) value[1]);
                    user.setName((String) value[0]);
                    aux.setUser(user);
                    aux.setOffer(offer);
                    aux.setStatus((Status) value[2]);
                    if ((aux.equals(candidature))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /**
     * Cada tres segundos se llama a este método, para que no se pierdan los
     * contenidos ni las estructura de la tabla.
     *
     * @param table tabla a inicializar y rellenar
     * @param option en función de qué tabla sea, se añadirán unas u otras
     * columnas
     */
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

    /**
     * Recorre las ofertas de trabajo de la compañía, y si no la contiene la
     * añade, para evitar duplicados
     *
     * @param model modelo de la tabla
     */
    private void fillOffers(DefaultTableModel model) {
        for (JobOffer offer : offerController.getOffersByCompany(company)) {
            if (!containsValue(jTableOffers, offer)) {
                model.addRow(new Object[]{offer.getTitle(), offer.getLocation(), offer.isOpen(), offer.getMinSalary(), offer.getRequiredCandidates()});
            }
        }
    }

    /**
     * Recorre las candidaturas de cada oferta de la compañía, y si no la
     * contiene la añade, para evitar duplicados.
     *
     * @param model modelo de la tabla
     */
    private void fillCandidatures(DefaultTableModel model) {
        for (JobOffer jobOffer : offerController.getOffersByCompany(company)) {
            for (Candidature candidature : offerController.getCandidatures(jobOffer)) {
                if (!containsValue(jTableCandidatures, candidature)) {
                    model.addRow(new Object[]{candidature.getUser().getName(), candidature.getOffer().getTitle(), candidature.getStatus()});
                }
            }
        }
    }

    /**
     * Llama a un rellenador u otro en funición de la opción.
     *
     * @param table tabla a rellenar
     * @param option su valor será 1 en caso de ser la tabla de ofertas y 2 en
     * caso de ser la tabla de candidaturas
     */
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

    /**
     * Pone el texto en negrita cuando el ratón se aproxima al label.
     *
     * @param evt no es usado
     */
    private void jLabelLogOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLogOutMouseEntered
        Utils.mouseEntered(this.jLabelLogOut);
    }//GEN-LAST:event_jLabelLogOutMouseEntered

    /**
     * Vuelve a poner el texto en plano cuando el ratón se aleja del label.
     *
     * @param evt no es usado
     */
    private void jLabelLogOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLogOutMouseExited
        Utils.mouseExited(this.jLabelLogOut);
    }//GEN-LAST:event_jLabelLogOutMouseExited

    /**
     * Se abre un panel de confirmación al pulsar en cerrar sesión
     *
     * @param evt no es usado
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
     * Añade una oferta de trabajo.
     *
     * @param evt no es usado
     */
    private void jButtonAddAIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddAIActionPerformed
        new JDialogAddJobOffer(company, this, true).setVisible(true);
    }//GEN-LAST:event_jButtonAddAIActionPerformed

    /**
     * Cambia la descripción de la empresa
     *
     * @param evt no es usado
     */
    private void jTextAreaDescriptionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextAreaDescriptionMouseClicked
        new JDialogAddDescription(companyController, company, this, true, this.jTextAreaDescription).setVisible(true);
    }//GEN-LAST:event_jTextAreaDescriptionMouseClicked

    /**
     * Al acercar el ratón aparece un cuadro de ayuda y cambia el borde.
     *
     * @param evt no es usado
     */
    private void jTextAreaDescriptionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextAreaDescriptionMouseEntered
        this.jTextAreaDescription.setToolTipText("Click para cambiar la descripción");
        this.jTextAreaDescription.setBorder(new LineBorder(Utils.PURPLE));
    }//GEN-LAST:event_jTextAreaDescriptionMouseEntered

    private void jTextAreaDescriptionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextAreaDescriptionMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextAreaDescriptionMouseExited

    /**
     * Aparece un cuadro de confirmación al querer eliminar la cuenta de manera
     * irreversible.
     *
     * @param evt no es usado
     */
    private void jLabelDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDeleteMouseClicked
        String buttons[] = {"Eliminar empresa", "Cancelar"};
        String confirmButtons[] = {"Cancelar", "SI"};
        int option = JOptionPane.showOptionDialog(this, "Esta acción es irreversible, piénsalo dos veces...", "Eliminar cuenta",
                0, 0, null, buttons, this);
        if (option == JOptionPane.YES_OPTION) {
            int confirmOption = JOptionPane.showOptionDialog(this, "¿Seguro que quieres borrar tu cuenta?",
                    "Eliminar empresa pesao", 0, 0, null, confirmButtons, this);
            if (confirmOption == JOptionPane.YES_OPTION) {
                this.companyController.removeCompany(company);
                new JFrameLogIn().setVisible(true);
                dispose();
            }
        }

    }//GEN-LAST:event_jLabelDeleteMouseClicked

    /**
     * Pone el texto en negrita al acercar el ratón
     *
     * @param evt no es usado
     */
    private void jLabelDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDeleteMouseEntered
        Utils.mouseEntered(jLabelDelete);
    }//GEN-LAST:event_jLabelDeleteMouseEntered

    /**
     * Pone el texto en plano al alejar el ratón
     *
     * @param evt no es usado
     */
    private void jLabelDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDeleteMouseExited
        Utils.mouseExited(jLabelDelete);
    }//GEN-LAST:event_jLabelDeleteMouseExited

    /**
     * Al pinchar en una fila abre un menú con opciones.
     *
     * @param evt no es usado
     */
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

    /**
     * Al pinchar en una fila abre un menú con opciones.
     *
     * @param evt no es usado
     */
    private void jTableCandidaturesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCandidaturesMouseClicked
        int selectedRow = jTableCandidatures.getSelectedRow();
        if (SwingUtilities.isLeftMouseButton(evt)) {
            try {
                JPopupMenu pop = initPopup(selectedRow, 2);
                pop.show(evt.getComponent(), evt.getX(), evt.getY());
            } catch (NullPointerException nEx) {
                JOptionPane.showMessageDialog(null, "Error desconocido", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jTableCandidaturesMouseClicked

    private void jLabelUserPicMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelUserPicMouseEntered

    }//GEN-LAST:event_jLabelUserPicMouseEntered

    private void jLabelUserPicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelUserPicMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelUserPicMouseClicked

    private void jTableOffersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableOffersMouseEntered
        initTable(jTableOffers);
    }//GEN-LAST:event_jTableOffersMouseEntered

    /**
     * Al pinchar en "Consultar candidatos seleccionados" abrirá un Dialog con
     * los candidatos seleccionados
     *
     * @param selectedRow hace referencia al id de la oferta
     */
    private void selectAcceptedCandidates(int selectedRow) {
        new JDialogAcceptedCandidatures(this, true, offerController.getOffer(selectedRow + 1)).setVisible(true);
    }

    /**
     * Inicializa el menú en función de la tabla en la que se haya pinchado
     *
     * @param selectedRow hace referencia a la fila seleccionada
     * @param option indica el tipo de tabla que es
     * @return Un PopupMenu funcional
     */
    private JPopupMenu initPopup(int selectedRow, int option) {
        JPopupMenu pop = new JPopupMenu();
        JMenuItem delete, close, details;
        switch (option) {
            case 1:
                delete = new JMenuItem("Eliminar oferta");
                close = new JMenuItem("Cerrar proceso de selección");
                details = new JMenuItem("Consultar candidatos seleccionados");
                details.addActionListener((ActionEvent e) -> {
                    selectAcceptedCandidates(selectedRow);
                });
                getDeleteItem(delete, option, selectedRow);
                getCloseItem(close, option, selectedRow);
                pop.add(close);
                pop.add(delete);
                pop.add(details);
                refreshTable(jTableOffers, option);
                break;
            case 2:
                close = new JMenuItem("Aceptar");
                delete = new JMenuItem("Rechazar");
                getDeleteItem(delete, option, selectedRow);
                getCloseItem(close, option, selectedRow);
                pop.add(close);
                pop.add(delete);
                refreshTable(jTableCandidatures, option);
                break;
            default:
                break;
        }
        return pop;
    }

    /**
     * Añade funcionalidad al item en función de qué tabla se trate
     *
     * @param item item al que dar funcionalidad
     * @param option indica el tipo de tabla
     * @param selectedRow hacer referencia a la fila seleccionada
     */
    private void getCloseItem(JMenuItem item, int option, int selectedRow) {
        if (option == 1) {
            item.addActionListener((ActionEvent e) -> {
                this.closedOffers.add(this.offerController.getOffer(selectedRow + 1));
                this.offerController.closeJobOffer(this.offerController.getOffer(selectedRow + 1));
            });
        } else {
            item.addActionListener((ActionEvent e) -> {
                String userName = (String) this.jTableCandidatures.getValueAt(selectedRow, 0);
                String title = (String) this.jTableCandidatures.getValueAt(selectedRow, 1);
                Candidature candidature = this.offerController.getCandidatureByFields(userName, title);
                JobOffer offer = offerController.getOffersByCompany(company).get(selectedRow);
                companyController.acceptCandidature(company, offer, candidature, selectedRow);
                offer.setRequiredCandidates(offer.getRequiredCandidates() - 1);
                if (offer.getRequiredCandidates() == 0) {
                    offerController.closeJobOffer(offer);
                }
                this.offerController.updateOffer(offer);
                this.companyController.updateCompany(company);

            });
        }
    }

    /**
     * Añade funcionalidad al item en función de qué tabla se trate
     *
     * @param item item al que dar funcionalidad
     * @param option indica el tipo de tabla
     * @param selectedRow hacer referencia a la fila seleccionada
     */
    private void getDeleteItem(JMenuItem item, int option, int selectedRow) {
        switch (option) {
            case 1:
                item.addActionListener((ActionEvent e) -> {
                    this.deletedOffers.add(this.company.getOffers().get(selectedRow));
                    this.company.getOffers().remove(selectedRow);
                    this.companyController.updateCompany(company);
                });
                break;
            case 2:
                item.addActionListener((ActionEvent e) -> {
                    String userName = (String) this.jTableCandidatures.getValueAt(selectedRow, 0);
                    String title = (String) this.jTableCandidatures.getValueAt(selectedRow, 1);
                    JobOffer offer = offerController.getOffersByCompany(company).get(selectedRow);
                    companyController.rejectCandidature(company, offer, this.offerController.getCandidatureByFields(userName, title));
                    this.rejectedCandidatures.add(this.offerController.getCandidatureByFields(userName, title));
                    this.offerController.updateOffer(offer);
                    this.companyController.updateCompany(company);
                });
                break;
            default:
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
