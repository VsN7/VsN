package br.com.vsn.controller;

import br.com.vsn.dao.ParametroDAO;
import br.com.vsn.model.Parametro;
import br.com.vsn.model.Usuario;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.jdesktop.observablecollections.ObservableCollections;

/**
 *
 * @author vitor
 */
public class ParametroController {

    private ParametroDAO dao;
    private List<Parametro> parametros;
    private Parametro parametro;
    
    public ParametroController() {
        novo();
        dao = new ParametroDAO();
        parametros = ObservableCollections.observableList(new ArrayList<>());
        pesquisar();
    }
    public ParametroController(int i){
        novo();
        dao = new ParametroDAO();
        parametros = ObservableCollections.observableList(new ArrayList<>());
    }
    public void pesquisar() {
        parametros.clear();
        parametros.addAll(dao.findParametroEntities());
    }

    public void salvar(Parametro parametro) {
        Component rootPane = null;
        UsuarioController uc = new UsuarioController();
        Usuario us = new Usuario();
        us.setLogin(uc.getLogin());
        us.setId(uc.getId());
        parametro.setUsuario(us);
        dao.create(parametro);
        JOptionPane.showMessageDialog(rootPane, "Parâmetros salvos!", "Sucesso", JOptionPane.INFORMATION_MESSAGE, null);
        JOptionPane.showMessageDialog(rootPane, "Reinicie o sistema para aplicar as alterações!", "Sucesso", JOptionPane.INFORMATION_MESSAGE, null);
        pesquisar();
        novo();
    }
    
    public void edit(Parametro parametro) throws Exception {
        Component rootPane = null;
        UsuarioController uc = new UsuarioController();
        Usuario us = new Usuario();
        us.setLogin(uc.getLogin());
        us.setId(uc.getId());
        parametro.setUsuario(us);
        dao.edit(parametro);
        JOptionPane.showMessageDialog(rootPane, "Parâmetros salvos!", "Sucesso", JOptionPane.INFORMATION_MESSAGE, null);
        JOptionPane.showMessageDialog(rootPane, "Reinicie o sistema para aplicar as alterações!", "Sucesso", JOptionPane.INFORMATION_MESSAGE, null);
        pesquisar();
        novo();
    }
    public void novo() {
        parametro = new Parametro();
        setParametro(parametro);
    }
    public Parametro pesquisarUnico(int id) {
        parametros.clear();
        return dao.pesquisarUnico(id);
    }

    public List<Parametro> getParametros() {
        return parametros;
    }

    public void setParametros(List<Parametro> parametros) {
        this.parametros = parametros;
    }

    public Parametro getParametro() {
        return parametro;
    }

    public void setParametro(Parametro parametro) {
        this.parametro = parametro;
    }
    
}
