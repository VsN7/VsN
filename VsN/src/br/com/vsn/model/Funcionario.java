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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
/**
 *
 * @author vitor
 */

@Entity(name = "Funcionario")
@NamedQueries({
    
    @NamedQuery(name = "Funcionario.findAll", 
                query = "SELECT f FROM Funcionario f"),
    
     @NamedQuery(name = "Funcionario.buscaPorId", 
                query = "SELECT f FROM Funcionario f WHERE f.id = :id "),
     
        @NamedQuery(name = "Funcionario.getIdCpf", 
                query = "SELECT f.id FROM Funcionario f "
                        + "WHERE f.cpf = :cpf "),
        
        @NamedQuery(name = "Funcionario.getAll", 
                query = "SELECT f.id FROM Funcionario f "
                        + "WHERE f.nome = :nome "
                        + "AND f.funcao = :funcao ")
    
})
public class Funcionario implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false, unique = true)
    private String cpf;
    private String caminhoImg;
    @Column(nullable = false)
    private String login;
    @Column(nullable = false)
    private String funcao;
    private String telefone;
    @Temporal(TemporalType.DATE)
    private Calendar dataNascimento;
    private String sexo;
    private String email;
    private String situacao;
    private int Usuario_id;

    public int getUsuario_id() {
        return Usuario_id;
    }

    public void setUsuario_id(int Usuario_id) {
        this.Usuario_id = Usuario_id;
    }
    
    
    
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
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
