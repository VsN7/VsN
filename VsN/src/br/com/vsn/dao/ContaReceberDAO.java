
package br.com.vsn.dao;

import br.com.vsn.controller.ContaReceberController;
import br.com.vsn.controller.UsuarioController;
import br.com.vsn.dao.exceptions.NonexistentEntityException;
import br.com.vsn.model.ContaReceber;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author vitor
 */
public class ContaReceberDAO implements Serializable {
    
    private static ContaReceber cont;

    public ContaReceberDAO() {
        this.emf = Persistence.createEntityManagerFactory("vsn");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(ContaReceber contaReceber) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(contaReceber);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(ContaReceber contaReceber) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            contaReceber = em.merge(contaReceber);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = contaReceber.getId();
                if (findContaReceber(id) == null) {
                    throw new NonexistentEntityException("The contaReceber with id " + id + " no longer exists.");
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
            ContaReceber contaReceber;
            try {
                contaReceber = em.getReference(ContaReceber.class, id);
                contaReceber.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The contaReceber with id " + id + " no longer exists.", enfe);
            }
            em.remove(contaReceber);
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
        ContaReceberController cc = new ContaReceberController();
        List<ContaReceber> contaReceberes = null;
       try{
           contaReceberes = em.createNamedQuery("ContaReceber.selecionar").setParameter("id",uc.getId()).getResultList();
           cc.setContaReceberes(contaReceberes);
           if(cc.getContaReceberes().get(0).getId()!=0){
                return 1;
           }
           else
               return 0;
       } catch (Exception e){
           return 0;
       }
       
   }

    public List<ContaReceber> findContaReceberEntities() {
        return findContaReceberEntities(true, -1, -1);
    }

    public List<ContaReceber> findContaReceberEntities(int maxResults, int firstResult) {
        return findContaReceberEntities(false, maxResults, firstResult);
    }

    private List<ContaReceber> findContaReceberEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(ContaReceber.class));
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

    public List<ContaReceber> contaReceberUnico(int id) {
        List<ContaReceber> contaReceberes = null;
        EntityManager em = getEntityManager();
        try{
           contaReceberes = em.createNamedQuery("ContaReceber.buscaPorId").setParameter("id",id).getResultList();
           return contaReceberes;
        }catch(Exception e){
            
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }
    
    public ContaReceber findContaReceber(int id) {
        EntityManager em = getEntityManager();
        try {
            List<ContaReceber> contaReceberes = null;
            contaReceberes = em.createNamedQuery("ContaReceber.filtroData").getResultList();
            return em.find(ContaReceber.class, id);
        } finally {
            em.close();
        }
    }

    public int getContaReceberCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<ContaReceber> rt = cq.from(ContaReceber.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
    public List<ContaReceber> listarContaReceberPorMes(int mes) {
        List<ContaReceber> contaReceberes = null;
        EntityManager em = getEntityManager();
        UsuarioController uc = new UsuarioController();
        try{
           contaReceberes = em.createNamedQuery("ContaReceber.filtroData").setParameter("mes", mes).setParameter("id",uc.getId()).getResultList();
           return contaReceberes;
        }catch(Exception e){
            System.out.println("Erro na linha 147 (ContaReceberDAO)!");
            return null;
        }
    }
    
    
    public List<ContaReceber> listarContaReceberPorMesP(int mes) {
        List<ContaReceber> contaReceberes = null;
        EntityManager em = getEntityManager();
        UsuarioController uc = new UsuarioController();
        try{
           contaReceberes = em.createNamedQuery("ContaReceber.filtroVencimento").setParameter("mes", mes).setParameter("id",uc.getId()).getResultList();
           return contaReceberes;
        }catch(Exception e){
            System.out.println("Erro na linha 147 (ContaReceberDAO)!");
            return null;
        }
    }
    
    public List<ContaReceber> listarContaReceberPorSituacao(int index) {
        List<ContaReceber> contaReceberes = null;
        EntityManager em = getEntityManager();
        UsuarioController uc = new UsuarioController();
        String situacao="";
        try{
            if(index==1){
                situacao="Aberto";
            }else{
                if(index == 2){
                    situacao="Fechado";
                }
            }
            
           contaReceberes = em.createNamedQuery("ContaReceber.filtroSituacao").setParameter("situacao", situacao).setParameter("id",uc.getId()).getResultList();
           return contaReceberes;
        }catch(Exception e){
            System.out.println("Erro na linha 147 (ContaReceberDAO)!");
            return null;
        }
    }
    
    
    
    
    public List<ContaReceber> buscaContaReceber() {
        List<ContaReceber> contaReceberes = null;
        EntityManager em = getEntityManager();
        UsuarioController uc = new UsuarioController();
        try{
           contaReceberes = em.createNamedQuery("ContaReceber.selecionar").setParameter("id",uc.getId()).getResultList();
           return contaReceberes;
        }catch(Exception e){
            System.out.println("Erro na linha 147 (ContaReceberDAO)!");
            return null;
        }
    }
    
    public double buscaContaReceberValor(int id) {
        double contaReceberes = 0;
        EntityManager em = getEntityManager();
        UsuarioController uc = new UsuarioController();
        try{
           contaReceberes = (Double) em.createNamedQuery("ContaReceber.selecionarValor").setParameter("id",id).getSingleResult();
           return contaReceberes;
        }catch(Exception e){
            System.out.println("Erro na linha 226 (ContaReceberDAO)!");
            return 0;
        }
    }
    
    
    
    public int buscaContaReceberVezes(int id) {
        int contaReceberes = 0;
        EntityManager em = getEntityManager();
        UsuarioController uc = new UsuarioController();
        try{
           contaReceberes = (int) em.createNamedQuery("ContaReceber.selecionarVezes").setParameter("id",id).getSingleResult();
           return contaReceberes;
        }catch(Exception e){
            System.out.println("Erro na linha 147 (ContaReceberDAO)!");
            return 0;
        }
    }
    
    public double buscaContaReceberValorPagar(int id) {
        double contaReceberes = 0;
        EntityManager em = getEntityManager();
        UsuarioController uc = new UsuarioController();
        try{
           contaReceberes = (double) em.createNamedQuery("ContaReceber.selecionarValorPagar").setParameter("id",id).getSingleResult();
           return contaReceberes;
        }catch(Exception e){
            System.out.println("Erro na linha 147 (ContaReceberDAO)!");
            return 0;
        }
    }
    
    public int buscaContaReceberVezesPagar(int id) {
        int contaReceberes = 0;
        EntityManager em = getEntityManager();
        UsuarioController uc = new UsuarioController();
        try{
           contaReceberes = (int) em.createNamedQuery("ContaReceber.selecionarVezesPagar").setParameter("id",id).getSingleResult();
            
           return contaReceberes;
        }catch(Exception e){
            System.out.println("Erro na linha 268 (ContaReceberDAO)!");
            return 0;
        }
    }
    
    public Calendar buscaContaReceberVencimento(int id) {
        Calendar contaReceberes = Calendar.getInstance();
        EntityManager em = getEntityManager();
        UsuarioController uc = new UsuarioController();
        try{
           contaReceberes = (Calendar) em.createNamedQuery("ContaReceber.selecionarVencimento").setParameter("id",id).getSingleResult();
            
           return contaReceberes;
        }catch(Exception e){
            System.out.println("Erro na linha 147 (ContaReceberDAO)!");
            return contaReceberes;
        }
    }
    
    
    
    
    
    public void update(ContaReceber contaReceber,int id, double valor) {
        EntityManager em = getEntityManager();
        try{
            em = getEntityManager();
            em.getTransaction().begin();
            contaReceber.setValorPagar(valor);
            contaReceber.setId(id);
            cont = contaReceber;
            contaReceber = em.merge(contaReceber);
            em.getTransaction().commit();
           
        }catch(Exception e){
            System.out.println("Erro na linha 187 (ContaReceberDAO)!");
        }
    }
    
    public void updateVencimento(ContaReceber contaReceber,int id, Calendar c) {
        EntityManager em = getEntityManager();
        UsuarioController uc = new UsuarioController();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        try{
            em = getEntityManager();
            em.getTransaction().begin();
            contaReceber.setDataVencimento(c);
            contaReceber.setId(id);
            cont = contaReceber;
            contaReceber = em.merge(contaReceber);
            em.getTransaction().commit();
           
        }catch(Exception e){
            System.out.println("Erro na linha 187 (ContaReceberDAO)!");
        }
    }
    
   public ContaReceber retornaContaReceber(){
        return cont;
    }
   public double retornaContaReceberValor(){
        return cont.getValor();
    }
   public int retornaContaReceberIndex(){
        return 1;
    }
   public String retornaContaReceberSituacao(int id){
        String contaReceberes = "";
        EntityManager em = getEntityManager();
        UsuarioController uc = new UsuarioController();
        try{
           contaReceberes = (String) em.createNamedQuery("ContaReceber.selecionarSituacao").setParameter("id",id).getSingleResult();
            
           return contaReceberes;
        }catch(Exception e){
            System.out.println("Erro na linha 147 (ContaReceberDAO)!");
            return "false";
        }
    }
    
    public void reduzParcela(ContaReceber contaReceber,int vezes, int id) {
        EntityManager em = getEntityManager();
        UsuarioController uc = new UsuarioController();
        try{
            em = getEntityManager();
            em.getTransaction().begin();
           // contaReceber.setVezesPagar(vezes);
            contaReceber.setId(id);
            cont = contaReceber;
            contaReceber = em.merge(contaReceber);
            em.getTransaction().commit();
           
        }catch(Exception e){
            System.out.println("Erro na linha 187 (ContaReceberDAO)!");
        }
    }
    
    public void alterarSituacao(ContaReceber contaReceber, int id) {
        EntityManager em = getEntityManager();
        UsuarioController uc = new UsuarioController();
        try{
            em = getEntityManager();
            em.getTransaction().begin();
            contaReceber.setSituacao("Fechado");
            contaReceber.setId(id);
            cont = contaReceber;
            contaReceber = em.merge(contaReceber);
            em.getTransaction().commit();
           
        }catch(Exception e){
            System.out.println("Erro na linha 187 (ContaReceberDAO)!");
        }
    }
    
}
