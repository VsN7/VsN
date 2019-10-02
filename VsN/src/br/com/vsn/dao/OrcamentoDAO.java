
package br.com.vsn.dao;

import br.com.vsn.conectaRelatorio.ConnectionFactory;
import br.com.vsn.controller.OrcamentoController;
import br.com.vsn.controller.UsuarioController;
import br.com.vsn.dao.exceptions.NonexistentEntityException;
import br.com.vsn.model.Orcamento;
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
public class OrcamentoDAO implements Serializable {
    private static EntityManagerFactory emf;

    public EntityManager getEntityManager() {
        if (emf == null){
            emf = Persistence.
                    createEntityManagerFactory("vsn");
        }
        return emf.createEntityManager();
    }

    public void create(Orcamento orcamento) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(orcamento);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Orcamento orcamento) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            orcamento = em.merge(orcamento);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = orcamento.getId();
                if (findOrcamento(id) == null) {
                    throw new NonexistentEntityException("The orcamento with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    public void editSituacao(Orcamento orcamento) throws NonexistentEntityException{
    
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            orcamento = em.merge(orcamento);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = orcamento.getId();
                if (findOrcamento(id) == null) {
                    throw new NonexistentEntityException("The orcamento with id " + id + " no longer exists.");
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
            Orcamento orcamento = new Orcamento();
            try {
                orcamento = em.getReference(Orcamento.class, id);
                orcamento.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The orcamento with id " + id + " no longer exists.", enfe);
            }
            em.remove(orcamento);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Orcamento> findOrcamentoEntities() {
        return findOrcamentoEntities(true, -1, -1);
    }

    public List<Orcamento> findOrcamentoEntities(int maxResults, int firstResult) {
        return findOrcamentoEntities(false, maxResults, firstResult);
    }

    private List<Orcamento> findOrcamentoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        UsuarioController uc = new UsuarioController();
        try {
            
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Orcamento.class));
            Query q = em.createNamedQuery("Orcamento.selecionar").setParameter("id",uc.getId());
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public List<Orcamento> orcamentoUnico(int id) {
        List<Orcamento> orcamentos = null;
        EntityManager em = getEntityManager();
        UsuarioController uc = new UsuarioController();
        try{
           orcamentos = em.createNamedQuery("Orcamento.buscaPorId").setParameter("id",id)
                                                                   .getResultList();
           return orcamentos;
        }catch(Exception e){
            
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }
    
    public List<Orcamento> orcamentoFiltroNome(String nome) {
        List<Orcamento> orcamentos = null;
        EntityManager em = getEntityManager();
        try{
           orcamentos = em.createNamedQuery("Orcamento.buscaPorNome").setParameter("nome",nome).getResultList();
           return orcamentos;
        }catch(Exception e){
            
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }
    
    public List<Orcamento> orcamentoFiltroCpf(String cpf) {
        List<Orcamento> orcamentos = null;
        EntityManager em = getEntityManager();
        try{
           orcamentos = em.createNamedQuery("Orcamento.buscaPorCpf").setParameter("cpf",cpf).getResultList();
           return orcamentos;
        }catch(Exception e){
            
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }
    
    public int retornaOSId(int id){
            EntityManager em = getEntityManager();
            int idOS;
            System.out.println("ID ORCAMENTO:::"+id);
            try{
                Query query = em.createNamedQuery("Orcamento.ordemServicoOrcamentoId").setParameter("id",id);
                idOS = (int) query.getSingleResult();
                return idOS;
            }catch (Exception ex){
                Logger.getLogger(OrcamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
                return 0;
            }
        }
    
    public Orcamento findOrcamento(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Orcamento.class, id);
        } finally {
            em.close();
        }
    }

    public int getOrcamentoCount() {
        EntityManager em = getEntityManager();
     
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Orcamento> rt = cq.from(Orcamento.class);
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
                Query query = em.createNamedQuery("Orcamento.valorTotal");
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
                Query query = em.createNamedQuery("Orcamento.valorTotalD");
                c.setTime(dInicio);
                query.setParameter("dInicio", c);
                
                c2.setTime(dFim);
                query.setParameter("dFim", c2);
                query.setParameter("situacao", situacao);
                query.setParameter("s2", s2);
                id = (double) query.getSingleResult();
                return id;
            }catch (Exception e){
                System.out.println("Erro ao 218 nullo... não é um erro" + e.getMessage());
                return 0;
            }
        }
        
        public double retornaValorTotalS(String situacao,String s2){
            EntityManager em = getEntityManager();
            double id;
            
            try{
                Query query = em.createNamedQuery("Orcamento.valorTotalS");
                query.setParameter("situacao", situacao);
                query.setParameter("s2", s2);
                id = (double) query.getSingleResult();
                return id;
            }catch (Exception e){
                System.out.println("Erro ao 218" + e.getMessage());
                return 0;
            }
        }
    
    public void relatorioOrcamentosGeral(int id){
        Connection conn;
        JasperPrint jasperPrint = null;
        try {
            conn = ConnectionFactory.getInstance().getConnection();
        
        String src = "C:\\VsN\\relatorios\\relatorioOrcamentoIndividual.jasper";
        Map param = new HashMap();
        param.put("id",id);
        jasperPrint = JasperFillManager.fillReport(src, param, conn);
        } catch (Exception ex) {
            Logger.getLogger(OrcamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JasperViewer jv = new JasperViewer(jasperPrint, false);
        
        jv.setVisible(true);
        jv.setExtendedState(MAXIMIZED_BOTH);
    }
    
    public void relatorioReciboManual(){
        Connection conn;
        JasperPrint jasperPrint = null;
        try {
            conn = ConnectionFactory.getInstance().getConnection();
        
        String src = "C:\\VsN\\relatorios\\RelatorioOrcamentoManual.jasper";
        jasperPrint = JasperFillManager.fillReport(src, null, conn);
        } catch (Exception ex) {
            Logger.getLogger(OrcamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JasperViewer jv = new JasperViewer(jasperPrint, false);
        
        jv.setVisible(true);
        jv.setExtendedState(MAXIMIZED_BOTH);
    }
    
    public void relatorioOrcamentosAll(){
        Connection conn;
        JasperPrint jasperPrint = null;
        try {
            conn = ConnectionFactory.getInstance().getConnection();
        
        
        String src = "C:\\Refrival\\relatorios\\orcamentosAll.jasper";
        
        
        Map param = new HashMap();
        param.put("total",this.retornaValorTotal());
        jasperPrint = JasperFillManager.fillReport(src, param, conn);
        } catch (Exception ex) {
            Logger.getLogger(OrcamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JasperViewer jv = new JasperViewer(jasperPrint, false);
        
        jv.setVisible(true);
        jv.setExtendedState(MAXIMIZED_BOTH);
    }
    
    public void relatorioOrcamentoData(int comboBox,String dInicio, String dFim){
        Connection conn;
        Component rootPane = null;
        JasperPrint jasperPrint = null;
        
        if(dInicio.equals("  /  /    "))
            dInicio = "22/02/1000";
        if(dFim.equals("  /  /    "))
            dFim = "22/02/9999";
        try {
            conn = ConnectionFactory.getInstance().getConnection();
        
        
        String src = "C:\\VsN\\relatorios\\orcamentosData.jasper";
        String situacao;
        String s2;
        if(comboBox ==0){
            situacao = "ABERTO";
            s2 = "ABERTO";
        }else{
            if(comboBox==1){
                situacao = "VINCULADO";
                s2 = "VINCULADO";
            }else{
                situacao = "ABERTO";
                s2 = "VINCULADO";
            }
            
        }
        situacao+="%";
        s2+="%";
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
            Logger.getLogger(OrcamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
     public void relatorioOrcamentoSituacao(int comboBox){
        Connection conn;
        Component rootPane = null;
        JasperPrint jasperPrint = null;
        try {
            conn = ConnectionFactory.getInstance().getConnection();
        
        
        String src = "C:\\Refrival\\relatorios\\orcamentosAllSituacao.jasper";
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

