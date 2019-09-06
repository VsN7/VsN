
package br.com.vsn.dao;

import br.com.vsn.conectaRelatorio.ConnectionFactory;
import br.com.vsn.controller.PagamentoTabelaController;
import br.com.vsn.controller.UsuarioController;
import br.com.vsn.dao.exceptions.NonexistentEntityException;
import br.com.vsn.model.PagamentoTabela;
import br.com.vsn.view.OrdemServicoView;
import java.awt.Component;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.io.Serializable;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author vitor
 */
public class PagamentoTabelaDAO implements Serializable {
    private static EntityManagerFactory emf;

    public EntityManager getEntityManager() {
        if (emf == null){
            emf = Persistence.
                    createEntityManagerFactory("vsn");
        }
        return emf.createEntityManager();
    }

    public void create(PagamentoTabela pagamentoTabela) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(pagamentoTabela);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(PagamentoTabela pagamentoTabela) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            pagamentoTabela = em.merge(pagamentoTabela);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = pagamentoTabela.getId();
                if (findPagamentoTabela(id) == null) {
                    throw new NonexistentEntityException("The pagamentoTabela with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    public void editSituacao(PagamentoTabela pagamentoTabela) throws NonexistentEntityException{
    
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            pagamentoTabela = em.merge(pagamentoTabela);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = pagamentoTabela.getId();
                if (findPagamentoTabela(id) == null) {
                    throw new NonexistentEntityException("The pagamentoTabela with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            PagamentoTabela pagamentoTabela = new PagamentoTabela();
            try {
                pagamentoTabela = em.getReference(PagamentoTabela.class, id);
                pagamentoTabela.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The pagamentoTabela with id " + id + " no longer exists.", enfe);
            }
            em.remove(pagamentoTabela);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<PagamentoTabela> findPagamentoTabelaEntities() {
        return findPagamentoTabelaEntities(true, -1, -1);
    }

    public List<PagamentoTabela> findPagamentoTabelaEntities(int maxResults, int firstResult) {
        return findPagamentoTabelaEntities(false, maxResults, firstResult);
    }

    private List<PagamentoTabela> findPagamentoTabelaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(PagamentoTabela.class));
            Query q = em.createNamedQuery("PagamentoTabela.selecionar").setParameter("id",Integer.parseInt(OrdemServicoView.inputId.getText()));
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public List<PagamentoTabela> pagamentoTabelaUnico(int id) {
        List<PagamentoTabela> pagamentoTabelas = null;
        EntityManager em = getEntityManager();
        UsuarioController uc = new UsuarioController();
        try{
           pagamentoTabelas = em.createNamedQuery("PagamentoTabela.buscaTodosPagamentosVinculados").setParameter("id",id)
                                                                   .getResultList();
           return pagamentoTabelas;
        }catch(Exception e){
            
            
            return null;
        }
    }
    
    public int retornaOSId(int id){
            EntityManager em = getEntityManager();
            int idOS;
            System.out.println("ID ORCAMENTO:::"+id);
            try{
                Query query = em.createNamedQuery("PagamentoTabela.ordemServicoPagamentoTabelaId").setParameter("id",id);
                idOS = (int) query.getSingleResult();
                return idOS;
            }catch (Exception ex){
                Logger.getLogger(PagamentoTabelaDAO.class.getName()).log(Level.SEVERE, null, ex);
                return 0;
            }
        }
    
    public PagamentoTabela findPagamentoTabela(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(PagamentoTabela.class, id);
        } finally {
            em.close();
        }
    }

    public int getPagamentoTabelaCount() {
        EntityManager em = getEntityManager();
     
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<PagamentoTabela> rt = cq.from(PagamentoTabela.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
    
    
        public double retornaValorTotal(){
            EntityManager em = getEntityManager();
            double id;
            try{
                Query query = em.createNamedQuery("PagamentoTabela.valorTotal");
                id = (double) query.getSingleResult();
                return id;
            }catch (Exception e){
                System.out.println("Erro ao 218" + e.getMessage());
                return 0;
            }
        }
        
        public double retornaValorTotalD(Date dInicio, Date dFim,String situacao,String s2){
            EntityManager em = getEntityManager();
            double id;
            Calendar c = Calendar.getInstance();
            Calendar c2 = Calendar.getInstance();
            
            try{
                Query query = em.createNamedQuery("PagamentoTabela.valorTotalD");
                c.setTime(dInicio);
                query.setParameter("dInicio", c);
                
                c2.setTime(dFim);
                query.setParameter("dFim", c2);
                query.setParameter("situacao", situacao);
                query.setParameter("s2", s2);
                id = (double) query.getSingleResult();
                return id;
            }catch (Exception e){
                System.out.println("Erro ao 218" + e.getMessage());
                return 0;
            }
        }
        
        public double retornaValorTotalS(String situacao,String s2){
            EntityManager em = getEntityManager();
            double id;
            
            try{
                Query query = em.createNamedQuery("PagamentoTabela.valorTotalS");
                query.setParameter("situacao", situacao);
                query.setParameter("s2", s2);
                id = (double) query.getSingleResult();
                return id;
            }catch (Exception e){
                System.out.println("Erro ao 218" + e.getMessage());
                return 0;
            }
        }
    
    public void relatorioPagamentoTabelasGeral(int id){
        Connection conn;
        JasperPrint jasperPrint = null;
        try {
            conn = ConnectionFactory.getInstance().getConnection();
        
        String src = "C:\\VsN\\relatorios\\relatorioPagamentoTabelaIndividual.jasper";
        Map param = new HashMap();
        param.put("id",id);
        jasperPrint = JasperFillManager.fillReport(src, param, conn);
        } catch (Exception ex) {
            Logger.getLogger(PagamentoTabelaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JasperViewer jv = new JasperViewer(jasperPrint, false);
        
        jv.setVisible(true);
        jv.setExtendedState(MAXIMIZED_BOTH);
    }
    
    public void relatorioPagamentoTabelasAll(){
        Connection conn;
        JasperPrint jasperPrint = null;
        try {
            conn = ConnectionFactory.getInstance().getConnection();
        
        
        String src = "C:\\Refrival\\relatorios\\pagamentoTabelasAll.jasper";
        
        
        Map param = new HashMap();
        param.put("total",this.retornaValorTotal());
        jasperPrint = JasperFillManager.fillReport(src, param, conn);
        } catch (Exception ex) {
            Logger.getLogger(PagamentoTabelaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JasperViewer jv = new JasperViewer(jasperPrint, false);
        
        jv.setVisible(true);
        jv.setExtendedState(MAXIMIZED_BOTH);
    }
    
    public void relatorioPagamentoTabelaData(int comboBox,String dInicio, String dFim){
        Connection conn;
        Component rootPane = null;
        JasperPrint jasperPrint = null;
        try {
            conn = ConnectionFactory.getInstance().getConnection();
        
        
        String src = "C:\\Refrival\\relatorios\\pagamentoTabelasData.jasper";
        String situacao;
        String s2;
        if(comboBox ==0){
            situacao = "ABERTO";
            s2 = "ABERTO";
        }else{
            if(comboBox==1){
                situacao = "FECHADO";
                s2 = "FECHADO";
            }else{
                situacao = "ABERTO";
                s2 = "FECHADO";
            }
            
        }
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Map param = new HashMap();
        param.put("total",this.retornaValorTotalD(sdf.parse(dInicio),sdf.parse(dFim),situacao,s2));
        param.put("datainicio",sdf.parse(dInicio));
        param.put("dataFim",sdf.parse(dFim));
        param.put("situacoes",situacao);
        param.put("s2", s2);
        jasperPrint = JasperFillManager.fillReport(src, param, conn);
        JasperViewer jv = new JasperViewer(jasperPrint, false);
        
        jv.setVisible(true);
        jv.setExtendedState(MAXIMIZED_BOTH);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Campos Invalidos", "Aviso", JOptionPane.ERROR_MESSAGE, null);
        }
    }
    
    
     public void relatorioPagamentoTabelaSituacao(int comboBox){
        Connection conn;
        Component rootPane = null;
        JasperPrint jasperPrint = null;
        try {
            conn = ConnectionFactory.getInstance().getConnection();
        
        
        String src = "C:\\Refrival\\relatorios\\pagamentoTabelasAllSituacao.jasper";
        String situacao;
        String s2;
        if(comboBox ==0){
            situacao = "ABERTO";
            s2 = "ABERTO";
        }else{
            if(comboBox==1){
                situacao = "FECHADO";
                s2 = "FECHADO";
            }else{
                situacao = "ABERTO";
                s2 = "FECHADO";
            }
            
        }
        Map param = new HashMap();
        param.put("total",this.retornaValorTotalS(situacao,s2));
        param.put("situacao",situacao);
        param.put("s2", s2);
        jasperPrint = JasperFillManager.fillReport(src, param, conn);
        
        
        JasperViewer jv = new JasperViewer(jasperPrint, false);
        
        jv.setVisible(true);
        jv.setExtendedState(MAXIMIZED_BOTH);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Campos Invalidos", "Aviso", JOptionPane.ERROR_MESSAGE, null);
        }
    }
    
}

