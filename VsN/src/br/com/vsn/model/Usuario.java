
package br.com.vsn.model;

/**
 *
 * @author vitor
 */
import br.com.vsn.controller.UsuarioController;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author vitor
 */
@Entity
@NamedQueries({
        @NamedQuery(name = "Usuario.findByLoginAndSenha", 
                query = "SELECT u FROM Usuario u "
                        + "WHERE u.login = :login "
                        + "AND u.senha = :senha"),
        @NamedQuery(name = "Usuario.getId", 
                query = "SELECT u.id FROM Usuario u "
                        + "WHERE u.login = :login "
                        + "AND u.senha = :senha")
})
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @Column(nullable = false, unique = true)
    private String login;
    
    @Column(nullable = false, unique = true)
    private String cpf;
    
    @Column(nullable = false)
    private String senha;
    
    
    public Integer getId() {
        return id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public Usuario(){
        
    }
    
    public Usuario(Usuario usuario){
        UsuarioController uc = new UsuarioController();
    }
    
    public Usuario(Integer id){
        this.id=id;
    }
    

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}

