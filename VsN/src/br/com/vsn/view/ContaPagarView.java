
package br.com.vsn.view;

import br.com.vsn.controller.DespesaController;
import br.com.vsn.dao.exceptions.NonexistentEntityException;
import br.com.vsn.model.Despesa;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

/**
 *
 * @author vitor
 */
public class ContaPagarView extends javax.swing.JInternalFrame {
    
    DespesaController dc;
    SimpleDateFormat sdf;
    NumberFormat formatter;
    static int index = 0;
    Despesa despesa;
    
    int id;
    String descricao;
    double valorTotal;
    int parcelas;
    double valorParcela;
    Date dataInicio;
    Date vencimento;
    String situacao;
    int parcelasPagar;
    
    public ContaPagarView() throws Exception {
        sdf = new SimpleDateFormat("dd/MM/yyyy");
        formatter = new DecimalFormat("#0.00");
        dc = new DespesaController();
        
        despesa = new Despesa();
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int lar = (int) d.getWidth();
        int alt = (int) d.getHeight();
        this.setLocation((lar - this.getSize().width) / 4, (alt - this.getSize().height)/38);
        initComponents();
        
        if(dc.getDespesas().size()<=0){
            this.desativarTudo();
            this.ativarButtonCadastrar();
            if(buttonCadastrar.getText().equals("Salvar"))
                
                this.desativarInputs();
                inputId.setEditable(false);
                inputValorPago.setEditable(false);
                comboParcelas.setEnabled(false);
                this.ativarInputCadastrar();
        }else{
            this.exibirDados();
        }
    }
    
    
    
    @SuppressWarnings("unchdcked")
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
        jLabel7 = new javax.swing.JLabel();
        inputSituacao = new javax.swing.JTextField();
        buttonPagar = new javax.swing.JButton();
        inputDataInicio = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter dtInicio= new javax.swing.text.MaskFormatter("##/##/####");
            inputDataInicio = new javax.swing.JFormattedTextField(dtInicio);
        }
        catch (Exception e){
        }
        jLabel8 = new javax.swing.JLabel();
        inputVencimento = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        inputDescricao = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        inputValorPago = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        inputRestantes = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        comboParcelas = new javax.swing.JComboBox<>();
        ImageIcon iconOrcamento = new ImageIcon(getClass().getResource("/icon/calendario.jpg")); Image imagem = iconOrcamento.getImage();
        calendarioDtNascimentoCliente = new javax.swing.JLabel(){
            public void paintComponent(Graphics g){
                g.drawImage(imagem,0,0,getWidth(),getHeight(),this);
            }
        };
        inputValorParcela = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Contas a Pagar");
        setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("ID");

        inputId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputIdActionPerformed(evt);
            }
        });
        inputId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inputIdKeyPressed(evt);
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
        jLabel19.setText("Dados da Despesa");

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

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Situação");

        inputSituacao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputSituacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputSituacaoActionPerformed(evt);
            }
        });

        buttonPagar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonPagar.setForeground(new java.awt.Color(255, 255, 255));
        buttonPagar.setText("Efetuar Pagamento");
        buttonPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPagarActionPerformed(evt);
            }
        });

        inputDataInicio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Data da Primeira Parcela");

        inputVencimento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Vencimento prox. Parcela");

        inputDescricao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputDescricaoActionPerformed(evt);
            }
        });
        inputDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inputDescricaoKeyPressed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Descrição");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Dados de Pagamento");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Qnt. Parcelas");

        inputValorPago.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputValorPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputValorPagoActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Valor a Ser Pago");

        inputRestantes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputRestantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputRestantesActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Valor Restante");

        comboParcelas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboParcelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 Parcela" }));
        comboParcelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboParcelasActionPerformed(evt);
            }
        });

        calendarioDtNascimentoCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        calendarioDtNascimentoCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calendarioDtNascimentoClienteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calendarioDtNascimentoClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calendarioDtNascimentoClienteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                calendarioDtNascimentoClienteMousePressed(evt);
            }
        });

        inputValorParcela.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Valor da Parcela");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(inputValorTotal))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(inputParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(calendarioDtNascimentoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(70, 70, 70))
                                    .addComponent(inputDataInicio)))
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(comboParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(inputValorPago, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inputRestantes, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(inputValorParcela, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(inputVencimento))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(inputSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(inputId, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(inputDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(buttonPagar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(buttonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(buttonInicio))
                                            .addGap(52, 52, 52)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(buttonSelecionar)
                                                .addComponent(buttonAnterior))
                                            .addGap(37, 37, 37)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(buttonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(buttonProximo))
                                            .addGap(54, 54, 54)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(buttonExcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(buttonFinal, javax.swing.GroupLayout.Alignment.TRAILING)))))))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(inputId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addGap(34, 34, 34)))
                    .addComponent(inputDescricao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(calendarioDtNascimentoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(inputVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputValorParcela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(inputSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel7))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addGap(29, 29, 29))))))
                .addGap(16, 16, 16)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputRestantes, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputValorPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(buttonPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonFinaljButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFinaljButton8ActionPerformed
        index = dc.getDespesas().size()-1;
        exibirDados();
    }//GEN-LAST:event_buttonFinaljButton8ActionPerformed

    private void buttonProximojButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonProximojButton7ActionPerformed
        if(index < dc.getDespesas().size()-1){
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
        if(despesa.getParcelas() == despesa.getParcelasPagar()){
            if(buttonEditar.getText().equals("Salvar")){
                try {
                     this.valoresInput();
                    dc = new DespesaController();
                    despesa.setId(Integer.parseInt(inputId.getText()));
                    despesa.setDescricao(descricao.toUpperCase());
                    despesa.setValor(valorTotal);
                    despesa.setParcelas(parcelas);
                    Calendar c1 = Calendar.getInstance();
                    c1.setTime(dataInicio);
                    despesa.setDataInicio(c1);
                    Calendar c2 = Calendar.getInstance();
                    c2.setTime(despesa.getDataVencimento().getTime());
                    c2.set(Calendar.MONTH,c2.get(Calendar.MONTH)+1);
                    despesa.setDataVencimento(c2);
                    despesa.setValorPagar(valorTotal);
                    despesa.setParcelasPagar(parcelas);

                    despesa.setSituacao(situacao);
                    dc.editDespesa(despesa);
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
        }else{
            JOptionPane.showMessageDialog(null, "Não é possivel editar esta conta, pois a mesma possui parcela(s) pagas!", "Aviso", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonEditarActionPerformed

    private void buttonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirActionPerformed
        try {
            dc.destroy(despesa);
            this.exibirDados();
        } catch (Exception ex) {
            Logger.getLogger(ContaPagarView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonExcluirActionPerformed

    private void buttonSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSelecionarActionPerformed
        if(buttonSelecionar.getText().equals("Buscar")){
            try {
                int i = 0;
                int id = Integer.parseInt(inputId.getText());
                Iterator iterator = dc.getDespesas().iterator();
                int condicaoErro = 0;
                do{
                    if(id == dc.getDespesas().get(i).getId()){
                        condicaoErro=1;
                        index=i;
                    }
                    iterator.next();
                    if(i<dc.getDespesas().size()-1)
                        i++;
                
                }while (iterator.hasNext());
                if(condicaoErro==0){
                    
                    JOptionPane.showMessageDialog(null, "Dados não encontrados", "Aviso", JOptionPane.ERROR_MESSAGE);
                   
                }else{
                    this.exibirDados();
                    buttonSelecionar.setText("Selecionar");
                }
            }  catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Dados invalidos", "Aviso", JOptionPane.ERROR_MESSAGE);
        }
        }else{
            this.desativarTudo();
            this.desativarInputs();
            this.ativarButtonSelecionar();
            this.limparCampos();
            inputId.setEditable(true);
            inputId.setEnabled(true);
            inputDescricao.setEditable(true);
            buttonSelecionar.setText("Buscar");
        }
    }//GEN-LAST:event_buttonSelecionarActionPerformed

    private void buttonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastrarActionPerformed
        if(buttonCadastrar.getText().equals("Salvar")){
            try {
                this.valoresInput();
                this.valorObjeto();
                dc.setDespesa(despesa);
                dc.salvarDespesa();
                buttonCadastrar.setText("Novo");
                index = dc.getDespesas().size()-1;
                this.exibirDados();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Dados invalidos", "Aviso", JOptionPane.ERROR_MESSAGE);
            }
            
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

    private void inputSituacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputSituacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputSituacaoActionPerformed

    private void buttonPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPagarActionPerformed
        if(buttonPagar.getText().equals("Efetuar Pagamento")){
            try {
                double valor = ((dc.getDespesas().get(index).getValor()/dc.getDespesas().get(index).getParcelas())*(comboParcelas.getSelectedIndex()+1));
                dc.efetuarPagamento(despesa,comboParcelas.getSelectedIndex()+1,valor);
                this.exibirDados();
            } catch (Exception ex) {
                 JOptionPane.showMessageDialog(null, "Falha ao tentar efetuar o pagamento", "Aviso", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            try {
                dc.estorno(despesa);
                this.exibirDados();
            } catch (Exception ex) {
                 JOptionPane.showMessageDialog(null, "Falha ao tentar estornar a conta, entre em contato com o suporte", "Aviso", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_buttonPagarActionPerformed

    private void inputDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputDescricaoActionPerformed

    private void calendarioDtNascimentoClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calendarioDtNascimentoClienteMouseClicked
        calendarioDtNascimentoCliente.setBorder(new LineBorder(new Color(230, 40, 70), 3, true));
    }//GEN-LAST:event_calendarioDtNascimentoClienteMouseClicked

    private void calendarioDtNascimentoClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calendarioDtNascimentoClienteMouseEntered
        calendarioDtNascimentoCliente.setBorder(new LineBorder(new Color(230, 40, 70), 2, true));
    }//GEN-LAST:event_calendarioDtNascimentoClienteMouseEntered

    private void calendarioDtNascimentoClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calendarioDtNascimentoClienteMouseExited
        calendarioDtNascimentoCliente.setBorder(new LineBorder(Color.BLACK, 2, true));
    }//GEN-LAST:event_calendarioDtNascimentoClienteMouseExited

    private void calendarioDtNascimentoClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calendarioDtNascimentoClienteMousePressed
        CalendarView cv = new CalendarView();
        this.getParent().add(cv);
        cv.setVisible(true);
        cv.setaCalendarContaPagarInicio();
    }//GEN-LAST:event_calendarioDtNascimentoClienteMousePressed

    private void inputRestantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputRestantesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputRestantesActionPerformed

    private void inputValorPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputValorPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputValorPagoActionPerformed

    private void comboParcelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboParcelasActionPerformed
        inputValorPago.setText(""+formatter.format(((dc.getDespesas().get(index).getValor()/dc.getDespesas().get(index).getParcelas())*(comboParcelas.getSelectedIndex()+1))));
    }//GEN-LAST:event_comboParcelasActionPerformed

    private void inputIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputIdKeyPressed
        if(buttonSelecionar.getText().equals("Buscar")){
            if (evt.getKeyCode() == evt.VK_F1) {
                if(buttonSelecionar.getText().equals("Buscar")){   
                    try {
                        PesquisarContaPagarView pcpv = new PesquisarContaPagarView();
                        this.getParent().add(pcpv);
                        pcpv.setVisible(true);
                        PesquisarContaPagarView.validador = 0;
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Falha ao tentar acessar o banco de dados", "Aviso", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }
    }//GEN-LAST:event_inputIdKeyPressed

    private void inputDescricaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputDescricaoKeyPressed
        if(buttonSelecionar.getText().equals("Buscar")){
            if (evt.getKeyCode() == evt.VK_F1) {
                if(buttonSelecionar.getText().equals("Buscar")){   
                    try {
                        PesquisarContaPagarView pcpv = new PesquisarContaPagarView();
                        this.getParent().add(pcpv);
                        pcpv.setVisible(true);
                        PesquisarContaPagarView.validador = 0;
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Falha ao tentar acessar o banco de dados", "Aviso", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }
    }//GEN-LAST:event_inputDescricaoKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAnterior;
    private javax.swing.JButton buttonCadastrar;
    private javax.swing.JButton buttonEditar;
    private javax.swing.JButton buttonExcluir;
    private javax.swing.JButton buttonFinal;
    private javax.swing.JButton buttonInicio;
    private javax.swing.JButton buttonPagar;
    private javax.swing.JButton buttonProximo;
    public static javax.swing.JButton buttonSelecionar;
    private javax.swing.JLabel calendarioDtNascimentoCliente;
    private javax.swing.JComboBox<String> comboParcelas;
    public static javax.swing.JTextField inputDataInicio;
    public static javax.swing.JTextField inputDescricao;
    public static javax.swing.JTextField inputId;
    public static javax.swing.JTextField inputParcelas;
    private javax.swing.JTextField inputRestantes;
    public static javax.swing.JTextField inputSituacao;
    private javax.swing.JTextField inputValorPago;
    public static javax.swing.JTextField inputValorParcela;
    public static javax.swing.JTextField inputValorTotal;
    public static javax.swing.JTextField inputVencimento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    private void setParcelasP(){
        List<String> lista = new ArrayList<>();
        for(int i = 1;i<despesa.getParcelasPagar();i++){
            lista.add(""+(i+1)+" Parcelas");
        }
        comboParcelas.removeAllItems();
        comboParcelas.addItem("1 Parcela");
        while(!lista.isEmpty()){
            comboParcelas.addItem(lista.remove(0));
        }
    }
    
    public int anterior(){
        return --index;
    }
    public int posterior(){
        return ++index;
    }
    
        public void exibirDados(){
        despesa = dc.despesaUnico(dc.getDespesas().get(index).getId()).get(0);
        dc = new DespesaController();
        try {
            this.ativarTudo();
            inputId.setText(""+dc.getDespesas().get(index).getId());
            inputValorTotal.setText(""+formatter.format(dc.getDespesas().get(index).getValor()));
            inputParcelas.setText(""+dc.getDespesas().get(index).getParcelas());
            inputDescricao.setText(""+dc.getDespesas().get(index).getDescricao());
            inputValorParcela.setText(""+formatter.format((dc.getDespesas().get(index).getValor()/dc.getDespesas().get(index).getParcelas())));
            inputDataInicio.setText(""+sdf.format(dc.getDespesas().get(index).getDataInicio().getTime()));
            inputVencimento.setText(""+sdf.format(dc.getDespesas().get(index).getDataVencimento().getTime()));
            inputValorPago.setText(""+formatter.format(((dc.getDespesas().get(index).getValor()/dc.getDespesas().get(index).getParcelas())*(comboParcelas.getSelectedIndex()+1))));
            inputRestantes.setText(""+formatter.format(dc.getDespesas().get(index).getValorPagar()));
            inputSituacao.setText(""+dc.getDespesas().get(index).getSituacao());
            inputId.setEditable(false);
            inputSituacao.setEditable(false);
            if(Double.parseDouble(inputRestantes.getText().replace(",", ".")) <= 0 || Double.parseDouble(inputRestantes.getText().replace(",", ".")) < 1){
                inputValorPago.setText("0.00");
            }
            if(inputSituacao.getText().equals("ABERTO")){
                inputSituacao.setForeground(Color.blue);
                buttonPagar.setText("Efetuar Pagamento");
                buttonPagar.setBackground(new Color(40,30,180));
                this.desativarInputs();
                this.ativarInputPagar();
            }else{
                inputSituacao.setForeground(Color.red);
                buttonPagar.setText("Estornar Conta");
                buttonPagar.setBackground(new Color(180,30,30));
                this.desativarInputs();
                buttonEditar.setEnabled(false);
                buttonExcluir.setEnabled(false);
            }
            setParcelasP();
            this.valoresInput();
        } catch (Exception ex) {
            Logger.getLogger(ContaPagarView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        

    public void valoresInput() throws ParseException{
        
        this.descricao = ""+inputDescricao.getText();
        this.valorTotal = Double.parseDouble(inputValorTotal.getText().replace(",", "."));
        this.parcelas = Integer.parseInt(inputParcelas.getText());
        this.dataInicio = sdf.parse(inputDataInicio.getText());
        this.situacao = ""+inputSituacao.getText();
    }
    
    public void valorObjeto(){
        despesa = new Despesa();
        despesa.setDescricao(descricao.toUpperCase());
        despesa.setValor(valorTotal);
        despesa.setParcelas(parcelas);
        Calendar c1 = Calendar.getInstance();
        c1.setTime(dataInicio);
        despesa.setDataInicio(c1);
        Calendar c2 = Calendar.getInstance();
        c2.setTime(despesa.getDataInicio().getTime());
        c2.set(Calendar.MONTH,c2.get(Calendar.MONTH)+1);
        despesa.setDataVencimento(c2);
    }
    
    
    public void limparCampos(){
        inputId.setText("");
        inputValorTotal.setText("");
        inputParcelas.setText("");
        inputDescricao.setText("");
        inputValorParcela.setText("");
        inputDataInicio.setText("");
        inputVencimento.setText("");
        inputSituacao.setText("");
        comboParcelas.setSelectedIndex(0);
        inputValorPago.setText("");
        inputRestantes.setText("");
    }
    
    public void desativarInputs(){
        inputId.setEditable(false);
        inputValorTotal.setEditable(false);
        inputParcelas.setEditable(false);
        inputDescricao.setEditable(false);
        inputValorParcela.setEditable(false);
        inputDataInicio.setEditable(false);
        inputVencimento.setEditable(false);
        inputSituacao.setEditable(false);
        comboParcelas.setEnabled(false);
        inputValorPago.setEditable(false);
        inputRestantes.setEditable(false);
    }

    public void ativarInputPagar(){
        comboParcelas.setEnabled(true);
    }
    
    public void ativarInputCadastrar(){
        inputId.setEditable(false);
        inputValorTotal.setEditable(true);
        inputParcelas.setEditable(true);
        inputDescricao.setEditable(true);
        inputDataInicio.setEditable(true);
        inputValorPago.setEditable(false);
        inputRestantes.setEditable(false);
        inputSituacao.setEditable(false);
        comboParcelas.setEnabled(false);
    }
    
    public void ativarButtonCadastrar(){
        buttonPagar.setEnabled(false);
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
        buttonPagar.setEnabled(false);
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
        this.ativarInputCadastrar();
        buttonPagar.setEnabled(false);
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
        buttonPagar.setEnabled(true);
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
        //Botões
        buttonPagar.setEnabled(false);
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
