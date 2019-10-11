
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
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Vitor
 */

@Entity(name = "OrdemServico")
@NamedQueries({
        @NamedQuery(name = "OrdemServico.selecionar", 
                query = "SELECT os FROM OrdemServico os WHERE os.usuario.id = :id "),
                
        @NamedQuery(name = "OrdemServico.buscaPorId", 
                query = "SELECT os FROM OrdemServico os WHERE os.id = :id "),
        
        @NamedQuery(name = "OrdemServico.valorTotal", 
                query = "SELECT SUM(os.valor) FROM OrdemServico os"),
        
        @NamedQuery(name = "OrdemServico.valorTotalD", 
                query = "SELECT SUM(os.valor) FROM OrdemServico os where id = :idOS or (previsaoEntrega between :dInicio and :dFim AND (os.situacao like :situacao) AND os.cliente like :cliente and servico like :servico)"),
        @NamedQuery(name = "OrdemServico.valorTotalS", 
                query = "SELECT SUM(os.valor) FROM OrdemServico os where (os.situacao = :situacao OR os.situacao = :s2)"),
        @NamedQuery(name = "OrdemServico.buscaPorNome", 
                query = "SELECT os FROM OrdemServico os WHERE os.cliente LIKE :nome and os.usuario.id = :id "),
        @NamedQuery(name = "OrdemServico.buscaPorServico", 
                query = "SELECT os FROM OrdemServico os WHERE os.servico LIKE :servico and os.usuario.id = :id "),
        
})


public class OrdemServico implements Serializable{

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
    private String marca;
    private int ano;
    private String placa;
    private String atendente;
    private int pagamento_id;
    
    @ManyToOne
    private Usuario usuario;
    
    private int orcamento_id;

    public int getPagamento_id() {
        return pagamento_id;
    }

    public void setPagamento_id(int pagamento_id) {
        this.pagamento_id = pagamento_id;
    }

    
    
    public int getOrcamento_id() {
        return orcamento_id;
    }

    public void setOrcamento_id(int orcamento_id) {
        this.orcamento_id = orcamento_id;
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
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
