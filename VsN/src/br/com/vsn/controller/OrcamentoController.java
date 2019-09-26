package br.com.vsn.controller;

import br.com.vsn.dao.OrcamentoDAO;
import br.com.vsn.dao.exceptions.NonexistentEntityException;
import br.com.vsn.model.Orcamento;
import br.com.vsn.model.Usuario;
import br.com.vsn.view.OrcamentoView;
import java.awt.Component;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.jdesktop.observablecollections.ObservableCollections;

/**
 *
 * @author vitor
 */
public class OrcamentoController {
    private final OrcamentoDAO dao;
    private Orcamento orcamento;
    private List<Orcamento> orcamentos;
    static int id;
    static String login;
    public static int conta=0;

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }
    
     public void editOrcamento(int id,Orcamento orcamento) throws Exception {
         Component rootPane = null;
         UsuarioController us = new UsuarioController();
         Usuario usuario = new Usuario();
         usuario.setId(us.getId());
        if(orcamento.getDataInicio().getTime().after(orcamento.getPrevisaoEntrega().getTime())){
            orcamento=null;
            JOptionPane.showMessageDialog(null, "Data de inicio do serviço é maior do que a previsão de entrega", "Aviso", JOptionPane.ERROR_MESSAGE);
        }
         orcamento.setId(id);
         orcamento.setUsuario(usuario);
         dao.edit(orcamento);
         if(conta==0){
             JOptionPane.showMessageDialog(rootPane, "Alteração realizada com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE, null);
         }  
         else{
             conta = 0;
         }
             
     }

    public OrcamentoController() {
        orcamento = new Orcamento();
        dao = new OrcamentoDAO();
        orcamentos = ObservableCollections.observableList(new ArrayList<>());
        pesquisar();
    }
    
    private void pesquisar(){
        orcamentos.clear();
        orcamentos.addAll(dao.findOrcamentoEntities());
    }
    
    public List<Orcamento> pesquisarUnico(int id) {
        orcamentos.clear();
        return dao.orcamentoUnico(id);
    }
    
    public List<Orcamento> pesquisarFiltroNome(String nome) {
        orcamentos.clear();
        nome+="%";
        
        return dao.orcamentoFiltroNome(nome.toUpperCase());
    }
    
    public List<Orcamento> pesquisarFiltroCpf(String cpf) {
        orcamentos.clear();
        cpf+="%";
        return dao.orcamentoFiltroCpf(cpf);
    }
    
    public void salvar() throws NoSuchAlgorithmException{
        Component rootPane = null;
        UsuarioController uc = new UsuarioController();
        Usuario usuario = new Usuario();
        usuario.setId(uc.getId());
        orcamento.setUsuario(usuario);
        dao.create(orcamento);
         
        JOptionPane.showMessageDialog(rootPane, "Cadastro realizado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE, null);
        
        orcamento = new Orcamento();
        pesquisar();
    }
    
        public int retornaOSId(int id){
            return dao.retornaOSId(id);
        }
        
        public void salvarOrcamento(Orcamento orcamento) {
        if(orcamento.getDataInicio().getTime().after(orcamento.getPrevisaoEntrega().getTime())){
            orcamento=null;
            JOptionPane.showMessageDialog(null, "Data de inicio do serviço é maior do que a previsão de entrega", "Aviso", JOptionPane.ERROR_MESSAGE);
        }
        Component rootPane = null;
        orcamento.setSituacao("ABERTO");
        UsuarioController uc = new UsuarioController();
        Usuario usuario = new Usuario();
        usuario.setId(uc.getId());
        orcamento.setUsuario(usuario);
        dao.create(orcamento);
        
        orcamento = new Orcamento();
        pesquisar();
        
        JOptionPane.showMessageDialog(rootPane, "Cadastro realizado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE, null);
        
        pesquisar();
    }
    
    public void destroy(int id) throws NonexistentEntityException{
        Component rootPane = null;
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o orçamento?", "Excluir", JOptionPane.YES_NO_OPTION);
        
        if (resposta == JOptionPane.YES_OPTION) {
            dao.destroy(id);
            OrcamentoView.index--; 
            JOptionPane.showMessageDialog(rootPane, "Exclusão realizada com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE, null);
        
        }
    }
    
    
    

    public void setOrcamento(Orcamento orcamento) {
        this.orcamento = orcamento;
    }

    public Orcamento getOrcamento() {
        return orcamento;
    }
    
    public void setOrcamentos(List<Orcamento> orcamentos) {
        this.orcamentos = orcamentos;
    }

    public List<Orcamento> getOrcamentos() {
        return orcamentos;
    }
    public void cancelar(){
        orcamento = new Orcamento();
    }
    
    public void relatorioOrcamentosGeral(int id){
        dao.relatorioOrcamentosGeral(id);
    }
    public void relatorioReciboManual(){
        dao.relatorioReciboManual();
    }
    
    public void relatorioOrcamentoAll(){
        dao.relatorioOrcamentosAll();
    }
    
    public void relatorioOrcamentoData(int combobox,String dInicio, String dFinal){
        Component rootPane = null;
        try{
            dao.relatorioOrcamentoData(combobox,dInicio,dFinal);
        }catch (Exception ex) {
            Logger.getLogger(OrcamentoController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void editSituacao(int id, Calendar c, String situacao) throws Exception{
        Component rootPane = null;
        Orcamento orcamento = new Orcamento();
        orcamento.setId(id);
        orcamento.setSituacao(situacao);
        dao.edit(orcamento);
//        if(getOrcamentos().get(index).getSituacao().equals("ABERTO")){
//            
//            JOptionPane.showMessageDialog(rootPane, "Orçamento reaberto com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE, null);
//        
//        }else{
//            
//            JOptionPane.showMessageDialog(rootPane, "Orçamento Finalizado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE, null);
//        
//        }
    }
    
    public void relatorioSituacao(int comboBox){
        dao.relatorioOrcamentoSituacao(comboBox);
    }
    
}
