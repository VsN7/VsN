/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vsn.view;

import br.com.vsn.controller.ContaController;
import br.com.vsn.controller.OrdemServicoController;
import br.com.vsn.controller.PagamentoController;
import br.com.vsn.controller.PagamentoTabelaController;
import br.com.vsn.controller.UsuarioController;
import br.com.vsn.dao.exceptions.NonexistentEntityException;
import br.com.vsn.model.Conta;
import br.com.vsn.model.Pagamento;
import br.com.vsn.model.PagamentoTabela;
import br.com.vsn.model.Usuario;
import br.com.vsn.util.JanelaDialogo;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vitor
 */
public class PagamentoOsView extends javax.swing.JInternalFrame {
    
    PagamentoController pc;
    PagamentoTabelaController ptc;
    static Pagamento pagamento;
    PagamentoTabela pagamentoTabela;
    NumberFormat formatter;
    public static int validaDestroy=0;
    String situacao;
    double valor;
    public static JMenuItem item2;
    public static JMenuItem item1;
    public static String recibo = "Recibo Padrão";
    
    public PagamentoOsView() {
        formatter = new DecimalFormat("#0.00");
        pc = new PagamentoController();
        ptc = new PagamentoTabelaController();
        pagamento = new Pagamento();
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int lar = (int) d.getWidth();
        int alt = (int) d.getHeight();
        this.setLocation((lar - this.getSize().width) / 4, (alt - this.getSize().height)/8);
        
        
        initComponents();
        this.exibirDados();
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
        jLabel19 = new javax.swing.JLabel();
        inputValorTotal = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        inputSituacao = new javax.swing.JTextField();
        comboTipoPagamento = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        inputValorPago = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        buttonRemover = new javax.swing.JButton();
        buttonPagamento = new javax.swing.JButton();
        buttonFinalizar = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        checkParcelado = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        comboVezes = new javax.swing.JComboBox<>();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        labelValorRestante = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        labelTroco = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        buttonCancelar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Pagamento");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Dados do Pagamento");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 494, -1));

        inputValorTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputValorTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputValorTotalActionPerformed(evt);
            }
        });
        jPanel1.add(inputValorTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 51, 195, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Valor Total");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 28, -1, -1));

        inputSituacao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputSituacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputSituacaoActionPerformed(evt);
            }
        });
        jPanel1.add(inputSituacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 51, 261, -1));

        comboTipoPagamento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboTipoPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dinheiro", "Cartão Crédito", "Cartão Débito", "Outro" }));
        comboTipoPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoPagamentoActionPerformed(evt);
            }
        });
        jPanel1.add(comboTipoPagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 113, 474, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Tipo de Finalizador");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 85, -1, -1));

        inputValorPago.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputValorPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputValorPagoActionPerformed(evt);
            }
        });
        jPanel1.add(inputValorPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 226, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Valor Pago");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 147, -1, -1));

        buttonRemover.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonRemover.setText("Remover Pagamento");
        buttonRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemoverActionPerformed(evt);
            }
        });
        jPanel1.add(buttonRemover, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 211, -1, 37));

        buttonPagamento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonPagamento.setText("Adicionar Pagamento");
        buttonPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPagamentoActionPerformed(evt);
            }
        });
        jPanel1.add(buttonPagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 211, -1, 37));

        buttonFinalizar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonFinalizar.setText("Finalizar Pagamento");
        buttonFinalizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonFinalizarMouseClicked(evt);
            }
        });
        buttonFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFinalizarActionPerformed(evt);
            }
        });
        jPanel1.add(buttonFinalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 423, 190, 33));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Situação");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 28, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Parcelado");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 147, -1, -1));

        checkParcelado.setBackground(new java.awt.Color(204, 204, 204));
        checkParcelado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkParceladoActionPerformed(evt);
            }
        });
        jPanel1.add(checkParcelado, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 172, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Vezes");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 147, -1, -1));

        comboVezes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboVezes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 vez", "2 vezes", "3 vezes", "4 vezes" }));
        comboVezes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboVezesActionPerformed(evt);
            }
        });
        jPanel1.add(comboVezes, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 170, 153, -1));

        jLayeredPane1.setBackground(new java.awt.Color(0, 255, 204));
        jLayeredPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Finalizador", "Valor", "Parcelas"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        labelValorRestante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelValorRestante.setText("899999,00");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Valor Restante: R$");

        labelTroco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelTroco.setText("0,00");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Troco: R$");

        jLayeredPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(labelValorRestante, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel20, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(labelTroco, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel21, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelValorRestante, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labelTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel21))
                            .addComponent(labelValorRestante, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1.add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 266, -1, -1));

        buttonCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonCancelar.setText("Excluir Pagamento");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(buttonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 423, 190, 33));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputValorTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputValorTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputValorTotalActionPerformed

    private void inputSituacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputSituacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputSituacaoActionPerformed

    private void inputValorPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputValorPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputValorPagoActionPerformed

    private void buttonRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoverActionPerformed
        try {
            validaDestroy = 2;
            ptc.destroy(valorCollun());
            this.exibirDados();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Primeiro selecione algum item", "Aviso", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_buttonRemoverActionPerformed

    private void buttonPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPagamentoActionPerformed

        try {
            if(Double.parseDouble(inputValorPago.getText().replace(",", "."))>0){
                pagamentoTabela = new PagamentoTabela();
                pagamentoTabela.setValor(Double.parseDouble(inputValorPago.getText().replace(",", ".")));
                pagamentoTabela.setFinalizador((String) comboTipoPagamento.getSelectedItem());
                pagamentoTabela.setParcelas((String) comboVezes.getSelectedItem());
                pagamentoTabela.setOrdemServico_id(Integer.parseInt(OrdemServicoView.inputId.getText()));
                ptc.salvarPagamentoTabela(pagamentoTabela);
                this.exibirDados();
                limparCampos();
            }else{
                JOptionPane.showMessageDialog(null, "Valor inválido", "Aviso", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Insira um valor válido no campo Valor Pago", "Aviso", JOptionPane.ERROR_MESSAGE);
          }
    }//GEN-LAST:event_buttonPagamentoActionPerformed

    private void checkParceladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkParceladoActionPerformed
        if(this.checkParcelado.isSelected()){
            comboVezes.setEnabled(true);
         //   pc.getPagamento().setVezes(1);
        }else{
            comboVezes.setEnabled(false);
            comboVezes.setSelectedIndex(0);
         ///   pc.getPagamento().setVezes(1);
        }
    }//GEN-LAST:event_checkParceladoActionPerformed

    private void comboVezesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboVezesActionPerformed
      //  pc.getPagamento().setVezes(comboVezes.getSelectedIndex()+1);
    }//GEN-LAST:event_comboVezesActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        if(buttonFinalizar.getText().equals("Imprimir Recibo")){
            try {
                pagamento.setDataFinalizacao(null);
                pagamento.setSituacao("ABERTO");
                pc.editPagamento(pagamento.getId(), pagamento);
                
                this.exibirDados();
                
            } catch (Exception ex) {
                Logger.getLogger(PagamentoOsView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            try {
                int idPag = pagamento.getId();
                pc.destroy(idPag);
                if(PagamentoController.resp == JOptionPane.YES_OPTION){
                    idPag = ptc.getPagamentoTabelas().size();
                    validaDestroy = 1;
                    for(int i =0; i< idPag;i++){
                        ptc = new PagamentoTabelaController();
                        ptc.destroy(ptc.getPagamentoTabelas().get(0).getId());
                    }
                    validaDestroy = 0;
                    OrdemServicoController osc = new OrdemServicoController();
                    try {
                        OrdemServicoView.ordemServico.setSituacao("ABERTO");
                        osc.editOrdemServico(Integer.parseInt(OrdemServicoView.inputId.getText()), OrdemServicoView.ordemServico);
                        PesquisarOrdemServicoView posv = new PesquisarOrdemServicoView();
                        PesquisarOrdemServicoView.ordemServico = OrdemServicoView.ordemServico;
                        posv.valoresInputOrdemServico();
                        OrdemServicoView.buttonEditar.setEnabled(true);
                        OrdemServicoView.buttonExcluir.setEnabled(true);
                        OrdemServicoView.inputId.setEditable(false);
                        OrdemServicoView.inputSituacao.setEditable(false);
                        OrdemServicoView.buttonCancelar.setEnabled(false);
                        OrdemServicoView.buttonOS.setText("Efetuar Pagamento");
                        JanelaDialogo.dialogoEnd.dispose();
                        osc = new OrdemServicoController();
                        this.dispose();
                    } catch (Exception ex) {
                        Logger.getLogger(PagamentoOsView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            } catch (NonexistentEntityException ex) {
                Logger.getLogger(PagamentoOsView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void comboTipoPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoPagamentoActionPerformed
        if(comboTipoPagamento.getSelectedIndex()== 0 || comboTipoPagamento.getSelectedIndex()== 2 ){
            checkParcelado.setEnabled(false);
            checkParcelado.setSelected(false);
            comboVezes.setSelectedIndex(0);
            comboVezes.setEnabled(false);
        }else{
            checkParcelado.setEnabled(true);
        }
    }//GEN-LAST:event_comboTipoPagamentoActionPerformed

    private void buttonFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFinalizarActionPerformed
        if(labelValorRestante.getText().equals("0,00") && buttonFinalizar.getText().equals("Finalizar Pagamento")){
            
            try {
                pagamento.setValor(valor);
                Date date = new Date();
                Calendar data = Calendar.getInstance();
                data.setTime(date);
                pagamento.setDataFinalizacao(data);
                pagamento.setSituacao("FECHADO");
                pagamento.setTroco(Double.parseDouble(labelTroco.getText().replace(",", ".")));
                pc.editPagamento(pagamento.getId(), pagamento);
                OrdemServicoView.ordemServico.setSituacao("O.S FINALIZADA");
                OrdemServicoController osc = new OrdemServicoController();
                osc.editOrdemServico(Integer.parseInt(OrdemServicoView.inputId.getText()), OrdemServicoView.ordemServico);
                OrdemServicoView.inputSituacao.setText("O.S FINALIZADA");
                int idPag = ptc.getPagamentoTabelas().size();
                    validaDestroy = 1;
                     int idPagamento = pagamento.getId();
                    for(int i =0; i< idPag;i++){
                        ptc = new PagamentoTabelaController();
                        PagamentoTabela pagamentoTable = ptc.getPagamentoTabelas().get(i);
                        if(pagamentoTable.getFinalizador().equals("Cartão Crédito") || (pagamentoTable.getFinalizador().equals("Outro") && !pagamentoTable.getParcelas().equals("1 vez"))){
                            ContaController cc = new ContaController();
                            Conta conta = new Conta();
                            if(pagamentoTable.getFinalizador().equals("Outro"))
                                conta.setTitulo("FINALIZADOR OUTRO, VINCULADO COM A O.S: "+OrdemServicoView.inputId.getText());
                            else
                                conta.setTitulo("CARTÃO DE CRÉDITO, VINCULADO COM A O.S: "+OrdemServicoView.inputId.getText());
                            int value = Integer.parseInt(String.valueOf(pagamentoTable.getParcelas().charAt(0)));
                            conta.setVezes(value);
                            conta.setValor(pagamentoTable.getValor());
                            Calendar c = Calendar.getInstance();
                            Date d = new Date();
                            c.setTime(d);
                            conta.setDataCompra(c);
                            Calendar vencimento = Calendar.getInstance();
                            vencimento.setTime(conta.getDataCompra().getTime());
                            vencimento.set(Calendar.MONTH,vencimento.get(Calendar.MONTH)+1);
                            conta.setDataVencimento(vencimento);
                            conta.setSituacao("ABERTO");
                            Usuario us = new Usuario();
                            UsuarioController uu = new UsuarioController();
                            us.setId(uu.getId());
                            us.setLogin(uu.getLogin());
                            conta.setUsuario(us);
                            ptc = new PagamentoTabelaController();
                            conta.setPagamento_id(idPagamento);
                            conta.setValorPagar(conta.getValor());
                            conta.setVezesPagar(conta.getVezes());
                            conta.setCliente(OrdemServicoView.inputCliente.getText());
                            cc.salvarContaPagamento(conta);
                        }
                    }
                    
                JOptionPane.showMessageDialog(rootPane, "Pagamento finalizado com successo!", "Sucesso", JOptionPane.INFORMATION_MESSAGE, null);
                this.exibirDados();
            } catch (Exception ex) {
                Logger.getLogger(PagamentoOsView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            if(buttonFinalizar.getText().equals("Imprimir Recibo")){
                if(recibo.equals("Recibo Padrão")){
                    pc.relatorioReciboPadrao(Integer.parseInt(OrdemServicoView.inputId.getText()));
                }else if(recibo.equals("Recibo Manual")){
                    pc.relatorioReciboManual();
                }
            }else{
                JOptionPane.showMessageDialog(null, "Primeiro finalize o pagamento!", "Aviso", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_buttonFinalizarActionPerformed

    private void buttonFinalizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonFinalizarMouseClicked
        
            if(evt.isMetaDown()) {
                item1 = new JMenuItem("Recibo Padrão");
                item1.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        recibo = item1.getText();
                    }
                });
                item2 = new JMenuItem("Recibo Manual");
                item2.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        recibo = item2.getText();
                    }
                });
            JPopupMenu popup = new JPopupMenu();
            popup.add(item1);
            popup.add(item2);
            popup.show(buttonFinalizar, 80, 30);
            }
        
    }//GEN-LAST:event_buttonFinalizarMouseClicked

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    public static javax.swing.JButton buttonFinalizar;
    private javax.swing.JButton buttonPagamento;
    private javax.swing.JButton buttonRemover;
    private javax.swing.JCheckBox checkParcelado;
    public static javax.swing.JComboBox<String> comboTipoPagamento;
    private javax.swing.JComboBox<String> comboVezes;
    public static javax.swing.JTextField inputSituacao;
    public static javax.swing.JTextField inputValorPago;
    public static javax.swing.JTextField inputValorTotal;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelTroco;
    private javax.swing.JLabel labelValorRestante;
    // End of variables declaration//GEN-END:variables

    public void exibirDados(){
        if(ptc.getPagamentoTabelas().size()<=0){
           this.valoresInput();
            inputValorTotal.setText("R$ "+valor);
            inputSituacao.setText(situacao);
            inputValorTotal.setEditable(false);
            inputSituacao.setEditable(false);
            checkParcelado.setEnabled(false);
            labelValorRestante.setText(""+formatter.format(valor));
            try {
                this.preencherTabela();
            } catch (Exception ex) {
                Logger.getLogger(PagamentoOsView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            if(ptc.getPagamentoTabelas().size()<=0){
                
            }else{
                    try {
                    this.valoresInput();
                    inputValorTotal.setText("R$ "+valor);
                    inputSituacao.setText(situacao);
                    inputValorTotal.setEditable(false);
                    inputSituacao.setEditable(false);
                    checkParcelado.setEnabled(false);
                    double valorRestante = pagamento.getValor();
                    for(int i=0; i<ptc.getPagamentoTabelas().size(); i++){
                        valorRestante -= ptc.getPagamentoTabelas().get(i).getValor();
                    }
                    if(valorRestante < 0){
                        valorRestante = valorRestante * (-1);
                        labelTroco.setText(""+formatter.format(valorRestante));
                        valorRestante = 0;
                    }else{
                        labelTroco.setText("0,00");
                    }
                    labelValorRestante.setText(""+formatter.format(valorRestante));
                    this.preencherTabela();
                    if(valorRestante==0){
                        buttonPagamento.setEnabled(false);
                        inputValorPago.setEditable(false);
                        comboTipoPagamento.setEnabled(false);
                    }else{
                        buttonPagamento.setEnabled(true);
                        inputValorPago.setEditable(true);
                        comboTipoPagamento.setEnabled(true);
                    }
                    if(situacao.equals("FECHADO")){
                        buttonFinalizar.setText("Imprimir Recibo");
                        buttonRemover.setEnabled(false);
                        buttonCancelar.setText("Reabrir Pagamento");
                    }else{
                        buttonFinalizar.setText("Finalizar Pagamento");
                        buttonRemover.setEnabled(true);
                        buttonCancelar.setText("Excluir Pagamento");
                    }
                } catch (Exception ex) {
                    Logger.getLogger(PagamentoOsView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        }
        
        if(inputSituacao.getText().equals("FECHADO")){
            inputSituacao.setForeground(Color.red);
        }else{
            inputSituacao.setForeground(Color.blue);
        }
    }
    
    public void valoresInput(){
        pagamento = pc.pesquisarUnico(Integer.parseInt(OrdemServicoView.inputId.getText())).get(0);
        valor = pagamento.getValor();
        situacao = pagamento.getSituacao();
        comboVezes.setEnabled(false);
    }
    
   public void limparCampos(){
       
       inputValorPago.setText("");
       checkParcelado.setSelected(false);
       comboTipoPagamento.setSelectedIndex(0);
       comboVezes.setSelectedIndex(0);
       comboVezes.setEnabled(false);
       
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
   
   public void preencherTabela() throws Exception{
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        ptc = new PagamentoTabelaController();
        DefaultTableModel modelo = (DefaultTableModel)jTable1.getModel();
        modelo.setNumRows(0);
        for(int i=0; i<ptc.getPagamentoTabelas().size(); i++){
            modelo.addRow(new Object[]{
             ptc.getPagamentoTabelas().get(i).getId(),
             ptc.getPagamentoTabelas().get(i).getFinalizador(),
             formatter.format(ptc.getPagamentoTabelas().get(i).getValor()),
             ptc.getPagamentoTabelas().get(i).getParcelas()
             });
        }
        
    }
    
}
