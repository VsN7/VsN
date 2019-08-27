
package br.com.vsn.view;

import br.com.vsn.controller.ClienteController;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

/**
 *
 * @author vitor
 */
public class FuncionarioView extends javax.swing.JInternalFrame {
    
    ClienteController cc;
    SimpleDateFormat sdf;
    static int index = 0;
    String diretorio = "C:\\DuEvan\\fotos\\usuarios\\";
    
    int id;
    String nome;
    String cpf;
    Date dtNascimento;
    String sexo;
    String caminhoImg;
    String longradouro;
    int numero;
    String bairro;
    String cidade;
    String estado;
    String cep;
    String telefone;
    String email;
    String situacao;
    
    public FuncionarioView() throws Exception {
        sdf = new SimpleDateFormat("dd/MM/yyyy");
        cc = new ClienteController();
        
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int lar = (int) d.getWidth();
        int alt = (int) d.getHeight();
        this.setLocation((lar - this.getSize().width) / 6, (alt - this.getSize().height)/30);
        initComponents();
        
        this.exibirDados();
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        inputId = new javax.swing.JTextField();
        inputNome = new javax.swing.JTextField();
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
        jLabel16 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        inputTelefone = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        inputEmail = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        inputSituacao = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        comboSexo = new javax.swing.JComboBox<>();
        ImageIcon iconOrcamento = new ImageIcon(getClass().getResource("/icon/calendario.jpg")); Image imagem = iconOrcamento.getImage();
        calendarioDtNascimento = new javax.swing.JLabel(){
            public void paintComponent(Graphics g){
                g.drawImage(imagem,0,0,getWidth(),getHeight(),this);
            }
        };
        inputDtNascimento = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter dataInicio= new javax.swing.text.MaskFormatter("##/##/####");
            inputDtNascimento = new javax.swing.JFormattedTextField(dataInicio);
        }
        catch (Exception e){
        }
        inputFuncao = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        inputLogin = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        inputImagem = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        buttonCaminhoImg = new javax.swing.JToggleButton();
        fotografiaCliente = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastro de Funcionarios");
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

        inputNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nome");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("CPF");

        inputCpf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

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
        jLabel5.setText("Data de Nascimento");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Sexo");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Dados do Funcionario");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Contato do Funcionario");

        inputTelefone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Telefone");

        inputEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("E-mail");

        inputSituacao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("Situação");

        comboSexo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Masculino", "Feminino", "Outro" }));

        calendarioDtNascimento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        calendarioDtNascimento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calendarioDtNascimentoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calendarioDtNascimentoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calendarioDtNascimentoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                calendarioDtNascimentoMousePressed(evt);
            }
        });

        inputDtNascimento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputDtNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputDtNascimentoinputTitulo5ActionPerformed(evt);
            }
        });

        inputFuncao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Função na Empresa");

        inputLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Login");

        inputImagem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputImagem.setText("semFoto.png");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Caminho da Foto");

        buttonCaminhoImg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonCaminhoImg.setText("...");
        buttonCaminhoImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCaminhoImgActionPerformed(evt);
            }
        });

        fotografiaCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fotografiaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fotografiaClienteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fotografiaClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fotografiaClienteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fotografiaClienteMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(calendarioDtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(inputDtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel16)
                                            .addComponent(comboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(inputId, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(inputImagem)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(buttonCaminhoImg, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(4, 4, 4))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(inputCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(inputLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(inputFuncao))))
                        .addGap(18, 18, 18)
                        .addComponent(fotografiaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
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
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(inputTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel23)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(inputEmail))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel24)
                                    .addComponent(inputSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel16)
                                        .addComponent(jLabel8))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(comboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(inputDtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGap(22, 22, 22)
                                    .addComponent(calendarioDtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(inputImagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(buttonCaminhoImg)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inputFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(inputLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(fotografiaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 34, 34)
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
                    .addComponent(buttonImprimir)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonFinaljButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFinaljButton8ActionPerformed
        index = cc.getClientes().size()-1;
        exibirDados();
    }//GEN-LAST:event_buttonFinaljButton8ActionPerformed

    private void buttonProximojButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonProximojButton7ActionPerformed
        if(index < cc.getClientes().size()-1){
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
               // cc.editCliente(index, nome, cpf, sexo, dtNascimento, longradouro, numero, bairro, cidade, estado, cep, telefone, email,cc.getClientes().get(index).getSituacao());
                buttonEditar.setText("Editar");
                this.ativarTudo();
                this.exibirDados();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, "Campos Invalidos", "Aviso", JOptionPane.ERROR_MESSAGE, null);

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
                Iterator iterator = cc.getClientes().iterator();
                do{
                    if(id == cc.getClientes().get(i).getId()){
                        index=i;
                    }
                    iterator.next();
                    if(i<cc.getClientes().size()-1)
                        i++;
                
                }while (iterator.hasNext());
                this.exibirDados();
                buttonSelecionar.setText("Selecionar");
                this.ativarTudo();
            } catch (Exception ex) {
                Logger.getLogger(FuncionarioView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            
            inputId.setEnabled(true);
            buttonSelecionar.setText("Buscar");
        }
    }//GEN-LAST:event_buttonSelecionarActionPerformed

    private void buttonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastrarActionPerformed
        if(buttonCadastrar.getText().equals("Salvar")){
            try {
                this.valoresInput();
                //cc.salvarCliente(this.nome, this.cpf, this.sexo, this.dtNascimento, this.longradouro, this.numero, this.bairro, this.cidade, this.estado, this.cep, this.telefone, this.email);
                buttonCadastrar.setText("Novo");
                this.ativarTudo();
            } catch (Exception ex) {
                Logger.getLogger(FuncionarioView.class.getName()).log(Level.SEVERE, null, ex);
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

    private void calendarioDtNascimentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calendarioDtNascimentoMouseClicked
        calendarioDtNascimento.setBorder(new LineBorder(new Color(230, 40, 70), 3, true));
    }//GEN-LAST:event_calendarioDtNascimentoMouseClicked

    private void calendarioDtNascimentoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calendarioDtNascimentoMouseEntered
        calendarioDtNascimento.setBorder(new LineBorder(new Color(230, 40, 70), 2, true));
    }//GEN-LAST:event_calendarioDtNascimentoMouseEntered

    private void calendarioDtNascimentoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calendarioDtNascimentoMouseExited
        calendarioDtNascimento.setBorder(new LineBorder(Color.BLACK, 2, true));
    }//GEN-LAST:event_calendarioDtNascimentoMouseExited

    private void calendarioDtNascimentoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calendarioDtNascimentoMousePressed
        CalendarView cv = new CalendarView();
        this.getParent().add(cv);
        cv.setVisible(true);
        cv.setaCalendarFuncionarioDtNascimento();
    }//GEN-LAST:event_calendarioDtNascimentoMousePressed

    private void inputDtNascimentoinputTitulo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputDtNascimentoinputTitulo5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputDtNascimentoinputTitulo5ActionPerformed

    private void inputIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputIdActionPerformed
        
    }//GEN-LAST:event_inputIdActionPerformed

    private void inputIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputIdKeyPressed
        if (evt.getKeyCode() == evt.VK_F1) {                    
            try {
                PesquisarClienteView pv = new PesquisarClienteView();
                this.getParent().add(pv);
                pv.setVisible(true);
                
                   
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Falha ao tentar acessar o banco de dados", "Aviso", JOptionPane.ERROR_MESSAGE);
        }
        }
    }//GEN-LAST:event_inputIdKeyPressed

    private void buttonCaminhoImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCaminhoImgActionPerformed
        try{
            JFileChooser buscarImg = new JFileChooser();
            buscarImg.setCurrentDirectory(new java.io.File("C:\\DuEvan\\VsN\\VsN\\src\\imagens\\"));
            buscarImg.setDialogTitle("Carregar Foto do Funcionario");
            buscarImg.showOpenDialog(this);
            String foto = ""+buscarImg.getSelectedFile().getName();
            inputImagem.setText(foto);
            this.preencherImagem();

        }catch(Exception e){
            Logger.getLogger(FuncionarioView.class.getName()).log(Level.SEVERE, null, e);
        }

    }//GEN-LAST:event_buttonCaminhoImgActionPerformed

    private void fotografiaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fotografiaClienteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_fotografiaClienteMouseClicked

    private void fotografiaClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fotografiaClienteMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_fotografiaClienteMouseEntered

    private void fotografiaClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fotografiaClienteMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_fotografiaClienteMouseExited

    private void fotografiaClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fotografiaClienteMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_fotografiaClienteMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAnterior;
    private javax.swing.JButton buttonCadastrar;
    private javax.swing.JToggleButton buttonCaminhoImg;
    private javax.swing.JButton buttonEditar;
    private javax.swing.JButton buttonExcluir;
    private javax.swing.JButton buttonFinal;
    private javax.swing.JButton buttonImprimir;
    private javax.swing.JButton buttonInicio;
    private javax.swing.JButton buttonProximo;
    private javax.swing.JButton buttonSelecionar;
    private javax.swing.JLabel calendarioDtNascimento;
    private javax.swing.JComboBox<String> comboSexo;
    private javax.swing.JLabel fotografiaCliente;
    private javax.swing.JTextField inputCpf;
    public static javax.swing.JTextField inputDtNascimento;
    private javax.swing.JTextField inputEmail;
    private javax.swing.JTextField inputFuncao;
    private javax.swing.JTextField inputId;
    public static javax.swing.JTextField inputImagem;
    private javax.swing.JTextField inputLogin;
    private javax.swing.JTextField inputNome;
    private javax.swing.JTextField inputSituacao;
    private javax.swing.JTextField inputTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    public int anterior(){
        return --index;
    }
    public int posterior(){
        return ++index;
    }
    
        public void exibirDados(){
        cc = new ClienteController();
        try {
            this.ativarTudo();
            inputId.setText(""+cc.getClientes().get(index).getId());
            inputNome.setText(""+cc.getClientes().get(index).getNome());
            inputCpf.setText(""+cc.getClientes().get(index).getCpf());
            inputDtNascimento.setText(""+sdf.format(cc.getClientes().get(index).getDataNascimento().getTime()));
            comboSexo.setSelectedItem(""+cc.getClientes().get(index).getSexo());
            inputImagem.setText(""+cc.getClientes().get(index).getCaminhoImg());
            inputTelefone.setText(""+cc.getClientes().get(index).getTelefone());
            inputEmail.setText(""+cc.getClientes().get(index).getEmail());
            inputSituacao.setText(""+cc.getClientes().get(index).getSituacao());
            inputId.setEnabled(false);
            inputSituacao.setEnabled(false);
            this.preencherImagem();
            this.valoresInput();
        } catch (Exception ex) {
            Logger.getLogger(FuncionarioView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void valoresInput() throws ParseException{     
        this.id = Integer.parseInt(inputId.getText());
        this.nome = inputNome.getText().toUpperCase();
        this.cpf = inputCpf.getText();
        this.dtNascimento = sdf.parse(inputDtNascimento.getText());
        this.sexo = (String) comboSexo.getSelectedItem();
        this.caminhoImg = inputImagem.getText();
        this.telefone = inputTelefone.getText();
        this.email = inputEmail.getText().toUpperCase();
    }
    
    public void preencherImagem(){
        fotografiaCliente.setIcon(new ImageIcon(diretorio+inputImagem.getText()));
        ImageIcon img = new ImageIcon(diretorio+inputImagem.getText());
        Image image = img.getImage();  
        Image newimg = image.getScaledInstance(158, 133, java.awt.Image.SCALE_SMOOTH);  
        fotografiaCliente.setIcon(new ImageIcon(newimg));
    }
    
    public void limparCampos(){
        inputId.setText("");
        inputNome.setText("");
        inputCpf.setText("");
        inputDtNascimento.setText("");
        comboSexo.setSelectedIndex(0);
        inputImagem.setText("semFoto.png");
        this.preencherImagem();
        inputTelefone.setText("");
        inputEmail.setText("");
        inputSituacao.setText("");
    }
    
    public void ativarInputCadastrar(){
        inputId.setEnabled(false);
        inputNome.setEnabled(true);
        inputCpf.setEnabled(true);
        inputDtNascimento.setEnabled(true);
        comboSexo.setEnabled(true);
        inputTelefone.setEnabled(true);
        inputEmail.setEnabled(true);
        inputSituacao.setEnabled(false);
    }
    
    public void ativarButtonCadastrar(){     
        buttonCadastrar.setEnabled(true);
        buttonImprimir.setEnabled(false);
        buttonSelecionar.setEnabled(false);
        buttonEditar.setEnabled(false);
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
        inputNome.setEnabled(true);
        inputCpf.setEnabled(true);
        inputDtNascimento.setEnabled(true);
        comboSexo.setEnabled(true);
        inputTelefone.setEnabled(true);
        inputEmail.setEnabled(true);
        inputSituacao.setEnabled(true);
        
        //Botões
        
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


}
