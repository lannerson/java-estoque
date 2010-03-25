/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sgps.classeMapeada;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author martins
 */
@Entity
@Table(name = "DOMINIO", catalog = "sgps", schema = "")
@NamedQueries({
    @NamedQuery(name = "Dominio.findAll", query = "SELECT d FROM Dominio d"),
    @NamedQuery(name = "Dominio.findByIddominio", query = "SELECT d FROM Dominio d WHERE d.iddominio = :iddominio"),
    @NamedQuery(name = "Dominio.findByTipodominio", query = "SELECT d FROM Dominio d WHERE d.tipodominio = :tipodominio"),
    @NamedQuery(name = "Dominio.findByCodigodominio", query = "SELECT d FROM Dominio d WHERE d.codigodominio = :codigodominio"),
    @NamedQuery(name = "Dominio.findByDescricaodominio", query = "SELECT d FROM Dominio d WHERE d.descricaodominio = :descricaodominio"),
    @NamedQuery(name = "Dominio.findByStatusdominio", query = "SELECT d FROM Dominio d WHERE d.statusdominio = :statusdominio")})
public class Dominio implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDDOMINIO", nullable = false)
    private Integer iddominio;
    @Column(name = "TIPODOMINIO", length = 15)
    private String tipodominio;
    @Column(name = "CODIGODOMINIO")
    private Integer codigodominio;
    @Column(name = "DESCRICAODOMINIO", length = 40)
    private String descricaodominio;
    @Column(name = "STATUSDOMINIO")
    private Boolean statusdominio;

    public Dominio() {
    }

    public Dominio(Integer iddominio) {
        this.iddominio = iddominio;
    }

    public Integer getIddominio() {
        return iddominio;
    }

    public void setIddominio(Integer iddominio) {
        this.iddominio = iddominio;
    }

    public String getTipodominio() {
        return tipodominio;
    }

    public void setTipodominio(String tipodominio) {
        this.tipodominio = tipodominio;
    }

    public Integer getCodigodominio() {
        return codigodominio;
    }

    public void setCodigodominio(Integer codigodominio) {
        this.codigodominio = codigodominio;
    }

    public String getDescricaodominio() {
        return descricaodominio;
    }

    public void setDescricaodominio(String descricaodominio) {
        this.descricaodominio = descricaodominio;
    }

    public Boolean getStatusdominio() {
        return statusdominio;
    }

    public void setStatusdominio(Boolean statusdominio) {
        this.statusdominio = statusdominio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddominio != null ? iddominio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dominio)) {
            return false;
        }
        Dominio other = (Dominio) object;
        if ((this.iddominio == null && other.iddominio != null) || (this.iddominio != null && !this.iddominio.equals(other.iddominio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sgps.classeMapeada.Dominio[iddominio=" + iddominio + "]";
    }

}
