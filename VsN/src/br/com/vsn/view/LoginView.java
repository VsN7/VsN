
package br.com.vsn.view;

import br.com.vsn.controller.ClienteController;
import br.com.vsn.controller.UsuarioController;
import java.awt.Color;
import java.awt.Graphics;
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
        ImageIcon iconOrcamento = new ImageIcon(getClass().getResource("/icon/persona.png")); Image imagem = iconOrcamento.getImage();
        jLabel4 = new javax.swing.JLabel(){
            public void paintComponent(Graphics g){
                g.drawImage(imagem,0,0,getWidth(),getHeight(),this);
            }
        };
        ImageIcon iconOrcamento2 = new ImageIcon(getClass().getResource("/icon/login.png")); Image imagem2 = iconOrcamento2.getImage();
        jLabel5 = new javax.swing.JLabel(){
            public void paintComponent(Graphics g){
                g.drawImage(imagem2,0,0,getWidth(),getHeight(),this);
            }
        };
        ImageIcon iconOrcamento3 = new ImageIcon(getClass().getResource("/icon/senha.png")); Image imagem3 = iconOrcamento3.getImage();
        jLabel6 = new javax.swing.JLabel(){
            public void paintComponent(Graphics g){
                g.drawImage(imagem3,0,0,getWidth(),getHeight(),this);
            }
        };
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VSN");
        setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        setIconImage(new ImageIcon(getClass().getResource("/icon/conserto.png")).
            getImage());

        loginPanel.setBackground(new java.awt.Color(113, 154, 79));

        loginField.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
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

        senhaField.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

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

        loginButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        loginButton.setText("Efetuar Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Recuperar a Senha");

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(loginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loginField)
                            .addComponent(senhaField))
                        .addGap(10, 10, 10))))
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 36, Short.MAX_VALUE))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(loginField, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(senhaField, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(62, 62, 62))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 434, Short.MAX_VALUE)
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

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton loginButton;
    private javax.swing.JTextField loginField;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPasswordField senhaField;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
