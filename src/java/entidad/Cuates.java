/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Emanuelle Zu
 */
@Entity
@Table(name = "cuates")
@NamedQueries({
    @NamedQuery(name = "Cuates.findAll", query = "SELECT c FROM Cuates c")
    , @NamedQuery(name = "Cuates.findByTel", query = "SELECT c FROM Cuates c WHERE c.tel = :tel")
    , @NamedQuery(name = "Cuates.findByLogin", query = "SELECT c FROM Cuates c WHERE c.login = :login")
    , @NamedQuery(name = "Cuates.findByPwd", query = "SELECT c FROM Cuates c WHERE c.pwd = :pwd")
    , @NamedQuery(name = "Cuates.findByNombres", query = "SELECT c FROM Cuates c WHERE c.nombres = :nombres")
    , @NamedQuery(name = "Cuates.findByApellidos", query = "SELECT c FROM Cuates c WHERE c.apellidos = :apellidos")
    , @NamedQuery(name = "Cuates.findByCuotas", query = "SELECT c FROM Cuates c WHERE c.cuotas = :cuotas")
    , @NamedQuery(name = "Cuates.findByEmail", query = "SELECT c FROM Cuates c WHERE c.email = :email")})
public class Cuates implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "tel")
    private String tel;
    @Size(max = 20)
    @Column(name = "login")
    private String login;
    @Size(max = 25)
    @Column(name = "pwd")
    private String pwd;
    @Size(max = 30)
    @Column(name = "nombres")
    private String nombres;
    @Size(max = 30)
    @Column(name = "apellidos")
    private String apellidos;
    @Column(name = "cuotas")
    private Integer cuotas;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 40)
    @Column(name = "email")
    private String email;

    public Cuates() {
    }

    public Cuates(String tel) {
        this.tel = tel;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getCuotas() {
        return cuotas;
    }

    public void setCuotas(Integer cuotas) {
        this.cuotas = cuotas;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tel != null ? tel.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cuates)) {
            return false;
        }
        Cuates other = (Cuates) object;
        if ((this.tel == null && other.tel != null) || (this.tel != null && !this.tel.equals(other.tel))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidad.Cuates[ tel=" + tel + " ]";
    }
    
}
