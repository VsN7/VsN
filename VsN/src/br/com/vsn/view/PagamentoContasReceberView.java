/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vsn.view;

import br.com.vsn.controller.ContaController;
import br.com.vsn.model.Conta;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vitor
 */
public class PagamentoContasReceberView extends javax.swing.JInternalFrame {

    
    ContaController cc;
    private static int index=0;
    private static int id;
    Conta conta;
    
    String titulo;
    double valor;
    Date dataCompra;
    String situacao;
    double valorParcela;
    double pagamento;
    double valorRestante;
    int vezes;
    int vezesRestantes;
    Date dataVencimento;
    
    public void setIndex(int index){
        this.index = index;
    }
    
    NumberFormat formatter = new DecimalFormat("#0.00");
    
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    /**
     * Creates new form CadastroContaView
     */
    public PagamentoContasReceberView() throws Exception {
        
        cc = new ContaController();
        initComponents();
        
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int lar = (int) d.getWidth();
        int alt = (int) d.getHeight();
        this.setLocation((lar - this.getSize().width) / 2, (alt - this.getSize().height)/6);
        
        if(cc.getContas().size()<=0){
            System.out.println("Tamanho menor que 0...");
            buttonPagar.setEnabled(false);
            buttonAnterior.setEnabled(false);
            buttonFinalT.setEnabled(false);
            buttonProximo.setEnabled(false);
            buttonInicioT.setEnabled(false);
            
        }else{
            this.exibirDados();
        }
        
    }
    
    public PagamentoContasReceberView(int val){
        index = val;
    }
    
    public ContaController getCc() {
        return cc;
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
        jLabel2 = new javax.swing.JLabel();
        inputTitulo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        inputValor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        buttonPagar = new javax.swing.JButton();
        buttonInicioT = new javax.swing.JButton();
        buttonProximo = new javax.swing.JButton();
        buttonFinalT = new javax.swing.JButton();
        buttonAnterior = new javax.swing.JButton();
        inputDataCompra = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        inputValorParcela = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        inputPagamento = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        inputSituacao = new javax.swing.JTextField();
        inputValorRestante = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        inputDataVencimento = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        inputVezes = new javax.swing.JTextField();
        inputVezesRestantes = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Recebimento de Titulos");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusTraversalPolicyProvider(true);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RECEBIMENTO DE TITULOS");

        jLabel2.setText("Título:");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${cc.conta.titulo}"), inputTitulo, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        inputTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTituloActionPerformed(evt);
            }
        });

        jLabel3.setText("Valor: ");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${cc.conta.valor}"), inputValor, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel5.setText("Vezes:");

        jLabel6.setText("Data da Primeira Parcela:");

        buttonPagar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonPagar.setForeground(new java.awt.Color(255, 255, 255));
        buttonPagar.setText("Receber Titulo");
        buttonPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPagarActionPerformed(evt);
            }
        });

        buttonInicioT.setText("|<");
        buttonInicioT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInicioTActionPerformed(evt);
            }
        });

        buttonProximo.setText(">>");
        buttonProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonProximoActionPerformed(evt);
            }
        });

        buttonFinalT.setText(">|");
        buttonFinalT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFinalTActionPerformed(evt);
            }
        });

        buttonAnterior.setText("<<");
        buttonAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAnteriorActionPerformed(evt);
            }
        });

        inputDataCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputDataCompraActionPerformed(evt);
            }
        });

        jLabel7.setText("Pagamento:");

        jLabel8.setText("Valor Parcela:");

        inputPagamento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel9.setText("Situação:");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${cc.conta.situacao}"), inputSituacao, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel4.setText("Valor Restante:");

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Dados de Parcelamento");

        jLabel11.setText("Restantes:");

        jLabel12.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Dados de Pagamento");

        jLabel13.setText("Vencimento Prox. Parcela:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(buttonInicioT)
                        .addGap(31, 31, 31)
                        .addComponent(buttonAnterior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonProximo)
                        .addGap(36, 36, 36)
                        .addComponent(buttonFinalT)
                        .addGap(42, 42, 42))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inputVezes)
                            .addComponent(inputValor, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel8)))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputDataCompra)
                            .addComponent(inputValorParcela)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputTitulo))
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2)
                    .addComponent(buttonPagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputVezesRestantes, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inputValorRestante, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputDataVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(32, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(inputTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputDataCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(inputValorParcela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputVezes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(inputValorRestante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(inputVezesRestantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(inputDataVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(inputSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonProximo)
                    .addComponent(buttonAnterior)
                    .addComponent(buttonInicioT)
                    .addComponent(buttonFinalT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleDescription("");

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPagarActionPerformed
        if(buttonPagar.getText().equals("Receber Titulo")){
            try {
                valoresInputs();
                cc.efetuarPagamento(conta);
                
                cc = new ContaController();
                this.exibirDados();
            } catch (Exception ex) {
                Logger.getLogger(PagamentoContasReceberView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            try {
                valoresInputs();
                cc.estorno(conta);
                cc = new ContaController();
                this.exibirDados();
            } catch (Exception ex) {
                Logger.getLogger(PagamentoContasReceberView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    }//GEN-LAST:event_buttonPagarActionPerformed

    
    
    
    
    private void inputTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTituloActionPerformed
        
        
        
    }//GEN-LAST:event_inputTituloActionPerformed

    private void inputDataCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputDataCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputDataCompraActionPerformed

    private void buttonInicioTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInicioTActionPerformed
        index = 0;
        exibirDados();
    }//GEN-LAST:event_buttonInicioTActionPerformed

    private void buttonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAnteriorActionPerformed
        if(index > 0){
            anterior();
        }
        exibirDados();
    }//GEN-LAST:event_buttonAnteriorActionPerformed

    private void buttonFinalTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFinalTActionPerformed
        index = cc.getContas().size()-1;
        exibirDados();
    }//GEN-LAST:event_buttonFinalTActionPerformed

    private void buttonProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonProximoActionPerformed

        if(index < cc.getContas().size()-1){
            posterior();
        }
        exibirDados();
    }//GEN-LAST:event_buttonProximoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAnterior;
    private javax.swing.JButton buttonFinalT;
    private javax.swing.JButton buttonInicioT;
    private javax.swing.JButton buttonPagar;
    private javax.swing.JButton buttonProximo;
    public static javax.swing.JTextField inputDataCompra;
    public static javax.swing.JTextField inputDataVencimento;
    public static javax.swing.JTextField inputPagamento;
    public static javax.swing.JTextField inputSituacao;
    public static javax.swing.JTextField inputTitulo;
    public static javax.swing.JTextField inputValor;
    public static javax.swing.JTextField inputValorParcela;
    public static javax.swing.JTextField inputValorRestante;
    public static javax.swing.JTextField inputVezes;
    public static javax.swing.JTextField inputVezesRestantes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    public int anterior(){
        return --index;
    }
    public int posterior(){
        return ++index;
    }
    
    
    public void exibirDados(){
        try {
            inputTitulo.setText(""+cc.getContas().get(index).getTitulo());
            inputValor.setText(""+formatter.format(cc.getContas().get(index).getValor()));
            inputDataCompra.setText(""+sdf.format(cc.getContas().get(index).getDataCompra().getTime()));
            inputSituacao.setText(""+cc.getContas().get(index).getSituacao());
            inputValorParcela.setText(""+formatter.format(cc.getContas().get(index).getValor()/cc.getContas().get(index).getVezes()));
            inputPagamento.setText(""+formatter.format((cc.getContas().get(index).getValor()/cc.getContas().get(index).getVezes())));
            inputValorRestante.setText(""+formatter.format(cc.getContas().get(index).getValorPagar()));
            inputVezes.setText(""+cc.getContas().get(index).getVezes());
            inputVezesRestantes.setText(""+cc.getContas().get(index).getVezesPagar());
            inputDataVencimento.setText(""+sdf.format(cc.getContas().get(index).getDataVencimento().getTime()));
            if(Double.parseDouble(inputValorRestante.getText().replace(",", ".")) <= 0 || Double.parseDouble(inputValorRestante.getText().replace(",", ".")) < 1){
                inputPagamento.setText("0.00");
            }

            if(inputSituacao.getText().equals("FECHADO")){
                inputSituacao.setForeground(Color.red);
                buttonPagar.setText("Estornar Titulo");
                buttonPagar.setBackground(new Color(180,30,30));
            }else{
                inputSituacao.setForeground(Color.blue);
                buttonPagar.setText("Receber Titulo");
                buttonPagar.setBackground(new Color(40,30,180));
            }
            this.desabilitarComponentes();
        } catch (Exception ex) {
            Logger.getLogger(PagamentoContasReceberView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void valoresInputs() throws ParseException{
        titulo = inputTitulo.getText();
        valor = Double.parseDouble(inputValor.getText().replace(",", "."));
        dataCompra = sdf.parse(inputDataCompra.getText());
        situacao = inputSituacao.getText();
        valorParcela = Double.parseDouble(inputValorParcela.getText().replace(",", "."));
        pagamento = Double.parseDouble(inputPagamento.getText().replace(",", "."));
        valorRestante = Double.parseDouble(inputValorRestante.getText().replace(",", "."));
        vezes = Integer.parseInt(inputVezes.getText());
        vezesRestantes = Integer.parseInt(inputVezesRestantes.getText());
        dataVencimento = sdf.parse(inputDataVencimento.getText());
        conta = cc.pesquisarUnico(cc.getContas().get(index).getId());
    }
    
    public static void desabilitarComponentes(){
        inputTitulo.setEditable(false);
        inputValor.setEditable(false);
        inputDataCompra.setEditable(false);
        inputSituacao.setEditable(false);
        inputValorParcela.setEditable(false);
        inputPagamento.setEditable(false);
        inputValorRestante.setEditable(false);
        inputVezes.setEditable(false);
        inputVezesRestantes.setEditable(false);
        inputDataVencimento.setEditable(false);
    }
    
}
