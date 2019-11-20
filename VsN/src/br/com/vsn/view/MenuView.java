
package br.com.vsn.view;

import br.com.vsn.controller.FuncionarioController;
import br.com.vsn.controller.ParametroController;
import br.com.vsn.controller.UsuarioController;
import br.com.vsn.model.Parametro;
import com.jgoodies.looks.plastic.PlasticLookAndFeel;
import com.jgoodies.looks.plastic.theme.AbstractSkyTheme;
import com.jgoodies.looks.plastic.theme.BrownSugar;
import com.jgoodies.looks.plastic.theme.DarkStar;
import com.jgoodies.looks.plastic.theme.DesertGreen;
import com.jgoodies.looks.plastic.theme.DesertRed;
import com.jgoodies.looks.plastic.theme.ExperienceRoyale;
import com.jgoodies.looks.plastic.theme.Silver;
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
    public static int autorizacao;
    public MenuView() {
        initComponents();
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
        
        setExtendedState(MAXIMIZED_BOTH);
        
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
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
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
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
        selectRelFuncionario = new javax.swing.JMenu();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        selectRelContaPagar = new javax.swing.JMenu();
        jMenuItem30 = new javax.swing.JMenuItem();
        selectRelContaReceber = new javax.swing.JMenu();
        jMenuItem32 = new javax.swing.JMenuItem();
        jMenu13 = new javax.swing.JMenu();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenu16 = new javax.swing.JMenu();
        jMenuItem23 = new javax.swing.JMenuItem();
        selectRelLucros = new javax.swing.JMenu();
        jMenuItem33 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VersuS");
        setIconImage(new ImageIcon(getClass().getResource("/icon/conserto.png")).
            getImage());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("VERSÃO 1.0.0.1");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("USUÁRIO: ");

        user.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        user.setForeground(new java.awt.Color(255, 255, 255));
        user.setText("SUPORTE");

        desktopPane.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane.setLayer(user, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(user)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1100, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desktopPaneLayout.createSequentialGroup()
                .addContainerGap(586, Short.MAX_VALUE)
                .addGroup(desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(user))
                .addContainerGap())
        );

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 204));
        jMenuBar1.setBorder(null);
        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuBar1.setPreferredSize(new java.awt.Dimension(569, 54));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/oficial/folder.png"))); // NOI18N
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

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem5.setText("Logout");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem9.setText("Sair");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem9);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/oficial/-customer.png"))); // NOI18N
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

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/oficial/report.png"))); // NOI18N
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

        jMenu14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/oficial/wrench.png"))); // NOI18N
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

        selectContasM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/oficial/accounting.png"))); // NOI18N
        selectContasM.setText("Contas");
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

        selectRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/oficial/relatorios.png"))); // NOI18N
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

        selectRelFuncionario.setText("Relatório de Funcionarios");
        selectRelFuncionario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenuItem18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem18.setText("Relatório de Funcionarios Geral");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        selectRelFuncionario.add(jMenuItem18);

        jMenuItem17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem17.setText("Relatório de Funcionarios Aniversariantes");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        selectRelFuncionario.add(jMenuItem17);

        selectRelatorio.add(selectRelFuncionario);

        selectRelContaPagar.setText("Relatório de Contas a Pagar");
        selectRelContaPagar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenuItem30.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem30.setText("Relatório de Contas a Pagar Geral");
        jMenuItem30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem30ActionPerformed(evt);
            }
        });
        selectRelContaPagar.add(jMenuItem30);

        selectRelatorio.add(selectRelContaPagar);

        selectRelContaReceber.setText("Relatório de Contas a Receber");
        selectRelContaReceber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenuItem32.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem32.setText("Relatório de Contas a Receber Geral");
        jMenuItem32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem32ActionPerformed(evt);
            }
        });
        selectRelContaReceber.add(jMenuItem32);

        selectRelatorio.add(selectRelContaReceber);

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

        selectRelLucros.setText("Relatório de Lucros");
        selectRelLucros.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenuItem33.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuItem33.setText("Relatório de Lucratividade Geral");
        jMenuItem33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem33ActionPerformed(evt);
            }
        });
        selectRelLucros.add(jMenuItem33);

        selectRelatorio.add(selectRelLucros);

        jMenuBar1.add(selectRelatorio);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/oficial/info.png"))); // NOI18N
        jMenu8.setText("Informações");
        jMenu8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMenu9.setText("Tutoriais");
        jMenu9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenuItem11.setText("Todos os Tutoriais");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem11);

        jMenu8.add(jMenu9);

        jMenuBar1.add(jMenu8);

        jMenu11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/oficial/logout.png"))); // NOI18N
        jMenu11.setText("Logout");
        jMenu11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenu11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu11MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu11);

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
        TutorialView tv;
        try {
            tv = new TutorialView();
            tv.setVisible(true);
            this.desktopPane.add(tv);
        } catch (Exception ex) {
            Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem11ActionPerformed

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

    private void jMenu11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu11MouseClicked
        LoginView lv;
        try {
            this.dispose();
            lv = new LoginView();
            lv.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenu11MouseClicked

    private void jMenuItem33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem33ActionPerformed
        LucratividadeGeralView lgv;
        try {
            lgv = new LucratividadeGeralView();
            lgv.setVisible(true);
            this.desktopPane.add(lgv);
        } catch (Exception ex) {
            Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem33ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem9ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu16;
    private javax.swing.JMenu jMenu17;
    private javax.swing.JMenu jMenu18;
    private javax.swing.JMenu jMenu19;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu22;
    private javax.swing.JMenu jMenu23;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
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
    private javax.swing.JMenuItem jMenuItem33;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenu selectContas;
    private javax.swing.JMenu selectContasM;
    private javax.swing.JMenuItem selectEmpresa;
    private javax.swing.JMenuItem selectEmpresa1;
    private javax.swing.JMenuItem selectFuncionario;
    private javax.swing.JMenu selectRelContaPagar;
    private javax.swing.JMenu selectRelContaReceber;
    private javax.swing.JMenu selectRelFuncionario;
    private javax.swing.JMenu selectRelLucros;
    private javax.swing.JMenu selectRelatorio;
    private javax.swing.JMenuItem selectUsuario;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables

    public void verificaAutorizacao(){
        if(autorizacao == 2){
        selectContas.setEnabled(true);
        selectContasM.setEnabled(true);
        selectEmpresa.setEnabled(true);
        selectFuncionario.setEnabled(true);
        selectRelatorio.setEnabled(true);
        selectUsuario.setEnabled(true);
        selectRelContaPagar.setEnabled(true);
        selectRelContaReceber.setEnabled(true);
        selectRelFuncionario.setEnabled(true);
        selectRelLucros.setEnabled(true);
        user.setText(uc.getLogin());
            
        }else if (autorizacao == 7){
            selectContas.setEnabled(true);
            selectContasM.setEnabled(true);
            selectEmpresa.setEnabled(true);
            selectFuncionario.setEnabled(true);
            selectUsuario.setEnabled(true);
            selectRelatorio.setEnabled(true);
            selectRelContaPagar.setEnabled(true);
            selectRelContaReceber.setEnabled(true);
            selectRelFuncionario.setEnabled(true);
            selectRelLucros.setEnabled(true);
            user.setText("SUPORTE");
        }else if(autorizacao == 1){
            selectContas.setEnabled(false);
            selectContasM.setEnabled(false);
            selectEmpresa.setEnabled(false);
            selectFuncionario.setEnabled(false);
            selectUsuario.setEnabled(false);
            selectRelatorio.setEnabled(true);
            selectRelContaPagar.setEnabled(false);
            selectRelContaReceber.setEnabled(false);
            selectRelFuncionario.setEnabled(false);
            selectRelLucros.setEnabled(false);
            user.setText(uc.getLogin());
        }else{
            selectContas.setEnabled(false);
            selectContasM.setEnabled(false);
            selectEmpresa.setEnabled(false);
            selectFuncionario.setEnabled(false);
            selectUsuario.setEnabled(false);
            selectRelatorio.setEnabled(false);
            user.setText(uc.getLogin());
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
                //       painelIcons.setBackground(new Color(204,204,204));
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
                //       painelIcons.setBackground(new Color(20,20,20));
                break;
            case 6:
                try {
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
                } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
                    Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, e);
                }    
                jMenuBar1.setBackground(new Color(150,150,150));
                break;
            case 7:
                this.visualSilver();
                break;
            case 8:
                this.visualRoyal();
                break;
            case 9:
                this.visualBrownSugar();
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
        //       painelIcons.setBackground(new Color(200,200,240));
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
        //       painelIcons.setBackground(new Color(20,20,20));
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
        //       painelIcons.setBackground(new Color(215,120,120));
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
//        //       painelIcons.setBackground(new Color(230,255,230));
        this.iconsDark();
    }
    
    public void visualSilver() throws UnsupportedLookAndFeelException{
        

    // lookandfeel muda de cores
    // biblioteca     looksdemo-2.3.1.jar

              //SkyBlue()
             //BrownSugar()
             // DarkStar()  
            //DesertGreen()
            //Silver()
            //ExperienceRoyale()
              try {
                    PlasticLookAndFeel.setPlasticTheme(new Silver());
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

        jMenuBar1.setBackground(new Color(200,200,240));
        //       painelIcons.setBackground(new Color(200,200,240));
        this.iconsDark();
    }
    
    public void visualRoyal() throws UnsupportedLookAndFeelException{
        

    // lookandfeel muda de cores
    // biblioteca     looksdemo-2.3.1.jar

              //SkyBlue()
             //BrownSugar()
             // DarkStar()  
            //DesertGreen()
            //Silver()
            //ExperienceRoyale()
              try {
                    PlasticLookAndFeel.setPlasticTheme(new ExperienceRoyale());
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

        jMenuBar1.setBackground(new Color(150,150,230));
//        //       painelIcons.setBackground(new Color(230,255,230));
        this.iconsDark();
    }
    
    public void iconsLight(){
        Icon iconCliente = new ImageIcon(getClass().getResource("/icon/oficial/white/customer.png"));
        jMenu2.setIcon(iconCliente);
        Icon iconOrcamento = new ImageIcon(getClass().getResource("/icon/oficial/white/report.png"));
        jMenu3.setIcon(iconOrcamento);
        Icon iconOs = new ImageIcon(getClass().getResource("/icon/oficial/white/wrench.png"));
        jMenu14.setIcon(iconOs);
//        Icon iconContaReceber = new ImageIcon(getClass().getResource("/icon/oficial/white/bank.png"));
//        labeContasReceber.setIcon(iconContaReceber);
        Icon iconContaPagar = new ImageIcon(getClass().getResource("/icon/oficial/white/accounting.png"));
        selectContasM.setIcon(iconContaPagar);
        
    }
    
    public void visualBrownSugar() throws UnsupportedLookAndFeelException{
        

    // lookandfeel muda de cores
    // biblioteca     looksdemo-2.3.1.jar

              //SkyBlue()
             //BrownSugar()
             // DarkStar()  
            //DesertGreen()
            //Silver()
            //ExperienceRoyale()
              try {
                    PlasticLookAndFeel.setPlasticTheme(new BrownSugar());
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
        //       painelIcons.setBackground(new Color(20,20,20));
        this.iconsLight();
    }
    
    public void iconsDark(){
        Icon iconCliente = new ImageIcon(getClass().getResource("/icon/oficial/dark/customer.png"));
        jMenu2.setIcon(iconCliente);
        Icon iconOrcamento = new ImageIcon(getClass().getResource("/icon/oficial/dark/report.png"));
        jMenu3.setIcon(iconOrcamento);
        Icon iconOs = new ImageIcon(getClass().getResource("/icon/oficial/dark/wrench.png"));
        jMenu14.setIcon(iconOs);
//        Icon iconContaReceber = new ImageIcon(getClass().getResource("/icon/oficial/dark/bank.png"));
//        labeContasReceber.setIcon(iconContaReceber);
        Icon iconContaPagar = new ImageIcon(getClass().getResource("/icon/oficial/dark/accounting.png"));
        selectContasM.setIcon(iconContaPagar);
        
    }
    
}
