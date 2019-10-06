
package br.com.vsn.view;

import br.com.vsn.controller.FuncionarioController;
import br.com.vsn.controller.UsuarioController;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;

/**
 *
 * @author vitor
 */
public class MenuView extends javax.swing.JFrame {

    int autorizacao;
    public MenuView() {
        setExtendedState(MAXIMIZED_BOTH);
        initComponents();
        jMenu4.setEnabled(false);
        jMenu15.setEnabled(false);
        FuncionarioController fc = new FuncionarioController();
        UsuarioController uc = new UsuarioController();
        try{
            autorizacao = fc.pesquisarFiltroCpf(uc.pesquisarUnicoId(uc.getId()).get(0).getCpf()).get(0).getAutorizacao();
        }catch(Exception e){
            autorizacao = 7;
            System.out.println("USUARIO SUPORTE");
        }
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
        ImageIcon iconCliente = new ImageIcon(getClass().getResource("/icon/cliente.png")); Image clientes = iconCliente.getImage();
        labelCliente = new javax.swing.JLabel(){
            public void paintComponent(Graphics g){
                g.drawImage(clientes,0,0,getWidth(),getHeight(),this);
            }
        };
        ImageIcon iconOrcamento = new ImageIcon(getClass().getResource("/icon/orcamento.png")); Image orcamentos = iconOrcamento.getImage();
        labelOrcamento = new javax.swing.JLabel(){
            public void paintComponent(Graphics g){
                g.drawImage(orcamentos,0,0,getWidth(),getHeight(),this);
            }
        };
        ImageIcon iconOs = new ImageIcon(getClass().getResource("/icon/os.png")); Image os = iconOs.getImage();
        labelOs = new javax.swing.JLabel(){
            public void paintComponent(Graphics g){
                g.drawImage(os,0,0,getWidth(),getHeight(),this);
            }
        };
        ImageIcon iconContasReceber = new ImageIcon(getClass().getResource("/icon/contasReceber.png")); Image contasReceber = iconContasReceber.getImage();
        labeContasReceber = new javax.swing.JLabel(){
            public void paintComponent(Graphics g){
                g.drawImage(contasReceber,0,0,getWidth(),getHeight(),this);
            }
        };
        ImageIcon iconContasPagar = new ImageIcon(getClass().getResource("/icon/contasPagar.png")); Image contasPagar = iconContasPagar.getImage();
        labeContasPagar = new javax.swing.JLabel(){
            public void paintComponent(Graphics g){
                g.drawImage(contasPagar,0,0,getWidth(),getHeight(),this);
            }
        };
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
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

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Versão 1.0.0.1");

        labelCliente.setBackground(new java.awt.Color(0, 0, 0));
        labelCliente.setForeground(new java.awt.Color(255, 255, 255));
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

        labelOrcamento.setBackground(new java.awt.Color(0, 0, 0));
        labelOrcamento.setForeground(new java.awt.Color(255, 255, 255));
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

        labelOs.setBackground(new java.awt.Color(0, 0, 0));
        labelOs.setForeground(new java.awt.Color(255, 255, 255));
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

        labeContasReceber.setBackground(new java.awt.Color(0, 0, 0));
        labeContasReceber.setForeground(new java.awt.Color(255, 255, 255));
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

        labeContasPagar.setBackground(new java.awt.Color(0, 0, 0));
        labeContasPagar.setForeground(new java.awt.Color(255, 255, 255));
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

        desktopPane.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane.setLayer(labelCliente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane.setLayer(labelOrcamento, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane.setLayer(labelOs, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane.setLayer(labeContasReceber, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane.setLayer(labeContasPagar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desktopPaneLayout.createSequentialGroup()
                        .addGap(0, 561, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(desktopPaneLayout.createSequentialGroup()
                        .addGroup(desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelOs, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labeContasReceber, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labeContasPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 582, Short.MAX_VALUE)))
                .addContainerGap())
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desktopPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelOs, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labeContasReceber, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labeContasPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jMenuBar1.setBackground(new java.awt.Color(236, 234, 234));
        jMenuBar1.setBorder(null);
        jMenuBar1.setPreferredSize(new java.awt.Dimension(569, 25));

        jMenu1.setText("Arquivo");

        selectEmpresa.setText("Empresa");
        selectEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectEmpresaActionPerformed(evt);
            }
        });
        jMenu1.add(selectEmpresa);

        selectFuncionario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK));
        selectFuncionario.setText("Funcionario");
        selectFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectFuncionarioActionPerformed(evt);
            }
        });
        jMenu1.add(selectFuncionario);

        jMenu19.setText("Cliente");

        jMenuItem26.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem26.setText("Cadastro de Clientes");
        jMenuItem26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem26ActionPerformed(evt);
            }
        });
        jMenu19.add(jMenuItem26);

        jMenu1.add(jMenu19);

        jMenu17.setText("Orçamento");

        jMenuItem24.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem24.setText("Cadastro de Orçamentos");
        jMenuItem24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem24ActionPerformed(evt);
            }
        });
        jMenu17.add(jMenuItem24);

        jMenu1.add(jMenu17);

        jMenu18.setText("Ordem de Serviço");

        jMenuItem25.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem25.setText("Cadastro de O.S");
        jMenuItem25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem25ActionPerformed(evt);
            }
        });
        jMenu18.add(jMenuItem25);

        jMenu1.add(jMenu18);

        selectContas.setText("Contas");

        jMenu6.setText("Contas a Pagar");

        jMenuItem31.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem31.setText("Cadastro de Contas");
        jMenuItem31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem31ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem31);

        selectContas.add(jMenu6);

        jMenu7.setText("Contas a Receber");

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem7.setText("Cadastro de Titulos");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem7);

        jMenuItem8.setText("Pagamento de Titulos");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem8);

        selectContas.add(jMenu7);

        jMenu1.add(selectContas);

        selectUsuario.setText("Usuário");
        selectUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(selectUsuario);

        jMenu4.setText("Fornecedor");

        jMenuItem6.setText("Cadastro de Fornecedores");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6);

        jMenu1.add(jMenu4);

        jMenu15.setText("Estoque");

        jMenuItem20.setText("Cadastro de Produto em Estoque");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu15.add(jMenuItem20);

        jMenu1.add(jMenu15);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem5.setText("Logout");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Cliente");

        jMenuItem1.setText("Cadastro de Clientes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Orçamento");

        jMenuItem4.setText("Cadastro de Orçamentos");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        jMenu14.setText("Ordem de Serviço");

        jMenuItem19.setText("Cadastro de O.S");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu14.add(jMenuItem19);

        jMenuBar1.add(jMenu14);

        selectContasM.setText("Contas");

        jMenu22.setText("Contas a Pagar");

        jMenuItem29.setText("Cadastro de Contas");
        jMenuItem29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem29ActionPerformed(evt);
            }
        });
        jMenu22.add(jMenuItem29);

        selectContasM.add(jMenu22);

        jMenu23.setText("Contas a Receber");

        jMenuItem27.setText("Cadastro de Titulos");
        jMenuItem27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem27ActionPerformed(evt);
            }
        });
        jMenu23.add(jMenuItem27);

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

        jMenu12.setText("Relatório de Clientes");

        jMenuItem15.setText("Relatório de Clientes Geral");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem15);

        jMenuItem16.setText("Relatório de Clientes Aniversariantes");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem16);

        selectRelatorio.add(jMenu12);

        jMenu20.setText("Relatório de Funcionarios");

        jMenuItem18.setText("Relatório de Funcionarios Geral");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu20.add(jMenuItem18);

        jMenuItem17.setText("Relatório de Funcionarios Aniversariantes");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu20.add(jMenuItem17);

        selectRelatorio.add(jMenu20);

        jMenu24.setText("Relatório de Contas a Pagar");

        jMenuItem30.setText("Relatório de Contas a Pagar Geral");
        jMenuItem30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem30ActionPerformed(evt);
            }
        });
        jMenu24.add(jMenuItem30);

        selectRelatorio.add(jMenu24);

        jMenu25.setText("Relatório de Contas a Receber");

        jMenuItem32.setText("Relatório de Contas a Receber Geral");
        jMenuItem32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem32ActionPerformed(evt);
            }
        });
        jMenu25.add(jMenuItem32);

        selectRelatorio.add(jMenu25);

        jMenu13.setText("Relatório de Orçamentos");

        jMenuItem22.setText("Relatório de Orçamentos Geral");
        jMenuItem22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem22ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem22);

        selectRelatorio.add(jMenu13);

        jMenu16.setText("Relatório de Ordem de Serviço");

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

        jMenu9.setText("Tutoriais");

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

    private void labelClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelClienteMouseEntered
        labelCliente.setBorder(new LineBorder(Color.WHITE, 1, true));
    }//GEN-LAST:event_labelClienteMouseEntered

    private void labelClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelClienteMouseExited
        labelCliente.setBorder(new LineBorder(Color.black, 0, true));
    }//GEN-LAST:event_labelClienteMouseExited

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

    private void labelOrcamentoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelOrcamentoMouseEntered
        labelOrcamento.setBorder(new LineBorder(Color.WHITE, 1, true));
    }//GEN-LAST:event_labelOrcamentoMouseEntered

    private void labelOrcamentoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelOrcamentoMouseExited
        labelOrcamento.setBorder(new LineBorder(Color.black, 0, true));
    }//GEN-LAST:event_labelOrcamentoMouseExited

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

    private void labelOsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelOsMouseEntered
        labelOs.setBorder(new LineBorder(Color.WHITE, 1, true));
    }//GEN-LAST:event_labelOsMouseEntered

    private void labelOsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelOsMouseExited
        labelOs.setBorder(new LineBorder(Color.black, 0, true));
    }//GEN-LAST:event_labelOsMouseExited

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

    private void labeContasReceberMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labeContasReceberMouseEntered
        labeContasReceber.setBorder(new LineBorder(Color.WHITE, 1, true));
    }//GEN-LAST:event_labeContasReceberMouseEntered

    private void labeContasReceberMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labeContasReceberMouseExited
        labeContasReceber.setBorder(new LineBorder(Color.WHITE, 0, true));
    }//GEN-LAST:event_labeContasReceberMouseExited

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

    private void labeContasPagarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labeContasPagarMouseEntered
        labeContasPagar.setBorder(new LineBorder(Color.WHITE, 1, true));
    }//GEN-LAST:event_labeContasPagarMouseEntered

    private void labeContasPagarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labeContasPagarMouseExited
        labeContasPagar.setBorder(new LineBorder(Color.WHITE, 0, true));
    }//GEN-LAST:event_labeContasPagarMouseExited

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JMenu selectContas;
    private javax.swing.JMenu selectContasM;
    private javax.swing.JMenuItem selectEmpresa;
    private javax.swing.JMenuItem selectFuncionario;
    private javax.swing.JMenu selectRelatorio;
    private javax.swing.JMenuItem selectUsuario;
    // End of variables declaration//GEN-END:variables
}
