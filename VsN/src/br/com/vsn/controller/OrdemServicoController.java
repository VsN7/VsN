package br.com.vsn.controller;

import br.com.vsn.dao.OrdemServicoDAO;
import br.com.vsn.dao.exceptions.NonexistentEntityException;
import br.com.vsn.model.Orcamento;
import br.com.vsn.model.OrdemServico;
import br.com.vsn.model.Usuario;
import br.com.vsn.view.OrcamentoView;
import br.com.vsn.view.OrdemServicoView;
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
public class OrdemServicoController {
    private final OrdemServicoDAO dao;
    private OrdemServico ordemServico;
    private List<OrdemServico> ordemServicos;
    static int id;
    static String login;

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }
    
     public void editOrdemServico(int id,String cliente,String cpf, String veiculo, String modelo, String placa,String servico, String atendente, Date cInicio, Date cPrevisao, double valor, String situacao, String observacoes) throws Exception {
         
         
         
         Component rootPane = null;
         Calendar caInicio = Calendar.getInstance();
         Calendar cFinal = Calendar.getInstance();
         caInicio.setTime(cInicio);
         cFinal.setTime(cPrevisao);
         OrdemServico ordemServico = new OrdemServico();
         UsuarioController us = new UsuarioController();
         Usuario usuario = new Usuario();
         usuario.setId(us.getId());
         
         if(veiculo.equals("Selecionar")){
            ordemServico=null;
            JOptionPane.showMessageDialog(null, "Verifique se o campo Veículo está preenchido", "Aviso", JOptionPane.ERROR_MESSAGE);
        }
         
         ordemServico.setId(id);
         ordemServico.setCliente(cliente);
         ordemServico.setCpf(cpf);
         ordemServico.setVeiculo(veiculo);
         ordemServico.setModelo(modelo);
         ordemServico.setPlaca(placa);
         ordemServico.setServico(servico);
         ordemServico.setAtendente(atendente);
         ordemServico.setDataInicio(caInicio);
         ordemServico.setPrevisaoEntrega(cFinal);
         ordemServico.setValor(valor);
         ordemServico.setSituacao(situacao);
         ordemServico.setObservacoes(observacoes);
         ordemServico.setUsuario(usuario);
         dao.edit(ordemServico);
        JOptionPane.showMessageDialog(rootPane, "Alteração realizada com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE, null);
        
     }

    public OrdemServicoController() {
        ordemServico = new OrdemServico();
        dao = new OrdemServicoDAO();
        ordemServicos = ObservableCollections.observableList(new ArrayList<>());
        pesquisar();
    }
    
    private void pesquisar(){
        ordemServicos.clear();
        ordemServicos.addAll(dao.findOrdemServicoEntities());
    }
    
    public List<OrdemServico> pesquisarUnico(int id) {
        ordemServicos.clear();
        return dao.ordemServicoUnico(id);
    }
    
    public void salvar() throws NoSuchAlgorithmException{
        Component rootPane = null;
        UsuarioController uc = new UsuarioController();
        Usuario usuario = new Usuario();
        usuario.setId(uc.getId());
        ordemServico.setUsuario(usuario);
        dao.create(ordemServico);
         
        JOptionPane.showMessageDialog(rootPane, "Cadastro realizado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE, null);
        
        ordemServico = new OrdemServico();
        pesquisar();
    }
    
    
        public void salvarOrdemServico(int idOrcamento,String cliente,String cpf, String veiculo, String modelo,String placa,String servico,String atendente,Date dtInicio, Date pvEntrega, double valor, String situacao,String observacoes) {
        
        if(veiculo.equals("Selecionar")){
            ordemServico=null;
            JOptionPane.showMessageDialog(null, "Verifique se o campo Veículo está preenchido", "Aviso", JOptionPane.ERROR_MESSAGE);
        }
            
        Component rootPane = null;
        Calendar caInicio = Calendar.getInstance();
        Calendar cFinal = Calendar.getInstance();
        caInicio.setTime(dtInicio);
        cFinal.setTime(pvEntrega);
        
        ordemServico.setCliente(cliente);
        ordemServico.setCpf(cpf);
        ordemServico.setVeiculo(veiculo);
        ordemServico.setModelo(modelo);
        ordemServico.setPlaca(placa);
        ordemServico.setServico(servico);
        ordemServico.setAtendente(atendente);
        ordemServico.setDataInicio(caInicio);
        ordemServico.setPrevisaoEntrega(cFinal);
        ordemServico.setValor(valor);
        situacao = "ABERTO";
        ordemServico.setSituacao(situacao);
        ordemServico.setObservacoes(observacoes);
        
        UsuarioController uc = new UsuarioController();
        Usuario usuario = new Usuario();
        usuario.setId(uc.getId());
        ordemServico.setUsuario(usuario);
        
        Orcamento o = new Orcamento();
        o.setId(idOrcamento);
        ordemServico.setOrcamento_id(idOrcamento);
        
     
        
        dao.create(ordemServico);
        
        ordemServico = new OrdemServico();
        pesquisar();
        if(idOrcamento == 0)
            JOptionPane.showMessageDialog(rootPane, "Cadastro realizado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE, null);
        else
            JOptionPane.showMessageDialog(rootPane, "Ordem de Serviço gerada com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE, null);
        pesquisar();
    }
    
    public void destroy(int id, int idOrcamento) throws NonexistentEntityException, Exception{
        Component rootPane = null;
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o orçamento?", "Excluir", JOptionPane.YES_NO_OPTION);
        
        
        if (resposta == JOptionPane.YES_OPTION) {
            if(idOrcamento!=0){
                OrcamentoController.conta = 1;
                OrcamentoController oc = new OrcamentoController();
                Orcamento orcamento = new Orcamento();
                orcamento = oc.pesquisarUnico(idOrcamento).get(0);
                orcamento.setSituacao("ABERTO");
                orcamento.setOrdemServico_id(0);
                oc.editOrcamento(idOrcamento,orcamento);
            }
            dao.destroy(id);
            OrdemServicoView.index--;
            JOptionPane.showMessageDialog(rootPane, "Exclusão realizada com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE, null);
        
        }
    }
    
    
    

    public void setOrdemServico(OrdemServico ordemServico) {
        this.ordemServico = ordemServico;
    }

    public OrdemServico getOrdemServico() {
        return ordemServico;
    }
    
    public void setOrdemServicos(List<OrdemServico> ordemServicos) {
        this.ordemServicos = ordemServicos;
    }

    public List<OrdemServico> getOrdemServicos() {
        return ordemServicos;
    }
    public void cancelar(){
        ordemServico = new OrdemServico();
    }
    
    public void relatorioOrdemServicosGeral(int id){
        dao.relatorioOrdemServicosGeral(id);
    }
    
    public void relatorioOrdemServicoAll(){
        dao.relatorioOrdemServicosAll();
    }
    
    public void relatorioOrdemServicoData(int combobox,String dInicio, String dFinal){
        Component rootPane = null;
        try{
            dao.relatorioOrdemServicoData(combobox,dInicio,dFinal);
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "Campos Invalidos", "Aviso", JOptionPane.ERROR_MESSAGE, null);
        }
    }
    
    public void editSituacao(int index, Calendar c, String situacao) throws Exception{
        Component rootPane = null;
        OrdemServico ordemServico = new OrdemServico();
        UsuarioController us = new UsuarioController();
        Usuario usuario = new Usuario();
        usuario.setId(us.getId());
        getOrdemServicos().get(index).setDataFinalizacao(c);
        getOrdemServicos().get(index).setSituacao(situacao);
        dao.edit(getOrdemServicos().get(index));
        if(getOrdemServicos().get(index).getSituacao().equals("ABERTO")){
            
            JOptionPane.showMessageDialog(rootPane, "Orçamento reaberto com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE, null);
        
        }else{
            
            JOptionPane.showMessageDialog(rootPane, "Orçamento Finalizado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE, null);
        
        }
    }
    
    public void relatorioSituacao(int comboBox){
        dao.relatorioOrdemServicoSituacao(comboBox);
    }
    
}