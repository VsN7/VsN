
package br.com.vsn.model;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author vitor
 */


@Entity(name = "ContaReceber")
@NamedQueries({
    
    @NamedQuery(name = "ContaReceber.findAll", 
                query = "SELECT e FROM ContaReceber e"),
    
     @NamedQuery(name = "ContaReceber.buscaPorId", 
                query = "SELECT e FROM ContaReceber e WHERE e.id = :id "),
    
})
public class ContaReceber implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(length = 30)
    private String TipoPagamento;
    private String Parcelas;
    private String ParcelasPagar;
    private double valor;
    private double valorPagar;
    private String Cliente;
    private String cpf;
    @Temporal(TemporalType.DATE)
    private Calendar dataInicio;
    @Temporal(TemporalType.DATE)
    private Calendar dataVencimento;
    private String situacao;
    private int pagamento_id;
    private Usuario usuario;

    public int getPagamento_id() {
        return pagamento_id;
    }

    public void setPagamento_id(int pagamento_id) {
        this.pagamento_id = pagamento_id;
    }

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

    public String getTipoPagamento() {
        return TipoPagamento;
    }

    public void setTipoPagamento(String TipoPagamento) {
        this.TipoPagamento = TipoPagamento;
    }

    public String getParcelas() {
        return Parcelas;
    }

    public void setParcelas(String Parcelas) {
        this.Parcelas = Parcelas;
    }

    public String getParcelasPagar() {
        return ParcelasPagar;
    }

    public void setParcelasPagar(String ParcelasPagar) {
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

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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
