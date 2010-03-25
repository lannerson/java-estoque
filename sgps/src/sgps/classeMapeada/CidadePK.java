/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sgps.classeMapeada;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author martins
 */
@Embeddable
public class CidadePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "IDCIDADE", nullable = false)
    private int idcidade;
    @Basic(optional = false)
    @Column(name = "NOMECIDADE", nullable = false, length = 60)
    private String nomecidade;

    public CidadePK() {
    }

    public CidadePK(int idcidade, String nomecidade) {
        this.idcidade = idcidade;
        this.nomecidade = nomecidade;
    }

    public int getIdcidade() {
        return idcidade;
    }

    public void setIdcidade(int idcidade) {
        this.idcidade = idcidade;
    }

    public String getNomecidade() {
        return nomecidade;
    }

    public void setNomecidade(String nomecidade) {
        this.nomecidade = nomecidade;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idcidade;
        hash += (nomecidade != null ? nomecidade.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CidadePK)) {
            return false;
        }
        CidadePK other = (CidadePK) object;
        if (this.idcidade != other.idcidade) {
            return false;
        }
        if ((this.nomecidade == null && other.nomecidade != null) || (this.nomecidade != null && !this.nomecidade.equals(other.nomecidade))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sgps.classeMapeada.CidadePK[idcidade=" + idcidade + ", nomecidade=" + nomecidade + "]";
    }

}
