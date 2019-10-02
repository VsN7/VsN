/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vsn.view;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Vitor
 */
public class CalendarView extends javax.swing.JInternalFrame {

    
    
    private static Calendar c = Calendar.getInstance();
    
    public Calendar retornaData(){
        return c;
    }
    
    public void setaCalendarClienteNascimento(){
        
        jCalendar1.getDayChooser().addPropertyChangeListener("day", new PropertyChangeListener() {

            @Override
            public void propertyChange(PropertyChangeEvent e) {
                
                c= jCalendar1.getCalendar();
                ClienteView.inputDtNascimento.setText(new SimpleDateFormat("dd/MM/yyyy").format(jCalendar1.getDate()));
                dispose();
            }
        });
    }
//    
    public void setaCalendarOrcamentoDtInicio(){
        
        jCalendar1.getDayChooser().addPropertyChangeListener("day", new PropertyChangeListener() {

            @Override
            public void propertyChange(PropertyChangeEvent e) {
                
                c= jCalendar1.getCalendar();
                OrcamentoView.inputDataInicio.setText(new SimpleDateFormat("dd/MM/yyyy").format(jCalendar1.getDate()));
                dispose();
            }
        });
        
    }
//    
    public void setaCalendarOrcamentoPvEntrega(){
        
        jCalendar1.getDayChooser().addPropertyChangeListener("day", new PropertyChangeListener() {

            @Override
            public void propertyChange(PropertyChangeEvent e) {
                
                c= jCalendar1.getCalendar();
                OrcamentoView.inputPrevisaoEntrega.setText(new SimpleDateFormat("dd/MM/yyyy").format(jCalendar1.getDate()));
                dispose();
            }
        });
        
    }
    
    // Ordem de Serviço
    public void setaCalendarOrdemServicoPvEntrega(){
        jCalendar1.getDayChooser().addPropertyChangeListener("day", new PropertyChangeListener() {

            @Override
            public void propertyChange(PropertyChangeEvent e) {
                
                c= jCalendar1.getCalendar();
                OrdemServicoView.inputPrevisaoEntrega.setText(new SimpleDateFormat("dd/MM/yyyy").format(jCalendar1.getDate()));
                dispose();
            }
        });
    }
    
    public void setaCalendarOrdemServicoDtInicio(){
        
        jCalendar1.getDayChooser().addPropertyChangeListener("day", new PropertyChangeListener() {

            @Override
            public void propertyChange(PropertyChangeEvent e) {
                
                c= jCalendar1.getCalendar();
                OrdemServicoView.inputDataInicio.setText(new SimpleDateFormat("dd/MM/yyyy").format(jCalendar1.getDate()));
                dispose();
            }
        });
        
    }
    
    //Funcionario
    
    public void setaCalendarFuncionarioDtNascimento(){
        
        jCalendar1.getDayChooser().addPropertyChangeListener("day", new PropertyChangeListener() {

            @Override
            public void propertyChange(PropertyChangeEvent e) {
                
                c= jCalendar1.getCalendar();
                FuncionarioView.inputDtNascimento.setText(new SimpleDateFormat("dd/MM/yyyy").format(jCalendar1.getDate()));
                dispose();
            }
        });
        
    }
    
    
    public void setaCalendarCadastroConta(){
        
        jCalendar1.getDayChooser().addPropertyChangeListener("day", new PropertyChangeListener() {

            @Override
            public void propertyChange(PropertyChangeEvent e) {
                
                c= jCalendar1.getCalendar();
                ContaReceberView.inputDataCompra.setText(new SimpleDateFormat("dd/MM/yyyy").format(jCalendar1.getDate()));
                dispose();
            }
        });
        
    }
    public void setaCalendarFiltroRelatorioOSDataInicio(){
        
        jCalendar1.getDayChooser().addPropertyChangeListener("day", new PropertyChangeListener() {

            @Override
            public void propertyChange(PropertyChangeEvent e) {
                
                c= jCalendar1.getCalendar();
                FiltroDataRelatorioOrcamentosView.inputDataInicio.setText(new SimpleDateFormat("dd/MM/yyyy").format(jCalendar1.getDate()));
                dispose();
            }
        });
        
    }
    
    
    public void setaCalendarFiltroRelatorioOSDataFinal(){
        
        jCalendar1.getDayChooser().addPropertyChangeListener("day", new PropertyChangeListener() {

            @Override
            public void propertyChange(PropertyChangeEvent e) {
                
                c= jCalendar1.getCalendar();
                FiltroDataRelatorioOrcamentosView.inputDataFinal.setText(new SimpleDateFormat("dd/MM/yyyy").format(jCalendar1.getDate()));
                dispose();
            }
        });
    }
    
    public void setaCalendarFiltroRelatorioOrdemServicoDataInicio(){
        
        jCalendar1.getDayChooser().addPropertyChangeListener("day", new PropertyChangeListener() {

            @Override
            public void propertyChange(PropertyChangeEvent e) {
                
                c= jCalendar1.getCalendar();
                FiltroDataRelatorioOrdemServicoView.inputDataInicio.setText(new SimpleDateFormat("dd/MM/yyyy").format(jCalendar1.getDate()));
                dispose();
            }
        });
        
    }
    
    
    public void setaCalendarFiltroRelatorioOrdemServicoDataFinal(){
        
        jCalendar1.getDayChooser().addPropertyChangeListener("day", new PropertyChangeListener() {

            @Override
            public void propertyChange(PropertyChangeEvent e) {
                
                c= jCalendar1.getCalendar();
                FiltroDataRelatorioOrdemServicoView.inputDataFinal.setText(new SimpleDateFormat("dd/MM/yyyy").format(jCalendar1.getDate()));
                dispose();
            }
        });
    }
    
    public void setaCalendarContaPagarInicio(){
        
        jCalendar1.getDayChooser().addPropertyChangeListener("day", new PropertyChangeListener() {

            @Override
            public void propertyChange(PropertyChangeEvent e) {
                
                c= jCalendar1.getCalendar();
                ContaPagarView.inputDataInicio.setText(new SimpleDateFormat("dd/MM/yyyy").format(jCalendar1.getDate()));
                dispose();
            }
        });
    }
    
    public void setaCalendarFiltroRelatorioContasPagarInicio(){
        
        jCalendar1.getDayChooser().addPropertyChangeListener("day", new PropertyChangeListener() {

            @Override
            public void propertyChange(PropertyChangeEvent e) {
                
                c= jCalendar1.getCalendar();
                FiltroRelatorioContasPagarView.inputDataInicio.setText(new SimpleDateFormat("dd/MM/yyyy").format(jCalendar1.getDate()));
                dispose();
            }
        });
    }
    
    public void setaCalendarFiltroRelatorioContasPagarDataFinal(){
        
        jCalendar1.getDayChooser().addPropertyChangeListener("day", new PropertyChangeListener() {

            @Override
            public void propertyChange(PropertyChangeEvent e) {
                
                c= jCalendar1.getCalendar();
                FiltroRelatorioContasPagarView.inputDataFinal.setText(new SimpleDateFormat("dd/MM/yyyy").format(jCalendar1.getDate()));
                dispose();
            }
        });
    }
    
    public void setaCalendarFiltroRelatorioContasReceberInicio(){
        
        jCalendar1.getDayChooser().addPropertyChangeListener("day", new PropertyChangeListener() {

            @Override
            public void propertyChange(PropertyChangeEvent e) {
                
                c= jCalendar1.getCalendar();
                FiltroRelatorioContasReceberView.inputDataInicio.setText(new SimpleDateFormat("dd/MM/yyyy").format(jCalendar1.getDate()));
                dispose();
            }
        });
    }
    
    public void setaCalendarFiltroRelatorioContasReceberDataFinal(){
        
        jCalendar1.getDayChooser().addPropertyChangeListener("day", new PropertyChangeListener() {

            @Override
            public void propertyChange(PropertyChangeEvent e) {
                
                c= jCalendar1.getCalendar();
                FiltroRelatorioContasReceberView.inputDataFinal.setText(new SimpleDateFormat("dd/MM/yyyy").format(jCalendar1.getDate()));
                dispose();
            }
        });
    }
    
    public CalendarView() {
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        double lar =d.getWidth();
        int alt = (int) d.getHeight();
        this.setLocation((int) ((lar - this.getSize().width) / 3), (alt - this.getSize().height)/10);
        initComponents();
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jCalendar1 = new com.toedter.calendar.JCalendar();

        setClosable(true);
        setIconifiable(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
