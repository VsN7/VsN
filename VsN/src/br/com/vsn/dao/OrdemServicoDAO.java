
package br.com.vsn.dao;

import br.com.vsn.conectaRelatorio.ConnectionFactory;
import br.com.vsn.controller.OrdemServicoController;
import br.com.vsn.controller.UsuarioController;
import br.com.vsn.dao.exceptions.NonexistentEntityException;
import br.com.vsn.model.OrdemServico;
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
public class OrdemServicoDAO implements Serializable {
    private static EntityManagerFactory emf;

    public EntityManager getEntityManager() {
        if (emf == null){
            emf = Persistence.
                    createEntityManagerFactory("vsn");
        }
        return emf.createEntityManager();
    }

    public void create(OrdemServico ordemServico) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(ordemServico);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(OrdemServico ordemServico) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            ordemServico = em.merge(ordemServico);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = ordemServico.getId();
                if (findOrdemServico(id) == null) {
                    throw new NonexistentEntityException("The ordemServico with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    public void editSituacao(OrdemServico ordemServico) throws NonexistentEntityException{
    
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            ordemServico = em.merge(ordemServico);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = ordemServico.getId();
                if (findOrdemServico(id) == null) {
                    throw new NonexistentEntityException("The ordemServico with id " + id + " no longer exists.");
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
            OrdemServico ordemServico;
            try {
                ordemServico = em.getReference(OrdemServico.class, id);
                ordemServico.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The ordemServico with id " + id + " no longer exists.", enfe);
            }
            em.remove(ordemServico);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<OrdemServico> findOrdemServicoEntities() {
        return findOrdemServicoEntities(true, -1, -1);
    }

    public List<OrdemServico> findOrdemServicoEntities(int maxResults, int firstResult) {
        return findOrdemServicoEntities(false, maxResults, firstResult);
    }

    private List<OrdemServico> findOrdemServicoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        UsuarioController uc = new UsuarioController();
        try {
            
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(OrdemServico.class));
            Query q = em.createNamedQuery("OrdemServico.selecionar").setParameter("id",uc.getId());
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public List<OrdemServico> ordemServicoUnico(int id) {
        List<OrdemServico> ordemServicos = null;
        EntityManager em = getEntityManager();
        UsuarioController uc = new UsuarioController();
        try{
           ordemServicos = em.createNamedQuery("OrdemServico.buscaPorId").setParameter("id",id)
                                                                   .getResultList();
           return ordemServicos;
        }catch(Exception e){
            
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }
    
    public List<OrdemServico> ordemServicoFiltroNome(String nome) {
        List<OrdemServico> rdemServico = null;
        EntityManager em = getEntityManager();
        try{
           rdemServico = em.createNamedQuery("OrdemServico.buscaPorNome").setParameter("nome",nome).getResultList();
           return rdemServico;
        }catch(Exception e){
            
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }
    
    public List<OrdemServico> ordemServicoFiltroServico(String servico) {
        List<OrdemServico> ordemServico = null;
        EntityManager em = getEntityManager();
        try{
           ordemServico = em.createNamedQuery("OrdemServico.buscaPorServico").setParameter("servico",servico).getResultList();
           return ordemServico;
        }catch(Exception e){
            
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }
    
    public OrdemServico findOrdemServico(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(OrdemServico.class, id);
        } finally {
            em.close();
        }
    }

    public int getOrdemServicoCount() {
        EntityManager em = getEntityManager();
     
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<OrdemServico> rt = cq.from(OrdemServico.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
    

    public int primeiroPasso() throws Exception{
        EntityManager em = getEntityManager();
        UsuarioController uc = new UsuarioController();
        OrdemServicoController oc = new OrdemServicoController();
        List<OrdemServico> ordemServicos = null;
       try{
           ordemServicos = em.createNamedQuery("OrdemServico.selecionar").setParameter("id",uc.getId()).getResultList();
           oc.setOrdemServicos(ordemServicos);
           if(oc.getOrdemServicos().get(0).getId()!=0){
                return 1;
           }
           else
               return 0;
       } catch (Exception e){
           return 0;
       }
       
   }
    
        public double retornaValorTotal(){
            EntityManager em = getEntityManager();
            double id;
            try{
                Query query = em.createNamedQuery("OrdemServico.valorTotal");
                id = (double) query.getSingleResult();
                return id;
            }catch (Exception e){
                System.out.println("Erro ao 218" + e.getMessage());
                return 0;
            }
        }
        
        public double retornaValorTotalD(Date dInicio, Date dFim,String situacao, String cliente, String servico, int idOS){
            EntityManager em = getEntityManager();
            double id;
            Calendar c = Calendar.getInstance();
            Calendar c2 = Calendar.getInstance();
            
            try{
                Query query = em.createNamedQuery("OrdemServico.valorTotalD");
                c.setTime(dInicio);
                query.setParameter("dInicio", c);
                
                c2.setTime(dFim);
                query.setParameter("dFim", c2);
                query.setParameter("situacao", situacao);
                query.setParameter("cliente", cliente);
                query.setParameter("servico", servico);
                query.setParameter("idOS", idOS);
                id = (double) query.getSingleResult();
                return id;
            }catch (Exception e){
                System.out.println("Erro ao calcular valor total, resultado null" + e.getMessage());
                return 0;
            }
        }
        
        public double retornaValorTotalS(String situacao,String s2){
            EntityManager em = getEntityManager();
            double id;
            
            try{
                Query query = em.createNamedQuery("OrdemServico.valorTotalS");
                query.setParameter("situacao", situacao);
                query.setParameter("s2", s2);
                id = (double) query.getSingleResult();
                return id;
            }catch (Exception e){
                System.out.println("Erro ao 218" + e.getMessage());
                return 0;
            }
        }
    
    public void relatorioOrdemServicosGeral(int id){
        Connection conn;
        JasperPrint jasperPrint = null;
        try {
            conn = ConnectionFactory.getInstance().getConnection();
        
        
        String src = "C:\\Refrival\\relatorios\\ordemServicos.jasper";
        Map param = new HashMap();
        param.put("id",id);
        jasperPrint = JasperFillManager.fillReport(src, param, conn);
        } catch (Exception ex) {
            Logger.getLogger(OrdemServicoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JasperViewer jv = new JasperViewer(jasperPrint, false);
        
        jv.setVisible(true);
        jv.setExtendedState(MAXIMIZED_BOTH);
    }
    
    public void relatorioOrdemServicosAll(){
        Connection conn;
        JasperPrint jasperPrint = null;
        try {
            conn = ConnectionFactory.getInstance().getConnection();
        
        
        String src = "C:\\Refrival\\relatorios\\ordemServicosAll.jasper";
        
        
        Map param = new HashMap();
        param.put("total",this.retornaValorTotal());
        jasperPrint = JasperFillManager.fillReport(src, param, conn);
        } catch (Exception ex) {
            Logger.getLogger(OrdemServicoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JasperViewer jv = new JasperViewer(jasperPrint, false);
        
        jv.setVisible(true);
        jv.setExtendedState(MAXIMIZED_BOTH);
    }
    
    public void relatorioOrdemServicoData(String situacao,String dInicio, String dFim, String cliente,String servico, int id){
        Connection conn;
        Component rootPane = null;
        JasperPrint jasperPrint = null;
        try {
            conn = ConnectionFactory.getInstance().getConnection();
        
        
        String src = "C:\\VsN\\relatorios\\ordemServicoGeral.jasper";
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Map param = new HashMap();
        param.put("total",this.retornaValorTotalD(sdf.parse(dInicio),sdf.parse(dFim),situacao,cliente,servico,id));
        param.put("dataInicio",sdf.parse(dInicio));
        param.put("dataFim",sdf.parse(dFim));
        param.put("situacao",situacao);
        param.put("cliente", cliente);
        param.put("servico",servico);
        param.put("id", id);
        jasperPrint = JasperFillManager.fillReport(src, param, conn);
        JasperViewer jv = new JasperViewer(jasperPrint, false);
        
        jv.setVisible(true);
        jv.setExtendedState(MAXIMIZED_BOTH);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Data inválida!", "Aviso", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}

