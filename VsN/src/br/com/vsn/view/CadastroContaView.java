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
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vitor
 */
public class CadastroContaView extends javax.swing.JInternalFrame {

    private ContaController cc;
    Conta conta;
    NumberFormat formatter;
    DateFormat sdf;
    /**
     * Creates new form CadastroContaView
     */
    public CadastroContaView(){
        cc = new ContaController();
        conta = new Conta();
        sdf = new SimpleDateFormat("dd/MM/yyyy");
        formatter = new DecimalFormat("#0.00");
        initComponents();
        
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int lar = (int) d.getWidth();
        int alt = (int) d.getHeight();
        this.setLocation((lar - this.getSize().width) / 2, (alt - this.getSize().height)/6);
        inputDataCompra.setText("");
        jComboBox1.setEnabled(false);
        jComboBox1.setSelectedIndex(0);
        cc.getConta().setVezes(1);
        
        
        if(cc.getContas().size()<=0){
            System.out.println("Erro linha 46 cadastro conta view");
        }else{
            try {
                preencherTabela();
            } catch (Exception ex) {
                Logger.getLogger(CadastroContaView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public ContaController getCc() {
        return cc;
    }

    public int valorCollun(){
        int row = jTable1.getSelectedRow();
        Object value = null;
        String converteValueString = "";
        int id;
         if (row > -1) { //então tem ítem selecionado
             value = jTable1.getValueAt(row, 0);
         }
         converteValueString = ""+value;
         id = Integer.parseInt(converteValueString);
         return id;
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
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        ImageIcon iconOrcamento2 = new ImageIcon(getClass().getResource("/icon/calendario.jpg")); Image imagem2 = iconOrcamento2.getImage();
        jLabel7 = new javax.swing.JLabel(){
            public void paintComponent(Graphics g){
                g.drawImage(imagem2,0,0,getWidth(),getHeight(),this);
            }
        };
        inputDataCompra = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter dataFinal= new javax.swing.text.MaskFormatter("##/##/####");
            inputDataCompra = new javax.swing.JFormattedTextField(dataFinal);
        }
        catch (Exception e){
        }
        inputSelecionado = new javax.swing.JTextField();
        buttonBuscar = new javax.swing.JToggleButton();
        comboSelecionar = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        inputCliente = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastro de Titulos");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusTraversalPolicyProvider(true);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CADASTRO DE TITULOS");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Título:");

        jTextField1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${cc.conta.titulo}"), jTextField1, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Valor:");

        jTextField2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${cc.conta.valor}"), jTextField2, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Parcelado:");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${cc.conta.parcelado}"), jCheckBox1, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Vezes:");

        jComboBox1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 vez", "2 vezes", "3 vezes", "4 vezes" }));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${cc.conta.vezes}"), jComboBox1, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Primeira parcela:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Titulo", "Cliente", "Parcelas", "Valor", "Situação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(4);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(120);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(40);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(60);
        }

        jButton1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton1.setText("Salvar Titulo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton2.setText("Remover Titulo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel7MousePressed(evt);
            }
        });

        inputDataCompra.setPreferredSize(new java.awt.Dimension(6, 23));

        inputSelecionado.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        buttonBuscar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        buttonBuscar.setText("Buscar");
        buttonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBuscarActionPerformed(evt);
            }
        });

        comboSelecionar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comboSelecionar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Titulo", "Cliente", "ID" }));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("Cliente:");

        inputCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        inputCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inputClienteKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputDataCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(comboSelecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(inputSelecionado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonBuscar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jLabel4)
                                .addGap(2, 2, 2)
                                .addComponent(jCheckBox1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jTextField1)
                            .addComponent(inputCliente))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(inputCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jCheckBox1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputDataCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(inputSelecionado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboSelecionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(buttonBuscar, javax.swing.GroupLayout.Alignment.TRAILING)))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            if(Double.parseDouble(jTextField2.getText())>0){
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date data = sdf.parse(inputDataCompra.getText());
            cc.getConta().getDataCompra().setTime(data);
            cc.getConta().setTitulo(jTextField1.getText().toUpperCase());
            cc.getConta().setVezes(jComboBox1.getSelectedIndex()+1);
            if(inputCliente.getText().equals("")){
                cc.getConta().setCliente("NÃO INFORMADO");
            }else{
                cc.getConta().setCliente(inputCliente.getText().toUpperCase());
            }
            cc.salvarConta();
            this.preencherTabela();
            limpaCampos();
            }else{
                JOptionPane.showMessageDialog(null, "Valor inválido", "Aviso", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
               JOptionPane.showMessageDialog(null, "Dados inválidos", "Aviso", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if(this.jCheckBox1.isSelected()){
            jComboBox1.setEnabled(true);
            cc.getConta().setVezes(1);
        }else{
            jComboBox1.setEnabled(false);
            jComboBox1.setSelectedIndex(0);
            cc.getConta().setVezes(1);
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            PagamentoContasPagarView pv = new PagamentoContasPagarView();
            cc.destroy(valorCollun());
            pv.setIndex(0);
            cc.pesquisar();
            this.preencherTabela();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Primeiro selecione algum titulo", "Aviso", JOptionPane.ERROR_MESSAGE);
        }
         
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        jLabel7.setBorder(new LineBorder(new Color(230, 40, 70), 2, true));
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        jLabel7.setBorder(new LineBorder(Color.black, 2, true));
    }//GEN-LAST:event_jLabel7MouseExited

    private void jLabel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MousePressed
        CalendarView cv = new CalendarView();
        this.getParent().add(cv);
        cv.setVisible(true);
        cv.setaCalendarCadastroConta();
    }//GEN-LAST:event_jLabel7MousePressed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if(evt.getClickCount() == 2){
          try {
                
                conta = cc.contaUnico(this.valorCollun()).get(0);
                try{
                    int i = 0;
                    int id = conta.getId();
                    Iterator iterator = cc.getContas().iterator();
                    do{
                        if(id == cc.getContas().get(i).getId()){
                            PagamentoContasPagarView pcpv = new PagamentoContasPagarView();
                            pcpv.setIndex(i);
                        }
                        iterator.next();
                        if(i<cc.getContas().size()-1)
                            i++;

                    }while (iterator.hasNext());
                    PagamentoContasPagarView pv = new PagamentoContasPagarView();
                    this.getParent().add(pv);
                    pv.setVisible(true);
                    this.valoresInputConta();
                }catch(Exception ex){
                    Logger.getLogger(UsuarioView.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.dispose();
            } catch (Exception ex) {
                Logger.getLogger(CadastroContaView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void buttonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBuscarActionPerformed
        String valorCombo;
        try{
            valorCombo=comboSelecionar.getSelectedItem().toString().toLowerCase();
            if(valorCombo.equals("titulo")){
                this.preencherTabelaFiltroTitulo();
            }else if(valorCombo.equals("id")){
                this.preencherTabelaFiltroId();
            }else if(valorCombo.equals("cliente")){
                this.preencherTabelaFiltroCliente();
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Informe os dados corretamente", "Aviso", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonBuscarActionPerformed

    private void inputClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputClienteKeyPressed
        if (evt.getKeyCode() == evt.VK_F1) {
            try {
                PesquisarClienteView pv = new PesquisarClienteView();
                this.getParent().add(pv);
                pv.setVisible(true);
                PesquisarClienteView.validador = 3;
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Falha ao tentar acessar o banco de dados", "Aviso", JOptionPane.ERROR_MESSAGE);
                }
            }
    }//GEN-LAST:event_inputClienteKeyPressed

    public void limpaCampos(){
        inputDataCompra.setText("");
        jTextField1.setText("");
        jTextField2.setText("");
        inputCliente.setText("");
        jCheckBox1.setSelected(false);
        jComboBox1.setEnabled(false);
        jComboBox1.setSelectedIndex(0);
    }
    
    
    public void preencherTabela() throws Exception{
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        cc = new ContaController();
        DefaultTableModel modelo = (DefaultTableModel)jTable1.getModel();
        modelo.setNumRows(0);
        for(int i=0; i<cc.getContas().size(); i++){
            modelo.addRow(new Object[]{
             cc.getContas().get(i).getId(),
             cc.getContas().get(i).getTitulo(),
             cc.getContas().get(i).getCliente(),
             cc.getContas().get(i).getVezes(),
             cc.getContas().get(i).getValor(),
             cc.getContas().get(i).getSituacao()
             });
        }
        
    }
    
    public void preencherTabelaFiltroTitulo() throws Exception{
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        cc = new ContaController();
        DefaultTableModel modelo = (DefaultTableModel)jTable1.getModel();
        modelo.setNumRows(0);
        for(int i=0; i<cc.pesquisarFiltroTitulo(inputSelecionado.getText()).size(); i++){
            modelo.addRow(new Object[]{
             cc.pesquisarFiltroTitulo(inputSelecionado.getText()).get(i).getId(),
             cc.pesquisarFiltroTitulo(inputSelecionado.getText()).get(i).getTitulo(),
             cc.pesquisarFiltroTitulo(inputSelecionado.getText()).get(i).getCliente(),
             cc.pesquisarFiltroTitulo(inputSelecionado.getText()).get(i).getVezes(),
             cc.pesquisarFiltroTitulo(inputSelecionado.getText()).get(i).getValor(),
             cc.pesquisarFiltroTitulo(inputSelecionado.getText()).get(i).getSituacao()
             });
        }
        
    }
    
    public void preencherTabelaFiltroCliente() throws Exception{
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        cc = new ContaController();
        DefaultTableModel modelo = (DefaultTableModel)jTable1.getModel();
        modelo.setNumRows(0);
        for(int i=0; i<cc.pesquisarFiltroCliente(inputSelecionado.getText()).size(); i++){
            modelo.addRow(new Object[]{
             cc.pesquisarFiltroCliente(inputSelecionado.getText()).get(i).getId(),
             cc.pesquisarFiltroCliente(inputSelecionado.getText()).get(i).getTitulo(),
             cc.pesquisarFiltroCliente(inputSelecionado.getText()).get(i).getCliente(),
             cc.pesquisarFiltroCliente(inputSelecionado.getText()).get(i).getVezes(),
             cc.pesquisarFiltroCliente(inputSelecionado.getText()).get(i).getValor(),
             cc.pesquisarFiltroCliente(inputSelecionado.getText()).get(i).getSituacao()
             });
        }
        
    }
    
    public void preencherTabelaFiltroId() throws Exception{
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        cc = new ContaController();
        DefaultTableModel modelo = (DefaultTableModel)jTable1.getModel();
        modelo.setNumRows(0);
        for(int i=0; i<cc.pesquisarFiltroId(Integer.parseInt(inputSelecionado.getText())).size(); i++){
            modelo.addRow(new Object[]{
             cc.pesquisarFiltroId(Integer.parseInt(inputSelecionado.getText())).get(i).getId(),
             cc.pesquisarFiltroId(Integer.parseInt(inputSelecionado.getText())).get(i).getTitulo(),
             cc.pesquisarFiltroId(Integer.parseInt(inputSelecionado.getText())).get(i).getCliente(),
             cc.pesquisarFiltroId(Integer.parseInt(inputSelecionado.getText())).get(i).getVezes(),
             cc.pesquisarFiltroId(Integer.parseInt(inputSelecionado.getText())).get(i).getValor(),
             cc.pesquisarFiltroId(Integer.parseInt(inputSelecionado.getText())).get(i).getSituacao()
             });
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton buttonBuscar;
    private javax.swing.JComboBox<String> comboSelecionar;
    public static javax.swing.JTextField inputCliente;
    public static javax.swing.JTextField inputDataCompra;
    private javax.swing.JTextField inputSelecionado;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    
    public void valoresInputConta(){
        PagamentoContasPagarView.inputTitulo.setText(""+conta.getTitulo());
        PagamentoContasPagarView.inputValor.setText(""+formatter.format(conta.getValor()));
        PagamentoContasPagarView.inputDataCompra.setText(""+sdf.format(conta.getDataCompra().getTime()));
        PagamentoContasPagarView.comboBoxVezes.setSelectedItem((String) ""+conta.getVezes());
        PagamentoContasPagarView.inputValorParcela.setText(""+formatter.format((conta.getValor()/conta.getVezes())));
        PagamentoContasPagarView.comboBoxVezesRestantes.setSelectedItem((String) ""+conta.getVezesPagar());
        PagamentoContasPagarView.inputValorRestante.setText(""+formatter.format(conta.getValorPagar()));
        PagamentoContasPagarView.inputDataVencimento.setText(""+sdf.format(conta.getDataVencimento().getTime()));
        PagamentoContasPagarView.inputSituacao.setText(""+conta.getSituacao());
        PagamentoContasPagarView.inputValorRestante.setText(""+formatter.format(conta.getValorPagar()));
    }
    
}
