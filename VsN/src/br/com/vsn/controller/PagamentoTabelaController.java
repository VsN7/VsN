package br.com.vsn.controller;

import br.com.vsn.dao.PagamentoTabelaDAO;
import br.com.vsn.dao.exceptions.NonexistentEntityException;
import br.com.vsn.model.PagamentoTabela;
import br.com.vsn.model.Usuario;
import br.com.vsn.view.PagamentoOsView;
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
public class PagamentoTabelaController {
    private final PagamentoTabelaDAO dao;
    private PagamentoTabela pagamentoTabela;
    private List<PagamentoTabela> pagamentoTabelas;
    static int id;
    static String login;
    public static int conta=0;

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }
    
     public void editPagamentoTabela(int id,PagamentoTabela pagamentoTabela) throws Exception {
        
             
     }

    public PagamentoTabelaController() {
        pagamentoTabela = new PagamentoTabela();
        dao = new PagamentoTabelaDAO();
        pagamentoTabelas = ObservableCollections.observableList(new ArrayList<>());
        pesquisar();
    }
    
    private void pesquisar(){
        pagamentoTabelas.clear();
        pagamentoTabelas.addAll(dao.findPagamentoTabelaEntities());
    }
    
    public List<PagamentoTabela> pesquisarUnico(int id) {
        pagamentoTabelas.clear();
        return dao.pagamentoTabelaUnico(id);
    }
    
    
        public int retornaOSId(int id){
            return dao.retornaOSId(id);
        }
        
        public void salvarPagamentoTabela(PagamentoTabela pagamentoTabela) {
            Component rootPane = null;
            //System.out.println("id: "+pagamentoTabela.getId()+" id_p: "+pagamentoTabela.getPagamento_id()+" valorp: "+pagamentoTabela.getValor()+" finalizador: "+pagamentoTabela.getFinalizador()+" vezes: "+pagamentoTabela.getParcelas());
            dao.create(pagamentoTabela);
            pagamentoTabela = new PagamentoTabela();
            JOptionPane.showMessageDialog(rootPane, "Pagamento adicionado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE, null);
            pesquisar();
        }
    
    public void destroy(int id) throws NonexistentEntityException{
        Component rootPane = null;
        
        if(PagamentoOsView.validaDestroy == 1){
            dao.destroy(id);
        }else if(PagamentoOsView.validaDestroy == 2){
            
            int resp = JOptionPane.showConfirmDialog(null, "Deseja realmente remover essa forma de pagamento?", "Excluir", JOptionPane.YES_NO_OPTION);
        
                if (resp == JOptionPane.YES_OPTION) {
                    
                    dao.destroy(id);
                    JOptionPane.showMessageDialog(rootPane, "Forma de pagamento removida com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE, null);                
                    pesquisar();
                    PagamentoOsView.validaDestroy = 0;
                }
        }else{
            int resp = JOptionPane.showConfirmDialog(null, "Deseja realmente reabrir o pagamento?", "Reabertura", JOptionPane.YES_NO_OPTION);
        
                if (resp == JOptionPane.YES_OPTION) {
                    dao.destroy(id);
                    JOptionPane.showMessageDialog(rootPane, "O pagamento foi reaberto com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE, null);                
                    pesquisar();
                }
        }
        
    }
    
    
    

    public void setPagamentoTabela(PagamentoTabela pagamentoTabela) {
        this.pagamentoTabela = pagamentoTabela;
    }

    public PagamentoTabela getPagamentoTabela() {
        return pagamentoTabela;
    }
    
    public void setPagamentoTabelas(List<PagamentoTabela> pagamentoTabelas) {
        this.pagamentoTabelas = pagamentoTabelas;
    }

    public List<PagamentoTabela> getPagamentoTabelas() {
        return pagamentoTabelas;
    }
    public void cancelar(){
        pagamentoTabela = new PagamentoTabela();
    }
}
