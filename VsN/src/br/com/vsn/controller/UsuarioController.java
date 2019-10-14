
package br.com.vsn.controller;


import static br.com.vsn.controller.FuncionarioController.estouraErroNulo;
import br.com.vsn.dao.FuncionarioDAO;
import br.com.vsn.dao.UsuarioDAO;
import br.com.vsn.model.Funcionario;
import br.com.vsn.model.Usuario;
import br.com.vsn.util.CriptografiaUtil;
import java.awt.Component;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.jdesktop.observablecollections.ObservableCollections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vitor
 */
public class UsuarioController {
    private final UsuarioDAO dao;
    private Usuario usuario;
    private List<Usuario> usuarios;
//    private SessaoUsuario sessao;
    static int id;
    public static int validador = 0;
    static String login;

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }
    

    public UsuarioController() {
        usuario = new Usuario();
        dao = new UsuarioDAO();
        usuarios = ObservableCollections.observableList(new ArrayList<>());
        pesquisar();
    }
    
    private void pesquisar(){
        usuarios.clear();
        usuarios.addAll(dao.findUsuarioEntities());
    }
    public List<Usuario> pesquisarUnico(String cpf) {
        usuarios.clear();
        return dao.usuarioUnico(cpf);
    }
    
    public List<Usuario> pesquisarUnicoId(int id) {
        usuarios.clear();
        return dao.usuarioUnicoId(id);
    }
    
    public void salvar(String login, String senha,String cpf, String palavraSeguranca) throws Exception{
        encriptografarSenhaUsuario(senha);
        encriptografarPalavraSegurancaUsuario(palavraSeguranca.toUpperCase());
        usuario.setLogin(login);
        usuario.setSenha(usuario.getSenha());
        usuario.setCpf(cpf);
        usuario.setPalavraSeguranca(usuario.getPalavraSeguranca());
        dao.create(usuario);
        usuario = new Usuario();
        pesquisar();
    }
    
    public void editarFuncionario(int id,int id_usuario, String login) throws Exception{
        FuncionarioDAO fd = new FuncionarioDAO();
        Funcionario f = new Funcionario();
        f = fd.funcionarioUnico(id).get(0);
        f.setLogin(login);
        f.setUsuario_id(id_usuario);
        fd.edit(f);
    }
    
    public boolean efetuarLogin(String lg, String senha) throws Exception{
        encriptografarSenhaUsuario(senha);
        usuario.setLogin(lg);
        usuario.setSenha(usuario.getSenha());
        if(dao.efetuarLogin(usuario) != null){
            id = dao.retornaId(usuario);
            lg = usuario.getLogin();
            usuario.setId(id);
            login = lg.toUpperCase();
            return true;
        }
        else return false;
    }
    
    public void editUsuario(Usuario usuario){
        try {
            dao.edit(usuario);
        } catch (Exception ex) {
            FuncionarioController.estouraErroNulo = 1;
            JOptionPane.showMessageDialog(null, "Login ou CPF já existente", "Aviso", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void destroy(int id) throws Exception{
        Component rootPane = null;
        if(validador == 1){
            try{
                ParametroController pc = new ParametroController();
                pc.destroy(pc.pesquisarUnico(id).getId());
            }catch(Exception e){
                
            }
            dao.destroy(id);
            validador = 0 ;
        }else{
            int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o usuario?", "Pergunta", JOptionPane.YES_NO_OPTION);

            if (resposta == JOptionPane.YES_OPTION) {
                try{
                    ParametroController pc = new ParametroController();
                    pc.destroy(pc.pesquisarUnico(id).getId());
                }catch(Exception e){
                            
                }
                FuncionarioController fc = new FuncionarioController();
                Funcionario funcionario = new Funcionario();
                funcionario = fc.pesquisarUnicoIdUsuario(id);
                funcionario.setLogin("Sem Acesso ao Sistema");
                fc.editarLogin(funcionario);
                dao.destroy(id);
                JOptionPane.showMessageDialog(null, "Usuario excluido com sucesso!", "Exclusão", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }
    
    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    private void encriptografarSenhaUsuario(String senha) throws Exception {
        usuario.setSenha(CriptografiaUtil.encriptografarSenha(senha));
    }
    private void encriptografarPalavraSegurancaUsuario(String palavra) throws Exception {
        usuario.setPalavraSeguranca(CriptografiaUtil.encriptografarSenha(palavra).toUpperCase());
    }
    
    public void cancelar(){
        usuario = new Usuario();
    }

    public void relatorioUsuariosGeral(){
        dao.relatorioUsuariosGeral();
    }
    
    
}
