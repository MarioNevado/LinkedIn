/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package adt.linkedin.gui;

import adt.linkedin.model.Company;
import adt.linkedin.model.User;
import adt.linkedin.services.CompanyService;
import adt.linkedin.services.UserService;
import adt.linkedin.tools.HibernateUtil;
import adt.linkedin.tools.Utils;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.CompoundBorder;
import javax.swing.border.TitledBorder;
import org.hibernate.HibernateException;

/**
 *
 * @author Mario Nevado
 */
public class JFrameLogIn extends javax.swing.JFrame {

    UserService userController;
    CompanyService companyController;
    User user;
    Company company;

    /**
     * Creates new form LogIn
     */
    public JFrameLogIn() {
        try {
            userController = new UserService(HibernateUtil.getSessionFactory().openSession());
            companyController = new CompanyService();
            setExtendedState(JFrame.MAXIMIZED_BOTH);
            initComponents();
        } catch (HibernateException e) {
            System.exit(1);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelImg = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButtonLogIn = new javax.swing.JButton();
        jLabelCreateAcc = new javax.swing.JLabel();
        jToggleButtonCompany = new javax.swing.JToggleButton();
        jLabelForgotPasswd = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("¡Te damos la bienvenida a tu comunidad profesional! ");

        jTextFieldEmail.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldEmail.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        jTextFieldEmail.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldEmail.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(null, "Email o Teléfono", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Liberation Sans", 1, 15), Utils.PURPLE), null)); // NOI18N
        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });

        jLabelImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Link up.png"))); // NOI18N

        jPasswordField1.setBackground(new java.awt.Color(0, 0, 0));
        jPasswordField1.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField1.setText("jPasswordField1");
        jPasswordField1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contraseña", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Liberation Sans", 1, 15), Utils.PURPLE), null)); // NOI18N
        jPasswordField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordField1MouseClicked(evt);
            }
        });

        jButtonLogIn.setBackground(new java.awt.Color(102, 0, 204));
        jButtonLogIn.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLogIn.setText("Inicia Sesión");
        jButtonLogIn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogInActionPerformed(evt);
            }
        });

        jLabelCreateAcc.setForeground(new java.awt.Color(102, 0, 204));
        jLabelCreateAcc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCreateAcc.setText("Unirse Ahora");
        jLabelCreateAcc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCreateAccMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelCreateAccMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelCreateAccMouseExited(evt);
            }
        });

        jToggleButtonCompany.setBackground(Utils.PURPLE);
        jToggleButtonCompany.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButtonCompany.setText("Empresa");
        jToggleButtonCompany.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jToggleButtonCompanyItemStateChanged(evt);
            }
        });

        jLabelForgotPasswd.setForeground(new java.awt.Color(102, 0, 204));
        jLabelForgotPasswd.setText("¿Has olvidado tu contraseña?");
        jLabelForgotPasswd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelForgotPasswdMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelForgotPasswdMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelForgotPasswdMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jToggleButtonCompany)
                                        .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabelForgotPasswd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPasswordField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(164, 164, 164)
                                .addComponent(jLabelCreateAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(124, 124, 124)
                        .addComponent(jLabelImg, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 866, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jToggleButtonCompany)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelForgotPasswd, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jButtonLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelCreateAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabelImg, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jPanel1MouseClicked

    /**
     * Pone el texto en negrita al acercar el ratón al label
     *
     * @param evt no usado
     */
    private void jLabelCreateAccMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCreateAccMouseEntered
        // TODO add your handling code here:
        Utils.mouseEntered(jLabelCreateAcc);
    }//GEN-LAST:event_jLabelCreateAccMouseEntered

    /**
     * Pone el texto en plano al alejar el ratón del label
     *
     * @param evt no usado
     */
    private void jLabelCreateAccMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCreateAccMouseExited
        // TODO add your handling code here:
        Utils.mouseExited(jLabelCreateAcc);
    }//GEN-LAST:event_jLabelCreateAccMouseExited

    /**
     * Vacía el campo de contraseña al pinchar sobre él
     *
     * @param evt no usado
     */
    private void jPasswordField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField1MouseClicked
        // TODO add your handling code here:
        this.jPasswordField1.setText("");
    }//GEN-LAST:event_jPasswordField1MouseClicked

    /**
     * Llama a un método u otro en función de si el botón de empresa está
     * pulsado o no
     *
     * @param evt no usado
     */
    private void jButtonLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogInActionPerformed
        if (this.jToggleButtonCompany.isSelected()) {
            getCompany();
        } else
            getUser();
    }//GEN-LAST:event_jButtonLogInActionPerformed

    /**
     * Obtiene el usuario en función de los valores introducidos por el usuario,
     * si todo ha ido bien abrirá el feed principal, en caso contrario mostrará
     * un error
     */
    public void getUser() {
        String email, password;
        int phone;
        password = new String(this.jPasswordField1.getPassword());
        if (!this.jTextFieldEmail.getText().isEmpty() && this.jPasswordField1.getPassword().length > 0) {
            if (Utils.isNumeric(this.jTextFieldEmail.getText()) && !this.jTextFieldEmail.getText().isBlank()) {
                phone = Integer.parseInt(this.jTextFieldEmail.getText());
                user = userController.getUserByPhone(phone, password);
            } else if (!this.jTextFieldEmail.getText().isBlank()) {
                email = this.jTextFieldEmail.getText();
                user = userController.getUserByEmail(email, password);
            }
            if (user != null) {
                this.setVisible(false);
                new JFrameFeed(user, userController).setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "No tengo ni idea de quien es ese", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "¿Has probado a meter datos, o también tengo que explicártelo?", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }

    /**
     * Obtiene la empresa en función de los valores introducidos por el usuario,
     * si todo ha ido bien abrirá el perfil de la empresa, en caso contrario
     * mostrará un error
     */
    public void getCompany() {
        String name, password;
        password = new String(this.jPasswordField1.getPassword());
        if (!this.jTextFieldEmail.getText().isEmpty() && this.jPasswordField1.getPassword().length > 0) {
            name = this.jTextFieldEmail.getText();
            company = companyController.getCompany(name);
            if (company != null && company.getPassword().equals(password)) {
                this.setVisible(false);
                new JFrameCompany(company, companyController).setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Esa empresa no está registrada aquí", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "¿Has probado a meter datos, o también tengo que explicártelo?", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }

    /**
     * Abre un Frame para crear una cuenta de usuario o empresa al pinchar sobre
     * el
     *
     * @param evt
     */
    private void jLabelCreateAccMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCreateAccMouseClicked
        new JFrameCreateAccount(this.userController, this.jToggleButtonCompany.isSelected()).setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabelCreateAccMouseClicked

    /**
     * Cambia el título del text field en función de si se está intentando
     * iniciar sesión con un perfil de usuario o empresa
     *
     * @param evt no usado
     */
    private void jToggleButtonCompanyItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jToggleButtonCompanyItemStateChanged
        // TODO add your handling code here:
        if (this.jToggleButtonCompany.isSelected()) {
            TitledBorder border = (TitledBorder) (((CompoundBorder) this.jTextFieldEmail.getBorder()).getOutsideBorder());
            border.setTitle("Nombre de la compañía");
            this.jTextFieldEmail.setBorder(new CompoundBorder(border, null));
        } else {
            TitledBorder border = (TitledBorder) (((CompoundBorder) this.jTextFieldEmail.getBorder()).getOutsideBorder());
            border.setTitle("Email o Teléfono");
            this.jTextFieldEmail.setBorder(new CompoundBorder(border, null));
        }
    }//GEN-LAST:event_jToggleButtonCompanyItemStateChanged

    /**
     * Abre un Frame en caso de que hayas olvidado tu contraseña
     *
     * @param evt no usado
     */
    private void jLabelForgotPasswdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelForgotPasswdMouseClicked
        new JFrameForgotPassword(this).setVisible(true);
    }//GEN-LAST:event_jLabelForgotPasswdMouseClicked

    /**
     * Pone el texto en negrita al acercar el ratón al label
     *
     * @param evt no usado
     */
    private void jLabelForgotPasswdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelForgotPasswdMouseEntered
        Utils.mouseEntered(jLabelForgotPasswd);
    }//GEN-LAST:event_jLabelForgotPasswdMouseEntered

    /**
     * Pone el texto en plano al alejar el ratón del label
     *
     * @param evt no usado
     */
    private void jLabelForgotPasswdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelForgotPasswdMouseExited
        Utils.mouseExited(jLabelForgotPasswd);
    }//GEN-LAST:event_jLabelForgotPasswdMouseExited

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            JFrameLogIn logIn = new JFrameLogIn();
            logIn.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLogIn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCreateAcc;
    private javax.swing.JLabel jLabelForgotPasswd;
    private javax.swing.JLabel jLabelImg;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JToggleButton jToggleButtonCompany;
    // End of variables declaration//GEN-END:variables
}
