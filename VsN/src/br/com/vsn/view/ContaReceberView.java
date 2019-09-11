
package br.com.vsn.view;

import br.com.vsn.controller.EmpresaController;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

/**
 *
 * @author vitor
 */
public class ContaReceberView extends javax.swing.JInternalFrame {
    
    EmpresaController ec;
    SimpleDateFormat sdf;
    NumberFormat formatter;
    static int index = 0;
    
    
    int id;
    String razaoSocial;
    String nomeFantasia;
    String icms;
    String cnpj;
    String inscricaoEstadual;
    String longradouro;
    int numero;
    String bairro;
    String cidade;
    String estado;
    String cep;
    String telefone;
    String email;
    String situacao;
    
    public ContaReceberView() throws Exception {
        sdf = new SimpleDateFormat("dd/MM/yyyy");
        formatter = new DecimalFormat("#0.00");
        ec = new EmpresaController();
        
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int lar = (int) d.getWidth();
        int alt = (int) d.getHeight();
        this.setLocation((lar - this.getSize().width) / 6, (alt - this.getSize().height)/38);
        initComponents();
        
        if(ec.getEmpresas().size()<=0){
            this.desativarTudo();
            this.ativarButtonCadastrar();
            if(buttonCadastrar.getText().equals("Salvar"))
                this.ativarInputCadastrar();
        }else{
            this.exibirDados();
        }
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        inputId = new javax.swing.JTextField();
        inputValorTotal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        inputParcelas = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        buttonInicio = new javax.swing.JButton();
        buttonAnterior = new javax.swing.JButton();
        buttonProximo = new javax.swing.JButton();
        buttonFinal = new javax.swing.JButton();
        buttonExcluir = new javax.swing.JButton();
        buttonEditar = new javax.swing.JButton();
        buttonSelecionar = new javax.swing.JButton();
        buttonCadastrar = new javax.swing.JButton();
        inputCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        inputCpf = new javax.swing.JTextField();
        inputValorParcela = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        inputSituacao = new javax.swing.JTextField();
        buttonReceber = new javax.swing.JButton();
        inputDataInicio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        inputVencimento = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        inputFormaPagamento = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Contas a Receber");
        setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("ID");

        inputId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputIdActionPerformed(evt);
            }
        });

        inputValorTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputValorTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputValorTotalActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Valor Total");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Qnt. Parcelas");

        inputParcelas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Dados da Conta a Receber");

        buttonInicio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonInicio.setText("|<");
        buttonInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIniciojButton5ActionPerformed(evt);
            }
        });

        buttonAnterior.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonAnterior.setText("<<");
        buttonAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAnteriorjButton6ActionPerformed(evt);
            }
        });

        buttonProximo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonProximo.setText(">>");
        buttonProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonProximojButton7ActionPerformed(evt);
            }
        });

        buttonFinal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonFinal.setText(">|");
        buttonFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFinaljButton8ActionPerformed(evt);
            }
        });

        buttonExcluir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonExcluir.setText("Excluir");
        buttonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirActionPerformed(evt);
            }
        });

        buttonEditar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonEditar.setText("Editar");
        buttonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarActionPerformed(evt);
            }
        });

        buttonSelecionar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonSelecionar.setText("Selecionar");
        buttonSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSelecionarActionPerformed(evt);
            }
        });

        buttonCadastrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonCadastrar.setText("Novo");
        buttonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastrarActionPerformed(evt);
            }
        });

        inputCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputClienteActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Cliente");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("CPF");

        inputCpf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        inputValorParcela.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputValorParcela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputValorParcelaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Valor da Parcela");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Situação");

        inputSituacao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputSituacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputSituacaoActionPerformed(evt);
            }
        });

        buttonReceber.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonReceber.setText("Receber");
        buttonReceber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonReceberActionPerformed(evt);
            }
        });

        inputDataInicio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Data de Inicio");

        inputVencimento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Vencimento prox. Parcela");

        inputFormaPagamento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputFormaPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputFormaPagamentoActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Forma de Pagamento");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inputDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(buttonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(buttonInicio))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(buttonSelecionar)
                                            .addComponent(buttonAnterior))
                                        .addGap(30, 30, 30)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(buttonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(buttonProximo))
                                        .addGap(34, 34, 34)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(buttonExcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(buttonFinal, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addComponent(buttonReceber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(inputVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(inputSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(inputId, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(inputCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(inputCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(inputFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(79, 79, 79)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inputValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(inputParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(inputValorParcela, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(jLabel3))
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputValorParcela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(buttonReceber, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonInicio)
                    .addComponent(buttonProximo)
                    .addComponent(buttonAnterior)
                    .addComponent(buttonFinal))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCadastrar)
                    .addComponent(buttonExcluir)
                    .addComponent(buttonSelecionar)
                    .addComponent(buttonEditar))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonFinaljButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFinaljButton8ActionPerformed
        index = ec.getEmpresas().size()-1;
        exibirDados();
    }//GEN-LAST:event_buttonFinaljButton8ActionPerformed

    private void buttonProximojButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonProximojButton7ActionPerformed
        if(index < ec.getEmpresas().size()-1){
            posterior();
        }
        exibirDados();
    }//GEN-LAST:event_buttonProximojButton7ActionPerformed

    private void buttonAnteriorjButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAnteriorjButton6ActionPerformed
        if(index > 0){
            anterior();
        }
        exibirDados();
    }//GEN-LAST:event_buttonAnteriorjButton6ActionPerformed

    private void buttonIniciojButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIniciojButton5ActionPerformed
        index = 0;
        exibirDados();
    }//GEN-LAST:event_buttonIniciojButton5ActionPerformed

    private void buttonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarActionPerformed

        if(buttonEditar.getText().equals("Salvar")){
            try {
                this.valoresInput();
                ec = new EmpresaController();
                ec.editEmpresa(Integer.parseInt(inputId.getText()), razaoSocial, nomeFantasia, icms, cnpj, inscricaoEstadual, longradouro, numero, bairro, cidade, estado, cep, telefone, email,situacao);
                buttonEditar.setText("Editar");
                this.ativarTudo();
                this.exibirDados();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Informe corretamente os dados", "Aviso", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            this.ativarButtonEditar();
            buttonEditar.setText("Salvar");
        }
    }//GEN-LAST:event_buttonEditarActionPerformed

    private void buttonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirActionPerformed
        
    }//GEN-LAST:event_buttonExcluirActionPerformed

    private void buttonSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSelecionarActionPerformed
        if(buttonSelecionar.getText().equals("Buscar")){
            try {
                int i = 0;
                int id = Integer.parseInt(inputId.getText());
                Iterator iterator = ec.getEmpresas().iterator();
                int condicaoErro = 0;
                do{
                    if(id == ec.getEmpresas().get(i).getId()){
                        condicaoErro=1;
                        index=i;
                    }
                    iterator.next();
                    if(i<ec.getEmpresas().size()-1)
                        i++;
                
                }while (iterator.hasNext());
                if(condicaoErro==0){
                    
                    JOptionPane.showMessageDialog(null, "Dados não encontrados", "Aviso", JOptionPane.ERROR_MESSAGE);
                   
                }else{
                    this.exibirDados();
                    buttonSelecionar.setText("Selecionar");
                }
                this.exibirDados();
            }  catch (Exception ex) {
            Logger.getLogger(ContaReceberView.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
//            catch (Exception ex) {
//                JOptionPane.showMessageDialog(null, "Falha ao carregar dados", "Aviso", JOptionPane.ERROR_MESSAGE);
//        
//            }
            
            
//            catch (Exception ex) {
//                JOptionPane.showMessageDialog(null, "Falha ao carregar dados", "Aviso", JOptionPane.ERROR_MESSAGE);
//        
//            }
            
            
//            catch (Exception ex) {
//                JOptionPane.showMessageDialog(null, "Falha ao carregar dados", "Aviso", JOptionPane.ERROR_MESSAGE);
//        
//            }
            
            
//            catch (Exception ex) {
//                JOptionPane.showMessageDialog(null, "Falha ao carregar dados", "Aviso", JOptionPane.ERROR_MESSAGE);
//        
//            }
        }else{
            this.desativarTudo();
            this.ativarButtonSelecionar();
            this.limparCampos();
            inputValorTotal.setEnabled(true);
            inputId.setEditable(true);
            inputId.setEnabled(true);
            buttonSelecionar.setText("Buscar");
        }
    }//GEN-LAST:event_buttonSelecionarActionPerformed

    private void buttonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastrarActionPerformed
        if(buttonCadastrar.getText().equals("Salvar")){
            try {
                this.valoresInput();
                ec = new EmpresaController();
                ec.salvarEmpresa( razaoSocial, nomeFantasia, icms, cnpj, inscricaoEstadual, longradouro, numero, bairro, cidade, estado, cep, telefone, email);
                buttonCadastrar.setText("Novo");
                index = ec.getEmpresas().size()-1;
                this.ativarTudo();
                this.exibirDados();
            }catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Informe corretamente os dados", "Aviso", JOptionPane.ERROR_MESSAGE);
            }
            
            
//            catch (Exception ex) {
//                JOptionPane.showMessageDialog(null, "Informe corretamente os dados", "Aviso", JOptionPane.ERROR_MESSAGE);
//            }
        }else{
            this.limparCampos();
            this.ativarButtonCadastrar();
            this.ativarInputCadastrar();
            buttonCadastrar.setText("Salvar");
        }
    }//GEN-LAST:event_buttonCadastrarActionPerformed

    private void inputIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputIdActionPerformed
        
    }//GEN-LAST:event_inputIdActionPerformed

    
    private void inputValorTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputValorTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputValorTotalActionPerformed

    private void inputClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputClienteActionPerformed

    private void inputValorParcelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputValorParcelaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputValorParcelaActionPerformed

    private void inputSituacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputSituacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputSituacaoActionPerformed

    private void buttonReceberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonReceberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonReceberActionPerformed

    private void inputFormaPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputFormaPagamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputFormaPagamentoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAnterior;
    private javax.swing.JButton buttonCadastrar;
    private javax.swing.JButton buttonEditar;
    private javax.swing.JButton buttonExcluir;
    private javax.swing.JButton buttonFinal;
    private javax.swing.JButton buttonInicio;
    private javax.swing.JButton buttonProximo;
    private javax.swing.JButton buttonReceber;
    private javax.swing.JButton buttonSelecionar;
    public static javax.swing.JTextField inputCliente;
    public static javax.swing.JTextField inputCpf;
    public static javax.swing.JTextField inputDataInicio;
    public static javax.swing.JTextField inputFormaPagamento;
    public static javax.swing.JTextField inputId;
    public static javax.swing.JTextField inputParcelas;
    public static javax.swing.JTextField inputSituacao;
    public static javax.swing.JTextField inputValorParcela;
    public static javax.swing.JTextField inputValorTotal;
    public static javax.swing.JTextField inputVencimento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel19;
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

    public int anterior(){
        return --index;
    }
    public int posterior(){
        return ++index;
    }
    
        public void exibirDados(){
        ec = new EmpresaController();
        try {
            this.ativarTudo();
            inputId.setText(""+ec.getEmpresas().get(index).getId());
            inputValorTotal.setText(""+ec.getEmpresas().get(index).getRazaoSocial());
            inputParcelas.setText(""+ec.getEmpresas().get(index).getNomeFantasia());
//            comboIcms.setSelectedItem((String) ec.getEmpresas().get(index).getContribuinteIcms());
//            inputCnpj.setText(""+ec.getEmpresas().get(index).getCnpj());
//            inputInscricaoEstadual.setText(""+ec.getEmpresas().get(index).getInscricaoEstadual());
//            inputLongradouro.setText(""+ec.getEmpresas().get(index).getLongradouro());
//            inputNumero.setText(""+ec.getEmpresas().get(index).getNumero());
//            inputBairro.setText(""+ec.getEmpresas().get(index).getBairro());
//            inputCidade.setText(""+ec.getEmpresas().get(index).getCidade());
//            comboEstado.setSelectedItem((String) ec.getEmpresas().get(index).getEstado());
//            inputCep.setText(""+ec.getEmpresas().get(index).getCep());
//            inputTelefone.setText(""+ec.getEmpresas().get(index).getTelefone());
//            inputEmail.setText(""+ec.getEmpresas().get(index).getEmail());
            inputSituacao.setText(""+ec.getEmpresas().get(index).getSituacao());
            inputId.setEditable(false);
            inputSituacao.setEditable(false);
            buttonExcluir.setEnabled(false);
            this.valoresInput();
        } catch (Exception ex) {
            Logger.getLogger(ContaReceberView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        

    public void valoresInput() throws ParseException{
        
//        this.id = Integer.parseInt(inputId.getText());
        this.razaoSocial = inputValorTotal.getText().toUpperCase();
        this.nomeFantasia = inputParcelas.getText().toUpperCase();
//        this.icms = (String) comboIcms.getSelectedItem();
//        this.cnpj = inputCnpj.getText();
//        this.inscricaoEstadual = inputInscricaoEstadual.getText();
//        this.longradouro = inputLongradouro.getText().toUpperCase();
//        this.numero = Integer.parseInt(inputNumero.getText());
//        this.bairro = inputBairro.getText().toUpperCase();
//        this.cidade = inputCidade.getText().toUpperCase();
//        this.estado = (String) comboEstado.getSelectedItem();
//        this.cep = inputCep.getText();
//        this.telefone = inputTelefone.getText();
//        this.email = inputEmail.getText().toUpperCase();
        this.situacao = inputSituacao.getText();
    }
    
    
    public void limparCampos(){
        inputId.setText("");
        inputValorTotal.setText("");
        inputParcelas.setText("");
//        inputInscricaoEstadual.setText("");
//        comboIcms.setSelectedIndex(0);
//        inputCnpj.setText("");
//        inputLongradouro.setText("");
//        inputNumero.setText("");
//        inputBairro.setText("");
//        inputCidade.setText("");
//        comboEstado.setSelectedIndex(0);
//        inputCep.setText("");
//        inputTelefone.setText("");
//        inputEmail.setText("");
        inputSituacao.setText("");
    }
    
    public static void ativarInputCadastrar(){
        inputId.setEditable(false);
        inputValorTotal.setEnabled(true);
        inputParcelas.setEnabled(true);
//        inputInscricaoEstadual.setEnabled(true);
//        comboIcms.setEnabled(true);
//        inputCnpj.setEnabled(true);
//        inputLongradouro.setEnabled(true);
//        inputNumero.setEnabled(true);
//        inputBairro.setEnabled(true);
//        inputCidade.setEnabled(true);
//        comboEstado.setEnabled(true);
//        inputCep.setEnabled(true);
//        inputTelefone.setEnabled(true);
//        inputEmail.setEnabled(true);
        inputSituacao.setEditable(false);
    }
    
    public void ativarButtonCadastrar(){
        buttonCadastrar.setEnabled(true);
//        buttonImprimir.setEnabled(false);
        buttonExcluir.setEnabled(false);
        buttonSelecionar.setEnabled(false);
        buttonEditar.setEnabled(false);
        buttonInicio.setEnabled(false);
        buttonAnterior.setEnabled(false);
        buttonProximo.setEnabled(false);
        buttonFinal.setEnabled(false);
    }
    
    public void ativarButtonSelecionar(){
        buttonSelecionar.setEnabled(true);
        buttonCadastrar.setEnabled(false);
//        buttonImprimir.setEnabled(false);
        buttonEditar.setEnabled(false);
        buttonExcluir.setEnabled(false);
        buttonInicio.setEnabled(false);
        buttonAnterior.setEnabled(false);
        buttonProximo.setEnabled(false);
        buttonFinal.setEnabled(false);
    }
    
    public void ativarButtonEditar(){
        buttonEditar.setEnabled(true);
        buttonCadastrar.setEnabled(false);
//        buttonImprimir.setEnabled(false);
        buttonSelecionar.setEnabled(false);
        buttonExcluir.setEnabled(false);
        buttonInicio.setEnabled(false);
        buttonAnterior.setEnabled(false);
        buttonProximo.setEnabled(false);
        buttonFinal.setEnabled(false);
    }
    
    public void ativarTudo(){
        
        //Inputs
        
        inputId.setEnabled(true);
        inputValorTotal.setEnabled(true);
        inputParcelas.setEnabled(true);
//        inputInscricaoEstadual.setEnabled(true);
//        comboIcms.setEnabled(true);
//        inputCnpj.setEnabled(true);
//        inputLongradouro.setEnabled(true);
//        inputNumero.setEnabled(true);
//        inputBairro.setEnabled(true);
//        inputCidade.setEnabled(true);
//        comboEstado.setEnabled(true);
//        inputCep.setEnabled(true);
//        inputTelefone.setEnabled(true);
//        inputEmail.setEnabled(true);
        
        //Botões
        
        buttonCadastrar.setEnabled(true);
       // buttonImprimir.setEnabled(true);
        buttonSelecionar.setEnabled(true);
        buttonEditar.setEnabled(true);
        buttonExcluir.setEnabled(true);
        buttonInicio.setEnabled(true);
        buttonAnterior.setEnabled(true);
        buttonProximo.setEnabled(true);
        buttonFinal.setEnabled(true);
    }

    public void desativarTudo(){
        
        //Inputs
        
        inputId.setEditable(false);
        inputValorTotal.setEnabled(false);
        inputParcelas.setEnabled(false);
//        inputInscricaoEstadual.setEnabled(false);
//        comboIcms.setEnabled(false);
//        inputCnpj.setEnabled(false);
//        inputLongradouro.setEnabled(false);
//        inputNumero.setEnabled(false);
//        inputBairro.setEnabled(false);
//        inputCidade.setEnabled(false);
//        comboEstado.setEnabled(false);
//        inputCep.setEnabled(false);
//        inputTelefone.setEnabled(false);
//        inputEmail.setEnabled(false);
        
        //Botões
        
        buttonCadastrar.setEnabled(false);
       // buttonImprimir.setEnabled(false);
        buttonSelecionar.setEnabled(false);
        buttonEditar.setEnabled(false);
        buttonExcluir.setEnabled(false);
        buttonInicio.setEnabled(false);
        buttonAnterior.setEnabled(false);
        buttonProximo.setEnabled(false);
        buttonFinal.setEnabled(false);
    }

}
