
package br.com.vsn.view;

import br.com.vsn.controller.FuncionarioController;
import br.com.vsn.controller.ParametroController;
import br.com.vsn.controller.UsuarioController;
import br.com.vsn.model.Parametro;
import com.jgoodies.looks.plastic.PlasticLookAndFeel;
import com.jgoodies.looks.plastic.theme.AbstractSkyTheme;
import com.jgoodies.looks.plastic.theme.DarkStar;
import com.jgoodies.looks.plastic.theme.DesertGreen;
import com.jgoodies.looks.plastic.theme.DesertRed;
import com.jgoodies.looks.plastic.theme.ExperienceRoyale;
import com.jgoodies.looks.plastic.theme.SkyBlue;
import com.jgoodies.looks.plastic.theme.SkyRed;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.SystemColor;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.LineBorder;

/**
 *
 * @author vitor
 */
public class MenuView extends javax.swing.JFrame {
    UsuarioController uc;
    Parametro parametro;
    ParametroController pc;
    public static int teclaPesquisa = 112;
    int autorizacao;
    public MenuView() {
        setExtendedState(MAXIMIZED_BOTH);
        initComponents();
        try{
            //modificaVisual();
        }catch(Exception e){
            Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, e);
        }
        jMenu4.setEnabled(false);
        jMenu15.setEnabled(false);
        FuncionarioController fc = new FuncionarioController();
        uc = new UsuarioController();
        parametro = new Parametro();
        pc = new ParametroController();
        try{
            autorizacao = fc.pesquisarFiltroCpf(uc.pesquisarUnicoId(uc.getId()).get(0).getCpf()).get(0).getAutorizacao();
        }catch(Exception e){
            autorizacao = 7;
            System.out.println("USUARIO SUPORTE");
        }
        
        this.verificaAutorizacao();
        
        try{
            parametro = pc.pesquisarUnico(uc.getId());
            this.teclaSelecionada();
        }catch(Exception e){
            
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/backGrounds/esteticar.png"));
        Image image = icon.getImage();
        desktopPane = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        painelIcons = new javax.swing.JPanel();
        labeContasReceber = new javax.swing.JLabel();
        labelOs = new javax.swing.JLabel();
        labelOrcamento = new javax.swing.JLabel();
        labelCliente = new javax.swing.JLabel();
        labeContasPagar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        selectEmpresa1 = new javax.swing.JMenuItem();
        selectEmpresa = new javax.swing.JMenuItem();
        selectFuncionario = new javax.swing.JMenuItem();
        jMenu19 = new javax.swing.JMenu();
        jMenuItem26 = new javax.swing.JMenuItem();
        jMenu17 = new javax.swing.JMenu();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenu18 = new javax.swing.JMenu();
        jMenuItem25 = new javax.swing.JMenuItem();
        selectContas = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem31 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        selectUsuario = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu15 = new javax.swing.JMenu();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu14 = new javax.swing.JMenu();
        jMenuItem19 = new javax.swing.JMenuItem();
        selectContasM = new javax.swing.JMenu();
        jMenu22 = new javax.swing.JMenu();
        jMenuItem29 = new javax.swing.JMenuItem();
        jMenu23 = new javax.swing.JMenu();
        jMenuItem27 = new javax.swing.JMenuItem();
        jMenuItem28 = new javax.swing.JMenuItem();
        selectRelatorio = new javax.swing.JMenu();
        jMenu12 = new javax.swing.JMenu();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenu20 = new javax.swing.JMenu();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenu24 = new javax.swing.JMenu();
        jMenuItem30 = new javax.swing.JMenuItem();
        jMenu25 = new javax.swing.JMenu();
        jMenuItem32 = new javax.swing.JMenuItem();
        jMenu13 = new javax.swing.JMenu();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenu16 = new javax.swing.JMenu();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VersuS");
        setIconImage(new ImageIcon(getClass().getResource("/icon/conserto.png")).
            getImage());

        painelIcons.setBackground(new java.awt.Color(204, 204, 204));
        painelIcons.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        labeContasReceber.setBackground(new java.awt.Color(0, 0, 0));
        labeContasReceber.setForeground(new java.awt.Color(255, 255, 255));
        labeContasReceber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeContasReceber.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/oficial/bank.png"))); // NOI18N
        labeContasReceber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labeContasReceberMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labeContasReceberMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                labeContasReceberMousePressed(evt);
            }
        });

        labelOs.setBackground(new java.awt.Color(0, 0, 0));
        labelOs.setForeground(new java.awt.Color(255, 255, 255));
        labelOs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelOs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/oficial/wrenchV.png"))); // NOI18N
        labelOs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelOsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelOsMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                labelOsMousePressed(evt);
            }
        });

        labelOrcamento.setBackground(new java.awt.Color(0, 0, 0));
        labelOrcamento.setForeground(new java.awt.Color(255, 255, 255));
        labelOrcamento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelOrcamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/oficial/report.png"))); // NOI18N
        labelOrcamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelOrcamentoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelOrcamentoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                labelOrcamentoMousePressed(evt);
            }
        });

        labelCliente.setBackground(new java.awt.Color(0, 0, 0));
        labelCliente.setForeground(new java.awt.Color(255, 255, 255));
        labelCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/oficial/-customer.png"))); // NOI18N
        labelCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelClienteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                labelClienteMousePressed(evt);
            }
        });

        labeContasPagar.setBackground(new java.awt.Color(0, 0, 0));
        labeContasPagar.setForeground(new java.awt.Color(255, 255, 255));
        labeContasPagar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeContasPagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/oficial/accounting.png"))); // NOI18N
        labeContasPagar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labeContasPagarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labeContasPagarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                labeContasPagarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout painelIconsLayout = new javax.swing.GroupLayout(painelIcons);
        painelIcons.setLayout(painelIconsLayout);
        painelIconsLayout.setHorizontalGroup(
            painelIconsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelIconsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelIconsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labeContasReceber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelOs, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labeContasPagar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        painelIconsLayout.setVerticalGroup(
            painelIconsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelIconsLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(labelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelOs, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labeContasReceber, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labeContasPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        desktopPane.setLayer(painelIcons, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopPaneLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(painelIcons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(693, Short.MAX_VALUE))
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desktopPaneLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(painelIcons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        jLabel2.setText("jLabel2");

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 204));
        jMenuBar1.setBorder(null);
        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuBar1.setPreferredSize(new java.awt.Dimension(569, 54));

        jMenu1.setText("Arquivo");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        selectEmpresa1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        selectEmpresa1.setText("Parâmetros");
        selectEmpresa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectEmpresa1ActionPerformed(evt);
            }
        });
        jMenu1.add(selectEmpresa1);

        selectEmpresa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        selectEmpresa.setText("Empresa");
        selectEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectEmpresaActionPerformed(evt);
            }
        });
        jMenu1.add(selectEmpresa);

        selectFuncionario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK));
        selectFuncionario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        selectFuncionario.setText("Funcionario");
        selectFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectFuncionarioActionPerformed(evt);
            }
        });
        jMenu1.add(selectFuncionario);

        jMenu19.setText("Cliente");
        jMenu19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenuItem26.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem26.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem26.setText("Cadastro de Clientes");
        jMenuItem26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem26ActionPerformed(evt);
            }
        });
        jMenu19.add(jMenuItem26);

        jMenu1.add(jMenu19);

        jMenu17.setText("Orçamento");
        jMenu17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenuItem24.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem24.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem24.setText("Cadastro de Orçamentos");
        jMenuItem24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem24ActionPerformed(evt);
            }
        });
        jMenu17.add(jMenuItem24);

        jMenu1.add(jMenu17);

        jMenu18.setText("Ordem de Serviço");
        jMenu18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenuItem25.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem25.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem25.setText("Cadastro de O.S");
        jMenuItem25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem25ActionPerformed(evt);
            }
        });
        jMenu18.add(jMenuItem25);

        jMenu1.add(jMenu18);

        selectContas.setText("Contas");
        selectContas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenu6.setText("Contas a Pagar");
        jMenu6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenuItem31.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem31.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem31.setText("Cadastro de Contas");
        jMenuItem31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem31ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem31);

        selectContas.add(jMenu6);

        jMenu7.setText("Contas a Receber");
        jMenu7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem7.setText("Cadastro de Titulos");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem7);

        jMenuItem8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem8.setText("Pagamento de Titulos");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem8);

        selectContas.add(jMenu7);

        jMenu1.add(selectContas);

        selectUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        selectUsuario.setText("Usuário");
        selectUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(selectUsuario);

        jMenu4.setText("Fornecedor");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenuItem6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem6.setText("Cadastro de Fornecedores");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6);

        jMenu1.add(jMenu4);

        jMenu15.setText("Estoque");
        jMenu15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenuItem20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem20.setText("Cadastro de Produto em Estoque");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu15.add(jMenuItem20);

        jMenu1.add(jMenu15);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem5.setText("Logout");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Cliente");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem1.setText("Cadastro de Clientes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Orçamento");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMenuItem4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem4.setText("Cadastro de Orçamentos");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        jMenu14.setText("Ordem de Serviço");
        jMenu14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMenuItem19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem19.setText("Cadastro de O.S");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu14.add(jMenuItem19);

        jMenuBar1.add(jMenu14);

        selectContasM.setText("Contas");
        selectContasM.setToolTipText("");
        selectContasM.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMenu22.setText("Contas a Pagar");
        jMenu22.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenuItem29.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem29.setText("Cadastro de Contas");
        jMenuItem29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem29ActionPerformed(evt);
            }
        });
        jMenu22.add(jMenuItem29);

        selectContasM.add(jMenu22);

        jMenu23.setText("Contas a Receber");
        jMenu23.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenuItem27.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem27.setText("Cadastro de Titulos");
        jMenuItem27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem27ActionPerformed(evt);
            }
        });
        jMenu23.add(jMenuItem27);

        jMenuItem28.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem28.setText("Recebimento de Titulos");
        jMenuItem28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem28ActionPerformed(evt);
            }
        });
        jMenu23.add(jMenuItem28);

        selectContasM.add(jMenu23);

        jMenuBar1.add(selectContasM);

        selectRelatorio.setText("Relatórios");
        selectRelatorio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMenu12.setText("Relatório de Clientes");
        jMenu12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenuItem15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem15.setText("Relatório de Clientes Geral");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem15);

        jMenuItem16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem16.setText("Relatório de Clientes Aniversariantes");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem16);

        selectRelatorio.add(jMenu12);

        jMenu20.setText("Relatório de Funcionarios");
        jMenu20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenuItem18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem18.setText("Relatório de Funcionarios Geral");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu20.add(jMenuItem18);

        jMenuItem17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem17.setText("Relatório de Funcionarios Aniversariantes");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu20.add(jMenuItem17);

        selectRelatorio.add(jMenu20);

        jMenu24.setText("Relatório de Contas a Pagar");
        jMenu24.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenuItem30.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem30.setText("Relatório de Contas a Pagar Geral");
        jMenuItem30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem30ActionPerformed(evt);
            }
        });
        jMenu24.add(jMenuItem30);

        selectRelatorio.add(jMenu24);

        jMenu25.setText("Relatório de Contas a Receber");
        jMenu25.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenuItem32.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem32.setText("Relatório de Contas a Receber Geral");
        jMenuItem32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem32ActionPerformed(evt);
            }
        });
        jMenu25.add(jMenuItem32);

        selectRelatorio.add(jMenu25);

        jMenu13.setText("Relatório de Orçamentos");
        jMenu13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenuItem22.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem22.setText("Relatório de Orçamentos Geral");
        jMenuItem22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem22ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem22);

        selectRelatorio.add(jMenu13);

        jMenu16.setText("Relatório de Ordem de Serviço");
        jMenu16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenuItem23.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem23.setText("Relatório de Ordem de Serviço Geral");
        jMenuItem23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem23ActionPerformed(evt);
            }
        });
        jMenu16.add(jMenuItem23);

        selectRelatorio.add(jMenu16);

        jMenuBar1.add(selectRelatorio);

        jMenu8.setText("Informações");
        jMenu8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMenu9.setText("Tutoriais");
        jMenu9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenuItem11.setText("Cadastro de Contas");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem11);

        jMenuItem12.setText("Pagamento de Contas");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem12);

        jMenu8.add(jMenu9);

        jMenu10.setText("Contatos");
        jMenu10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenuItem13.setText("Cadastro de Contas");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem13);

        jMenuItem14.setText("Acerto de Contas");
        jMenu10.add(jMenuItem14);

        jMenu8.add(jMenu10);

        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        ClienteView cv;
        try {
            cv = new ClienteView();
            cv.setVisible(true);
            this.desktopPane.add(cv);
        } catch (Exception ex) {
            Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void selectUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectUsuarioActionPerformed
        UsuarioView uv;
        try {
            uv = new UsuarioView();
            uv.setVisible(true);
            this.desktopPane.add(uv);
        } catch (Exception ex) {
            Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_selectUsuarioActionPerformed

    private void selectFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectFuncionarioActionPerformed
        FuncionarioView fv;
        try {
            fv = new FuncionarioView();
            fv.setVisible(true);
            this.desktopPane.add(fv);
        } catch (Exception ex) {
            Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_selectFuncionarioActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        OrcamentoView ov;
        try {
            ov = new OrcamentoView();
            ov.setVisible(true);
            this.desktopPane.add(ov);
        } catch (Exception ex) {
            Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        LoginView lv;
        try {
            this.dispose();
            lv = new LoginView();
            lv.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        FornecedorView fv;
        try {
            fv = new FornecedorView();
            fv.setVisible(true);
            this.desktopPane.add(fv);
        } catch (Exception ex) {
            Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        ContaReceberView ccv;
        try {
            ccv = new ContaReceberView();
            ccv.setVisible(true);
            this.desktopPane.add(ccv);
        } catch (Exception ex) {
            Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        PagamentoContasReceberView pv;
        try {
            pv = new PagamentoContasReceberView();
            pv.setVisible(true);
            this.desktopPane.add(pv);
        } catch (Exception ex) {
            Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        RelatorioClientesGeralView rcgv;
        try {
            rcgv = new RelatorioClientesGeralView();
            rcgv.setVisible(true);
            this.desktopPane.add(rcgv);
        } catch (Exception ex) {
            Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
        OrdemServicoView osv;
        try {
            osv = new OrdemServicoView();
            osv.setVisible(true);
            this.desktopPane.add(osv);
        } catch (Exception ex) {
            Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
        EstoqueView ev;
        try {
            ev = new EstoqueView();
            ev.setVisible(true);
            this.desktopPane.add(ev);
        } catch (Exception ex) {
            Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void selectEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectEmpresaActionPerformed
        EmpresaView ev;
        try {
            ev = new EmpresaView();
            ev.setVisible(true);
            this.desktopPane.add(ev);
        } catch (Exception ex) {
            Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_selectEmpresaActionPerformed

    private void jMenuItem22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem22ActionPerformed
        FiltroRelatorioOrcamentosGeralView fdros;
        try {
            fdros = new FiltroRelatorioOrcamentosGeralView();
            fdros.setVisible(true);
            this.desktopPane.add(fdros);
        } catch (Exception ex) {
            Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem22ActionPerformed

    private void jMenuItem24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem24ActionPerformed
        OrcamentoView ov;
        try {
            ov = new OrcamentoView();
            ov.setVisible(true);
            this.desktopPane.add(ov);
        } catch (Exception ex) {
            Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem24ActionPerformed

    private void jMenuItem25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem25ActionPerformed
        OrdemServicoView osv;
        try {
            osv = new OrdemServicoView();
            osv.setVisible(true);
            this.desktopPane.add(osv);
        } catch (Exception ex) {
            Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem25ActionPerformed

    private void jMenuItem26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem26ActionPerformed
        ClienteView cv;
        try {
            cv = new ClienteView();
            cv.setVisible(true);
            this.desktopPane.add(cv);
        } catch (Exception ex) {
            Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem26ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        RelatorioClientesAniversariantesView rcav;
        try {
            rcav = new RelatorioClientesAniversariantesView();
            rcav.setVisible(true);
            this.desktopPane.add(rcav);
        } catch (Exception ex) {
            Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        RelatorioFuncionariosAniversariantesView rfav;
        try {
            rfav = new RelatorioFuncionariosAniversariantesView();
            rfav.setVisible(true);
            this.desktopPane.add(rfav);
        } catch (Exception ex) {
            Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        RelatorioFuncionarioGeralView rfgv;
        try {
            rfgv = new RelatorioFuncionarioGeralView();
            rfgv.setVisible(true);
            this.desktopPane.add(rfgv);
        } catch (Exception ex) {
            Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem23ActionPerformed
        FiltroRelatorioOrdemServicoGeralView fdosv;
        try {
            fdosv = new FiltroRelatorioOrdemServicoGeralView();
            fdosv.setVisible(true);
            this.desktopPane.add(fdosv);
        } catch (Exception ex) {
            Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem23ActionPerformed

    private void jMenuItem27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem27ActionPerformed
        ContaReceberView ccv;
        try {
            ccv = new ContaReceberView();
            ccv.setVisible(true);
            this.desktopPane.add(ccv);
        } catch (Exception ex) {
            Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem27ActionPerformed

    private void jMenuItem28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem28ActionPerformed
        PagamentoContasReceberView pv;
        try {
            pv = new PagamentoContasReceberView();
            pv.setVisible(true);
            this.desktopPane.add(pv);
        } catch (Exception ex) {
            Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem28ActionPerformed

    private void jMenuItem29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem29ActionPerformed
        ContaPagarView cpv;
        try {
            cpv = new ContaPagarView();
            cpv.setVisible(true);
            this.desktopPane.add(cpv);
        } catch (Exception ex) {
            Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem29ActionPerformed

    private void jMenuItem30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem30ActionPerformed
        FiltroRelatorioContasPagarView frcpv;
        try {
            frcpv = new FiltroRelatorioContasPagarView();
            frcpv.setVisible(true);
            this.desktopPane.add(frcpv);
        } catch (Exception ex) {
            Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem30ActionPerformed

    private void jMenuItem31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem31ActionPerformed
        ContaPagarView cpv;
        try {
            cpv = new ContaPagarView();
            cpv.setVisible(true);
            this.desktopPane.add(cpv);
        } catch (Exception ex) {
            Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem31ActionPerformed

    private void jMenuItem32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem32ActionPerformed
        FiltroRelatorioContasReceberView frcrv;
        try {
            frcrv = new FiltroRelatorioContasReceberView();
            frcrv.setVisible(true);
            this.desktopPane.add(frcrv);
        } catch (Exception ex) {
            Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem32ActionPerformed

    private void selectEmpresa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectEmpresa1ActionPerformed
        ParametrosView pv;
        try {
            pv = new ParametrosView();
            pv.setVisible(true);
            this.desktopPane.add(pv);
        } catch (Exception ex) {
            Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_selectEmpresa1ActionPerformed

    private void labeContasPagarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labeContasPagarMousePressed
        ContaPagarView cpv;
        try {
            cpv = new ContaPagarView();
            cpv.setVisible(true);
            this.desktopPane.add(cpv);
        } catch (Exception ex) {
            Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_labeContasPagarMousePressed

    private void labeContasPagarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labeContasPagarMouseExited
        labeContasPagar.setBorder(new LineBorder(Color.WHITE, 0, true));
    }//GEN-LAST:event_labeContasPagarMouseExited

    private void labeContasPagarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labeContasPagarMouseEntered
        labeContasPagar.setBorder(new LineBorder(Color.WHITE, 2, true));
    }//GEN-LAST:event_labeContasPagarMouseEntered

    private void labelClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelClienteMousePressed

        ClienteView cv;
        try {
            cv = new ClienteView();
            cv.setVisible(true);
            this.desktopPane.add(cv);
        } catch (Exception ex) {
            Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_labelClienteMousePressed

    private void labelClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelClienteMouseExited
        labelCliente.setBorder(new LineBorder(Color.black, 0, true));
    }//GEN-LAST:event_labelClienteMouseExited

    private void labelClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelClienteMouseEntered
        labelCliente.setBorder(new LineBorder(Color.WHITE, 2, true));
    }//GEN-LAST:event_labelClienteMouseEntered

    private void labelOrcamentoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelOrcamentoMouseExited
        labelOrcamento.setBorder(new LineBorder(Color.black, 0, true));
    }//GEN-LAST:event_labelOrcamentoMouseExited

    private void labelOrcamentoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelOrcamentoMouseEntered
        labelOrcamento.setBorder(new LineBorder(Color.WHITE, 2, true));
    }//GEN-LAST:event_labelOrcamentoMouseEntered

    private void labelOsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelOsMousePressed
        OrdemServicoView osv;
        try {
            osv = new OrdemServicoView();
            osv.setVisible(true);
            this.desktopPane.add(osv);
        } catch (Exception ex) {
            Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_labelOsMousePressed

    private void labelOsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelOsMouseExited
        labelOs.setBorder(new LineBorder(Color.black, 0, true));
    }//GEN-LAST:event_labelOsMouseExited

    private void labelOsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelOsMouseEntered
        labelOs.setBorder(new LineBorder(Color.WHITE, 2, true));
    }//GEN-LAST:event_labelOsMouseEntered

    private void labeContasReceberMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labeContasReceberMousePressed
        ContaReceberView crv;
        try {
            crv = new ContaReceberView();
            crv.setVisible(true);
            this.desktopPane.add(crv);
        } catch (Exception ex) {
            Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_labeContasReceberMousePressed

    private void labeContasReceberMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labeContasReceberMouseExited
        labeContasReceber.setBorder(new LineBorder(Color.WHITE, 0, true));
    }//GEN-LAST:event_labeContasReceberMouseExited

    private void labeContasReceberMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labeContasReceberMouseEntered
        labeContasReceber.setBorder(new LineBorder(Color.WHITE, 2, true));
    }//GEN-LAST:event_labeContasReceberMouseEntered

    private void labelOrcamentoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelOrcamentoMousePressed
        OrcamentoView ov;
        try {
            ov = new OrcamentoView();
            ov.setVisible(true);
            this.desktopPane.add(ov);
        } catch (Exception ex) {
            Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_labelOrcamentoMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu16;
    private javax.swing.JMenu jMenu17;
    private javax.swing.JMenu jMenu18;
    private javax.swing.JMenu jMenu19;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu20;
    private javax.swing.JMenu jMenu22;
    private javax.swing.JMenu jMenu23;
    private javax.swing.JMenu jMenu24;
    private javax.swing.JMenu jMenu25;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenuItem jMenuItem28;
    private javax.swing.JMenuItem jMenuItem29;
    private javax.swing.JMenuItem jMenuItem30;
    private javax.swing.JMenuItem jMenuItem31;
    private javax.swing.JMenuItem jMenuItem32;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JLabel labeContasPagar;
    private javax.swing.JLabel labeContasReceber;
    private javax.swing.JLabel labelCliente;
    private javax.swing.JLabel labelOrcamento;
    private javax.swing.JLabel labelOs;
    private javax.swing.JPanel painelIcons;
    private javax.swing.JMenu selectContas;
    private javax.swing.JMenu selectContasM;
    private javax.swing.JMenuItem selectEmpresa;
    private javax.swing.JMenuItem selectEmpresa1;
    private javax.swing.JMenuItem selectFuncionario;
    private javax.swing.JMenu selectRelatorio;
    private javax.swing.JMenuItem selectUsuario;
    // End of variables declaration//GEN-END:variables

    public void verificaAutorizacao(){
        if(autorizacao == 2){
        selectContas.setEnabled(true);
        selectContasM.setEnabled(true);
        selectEmpresa.setEnabled(true);
        selectFuncionario.setEnabled(true);
        selectRelatorio.setEnabled(true);
        selectUsuario.setEnabled(true);
        labeContasPagar.setVisible(true);
        labeContasReceber.setVisible(true);
            
        }else if (autorizacao == 7){
            selectContas.setEnabled(true);
            selectContasM.setEnabled(true);
            selectEmpresa.setEnabled(true);
            selectFuncionario.setEnabled(true);
            selectUsuario.setEnabled(true);
            selectRelatorio.setEnabled(true);
            labeContasPagar.setVisible(true);
            labeContasReceber.setVisible(true);
        }else if(autorizacao == 1){
            selectContas.setEnabled(false);
            selectContasM.setEnabled(false);
            selectEmpresa.setEnabled(false);
            selectFuncionario.setEnabled(false);
            selectUsuario.setEnabled(false);
            selectRelatorio.setEnabled(true);
            labeContasPagar.setVisible(false);
            labeContasReceber.setVisible(false);
        }else{
            selectContas.setEnabled(false);
            selectContasM.setEnabled(false);
            selectEmpresa.setEnabled(false);
            selectFuncionario.setEnabled(false);
            selectUsuario.setEnabled(false);
            selectRelatorio.setEnabled(false);
            labeContasPagar.setVisible(false);
            labeContasReceber.setVisible(false);
        }
    }
    
    public void teclaSelecionada() throws UnsupportedLookAndFeelException{
       teclaPesquisa = parametro.getTecla();
        switch (parametro.getTema()) {
            case 0:
                try {
                    UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
                } catch(ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
                    
                }    
                jMenuBar1.setBackground(new Color(204,204,204));
                painelIcons.setBackground(new Color(204,204,204));
                break;
            case 1:
                this.visualDark();
                break;
            case 2:
                this.visualSky();
                break;
            case 3:
                this.visualRed();
                break;
            case 4:
                this.visualEsmeralda();
                break;
            case 5:
                 try {
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
                    Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
                }
                jMenuBar1.setBackground(new Color(230,230,230));
                painelIcons.setBackground(new Color(20,20,20));
                break;
            case 6:
                try {
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
                } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
                    Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, e);
                }    
                jMenuBar1.setBackground(new Color(150,150,150));
                break;
            default:
                break;
        }
    }
    
    public void visualSky() throws UnsupportedLookAndFeelException{
        

    // lookandfeel muda de cores
    // biblioteca     looksdemo-2.3.1.jar

              //SkyBlue()
             //BrownSugar()
             // DarkStar()  
            //DesertGreen()
            //Silver()
            //ExperienceRoyale()
              try {
                    PlasticLookAndFeel.setPlasticTheme(new SkyBlue());
                  try {
                      UIManager.setLookAndFeel("com.jgoodies.looks.plastic.Plastic3DLookAndFeel");
                  } catch (InstantiationException ex) {
                      Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
                  } catch (IllegalAccessException ex) {
                      Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
                  } catch (UnsupportedLookAndFeelException ex) {
                      Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
                  }
           

        } catch (ClassNotFoundException ex) {
        }
        SwingUtilities.updateComponentTreeUI(this);
        jMenuBar1.setBackground(new Color(200,200,240));
        painelIcons.setBackground(new Color(200,200,240));
        this.iconsDark();
    }
    
    public void visualDark() throws UnsupportedLookAndFeelException{
        

    // lookandfeel muda de cores
    // biblioteca     looksdemo-2.3.1.jar

              //SkyBlue()
             //BrownSugar()
             // DarkStar()  
            //DesertGreen()
            //Silver()
            //ExperienceRoyale()
              try {
                    PlasticLookAndFeel.setPlasticTheme(new DarkStar());
                  try {
                      UIManager.setLookAndFeel("com.jgoodies.looks.plastic.Plastic3DLookAndFeel");
                  } catch (InstantiationException ex) {
                      Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
                  } catch (IllegalAccessException ex) {
                      Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
                  } catch (UnsupportedLookAndFeelException ex) {
                      Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
                  }
           

        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        SwingUtilities.updateComponentTreeUI(this);

        jMenuBar1.setBackground(new Color(20,20,20));
        painelIcons.setBackground(new Color(20,20,20));
        this.iconsLight();
    }
    
    public void visualRed() throws UnsupportedLookAndFeelException{
        

    // lookandfeel muda de cores
    // biblioteca     looksdemo-2.3.1.jar

              //SkyBlue()
             //BrownSugar()
             // DarkStar()  
            //DesertGreen()
            //Silver()
            //ExperienceRoyale()
              try {
                    PlasticLookAndFeel.setPlasticTheme(new DesertRed());
                  try {
                      UIManager.setLookAndFeel("com.jgoodies.looks.plastic.Plastic3DLookAndFeel");
                  } catch (InstantiationException ex) {
                      Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
                  } catch (IllegalAccessException ex) {
                      Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
                  } catch (UnsupportedLookAndFeelException ex) {
                      Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
                  }
           

        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        SwingUtilities.updateComponentTreeUI(this);

        jMenuBar1.setBackground(new Color(215,120,120));
        painelIcons.setBackground(new Color(215,120,120));
    }
    
    public void visualEsmeralda() throws UnsupportedLookAndFeelException{
        

    // lookandfeel muda de cores
    // biblioteca     looksdemo-2.3.1.jar

              //SkyBlue()
             //BrownSugar()
             // DarkStar()  
            //DesertGreen()
            //Silver()
            //ExperienceRoyale()
              try {
                    PlasticLookAndFeel.setPlasticTheme(new DesertGreen());
                  try {
                      UIManager.setLookAndFeel("com.jgoodies.looks.plastic.Plastic3DLookAndFeel");
                  } catch (InstantiationException ex) {
                      Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
                  } catch (IllegalAccessException ex) {
                      Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
                  } catch (UnsupportedLookAndFeelException ex) {
                      Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
                  }
           

        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        SwingUtilities.updateComponentTreeUI(this);

        jMenuBar1.setBackground(new Color(230,255,230));
        painelIcons.setBackground(new Color(230,255,230));
        this.iconsDark();
    }
    
    public void iconsLight(){
        Icon iconCliente = new ImageIcon(getClass().getResource("/icon/oficial/white/customer.png"));
        labelCliente.setIcon(iconCliente);
        Icon iconOrcamento = new ImageIcon(getClass().getResource("/icon/oficial/white/report.png"));
        labelOrcamento.setIcon(iconOrcamento);
        Icon iconOs = new ImageIcon(getClass().getResource("/icon/oficial/white/wrench.png"));
        labelOs.setIcon(iconOs);
        Icon iconContaReceber = new ImageIcon(getClass().getResource("/icon/oficial/white/bank.png"));
        labeContasReceber.setIcon(iconContaReceber);
        Icon iconContaPagar = new ImageIcon(getClass().getResource("/icon/oficial/white/accounting.png"));
        labeContasPagar.setIcon(iconContaPagar);
        
    }
    
    public void iconsDark(){
        Icon iconCliente = new ImageIcon(getClass().getResource("/icon/oficial/dark/customer.png"));
        labelCliente.setIcon(iconCliente);
        Icon iconOrcamento = new ImageIcon(getClass().getResource("/icon/oficial/dark/report.png"));
        labelOrcamento.setIcon(iconOrcamento);
        Icon iconOs = new ImageIcon(getClass().getResource("/icon/oficial/dark/wrench.png"));
        labelOs.setIcon(iconOs);
        Icon iconContaReceber = new ImageIcon(getClass().getResource("/icon/oficial/dark/bank.png"));
        labeContasReceber.setIcon(iconContaReceber);
        Icon iconContaPagar = new ImageIcon(getClass().getResource("/icon/oficial/dark/accounting.png"));
        labeContasPagar.setIcon(iconContaPagar);
        
    }
    
}
