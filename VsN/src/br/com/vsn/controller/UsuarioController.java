
package br.com.vsn.controller;


import br.com.vsn.dao.UsuarioDAO;
import br.com.vsn.model.Usuario;
import br.com.vsn.util.CriptografiaUtil;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
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
    
    public void salvar(String login, String senha, String cpf) throws NoSuchAlgorithmException{
        encriptografarSenhaUsuario(senha);
        usuario.setLogin(login);
        usuario.setSenha(usuario.getSenha());
        usuario.setCpf(cpf);
        dao.create(usuario);
        usuario = new Usuario();
        pesquisar();
    }
    
    public boolean efetuarLogin(String login, String senha) throws NoSuchAlgorithmException{
        encriptografarSenhaUsuario(senha);
        usuario.setLogin(login);
        usuario.setSenha(usuario.getSenha());
        if(dao.efetuarLogin(usuario) != null){
            id = dao.retornaId(usuario);
            login = usuario.getLogin();
            usuario.setId(dao.retornaId(usuario));
            return true;
        }
        else return false;
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

    private void encriptografarSenhaUsuario(String senha) throws NoSuchAlgorithmException {
        usuario.setSenha(CriptografiaUtil.encriptografarSenha(senha));
    }
    
    public void cancelar(){
        usuario = new Usuario();
    }

    public void relatorioUsuariosGeral(){
        dao.relatorioUsuariosGeral();
    }
    
    
}
