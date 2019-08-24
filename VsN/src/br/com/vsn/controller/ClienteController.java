
package br.com.vsn.controller;

import br.com.vsn.dao.ClienteDAO;
import br.com.vsn.dao.exceptions.NonexistentEntityException;
import br.com.vsn.model.Cliente;
import br.com.vsn.view.LoginView;
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
public class ClienteController {
//
    private ClienteDAO dao;
    private List<Cliente> clientes;
    private Cliente cliente;
    
    public ClienteController() {
        novo();
        dao = new ClienteDAO();
        clientes = ObservableCollections.observableList(new ArrayList<>());
        pesquisar();
    }
    public ClienteController(int i){
        novo();
        dao = new ClienteDAO();
        clientes = ObservableCollections.observableList(new ArrayList<>());
    }
    public void pesquisar() {
        clientes.clear();
        clientes.addAll(dao.clienteFindAll());
    }

    public void novo() {
        cliente = new Cliente();
        
        setCliente(cliente);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void salvarCliente(String nome, String cpf, String sexo, Date dtNascimento, String longradouro, int numero, String bairro, String cidade, String estado, String cep, String telefone, String email) {
        
        Calendar c = Calendar.getInstance();
        c.setTime(dtNascimento);
        
        Component rootPane = null;
        cliente.setNome(nome);
        cliente.setCpf(cpf);
        cliente.setSexo(sexo);
        cliente.setDataNascimento(c);
        cliente.setLongradouro(longradouro);
        cliente.setNumero(numero);
        cliente.setBairro(bairro);
        cliente.setCidade(cidade);
        cliente.setEstado(estado);
        cliente.setCep(cep);
        cliente.setTelefone(telefone);
        cliente.setEmail(email);
        cliente.setSituacao("ATIVO");
        
        dao.create(cliente);
        
        JOptionPane.showMessageDialog(rootPane, "Cadastro realizado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE, null);
        
        pesquisar();
        novo();
    }

    public void editCliente(int index,String nome, String cpf, String sexo, Date dtNascimento, String longradouro, int numero, String bairro, String cidade, String estado, String cep, String telefone, String email) throws Exception {
        Calendar c = Calendar.getInstance();
        c.setTime(dtNascimento);
        Component rootPane = null;
        this.getClientes().get(index).setNome(nome);
        this.getClientes().get(index).setCpf(cpf);
        this.getClientes().get(index).setSexo(sexo);
        this.getClientes().get(index).setDataNascimento(c);
        this.getClientes().get(index).setLongradouro(longradouro);
        this.getClientes().get(index).setNumero(numero);
        this.getClientes().get(index).setBairro(bairro);
        this.getClientes().get(index).setCidade(cidade);
        this.getClientes().get(index).setEstado(estado);
        this.getClientes().get(index).setCep(cep);
        this.getClientes().get(index).setTelefone(telefone);
        this.getClientes().get(index).setEmail(email);
        dao.edit(getClientes().get(index));
        JOptionPane.showMessageDialog(rootPane, "Alteração realizada com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE, null);
        
     }
    
    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
    public int primeiroPasso() throws Exception{
        return dao.primeiroPasso();
    }
    
    public void destroy(int id) throws NonexistentEntityException{
        Component rootPane = null;
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir a despesa?", "Excluir", JOptionPane.YES_NO_OPTION);
        
        if (resposta == JOptionPane.YES_OPTION) {
            dao.destroy(id);
        }
    }
    
    ////      PESQUISAS     /////
    
    public List<Cliente> clienteUnico( int id){
        return dao.clienteUnico(id);
    }
    
}
