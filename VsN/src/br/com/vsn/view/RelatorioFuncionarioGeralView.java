/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vsn.view;

import br.com.vsn.controller.FuncionarioController;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author vitor
 */
public class RelatorioFuncionarioGeralView extends javax.swing.JInternalFrame {

    private FuncionarioController fc;
    private String situacao;
    private int id;
    private String nome;
    
    public RelatorioFuncionarioGeralView() {
        fc = new FuncionarioController();
        initComponents();
        
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int lar = (int) d.getWidth();
        int alt = (int) d.getHeight();
        this.setLocation((lar - this.getSize().width) / 2, (alt - this.getSize().height)/6);
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getSituacao() {
        return situacao;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        comboSituacao = new javax.swing.JComboBox<>();
        buttonImprimir = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        inputNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        inputId = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Funcionarios Geral");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Filtro de Funcionarios Geral");

        comboSituacao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboSituacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Ativo", "Inativo" }));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${mes}"), comboSituacao, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        comboSituacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSituacaoActionPerformed(evt);
            }
        });

        buttonImprimir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonImprimir.setText("Imprimir");
        buttonImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonImprimirActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Situação");

        inputNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inputNomeKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Nome");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("ID");

        inputId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inputIdKeyPressed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(inputId, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboSituacao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(buttonImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(buttonImprimir)
                .addGap(29, 29, 29))
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

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboSituacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSituacaoActionPerformed
       
    }//GEN-LAST:event_comboSituacaoActionPerformed

    private void buttonImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonImprimirActionPerformed
        try{
            if(!inputId.getText().equals("")){
                situacao="não tem";
                nome = "%";
                id = Integer.parseInt(inputId.getText());
                fc.relatorioFuncionarioGeral(id, nome, situacao);
            }else if(inputId.getText().equals("") && inputNome.getText().equals("") && comboSituacao.getSelectedIndex()==0){
                id=0;
                situacao="%";
                nome = "%";
                fc.relatorioFuncionarioGeral(id, nome, situacao);
            }else{
                if(comboSituacao.getSelectedIndex() == 0){
                    situacao="%";
                }else{
                    situacao=comboSituacao.getSelectedItem().toString().toLowerCase()+"%"; 
                }
                nome =inputNome.getText().toLowerCase()+"%";
                id=0;
                fc.relatorioFuncionarioGeral(id, nome, situacao);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Informe os dados corretamente!", "Aviso", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonImprimirActionPerformed

    private void inputIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputIdKeyPressed

    }//GEN-LAST:event_inputIdKeyPressed

    private void inputNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputNomeKeyPressed
        if (evt.getKeyCode() == evt.VK_F1) {  
                try {
                    PesquisarFuncionarioView pv = new PesquisarFuncionarioView();
                    this.getParent().add(pv);
                    pv.setVisible(true);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Falha ao tentar acessar o banco de dados", "Aviso", JOptionPane.ERROR_MESSAGE);
                }
            }
    }//GEN-LAST:event_inputNomeKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton buttonImprimir;
    private javax.swing.JComboBox<String> comboSituacao;
    public static javax.swing.JTextField inputId;
    public static javax.swing.JTextField inputNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
