/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sgps.classeMapeada;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author martins
 */
@Entity
@Table(name = "MOVIMENTOFINANCEIRO", catalog = "sgps", schema = "")
@NamedQueries({
    @NamedQuery(name = "Movimentofinanceiro.findAll", query = "SELECT m FROM Movimentofinanceiro m"),
    @NamedQuery(name = "Movimentofinanceiro.findByIdmovfinanceiro", query = "SELECT m FROM Movimentofinanceiro m WHERE m.idmovfinanceiro = :idmovfinanceiro"),
    @NamedQuery(name = "Movimentofinanceiro.findByOrigemmf", query = "SELECT m FROM Movimentofinanceiro m WHERE m.origemmf = :origemmf"),
    @NamedQuery(name = "Movimentofinanceiro.findByDebitocreditomf", query = "SELECT m FROM Movimentofinanceiro m WHERE m.debitocreditomf = :debitocreditomf"),
    @NamedQuery(name = "Movimentofinanceiro.findByValormf", query = "SELECT m FROM Movimentofinanceiro m WHERE m.valormf = :valormf"),
    @NamedQuery(name = "Movimentofinanceiro.findByDocumentomf", query = "SELECT m FROM Movimentofinanceiro m WHERE m.documentomf = :documentomf"),
    @NamedQuery(name = "Movimentofinanceiro.findByNumchequemf", query = "SELECT m FROM Movimentofinanceiro m WHERE m.numchequemf = :numchequemf"),
    @NamedQuery(name = "Movimentofinanceiro.findByComplementomf", query = "SELECT m FROM Movimentofinanceiro m WHERE m.complementomf = :complementomf"),
    @NamedQuery(name = "Movimentofinanceiro.findByStatusmf", query = "SELECT m FROM Movimentofinanceiro m WHERE m.statusmf = :statusmf")})
public class Movimentofinanceiro implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDMOVFINANCEIRO", nullable = false)
    private Integer idmovfinanceiro;
    @Basic(optional = false)
    @Column(name = "ORIGEMMF", nullable = false, length = 2)
    private String origemmf;
    @Column(name = "DEBITOCREDITOMF", length = 1)
    private String debitocreditomf;
    @Column(name = "VALORMF", precision = 11, scale = 2)
    private BigDecimal valormf;
    @Column(name = "DOCUMENTOMF", length = 15)
    private String documentomf;
    @Column(name = "NUMCHEQUEMF")
    private Integer numchequemf;
    @Column(name = "COMPLEMENTOMF", length = 50)
    private String complementomf;
    @Column(name = "STATUSMF")
    private Integer statusmf;
    @JoinColumn(name = "IDTIPOMOVFINANCEIROMF", referencedColumnName = "IDTIPOMOVFINANCEIRO", nullable = false)
    @ManyToOne(optional = false)
    private Tipomovimentofinanceiro idtipomovfinanceiromf;
    @JoinColumn(name = "IDCONTACORRENTEMF", referencedColumnName = "IDCONTACORRENTE", nullable = false)
    @ManyToOne(optional = false)
    private Contacorrente idcontacorrentemf;
    @JoinColumn(name = "IDCONTASPAGARMF", referencedColumnName = "IDCONTASPAGAR")
    @ManyToOne
    private Contaspagar idcontaspagarmf;
    @JoinColumn(name = "IDCONTASRECEBERMF", referencedColumnName = "IDCONTASRECEBER")
    @ManyToOne
    private Contasreceber idcontasrecebermf;
    @JoinColumns({
        @JoinColumn(name = "IDCONTROLECAIXAMF", referencedColumnName = "IDCONTROLECAIXA"),
        @JoinColumn(name = "DATAABERTURACONTROLECAIXAMF", referencedColumnName = "DATAABERTURACONTROLECAIXA")})
    @ManyToOne
    private Controlecaixa controlecaixa;

    public Movimentofinanceiro() {
    }

    public Movimentofinanceiro(Integer idmovfinanceiro) {
        this.idmovfinanceiro = idmovfinanceiro;
    }

    public Movimentofinanceiro(Integer idmovfinanceiro, String origemmf) {
        this.idmovfinanceiro = idmovfinanceiro;
        this.origemmf = origemmf;
    }

    public Integer getIdmovfinanceiro() {
        return idmovfinanceiro;
    }

    public void setIdmovfinanceiro(Integer idmovfinanceiro) {
        this.idmovfinanceiro = idmovfinanceiro;
    }

    public String getOrigemmf() {
        return origemmf;
    }

    public void setOrigemmf(String origemmf) {
        this.origemmf = origemmf;
    }

    public String getDebitocreditomf() {
        return debitocreditomf;
    }

    public void setDebitocreditomf(String debitocreditomf) {
        this.debitocreditomf = debitocreditomf;
    }

    public BigDecimal getValormf() {
        return valormf;
    }

    public void setValormf(BigDecimal valormf) {
        this.valormf = valormf;
    }

    public String getDocumentomf() {
        return documentomf;
    }

    public void setDocumentomf(String documentomf) {
        this.documentomf = documentomf;
    }

    public Integer getNumchequemf() {
        return numchequemf;
    }

    public void setNumchequemf(Integer numchequemf) {
        this.numchequemf = numchequemf;
    }

    public String getComplementomf() {
        return complementomf;
    }

    public void setComplementomf(String complementomf) {
        this.complementomf = complementomf;
    }

    public Integer getStatusmf() {
        return statusmf;
    }

    public void setStatusmf(Integer statusmf) {
        this.statusmf = statusmf;
    }

    public Tipomovimentofinanceiro getIdtipomovfinanceiromf() {
        return idtipomovfinanceiromf;
    }

    public void setIdtipomovfinanceiromf(Tipomovimentofinanceiro idtipomovfinanceiromf) {
        this.idtipomovfinanceiromf = idtipomovfinanceiromf;
    }

    public Contacorrente getIdcontacorrentemf() {
        return idcontacorrentemf;
    }

    public void setIdcontacorrentemf(Contacorrente idcontacorrentemf) {
        this.idcontacorrentemf = idcontacorrentemf;
    }

    public Contaspagar getIdcontaspagarmf() {
        return idcontaspagarmf;
    }

    public void setIdcontaspagarmf(Contaspagar idcontaspagarmf) {
        this.idcontaspagarmf = idcontaspagarmf;
    }

    public Contasreceber getIdcontasrecebermf() {
        return idcontasrecebermf;
    }

    public void setIdcontasrecebermf(Contasreceber idcontasrecebermf) {
        this.idcontasrecebermf = idcontasrecebermf;
    }

    public Controlecaixa getControlecaixa() {
        return controlecaixa;
    }

    public void setControlecaixa(Controlecaixa controlecaixa) {
        this.controlecaixa = controlecaixa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmovfinanceiro != null ? idmovfinanceiro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Movimentofinanceiro)) {
            return false;
        }
        Movimentofinanceiro other = (Movimentofinanceiro) object;
        if ((this.idmovfinanceiro == null && other.idmovfinanceiro != null) || (this.idmovfinanceiro != null && !this.idmovfinanceiro.equals(other.idmovfinanceiro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sgps.classeMapeada.Movimentofinanceiro[idmovfinanceiro=" + idmovfinanceiro + "]";
    }

}
