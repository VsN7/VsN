package br.com.vsn.model;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Persistence;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author vitor
 */

@Entity(name = "Conta")
@NamedQueries({
        @NamedQuery(name = "Conta.buscaPorId", 
                query = "SELECT c FROM Conta c WHERE c.id = :id "),        
    
    
        @NamedQuery(name = "Conta.selecionar", 
                query = "SELECT c FROM Conta c ORDER BY id DESC"),
        
        
        @NamedQuery(name = "Conta.buscaPorTitulo", 
                query = "SELECT c FROM Conta c WHERE c.titulo like :titulo ORDER BY id DESC"),
        @NamedQuery(name = "Conta.buscaPorCliente",  
                query = "SELECT c FROM Conta c WHERE c.cliente like :cliente ORDER BY id DESC"),
        @NamedQuery(name = "Conta.buscaPorIdC", 
                query = "SELECT c FROM Conta c WHERE c.id = :id"),
        @NamedQuery(name = "Conta.contaUnico", 
                query = "SELECT c FROM Conta c WHERE c.id = :idC"),
        @NamedQuery(name = "Conta.selecionarContaIdPagamento", 
                query = "SELECT c FROM Conta c WHERE c.pagamento_id = :idP and c.usuario.id = :id "),
        @NamedQuery(name = "Conta.selecionarSituacao", 
                query = "SELECT c.situacao FROM Conta c WHERE c.id = :id"),
        @NamedQuery(name = "Conta.valorTotalD", 
                query = "SELECT SUM(c.valorPagar) FROM Conta c where (c.id = :id) or (c.dataVencimento between :dInicio and :dFim AND (c.situacao like :situacao) AND (c.titulo like :titulo) AND (c.cliente like :cliente) )"),
})
public class Conta implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String titulo;
    private double valor;
    private boolean parcelado;
    private int vezes;
    private String situacao;
    private double valorPagar;
    private int vezesPagar;
    private int pagamento_id;
    private String cliente;
    
    @Temporal(TemporalType.DATE)
    private Calendar dataPagamento;
    @Temporal(TemporalType.DATE)
    private Calendar dataCompra;
    @Temporal(TemporalType.DATE)
    private Calendar dataVencimento;

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
    

    public int getPagamento_id() {
        return pagamento_id;
    }

    public void setPagamento_id(int pagamento_id) {
        this.pagamento_id = pagamento_id;
    }

    
    
    public double getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(double valorPagar) {
        this.valorPagar = valorPagar;
    }

    public int getVezesPagar() {
        return vezesPagar;
    }

    public void setVezesPagar(int vezesPagar) {
        this.vezesPagar = vezesPagar;
    }
    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    
    public Calendar getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Calendar dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
    
    @ManyToOne
    private Usuario usuario;
    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public Conta(String titulo, double valor, boolean parcelado, int vezes, Calendar dataCompra, String situacao) {
        this.titulo = titulo;
        this.valor = valor;
        this.parcelado = parcelado;
        this.vezes = vezes;
        this.dataCompra = dataCompra;
        this.situacao = situacao;
    }

    public Conta() {
        this.dataCompra = Calendar.getInstance();
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isParcelado() {
        return parcelado;
    }

    public void setParcelado(boolean parcelado) {
        this.parcelado = parcelado;
    }

    public int getVezes() {
        return vezes;
    }

    public void setVezes(int vezes) {
        this.vezes = vezes;
    }

    public Calendar getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Calendar dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    
    
    public Calendar getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Calendar dataCompra) {
        this.dataCompra = dataCompra;
    }
    

}

