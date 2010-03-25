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
public class AcessousuarioPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "IDUSUARIO", nullable = false)
    private int idusuario;
    @Basic(optional = false)
    @Column(name = "IDTELASISTEMA", nullable = false)
    private int idtelasistema;

    public AcessousuarioPK() {
    }

    public AcessousuarioPK(int idusuario, int idtelasistema) {
        this.idusuario = idusuario;
        this.idtelasistema = idtelasistema;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public int getIdtelasistema() {
        return idtelasistema;
    }

    public void setIdtelasistema(int idtelasistema) {
        this.idtelasistema = idtelasistema;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idusuario;
        hash += (int) idtelasistema;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AcessousuarioPK)) {
            return false;
        }
        AcessousuarioPK other = (AcessousuarioPK) object;
        if (this.idusuario != other.idusuario) {
            return false;
        }
        if (this.idtelasistema != other.idtelasistema) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sgps.classeMapeada.AcessousuarioPK[idusuario=" + idusuario + ", idtelasistema=" + idtelasistema + "]";
    }

}
