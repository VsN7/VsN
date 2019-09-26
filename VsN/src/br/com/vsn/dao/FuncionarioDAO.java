package br.com.vsn.dao;

import br.com.vsn.conectaRelatorio.ConnectionFactory;
import br.com.vsn.dao.exceptions.NonexistentEntityException;
import br.com.vsn.model.Funcionario;
import java.awt.Component;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.sql.Connection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author vitor
 */
public class FuncionarioDAO {
    
    private static Funcionario cont;

    public FuncionarioDAO() {
        this.emf = Persistence.createEntityManagerFactory("vsn");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
    public List<Funcionario> funcionarioFindAll() {
        List<Funcionario> funcionarios = null;
        EntityManager em = getEntityManager();
        try{
           funcionarios = em.createNamedQuery("Funcionario.findAll").getResultList();
           return funcionarios;
        }catch(Exception e){
            System.out.println("Erro na linha 147 (ContaDAO)!");
            return null;
        }
    }
    
    
    
    public List<Funcionario> funcionarioUnico(int id) {
        List<Funcionario> funcionarios = null;
        EntityManager em = getEntityManager();
        try{
           funcionarios = em.createNamedQuery("Funcionario.buscaPorId").setParameter("id",id).getResultList();
           return funcionarios;
        }catch(Exception e){
            
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }
    
    public List<Funcionario> funcionarioFiltroNome(String nome) {
        List<Funcionario> funcionarios = null;
        EntityManager em = getEntityManager();
        try{
           funcionarios = em.createNamedQuery("Funcionario.buscaPorNome").setParameter("nome",nome).getResultList();
           return funcionarios;
        }catch(Exception e){
            
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }
    
    public List<Funcionario> funcionarioFiltroCpf(String cpf) {
        List<Funcionario> funcionarios = null;
        EntityManager em = getEntityManager();
        try{
           funcionarios = em.createNamedQuery("Funcionario.buscaPorCpf").setParameter("cpf",cpf).getResultList();
           return funcionarios;
        }catch(Exception e){
            
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }

    public void create(Funcionario funcionario) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(funcionario);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    public int retornaCpf(String cpf){
       EntityManager em = getEntityManager();
       int id;
       try{
           Query query = em.createNamedQuery("Funcionario.getIdCpf");
           query.setParameter("cpf", cpf);
           id = (int) query.getSingleResult();
           return id;
       }catch (Exception e){
           return 0;
       }
    }
    
    public int retornaNulo(String nome, String funcao){
       EntityManager em = getEntityManager();
       List <Funcionario> func = null;
       try{
           Query query = em.createNamedQuery("Funcionario.getAll");
           query.setParameter("nome", nome);
           query.setParameter("funcao", funcao);
           func = query.getResultList();
           return 1;
       }catch (Exception e){
           return 0;
       }
    }

    public void edit(Funcionario funcionario) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            funcionario = em.merge(funcionario);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = funcionario.getId();
                if (findFuncionario(id) == null) {
                        throw new NonexistentEntityException("The funcionario with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    public Funcionario findFuncionario(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Funcionario.class, id);
        } finally {
            em.close();
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Funcionario funcionario;
            try {
                funcionario = em.getReference(Funcionario.class, id);
                funcionario.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The funcionario with id " + id + " no longer exists.", enfe);
            }
            em.remove(funcionario);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Funcionario> findFuncionarioEntities() {
        return findFuncionarioEntities(true, -1, -1);
    }

    public List<Funcionario> findFuncionarioEntities(int maxResults, int firstResult) {
        return findFuncionarioEntities(false, maxResults, firstResult);
    }

    private List<Funcionario> findFuncionarioEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Funcionario.class));
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

    public int getFuncionarioCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Funcionario> rt = cq.from(Funcionario.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    } 
    
    public void relatorioFuncionariosAniversariantes(int mes){
        Connection conn;
        Component rootPane = null;
        JasperPrint jasperPrint = null;
        try {
            conn = ConnectionFactory.getInstance().getConnection();
        
        
        String src = "C:\\VsN\\relatorios\\funcionariosAniversariantes.jasper";
        Map param = new HashMap();
        param.put("mes",mes);
        jasperPrint = JasperFillManager.fillReport(src, param, conn);
        JasperViewer jv = new JasperViewer(jasperPrint, false);
        
        jv.setVisible(true);
        jv.setExtendedState(MAXIMIZED_BOTH);
        } catch (Exception ex) {
            Logger.getLogger(OrcamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
