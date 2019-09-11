
package br.com.vsn.model;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Vitor
 */

@Entity(name = "Pagamento")
@NamedQueries({
        @NamedQuery(name = "Pagamento.selecionar", 
                query = "SELECT o FROM Pagamento o WHERE o.usuario.id = :id "),
                
        @NamedQuery(name = "Pagamento.ordemServicoPagamentoId", 
                query = "SELECT p FROM Pagamento p WHERE p.ordemServico_id = :id "),
        
        @NamedQuery(name = "Pagamento.buscaPorId", 
                query = "SELECT o FROM Pagamento o WHERE o.id = :id "),
        
        @NamedQuery(name = "Pagamento.valorTotal", 
                query = "SELECT SUM(o.valor) FROM Pagamento o"),
        
        @NamedQuery(name = "Pagamento.valorTotalD", 
                query = "SELECT SUM(o.valor) FROM Pagamento o where previsaoEntrega between :dInicio and :dFim AND (o.situacao = :situacao OR situacao = :s2)"),
        @NamedQuery(name = "Pagamento.valorTotalS", 
                query = "SELECT SUM(o.valor) FROM Pagamento o where (o.situacao = :situacao OR o.situacao = :s2)"),
})


public class Pagamento implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(nullable = false)
    private double valor;
    @Temporal(TemporalType.DATE)
    private Calendar dataFinalizacao;
    private int ordemServico_id;
    private String situacao;
    private double troco;
    @ManyToOne
    private Usuario usuario;

    public double getTroco() {
        return troco;
    }

    public void setTroco(double troco) {
        this.troco = troco;
    }
    
    
    
    public int getOrdemServico_id() {
        return ordemServico_id;
    }

    public void setOrdemServico_id(int ordemServico_id) {
        this.ordemServico_id = ordemServico_id;
    }

    public Calendar getDataFinalizacao() {
        return dataFinalizacao;
    }

    public void setDataFinalizacao(Calendar dataFinalizacao) {
        this.dataFinalizacao = dataFinalizacao;
    }
    
    
    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
  
    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
