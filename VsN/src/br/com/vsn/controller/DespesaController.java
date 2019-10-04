package br.com.vsn.controller;

import br.com.vsn.dao.DespesaDAO;
import br.com.vsn.dao.exceptions.NonexistentEntityException;
import br.com.vsn.model.Despesa;
import br.com.vsn.model.Usuario;
import br.com.vsn.view.ContaPagarView;
import br.com.vsn.view.LoginView;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.jdesktop.observablecollections.ObservableCollections;

/**
 *
 * @author vitor
 */
public class DespesaController {

    private DespesaDAO dao;
    private List<Despesa> despesas;
    private Despesa despesa;
    
    public DespesaController() {
        novo();
        dao = new DespesaDAO();
        despesas = ObservableCollections.observableList(new ArrayList<>());
        pesquisar();
    }
    public void pesquisar() {
        despesas.clear();
        despesas.addAll(dao.buscaDespesa());
    }

    public List<Despesa> despesaUnico(int id){
        return dao.despesaUnico(id);
    }
    
    public void novo() {
        despesa = new Despesa();
        setDespesa(despesa);
    }

    public Despesa getDespesa() {
        return despesa;
    }

    public void setDespesa(Despesa despesa) {
        this.despesa = despesa;
    }

    public void salvarDespesa() {
        Component rootPane = null;
        if(despesa.getValor()>=0 && despesa.getValor()<1)
            despesa.setSituacao("FECHADO");
        else
            despesa.setSituacao("ABERTO");
        despesa.setValorPagar(despesa.getValor());
        despesa.setParcelasPagar(despesa.getParcelas());
        Usuario us = new Usuario();
        UsuarioController uu = new UsuarioController();
        us.setId(uu.getId());
        us.setLogin(uu.getLogin());
        despesa.setUsuario(us);
        dao.create(despesa);
        
        JOptionPane.showMessageDialog(rootPane, "Cadastro realizado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE, null);
        
        pesquisar();
        novo();
    }
    
    public void editDespesa(Despesa despesa) throws Exception{
        Component rootPane = null;
        dao.edit(despesa);
        JOptionPane.showMessageDialog(rootPane, "Conta editada com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE, null);
        
    }
    
    public void efetuarPagamento(Despesa despesa,int combo, double valor) throws Exception{
        Component rootPane = null;
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente pagar "+combo+" parcela(s) dessa conta?", "Excluir", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            if(despesa.getParcelasPagar()-combo == 0){
                despesa.setSituacao("FECHADO");
            }else{
                Calendar c = Calendar.getInstance();
                c.setTime(despesa.getDataVencimento().getTime());
                c.set(Calendar.MONTH,c.get(Calendar.MONTH)+combo );
                despesa.setDataVencimento(c);
            }
            despesa.setParcelasPagar(despesa.getParcelasPagar()-combo);
            despesa.setValorPagar(despesa.getValorPagar()-valor);
            dao.edit(despesa);
            JOptionPane.showMessageDialog(rootPane, "Parcela(s) paga(s) com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE, null);
        }
    }
    
    public void estorno(Despesa despesa) throws Exception{
        Component rootPane = null;
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente estornar essa conta?", "Excluir", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            despesa.setSituacao("ABERTO");
            Calendar c = Calendar.getInstance();
            c.setTime(despesa.getDataInicio().getTime());
            c.set(Calendar.MONTH,c.get(Calendar.MONTH)+1 );
            despesa.setDataVencimento(c);
            despesa.setParcelasPagar(despesa.getParcelas());
            despesa.setValorPagar(despesa.getValor());
            dao.edit(despesa);
            JOptionPane.showMessageDialog(rootPane, "Conta estornada com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE, null);
        }
    }
    
    
    public List<Despesa> getDespesas() {
        return despesas;
    }

    public void setDespesas(List<Despesa> despesas) {
        this.despesas = despesas;
    }
    public void buscarDespesaMes(int mes){
        despesas.clear();
        
        despesas.addAll(dao.listarDespesaPorMes(mes));
    }
    public void buscarDespesaMesP(int mes){
        despesas.clear();
        
        despesas.addAll(dao.listarDespesaPorMesP(mes));
    }
    
    public void buscarDespesaIndex(int index){
        despesas.clear();
        
        despesas.addAll(dao.listarDespesaPorSituacao(index));
    }
    
    public void efetuarPagamento(int id, double valor, Calendar c){
        getDespesa().setDataVencimento(c);
        dao.update(getDespesa(),id, valor);
    }
    public void updateVencimento(int id, Calendar c){
        dao.updateVencimento(getDespesa(),id, c);
    }
    
    public void reduzParcela(int parcela, int id){
        dao.reduzParcela(getDespesa(),parcela,id);
    }
    public void alterarSituacao(int id, Calendar c){
        getDespesa().setDataVencimento(c);
        dao.alterarSituacao(getDespesa(),id);
    }
    public double retornaDespesaValor(){
        return dao.retornaDespesaValor();
    }
    public int retornaDespesaIndex(){
        return dao.retornaDespesaIndex();
    }
    public String retornaDespesasituacao(int id){
        return dao.retornaDespesasituacao(id);
    }
    
    public int buscaDespesaVezesP(int id){
        return dao.buscaDespesaVezesPagar(id);
    }
    
    public double buscaDespesaValorP(int id){
        return dao.buscaDespesaValorPagar(id);
    }
    
    public int buscaDespesaVezes(int id){
        return dao.buscaDespesaVezes(id);
    }
    
    public double buscaDespesaValor(int id){
        return dao.buscaDespesaValor(id);
    }
    
    public Calendar buscaDataVencimento(int id){
        return dao.buscaDespesaVencimento(id);
    }
    
    public void destroy(Despesa despesa) throws NonexistentEntityException{
        Component rootPane = null;
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir a despesa?", "Excluir", JOptionPane.YES_NO_OPTION);
        
        if (resposta == JOptionPane.YES_OPTION) {
            if(despesa.getParcelas() == despesa.getParcelasPagar()){
                dao.destroy(despesa.getId());
                ContaPagarView.index--;
                JOptionPane.showMessageDialog(rootPane, "Conta excluida com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE, null);
            }else{
                JOptionPane.showMessageDialog(null, "Não é possivel excluir esta conta, pois a mesma possui parcela(s) pagas!", "Aviso", JOptionPane.ERROR_MESSAGE);
            }
            
        }
    }
    
    public List<Despesa> contaPagarFiltroDescricao(String descricao) {
        despesas.clear();
        descricao+="%";
        
        return dao.contaPagarFiltroDescricao(descricao.toUpperCase());
    }
    
    public void relatorioContaPagar(String situacao,String dInicio, String dFinal,String descricao,int id){
        Component rootPane = null;
        try{
            dao.relatorioContaPagar(situacao,dInicio,dFinal,descricao,id);
        }catch (Exception ex) {
            Logger.getLogger(OrcamentoController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
