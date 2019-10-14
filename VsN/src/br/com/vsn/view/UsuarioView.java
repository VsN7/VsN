/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vsn.view;

import br.com.vsn.controller.FuncionarioController;
import br.com.vsn.controller.UsuarioController;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vitor
 */
public class UsuarioView extends javax.swing.JInternalFrame {
    UsuarioController uc;
    public static int resp;
    /**
     * Creates new form UsuarioView
     */
    public UsuarioView() {
        uc = new UsuarioController();
        
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int lar = (int) d.getWidth();
        int alt = (int) d.getHeight();
        this.setLocation((lar - this.getSize().width) / 3, (alt - this.getSize().height)/14);
        
        initComponents();
        
        if(uc.getId()!=1){
            salvarButton.setText("Vincular");
        }else{
            salvarButton.setText("Cadastrar");
        }
        
        try {
            this.preencherTabela();
        } catch (Exception ex) {
            Logger.getLogger(UsuarioView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        novoUsuarioPanel = new javax.swing.JPanel();
        loginLabel = new javax.swing.JLabel();
        senhaLabel = new javax.swing.JLabel();
        loginField = new javax.swing.JTextField();
        senhaField = new javax.swing.JPasswordField();
        salvarButton = new javax.swing.JButton();
        removerButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        palavraField = new javax.swing.JTextField();
        loginLabel1 = new javax.swing.JLabel();
        cpfField = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter cpf= new javax.swing.text.MaskFormatter("###.###.###-##");
            cpfField = new javax.swing.JFormattedTextField(cpf);
        }
        catch (Exception e){
        }
        loginLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastro de Usuários");

        novoUsuarioPanel.setBackground(new java.awt.Color(204, 204, 204));

        loginLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        loginLabel.setText("Login ");

        senhaLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        senhaLabel.setText("Senha");

        loginField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        senhaField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        salvarButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        salvarButton.setText("Cadastrar");
        salvarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarButtonActionPerformed(evt);
            }
        });

        removerButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        removerButton.setText("Remover");
        removerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerButtonActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Login", "CPF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setToolTipText("");
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(5);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(130);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(100);
        }

        palavraField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        loginLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        loginLabel1.setText("Palavra de Segurança");

        cpfField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        loginLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        loginLabel2.setText("CPF");

        javax.swing.GroupLayout novoUsuarioPanelLayout = new javax.swing.GroupLayout(novoUsuarioPanel);
        novoUsuarioPanel.setLayout(novoUsuarioPanelLayout);
        novoUsuarioPanelLayout.setHorizontalGroup(
            novoUsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(novoUsuarioPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(novoUsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
                    .addGroup(novoUsuarioPanelLayout.createSequentialGroup()
                        .addComponent(removerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(salvarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(loginField)
                    .addComponent(senhaField)
                    .addComponent(cpfField)
                    .addComponent(palavraField)
                    .addGroup(novoUsuarioPanelLayout.createSequentialGroup()
                        .addGroup(novoUsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loginLabel)
                            .addComponent(senhaLabel)
                            .addComponent(loginLabel2)
                            .addComponent(loginLabel1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        novoUsuarioPanelLayout.setVerticalGroup(
            novoUsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(novoUsuarioPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loginField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(senhaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senhaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loginLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cpfField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loginLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(palavraField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(novoUsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removerButton)
                    .addComponent(salvarButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(novoUsuarioPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(novoUsuarioPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salvarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarButtonActionPerformed
        FuncionarioController fc = new FuncionarioController();
        int idFunc = 0;
        idFunc = fc.retornaCpf(cpfField.getText());
        if(idFunc != 0){
            resp = JOptionPane.showConfirmDialog(null, "Esse CPF já esta cadastrado e vinculado a um funcionário com o id "+idFunc+" !\nCaso prossiga, esse funcionário téra acesso ao sistema\nDeseja continuar?", "Confirmação", JOptionPane.YES_NO_OPTION);
            if (resp == JOptionPane.YES_OPTION) {
                try {
                if (!loginField.getText().isEmpty() && !senhaField.getText().isEmpty() && !palavraField.getText().isEmpty() && !cpfField.getText().isEmpty() ) {
                    uc.salvar(loginField.getText(),senhaField.getText(),cpfField.getText(),palavraField.getText().toUpperCase());
                    int id = uc.pesquisarUnico(cpfField.getText()).get(0).getId();
                    uc.editarFuncionario(idFunc,id,loginField.getText());
                    
                    loginField.setText("");
                    senhaField.setText("");
                    cpfField.setText("");
                    palavraField.setText("");
                    this.preencherTabela();
                    JOptionPane.showMessageDialog(null, "Novo usuario cadastrado com sucesso", "Cadastro", JOptionPane.INFORMATION_MESSAGE);

                } else {
                    JOptionPane.showMessageDialog(null, "Os campos não devem estar vazios!", "Erro", 0);
                }

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Login ou CPF ja existentes", "Erro", 0);
                }
            }
        }else{
            try {
                if(uc.getId()==1){
                    if (!loginField.getText().isEmpty() && !senhaField.getText().isEmpty() && !palavraField.getText().isEmpty() && !cpfField.getText().isEmpty() ) {
                        uc.salvar(loginField.getText(),senhaField.getText(),cpfField.getText(),palavraField.getText().toUpperCase());
                        loginField.setText("");
                        senhaField.setText("");
                        cpfField.setText("");
                        palavraField.setText("");
                        this.preencherTabela();
                        JOptionPane.showMessageDialog(null, "Novo usuario cadastrado com sucesso", "Cadastro", JOptionPane.INFORMATION_MESSAGE);

                    } else {
                        JOptionPane.showMessageDialog(null, "Os campos não devem estar vazios!", "Erro", 0);
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Só é possivel cadastrar usuários que já possuam o CPF vinculado a algum funcionário!", "Erro", 0);
                }

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Login ou CPF ja existentes", "Erro", 0);
            }
        }
    }//GEN-LAST:event_salvarButtonActionPerformed

    private void removerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerButtonActionPerformed
    try {   
            if(valorCollun()==1)
                JOptionPane.showMessageDialog(null, "Impossivel remover esse usuário", "Aviso", JOptionPane.ERROR_MESSAGE);
            else{
                UsuarioController.validador = 0;
                uc.destroy(valorCollun());
                
                uc = new UsuarioController();
                this.preencherTabela();
            }
        } catch (Exception ex) {
            Logger.getLogger(UsuarioView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_removerButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField cpfField;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable1;
    public static javax.swing.JTextField loginField;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JLabel loginLabel1;
    private javax.swing.JLabel loginLabel2;
    private javax.swing.JPanel novoUsuarioPanel;
    public static javax.swing.JTextField palavraField;
    public static javax.swing.JButton removerButton;
    public static javax.swing.JButton salvarButton;
    public static javax.swing.JPasswordField senhaField;
    private javax.swing.JLabel senhaLabel;
    // End of variables declaration//GEN-END:variables

    public void preencherTabela() throws Exception{
        uc = new UsuarioController();
        DefaultTableModel modelo;
        modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setNumRows(0);
        for(int i=0; i<uc.getUsuarios().size(); i++){
            modelo.addRow(new Object[]{
             uc.getUsuarios().get(i).getId(),
             uc.getUsuarios().get(i).getLogin(),
             uc.getUsuarios().get(i).getCpf(),
             });
        }
        
    }
    
    public int valorCollun(){
        int row = jTable1.getSelectedRow();
        Object value = null;
        String converteValueString = "";
        int id;
         if (row > -1) { //então tem ítem selecionado
             value = jTable1.getValueAt(row, 0);
         }
         converteValueString = ""+value;
         id = Integer.parseInt(converteValueString);
         return id;
   }

}
