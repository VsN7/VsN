package br.com.vsn.controller;

import br.com.vsn.dao.PagamentoDAO;
import br.com.vsn.dao.exceptions.NonexistentEntityException;
import br.com.vsn.model.Pagamento;
import br.com.vsn.model.Usuario;
import br.com.vsn.view.OrdemServicoView;
import br.com.vsn.view.PagamentoContasReceberView;
import java.awt.Color;
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
    public static int resp;
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
         if(conta==0 && pagamento.getSituacao().equals("ABERTO")){
                resp = JOptionPane.showConfirmDialog(null, "Deseja realmente reabrir o pagamento?", "Reabertura", JOptionPane.YES_NO_OPTION);
        
                if (resp == JOptionPane.YES_OPTION) {
                    ContaController cct = new ContaController();
                    PagamentoTabelaController ptc = new PagamentoTabelaController();
                    int validaCartao=0;
                    int validaExcluir=0;
                    for(int i =0; i< ptc.getPagamentoTabelas().size();i++){
                        if(ptc.getPagamentoTabelas().get(i).getFinalizador().equals("Cartão Crédito") || (ptc.getPagamentoTabelas().get(i).getFinalizador().equals("Outro") && !ptc.getPagamentoTabelas().get(i).getParcelas().equals("1 vez"))){
                            
                            validaCartao = 1;
                        }
                    }
                        int tamanhoConta = cct.buscaContaIdPagamento(id).size();
                        for(int i = 0; i < tamanhoConta;i++){
                            if(cct.buscaContaIdPagamento(id).get(i).getVezes() != cct.buscaContaIdPagamento(id).get(i).getVezesPagar())
                                validaExcluir = 1;
                            System.out.println("VALIDA EXCLUIR::"+validaExcluir);
                        }
                    if(validaCartao == 1 && validaExcluir == 0){
                        tamanhoConta = cct.buscaContaIdPagamento(id).size();
                        for(int i = 0; i < tamanhoConta;i++){
                            cct = new ContaController();
                            cct.destroyP(cct.buscaContaIdPagamento(id).get(0).getId());
                        }
                        dao.edit(pagamento);    
                        OrdemServicoView.ordemServico.setSituacao("O.S EM PAGAMENTO");
                        OrdemServicoController osc = new OrdemServicoController();
                        osc.editOrdemServico(Integer.parseInt(OrdemServicoView.inputId.getText()), OrdemServicoView.ordemServico);
                        OrdemServicoView.inputSituacao.setText("O.S EM PAGAMENTO");
                        OrdemServicoView.inputSituacao.setForeground(new Color(255,102,51));
                        JOptionPane.showMessageDialog(rootPane, "Pagamento reaberto com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE, null);
                        conta = 0;
                    }else if(validaExcluir == 0){
                        dao.edit(pagamento);    
                        OrdemServicoView.ordemServico.setSituacao("O.S EM PAGAMENTO");
                        OrdemServicoController osc = new OrdemServicoController();
                        osc.editOrdemServico(Integer.parseInt(OrdemServicoView.inputId.getText()), OrdemServicoView.ordemServico);
                        OrdemServicoView.inputSituacao.setText("O.S EM PAGAMENTO");
                        OrdemServicoView.inputSituacao.setForeground(new Color(255,102,51));
                        osc = new OrdemServicoController();
                        JOptionPane.showMessageDialog(rootPane, "Pagamento reaberto com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE, null);
                        conta = 0;
                    }else{
                        JOptionPane.showMessageDialog(rootPane, "Não é possivel reabrir o pagamento, pois existem titulos que já possuem parcelas recebidas!", "Aviso", JOptionPane.ERROR_MESSAGE, null);
                    }
                }
         }  
         else{
            dao.edit(pagamento);
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
        
        JOptionPane.showMessageDialog(rootPane, "Novo pagamento gerado!", "Sucesso", JOptionPane.INFORMATION_MESSAGE, null);

    }
    
    public void destroy(int id) throws NonexistentEntityException{
        Component rootPane = null;
        resp = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o pagamento?", "Excluir", JOptionPane.YES_NO_OPTION);
        
        if (resp == JOptionPane.YES_OPTION) {
            dao.destroy(id);
            JOptionPane.showMessageDialog(rootPane, "Pagamento excluido com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE, null);
        
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
    
    public void relatorioReciboPadrao(int id){
        dao.relatorioReciboPadrao(id);
    }
    public void relatorioReciboManual(){
        dao.relatorioReciboManual();
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
