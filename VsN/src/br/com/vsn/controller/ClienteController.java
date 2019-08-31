
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
    
    
    public List<Cliente> pesquisarUnico(int id) {
        clientes.clear();
        return dao.clienteUnico(id);
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

    public void salvarCliente(String nome, String cpf, String sexo, Date dtNascimento, String caminhoImg, String longradouro, int numero, String bairro, String cidade, String estado, String cep, String telefone, String email) {
        
        Calendar c = Calendar.getInstance();
        c.setTime(dtNascimento);
        
        Component rootPane = null;
        cliente.setNome(nome);
        cliente.setCpf(cpf);
        cliente.setSexo(sexo);
        cliente.setDataNascimento(c);
        cliente.setCaminhoImg(caminhoImg);
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

    public void editCliente(int id,String nome, String cpf, String sexo, Date dtNascimento, String caminhoImg, String longradouro, int numero, String bairro, String cidade, String estado, String cep, String telefone, String email, String situacao) throws Exception {
        Calendar c = Calendar.getInstance();
        c.setTime(dtNascimento);
        Component rootPane = null;
        Cliente cliente = new Cliente();
        
        cliente.setId(id);
        cliente.setNome(nome);
        cliente.setCpf(cpf);
        cliente.setSexo(sexo);
        cliente.setDataNascimento(c);
        cliente.setCaminhoImg(caminhoImg);
        cliente.setLongradouro(longradouro);
        cliente.setNumero(numero);
        cliente.setBairro(bairro);
        cliente.setCidade(cidade);
        cliente.setEstado(estado);
        cliente.setCep(cep);
        cliente.setTelefone(telefone);
        cliente.setEmail(email);
        cliente.setSituacao(situacao);
        dao.edit(cliente);
        JOptionPane.showMessageDialog(rootPane, "Alteração realizada com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE, null);
        
     }
    
    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
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
