
package br.com.vsn.view;

import br.com.vsn.controller.UsuarioController;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.FocusEvent;
import javax.swing.ImageIcon;
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
        
        this.getContentPane().setBackground(Color.black);
        loginButton.setForeground(Color.WHITE);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        labelRecuperarSenha = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        senhaField = new javax.swing.JPasswordField();
        loginField = new javax.swing.JTextField();
        buttonSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VersuS");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(0, 0, 0));
        setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        setForeground(java.awt.Color.white);
        setIconImage(new ImageIcon(getClass().getResource("/icon/conserto.png")).
            getImage());
        setUndecorated(true);
        setOpacity(0.95F);

        labelRecuperarSenha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelRecuperarSenha.setForeground(new java.awt.Color(255, 255, 255));
        labelRecuperarSenha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelRecuperarSenha.setText("Recuperar o Acesso");
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

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/senha2.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/lock.png"))); // NOI18N

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/vs.png"))); // NOI18N

        loginButton.setBackground(new java.awt.Color(0, 204, 51));
        loginButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Efetuar Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        senhaField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        senhaField.setForeground(new java.awt.Color(153, 153, 153));
        senhaField.setText("Senha");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${uc.usuario.senha}"), senhaField, org.jdesktop.beansbinding.BeanProperty.create("text"));
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

        loginField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        loginField.setForeground(new java.awt.Color(153, 153, 153));
        loginField.setText("Login");
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

        buttonSair.setBackground(new java.awt.Color(255, 0, 0));
        buttonSair.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonSair.setForeground(new java.awt.Color(255, 255, 255));
        buttonSair.setText("Sair");
        buttonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(buttonSair, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loginButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(loginField)
                            .addComponent(senhaField, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
            .addComponent(labelRecuperarSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loginField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(senhaField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(loginButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonSair)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelRecuperarSenha)
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
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

    private void buttonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_buttonSairActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonSair;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel labelRecuperarSenha;
    private javax.swing.JButton loginButton;
    private javax.swing.JTextField loginField;
    private javax.swing.JPasswordField senhaField;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
