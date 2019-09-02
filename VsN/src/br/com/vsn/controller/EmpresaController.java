package br.com.vsn.controller;

import br.com.vsn.dao.EmpresaDAO;
import br.com.vsn.dao.exceptions.NonexistentEntityException;
import br.com.vsn.model.Empresa;
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
public class EmpresaController {
    
        private EmpresaDAO dao;
    private List<Empresa> empresas;
    private Empresa empresa;
    
    public EmpresaController() {
        novo();
        dao = new EmpresaDAO();
        empresas = ObservableCollections.observableList(new ArrayList<>());
        pesquisar();
    }
    public EmpresaController(int i){
        novo();
        dao = new EmpresaDAO();
        empresas = ObservableCollections.observableList(new ArrayList<>());
    }
    public void pesquisar() {
        empresas.clear();
        empresas.addAll(dao.empresaFindAll());
    }
    
    
    public List<Empresa> pesquisarUnico(int id) {
        empresas.clear();
        return dao.empresaUnico(id);
    }

    public void novo() {
        empresa = new Empresa();
        
        setEmpresa(empresa);
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public void salvarEmpresa(String razaoSocial, String nomeFantasia, String icms, String cnpj, String inscricaoEstadual, String longradouro, int numero, String bairro, String cidade, String estado, String cep, String telefone, String email) {
        
        Component rootPane = null;
        empresa.setRazaoSocial(razaoSocial);
        empresa.setNomeFantasia(nomeFantasia);
        empresa.setContribuinteIcms(icms);
        empresa.setCnpj(cnpj);
        empresa.setInscricaoEstadual(inscricaoEstadual);
        empresa.setLongradouro(longradouro);
        empresa.setNumero(numero);
        empresa.setBairro(bairro);
        empresa.setCidade(cidade);
        empresa.setEstado(estado);
        empresa.setCep(cep);
        empresa.setTelefone(telefone);
        empresa.setEmail(email);
        empresa.setSituacao("ATIVO");
        
        dao.create(empresa);
        
        JOptionPane.showMessageDialog(rootPane, "Cadastro realizado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE, null);
        
        pesquisar();
        novo();
    }

    public void editEmpresa(int id,String razaoSocial, String nomeFantasia, String icms, String cnpj, String inscricaoEstadual, String longradouro, int numero, String bairro, String cidade, String estado, String cep, String telefone, String email, String situacao) throws Exception {
        
        Component rootPane = null;
        Empresa empresa = new Empresa();
      
        empresa.setId(id);
        empresa.setRazaoSocial(razaoSocial);
        empresa.setNomeFantasia(nomeFantasia);
        empresa.setContribuinteIcms(icms);
        empresa.setCnpj(cnpj);
        empresa.setInscricaoEstadual(inscricaoEstadual);
        empresa.setLongradouro(longradouro);
        empresa.setNumero(numero);
        empresa.setBairro(bairro);
        empresa.setCidade(cidade);
        empresa.setEstado(estado);
        empresa.setCep(cep);
        empresa.setTelefone(telefone);
        empresa.setEmail(email);
        empresa.setSituacao(situacao);
        dao.edit(empresa);
        JOptionPane.showMessageDialog(rootPane, "Alteração realizada com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE, null);
        
     }
    
    public List<Empresa> getEmpresas() {
        return empresas;
    }

    public void setEmpresas(List<Empresa> empresas) {
        this.empresas = empresas;
    }
    
    public void destroy(int id) throws NonexistentEntityException{
        Component rootPane = null;
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir a despesa?", "Excluir", JOptionPane.YES_NO_OPTION);
        
        if (resposta == JOptionPane.YES_OPTION) {
            dao.destroy(id);
        }
    }
    
    ////      PESQUISAS     /////
    
    public List<Empresa> empresaUnico( int id){
        return dao.empresaUnico(id);
    }
  
    
}
