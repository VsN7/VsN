package br.com.vsn.controller;

import br.com.vsn.dao.OrcamentoDAO;
import br.com.vsn.dao.exceptions.NonexistentEntityException;
import br.com.vsn.model.Orcamento;
import br.com.vsn.model.Usuario;
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
public class OrcamentoController {
    private final OrcamentoDAO dao;
    private Orcamento orcamento;
    private List<Orcamento> orcamentos;
    static int id;
    static String login;

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }
    
     public void editOrcamento(int id,String cliente,String cpf, String veiculo, String modelo, String placa,String servico, String atendente, Date cInicio, Date cPrevisao, double valor, String situacao, String observacoes) throws Exception {
         
         
         
         Component rootPane = null;
         Calendar caInicio = Calendar.getInstance();
         Calendar cFinal = Calendar.getInstance();
         caInicio.setTime(cInicio);
         cFinal.setTime(cPrevisao);
         Orcamento orcamento = new Orcamento();
         UsuarioController us = new UsuarioController();
         Usuario usuario = new Usuario();
         usuario.setId(us.getId());
         
         if(veiculo.equals("Selecionar")){
            orcamento=null;
            JOptionPane.showMessageDialog(null, "Verifique se o campo Veículo está preenchido", "Aviso", JOptionPane.ERROR_MESSAGE);
        }
         
         orcamento.setId(id);
         orcamento.setCliente(cliente);
         orcamento.setCpf(cpf);
         orcamento.setVeiculo(veiculo);
         orcamento.setModelo(modelo);
         orcamento.setPlaca(placa);
         orcamento.setServico(servico);
         orcamento.setAtendente(atendente);
         orcamento.setDataInicio(caInicio);
         orcamento.setPrevisaoEntrega(cFinal);
         orcamento.setValor(valor);
         orcamento.setSituacao(situacao);
         orcamento.setObservacoes(observacoes);
         orcamento.setUsuario(usuario);
         dao.edit(orcamento);
        JOptionPane.showMessageDialog(rootPane, "Alteração realizada com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE, null);
        
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
    
    
        public void salvarOrcamento(String cliente,String cpf, String veiculo, String modelo,String placa,String servico,String atendente,Date dtInicio, Date pvEntrega, double valor, String situacao,String observacoes) {
        
        if(veiculo.equals("Selecionar")){
            orcamento=null;
            JOptionPane.showMessageDialog(null, "Verifique se o campo Veículo está preenchido", "Aviso", JOptionPane.ERROR_MESSAGE);
        }
            
        Component rootPane = null;
        Calendar caInicio = Calendar.getInstance();
        Calendar cFinal = Calendar.getInstance();
        caInicio.setTime(dtInicio);
        cFinal.setTime(pvEntrega);
        
        orcamento.setCliente(cliente);
        orcamento.setCpf(cpf);
        orcamento.setVeiculo(veiculo);
        orcamento.setModelo(modelo);
        orcamento.setPlaca(placa);
        orcamento.setServico(servico);
        atendente = "teste";
        orcamento.setAtendente(atendente);
        orcamento.setDataInicio(caInicio);
        orcamento.setPrevisaoEntrega(cFinal);
        orcamento.setValor(valor);
        situacao = "ABERTO";
        orcamento.setSituacao(situacao);
        orcamento.setObservacoes(observacoes);
        
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
    
    public void relatorioOrcamentoAll(){
        dao.relatorioOrcamentosAll();
    }
    
    public void relatorioOrcamentoData(int combobox,String dInicio, String dFinal){
        Component rootPane = null;
        try{
            dao.relatorioOrcamentoData(combobox,dInicio,dFinal);
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "Campos Invalidos", "Aviso", JOptionPane.ERROR_MESSAGE, null);
        }
    }
    
    public void editSituacao(int index, Calendar c, String situacao) throws Exception{
        Component rootPane = null;
        Orcamento orcamento = new Orcamento();
        UsuarioController us = new UsuarioController();
        Usuario usuario = new Usuario();
        usuario.setId(us.getId());
        getOrcamentos().get(index).setDataFinalizacao(c);
        getOrcamentos().get(index).setSituacao(situacao);
        dao.edit(getOrcamentos().get(index));
        if(getOrcamentos().get(index).getSituacao().equals("ABERTO")){
            
            JOptionPane.showMessageDialog(rootPane, "Orçamento reaberto com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE, null);
        
        }else{
            
            JOptionPane.showMessageDialog(rootPane, "Orçamento Finalizado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE, null);
        
        }
    }
    
    public void relatorioSituacao(int comboBox){
        dao.relatorioOrcamentoSituacao(comboBox);
    }
    
}
