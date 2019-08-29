
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

@Entity(name = "Orcamento")
@NamedQueries({
        @NamedQuery(name = "Orcamento.selecionar", 
                query = "SELECT o FROM Orcamento o WHERE o.usuario.id = :id "),
                
        @NamedQuery(name = "Orcamento.ordemServicoOrcamentoId", 
                query = "SELECT os.id FROM OrdemServico os WHERE os.orcamento_id = :id "),
        @NamedQuery(name = "Orcamento.buscaPorId", 
                query = "SELECT o FROM Orcamento o WHERE o.id = :id "),
        
        @NamedQuery(name = "Orcamento.valorTotal", 
                query = "SELECT SUM(o.valor) FROM Orcamento o"),
        
        @NamedQuery(name = "Orcamento.valorTotalD", 
                query = "SELECT SUM(o.valor) FROM Orcamento o where previsaoEntrega between :dInicio and :dFim AND (o.situacao = :situacao OR situacao = :s2)"),
        @NamedQuery(name = "Orcamento.valorTotalS", 
                query = "SELECT SUM(o.valor) FROM Orcamento o where (o.situacao = :situacao OR o.situacao = :s2)"),
})


public class Orcamento implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(nullable = false)
    private double valor;
    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Calendar dataInicio;
    @Temporal(TemporalType.DATE)
    private Calendar dataFinalizacao;
    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Calendar previsaoEntrega;
    @Column(nullable = false)
    private String servico;
    @Column(nullable = false)
    private String cliente;
    private String observacoes;
    private String situacao;
    private String cpf;
    private String veiculo;
    private String modelo;
    private String placa;
    private String atendente;

    private int ordemServico_id;
    
    @ManyToOne
    private Usuario usuario;
    

    public int getOrdemServico_id() {
        return ordemServico_id;
    }

    public void setOrdemServico_id(int ordemServico_id) {
        this.ordemServico_id = ordemServico_id;
    }
    
    
    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public String getAtendente() {
        return atendente;
    }

    public void setAtendente(String atendente) {
        this.atendente = atendente;
    }

    
    
    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public Calendar getDataFinalizacao() {
        return dataFinalizacao;
    }

    public void setDataFinalizacao(Calendar dataFinalizacao) {
        this.dataFinalizacao = dataFinalizacao;
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

    public Calendar getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Calendar dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Calendar getPrevisaoEntrega() {
        return previsaoEntrega;
    }

    public void setPrevisaoEntrega(Calendar previsaoEntrega) {
        this.previsaoEntrega = previsaoEntrega;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
}
