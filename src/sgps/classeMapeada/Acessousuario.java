/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sgps.classeMapeada;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Daniel
 */
@Entity
@Table(name = "acessousuario")
@NamedQueries({
    @NamedQuery(name = "Acessousuario.findAll", query = "SELECT a FROM Acessousuario a"),
    @NamedQuery(name = "Acessousuario.findByIdusuario", query = "SELECT a FROM Acessousuario a WHERE a.acessousuarioPK.idusuario = :idusuario"),
    @NamedQuery(name = "Acessousuario.findByIdtelasistema", query = "SELECT a FROM Acessousuario a WHERE a.acessousuarioPK.idtelasistema = :idtelasistema"),
    @NamedQuery(name = "Acessousuario.findByCodigotipoacesso", query = "SELECT a FROM Acessousuario a WHERE a.codigotipoacesso = :codigotipoacesso"),
    @NamedQuery(name = "Acessousuario.findByFlagtipoacesso", query = "SELECT a FROM Acessousuario a WHERE a.flagtipoacesso = :flagtipoacesso"),
    @NamedQuery(name = "Acessousuario.findByStatustipoacesso", query = "SELECT a FROM Acessousuario a WHERE a.statustipoacesso = :statustipoacesso")})
public class Acessousuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AcessousuarioPK acessousuarioPK;
    @Basic(optional = false)
    @Column(name = "CODIGOTIPOACESSO")
    private int codigotipoacesso;
    @Column(name = "FLAGTIPOACESSO")
    private Boolean flagtipoacesso;
    @Column(name = "STATUSTIPOACESSO")
    private Integer statustipoacesso;
    @JoinColumn(name = "IDUSUARIO", referencedColumnName = "IDUSUARIO", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Usuario usuario;
    @JoinColumn(name = "IDTELASISTEMA", referencedColumnName = "IDTELASISTEMA", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Telasistema telasistema;

    public Acessousuario() {
    }

    public Acessousuario(AcessousuarioPK acessousuarioPK) {
        this.acessousuarioPK = acessousuarioPK;
    }

    public Acessousuario(AcessousuarioPK acessousuarioPK, int codigotipoacesso) {
        this.acessousuarioPK = acessousuarioPK;
        this.codigotipoacesso = codigotipoacesso;
    }

    public Acessousuario(int idusuario, int idtelasistema) {
        this.acessousuarioPK = new AcessousuarioPK(idusuario, idtelasistema);
    }

    public AcessousuarioPK getAcessousuarioPK() {
        return acessousuarioPK;
    }

    public void setAcessousuarioPK(AcessousuarioPK acessousuarioPK) {
        this.acessousuarioPK = acessousuarioPK;
    }

    public int getCodigotipoacesso() {
        return codigotipoacesso;
    }

    public void setCodigotipoacesso(int codigotipoacesso) {
        this.codigotipoacesso = codigotipoacesso;
    }

    public Boolean getFlagtipoacesso() {
        return flagtipoacesso;
    }

    public void setFlagtipoacesso(Boolean flagtipoacesso) {
        this.flagtipoacesso = flagtipoacesso;
    }

    public Integer getStatustipoacesso() {
        return statustipoacesso;
    }

    public void setStatustipoacesso(Integer statustipoacesso) {
        this.statustipoacesso = statustipoacesso;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Telasistema getTelasistema() {
        return telasistema;
    }

    public void setTelasistema(Telasistema telasistema) {
        this.telasistema = telasistema;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (acessousuarioPK != null ? acessousuarioPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Acessousuario)) {
            return false;
        }
        Acessousuario other = (Acessousuario) object;
        if ((this.acessousuarioPK == null && other.acessousuarioPK != null) || (this.acessousuarioPK != null && !this.acessousuarioPK.equals(other.acessousuarioPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sgps.classeMapeada.Acessousuario[acessousuarioPK=" + acessousuarioPK + "]";
    }

}
