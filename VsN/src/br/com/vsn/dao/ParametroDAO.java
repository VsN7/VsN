
package br.com.vsn.dao;

import br.com.vsn.conectaRelatorio.ConnectionFactory;
import br.com.vsn.controller.ParametroController;
import br.com.vsn.controller.UsuarioController;
import br.com.vsn.dao.exceptions.NonexistentEntityException;
import br.com.vsn.model.Parametro;
import java.awt.Component;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.io.Serializable;
import java.sql.Connection;
import java.text.DateFormat;
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
public class ParametroDAO implements Serializable {
    
    private static Parametro cont;

    public ParametroDAO() {
        this.emf = Persistence.createEntityManagerFactory("vsn");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Parametro Parametro) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(Parametro);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Parametro Parametro) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Parametro = em.merge(Parametro);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = Parametro.getId();
                if (findParametro(id) == null) {
                    throw new NonexistentEntityException("The Parametro with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Parametro Parametro;
            try {
                Parametro = em.getReference(Parametro.class, id);
                Parametro.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The Parametro with id " + id + " no longer exists.", enfe);
            }
            em.remove(Parametro);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    public int primeiroPasso() throws Exception{
        EntityManager em = getEntityManager();
        UsuarioController uc = new UsuarioController();
        ParametroController cc = new ParametroController();
        List<Parametro> parametros = null;
       try{
           parametros = em.createNamedQuery("Parametro.selecionar").setParameter("id",uc.getId()).getResultList();
           cc.setParametros(parametros);
           if(cc.getParametros().get(0).getId()!=0){
                return 1;
           }
           else
               return 0;
       } catch (Exception e){
           return 0;
       }
       
   }

    public List<Parametro> findParametroEntities() {
        return findParametroEntities(true, -1, -1);
    }

    public List<Parametro> findParametroEntities(int maxResults, int firstResult) {
        return findParametroEntities(false, maxResults, firstResult);
    }

    private List<Parametro> findParametroEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Parametro.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public List<Parametro> ParametroUnico(int id) {
        List<Parametro> parametros = null;
        EntityManager em = getEntityManager();
        try{
           parametros = em.createNamedQuery("Parametro.buscaPorId").setParameter("id",id).getResultList();
           return parametros;
        }catch(Exception e){
            
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }
    
    public List<Parametro> ParametroFiltroTitulo(String titulo) {
        List<Parametro> parametros = null;
        EntityManager em = getEntityManager();
        UsuarioController uc = new UsuarioController();
        try{
           parametros = em.createNamedQuery("Parametro.buscaPorTitulo").setParameter("titulo",titulo).setParameter("idU",uc.getId()).getResultList();
           return parametros;
        }catch(Exception e){
            
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }
    
    public List<Parametro> ParametroFiltroCliente(String cliente) {
        List<Parametro> parametros = null;
        EntityManager em = getEntityManager();
        UsuarioController uc = new UsuarioController();
        try{
           parametros = em.createNamedQuery("Parametro.buscaPorCliente").setParameter("cliente",cliente).setParameter("idU",uc.getId()).getResultList();
           return parametros;
        }catch(Exception e){
            
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }
    
    public List<Parametro> ParametroFiltroId(int id) {
        List<Parametro> parametros = null;
        EntityManager em = getEntityManager();
        UsuarioController uc = new UsuarioController();
        try{
           parametros = em.createNamedQuery("Parametro.buscaPorIdC").setParameter("id",id).setParameter("idU",uc.getId()).getResultList();
           return parametros;
        }catch(Exception e){
            
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }
    
    public Parametro findParametro(int id) {
        EntityManager em = getEntityManager();
        try {
            List<Parametro> parametros = null;
            parametros = em.createNamedQuery("Parametro.filtroData").getResultList();
            return em.find(Parametro.class, id);
        } finally {
            em.close();
        }
    }
    
    public Parametro pesquisarUnico(int id) {
        EntityManager em = getEntityManager();
        try {
            UsuarioController uc = new UsuarioController();
            List<Parametro> parametros = null;
            parametros = em.createNamedQuery("Parametro.ParametroUnico").setParameter("id",uc.getId()).getResultList();
            return parametros.get(0);
        } catch(Exception e){
            return null;
        }
        
        finally {
            em.close();
        }
    }

    public int getParametroCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Parametro> rt = cq.from(Parametro.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    

    
    public Parametro buscaParametro() {
        Parametro Parametro = null;
        EntityManager em = getEntityManager();
        UsuarioController uc = new UsuarioController();
        try{
           Parametro = (Parametro) em.createNamedQuery("Parametro.selecionar").setParameter("id",uc.getId()).getResultList();
           return Parametro;
        }catch(Exception e){
            System.out.println("Erro na linha 147 (ParametroDAO)!");
            return null;
        }
    }
}
