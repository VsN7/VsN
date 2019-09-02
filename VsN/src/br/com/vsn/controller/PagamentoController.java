package br.com.vsn.controller;

import br.com.vsn.dao.PagamentoDAO;
import br.com.vsn.dao.exceptions.NonexistentEntityException;
import br.com.vsn.model.Pagamento;
import br.com.vsn.model.Usuario;
import br.com.vsn.view.PagamentoView;
import java.awt.Component;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import org.jdesktop.observablecollections.ObservableCollections;

/**
 *
 * @author vitor
 */
public class PagamentoController {
    private final PagamentoDAO dao;
    private Pagamento pagamento;
    private List<Pagamento> pagamentos;
    static int id;
    static String login;
    public static int conta=0;

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }
    
     public void editPagamento(int id,Pagamento pagamento) throws Exception {
         Component rootPane = null;
         UsuarioController us = new UsuarioController();
         Usuario usuario = new Usuario();
         usuario.setId(us.getId());
         pagamento.setId(id);
         pagamento.setUsuario(usuario);
         dao.edit(pagamento);
         if(conta==0){
             JOptionPane.showMessageDialog(rootPane, "Alteração realizada com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE, null);
         }  
         else{
             conta = 0;
         }
             
     }

    public PagamentoController() {
        pagamento = new Pagamento();
        dao = new PagamentoDAO();
        pagamentos = ObservableCollections.observableList(new ArrayList<>());
        pesquisar();
    }
    
    private void pesquisar(){
        pagamentos.clear();
        pagamentos.addAll(dao.findPagamentoEntities());
    }
    
    public List<Pagamento> pesquisarUnico(int id) {
        pagamentos.clear();
        return dao.pagamentoUnico(id);
    }
    
    public void salvar() throws NoSuchAlgorithmException{
        Component rootPane = null;
        UsuarioController uc = new UsuarioController();
        Usuario usuario = new Usuario();
        usuario.setId(uc.getId());
        pagamento.setUsuario(usuario);
        dao.create(pagamento);
         
        JOptionPane.showMessageDialog(rootPane, "Cadastro realizado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE, null);
        
        pagamento = new Pagamento();
        pesquisar();
    }
    
        public int retornaOSId(int id){
            return dao.retornaOSId(id);
        }
        
        public void salvarPagamento(Pagamento pagamento) {
        Component rootPane = null;
        pagamento.setSituacao("ABERTO");
        UsuarioController uc = new UsuarioController();
        Usuario usuario = new Usuario();
        usuario.setId(uc.getId());
        pagamento.setUsuario(usuario);
        dao.create(pagamento);
        
        pagamento = new Pagamento();
        pesquisar();
        
        JOptionPane.showMessageDialog(rootPane, "Cadastro realizado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE, null);
        
        pesquisar();
    }
    
    public void destroy(int id) throws NonexistentEntityException{
        Component rootPane = null;
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o orçamento?", "Excluir", JOptionPane.YES_NO_OPTION);
        
        if (resposta == JOptionPane.YES_OPTION) {
            dao.destroy(id);
            JOptionPane.showMessageDialog(rootPane, "Exclusão realizada com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE, null);
        
        }
    }
    
    
    

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }
    
    public void setPagamentos(List<Pagamento> pagamentos) {
        this.pagamentos = pagamentos;
    }

    public List<Pagamento> getPagamentos() {
        return pagamentos;
    }
    public void cancelar(){
        pagamento = new Pagamento();
    }
    
    public void relatorioPagamentosGeral(int id){
        dao.relatorioPagamentosGeral(id);
    }
    
    public void relatorioPagamentoAll(){
        dao.relatorioPagamentosAll();
    }
    
    public void relatorioPagamentoData(int combobox,String dInicio, String dFinal){
        Component rootPane = null;
        try{
            dao.relatorioPagamentoData(combobox,dInicio,dFinal);
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "Campos Invalidos", "Aviso", JOptionPane.ERROR_MESSAGE, null);
        }
    }
    
    public void editSituacao(int id, Calendar c, String situacao) throws Exception{
        Component rootPane = null;
        Pagamento pagamento = new Pagamento();
        pagamento.setId(id);
        pagamento.setSituacao(situacao);
        dao.edit(pagamento);
//        if(getPagamentos().get(index).getSituacao().equals("ABERTO")){
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
        dao.relatorioPagamentoSituacao(comboBox);
    }
    
}
