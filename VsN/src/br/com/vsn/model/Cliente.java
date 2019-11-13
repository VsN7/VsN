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
 * @author vitor
 */


@Entity(name = "Cliente")
@NamedQueries({
    
    @NamedQuery(name = "Cliente.findAll", 
                query = "SELECT c FROM Cliente c"),
    
    @NamedQuery(name = "Cliente.findAllP", 
                query = "SELECT c FROM Cliente c WHERE c.situacao = 'ATIVO'"),
    
     @NamedQuery(name = "Cliente.buscaPorId", 
                query = "SELECT c FROM Cliente c WHERE c.id = :id "),
     
     @NamedQuery(name = "Cliente.buscaPorNome", 
                query = "SELECT c FROM Cliente c WHERE c.nome LIKE :nome and c.situacao = 'ATIVO'"),
     
     @NamedQuery(name = "Cliente.buscaPorCpf", 
                query = "SELECT c FROM Cliente c WHERE c.cpf LIKE :cpf and c.situacao = 'ATIVO'"),
    
})
public class Cliente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false, unique = true)
    private String cpf;
    private String caminhoImg;
    private String longradouro;
    private int numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private String telefone;
    @Temporal(TemporalType.DATE)
    private Calendar dataNascimento;
    private String sexo;
    private String email;
    private String situacao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCaminhoImg() {
        return caminhoImg;
    }

    public void setCaminhoImg(String caminhoImg) {
        this.caminhoImg = caminhoImg;
    }
    
    
    
    public String getLongradouro() {
        return longradouro;
    }

    public void setLongradouro(String longradouro) {
        this.longradouro = longradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    
    
    
}
