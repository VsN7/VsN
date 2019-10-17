
package br.com.vsn.dao;

import br.com.vsn.conectaRelatorio.ConnectionFactory;
import br.com.vsn.controller.DespesaController;
import br.com.vsn.controller.UsuarioController;
import br.com.vsn.dao.exceptions.NonexistentEntityException;
import br.com.vsn.model.Despesa;
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
public class DespesaDAO implements Serializable {
    
    private static Despesa cont;

    public DespesaDAO() {
        this.emf = Persistence.createEntityManagerFactory("vsn");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Despesa despesa) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(despesa);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Despesa despesa) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            despesa = em.merge(despesa);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = despesa.getId();
                if (findDespesa(id) == null) {
                    throw new NonexistentEntityException("The despesa with id " + id + " no longer exists.");
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
            Despesa despesa;
            try {
                despesa = em.getReference(Despesa.class, id);
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The despesa with id " + id + " no longer exists.", enfe);
            }
            em.remove(despesa);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Despesa> findDespesaEntities() {
        return findDespesaEntities(true, -1, -1);
    }

    public List<Despesa> findDespesaEntities(int maxResults, int firstResult) {
        return findDespesaEntities(false, maxResults, firstResult);
    }

    private List<Despesa> findDespesaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Despesa.class));
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

    public List<Despesa> despesaUnico(int id) {
        List<Despesa> despesas = null;
        EntityManager em = getEntityManager();
        UsuarioController uc = new UsuarioController();
        try{
           despesas = em.createNamedQuery("Despesa.buscaPorId").setParameter("id",id).setParameter("idU",uc.getId()).getResultList();
           return despesas;
        }catch(Exception e){
            
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }
    
    public Despesa findDespesa(int id) {
        EntityManager em = getEntityManager();
        try {
            List<Despesa> despesas = null;
            despesas = em.createNamedQuery("Despesa.filtroData").getResultList();
            return em.find(Despesa.class, id);
        } finally {
            em.close();
        }
    }

    public int getDespesaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Despesa> rt = cq.from(Despesa.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
    public List<Despesa> listarDespesaPorMes(int mes) {
        List<Despesa> despesas = null;
        EntityManager em = getEntityManager();
        UsuarioController uc = new UsuarioController();
        try{
           despesas = em.createNamedQuery("Despesa.filtroData").setParameter("mes", mes).setParameter("id",uc.getId()).getResultList();
           return despesas;
        }catch(Exception e){
            System.out.println("Erro na linha 147 (DespesaDAO)!");
            return null;
        }
    }
    
    
    public List<Despesa> listarDespesaPorMesP(int mes) {
        List<Despesa> despesas = null;
        EntityManager em = getEntityManager();
        UsuarioController uc = new UsuarioController();
        try{
           despesas = em.createNamedQuery("Despesa.filtroVencimento").setParameter("mes", mes).setParameter("id",uc.getId()).getResultList();
           return despesas;
        }catch(Exception e){
            System.out.println("Erro na linha 147 (DespesaDAO)!");
            return null;
        }
    }
    
    public List<Despesa> listarDespesaPorSituacao(int index) {
        List<Despesa> despesas = null;
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
            
           despesas = em.createNamedQuery("Despesa.filtroSituacao").setParameter("situacao", situacao).setParameter("id",uc.getId()).getResultList();
           return despesas;
        }catch(Exception e){
            System.out.println("Erro na linha 147 (DespesaDAO)!");
            return null;
        }
    }
    
    
    
    
    public List<Despesa> buscaDespesa() {
        List<Despesa> despesas = null;
        EntityManager em = getEntityManager();
        UsuarioController uc = new UsuarioController();
        try{
           despesas = em.createNamedQuery("Despesa.findAll").getResultList();
           return despesas;
        }catch(Exception e){
            System.out.println("Erro na linha 147 (DespesaDAO)!");
            return null;
        }
    }
    
    public double buscaDespesaValor(int id) {
        double despesas = 0;
        EntityManager em = getEntityManager();
        UsuarioController uc = new UsuarioController();
        try{
           despesas = (Double) em.createNamedQuery("Despesa.selecionarValor").setParameter("id",id).getSingleResult();
           return despesas;
        }catch(Exception e){
            System.out.println("Erro na linha 226 (DespesaDAO)!");
            return 0;
        }
    }
    
    
    
    public int buscaDespesaVezes(int id) {
        int despesas = 0;
        EntityManager em = getEntityManager();
        UsuarioController uc = new UsuarioController();
        try{
           despesas = (int) em.createNamedQuery("Despesa.selecionarVezes").setParameter("id",id).getSingleResult();
           return despesas;
        }catch(Exception e){
            System.out.println("Erro na linha 147 (DespesaDAO)!");
            return 0;
        }
    }
    
    public double buscaDespesaValorPagar(int id) {
        double despesas = 0;
        EntityManager em = getEntityManager();
        UsuarioController uc = new UsuarioController();
        try{
           despesas = (double) em.createNamedQuery("Despesa.selecionarValorPagar").setParameter("id",id).getSingleResult();
           return despesas;
        }catch(Exception e){
            System.out.println("Erro na linha 147 (DespesaDAO)!");
            return 0;
        }
    }
    
    public int buscaDespesaVezesPagar(int id) {
        int despesas = 0;
        EntityManager em = getEntityManager();
        UsuarioController uc = new UsuarioController();
        try{
           despesas = (int) em.createNamedQuery("Despesa.selecionarVezesPagar").setParameter("id",id).getSingleResult();
            
           return despesas;
        }catch(Exception e){
            System.out.println("Erro na linha 268 (DespesaDAO)!");
            return 0;
        }
    }
    
    public Calendar buscaDespesaVencimento(int id) {
        Calendar despesas = Calendar.getInstance();
        EntityManager em = getEntityManager();
        UsuarioController uc = new UsuarioController();
        try{
           despesas = (Calendar) em.createNamedQuery("Despesa.selecionarVencimento").setParameter("id",id).getSingleResult();
            
           return despesas;
        }catch(Exception e){
            System.out.println("Erro na linha 147 (DespesaDAO)!");
            return despesas;
        }
    }
    
    
    
    
    
    public void update(Despesa despesa,int id, double valor) {
        EntityManager em = getEntityManager();
        try{
            em = getEntityManager();
            em.getTransaction().begin();
            despesa.setValorPagar(valor);
            despesa.setId(id);
            cont = despesa;
            despesa = em.merge(despesa);
            em.getTransaction().commit();
           
        }catch(Exception e){
            System.out.println("Erro na linha 187 (DespesaDAO)!");
        }
    }
    
    public void updateVencimento(Despesa despesa,int id, Calendar c) {
        EntityManager em = getEntityManager();
        UsuarioController uc = new UsuarioController();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        try{
            em = getEntityManager();
            em.getTransaction().begin();
            despesa.setDataVencimento(c);
            despesa.setId(id);
            cont = despesa;
            despesa = em.merge(despesa);
            em.getTransaction().commit();
           
        }catch(Exception e){
            System.out.println("Erro na linha 187 (DespesaDAO)!");
        }
    }
    
   public Despesa retornaDespesa(){
        return cont;
    }
   public double retornaDespesaValor(){
        return cont.getValor();
    }
   public int retornaDespesaIndex(){
        return 1;
    }
   public String retornaDespesasituacao(int id){
        String despesas = "";
        EntityManager em = getEntityManager();
        UsuarioController uc = new UsuarioController();
        try{
           despesas = (String) em.createNamedQuery("Despesa.selecionarSituacao").setParameter("id",id).getSingleResult();
            
           return despesas;
        }catch(Exception e){
            System.out.println("Erro na linha 147 (DespesaDAO)!");
            return "false";
        }
    }
    
    public void reduzParcela(Despesa despesa,int vezes, int id) {
        EntityManager em = getEntityManager();
        UsuarioController uc = new UsuarioController();
        try{
            em = getEntityManager();
            em.getTransaction().begin();
           // despesa.setVezesPagar(vezes);
            despesa.setId(id);
            cont = despesa;
            despesa = em.merge(despesa);
            em.getTransaction().commit();
           
        }catch(Exception e){
            System.out.println("Erro na linha 187 (DespesaDAO)!");
        }
    }
    
    public void alterarSituacao(Despesa despesa, int id) {
        EntityManager em = getEntityManager();
        UsuarioController uc = new UsuarioController();
        try{
            em = getEntityManager();
            em.getTransaction().begin();
            despesa.setSituacao("Fechado");
            despesa.setId(id);
            cont = despesa;
            despesa = em.merge(despesa);
            em.getTransaction().commit();
           
        }catch(Exception e){
            System.out.println("Erro na linha 187 (DespesaDAO)!");
        }
    }
    
    public List<Despesa> contaPagarFiltroDescricao(String descricao) {
        List<Despesa> despesas = null;
        EntityManager em = getEntityManager();
        try{
           despesas = em.createNamedQuery("Despesa.buscaPorDescricao").setParameter("descricao",descricao).getResultList();
           return despesas;
        }catch(Exception e){
            
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }
    
    public double retornaValorTotalD(Date dInicio, Date dFim,String situacao,String descricao,int idD){
            EntityManager em = getEntityManager();
            double id;
            Calendar c = Calendar.getInstance();
            Calendar c2 = Calendar.getInstance();
            
            try{
                Query query = em.createNamedQuery("Despesa.valorTotalD");
                c.setTime(dInicio);
                query.setParameter("dInicio", c);
                
                c2.setTime(dFim);
                query.setParameter("dFim", c2);
                query.setParameter("situacao", situacao);
                query.setParameter("descricao", descricao);
                query.setParameter("id", idD);
                id = (double) query.getSingleResult();
                return id;
            }catch (Exception e){
                System.out.println("Erro ao 218" + e.getMessage());
                return 0;
            }
        }
    
     public double retornaValorTotaLucro(String dInicio, String dFim){
            EntityManager em = getEntityManager();
            double id;
            
            try{
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                Query query = em.createNamedQuery("Despesa.valorTotaLucro");
                Calendar c = Calendar.getInstance();
                c.setTime(sdf.parse(dInicio));
                Calendar c2 = Calendar.getInstance();
                c2.setTime(sdf.parse(dFim));
                query.setParameter("dInicio", c);
                query.setParameter("dFim", c2);
                id = (double) query.getSingleResult();
                return id;
            }catch (Exception e){
                System.out.println("NÃO É UM ERRO!!!!");
                Logger.getLogger(DespesaDAO.class.getName()).log(Level.SEVERE, null, e);
                return 0;
            }
        }
    
    public void relatorioContaPagar(String situacao,String dInicio, String dFim, String descricao,int id){
        Connection conn;
        Component rootPane = null;
        JasperPrint jasperPrint = null;
        try {
            conn = ConnectionFactory.getInstance().getConnection();
        
        
        String src = "C:\\VsN\\relatorios\\relatorioContasPagarGeral.jasper";
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Map param = new HashMap();
        param.put("total",this.retornaValorTotalD(sdf.parse(dInicio),sdf.parse(dFim),situacao,descricao,id));
        param.put("dataInicio",sdf.parse(dInicio));
        param.put("dataFim",sdf.parse(dFim));
        param.put("situacao",situacao);
        param.put("descricao", descricao);
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
