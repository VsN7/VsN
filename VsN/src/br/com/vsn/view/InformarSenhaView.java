/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vsn.view;

import br.com.vsn.util.JanelaDialogo;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author vitor
 */
public class InformarSenhaView extends javax.swing.JInternalFrame {

    /**
     * Creates new form InformarSenha
     */
    public InformarSenhaView() {
        
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int lar = (int) d.getWidth();
        int alt = (int) d.getHeight();
        this.setLocation((lar - this.getSize().width) / 4, (alt - this.getSize().height)/8);
        
        initComponents();
        
        inputLogin.setText(FuncionarioView.inputLogin.getText());
        inputLogin.setEditable(false);
        inputCpf.setText(FuncionarioView.inputCpf.getText());
        inputCpf.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        inputLogin = new javax.swing.JTextField();
        salvarButton = new javax.swing.JButton();
        inputPalavraSeguranca = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        inputSenha = new javax.swing.JPasswordField();
        inputSenhaNovamente = new javax.swing.JPasswordField();
        inputCpf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastro de Senha");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Informe a Senha");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Informe a Senha Novamente");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Seu Login");

        inputLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        salvarButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        salvarButton.setText("Salvar");
        salvarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarButtonActionPerformed(evt);
            }
        });

        inputPalavraSeguranca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Digite uma Palavra de Segurança (Sera utilizada em caso de esquecer a senha)");

        inputSenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        inputSenhaNovamente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        inputCpf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Seu CPF");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputCpf, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(inputLogin)
                    .addComponent(inputSenha)
                    .addComponent(inputSenhaNovamente)
                    .addComponent(inputPalavraSeguranca)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(salvarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputSenhaNovamente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputPalavraSeguranca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(salvarButton, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salvarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarButtonActionPerformed
        if(salvarButton.getText().equals("Salvar")){
            if(!inputSenha.getText().isEmpty() && !inputSenhaNovamente.getText().isEmpty() && !inputPalavraSeguranca.getText().isEmpty() ){
                if(inputSenha.getText().equals(inputSenhaNovamente.getText())){
                    FuncionarioView.senha = inputSenha.getText();
                    FuncionarioView.palavraSergurnca = inputPalavraSeguranca.getText();
                    JOptionPane.showMessageDialog(null, "Senha cadastrada com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    JanelaDialogo.dialogoEnd.dispose();
                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "As senhas não estão iguais!", "Aviso", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos", "Aviso", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            if(salvarButton.getText().equals("Alterar")){
                if(!inputSenha.getText().isEmpty() && !inputSenhaNovamente.getText().isEmpty() && !inputPalavraSeguranca.getText().isEmpty() ){
                if(inputSenha.getText().equals(inputSenhaNovamente.getText())){
                    FuncionarioView.senha = inputSenha.getText();
                    FuncionarioView.palavraSergurnca = inputPalavraSeguranca.getText();
                    JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    JanelaDialogo.dialogoEnd.dispose();
                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "As senhas não estão iguais!", "Aviso", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos", "Aviso", JOptionPane.ERROR_MESSAGE);
            }
            }
        }
    }//GEN-LAST:event_salvarButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField inputCpf;
    public static javax.swing.JTextField inputLogin;
    public static javax.swing.JTextField inputPalavraSeguranca;
    public static javax.swing.JPasswordField inputSenha;
    public static javax.swing.JPasswordField inputSenhaNovamente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JButton salvarButton;
    // End of variables declaration//GEN-END:variables
}
