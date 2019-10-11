
package br.com.vsn.view;

import br.com.vsn.controller.ClienteController;
import br.com.vsn.controller.UsuarioController;
import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import static java.awt.SystemColor.window;
import java.awt.event.FocusEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author vitor
 */
public class LoginView extends javax.swing.JFrame {

    UsuarioController uc = new UsuarioController();
    public LoginView() {
        uc = new UsuarioController();
        initComponents();
    }
    
    public void focusGained(FocusEvent e) {
        if (loginField.getText().equals("Search")) {
            loginField.setText("");
            loginField.setForeground(Color.BLACK);
        }
    }
    
    public void focusLost(FocusEvent e) {
        if (loginField.getText().isEmpty()) {
            loginField.setForeground(Color.GRAY);
            loginField.setText("Search");
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        loginPanel = new javax.swing.JPanel();
        loginField = new javax.swing.JTextField();
        senhaField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        labelRecuperarSenha = new javax.swing.JLabel();

        setTitle("VersuS");
        setBackground(new java.awt.Color(0, 0, 0));
        setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        setIconImage(new ImageIcon(getClass().getResource("/icon/conserto.png")).
            getImage());

        loginPanel.setBackground(new java.awt.Color(0, 0, 0));
        loginPanel.setToolTipText("");

        loginField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        loginField.setToolTipText("");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${uc.usuario.login}"), loginField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        loginField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                loginFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                loginFieldFocusLost(evt);
            }
        });
        loginField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loginFieldKeyPressed(evt);
            }
        });

        senhaField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${uc.usuario.senha}"), senhaField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        senhaField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                senhaFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                senhaFieldFocusLost(evt);
            }
        });
        senhaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaFieldActionPerformed(evt);
            }
        });
        senhaField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                senhaFieldKeyPressed(evt);
            }
        });

        loginButton.setBackground(new java.awt.Color(255, 255, 255));
        loginButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        loginButton.setText("Efetuar Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/vs.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/lock.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/senha2.png"))); // NOI18N

        labelRecuperarSenha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelRecuperarSenha.setForeground(new java.awt.Color(255, 255, 255));
        labelRecuperarSenha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelRecuperarSenha.setText("Recuperar a Senha");
        labelRecuperarSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelRecuperarSenhaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelRecuperarSenhaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                labelRecuperarSenhaMousePressed(evt);
            }
        });

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(senhaField)
                            .addComponent(loginField)))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(labelRecuperarSenha)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(senhaField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(loginButton)
                .addGap(18, 18, 18)
                .addComponent(labelRecuperarSenha)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        bindingGroup.bind();

        setSize(new java.awt.Dimension(285, 440));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        try {
            if(uc.efetuarLogin(loginField.getText(),senhaField.getText())){
                JOptionPane.showMessageDialog(null, "BEM VINDO "+loginField.getText().toUpperCase(), "Login", JOptionPane.INFORMATION_MESSAGE);
                MenuView mv = new MenuView();
                mv.setVisible(true);
                this.dispose();
            }
            else
            JOptionPane.showMessageDialog(null, "Loguin ou senha incorretos", "Aviso", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Falha ao tentar acessar o banco de dados", "Aviso", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void senhaFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_senhaFieldKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            try {
                if(uc.efetuarLogin(loginField.getText(),senhaField.getText())){
                    JOptionPane.showMessageDialog(null, "BEM VINDO "+loginField.getText().toUpperCase(), "Login", JOptionPane.INFORMATION_MESSAGE);
                    MenuView mv = new MenuView();
                    mv.setVisible(true);
                    this.dispose();
                }
                else
                JOptionPane.showMessageDialog(null, "Loguin ou senha incorretos", "Aviso", JOptionPane.ERROR_MESSAGE);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Falha ao tentar acessar o banco de dados", "Aviso", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_senhaFieldKeyPressed

    private void loginFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginFieldKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            try {
                if(uc.efetuarLogin(loginField.getText(),senhaField.getText())){
                    JOptionPane.showMessageDialog(null, "BEM VINDO "+loginField.getText().toUpperCase(), "Login", JOptionPane.INFORMATION_MESSAGE);
                    MenuView mv = new MenuView();
                    mv.setVisible(true);
                    this.dispose();
                }
                else
                    JOptionPane.showMessageDialog(null, "Loguin ou senha incorretos", "Aviso", JOptionPane.ERROR_MESSAGE);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Falha ao tentar acessar o banco de dados", "Aviso", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_loginFieldKeyPressed

    private void loginFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_loginFieldFocusGained
        if (loginField.getText().equals("Login")) {
            loginField.setText("");
            loginField.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_loginFieldFocusGained

    private void loginFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_loginFieldFocusLost
        if (loginField.getText().isEmpty()) {
            loginField.setForeground(Color.GRAY);
            loginField.setText("Login");
        }
    }//GEN-LAST:event_loginFieldFocusLost

    private void senhaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaFieldActionPerformed
        
    }//GEN-LAST:event_senhaFieldActionPerformed

    private void senhaFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_senhaFieldFocusGained
        if (senhaField.getText().equals("Senha")) {
            
            senhaField.setText("");
            senhaField.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_senhaFieldFocusGained

    private void senhaFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_senhaFieldFocusLost
        if (senhaField.getText().isEmpty()) {
            senhaField.setVisible(true);
            senhaField.setForeground(Color.GRAY);
            senhaField.setText("Senha");
        }
    }//GEN-LAST:event_senhaFieldFocusLost

    private void labelRecuperarSenhaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelRecuperarSenhaMousePressed
        RecuperarAcessoView rav = new RecuperarAcessoView();
        rav.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_labelRecuperarSenhaMousePressed

    private void labelRecuperarSenhaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelRecuperarSenhaMouseEntered
        labelRecuperarSenha.setForeground(new Color(180, 180, 180));
    }//GEN-LAST:event_labelRecuperarSenhaMouseEntered

    private void labelRecuperarSenhaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelRecuperarSenhaMouseExited
        labelRecuperarSenha.setForeground(Color.white);
    }//GEN-LAST:event_labelRecuperarSenhaMouseExited

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel labelRecuperarSenha;
    private javax.swing.JButton loginButton;
    private javax.swing.JTextField loginField;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPasswordField senhaField;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
