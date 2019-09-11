package br.com.vsn.controller;

import br.com.vsn.dao.ContaReceberDAO;
import br.com.vsn.dao.exceptions.NonexistentEntityException;
import br.com.vsn.model.ContaReceber;
import br.com.vsn.model.Usuario;
import br.com.vsn.view.LoginView;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;
import org.jdesktop.observablecollections.ObservableCollections;

/**
 *
 * @author vitor
 */
public class ContaReceberController {

    private ContaReceberDAO dao;
    private List<ContaReceber> contaReceberes;
    private ContaReceber contaReceber;
    
    public ContaReceberController() {
        novo();
        dao = new ContaReceberDAO();
        contaReceberes = ObservableCollections.observableList(new ArrayList<>());
        pesquisar();
    }
    public ContaReceberController(int i){
        novo();
        dao = new ContaReceberDAO();
        contaReceberes = ObservableCollections.observableList(new ArrayList<>());
    }
    public void pesquisar() {
        contaReceberes.clear();
        contaReceberes.addAll(dao.buscaContaReceber());
    }

    public List<ContaReceber> contaReceberUnico(int id){
        return dao.contaReceberUnico(id);
    }
    
    public void novo() {
        contaReceber = new ContaReceber();
        Usuario us = new Usuario();
        UsuarioController uu = new UsuarioController();
        us.setId(uu.getId());
        us.setLogin(uu.getLogin());
        contaReceber.setUsuario(us);
        setContaReceber(contaReceber);
    }

    public ContaReceber getContaReceber() {
        return contaReceber;
    }

    public void setContaReceber(ContaReceber contaReceber) {
        this.contaReceber = contaReceber;
    }

    public void salvarContaReceber() {
        Component rootPane = null;
        if(contaReceber.getValor()>=0 && contaReceber.getValor()<1)
            contaReceber.setSituacao("Fechado");
        else
            contaReceber.setSituacao("Aberto");
            contaReceber.setValorPagar(contaReceber.getValor());
           // contaReceber.setVezesPagar(contaReceber.getParcelas());
            Calendar c = Calendar.getInstance();
            c.setTime(contaReceber.getDataInicio().getTime());
            c.set(Calendar.MONTH,c.get(Calendar.MONTH)+1);
            contaReceber.setDataVencimento(c);
        dao.create(contaReceber);
        
        JOptionPane.showMessageDialog(rootPane, "Cadastro realizado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE, null);
        
        pesquisar();
        novo();
    }

    public List<ContaReceber> getContaReceberes() {
        return contaReceberes;
    }

    public void setContaReceberes(List<ContaReceber> contaReceberes) {
        this.contaReceberes = contaReceberes;
    }
    public void buscarContaReceberMes(int mes){
        contaReceberes.clear();
        
        contaReceberes.addAll(dao.listarContaReceberPorMes(mes));
    }
    public void buscarContaReceberMesP(int mes){
        contaReceberes.clear();
        
        contaReceberes.addAll(dao.listarContaReceberPorMesP(mes));
    }
    
    public void buscarContaReceberIndex(int index){
        contaReceberes.clear();
        
        contaReceberes.addAll(dao.listarContaReceberPorSituacao(index));
    }
    
    public void efetuarPagamento(int id, double valor, Calendar c){
        getContaReceber().setDataVencimento(c);
        dao.update(getContaReceber(),id, valor);
    }
    public void updateVencimento(int id, Calendar c){
        dao.updateVencimento(getContaReceber(),id, c);
    }
    
    public void reduzParcela(int parcela, int id){
        dao.reduzParcela(getContaReceber(),parcela,id);
    }
    public void alterarSituacao(int id, Calendar c){
        getContaReceber().setDataVencimento(c);
        dao.alterarSituacao(getContaReceber(),id);
    }
    public double retornaContaReceberValor(){
        return dao.retornaContaReceberValor();
    }
    public int retornaContaReceberIndex(){
        return dao.retornaContaReceberIndex();
    }
    public String retornaContaReceberSituacao(int id){
        return dao.retornaContaReceberSituacao(id);
    }
    
    public int buscaContaReceberVezesP(int id){
        return dao.buscaContaReceberVezesPagar(id);
    }
    
    public double buscaContaReceberValorP(int id){
        return dao.buscaContaReceberValorPagar(id);
    }
    
    public int buscaContaReceberVezes(int id){
        return dao.buscaContaReceberVezes(id);
    }
    
    public double buscaContaReceberValor(int id){
        return dao.buscaContaReceberValor(id);
    }
    
    public Calendar buscaDataVencimento(int id){
        return dao.buscaContaReceberVencimento(id);
    }
    
    public int primeiroPasso() throws Exception{
        return dao.primeiroPasso();
    }
    
    public void destroy(int id) throws NonexistentEntityException{
        Component rootPane = null;
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir a despesa?", "Excluir", JOptionPane.YES_NO_OPTION);
        
        if (resposta == JOptionPane.YES_OPTION) {
            dao.destroy(id);
        }
    }
    
}
