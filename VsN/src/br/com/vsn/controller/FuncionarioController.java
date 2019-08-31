package br.com.vsn.controller;

import br.com.vsn.dao.FuncionarioDAO;
import br.com.vsn.dao.exceptions.NonexistentEntityException;
import br.com.vsn.model.Funcionario;
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
public class FuncionarioController {
    
    private FuncionarioDAO dao;
    private List<Funcionario> funcionarios;
    private Funcionario funcionario;
    
    public FuncionarioController() {
        novo();
        dao = new FuncionarioDAO();
        funcionarios = ObservableCollections.observableList(new ArrayList<>());
        pesquisar();
    }
    public FuncionarioController(int i){
        novo();
        dao = new FuncionarioDAO();
        funcionarios = ObservableCollections.observableList(new ArrayList<>());
    }
    public void pesquisar() {
        funcionarios.clear();
        funcionarios.addAll(dao.funcionarioFindAll());
    }
    
    
    public List<Funcionario> pesquisarUnico(int id) {
        funcionarios.clear();
        return dao.funcionarioUnico(id);
    }

    public void novo() {
        funcionario = new Funcionario();
        
        setFuncionario(funcionario);
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public void salvarFuncionario(String nome, String cpf, String sexo, Date dtNascimento, String caminhoImg, String login, String funcao,String telefone, String email) {
        
        Calendar c = Calendar.getInstance();
        c.setTime(dtNascimento);
        
        Component rootPane = null;
        funcionario.setNome(nome);
        funcionario.setCpf(cpf);
        funcionario.setSexo(sexo);
        funcionario.setLogin(login);
        funcionario.setFuncao(funcao);
        funcionario.setDataNascimento(c);
        funcionario.setCaminhoImg(caminhoImg);
        funcionario.setTelefone(telefone);
        funcionario.setEmail(email);
        funcionario.setSituacao("ATIVO");
        
        dao.create(funcionario);
        
        JOptionPane.showMessageDialog(rootPane, "Cadastro realizado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE, null);
        
        pesquisar();
        novo();
    }

    public void editFuncionario(int id,String nome, String cpf, String sexo, Date dtNascimento, String caminhoImg, String longradouro, int numero, String bairro, String cidade, String estado, String cep, String telefone, String email, String situacao) throws Exception {
        Calendar c = Calendar.getInstance();
        c.setTime(dtNascimento);
        Component rootPane = null;
        Funcionario funcionario = new Funcionario();
        
        funcionario.setId(id);
        funcionario.setNome(nome);
        funcionario.setCpf(cpf);
        funcionario.setSexo(sexo);
        funcionario.setDataNascimento(c);
        funcionario.setCaminhoImg(caminhoImg);
        funcionario.setTelefone(telefone);
        funcionario.setEmail(email);
        funcionario.setSituacao(situacao);
        dao.edit(funcionario);
        JOptionPane.showMessageDialog(rootPane, "Alteração realizada com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE, null);
        
     }
    
    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
    
    public void destroy(int id) throws NonexistentEntityException{
        Component rootPane = null;
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir a despesa?", "Excluir", JOptionPane.YES_NO_OPTION);
        
        if (resposta == JOptionPane.YES_OPTION) {
            dao.destroy(id);
        }
    }
    
    ////      PESQUISAS     /////
    
    public List<Funcionario> funcionarioUnico( int id){
        return dao.funcionarioUnico(id);
    }
    
}
