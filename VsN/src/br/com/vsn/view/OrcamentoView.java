
package br.com.vsn.view;

import br.com.vsn.controller.OrcamentoController;
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
public class OrcamentoView extends javax.swing.JInternalFrame {
    
    OrcamentoController oc;
    SimpleDateFormat sdf;
    NumberFormat formatter;
    static int index = 0;
    
    
    int id;
    String cliente;
    String cpf;
    String veiculo;
    String modelo;
    String placa;
    String servico;
    String atendente;
    Date dtInicio;
    Date pvEntrega;
    double valor;
    String situacao;
    String observacoes;
    
    public OrcamentoView() throws Exception {
        sdf = new SimpleDateFormat("dd/MM/yyyy");
        formatter = new DecimalFormat("#0.00");
        oc = new OrcamentoController();
        
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int lar = (int) d.getWidth();
        int alt = (int) d.getHeight();
        this.setLocation((lar - this.getSize().width) / 6, (alt - this.getSize().height)/64);
        initComponents();
        
        if(oc.getOrcamentos().size()<=0){
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
        inputCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        inputCpf = new javax.swing.JTextField();
        buttonFinal = new javax.swing.JButton();
        buttonProximo = new javax.swing.JButton();
        buttonAnterior = new javax.swing.JButton();
        buttonInicio = new javax.swing.JButton();
        buttonEditar = new javax.swing.JButton();
        buttonExcluir = new javax.swing.JButton();
        buttonSelecionar = new javax.swing.JButton();
        buttonCadastrar = new javax.swing.JButton();
        buttonImprimir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        inputModelo = new javax.swing.JTextField();
        inputAtendente = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        inputServico = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        comboVeiculo = new javax.swing.JComboBox<>();
        inputPlaca = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        ImageIcon iconOrcamento2 = new ImageIcon(getClass().getResource("/icon/calendario.jpg")); Image imagem2 = iconOrcamento2.getImage();
        calendarPvEntrega = new javax.swing.JLabel(){
            public void paintComponent(Graphics g){
                g.drawImage(imagem2,0,0,getWidth(),getHeight(),this);
            }
        };
        jLabel17 = new javax.swing.JLabel();
        inputValor = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputObservacoes = new javax.swing.JTextArea();
        buttonOS = new javax.swing.JButton();
        inputDataInicio = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter dataInicio= new javax.swing.text.MaskFormatter("##/##/####");
            inputDataInicio = new javax.swing.JFormattedTextField(dataInicio);
        }
        catch (Exception e){
        }
        inputPrevisaoEntrega = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter previsaoEntrega= new javax.swing.text.MaskFormatter("##/##/####");
            inputPrevisaoEntrega = new javax.swing.JFormattedTextField(previsaoEntrega);
        }
        catch (Exception e){
        }
        inputSituacao = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        ImageIcon iconOrcamento = new ImageIcon(getClass().getResource("/icon/calendario.jpg")); Image imagem = iconOrcamento.getImage();
        calendarDtInicio = new javax.swing.JLabel(){
            public void paintComponent(Graphics g){
                g.drawImage(imagem,0,0,getWidth(),getHeight(),this);
            }
        };

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastro de Orçamentos");
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

        inputCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputClienteActionPerformed(evt);
            }
        });
        inputCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inputClienteKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Cliente");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("CPF");

        inputCpf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        try{
            javax.swing.text.MaskFormatter cpf= new javax.swing.text.MaskFormatter("###.###.###-##");
            inputCpf = new javax.swing.JFormattedTextField(cpf);
        }
        catch (Exception e){
        }

        buttonFinal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonFinal.setText(">|");
        buttonFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFinaljButton8ActionPerformed(evt);
            }
        });

        buttonProximo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonProximo.setText(">>");
        buttonProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonProximojButton7ActionPerformed(evt);
            }
        });

        buttonAnterior.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonAnterior.setText("<<");
        buttonAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAnteriorjButton6ActionPerformed(evt);
            }
        });

        buttonInicio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonInicio.setText("|<");
        buttonInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIniciojButton5ActionPerformed(evt);
            }
        });

        buttonEditar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonEditar.setText("Editar");
        buttonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarActionPerformed(evt);
            }
        });

        buttonExcluir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonExcluir.setText("Excluir");
        buttonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirActionPerformed(evt);
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

        buttonImprimir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonImprimir.setText("Imprimir");
        buttonImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonImprimirActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Veículo");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Modelo");

        inputModelo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        inputAtendente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Atendente");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Data de Inicio");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Placa do Veículo");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Dados do Serviços");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Dados do Cliente");

        inputServico.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Serviço");

        comboVeiculo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboVeiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Carro", "Moto", "Ônibus", "Caminhão", "Outro" }));

        inputPlaca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Dados do Veículo");

        calendarPvEntrega.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        calendarPvEntrega.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calendarPvEntregaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calendarPvEntregaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calendarPvEntregaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                calendarPvEntregaMousePressed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Valor");

        inputValor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputValorActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setText("Previsão de Entrega");

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("Observações");

        inputObservacoes.setColumns(20);
        inputObservacoes.setRows(5);
        jScrollPane1.setViewportView(inputObservacoes);

        buttonOS.setBackground(new java.awt.Color(8, 90, 0));
        buttonOS.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonOS.setForeground(new java.awt.Color(255, 255, 255));
        buttonOS.setText("Gerar O.S");
        buttonOS.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOSActionPerformed(evt);
            }
        });

        inputDataInicio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputDataInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputDataInicioinputTitulo5ActionPerformed(evt);
            }
        });

        inputPrevisaoEntrega.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputPrevisaoEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPrevisaoEntregainputTitulo6ActionPerformed(evt);
            }
        });

        inputSituacao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputSituacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputSituacaoActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Situação");

        calendarDtInicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        calendarDtInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calendarDtInicioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calendarDtInicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calendarDtInicioMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                calendarDtInicioMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator3)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(inputId, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(inputCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputCpf)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboVeiculo, 0, 287, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(inputPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputServico, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputAtendente)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(buttonImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonInicio))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(buttonSelecionar)
                            .addComponent(buttonAnterior))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonProximo))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonExcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonFinal, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonOS, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(calendarDtInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(inputDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(calendarPvEntrega, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel14))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputPrevisaoEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(inputValor, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(178, 178, 178))
                            .addComponent(inputSituacao))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 857, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel11))
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputAtendente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(calendarDtInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(inputDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(calendarPvEntrega, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inputSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputPrevisaoEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(buttonOS, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
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
                    .addComponent(buttonEditar)
                    .addComponent(buttonImprimir))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jLabel19)
                    .addContainerGap(507, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonFinaljButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFinaljButton8ActionPerformed
        index = oc.getOrcamentos().size()-1;
        exibirDados();
    }//GEN-LAST:event_buttonFinaljButton8ActionPerformed

    private void buttonProximojButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonProximojButton7ActionPerformed
        if(index < oc.getOrcamentos().size()-1){
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
                oc = new OrcamentoController();
                oc.editOrcamento(Integer.parseInt(inputId.getText()), cliente, cpf, veiculo, modelo, placa, servico, atendente, dtInicio, pvEntrega, valor, situacao, observacoes);
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
                Iterator iterator = oc.getOrcamentos().iterator();
                do{
                    if(id == oc.getOrcamentos().get(i).getId()){
                        index=i;
                    }
                    iterator.next();
                    if(i<oc.getOrcamentos().size()-1)
                        i++;
                
                }while (iterator.hasNext());
                this.exibirDados();
                buttonSelecionar.setText("Selecionar");
                this.exibirDados();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Falha ao carregar dados", "Aviso", JOptionPane.ERROR_MESSAGE);
        
            }
        }else{
            this.desativarTudo();
            this.ativarButtonSelecionar();
            this.limparCampos();
            inputCliente.setEnabled(true);
            inputId.setEnabled(true);
            buttonSelecionar.setText("Buscar");
        }
    }//GEN-LAST:event_buttonSelecionarActionPerformed

    private void buttonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastrarActionPerformed
        if(buttonCadastrar.getText().equals("Salvar")){
            try {
                this.valoresInput();
                oc = new OrcamentoController();
                oc.salvarOrcamento(this.cliente, this.cpf, this.veiculo, this.modelo, this.placa, this.servico, this.atendente, this.dtInicio, this.pvEntrega, this.valor, this.situacao, this.observacoes);
                buttonCadastrar.setText("Novo");
                index = oc.getOrcamentos().size()-1;
                this.ativarTudo();
                this.exibirDados();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Informe corretamente os dados", "Aviso", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            this.limparCampos();
            this.ativarButtonCadastrar();
            this.ativarInputCadastrar();
            buttonCadastrar.setText("Salvar");
        }
    }//GEN-LAST:event_buttonCadastrarActionPerformed

    private void buttonImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonImprimirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonImprimirActionPerformed

    private void inputIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputIdActionPerformed
        
    }//GEN-LAST:event_inputIdActionPerformed

    private void inputIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputIdKeyPressed
        if (evt.getKeyCode() == evt.VK_F1) {                    
            try {
                PesquisarOrcamentoView pv = new PesquisarOrcamentoView();
                this.getParent().add(pv);
                pv.setVisible(true);
                
                   
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Falha ao tentar acessar o banco de dados", "Aviso", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_inputIdKeyPressed

    private void buttonOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonOSActionPerformed

    private void inputDataInicioinputTitulo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputDataInicioinputTitulo5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputDataInicioinputTitulo5ActionPerformed

    private void inputPrevisaoEntregainputTitulo6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPrevisaoEntregainputTitulo6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputPrevisaoEntregainputTitulo6ActionPerformed

    private void inputValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputValorActionPerformed

    private void inputSituacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputSituacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputSituacaoActionPerformed

    private void calendarPvEntregaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calendarPvEntregaMousePressed
        CalendarView cv = new CalendarView();
        this.getParent().add(cv);
        cv.setVisible(true);
        cv.setaCalendarOrcamentoPvEntrega();
    }//GEN-LAST:event_calendarPvEntregaMousePressed

    private void calendarPvEntregaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calendarPvEntregaMouseExited
        calendarPvEntrega.setBorder(new LineBorder(Color.BLACK, 2, true));
    }//GEN-LAST:event_calendarPvEntregaMouseExited

    private void calendarPvEntregaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calendarPvEntregaMouseEntered
        calendarPvEntrega.setBorder(new LineBorder(new Color(230, 40, 70), 2, true));
    }//GEN-LAST:event_calendarPvEntregaMouseEntered

    private void calendarPvEntregaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calendarPvEntregaMouseClicked
        calendarPvEntrega.setBorder(new LineBorder(new Color(230, 40, 70), 3, true));
    }//GEN-LAST:event_calendarPvEntregaMouseClicked

    
    //////
    
    private void calendarDtInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calendarDtInicioMouseClicked
        calendarDtInicio.setBorder(new LineBorder(new Color(230, 40, 70), 3, true));
    }//GEN-LAST:event_calendarDtInicioMouseClicked

    private void calendarDtInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calendarDtInicioMouseEntered
        calendarDtInicio.setBorder(new LineBorder(new Color(230, 40, 70), 2, true));
    }//GEN-LAST:event_calendarDtInicioMouseEntered

    private void calendarDtInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calendarDtInicioMouseExited
        calendarDtInicio.setBorder(new LineBorder(Color.BLACK, 2, true));
    }//GEN-LAST:event_calendarDtInicioMouseExited

    private void calendarDtInicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calendarDtInicioMousePressed
        CalendarView cv = new CalendarView();
        this.getParent().add(cv);
        cv.setVisible(true);
        cv.setaCalendarOrcamentoDtInicio();
    }//GEN-LAST:event_calendarDtInicioMousePressed

    private void inputClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputClienteKeyPressed
        if(buttonSelecionar.getText().equals("Buscar") || buttonCadastrar.getText().equals("Salvar")){
            if (evt.getKeyCode() == evt.VK_F1) {
                if(buttonSelecionar.getText().equals("Buscar")){
                    try {
                        PesquisarOrcamentoView pov = new PesquisarOrcamentoView();
                        this.getParent().add(pov);
                        pov.setVisible(true);
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Falha ao tentar acessar o banco de dados", "Aviso", JOptionPane.ERROR_MESSAGE);
                    }
                }else{
                    try {
                        PesquisarClienteView pv = new PesquisarClienteView();
                        this.getParent().add(pv);
                        pv.setVisible(true);
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Falha ao tentar acessar o banco de dados", "Aviso", JOptionPane.ERROR_MESSAGE);
                    }
                }

            }
        }
    }//GEN-LAST:event_inputClienteKeyPressed

    private void inputClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAnterior;
    public static javax.swing.JButton buttonCadastrar;
    private javax.swing.JButton buttonEditar;
    private javax.swing.JButton buttonExcluir;
    private javax.swing.JButton buttonFinal;
    private javax.swing.JButton buttonImprimir;
    private javax.swing.JButton buttonInicio;
    private javax.swing.JButton buttonOS;
    private javax.swing.JButton buttonProximo;
    private javax.swing.JButton buttonSelecionar;
    private javax.swing.JLabel calendarDtInicio;
    private javax.swing.JLabel calendarPvEntrega;
    public static javax.swing.JComboBox<String> comboVeiculo;
    public static javax.swing.JTextField inputAtendente;
    public static javax.swing.JTextField inputCliente;
    public static javax.swing.JTextField inputCpf;
    public static javax.swing.JTextField inputDataInicio;
    public static javax.swing.JTextField inputId;
    public static javax.swing.JTextField inputModelo;
    public static javax.swing.JTextArea inputObservacoes;
    public static javax.swing.JTextField inputPlaca;
    public static javax.swing.JTextField inputPrevisaoEntrega;
    public static javax.swing.JTextField inputServico;
    public static javax.swing.JTextField inputSituacao;
    public static javax.swing.JTextField inputValor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables

    public int anterior(){
        return --index;
    }
    public int posterior(){
        return ++index;
    }
    
        public void exibirDados(){
        oc = new OrcamentoController();
        try {
            this.ativarTudo();
            inputId.setText(""+oc.getOrcamentos().get(index).getId());
            inputCliente.setText(""+oc.getOrcamentos().get(index).getCliente());
            inputCpf.setText(""+oc.getOrcamentos().get(index).getCpf());
            comboVeiculo.setSelectedItem(""+oc.getOrcamentos().get(index).getVeiculo());
            inputModelo.setText(""+oc.getOrcamentos().get(index).getModelo());
            inputPlaca.setText(""+oc.getOrcamentos().get(index).getPlaca());
            inputServico.setText(""+oc.getOrcamentos().get(index).getServico());
            inputAtendente.setText(""+oc.getOrcamentos().get(index).getAtendente());
            inputDataInicio.setText(""+sdf.format(oc.getOrcamentos().get(index).getDataInicio().getTime()));
            inputPrevisaoEntrega.setText(""+sdf.format(oc.getOrcamentos().get(index).getPrevisaoEntrega().getTime()));
            inputValor.setText(""+formatter.format(oc.getOrcamentos().get(index).getValor()));
            inputSituacao.setText(""+oc.getOrcamentos().get(index).getSituacao());
            inputObservacoes.setText(""+oc.getOrcamentos().get(index).getObservacoes());
            inputId.setEnabled(false);
            inputSituacao.setEditable(false);
            this.valoresInput();
        } catch (Exception ex) {
            Logger.getLogger(OrcamentoView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        

    public void valoresInput() throws ParseException{
        
//        this.id = Integer.parseInt(inputId.getText());
        this.cliente = inputCliente.getText().toUpperCase();
        this.cpf = inputCpf.getText();
        this.veiculo = (String) comboVeiculo.getSelectedItem();
        this.modelo = inputModelo.getText().toUpperCase();
        this.placa = inputPlaca.getText();
        this.servico = inputServico.getText().toUpperCase();
        this.atendente = inputAtendente.getText().toUpperCase();
        this.dtInicio = sdf.parse(inputDataInicio.getText());
        this.pvEntrega = sdf.parse(inputPrevisaoEntrega.getText());
        this.valor = Double.parseDouble(inputValor.getText().replace(",", "."));
        this.situacao = inputSituacao.getText();
        this.observacoes = inputObservacoes.getText().toUpperCase();
    }
    
    
    public void limparCampos(){
        inputId.setText("");
        inputCliente.setText("");
        inputCpf.setText("");
        inputPlaca.setText("");
        comboVeiculo.setSelectedIndex(0);
        inputModelo.setText("");
        inputServico.setText("");
        inputAtendente.setText("");
        inputDataInicio.setText("");
        inputValor.setText("");
        inputPrevisaoEntrega.setText("");
        inputSituacao.setText("");
        inputObservacoes.setText("");
    }
    
    public static void ativarInputCadastrar(){
        inputId.setEnabled(false);
        inputCliente.setEnabled(true);
        inputCpf.setEnabled(true);
        inputPlaca.setEnabled(true);
        comboVeiculo.setEnabled(true);
        inputModelo.setEnabled(true);
        inputServico.setEnabled(true);
        inputAtendente.setEnabled(true);
        inputDataInicio.setEnabled(true);
        inputValor.setEnabled(true);
        inputPrevisaoEntrega.setEnabled(true);
        inputObservacoes.setEnabled(true);
    }
    
    public void ativarButtonCadastrar(){
        buttonCadastrar.setEnabled(true);
        buttonImprimir.setEnabled(false);
        buttonExcluir.setEnabled(false);
        buttonSelecionar.setEnabled(false);
        buttonEditar.setEnabled(false);
        buttonInicio.setEnabled(false);
        buttonAnterior.setEnabled(false);
        buttonProximo.setEnabled(false);
        buttonFinal.setEnabled(false);
        buttonOS.setEnabled(false);
    }
    
    public void ativarButtonSelecionar(){
        buttonSelecionar.setEnabled(true);
        buttonCadastrar.setEnabled(false);
        buttonImprimir.setEnabled(false);
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
        buttonImprimir.setEnabled(false);
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
        inputCliente.setEnabled(true);
        inputCpf.setEnabled(true);
        inputPlaca.setEnabled(true);
        comboVeiculo.setEnabled(true);
        inputModelo.setEnabled(true);
        inputServico.setEnabled(true);
        inputAtendente.setEnabled(true);
        inputDataInicio.setEnabled(true);
        inputValor.setEnabled(true);
        inputPrevisaoEntrega.setEnabled(true);
        inputObservacoes.setEnabled(true);
        
        //Botões
        
        buttonOS.setEnabled(true);
        buttonCadastrar.setEnabled(true);
        buttonImprimir.setEnabled(true);
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
        
        inputId.setEnabled(false);
        inputCliente.setEnabled(false);
        inputCpf.setEnabled(false);
        inputPlaca.setEnabled(false);
        comboVeiculo.setEnabled(false);
        inputModelo.setEnabled(false);
        inputServico.setEnabled(false);
        inputAtendente.setEnabled(false);
        inputDataInicio.setEnabled(false);
        inputValor.setEnabled(false);
        inputPrevisaoEntrega.setEnabled(false);
        inputObservacoes.setEnabled(false);
        
        //Botões
        
        buttonOS.setEnabled(false);
        buttonCadastrar.setEnabled(false);
        buttonImprimir.setEnabled(false);
        buttonSelecionar.setEnabled(false);
        buttonEditar.setEnabled(false);
        buttonExcluir.setEnabled(false);
        buttonInicio.setEnabled(false);
        buttonAnterior.setEnabled(false);
        buttonProximo.setEnabled(false);
        buttonFinal.setEnabled(false);
    }

}
