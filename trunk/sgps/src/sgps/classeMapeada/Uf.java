/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sgps.classeMapeada;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
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
@Table(name = "UF", catalog = "sgps", schema = "")
@NamedQueries({
    @NamedQuery(name = "Uf.findAll", query = "SELECT u FROM Uf u"),
    @NamedQuery(name = "Uf.findByIdestado", query = "SELECT u FROM Uf u WHERE u.idestado = :idestado"),
    @NamedQuery(name = "Uf.findByNomeestado", query = "SELECT u FROM Uf u WHERE u.nomeestado = :nomeestado")})
public class Uf implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDESTADO", nullable = false, length = 2)
    private String idestado;
    @Basic(optional = false)
    @Column(name = "NOMEESTADO", nullable = false, length = 30)
    private String nomeestado;
    @OneToMany(mappedBy = "siglaestadocidade")
    private List<Cidade> cidadeList;

    public Uf() {
    }

    public Uf(String idestado) {
        this.idestado = idestado;
    }

    public Uf(String idestado, String nomeestado) {
        this.idestado = idestado;
        this.nomeestado = nomeestado;
    }

    public String getIdestado() {
        return idestado;
    }

    public void setIdestado(String idestado) {
        this.idestado = idestado;
    }

    public String getNomeestado() {
        return nomeestado;
    }

    public void setNomeestado(String nomeestado) {
        this.nomeestado = nomeestado;
    }

    public List<Cidade> getCidadeList() {
        return cidadeList;
    }

    public void setCidadeList(List<Cidade> cidadeList) {
        this.cidadeList = cidadeList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idestado != null ? idestado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Uf)) {
            return false;
        }
        Uf other = (Uf) object;
        if ((this.idestado == null && other.idestado != null) || (this.idestado != null && !this.idestado.equals(other.idestado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sgps.classeMapeada.Uf[idestado=" + idestado + "]";
    }

}
