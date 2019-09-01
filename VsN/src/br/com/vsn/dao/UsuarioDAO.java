/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vsn.dao;

import br.com.vsn.dao.exceptions.NonexistentEntityException;
import br.com.vsn.model.Usuario;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.io.Serializable;
import java.sql.Connection;
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
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import br.com.vsn.conectaRelatorio.ConnectionFactory;
/**
 *
 * @author vitor
 */
public class UsuarioDAO implements Serializable {
    private static EntityManagerFactory emf;

    public EntityManager getEntityManager() {
        if (emf == null){
            emf = Persistence.
                    createEntityManagerFactory("vsn");
        }
        return emf.createEntityManager();
    }

    public void create(Usuario usuario) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(usuario);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Usuario usuario) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            usuario = em.merge(usuario);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = usuario.getId();
                if (findUsuario(id) == null) {
                    throw new NonexistentEntityException("The usuario with id " + id + " no longer exists.");
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
            Usuario usuario;
            try {
                usuario = em.getReference(Usuario.class, id);
                usuario.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The usuario with id " + id + " no longer exists.", enfe);
            }
            em.remove(usuario);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Usuario> findUsuarioEntities() {
        return findUsuarioEntities(true, -1, -1);
    }

    public List<Usuario> findUsuarioEntities(int maxResults, int firstResult) {
        return findUsuarioEntities(false, maxResults, firstResult);
    }

    private List<Usuario> findUsuarioEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Usuario.class));
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

    public Usuario findUsuario(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Usuario.class, id);
        } finally {
            em.close();
        }
    }

    public int getUsuarioCount() {
        EntityManager em = getEntityManager();
     
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Usuario> rt = cq.from(Usuario.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
    public Object efetuarLogin(Usuario usuario){
       EntityManager em = getEntityManager();
       try{
           em.getTransaction().begin();
           Query query = em.createNamedQuery("Usuario.findByLoginAndSenha",
                   Usuario.class);
           query.setParameter("login", usuario.getLogin());
           query.setParameter("senha", usuario.getSenha());
           em.getTransaction().commit();
           return query.getSingleResult();
       }catch (Exception ex){
           return null;
       }
    }
    
    public List<Usuario> usuarioUnico(String cpf) {
        List<Usuario> usuarios = null;
        EntityManager em = getEntityManager();
        try{
           usuarios = em.createNamedQuery("Usuario.getCpf").setParameter("cpf",cpf).getResultList();
           return usuarios;
        }catch(Exception e){
            
            Logger.getLogger(FornecedorDAO.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }
    
    public List<Usuario> usuarioUnicoId(int id) {
        List<Usuario> usuarios = null;
        EntityManager em = getEntityManager();
        try{
           usuarios = em.createNamedQuery("Usuario.getId2").setParameter("id",id).getResultList();
           return usuarios;
        }catch(Exception e){
            
            Logger.getLogger(FornecedorDAO.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }
    
    public int retornaId(Usuario usuario){
       EntityManager em = getEntityManager();
       int id;
       try{
           Query query = em.createNamedQuery("Usuario.getId");
           query.setParameter("login", usuario.getLogin());
           query.setParameter("senha", usuario.getSenha());
           return id = (int) query.getSingleResult();
       }catch (Exception e){
           System.out.println("Erro ao tentar logar!" + e.getMessage());
           return 0;
       }
    }
    
    public int retornaIdFunc(String login){
       EntityManager em = getEntityManager();
       int id;
       try{
           Query query = em.createNamedQuery("Usuario.getIdFunc");
           query.setParameter("login", login);
           id = (int) query.getSingleResult();
           return id;
       }catch (Exception e){
           return 0;
       }
    }
    
    
    public void relatorioUsuariosGeral(){
        Connection conn;
        JasperPrint jasperPrint = null;
        try {
            conn = ConnectionFactory.getInstance().getConnection();
        
        
        String src = "C:\\Refrival\\relatorios\\usuariosGeral.jasper";
        
        
        
        jasperPrint = JasperFillManager.fillReport(src, null, conn);
        } catch (Exception ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JasperViewer jv = new JasperViewer(jasperPrint, false);
        
        jv.setVisible(true);
        jv.setExtendedState(MAXIMIZED_BOTH);
         
    }
    
}