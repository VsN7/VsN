
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
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author vitor
 */


@Entity(name = "Despesa")
@NamedQueries({
    
    @NamedQuery(name = "Despesa.findAll", 
                query = "SELECT d FROM Despesa d"),
    
    @NamedQuery(name = "Despesa.buscaPorId", 
                query = "SELECT d FROM Despesa d WHERE d.id = :id"),
    
    @NamedQuery(name = "Despesa.buscaPorDescricao", 
                query = "SELECT d FROM Despesa d WHERE d.descricao LIKE :descricao"),
    @NamedQuery(name = "Despesa.valorTotalD", 
                query = "SELECT SUM(d.valorPagar) FROM Despesa d where (d.id = :id) or (d.dataVencimento between :dInicio and :dFim AND (d.situacao like :situacao) AND (d.descricao like :descricao))"),
    @NamedQuery(name = "Despesa.valorTotaLucro", 
                query = "SELECT SUM(d.valorPagar) FROM Despesa d WHERE  d.dataVencimento between :dInicio and :dFim and d.situacao = 'ABERTO'"),
})
public class Despesa implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(length = 30)
    private String descricao;
    private int Parcelas;
    private int ParcelasPagar;
    private double valor;
    private double valorPagar;
    @Temporal(TemporalType.DATE)
    private Calendar dataInicio;
    @Temporal(TemporalType.DATE)
    private Calendar dataVencimento;
    private String situacao;
    @ManyToOne
    private Usuario usuario;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getParcelas() {
        return Parcelas;
    }

    public void setParcelas(int Parcelas) {
        this.Parcelas = Parcelas;
    }

    public int getParcelasPagar() {
        return ParcelasPagar;
    }

    public void setParcelasPagar(int ParcelasPagar) {
        this.ParcelasPagar = ParcelasPagar;
    }

    
    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(double valorPagar) {
        this.valorPagar = valorPagar;
    }
    
    public Calendar getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Calendar dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Calendar getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Calendar dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    
    
    
    
}
