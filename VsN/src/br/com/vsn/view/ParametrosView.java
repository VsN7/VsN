/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vsn.view;

import br.com.vsn.controller.ParametroController;
import br.com.vsn.controller.UsuarioController;
import br.com.vsn.model.Parametro;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author vitor
 */
public class ParametrosView extends javax.swing.JInternalFrame {

    
    ParametroController pc;
    Parametro parametro;
    UsuarioController uc;
    public ParametrosView() {
        parametro = new Parametro();
        pc = new ParametroController();
        uc = new UsuarioController();
        initComponents();
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int lar = (int) d.getWidth();
        int alt = (int) d.getHeight();
        this.setLocation((lar - this.getSize().width) / 2, (alt - this.getSize().height)/6);
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
        comboTema = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        inputTecla = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Parâmetros");

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Escolha o tema que mais lhe agradar");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Tema");

        comboTema.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboTema.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Padrão", "Dark", "Sky Blue", "Desert Red", "Esmeralda", "Nimbus", "Motilos", "Silver", "Royal", "BrownSugar" }));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Escolha um botão padrão para o filtro");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Tecla do filtro (tecla padrão F11)");

        inputTecla.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputTecla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inputTeclaKeyPressed(evt);
            }
        });

        jToggleButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jToggleButton1.setText("Salvar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputTecla)
                    .addComponent(comboTema, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboTema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputTecla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jToggleButton1)
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

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        
        if(inputTecla.getText().isEmpty()){
            parametro.setTecla(112);
            parametro.setTema(comboTema.getSelectedIndex());
            try{
                if(pc.pesquisarUnico(uc.getId())==null){
                    pc.salvar(parametro);
                    MenuView.teclaPesquisa = parametro.getTecla();
                }else{
                    parametro.setId(pc.pesquisarUnico(uc.getId()).getId());
                    pc.edit(parametro);
                    MenuView.teclaPesquisa = parametro.getTecla();
                }
                
            }catch(Exception e){
               JOptionPane.showMessageDialog(rootPane, "Falha ao salvar alterções!", "Aviso", JOptionPane.ERROR_MESSAGE, null);
            }
        }else{
            parametro.setTema(comboTema.getSelectedIndex());
            try{
                if(pc.pesquisarUnico(uc.getId())==null){
                    pc.salvar(parametro);
                    MenuView.teclaPesquisa = parametro.getTecla();
                }else{
                    parametro.setId(pc.pesquisarUnico(uc.getId()).getId());
                    pc.edit(parametro);
                    MenuView.teclaPesquisa = parametro.getTecla();
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(rootPane, "Falha ao salvar alterções!", "Aviso", JOptionPane.ERROR_MESSAGE, null);
            }
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void inputTeclaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputTeclaKeyPressed
        parametro.setTecla(this.teclaSelecionada(evt));
        inputTecla.setEditable(false);
        inputTecla.setText(""+evt.getKeyChar());
    }//GEN-LAST:event_inputTeclaKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboTema;
    private javax.swing.JTextField inputTecla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables


    public void exibirDados(){
        comboTema.setSelectedIndex(parametro.getTema());
    }
    
    private int teclaSelecionada(java.awt.event.KeyEvent evt){
        int key = evt.getKeyCode();
        return key;
    }
    
}
