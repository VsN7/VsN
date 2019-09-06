
package br.com.vsn.view;

import br.com.vsn.controller.FuncionarioController;
import br.com.vsn.controller.UsuarioController;
import br.com.vsn.model.Usuario;
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
    
    FuncionarioController fc;
    SimpleDateFormat sdf;
    static int index = 0;
    static int verificaButtonSenha = 0;
    public static int validadorCadUsuario = 0;
    String diretorio = "C:\\VsN\\fotos\\usuarios\\";
    public static Usuario user = new Usuario();
    InformarSenhaView ifv;
    
    int id;
    String nome;
    String cpf;
    Date dtNascimento;
    String sexo;
    String caminhoImg;
    String login;
    String funcao;
    String telefone;
    String email;
    String situacao;
    public static String senha;
    public static String palavraSergurnca;
    
    public FuncionarioView() throws Exception {
        sdf = new SimpleDateFormat("dd/MM/yyyy");
        fc = new FuncionarioController();
        
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int lar = (int) d.getWidth();
        int alt = (int) d.getHeight();
        this.setLocation((lar - this.getSize().width) / 6, (alt - this.getSize().height)/30);
        initComponents();
        
        ifv = new InformarSenhaView();
        
        if(fc.getFuncionarios().size()<=0){
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
        inputNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        inputCpf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
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
        fotografiaFuncionario = new javax.swing.JLabel();
        inputSituacao = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        inputTelefone = new javax.swing.JTextField();
        inputEmail = new javax.swing.JTextField();
        buttonImprimir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        buttonSelecionar = new javax.swing.JButton();
        buttonInicio = new javax.swing.JButton();
        buttonExcluir = new javax.swing.JButton();
        buttonCadastrar = new javax.swing.JButton();
        buttonAnterior = new javax.swing.JButton();
        buttonEditar = new javax.swing.JButton();
        buttonFinal = new javax.swing.JButton();
        buttonProximo = new javax.swing.JButton();
        buttonSenha = new javax.swing.JToggleButton();
        jSeparator2 = new javax.swing.JSeparator();

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
        inputNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inputNomeKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nome");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("CPF");

        inputCpf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Data de Nascimento");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Sexo");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Dados do Funcionario");

        comboSexo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino", "Outro" }));

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

        fotografiaFuncionario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fotografiaFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fotografiaFuncionarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fotografiaFuncionarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fotografiaFuncionarioMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fotografiaFuncionarioMousePressed(evt);
            }
        });

        inputSituacao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("Situação");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Contato do Funcionario");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("E-mail");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Telefone");

        inputTelefone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        inputEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        buttonImprimir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonImprimir.setText("Imprimir");
        buttonImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonImprimirActionPerformed(evt);
            }
        });

        buttonSelecionar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonSelecionar.setText("Selecionar");
        buttonSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSelecionarActionPerformed(evt);
            }
        });

        buttonInicio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonInicio.setText("|<");
        buttonInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIniciojButton5ActionPerformed(evt);
            }
        });

        buttonExcluir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonExcluir.setText("Excluir");
        buttonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirActionPerformed(evt);
            }
        });

        buttonCadastrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonCadastrar.setText("Novo");
        buttonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastrarActionPerformed(evt);
            }
        });

        buttonAnterior.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonAnterior.setText("<<");
        buttonAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAnteriorjButton6ActionPerformed(evt);
            }
        });

        buttonEditar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonEditar.setText("Editar");
        buttonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarActionPerformed(evt);
            }
        });

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

        buttonSenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonSenha.setText("Informar Senha");
        buttonSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSenhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
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
                            .addComponent(inputSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24)))
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
                        .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(calendarioDtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inputDtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(comboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(inputImagem))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonCaminhoImg, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(inputId, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(inputCpf)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fotografiaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(inputFuncao))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(inputLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buttonSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fotografiaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSenha))
                .addGap(22, 22, 22)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonImprimir)
                    .addGroup(jPanel1Layout.createSequentialGroup()
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
                            .addComponent(buttonEditar))))
                .addContainerGap())
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
        index = fc.getFuncionarios().size()-1;
        exibirDados();
    }//GEN-LAST:event_buttonFinaljButton8ActionPerformed

    private void buttonProximojButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonProximojButton7ActionPerformed
        if(index < fc.getFuncionarios().size()-1){
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
                UsuarioController uc = new UsuarioController();
                if(inputLogin.getText().equals("Sem Acesso ao Sistema")){
                    
                    fc.editFuncionario(0,Integer.parseInt(inputId.getText()), nome, cpf, sexo, dtNascimento,caminhoImg,funcao,login, telefone, email,fc.getFuncionarios().get(index).getSituacao(),senha,palavraSergurnca);
                    if(FuncionarioController.estouraErroNulo == 0){
                        buttonEditar.setText("Editar");
                        buttonSenha.setText("Informar Senha");
                        this.exibirDados();
                    }
                }
                else{ 
                    if(verificaButtonSenha == 0 || InformarSenhaView.inputSenha.getText().isEmpty() || InformarSenhaView.inputPalavraSeguranca.getText().isEmpty()){
                        user = uc.pesquisarUnicoId(fc.getFuncionarios().get(index).getUsuario_id()).get(0);    
                        fc.editFuncionario(user.getId(),Integer.parseInt(inputId.getText()), nome, cpf, sexo, dtNascimento,caminhoImg,funcao,login, telefone, email,fc.getFuncionarios().get(index).getSituacao(),user.getSenha(),user.getPalavraSeguranca());
                        verificaButtonSenha=0;
                        if(FuncionarioController.estouraErroNulo == 0){
                            JOptionPane.showMessageDialog(rootPane, "Não houveram alterações na senha!", "Aviso", JOptionPane.INFORMATION_MESSAGE, null);                       
                            buttonEditar.setText("Editar");
                            buttonSenha.setText("Informar Senha");
                            this.exibirDados();
                        }
                    }else{
                        user = uc.pesquisarUnicoId(fc.getFuncionarios().get(index).getUsuario_id()).get(0);
                        fc.editFuncionario(user.getId(),Integer.parseInt(inputId.getText()), nome, cpf, sexo, dtNascimento,caminhoImg,funcao,login, telefone, email,fc.getFuncionarios().get(index).getSituacao(),senha,palavraSergurnca);     
                        if(FuncionarioController.estouraErroNulo == 0){
                            buttonEditar.setText("Editar");
                            buttonSenha.setText("Informar Senha");
                            this.exibirDados();
                        }
                    }
                }
            } catch (Exception ex) {
            Logger.getLogger(FuncionarioView.class.getName()).log(Level.SEVERE, null, ex);
        }
        }else{
            this.ativarButtonEditar();
            buttonSenha.setText("Alterar Senha");
            buttonEditar.setText("Salvar");
            if(inputLogin.getText().equals("Sem Acesso ao Sistema")){
                buttonSenha.setEnabled(false);
                inputLogin.setEditable(false);
            }else{
                buttonSenha.setEnabled(true);
                inputLogin.setEditable(true);
            }
        }
    }//GEN-LAST:event_buttonEditarActionPerformed

    private void buttonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirActionPerformed
        
    }//GEN-LAST:event_buttonExcluirActionPerformed

    private void buttonSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSelecionarActionPerformed
        if(buttonSelecionar.getText().equals("Buscar")){
            try {
                int i = 0;
                int id = Integer.parseInt(inputId.getText());
                Iterator iterator = fc.getFuncionarios().iterator();
                int condicaoErro = 0;
                do{
                    if(id == fc.getFuncionarios().get(i).getId()){
                        condicaoErro=1;
                        index=i;
                    }
                    iterator.next();
                    if(i<fc.getFuncionarios().size()-1)
                        i++;
                
                }while (iterator.hasNext());
                if(condicaoErro==0){
                    
                    JOptionPane.showMessageDialog(null, "Dados não encontrados", "Aviso", JOptionPane.ERROR_MESSAGE);
                   
                }else{
                    this.exibirDados();
                    buttonSelecionar.setText("Selecionar");
                    this.ativarTudo();
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Dados não encontrados", "Aviso", JOptionPane.ERROR_MESSAGE);
            }
        }else{this.desativarTudo();
            this.ativarButtonSelecionar();
            this.limparCampos();
            inputId.setEnabled(true);
            inputId.setEditable(true);
            inputNome.setEnabled(true);
            buttonSelecionar.setText("Buscar");
        }
    }//GEN-LAST:event_buttonSelecionarActionPerformed

    private void buttonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastrarActionPerformed
        if(buttonCadastrar.getText().equals("Salvar")){
            this.valoresInput();
            fc.salvarFuncionario(this.nome, this.cpf, this.sexo, this.dtNascimento,this.caminhoImg,this.login,this.funcao, this.telefone, this.email,this.senha,this.palavraSergurnca);
            if(FuncionarioController.estouraErroNulo != 1){
                buttonCadastrar.setText("Novo");
                fc = new FuncionarioController();
                index = fc.getFuncionarios().size()-1;
                this.exibirDados();
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
        if(buttonSelecionar.getText().equals("Buscar")){
            if (evt.getKeyCode() == evt.VK_F1) {                    
                try {
                    PesquisarFuncionarioView pfv = new PesquisarFuncionarioView();
                    this.getParent().add(pfv);
                    pfv.setVisible(true);


            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Falha ao tentar acessar o banco de dados", "Aviso", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_inputIdKeyPressed

    private void buttonCaminhoImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCaminhoImgActionPerformed
        try{
            JFileChooser buscarImg = new JFileChooser();
            buscarImg.setCurrentDirectory(new java.io.File("C:\\VsN\\VsN\\src\\imagens"));
            buscarImg.setDialogTitle("Carregar Foto do Funcionario");
            buscarImg.showOpenDialog(this);
            String foto = ""+buscarImg.getSelectedFile().getName();
            inputImagem.setText(foto);
            this.preencherImagem();

        }catch(Exception e){
            
        }

    }//GEN-LAST:event_buttonCaminhoImgActionPerformed

    private void fotografiaFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fotografiaFuncionarioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_fotografiaFuncionarioMouseClicked

    private void fotografiaFuncionarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fotografiaFuncionarioMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_fotografiaFuncionarioMouseEntered

    private void fotografiaFuncionarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fotografiaFuncionarioMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_fotografiaFuncionarioMouseExited

    private void fotografiaFuncionarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fotografiaFuncionarioMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_fotografiaFuncionarioMousePressed

    private void buttonSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSenhaActionPerformed
        verificaButtonSenha = 1;
        if(buttonSenha.getText().equals("Informar Senha")){
            try {
                if(!inputLogin.getText().isEmpty() && !inputCpf.getText().isEmpty()){
                    InformarSenhaView.inputCpf.setText(inputCpf.getText());
                    InformarSenhaView.inputLogin.setText(inputLogin.getText());
                    this.getParent().add(ifv);
                    ifv.setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, "É necessário preencher o campo Login e CPF primeiro!", "Aviso", JOptionPane.ERROR_MESSAGE);
                }

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Falha ao tentar acessar o banco de dados", "Aviso", JOptionPane.ERROR_MESSAGE);
            }
        }
        if(buttonSenha.getText().equals("Alterar Senha")){
            try {
                if(!inputLogin.getText().isEmpty() && !inputCpf.getText().isEmpty()){
                    InformarSenhaView isv = new InformarSenhaView();
                    isv.salvarButton.setText("Alterar");
                    this.getParent().add(isv);
                    isv.setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, "É necessário preencher o campo Login e CPF corretamente primeiro!", "Aviso", JOptionPane.ERROR_MESSAGE);
                }

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Falha ao tentar acessar o banco de dados", "Aviso", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_buttonSenhaActionPerformed

    private void inputNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputNomeKeyPressed
        if(buttonSelecionar.getText().equals("Buscar")){
            if (evt.getKeyCode() == evt.VK_F1) {                    
                try {
                    PesquisarFuncionarioView pfv = new PesquisarFuncionarioView();
                    this.getParent().add(pfv);
                    pfv.setVisible(true);


            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Falha ao tentar acessar o banco de dados", "Aviso", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_inputNomeKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAnterior;
    private javax.swing.JButton buttonCadastrar;
    public static javax.swing.JToggleButton buttonCaminhoImg;
    private javax.swing.JButton buttonEditar;
    private javax.swing.JButton buttonExcluir;
    private javax.swing.JButton buttonFinal;
    private javax.swing.JButton buttonImprimir;
    private javax.swing.JButton buttonInicio;
    private javax.swing.JButton buttonProximo;
    public static javax.swing.JButton buttonSelecionar;
    public static javax.swing.JToggleButton buttonSenha;
    private javax.swing.JLabel calendarioDtNascimento;
    public static javax.swing.JComboBox<String> comboSexo;
    private javax.swing.JLabel fotografiaFuncionario;
    public static javax.swing.JTextField inputCpf;
    public static javax.swing.JTextField inputDtNascimento;
    public static javax.swing.JTextField inputEmail;
    public static javax.swing.JTextField inputFuncao;
    public static javax.swing.JTextField inputId;
    public static javax.swing.JTextField inputImagem;
    public static javax.swing.JTextField inputLogin;
    public static javax.swing.JTextField inputNome;
    public static javax.swing.JTextField inputSituacao;
    public static javax.swing.JTextField inputTelefone;
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
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables

    public int anterior(){
        return --index;
    }
    public int posterior(){
        return ++index;
    }
    
        public void exibirDados(){
        fc = new FuncionarioController();
        try {
            this.ativarTudo();
            inputId.setText(""+fc.getFuncionarios().get(index).getId());
            inputNome.setText(""+fc.getFuncionarios().get(index).getNome());
            inputCpf.setText(""+fc.getFuncionarios().get(index).getCpf());
            inputDtNascimento.setText(""+sdf.format(fc.getFuncionarios().get(index).getDataNascimento().getTime()));
            inputLogin.setText(""+fc.getFuncionarios().get(index).getLogin());
            inputFuncao.setText(""+fc.getFuncionarios().get(index).getFuncao());
            comboSexo.setSelectedItem(""+fc.getFuncionarios().get(index).getSexo());
            inputImagem.setText(""+fc.getFuncionarios().get(index).getCaminhoImg());
            inputTelefone.setText(""+fc.getFuncionarios().get(index).getTelefone());
            inputEmail.setText(""+fc.getFuncionarios().get(index).getEmail());
            inputSituacao.setText(""+fc.getFuncionarios().get(index).getSituacao());
            inputId.setEditable(false);
            inputSituacao.setEditable(false);
            buttonSenha.setEnabled(false);
            if(inputId.getText().equals("Sem Acesso ao Sistema")){
                inputLogin.setEditable(false);
                buttonSenha.setEnabled(false);
            }
                this.preencherImagem();
            this.valoresInput();
        } catch (Exception ex) {
            Logger.getLogger(FuncionarioView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void valoresInput(){     
//        this.id = Integer.parseInt(inputId.getText());
    try{
        if(!inputLogin.getText().isEmpty()){
            this.nome = inputNome.getText().toUpperCase();
            this.cpf = inputCpf.getText();
            this.dtNascimento = sdf.parse(inputDtNascimento.getText());
            this.sexo = (String) comboSexo.getSelectedItem();
            this.caminhoImg = inputImagem.getText();
            this.login = inputLogin.getText();
            this.funcao = inputFuncao.getText();
            this.situacao = inputSituacao.getText();
            this.telefone = inputTelefone.getText();
            this.email = inputEmail.getText().toUpperCase();
        }else{
            this.nome = inputNome.getText().toUpperCase();
            this.cpf = inputCpf.getText();
            this.dtNascimento = sdf.parse(inputDtNascimento.getText());
            this.sexo = (String) comboSexo.getSelectedItem();
            this.caminhoImg = inputImagem.getText();
            this.login = "Sem Acesso ao Sistema";
            this.funcao = inputFuncao.getText();
            this.situacao = inputSituacao.getText();
            this.telefone = inputTelefone.getText();
            this.email = inputEmail.getText().toUpperCase();
        }
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Data de Nascimento Inválida", "Aviso", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void preencherImagem(){
        fotografiaFuncionario.setIcon(new ImageIcon(diretorio+inputImagem.getText()));
        ImageIcon img = new ImageIcon(diretorio+inputImagem.getText());
        Image image = img.getImage();  
        Image newimg = image.getScaledInstance(158, 133, java.awt.Image.SCALE_SMOOTH);  
        fotografiaFuncionario.setIcon(new ImageIcon(newimg));
    }
    
    public void limparCampos(){
        inputId.setText("");
        inputNome.setText("");
        inputCpf.setText("");
        inputLogin.setText("");
        inputFuncao.setText("");
        inputDtNascimento.setText("");
        comboSexo.setSelectedIndex(0);
        inputImagem.setText("semFoto.png");
        this.preencherImagem();
        inputTelefone.setText("");
        inputEmail.setText("");
        inputSituacao.setText("");
    }
    
    public static void ativarInputCadastrar(){
        inputId.setEditable(false);
        inputNome.setEnabled(true);
        inputCpf.setEnabled(true);
        inputImagem.setEnabled(true);
        inputDtNascimento.setEnabled(true);
        inputLogin.setEnabled(true);
        inputFuncao.setEnabled(true);
        comboSexo.setEnabled(true);
        inputTelefone.setEnabled(true);
        inputEmail.setEnabled(true);
        inputSituacao.setEditable(false);
        buttonCaminhoImg.setEnabled(true);
        buttonSenha.setEnabled(true);
    }
    
    public void ativarButtonCadastrar(){     
        buttonCadastrar.setEnabled(true);
        buttonImprimir.setEnabled(false);
        buttonSelecionar.setEnabled(false);
        buttonExcluir.setEnabled(false);
        buttonEditar.setEnabled(false);
        buttonInicio.setEnabled(false);
        buttonAnterior.setEnabled(false);
        buttonProximo.setEnabled(false);
        buttonFinal.setEnabled(false);
        buttonCaminhoImg.setEnabled(false);
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
        buttonCaminhoImg.setEnabled(true);
        buttonSenha.setEnabled(true);
    }
    
    public void desativarTudo(){
        
        //Inputs
        
        inputId.setEditable(false);
        inputNome.setEnabled(false);
        inputCpf.setEnabled(false);
        inputImagem.setEnabled(false);
        inputImagem.setEnabled(false);
        inputDtNascimento.setEnabled(false);
        inputLogin.setEnabled(false);
        inputFuncao.setEnabled(false);
        comboSexo.setEnabled(false);
        inputTelefone.setEnabled(false);
        inputEmail.setEnabled(false);
        inputSituacao.setEditable(false);
        
        //Botões
        buttonSenha.setEnabled(false);
        buttonCaminhoImg.setEnabled(false);
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
    
    public void ativarTudo(){
        
        //Inputs
        
        inputId.setEnabled(true);
        inputNome.setEnabled(true);
        inputCpf.setEnabled(true);
        inputImagem.setEnabled(true);
        inputDtNascimento.setEnabled(true);
        inputLogin.setEnabled(true);
        inputLogin.setEditable(true);
        inputFuncao.setEnabled(true);
        comboSexo.setEnabled(true);
        inputTelefone.setEnabled(true);
        inputEmail.setEnabled(true);
        inputSituacao.setEnabled(true);
        
        //Botões
        
        buttonCaminhoImg.setEnabled(true);
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
