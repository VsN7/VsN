package br.com.vsn.controller;

import br.com.vsn.dao.FuncionarioDAO;
import br.com.vsn.dao.UsuarioDAO;
import br.com.vsn.dao.exceptions.NonexistentEntityException;
import br.com.vsn.model.Funcionario;
import br.com.vsn.model.Usuario;
import br.com.vsn.util.CriptografiaUtil;
import br.com.vsn.view.InformarSenhaView;
import java.awt.Component;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    public static Usuario user = new Usuario();
    static String senhaF;
    static String palavra;
    public static int validador = 0;
    
    public static int estouraErroNulo = 0;
    
    public FuncionarioController() {
        novo();
        dao = new FuncionarioDAO();
        funcionarios = ObservableCollections.observableList(new ArrayList<>());
        pesquisar();
    }
    
    public FuncionarioController(int id) {
        novo();
        dao = new FuncionarioDAO();
        funcionarios = ObservableCollections.observableList(new ArrayList<>());
        pesquisarUnico(id);
    }
    
    public void pesquisar() {
        funcionarios.clear();
        funcionarios.addAll(dao.funcionarioFindAll());
    }
    
    
    
    
    public List<Funcionario> pesquisarUnico(int id) {
        funcionarios.clear();
        return dao.funcionarioUnico(id);
    }

    public List<Funcionario> pesquisarFiltroNome(String nome) {
        funcionarios.clear();
        nome+="%";
        
        return dao.funcionarioFiltroNome(nome.toUpperCase());
    }
    
    public List<Funcionario> pesquisarFiltroCpf(String cpf) {
        funcionarios.clear();
        cpf+="%";
        return dao.funcionarioFiltroCpf(cpf);
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

    public void salvarFuncionario(String nome, String cpf, String sexo, Date dtNascimento, String caminhoImg, String login, String funcao,String telefone, String email,String senha, String palavraSeguranca) {
        int usuario_id = 0;
        UsuarioController uc = new UsuarioController();
        try{
            if(funcao.isEmpty()){
                funcao = null;
            }
            if(nome.isEmpty()){
                nome = null;
            }
        }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Existem campos nulos", "Aviso", JOptionPane.ERROR_MESSAGE);
        }
        Calendar c = Calendar.getInstance();
        c.setTime(dtNascimento);
        Component rootPane = null;
        funcionario.setUsuario_id(usuario_id);
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
        Usuario usuario = new Usuario();
        usuario.setLogin(login);
        UsuarioDAO usDao = new UsuarioDAO();
        if(!login.equals("Sem Acesso ao Sistema")){
            if(usDao.retornaIdFunc(login) == 0 && dao.retornaCpf(cpf) == 0 && nome != null && funcao != null){
                try {
                    uc.salvar(login, senha,cpf, palavraSeguranca.toUpperCase());
                    uc = new UsuarioController();
                    usuario_id = uc.getUsuarios().get(uc.getUsuarios().size()-1).getId();
                    funcionario.setUsuario_id(usuario_id);
                    try{
                        dao.create(funcionario);
                        estouraErroNulo = 0;
                        JOptionPane.showMessageDialog(rootPane, "Cadastro realizado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE, null);
                        pesquisar();
                        novo();
                    } catch (Exception e) {
                        estouraErroNulo = 1;
                        JOptionPane.showMessageDialog(null, "O campo CPF deve ser unico, verifique também se não há campos importantes em branco", "Aviso", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Senha não informada", "Aviso", JOptionPane.ERROR_MESSAGE);
                    estouraErroNulo = 1;
                }
            }else{
                if(usDao.retornaIdFunc(login) == 0){
                    JOptionPane.showMessageDialog(null, "O campo CPF deve ser unico, verifique também se não há campos importantes em branco", "Aviso", JOptionPane.ERROR_MESSAGE);
                    estouraErroNulo = 1;
                }else{
                    estouraErroNulo = 1;
                    JOptionPane.showMessageDialog(null, "Login já existente", "Aviso", JOptionPane.ERROR_MESSAGE);
                }
            }
        }else{
            try{
                dao.create(funcionario);
                estouraErroNulo = 0;
                JOptionPane.showMessageDialog(rootPane, "Cadastro realizado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE, null);
                pesquisar();
                novo();
            } catch (Exception e) {
                 estouraErroNulo = 1;
                JOptionPane.showMessageDialog(null, "O campo CPF deve ser unico, verifique também se não há campos importantes em branco", "Aviso", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public int retornaCpf(String cpf){
        return dao.retornaCpf(cpf);
    }
    private void encriptografarSenha(String senha) throws Exception {
        senhaF = CriptografiaUtil.encriptografarSenha(senha);
    }
    private void encriptografarPalavra(String pala) throws Exception {
        palavra = CriptografiaUtil.encriptografarSenha(pala).toUpperCase();
    }
    
    public void editFuncionario(int usuario_id,int id,String nome, String cpf, String sexo, Date dtNascimento, String caminhoImg,String funcao, String login,String telefone, String email, String situacao,String senha, String palavraSeguranca) throws Exception {
        estouraErroNulo = 0;
        Calendar c = Calendar.getInstance();
        c.setTime(dtNascimento);
        Component rootPane = null;
        Funcionario funcionario = new Funcionario();
        
        UsuarioController uc = new UsuarioController();
        if(funcao.isEmpty()){
            funcao = null;
        }
        if(nome.isEmpty()){
            nome = null;
        }
        
        
        Usuario usuario = new Usuario();
        usuario.setLogin(login);
        UsuarioDAO usDao = new UsuarioDAO();
        funcionario.setId(id);
        funcionario.setNome(nome);
        funcionario.setCpf(cpf);
        funcionario.setSexo(sexo);
        funcionario.setDataNascimento(c);
        funcionario.setCaminhoImg(caminhoImg);
        funcionario.setLogin(login);
        funcionario.setFuncao(funcao);
        funcionario.setTelefone(telefone);
        funcionario.setEmail(email);
        funcionario.setSituacao(situacao);
        if(!login.equals("Sem Acesso ao Sistema")){
                try {
                    funcionario.setUsuario_id(usuario_id);
                    Usuario us = new Usuario();
                    us.setId(usuario_id);
                    us.setCpf(cpf);
                    us.setLogin(login);
                    palavra = palavraSeguranca.toUpperCase();
                    
                    if(!InformarSenhaView.inputPalavraSeguranca.getText().isEmpty())
                        this.encriptografarPalavra(palavraSeguranca.toUpperCase());
                    us.setPalavraSeguranca(palavra);
                    senhaF = senha;
                    if(!InformarSenhaView.inputSenha.getText().isEmpty())
                        this.encriptografarSenha(senha);
                    us.setSenha(senhaF);
                    uc.editUsuario(us);
                    uc = new UsuarioController();
                    try{
                        if(estouraErroNulo == 0){
                            dao.edit(funcionario);
                            estouraErroNulo = 0;
                            JOptionPane.showMessageDialog(rootPane, "Alteração realizada com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE, null);
                            pesquisar();
                            novo();
                        }
                    } catch (Exception e) {
                        estouraErroNulo = 1;
                        JOptionPane.showMessageDialog(null, "O campo CPF e Login devem ser unicos, verifique também se não há campos importantes em branco", "Aviso", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception ex) {
                    estouraErroNulo = 1;
                    JOptionPane.showMessageDialog(null, "O campo CPF deve ser unico, verifique também se não há campos importantes em branco", "Aviso", JOptionPane.ERROR_MESSAGE);
                }
        }else{
            try{
                dao.edit(funcionario);
                estouraErroNulo = 0;
                JOptionPane.showMessageDialog(rootPane, "Alteração realizada com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE, null);
                pesquisar();
                novo();
            } catch (Exception e) {
                 estouraErroNulo = 1;
                JOptionPane.showMessageDialog(null, "O campo CPF deve ser unico, verifique também se não há campos importantes em branco", "Aviso", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        
     }
    
    public void inativarFuncionario(int usuario_id,int id,String nome, String cpf, String sexo, Date dtNascimento, String caminhoImg,String funcao, String login,String telefone, String email, String situacao,String senha, String palavraSeguranca) throws Exception {
        estouraErroNulo = 0;
        Calendar c = Calendar.getInstance();
        c.setTime(dtNascimento);
        Component rootPane = null;
        Funcionario funcionario = new Funcionario();
        
        UsuarioController uc = new UsuarioController();
        if(funcao.isEmpty()){
            funcao = null;
        }
        if(nome.isEmpty()){
            nome = null;
        }
        
        
        Usuario usuario = new Usuario();
        usuario.setLogin(login);
        UsuarioDAO usDao = new UsuarioDAO();
        funcionario.setId(id);
        funcionario.setNome(nome);
        funcionario.setCpf(cpf);
        funcionario.setSexo(sexo);
        funcionario.setDataNascimento(c);
        funcionario.setCaminhoImg(caminhoImg);
        funcionario.setLogin(login);
        funcionario.setFuncao(funcao);
        funcionario.setTelefone(telefone);
        funcionario.setEmail(email);
        funcionario.setSituacao(situacao);
        
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente inativar o funcionario?", "Inativar", JOptionPane.YES_NO_OPTION);
        
        if (resposta == JOptionPane.YES_OPTION) {
            dao.edit(funcionario);
            if(validador == 0){
                UsuarioController.validador = 1;
                uc.destroy(uc.pesquisarUnico(cpf).get(0).getId());
            }else{
                validador = 0;
            }
            JOptionPane.showMessageDialog(rootPane, "Funcionario inativado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE, null);
        }
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
    
    public void relatorioFuncionariosAniversariantes(int mes){
        dao.relatorioFuncionariosAniversariantes(mes);
    }
}
