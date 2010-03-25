/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sgps.classeMapeada;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author martins
 */
@Entity
@Table(name = "TELASISTEMA", catalog = "sgps", schema = "")
@NamedQueries({
    @NamedQuery(name = "Telasistema.findAll", query = "SELECT t FROM Telasistema t"),
    @NamedQuery(name = "Telasistema.findByIdtelasistema", query = "SELECT t FROM Telasistema t WHERE t.idtelasistema = :idtelasistema"),
    @NamedQuery(name = "Telasistema.findByNometelasistema", query = "SELECT t FROM Telasistema t WHERE t.nometelasistema = :nometelasistema"),
    @NamedQuery(name = "Telasistema.findByNomevisualizacaosistema", query = "SELECT t FROM Telasistema t WHERE t.nomevisualizacaosistema = :nomevisualizacaosistema"),
    @NamedQuery(name = "Telasistema.findByStatustelasistema", query = "SELECT t FROM Telasistema t WHERE t.statustelasistema = :statustelasistema")})
public class Telasistema implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDTELASISTEMA", nullable = false)
    private Integer idtelasistema;
    @Basic(optional = false)
    @Column(name = "NOMETELASISTEMA", nullable = false, length = 80)
    private String nometelasistema;
    @Column(name = "NOMEVISUALIZACAOSISTEMA", length = 40)
    private String nomevisualizacaosistema;
    @Column(name = "STATUSTELASISTEMA")
    private Boolean statustelasistema;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "telasistema")
    private List<Acessousuario> acessousuarioList;

    public Telasistema() {
    }

    public Telasistema(Integer idtelasistema) {
        this.idtelasistema = idtelasistema;
    }

    public Telasistema(Integer idtelasistema, String nometelasistema) {
        this.idtelasistema = idtelasistema;
        this.nometelasistema = nometelasistema;
    }

    public Integer getIdtelasistema() {
        return idtelasistema;
    }

    public void setIdtelasistema(Integer idtelasistema) {
        this.idtelasistema = idtelasistema;
    }

    public String getNometelasistema() {
        return nometelasistema;
    }

    public void setNometelasistema(String nometelasistema) {
        this.nometelasistema = nometelasistema;
    }

    public String getNomevisualizacaosistema() {
        return nomevisualizacaosistema;
    }

    public void setNomevisualizacaosistema(String nomevisualizacaosistema) {
        this.nomevisualizacaosistema = nomevisualizacaosistema;
    }

    public Boolean getStatustelasistema() {
        return statustelasistema;
    }

    public void setStatustelasistema(Boolean statustelasistema) {
        this.statustelasistema = statustelasistema;
    }

    public List<Acessousuario> getAcessousuarioList() {
        return acessousuarioList;
    }

    public void setAcessousuarioList(List<Acessousuario> acessousuarioList) {
        this.acessousuarioList = acessousuarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtelasistema != null ? idtelasistema.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Telasistema)) {
            return false;
        }
        Telasistema other = (Telasistema) object;
        if ((this.idtelasistema == null && other.idtelasistema != null) || (this.idtelasistema != null && !this.idtelasistema.equals(other.idtelasistema))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sgps.classeMapeada.Telasistema[idtelasistema=" + idtelasistema + "]";
    }

}
