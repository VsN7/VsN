package br.com.vsn.controller;

import br.com.vsn.dao.ContaDAO;
import br.com.vsn.dao.exceptions.NonexistentEntityException;
import br.com.vsn.model.Conta;
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
public class ContaController {

    private ContaDAO dao;
    private List<Conta> contas;
    private Conta conta;
    
    public ContaController() {
        novo();
        dao = new ContaDAO();
        contas = ObservableCollections.observableList(new ArrayList<>());
        pesquisar();
    }
    public ContaController(int i){
        novo();
        dao = new ContaDAO();
        contas = ObservableCollections.observableList(new ArrayList<>());
    }
    public void pesquisar() {
        contas.clear();
        contas.addAll(dao.buscaConta());
    }

    public List<Conta> contaUnico(int id){
        return dao.contaUnico(id);
    }
    
    public void novo() {
        conta = new Conta();
        Usuario us = new Usuario();
        UsuarioController uu = new UsuarioController();
        us.setId(uu.getId());
        us.setLogin(uu.getLogin());
        conta.setUsuario(us);
        setConta(conta);
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public void salvarConta() {
        Component rootPane = null;
        if(conta.getValor()>=0 && conta.getValor()<1)
            conta.setSituacao("FECHADO");
        else
            conta.setSituacao("ABERTO");
            conta.setValorPagar(conta.getValor());
            conta.setVezesPagar(conta.getVezes());
            Calendar c = Calendar.getInstance();
            c.setTime(conta.getDataCompra().getTime());
            c.set(Calendar.MONTH,c.get(Calendar.MONTH)+1);
            conta.setDataVencimento(c);
        dao.create(conta);
        
        JOptionPane.showMessageDialog(rootPane, "Cadastro realizado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE, null);
        
        pesquisar();
        novo();
    }

    public void salvarContaPagamento(Conta conta) {
        dao.create(conta);
        pesquisar();
        novo();
    }
    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
    public void buscarContaMes(int mes){
        contas.clear();
        
        contas.addAll(dao.listarContaPorMes(mes));
    }
    public void buscarContaMesP(int mes){
        contas.clear();
        
        contas.addAll(dao.listarContaPorMesP(mes));
    }
    
    public void buscarContaIndex(int index){
        contas.clear();
        
        contas.addAll(dao.listarContaPorSituacao(index));
    }
    
    public void efetuarPagamento(int id, double valor, Calendar c){
        getConta().setDataVencimento(c);
        dao.update(getConta(),id, valor);
    }
    public void updateVencimento(int id, Calendar c){
        dao.updateVencimento(getConta(),id, c);
    }
    
    public void reduzParcela(int parcela, int id){
        dao.reduzParcela(getConta(),parcela,id);
    }
    public void alterarSituacao(int id, Calendar c){
        getConta().setDataVencimento(c);
        dao.alterarSituacao(getConta(),id);
    }
    public double retornaContaValor(){
        return dao.retornaContaValor();
    }
    public int retornaContaIndex(){
        return dao.retornaContaIndex();
    }
    public String retornaContaSituacao(int id){
        return dao.retornaContaSituacao(id);
    }
    
    public int buscaContaVezesP(int id){
        return dao.buscaContaVezesPagar(id);
    }
    
    public double buscaContaValorP(int id){
        return dao.buscaContaValorPagar(id);
    }
    
    public int buscaContaVezes(int id){
        return dao.buscaContaVezes(id);
    }
    
    public double buscaContaValor(int id){
        return dao.buscaContaValor(id);
    }
    
    public Calendar buscaDataVencimento(int id){
        return dao.buscaContaVencimento(id);
    }
    
    public int primeiroPasso() throws Exception{
        return dao.primeiroPasso();
    }
    
    public void destroy(int id) throws NonexistentEntityException{
        Component rootPane = null;
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o titulo?", "Excluir", JOptionPane.YES_NO_OPTION);
        Conta conta = dao.pesquisarUnico(id);
        if (resposta == JOptionPane.YES_OPTION) {
            if(conta.getSituacao().equals("FECHADO")){
                JOptionPane.showMessageDialog(null, "Não é possível excluir um titulo que já foi recebido!", "Aviso", JOptionPane.ERROR_MESSAGE);
            }else if(conta.getPagamento_id()!= 0){
                JOptionPane.showMessageDialog(null, "Não é possível excluir um tituto que esteja vinculado com algum pagamento!", "Aviso", JOptionPane.ERROR_MESSAGE);
            }else{
                dao.destroy(id);
                JOptionPane.showMessageDialog(rootPane, "Titulo excluido com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE, null);
            }
            
        }
    }
    
    public void destroyP(int id) throws NonexistentEntityException{
        dao.destroy(id);
    }
    
     public List<Conta> pesquisarFiltroTitulo(String titulo) {
        contas.clear();
        titulo+="%";
        
        return dao.contaFiltroTitulo(titulo.toUpperCase());
    }
     
     public List<Conta> pesquisarFiltroCliente(String cliente) {
        contas.clear();
        cliente+="%";
        
        return dao.contaFiltroCliente(cliente.toUpperCase());
    }
    
    public List<Conta> pesquisarFiltroId(int id) {
        contas.clear();
        return dao.contaFiltroId(id);
    }
    
    public List<Conta> buscaContaIdPagamento(int id) {
        contas.clear();
        return dao.buscaContaIdPagamento(id);
    }
    
    public Conta pesquisarUnico(int id) {
        contas.clear();
        return dao.pesquisarUnico(id);
    }
    
}
