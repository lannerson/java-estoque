/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sgps.classeMapeada;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Daniel
 */
@Embeddable
public class ControlecaixaPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "IDCONTROLECAIXA")
    private int idcontrolecaixa;
    @Basic(optional = false)
    @Column(name = "DATAABERTURACONTROLECAIXA")
    @Temporal(TemporalType.DATE)
    private Date dataaberturacontrolecaixa;

    public ControlecaixaPK() {
    }

    public ControlecaixaPK(int idcontrolecaixa, Date dataaberturacontrolecaixa) {
        this.idcontrolecaixa = idcontrolecaixa;
        this.dataaberturacontrolecaixa = dataaberturacontrolecaixa;
    }

    public int getIdcontrolecaixa() {
        return idcontrolecaixa;
    }

    public void setIdcontrolecaixa(int idcontrolecaixa) {
        this.idcontrolecaixa = idcontrolecaixa;
    }

    public Date getDataaberturacontrolecaixa() {
        return dataaberturacontrolecaixa;
    }

    public void setDataaberturacontrolecaixa(Date dataaberturacontrolecaixa) {
        this.dataaberturacontrolecaixa = dataaberturacontrolecaixa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idcontrolecaixa;
        hash += (dataaberturacontrolecaixa != null ? dataaberturacontrolecaixa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ControlecaixaPK)) {
            return false;
        }
        ControlecaixaPK other = (ControlecaixaPK) object;
        if (this.idcontrolecaixa != other.idcontrolecaixa) {
            return false;
        }
        if ((this.dataaberturacontrolecaixa == null && other.dataaberturacontrolecaixa != null) || (this.dataaberturacontrolecaixa != null && !this.dataaberturacontrolecaixa.equals(other.dataaberturacontrolecaixa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sgps.classeMapeada.ControlecaixaPK[idcontrolecaixa=" + idcontrolecaixa + ", dataaberturacontrolecaixa=" + dataaberturacontrolecaixa + "]";
    }

}
