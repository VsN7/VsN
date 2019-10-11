/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vsn.view;

import br.com.vsn.controller.ContaController;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

/**
 *
 * @author Vitor
 */
public class FiltroRelatorioContasReceberView extends javax.swing.JInternalFrame {

    String situacao;
    String titulo;
    String cliente;
    String dataInicio;
    String dataFim;
    
    /**
     * Creates new form filtroDataRelatorioView
     */
    public FiltroRelatorioContasReceberView() {
        
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        double lar = d.getWidth();
        int alt = (int) d.getHeight();
        this.setLocation((int) ((lar - this.getSize().width) / 3), (alt - this.getSize().height)/10);
        
        initComponents();
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
        inputDataInicio = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter dataInicio= new javax.swing.text.MaskFormatter("##/##/####");
            inputDataInicio = new javax.swing.JFormattedTextField(dataInicio);
        }
        catch (Exception e){
        }
        inputDataFinal = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter dataFinal= new javax.swing.text.MaskFormatter("##/##/####");
            inputDataFinal = new javax.swing.JFormattedTextField(dataFinal);
        }
        catch (Exception e){
        }
        jLabel4 = new javax.swing.JLabel();
        ButtonGerarRelatorio = new javax.swing.JButton();
        ImageIcon iconOrcamento = new ImageIcon(getClass().getResource("/icon/calendario.jpg")); Image imagem = iconOrcamento.getImage();
        jLabel3 = new javax.swing.JLabel(){
            public void paintComponent(Graphics g){
                g.drawImage(imagem,0,0,getWidth(),getHeight(),this);
            }
        };
        ImageIcon iconOrcamento2 = new ImageIcon(getClass().getResource("/icon/calendario.jpg")); Image imagem2 = iconOrcamento2.getImage();
        jLabel5 = new javax.swing.JLabel(){
            public void paintComponent(Graphics g){
                g.drawImage(imagem,0,0,getWidth(),getHeight(),this);
            }
        };
        jLabel6 = new javax.swing.JLabel();
        comboSituacao = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        inputId = new javax.swing.JTextField();
        inputTitulo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        inputCliente = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Relatório Contas a Receber");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Filtro Contas a Receber");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Vencimento De:");

        inputDataInicio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputDataInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputDataInicioActionPerformed(evt);
            }
        });

        inputDataFinal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Até");

        ButtonGerarRelatorio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ButtonGerarRelatorio.setText("Gerar Relatório");
        ButtonGerarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonGerarRelatorioActionPerformed(evt);
            }
        });

        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });

        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Situação:");

        comboSituacao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboSituacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TODOS", "ABERTOS", "FECHADOS" }));
        comboSituacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSituacaoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("ID:");

        inputId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inputIdKeyPressed(evt);
            }
        });

        inputTitulo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputTitulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inputTituloKeyPressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Titulo:");

        inputCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inputClienteKeyPressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Cliente:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(inputId, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inputTitulo))
                            .addComponent(inputCliente)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(inputDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputDataFinal, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboSituacao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(ButtonGerarRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(inputTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(inputId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(inputCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(inputDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(comboSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(ButtonGerarRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputDataInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputDataInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputDataInicioActionPerformed

    private void ButtonGerarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonGerarRelatorioActionPerformed
        try{
            int id = 0;
            ContaController cc = new ContaController();
            if(!inputId.getText().isEmpty()){
                id = Integer.parseInt(inputId.getText());
                cc.relatorioContaReceber("","22/02/8000","21/02/9000","",id,"");
            }
            else if(comboSituacao.getSelectedItem().toString().equals("TODOS")){
                situacao = "%";
                this.validaVazio();
                cc.relatorioContaReceber(situacao,dataInicio,dataFim,titulo,id,cliente);
            }else if(comboSituacao.getSelectedItem().toString().equals("ABERTOS")){
                situacao = "ABERTO" + "%";
                this.validaVazio();
                System.out.println("datai::"+dataInicio+" dataf::"+dataFim);
                cc.relatorioContaReceber(situacao,dataInicio,dataFim,titulo,id,cliente);
            }else if(comboSituacao.getSelectedItem().toString().equals("FECHADOS")){
                situacao = "FECHADO" + "%";
                this.validaVazio();
                cc.relatorioContaReceber(situacao,dataInicio,dataFim,titulo,id,cliente);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Informe os dados corretamente!", "Aviso", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_ButtonGerarRelatorioActionPerformed

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        CalendarView cv = new CalendarView();
        this.getParent().add(cv);  
        cv.setVisible(true);
        cv.setaCalendarFiltroRelatorioContasReceberInicio();
    }//GEN-LAST:event_jLabel3MousePressed

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
        CalendarView cv = new CalendarView();
        this.getParent().add(cv);  
        cv.setVisible(true);
        cv.setaCalendarFiltroRelatorioContasReceberDataFinal();
    }//GEN-LAST:event_jLabel5MousePressed

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        jLabel3.setBorder(new LineBorder(new Color(230, 40, 70), 2, true));
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        jLabel3.setBorder(new LineBorder(Color.black, 2, true));
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        jLabel5.setBorder(new LineBorder(new Color(230, 40, 70), 2, true));
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        jLabel5.setBorder(new LineBorder(Color.black, 2, true));
    }//GEN-LAST:event_jLabel5MouseExited

    private void comboSituacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSituacaoActionPerformed
        
    }//GEN-LAST:event_comboSituacaoActionPerformed

    private void inputIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputIdKeyPressed
        if (evt.getKeyCode() == MenuView.teclaPesquisa) {   
            try {
                PesquisarContaReceberView pcrv = new PesquisarContaReceberView();
                this.getParent().add(pcrv);
                pcrv.setVisible(true);
                PesquisarContaReceberView.validador = 1;
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Falha ao tentar acessar o banco de dados", "Aviso", JOptionPane.ERROR_MESSAGE);
                }
        }
    }//GEN-LAST:event_inputIdKeyPressed

    private void inputTituloKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputTituloKeyPressed
        if (evt.getKeyCode() == MenuView.teclaPesquisa) {   
            try {
                PesquisarContaReceberView pcrv = new PesquisarContaReceberView();
                this.getParent().add(pcrv);
                pcrv.setVisible(true);
                PesquisarContaReceberView.validador = 1;
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Falha ao tentar acessar o banco de dados", "Aviso", JOptionPane.ERROR_MESSAGE);
                }
        }
    }//GEN-LAST:event_inputTituloKeyPressed

    private void inputClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputClienteKeyPressed
        if (evt.getKeyCode() == MenuView.teclaPesquisa) {   
            try {
                PesquisarContaReceberView pcrv = new PesquisarContaReceberView();
                this.getParent().add(pcrv);
                pcrv.setVisible(true);
                PesquisarContaReceberView.validador = 1;
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Falha ao tentar acessar o banco de dados", "Aviso", JOptionPane.ERROR_MESSAGE);
                }
        }
    }//GEN-LAST:event_inputClienteKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonGerarRelatorio;
    private javax.swing.JComboBox<String> comboSituacao;
    public static javax.swing.JTextField inputCliente;
    public static javax.swing.JTextField inputDataFinal;
    public static javax.swing.JTextField inputDataInicio;
    public static javax.swing.JTextField inputId;
    public static javax.swing.JTextField inputTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    public void validaVazio(){
        if(inputTitulo.getText().isEmpty())
                    titulo = "%";
                else
                    titulo = inputTitulo.getText()+"%";
                if(inputCliente.getText().isEmpty())
                    cliente = "%";
                else
                    cliente = inputCliente.getText()+"%";
                if(inputDataInicio.getText().equals("  /  /    "))
                    dataInicio = "22/02/1000";
                else
                    dataInicio = inputDataInicio.getText();
                if(inputDataFinal.getText().equals("  /  /    "))
                    dataFim = "22/02/9999";
                else
                    dataFim = inputDataFinal.getText();
                
    }
}
