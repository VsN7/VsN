package br.com.vsn.controller;

import br.com.vsn.dao.FornecedorDAO;
import br.com.vsn.dao.exceptions.NonexistentEntityException;
import br.com.vsn.model.Fornecedor;
import java.awt.Component;
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
public class FornecedorController {
    
        private FornecedorDAO dao;
    private List<Fornecedor> fornecedores;
    private Fornecedor fornecedor;
    
    public FornecedorController() {
        novo();
        dao = new FornecedorDAO();
        fornecedores = ObservableCollections.observableList(new ArrayList<>());
        pesquisar();
    }
    public FornecedorController(int i){
        novo();
        dao = new FornecedorDAO();
        fornecedores = ObservableCollections.observableList(new ArrayList<>());
    }
    public void pesquisar() {
        fornecedores.clear();
        fornecedores.addAll(dao.fornecedorFindAll());
    }
    
    
    public List<Fornecedor> pesquisarUnico(int id) {
        fornecedores.clear();
        return dao.fornecedorUnico(id);
    }

    public void novo() {
        fornecedor = new Fornecedor();
        
        setFornecedor(fornecedor);
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public void salvarFornecedor(String razaoSocial, String nomeFantasia, String icms, String cnpj, String inscricaoEstadual, String longradouro, int numero, String bairro, String cidade, String estado, String cep, String telefone, String email) {
        
        if(icms.equals("Selecionar")||estado.equals("Selecionar")){
            fornecedor=null;
            JOptionPane.showMessageDialog(null, "Verifique se o campo Sexo ou/e o campo Estado está/estão preenchidos", "Aviso", JOptionPane.ERROR_MESSAGE);
        }
        
        Component rootPane = null;
        fornecedor.setRazaoSocial(razaoSocial);
        fornecedor.setNomeFantasia(nomeFantasia);
        fornecedor.setContribuinteIcms(icms);
        fornecedor.setCnpj(cnpj);
        fornecedor.setInscricaoEstadual(inscricaoEstadual);
        fornecedor.setLongradouro(longradouro);
        fornecedor.setNumero(numero);
        fornecedor.setBairro(bairro);
        fornecedor.setCidade(cidade);
        fornecedor.setEstado(estado);
        fornecedor.setCep(cep);
        fornecedor.setTelefone(telefone);
        fornecedor.setEmail(email);
        fornecedor.setSituacao("ATIVO");
        
        dao.create(fornecedor);
        
        JOptionPane.showMessageDialog(rootPane, "Cadastro realizado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE, null);
        
        pesquisar();
        novo();
    }

    public void editFornecedor(int id,String razaoSocial, String nomeFantasia, String icms, String cnpj, String inscricaoEstadual, String longradouro, int numero, String bairro, String cidade, String estado, String cep, String telefone, String email, String situacao) throws Exception {
        
        Component rootPane = null;
        Fornecedor fornecedor = new Fornecedor();
        
        if(icms.equals("Selecionar")||estado.equals("Selecionar")){
            fornecedor=null;
            JOptionPane.showMessageDialog(null, "Verifique se o campo Sexo ou/e o campo Estado está/estão preenchidos", "Aviso", JOptionPane.ERROR_MESSAGE);
        }
        
        fornecedor.setId(id);
        fornecedor.setRazaoSocial(razaoSocial);
        fornecedor.setNomeFantasia(nomeFantasia);
        fornecedor.setContribuinteIcms(icms);
        fornecedor.setCnpj(cnpj);
        fornecedor.setInscricaoEstadual(inscricaoEstadual);
        fornecedor.setLongradouro(longradouro);
        fornecedor.setNumero(numero);
        fornecedor.setBairro(bairro);
        fornecedor.setCidade(cidade);
        fornecedor.setEstado(estado);
        fornecedor.setCep(cep);
        fornecedor.setTelefone(telefone);
        fornecedor.setEmail(email);
        fornecedor.setSituacao(situacao);
        dao.edit(fornecedor);
        JOptionPane.showMessageDialog(rootPane, "Alteração realizada com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE, null);
        
     }
    
    public List<Fornecedor> getFornecedores() {
        return fornecedores;
    }

    public void setFornecedores(List<Fornecedor> fornecedores) {
        this.fornecedores = fornecedores;
    }
    
    public void destroy(int id) throws NonexistentEntityException{
        Component rootPane = null;
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir a despesa?", "Excluir", JOptionPane.YES_NO_OPTION);
        
        if (resposta == JOptionPane.YES_OPTION) {
            dao.destroy(id);
        }
    }
    
    ////      PESQUISAS     /////
    
    public List<Fornecedor> fornecedorUnico( int id){
        return dao.fornecedorUnico(id);
    }
  
    
}
