
package br.com.vsn.view;

import br.com.vsn.controller.OrcamentoController;
import br.com.vsn.controller.OrdemServicoController;
import br.com.vsn.controller.PagamentoController;
import br.com.vsn.controller.PagamentoTabelaController;
import br.com.vsn.model.OrdemServico;
import br.com.vsn.model.Pagamento;
import br.com.vsn.util.JanelaDialogo;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
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
public class OrdemServicoView extends javax.swing.JInternalFrame {
    
    OrdemServicoController osc;
    SimpleDateFormat sdf;
    NumberFormat formatter;
    public static int index = 0;
    public static OrdemServico ordemServico;
    
    int id;
    String cliente;
    String cpf;
    String veiculo;
    String modelo;
    String marca;
    int ano;
    String placa;
    String servico;
    String atendente;
    Date dtInicio;
    Date pvEntrega;
    double valor;
    String situacao;
    String observacoes;
    
    public OrdemServicoView() throws Exception {
        sdf = new SimpleDateFormat("dd/MM/yyyy");
        formatter = new DecimalFormat("#0.00");
        osc = new OrdemServicoController();
        ordemServico = new OrdemServico();
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int lar = (int) d.getWidth();
        int alt = (int) d.getHeight();
        this.setLocation((lar - this.getSize().width) / 6, (alt - this.getSize().height)/64);
        initComponents();
        
        if(osc.getOrdemServicos().size()<=0){
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
        try{
            javax.swing.text.MaskFormatter cpf= new javax.swing.text.MaskFormatter("###.###.###-##");
            inputCpf = new javax.swing.JFormattedTextField(cpf);
        }
        catch (Exception e){
        }
        buttonFinal = new javax.swing.JButton();
        buttonProximo = new javax.swing.JButton();
        buttonAnterior = new javax.swing.JButton();
        buttonInicio = new javax.swing.JButton();
        buttonEditar = new javax.swing.JButton();
        buttonExcluir = new javax.swing.JButton();
        buttonSelecionar = new javax.swing.JButton();
        buttonCadastrar = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
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
        comboVeiculo = new javax.swing.JComboBox<>();
        inputMarca = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        inputModelo = new javax.swing.JTextField();
        inputAno = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        inputPlaca = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        inputServico = new javax.swing.JTextArea();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastro de O.S");
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

        buttonCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonCancelar.setText("Cancelar Pagamento");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Data de Inicio");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Dados do Serviço");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Dados do Cliente");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Serviço");

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
        buttonOS.setText("Efetuar Pagamento");
        buttonOS.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonOSMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonOSMouseExited(evt);
            }
        });
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

        comboVeiculo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboVeiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CARRO", "MOTO", "ÔNIBUS", "CAMINHÃO", "OUTRO" }));

        inputMarca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Marca");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Veículo");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Modelo");

        inputModelo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        inputAno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Ano");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Placa do Veículo");

        inputPlaca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        inputServico.setColumns(20);
        inputServico.setRows(5);
        jScrollPane2.setViewportView(inputServico);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 899, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
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
                            .addComponent(jLabel5)
                            .addComponent(comboVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(inputMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputModelo)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputAno, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)))
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(calendarDtInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(inputDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(calendarPvEntrega, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputPrevisaoEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputValor, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel21)
                            .addComponent(inputSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
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
                            .addComponent(buttonOS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27)
                            .addComponent(buttonCancelar))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel22)
                    .addComponent(jLabel11)
                    .addComponent(jLabel23)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addGap(1, 1, 1)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(calendarDtInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addGap(0, 0, Short.MAX_VALUE)
                                            .addComponent(inputDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel21)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(inputSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(calendarPvEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inputValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputPrevisaoEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonOS, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(buttonEditar)
                    .addComponent(buttonCancelar))
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

    private void buttonFinaljButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFinaljButton8ActionPerformed
        index = osc.getOrdemServicos().size()-1;
        exibirDados();
    }//GEN-LAST:event_buttonFinaljButton8ActionPerformed

    private void buttonProximojButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonProximojButton7ActionPerformed
        if(index < osc.getOrdemServicos().size()-1){
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
                osc = new OrdemServicoController();
                osc.editOrdemServico(Integer.parseInt(inputId.getText()),ordemServico);
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
        if(inputSituacao.getText().equals("ABERTO")){
            try {
                osc.destroy(Integer.parseInt(inputId.getText()),osc.getOrdemServicos().get(index).getOrcamento_id());
                
                if(index<0 &&osc.getOrdemServicos().size()>0){
                    index++;
                }
                osc = new OrdemServicoController();
                if(osc.getOrdemServicos().size()<=0){
                    this.limparCampos();
                    this.desativarTudo();
                    this.ativarButtonCadastrar();
                    if(buttonCadastrar.getText().equals("Salvar"))
                        this.ativarInputCadastrar();
                }else{
                    osc = new OrdemServicoController();
                    this.exibirDados();
                }

            } catch (Exception ex) {
                Logger.getLogger(OrcamentoView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
                JOptionPane.showMessageDialog(null, "Imposivel Excluir Orçamento Vinculado", "Aviso", JOptionPane.ERROR_MESSAGE);
        }        
    }//GEN-LAST:event_buttonExcluirActionPerformed

    private void buttonSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSelecionarActionPerformed
        if(buttonSelecionar.getText().equals("Buscar")){
            try {
                int i = 0;
                int id = Integer.parseInt(inputId.getText());
                Iterator iterator = osc.getOrdemServicos().iterator();
                int condicaoErro = 0;
                do{
                    if(id == osc.getOrdemServicos().get(i).getId()){
                        index=i;
                        condicaoErro = 1;
                    }
                    iterator.next();
                    if(i<osc.getOrdemServicos().size()-1)
                        i++;
                }while (iterator.hasNext());
                if(condicaoErro==0){
                    
                    JOptionPane.showMessageDialog(null, "Dados não encontrados", "Aviso", JOptionPane.ERROR_MESSAGE);
                   
                }else{
                    this.exibirDados();
                    buttonSelecionar.setText("Selecionar");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Falha ao carregar dados", "Aviso", JOptionPane.ERROR_MESSAGE);
        
            }
        }else{
            this.desativarTudo();
            this.ativarButtonSelecionar();
            this.limparCampos();
            inputCliente.setEnabled(true);
            inputId.setEditable(true);
            inputId.setEnabled(true);
            buttonSelecionar.setText("Buscar");
        }
    }//GEN-LAST:event_buttonSelecionarActionPerformed

    private void buttonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastrarActionPerformed
        if(buttonCadastrar.getText().equals("Salvar")){
            try {
                this.valoresInput();
                osc = new OrdemServicoController();
                osc.salvarOrdemServico(0,this.cliente, this.cpf, this.veiculo, this.modelo,this.marca,this.ano, this.placa, this.servico, this.atendente, this.dtInicio, this.pvEntrega, this.valor, this.situacao, this.observacoes);
                buttonCadastrar.setText("Novo");
                index = osc.getOrdemServicos().size()-1;
                this.ativarTudo();
                this.exibirDados();
            } catch (Exception ex) {
            Logger.getLogger(OrdemServicoView.class.getName()).log(Level.SEVERE, null, ex);
        }
        }else{
            this.limparCampos();
            this.ativarButtonCadastrar();
            this.ativarInputCadastrar();
            buttonCadastrar.setText("Salvar");
        }
    }//GEN-LAST:event_buttonCadastrarActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        try{
            PagamentoController pc = new PagamentoController();
            int idPagamento = pc.pesquisarUnico(Integer.parseInt(inputId.getText())).get(0).getId();
            String situacaoPagamento = pc.pesquisarUnico(Integer.parseInt(inputId.getText())).get(0).getSituacao();
            if(situacaoPagamento.equals("ABERTO")){
                pc.destroy(idPagamento);
                if(PagamentoController.resp == JOptionPane.YES_OPTION){
                    PagamentoTabelaController ptc = new PagamentoTabelaController();
                    int idPag = ptc.getPagamentoTabelas().size();
                    PagamentoOsView.validaDestroy = 1;
                    for(int i =0; i< idPag;i++){
                        ptc = new PagamentoTabelaController();
                        ptc.destroy(ptc.getPagamentoTabelas().get(0).getId());
                    }
                    PagamentoOsView.validaDestroy = 0;
                    this.valoresInput();
                    ordemServico.setSituacao("ABERTO");
                    ordemServico.setPagamento_id(0);
                    osc.editOrdemServico(Integer.parseInt(inputId.getText()), ordemServico);
                    this.exibirDados();
                }
            }else{
                JOptionPane.showMessageDialog(null, "O pagamento foi finalizado, é necessário reabri-lo primeiro!", "Aviso", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Falha ao tentar deletar pagamento!", "Aviso", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void inputIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputIdActionPerformed
        
    }//GEN-LAST:event_inputIdActionPerformed

    private void inputIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputIdKeyPressed
        if (evt.getKeyCode() == evt.VK_F1) {                    
            try {
                PesquisarOrdemServicoView pv = new PesquisarOrdemServicoView();
                this.getParent().add(pv);
                pv.setVisible(true);
                
                   
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Falha ao tentar acessar o banco de dados", "Aviso", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_inputIdKeyPressed

    private void buttonOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOSActionPerformed
        if(buttonOS.getText().equals("Efetuar Pagamento")){
            try {
                    Pagamento pagamento = new Pagamento();
                    PagamentoController pc = new PagamentoController();
                    pagamento.setOrdemServico_id(Integer.parseInt(inputId.getText()));
                    pagamento.setValor(Double.parseDouble(inputValor.getText().replace(",", ".")));
                    pc.salvarPagamento(pagamento);
                    this.valoresInput();
                    osc = new OrdemServicoController();
                    ordemServico.setSituacao("O.S EM PAGAMENTO");
                    ordemServico.setPagamento_id(pc.getPagamentos().get(pc.getPagamentos().size()-1).getId());
                    osc.editOrdemServico(Integer.parseInt(inputId.getText()),ordemServico);
                    this.exibirDados();
                    PagamentoOsView posv = new PagamentoOsView();
                    this.getParent().add(posv);
                    posv.setVisible(true);
//                    JanelaDialogo jd = new JanelaDialogo();
//                    jd.geraDialogo(posv);
                } catch (Exception ex) {
                    Logger.getLogger(OrdemServicoView.class.getName()).log(Level.SEVERE, null, ex);
                }
        }else{
            PagamentoOsView posv = new PagamentoOsView();
            this.getParent().add(posv);
            posv.setVisible(true);
//            JanelaDialogo jd = new JanelaDialogo();
//            jd.geraDialogo(posv);
        }
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
        cv.setaCalendarOrdemServicoPvEntrega();
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
        cv.setaCalendarOrdemServicoDtInicio();
    }//GEN-LAST:event_calendarDtInicioMousePressed

    private void inputClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputClienteKeyPressed
        if(buttonSelecionar.getText().equals("Buscar") || buttonCadastrar.getText().equals("Salvar")){
            if (evt.getKeyCode() == evt.VK_F1) {
                if(buttonSelecionar.getText().equals("Buscar")){
                    try {
                        PesquisarOrdemServicoView pov = new PesquisarOrdemServicoView();
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

    private void buttonOSMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonOSMouseEntered
        buttonOS.setBorder(new LineBorder(new Color(52, 126, 164), 2, true));
    }//GEN-LAST:event_buttonOSMouseEntered

    private void buttonOSMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonOSMouseExited
        buttonOS.setBorder(new LineBorder(new Color(8, 90, 0), 1, true));
    }//GEN-LAST:event_buttonOSMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAnterior;
    public static javax.swing.JButton buttonCadastrar;
    public static javax.swing.JButton buttonCancelar;
    public static javax.swing.JButton buttonEditar;
    public static javax.swing.JButton buttonExcluir;
    private javax.swing.JButton buttonFinal;
    private javax.swing.JButton buttonInicio;
    public static javax.swing.JButton buttonOS;
    private javax.swing.JButton buttonProximo;
    private javax.swing.JButton buttonSelecionar;
    private javax.swing.JLabel calendarDtInicio;
    private javax.swing.JLabel calendarPvEntrega;
    public static javax.swing.JComboBox<String> comboVeiculo;
    public static javax.swing.JTextField inputAno;
    public static javax.swing.JTextField inputCliente;
    public static javax.swing.JTextField inputCpf;
    public static javax.swing.JTextField inputDataInicio;
    public static javax.swing.JTextField inputId;
    public static javax.swing.JTextField inputMarca;
    public static javax.swing.JTextField inputModelo;
    public static javax.swing.JTextArea inputObservacoes;
    public static javax.swing.JTextField inputPlaca;
    public static javax.swing.JTextField inputPrevisaoEntrega;
    public static javax.swing.JTextArea inputServico;
    public static javax.swing.JTextField inputSituacao;
    public static javax.swing.JTextField inputValor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
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
        osc = new OrdemServicoController();
        try {
            this.ativarTudo();
            inputId.setText(""+osc.getOrdemServicos().get(index).getId());
            inputCliente.setText(""+osc.getOrdemServicos().get(index).getCliente());
            inputCpf.setText(""+osc.getOrdemServicos().get(index).getCpf());
            comboVeiculo.setSelectedItem(""+osc.getOrdemServicos().get(index).getVeiculo());
            inputModelo.setText(""+osc.getOrdemServicos().get(index).getModelo());
            inputMarca.setText(""+osc.getOrdemServicos().get(index).getMarca());
            inputAno.setText(""+osc.getOrdemServicos().get(index).getAno());
            inputPlaca.setText(""+osc.getOrdemServicos().get(index).getPlaca());
            inputServico.setText(""+osc.getOrdemServicos().get(index).getServico());
            //inputAtendente.setText(""+osc.getOrdemServicos().get(index).getAtendente());
            inputDataInicio.setText(""+sdf.format(osc.getOrdemServicos().get(index).getDataInicio().getTime()));
            inputPrevisaoEntrega.setText(""+sdf.format(osc.getOrdemServicos().get(index).getPrevisaoEntrega().getTime()));
            inputValor.setText(""+formatter.format(osc.getOrdemServicos().get(index).getValor()));
            inputSituacao.setText(""+osc.getOrdemServicos().get(index).getSituacao());
            inputObservacoes.setText(""+osc.getOrdemServicos().get(index).getObservacoes());
            inputId.setEditable(false);
            inputSituacao.setEditable(false);
            if(!inputSituacao.getText().equals("ABERTO")){
                buttonOS.setText("Visualizar Pagamento");
                buttonExcluir.setEnabled(false);
                buttonEditar.setEnabled(false);
                buttonCancelar.setEnabled(true);
            }else{
                buttonOS.setText("Efetuar Pagamento");
                buttonExcluir.setEnabled(true);
                buttonEditar.setEnabled(true);
                buttonCancelar.setEnabled(false);
            }
            this.valoresInput();
        } catch (Exception ex) {
            Logger.getLogger(OrdemServicoView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        

    public void valoresInput() throws ParseException{
        
//        this.id = Integer.parseInt(inputId.getText());
        this.cliente = inputCliente.getText().toUpperCase();
        this.cpf = inputCpf.getText();
        this.veiculo = (String) comboVeiculo.getSelectedItem();
        this.modelo = inputModelo.getText().toUpperCase();
        this.marca = inputMarca.getText().toUpperCase();
        this.ano = Integer.parseInt(inputAno.getText());
        this.placa = inputPlaca.getText();
        this.servico = inputServico.getText().toUpperCase();
        //this.atendente = inputAtendente.getText().toUpperCase();
        this.dtInicio = sdf.parse(inputDataInicio.getText());
        this.pvEntrega = sdf.parse(inputPrevisaoEntrega.getText());
        this.valor = Double.parseDouble(inputValor.getText().replace(",", "."));
        this.situacao = inputSituacao.getText();
        this.observacoes = inputObservacoes.getText().toUpperCase();
        ordemServico = new OrdemServico();
        ordemServico.setCliente(cliente);
        ordemServico.setCpf(cpf);
        ordemServico.setVeiculo(veiculo);
        ordemServico.setMarca(marca);
        ordemServico.setAno(ano);
        ordemServico.setModelo(modelo);
        ordemServico.setPlaca(placa);
        ordemServico.setServico(servico);
        ordemServico.setAtendente(atendente);
        Calendar c = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        c.setTime(dtInicio);
        ordemServico.setDataInicio(c);
        c2.setTime(pvEntrega);
        ordemServico.setPrevisaoEntrega(c2);
        ordemServico.setValor(valor);
        ordemServico.setSituacao(situacao);
        ordemServico.setObservacoes(observacoes);
        if(!buttonCadastrar.getText().equals("Salvar")){
            ordemServico.setOrcamento_id(osc.getOrdemServicos().get(index).getOrcamento_id());
            ordemServico.setPagamento_id(osc.getOrdemServicos().get(index).getPagamento_id());
        }else{
            ordemServico.setOrcamento_id(0);
            ordemServico.setPagamento_id(0);
        }
    }
    
    
    public void limparCampos(){
        inputId.setText("");
        inputCliente.setText("");
        inputCpf.setText("");
        inputPlaca.setText("");
        comboVeiculo.setSelectedIndex(0);
        inputModelo.setText("");
        inputMarca.setText("");
        inputAno.setText("");
        inputServico.setText("");
        //inputAtendente.setText("");
        inputDataInicio.setText("");
        inputValor.setText("");
        inputPrevisaoEntrega.setText("");
        inputSituacao.setText("");
        inputObservacoes.setText("");
    }
    
    public static void ativarInputCadastrar(){
        inputId.setEditable(false);
        inputCliente.setEnabled(true);
        inputCpf.setEnabled(true);
        inputPlaca.setEnabled(true);
        comboVeiculo.setEnabled(true);
        inputMarca.setEnabled(true);
        inputAno.setEnabled(true);
        inputModelo.setEnabled(true);
        inputServico.setEnabled(true);
        //inputAtendente.setEnabled(true);
        inputDataInicio.setEnabled(true);
        inputValor.setEnabled(true);
        inputPrevisaoEntrega.setEnabled(true);
        inputSituacao.setEditable(false);
        inputObservacoes.setEnabled(true);
    }
    
    public void ativarButtonCadastrar(){
        buttonCadastrar.setEnabled(true);
        buttonCancelar.setEnabled(false);
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
        buttonCancelar.setEnabled(false);
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
        buttonCancelar.setEnabled(false);
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
        inputMarca.setEnabled(true);
        inputAno.setEnabled(true);
        inputModelo.setEnabled(true);
        inputServico.setEnabled(true);
        //inputAtendente.setEnabled(true);
        inputDataInicio.setEnabled(true);
        inputValor.setEnabled(true);
        inputPrevisaoEntrega.setEnabled(true);
        inputObservacoes.setEnabled(true);
        
        //Botões
        
        buttonOS.setEnabled(true);
        buttonCadastrar.setEnabled(true);
        buttonCancelar.setEnabled(true);
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
        inputCliente.setEnabled(false);
        inputCpf.setEnabled(false);
        inputPlaca.setEnabled(false);
        comboVeiculo.setEnabled(false);
        inputMarca.setEnabled(false);
        inputAno.setEnabled(false);
        inputModelo.setEnabled(false);
        inputServico.setEnabled(false);
        //inputAtendente.setEnabled(false);
        inputDataInicio.setEnabled(false);
        inputValor.setEnabled(false);
        inputPrevisaoEntrega.setEnabled(false);
        inputObservacoes.setEnabled(false);
        
        //Botões
        
        buttonOS.setEnabled(false);
        buttonCadastrar.setEnabled(false);
        buttonCancelar.setEnabled(false);
        buttonSelecionar.setEnabled(false);
        buttonEditar.setEnabled(false);
        buttonExcluir.setEnabled(false);
        buttonInicio.setEnabled(false);
        buttonAnterior.setEnabled(false);
        buttonProximo.setEnabled(false);
        buttonFinal.setEnabled(false);
    }

}
