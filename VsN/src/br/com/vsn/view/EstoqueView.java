
package br.com.vsn.view;

import br.com.vsn.controller.ClienteController;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
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
public class EstoqueView extends javax.swing.JInternalFrame {
    
    ClienteController cc;
    SimpleDateFormat sdf;
    static int index = 0;
    String diretorio = "C:\\DuEvan\\fotos\\clientes\\";
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
    
    public EstoqueView() throws Exception {
        sdf = new SimpleDateFormat("dd/MM/yyyy");
        cc = new ClienteController();
        
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int lar = (int) d.getWidth();
        int alt = (int) d.getHeight();
        this.setLocation((lar - this.getSize().width) / 6, (alt - this.getSize().height)/30);
        initComponents();
        
        if(cc.getClientes().size()<=0){
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

        jLabel24 = new javax.swing.JLabel();
        inputSituacao = new javax.swing.JTextField();
        inputEmail = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        inputTelefone = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        inputCidade1 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        comboEstado1 = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        inputCep1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        inputBairro = new javax.swing.JTextField();
        inputNumero = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        inputLongradouro = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        inputCnpj = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        inputRazaoSocial = new javax.swing.JTextField();
        inputIdFornecedor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        fotografiaCliente = new javax.swing.JLabel();
        buttonCaminhoImg = new javax.swing.JToggleButton();
        jLabel6 = new javax.swing.JLabel();
        inputImagem = new javax.swing.JTextField();
        comboMedida = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        inputValor = new javax.swing.JTextField();
        buttonImprimir = new javax.swing.JButton();
        buttonCadastrar = new javax.swing.JButton();
        buttonSelecionar = new javax.swing.JButton();
        buttonExcluir = new javax.swing.JButton();
        buttonEditar = new javax.swing.JButton();
        buttonInicio = new javax.swing.JButton();
        buttonAnterior = new javax.swing.JButton();
        buttonProximo = new javax.swing.JButton();
        buttonFinal = new javax.swing.JButton();
        inputCpf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inputDescrição = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        inputId = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastro de Produto em Estoque");
        setToolTipText("");
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("Situação");

        inputSituacao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        inputEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("E-mail");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Telefone");

        inputTelefone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("Cidade");

        inputCidade1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setText("Estado");

        comboEstado1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboEstado1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acre – AC", "Alagoas – AL", "Amapá – AP", "Amazonas – AM", "Bahia – BA", "Ceará – CE", "Distrito Federal – DF", "Espírito Santo – ES", "Goiás – GO", "Maranhão – MA", "Mato Grosso – MT", "Mato Grosso do Sul – MS", "Minas Gerais – MG", "Pará – PA", "Paraíba – PB", "Paraná – PR", "Pernambuco – PE", "Piauí – PI", "Roraima – RR", "Rondônia – RO", "Rio de Janeiro – RJ", "Rio Grande do Norte – RN", "Rio Grande do Sul – RS", "Santa Catarina – SC", "São Paulo – SP", "Sergipe – SE", "Tocantins – TO" }));
        comboEstado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEstado1ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("CEP");

        inputCep1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Bairro");

        inputBairro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        inputNumero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Numero");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Longradouro");

        inputLongradouro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("CNPJ");

        inputCnpj.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Razão Social");

        inputRazaoSocial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputRazaoSocial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputRazaoSocialActionPerformed(evt);
            }
        });
        inputRazaoSocial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inputRazaoSocialKeyPressed(evt);
            }
        });

        inputIdFornecedor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputIdFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputIdFornecedorActionPerformed(evt);
            }
        });
        inputIdFornecedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inputIdFornecedorKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("ID");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Dados do Fornecedor");

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

        buttonCaminhoImg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonCaminhoImg.setText("...");
        buttonCaminhoImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCaminhoImgActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Caminho da Foto");

        inputImagem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputImagem.setText("semFoto.png");

        comboMedida.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboMedida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Unidade (UN)", "Kilograma (KG)", "Litro (LT)", "Saco (SC)", "Caixa (CX)" }));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Dados do Produto");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Tipo de Medida");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Valor");

        inputValor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        buttonImprimir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonImprimir.setText("Imprimir");
        buttonImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonImprimirActionPerformed(evt);
            }
        });

        buttonCadastrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonCadastrar.setText("Novo");
        buttonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastrarActionPerformed(evt);
            }
        });

        buttonSelecionar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonSelecionar.setText("Selecionar");
        buttonSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSelecionarActionPerformed(evt);
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

        inputCpf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Qnt.");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Descrição");

        inputDescrição.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputDescrição.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputDescriçãoActionPerformed(evt);
            }
        });
        inputDescrição.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inputDescriçãoKeyPressed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(buttonImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonInicio))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(buttonSelecionar)
                            .addComponent(buttonAnterior))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonProximo))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonExcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonFinal, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(comboMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(inputCpf))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(inputValor, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addGap(123, 123, 123)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(inputImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonCaminhoImg, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(inputId, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(inputDescrição))))
                        .addGap(18, 18, 18)
                        .addComponent(fotografiaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(inputIdFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(inputRazaoSocial))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(inputCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(inputLongradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(inputNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(0, 369, Short.MAX_VALUE))
                            .addComponent(inputBairro)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(inputTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputEmail)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(inputSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(inputCidade1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboEstado1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(208, 208, 208))
                            .addComponent(inputCep1))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(fotografiaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(inputCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(buttonCaminhoImg)
                                .addComponent(comboMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(inputValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(inputImagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(inputId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(inputDescrição, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel6))
                                .addGap(36, 36, 36)))))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel11))
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputIdFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(jLabel20)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputLongradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel27)
                        .addComponent(jLabel17))
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputCidade1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputCep1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboEstado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel24)
                            .addComponent(jLabel23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonInicio)
                    .addComponent(buttonProximo)
                    .addComponent(buttonAnterior)
                    .addComponent(buttonFinal))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buttonCadastrar)
                        .addComponent(buttonExcluir)
                        .addComponent(buttonSelecionar)
                        .addComponent(buttonImprimir))
                    .addComponent(buttonEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
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
                cc = new ClienteController();
                cc.editCliente(Integer.parseInt(inputId.getText()), nome, cpf, sexo, dtNascimento,caminhoImg, longradouro, numero, bairro, cidade, estado, cep, telefone, email,cc.getClientes().get(index).getSituacao());
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
                int condicaoErro = 0;
                do{
                    if(id == cc.getClientes().get(i).getId()){
                        condicaoErro=1;
                        index=i;
                    }
                    iterator.next();
                    if(i<cc.getClientes().size()-1)
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
            inputId.setEditable(true);
            inputId.setEnabled(true);
            inputDescrição.setEnabled(true);
            buttonSelecionar.setText("Buscar");
        }
    }//GEN-LAST:event_buttonSelecionarActionPerformed

    private void buttonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastrarActionPerformed
        if(buttonCadastrar.getText().equals("Salvar")){
            try {
                this.valoresInput();
                cc = new ClienteController();
                cc.salvarCliente(this.nome, this.cpf, this.sexo, this.dtNascimento,this.caminhoImg, this.longradouro, this.numero, this.bairro, this.cidade, this.estado, this.cep, this.telefone, this.email);
                buttonCadastrar.setText("Novo");
                index = cc.getClientes().size()-1;
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
        if(buttonSelecionar.getText().equals("Buscar")){
            if (evt.getKeyCode() == evt.VK_F1) {
                if(buttonSelecionar.getText().equals("Buscar")){   
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
    }//GEN-LAST:event_inputIdKeyPressed

    private void inputDescriçãoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputDescriçãoKeyPressed
        if(buttonSelecionar.getText().equals("Buscar")){
            if (evt.getKeyCode() == evt.VK_F1) {
                if(buttonSelecionar.getText().equals("Buscar")){   
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
    }//GEN-LAST:event_inputDescriçãoKeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if(buttonSelecionar.getText().equals("Buscar")){
            if (evt.getKeyCode() == evt.VK_F1) {
                if(buttonSelecionar.getText().equals("Buscar")){   
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
    }//GEN-LAST:event_formKeyPressed

    private void inputDescriçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputDescriçãoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputDescriçãoActionPerformed

    private void buttonCaminhoImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCaminhoImgActionPerformed
        try{
            JFileChooser buscarImg = new JFileChooser();
            buscarImg.setCurrentDirectory(new java.io.File("C:\\DuEvan\\VsN\\VsN\\src\\imagens"));
            buscarImg.setDialogTitle("Carregar Foto do Cliente");
            buscarImg.showOpenDialog(this);
            String foto = ""+buscarImg.getSelectedFile().getName();
            inputImagem.setText(foto);
            this.preencherImagem();
            
        }catch(Exception e){
            Logger.getLogger(EstoqueView.class.getName()).log(Level.SEVERE, null, e);
        }
        
    }//GEN-LAST:event_buttonCaminhoImgActionPerformed

    private void fotografiaClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fotografiaClienteMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_fotografiaClienteMousePressed

    private void fotografiaClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fotografiaClienteMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_fotografiaClienteMouseExited

    private void fotografiaClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fotografiaClienteMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_fotografiaClienteMouseEntered

    private void fotografiaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fotografiaClienteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_fotografiaClienteMouseClicked

    private void inputIdFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputIdFornecedorActionPerformed

    }//GEN-LAST:event_inputIdFornecedorActionPerformed

    private void inputIdFornecedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputIdFornecedorKeyPressed
        if(buttonSelecionar.getText().equals("Buscar")){
            if (evt.getKeyCode() == evt.VK_F1) {
                try {
                    PesquisarFornecedorView pov = new PesquisarFornecedorView();
                    this.getParent().add(pov);
                    pov.setVisible(true);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Falha ao tentar acessar o banco de dados", "Aviso", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_inputIdFornecedorKeyPressed

    private void inputRazaoSocialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputRazaoSocialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputRazaoSocialActionPerformed

    private void inputRazaoSocialKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputRazaoSocialKeyPressed
        if(buttonSelecionar.getText().equals("Buscar")){
            if (evt.getKeyCode() == evt.VK_F1) {
                try {
                    PesquisarFornecedorView pov = new PesquisarFornecedorView();
                    this.getParent().add(pov);
                    pov.setVisible(true);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Falha ao tentar acessar o banco de dados", "Aviso", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_inputRazaoSocialKeyPressed

    private void comboEstado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEstado1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboEstado1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAnterior;
    public static javax.swing.JButton buttonCadastrar;
    private javax.swing.JToggleButton buttonCaminhoImg;
    private javax.swing.JButton buttonEditar;
    private javax.swing.JButton buttonExcluir;
    private javax.swing.JButton buttonFinal;
    private javax.swing.JButton buttonImprimir;
    private javax.swing.JButton buttonInicio;
    private javax.swing.JButton buttonProximo;
    public static javax.swing.JButton buttonSelecionar;
    public static javax.swing.JComboBox<String> comboEstado1;
    public static javax.swing.JComboBox<String> comboMedida;
    private javax.swing.JLabel fotografiaCliente;
    public static javax.swing.JTextField inputBairro;
    public static javax.swing.JTextField inputCep1;
    public static javax.swing.JTextField inputCidade1;
    public static javax.swing.JTextField inputCnpj;
    public static javax.swing.JTextField inputCpf;
    public static javax.swing.JTextField inputDescrição;
    public static javax.swing.JTextField inputEmail;
    public static javax.swing.JTextField inputId;
    public static javax.swing.JTextField inputIdFornecedor;
    public static javax.swing.JTextField inputImagem;
    public static javax.swing.JTextField inputLongradouro;
    public static javax.swing.JTextField inputNumero;
    public static javax.swing.JTextField inputRazaoSocial;
    public static javax.swing.JTextField inputSituacao;
    public static javax.swing.JTextField inputTelefone;
    public static javax.swing.JTextField inputValor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator2;
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
            inputDescrição.setText(""+cc.getClientes().get(index).getNome());
            inputCpf.setText(""+cc.getClientes().get(index).getCpf());
          //  inputDtNascimento.setText(""+sdf.format(cc.getClientes().get(index).getDataNascimento().getTime()));
            comboMedida.setSelectedItem(""+cc.getClientes().get(index).getSexo());
            inputImagem.setText(""+cc.getClientes().get(index).getCaminhoImg());
            inputLongradouro.setText(""+cc.getClientes().get(index).getLongradouro());
            inputNumero.setText(""+cc.getClientes().get(index).getNumero());
            inputBairro.setText(""+cc.getClientes().get(index).getBairro());
          //  inputCidade.setText(""+cc.getClientes().get(index).getCidade());
           // comboEstado.setSelectedItem(""+cc.getClientes().get(index).getEstado());
            inputValor.setText(""+cc.getClientes().get(index).getCep());
            inputTelefone.setText(""+cc.getClientes().get(index).getTelefone());
            inputEmail.setText(""+cc.getClientes().get(index).getEmail());
            inputSituacao.setText(""+cc.getClientes().get(index).getSituacao());
            inputId.setEditable(false);
            inputSituacao.setEditable(false);
            this.valoresInput();
            this.preencherImagem();
        } catch (Exception ex) {
            Logger.getLogger(EstoqueView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    public void preencherImagem(){
        fotografiaCliente.setIcon(new ImageIcon(diretorio+inputImagem.getText()));
        ImageIcon img = new ImageIcon(diretorio+inputImagem.getText());
        Image image = img.getImage();  
        Image newimg = image.getScaledInstance(158, 133, java.awt.Image.SCALE_SMOOTH);  
        fotografiaCliente.setIcon(new ImageIcon(newimg));
    }
        
    public void valoresInput() throws ParseException{
        
//        this.id = Integer.parseInt(inputId.getText());
        this.nome = inputDescrição.getText().toUpperCase();
        this.cpf = inputCpf.getText();
      //  this.dtNascimento = sdf.parse(inputDtNascimento.getText());
        this.sexo = (String) comboMedida.getSelectedItem();
        this.caminhoImg = inputImagem.getText();
        this.longradouro = inputLongradouro.getText().toUpperCase();
        this.numero = Integer.parseInt(inputNumero.getText());
        this.bairro = inputBairro.getText().toUpperCase();
        //this.cidade = inputCidade.getText().toUpperCase();
        //this.estado = (String) comboEstado.getSelectedItem();
        this.cep = inputValor.getText();
        this.telefone = inputTelefone.getText();
        this.email = inputEmail.getText().toUpperCase();
    }
    
    
    public void limparCampos(){
        inputId.setText("");
        inputDescrição.setText("");
        inputCpf.setText("");
       // inputDtNascimento.setText("");
        comboMedida.setSelectedIndex(0);
        inputImagem.setText("semFoto.png");
        this.preencherImagem();
        inputLongradouro.setText("");
        inputNumero.setText("");
        inputBairro.setText("");
      //  inputCidade.setText("");
      //  comboEstado.setSelectedIndex(0);
        inputValor.setText("");
        inputTelefone.setText("");
        inputEmail.setText("");
        inputSituacao.setText("");
    }
    
    public static void ativarInputCadastrar(){
        inputId.setEditable(false);
        inputDescrição.setEnabled(true);
        inputCpf.setEnabled(true);
       // inputDtNascimento.setEnabled(true);
        comboMedida.setEnabled(true);
        inputImagem.setEditable(false);
        inputLongradouro.setEnabled(true);
        inputNumero.setEnabled(true);
        inputBairro.setEnabled(true);
      //  inputCidade.setEnabled(true);
      //  comboEstado.setEnabled(true);
        inputValor.setEnabled(true);
        inputTelefone.setEnabled(true);
        inputEmail.setEnabled(true);
        inputSituacao.setEditable(false);
    }
    
    public void ativarButtonCadastrar(){
        buttonCadastrar.setEnabled(true);
        buttonImprimir.setEnabled(false);
        buttonSelecionar.setEnabled(false);
        buttonEditar.setEnabled(false);
        buttonExcluir.setEnabled(false);
        buttonInicio.setEnabled(false);
        buttonAnterior.setEnabled(false);
        buttonProximo.setEnabled(false);
        buttonFinal.setEnabled(false);
        buttonCaminhoImg.setEnabled(true);
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
        inputDescrição.setEnabled(true);
        inputCpf.setEnabled(true);
      //  inputDtNascimento.setEnabled(true);
        comboMedida.setEnabled(true);
        inputImagem.setEditable(false);
        inputLongradouro.setEnabled(true);
        inputNumero.setEnabled(true);
        inputBairro.setEnabled(true);
      //  inputCidade.setEnabled(true);
      //  comboEstado.setEnabled(true);
        inputValor.setEnabled(true);
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
    
    public void desativarTudo(){
        
        //Inputs
        
        inputId.setEditable(false);
        inputDescrição.setEnabled(false);
        inputCpf.setEnabled(false);
      //  inputDtNascimento.setEnabled(false);
        comboMedida.setEnabled(false);
        inputLongradouro.setEnabled(false);
        inputNumero.setEnabled(false);
        inputBairro.setEnabled(false);
     //   inputCidade.setEnabled(false);
     //   comboEstado.setEnabled(false);
        inputValor.setEnabled(false);
        inputTelefone.setEnabled(false);
        inputEmail.setEnabled(false);
        inputSituacao.setEditable(false);
        
        //Botões
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


}
