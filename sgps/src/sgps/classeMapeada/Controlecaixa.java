/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sgps.classeMapeada;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author martins
 */
@Entity
@Table(name = "CONTROLECAIXA", catalog = "sgps", schema = "")
@NamedQueries({
    @NamedQuery(name = "Controlecaixa.findAll", query = "SELECT c FROM Controlecaixa c"),
    @NamedQuery(name = "Controlecaixa.findByIdcontrolecaixa", query = "SELECT c FROM Controlecaixa c WHERE c.controlecaixaPK.idcontrolecaixa = :idcontrolecaixa"),
    @NamedQuery(name = "Controlecaixa.findByDataaberturacontrolecaixa", query = "SELECT c FROM Controlecaixa c WHERE c.controlecaixaPK.dataaberturacontrolecaixa = :dataaberturacontrolecaixa"),
    @NamedQuery(name = "Controlecaixa.findByDatahoraaberturacontrolecaixa", query = "SELECT c FROM Controlecaixa c WHERE c.datahoraaberturacontrolecaixa = :datahoraaberturacontrolecaixa"),
    @NamedQuery(name = "Controlecaixa.findByStatuscontrolecaixa", query = "SELECT c FROM Controlecaixa c WHERE c.statuscontrolecaixa = :statuscontrolecaixa"),
    @NamedQuery(name = "Controlecaixa.findByDatahorafechamentocontrolecaixa", query = "SELECT c FROM Controlecaixa c WHERE c.datahorafechamentocontrolecaixa = :datahorafechamentocontrolecaixa"),
    @NamedQuery(name = "Controlecaixa.findByValorcaixacontrolecaixa", query = "SELECT c FROM Controlecaixa c WHERE c.valorcaixacontrolecaixa = :valorcaixacontrolecaixa")})
public class Controlecaixa implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ControlecaixaPK controlecaixaPK;
    @Basic(optional = false)
    @Column(name = "DATAHORAABERTURACONTROLECAIXA", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date datahoraaberturacontrolecaixa;
    @Basic(optional = false)
    @Column(name = "STATUSCONTROLECAIXA", nullable = false)
    private int statuscontrolecaixa;
    @Basic(optional = false)
    @Column(name = "DATAHORAFECHAMENTOCONTROLECAIXA", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date datahorafechamentocontrolecaixa;
    @Column(name = "VALORCAIXACONTROLECAIXA", precision = 11, scale = 2)
    private BigDecimal valorcaixacontrolecaixa;
    @JoinColumn(name = "IDUSUARIOCONTROLECAIXA", referencedColumnName = "IDUSUARIO", nullable = false)
    @ManyToOne(optional = false)
    private Usuario idusuariocontrolecaixa;
    @JoinColumn(name = "IDCONTACORRENTECONTROLECAIXA", referencedColumnName = "IDCONTACORRENTE")
    @ManyToOne
    private Contacorrente idcontacorrentecontrolecaixa;
    @JoinColumn(name = "IDTIPOMOVFINANCEIROCONTROLECAIXA", referencedColumnName = "IDTIPOMOVFINANCEIRO")
    @ManyToOne
    private Tipomovimentofinanceiro idtipomovfinanceirocontrolecaixa;
    @OneToMany(mappedBy = "controlecaixa")
    private List<Movimentocaixa> movimentocaixaList;
    @OneToMany(mappedBy = "controlecaixa")
    private List<Movimentofinanceiro> movimentofinanceiroList;

    public Controlecaixa() {
    }

    public Controlecaixa(ControlecaixaPK controlecaixaPK) {
        this.controlecaixaPK = controlecaixaPK;
    }

    public Controlecaixa(ControlecaixaPK controlecaixaPK, Date datahoraaberturacontrolecaixa, int statuscontrolecaixa, Date datahorafechamentocontrolecaixa) {
        this.controlecaixaPK = controlecaixaPK;
        this.datahoraaberturacontrolecaixa = datahoraaberturacontrolecaixa;
        this.statuscontrolecaixa = statuscontrolecaixa;
        this.datahorafechamentocontrolecaixa = datahorafechamentocontrolecaixa;
    }

    public Controlecaixa(int idcontrolecaixa, Date dataaberturacontrolecaixa) {
        this.controlecaixaPK = new ControlecaixaPK(idcontrolecaixa, dataaberturacontrolecaixa);
    }

    public ControlecaixaPK getControlecaixaPK() {
        return controlecaixaPK;
    }

    public void setControlecaixaPK(ControlecaixaPK controlecaixaPK) {
        this.controlecaixaPK = controlecaixaPK;
    }

    public Date getDatahoraaberturacontrolecaixa() {
        return datahoraaberturacontrolecaixa;
    }

    public void setDatahoraaberturacontrolecaixa(Date datahoraaberturacontrolecaixa) {
        this.datahoraaberturacontrolecaixa = datahoraaberturacontrolecaixa;
    }

    public int getStatuscontrolecaixa() {
        return statuscontrolecaixa;
    }

    public void setStatuscontrolecaixa(int statuscontrolecaixa) {
        this.statuscontrolecaixa = statuscontrolecaixa;
    }

    public Date getDatahorafechamentocontrolecaixa() {
        return datahorafechamentocontrolecaixa;
    }

    public void setDatahorafechamentocontrolecaixa(Date datahorafechamentocontrolecaixa) {
        this.datahorafechamentocontrolecaixa = datahorafechamentocontrolecaixa;
    }

    public BigDecimal getValorcaixacontrolecaixa() {
        return valorcaixacontrolecaixa;
    }

    public void setValorcaixacontrolecaixa(BigDecimal valorcaixacontrolecaixa) {
        this.valorcaixacontrolecaixa = valorcaixacontrolecaixa;
    }

    public Usuario getIdusuariocontrolecaixa() {
        return idusuariocontrolecaixa;
    }

    public void setIdusuariocontrolecaixa(Usuario idusuariocontrolecaixa) {
        this.idusuariocontrolecaixa = idusuariocontrolecaixa;
    }

    public Contacorrente getIdcontacorrentecontrolecaixa() {
        return idcontacorrentecontrolecaixa;
    }

    public void setIdcontacorrentecontrolecaixa(Contacorrente idcontacorrentecontrolecaixa) {
        this.idcontacorrentecontrolecaixa = idcontacorrentecontrolecaixa;
    }

    public Tipomovimentofinanceiro getIdtipomovfinanceirocontrolecaixa() {
        return idtipomovfinanceirocontrolecaixa;
    }

    public void setIdtipomovfinanceirocontrolecaixa(Tipomovimentofinanceiro idtipomovfinanceirocontrolecaixa) {
        this.idtipomovfinanceirocontrolecaixa = idtipomovfinanceirocontrolecaixa;
    }

    public List<Movimentocaixa> getMovimentocaixaList() {
        return movimentocaixaList;
    }

    public void setMovimentocaixaList(List<Movimentocaixa> movimentocaixaList) {
        this.movimentocaixaList = movimentocaixaList;
    }

    public List<Movimentofinanceiro> getMovimentofinanceiroList() {
        return movimentofinanceiroList;
    }

    public void setMovimentofinanceiroList(List<Movimentofinanceiro> movimentofinanceiroList) {
        this.movimentofinanceiroList = movimentofinanceiroList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (controlecaixaPK != null ? controlecaixaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Controlecaixa)) {
            return false;
        }
        Controlecaixa other = (Controlecaixa) object;
        if ((this.controlecaixaPK == null && other.controlecaixaPK != null) || (this.controlecaixaPK != null && !this.controlecaixaPK.equals(other.controlecaixaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sgps.classeMapeada.Controlecaixa[controlecaixaPK=" + controlecaixaPK + "]";
    }

}
