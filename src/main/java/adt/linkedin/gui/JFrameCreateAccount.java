/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package adt.linkedin.gui;

import adt.linkedin.model.Company;
import adt.linkedin.model.User;
import adt.linkedin.services.CompanyService;
import adt.linkedin.services.UserService;
import adt.linkedin.tools.Utils;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.CompoundBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Mario Nevado
 */
public class JFrameCreateAccount extends javax.swing.JFrame {

    UserService userController;
    CompanyService companyController = new CompanyService();
    boolean isCompany;

    /**
     * Creates new form CreateAccount
     *
     * @param controller herramienta con la que haremos las consultas y modificaciones
     * @param company indica si es una empresa o no
     */
    public JFrameCreateAccount(UserService controller, boolean company) {
        this.userController = controller;
        this.isCompany = company;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        initComponents();
        if (isCompany) {
            this.jTextFieldUserEmail.setVisible(false);
            this.jTextFieldUserName.setBorder(new CompoundBorder(new TitledBorder("Nombre de la compañía"), null));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelTitle = new javax.swing.JLabel();
        jTextFieldUserEmail = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextFieldUserName = new javax.swing.JTextField();
        jLabelImg = new javax.swing.JLabel();
        jButtonSignUp = new javax.swing.JButton();
        jPasswordFieldRepeat = new javax.swing.JPasswordField();
        jLabelHome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabelTitle.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(153, 51, 255));
        jLabelTitle.setText("Saca el máximo partido a tu vida profesional ");

        jTextFieldUserEmail.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldUserEmail.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldUserEmail.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(null, "Email/Teléfono", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Liberation Sans", 1, 15), Utils.PURPLE), null)); // NOI18N
        jTextFieldUserEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUserEmailActionPerformed(evt);
            }
        });

        jPasswordField1.setBackground(new java.awt.Color(0, 0, 0));
        jPasswordField1.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField1.setText("jPasswordField1");
        jPasswordField1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contraseña", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Liberation Sans", 1, 15), Utils.PURPLE), null)); // NOI18N
        jPasswordField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordField1MouseClicked(evt);
            }
        });

        jTextFieldUserName.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldUserName.setFont(new java.awt.Font("Liberation Sans", 2, 15)); // NOI18N
        jTextFieldUserName.setForeground(new java.awt.Color(204, 204, 204));
        jTextFieldUserName.setText("Introduzca caracteres alfabéticos en minúscula");
        jTextFieldUserName.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre de Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Liberation Sans", 1, 15), Utils.PURPLE), null)); // NOI18N
        jTextFieldUserName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldUserNameMouseClicked(evt);
            }
        });

        jLabelImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Link up.png"))); // NOI18N

        jButtonSignUp.setBackground(new java.awt.Color(153, 51, 255));
        jButtonSignUp.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSignUp.setText("Únete");
        jButtonSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSignUpActionPerformed(evt);
            }
        });

        jPasswordFieldRepeat.setBackground(new java.awt.Color(0, 0, 0));
        jPasswordFieldRepeat.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordFieldRepeat.setText("jPasswordField2");
        jPasswordFieldRepeat.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(null, "Repita su contraseña", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Liberation Sans", 1, 15), Utils.PURPLE), null)); // NOI18N
        jPasswordFieldRepeat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordFieldRepeatMouseClicked(evt);
            }
        });

        jLabelHome.setForeground(Utils.PURPLE);
        jLabelHome.setText("Volver a Inicio");
        jLabelHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelHomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelHomeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelImg, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldUserEmail)
                            .addComponent(jTextFieldUserName)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
                            .addComponent(jButtonSignUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPasswordFieldRepeat)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabelHome, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(154, 154, 154)
                        .addComponent(jLabelTitle)))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelHome, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jTextFieldUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldUserEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jPasswordFieldRepeat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelImg, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(134, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldUserEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUserEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUserEmailActionPerformed

    /**
     * Al pinchar vacía el text field
     * @param evt no es usado
     */
    private void jPasswordField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField1MouseClicked
        // TODO add your handling code here:
        this.jPasswordField1.setText("");
    }//GEN-LAST:event_jPasswordField1MouseClicked

    /**
     * Verifica que los valores introducidos cumples todas las restricciones internas
     * @return un usuario en caso de que cumpla las condiciones
     */
    private User verifyUser() {
        String password = new String(this.jPasswordField1.getPassword());
        String repeat = new String(this.jPasswordFieldRepeat.getPassword());
        String username = this.jTextFieldUserName.getText();
        String email = null;
        int phone = 0;
        User user = userController.getUserByName(username);
        if (Utils.matchesUsernameRegex(username) && user == null) {
            if (Utils.matchesEmailRegex(this.jTextFieldUserEmail.getText()) || Utils.matchesPhoneRegex(this.jTextFieldUserEmail.getText())) {
                if (Utils.matchesEmailRegex(this.jTextFieldUserEmail.getText())) {
                    email = this.jTextFieldUserEmail.getText();
                } else if (Utils.matchesPhoneRegex(this.jTextFieldUserEmail.getText())) {
                    phone = Integer.parseInt(this.jTextFieldUserEmail.getText());
                }
                if (Utils.matchesPasswordRegex(password, repeat)) {
                    if (email != null) {
                        return new User(username, password, email, null);
                    } else {
                        return new User(username, password, phone, null);
                    }
                } else if (!password.equals(repeat)) {
                    JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden", "Error en validación", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "La contraseña debe tener al menos 8 caracteres, y solo debe contener caracteres alfabeticos o numéricos", "Contraseña incorrecta", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Introduzca un correo electrónico", "Correo electrónico incorrecto", JOptionPane.ERROR_MESSAGE);
            }
        } else if (user != null) {
            JOptionPane.showMessageDialog(null, "El nombre de usuario ya está cogido, seleccione otro", "Nombre de usuario no disponible", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "El nombre de usuario debe estar en minúsculas", "Nombre de usuario incorrecto", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    /**
     * Verifica que los valores introducidos cumples todas las restricciones internas
     * @return una empresa en caso de que cumpla las condiciones
     */
    private Company verifyCompany() {
        String password = new String(this.jPasswordField1.getPassword());
        String repeat = new String(this.jPasswordFieldRepeat.getPassword());
        String username = this.jTextFieldUserName.getText();
        Company company = companyController.getCompany(username);
        if (Utils.matchesUsernameRegex(username) && company == null) {
            if (Utils.matchesPasswordRegex(password, repeat)) {
                return new Company(username, password, null);
            } else if (!password.equals(repeat)) {
                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden", "Error en validación", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "La contraseña debe tener al menos 8 caracteres, y solo debe contener caracteres alfabeticos o numéricos", "Contraseña incorrecta", JOptionPane.ERROR_MESSAGE);
            }
        } else if (company != null) {
            JOptionPane.showMessageDialog(null, "Esa empresa ya existe", "Nombre de usuario no disponible", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "El nombre de la empresa debe estar en minúsculas", "Nombre de usuario incorrecto", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    /**
     * Añade el usuario o la empresa, y abre un nuevo Frame
     * @param evt no es usado
     */
    private void jButtonSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSignUpActionPerformed
        if (!isCompany) {
            User user = verifyUser();
            if (user != null) {
                userController.createUser(user);
                new JFrameFeed(user, userController).setVisible(true);
                this.dispose();
            }
        } else {
            Company company = verifyCompany();
            if (company != null) {
                companyController.createCompany(company);
                new JFrameCompany(company, companyController).setVisible(true);
                dispose();
            }
        }

    }//GEN-LAST:event_jButtonSignUpActionPerformed

    /**
     * Al pinchar vacía el text field, y le cambia el formato
     * @param evt no es usado
     */
    private void jTextFieldUserNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldUserNameMouseClicked
        this.jTextFieldUserName.setText("");
        Utils.mouseExited(jTextFieldUserName);
        this.jTextFieldUserName.setForeground(Color.WHITE);
    }//GEN-LAST:event_jTextFieldUserNameMouseClicked

    /**
     * Vacía el campo de contraseña al pinchar sobre él
     * @param evt 
     */
    private void jPasswordFieldRepeatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordFieldRepeatMouseClicked
        // TODO add your handling code here:
        this.jPasswordFieldRepeat.setText("");
    }//GEN-LAST:event_jPasswordFieldRepeatMouseClicked

    /**
     * Pone el texto en negrita y morado al acercar el ratón a él
     * @param evt no es usado
     */
    private void jLabelHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHomeMouseEntered
        // TODO add your handling code here:
        Utils.mouseEntered(jLabelHome);
        this.jLabelHome.setForeground(Utils.PURPLE);
    }//GEN-LAST:event_jLabelHomeMouseEntered

    /**
     * Vuelve a ponerlo en texto plano y negro al alejar el ratón
     * @param evt no es usado
     */
    private void jLabelHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHomeMouseExited
        // TODO add your handling code here:
        Utils.mouseExited(jLabelHome);
        this.jLabelHome.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabelHomeMouseExited

    /**
     * Vuelve a la pestaña principal
     * @param evt no es usado
     */
    private void jLabelHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHomeMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new JFrameLogIn().setVisible(true);
    }//GEN-LAST:event_jLabelHomeMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSignUp;
    private javax.swing.JLabel jLabelHome;
    private javax.swing.JLabel jLabelImg;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordFieldRepeat;
    private javax.swing.JTextField jTextFieldUserEmail;
    private javax.swing.JTextField jTextFieldUserName;
    // End of variables declaration//GEN-END:variables
}
