
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

@Entity(name = "PagamentoTabela")
@NamedQueries({
        @NamedQuery(name = "PagamentoTabela.selecionar", 
                query = "SELECT pt FROM PagamentoTabela pt WHERE pt.ordemServico_id = :id "),
    })


public class PagamentoTabela implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(nullable = false)
    private double valor;
    private String finalizador;
    @Column(length = 8)
    private String parcelas;
    private int ordemServico_id;

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

    public String getFinalizador() {
        return finalizador;
    }

    public void setFinalizador(String finalizador) {
        this.finalizador = finalizador;
    }

    public String getParcelas() {
        return parcelas;
    }

    public void setParcelas(String parcelas) {
        this.parcelas = parcelas;
    }

    public int getOrdemServico_id() {
        return ordemServico_id;
    }

    public void setOrdemServico_id(int ordemServico_id) {
        this.ordemServico_id = ordemServico_id;
    }

    

    
    
}
