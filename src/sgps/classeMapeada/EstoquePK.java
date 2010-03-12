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
 * @author Daniel
 */
@Embeddable
public class EstoquePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "IDESTOQUE")
    private int idestoque;
    @Basic(optional = false)
    @Column(name = "TIPOOPERACAOESTOQUE")
    private String tipooperacaoestoque;
    @Basic(optional = false)
    @Column(name = "CODIGOENTRADAESTOQUE")
    private int codigoentradaestoque;

    public EstoquePK() {
    }

    public EstoquePK(int idestoque, String tipooperacaoestoque, int codigoentradaestoque) {
        this.idestoque = idestoque;
        this.tipooperacaoestoque = tipooperacaoestoque;
        this.codigoentradaestoque = codigoentradaestoque;
    }

    public int getIdestoque() {
        return idestoque;
    }

    public void setIdestoque(int idestoque) {
        this.idestoque = idestoque;
    }

    public String getTipooperacaoestoque() {
        return tipooperacaoestoque;
    }

    public void setTipooperacaoestoque(String tipooperacaoestoque) {
        this.tipooperacaoestoque = tipooperacaoestoque;
    }

    public int getCodigoentradaestoque() {
        return codigoentradaestoque;
    }

    public void setCodigoentradaestoque(int codigoentradaestoque) {
        this.codigoentradaestoque = codigoentradaestoque;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idestoque;
        hash += (tipooperacaoestoque != null ? tipooperacaoestoque.hashCode() : 0);
        hash += (int) codigoentradaestoque;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstoquePK)) {
            return false;
        }
        EstoquePK other = (EstoquePK) object;
        if (this.idestoque != other.idestoque) {
            return false;
        }
        if ((this.tipooperacaoestoque == null && other.tipooperacaoestoque != null) || (this.tipooperacaoestoque != null && !this.tipooperacaoestoque.equals(other.tipooperacaoestoque))) {
            return false;
        }
        if (this.codigoentradaestoque != other.codigoentradaestoque) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sgps.classeMapeada.EstoquePK[idestoque=" + idestoque + ", tipooperacaoestoque=" + tipooperacaoestoque + ", codigoentradaestoque=" + codigoentradaestoque + "]";
    }

}
