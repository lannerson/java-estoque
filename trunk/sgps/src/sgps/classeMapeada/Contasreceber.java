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
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
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
@Table(name = "CONTASRECEBER", catalog = "sgps", schema = "")
@NamedQueries({
    @NamedQuery(name = "Contasreceber.findAll", query = "SELECT c FROM Contasreceber c"),
    @NamedQuery(name = "Contasreceber.findByIdcontasreceber", query = "SELECT c FROM Contasreceber c WHERE c.idcontasreceber = :idcontasreceber"),
    @NamedQuery(name = "Contasreceber.findByDatalancamentocr", query = "SELECT c FROM Contasreceber c WHERE c.datalancamentocr = :datalancamentocr"),
    @NamedQuery(name = "Contasreceber.findByNumerodocumentocr", query = "SELECT c FROM Contasreceber c WHERE c.numerodocumentocr = :numerodocumentocr"),
    @NamedQuery(name = "Contasreceber.findByDescricaocr", query = "SELECT c FROM Contasreceber c WHERE c.descricaocr = :descricaocr"),
    @NamedQuery(name = "Contasreceber.findByValordocumentocr", query = "SELECT c FROM Contasreceber c WHERE c.valordocumentocr = :valordocumentocr"),
    @NamedQuery(name = "Contasreceber.findByNumerochequecr", query = "SELECT c FROM Contasreceber c WHERE c.numerochequecr = :numerochequecr"),
    @NamedQuery(name = "Contasreceber.findByDatavencimentocr", query = "SELECT c FROM Contasreceber c WHERE c.datavencimentocr = :datavencimentocr"),
    @NamedQuery(name = "Contasreceber.findByDatarecebimentocr", query = "SELECT c FROM Contasreceber c WHERE c.datarecebimentocr = :datarecebimentocr"),
    @NamedQuery(name = "Contasreceber.findByValordescontocr", query = "SELECT c FROM Contasreceber c WHERE c.valordescontocr = :valordescontocr"),
    @NamedQuery(name = "Contasreceber.findByValorjuroscr", query = "SELECT c FROM Contasreceber c WHERE c.valorjuroscr = :valorjuroscr"),
    @NamedQuery(name = "Contasreceber.findByValormultacr", query = "SELECT c FROM Contasreceber c WHERE c.valormultacr = :valormultacr"),
    @NamedQuery(name = "Contasreceber.findByValorrecebidocr", query = "SELECT c FROM Contasreceber c WHERE c.valorrecebidocr = :valorrecebidocr"),
    @NamedQuery(name = "Contasreceber.findByValorpendentecr", query = "SELECT c FROM Contasreceber c WHERE c.valorpendentecr = :valorpendentecr"),
    @NamedQuery(name = "Contasreceber.findByTipobaixacr", query = "SELECT c FROM Contasreceber c WHERE c.tipobaixacr = :tipobaixacr"),
    @NamedQuery(name = "Contasreceber.findByDataultimorebtocr", query = "SELECT c FROM Contasreceber c WHERE c.dataultimorebtocr = :dataultimorebtocr"),
    @NamedQuery(name = "Contasreceber.findByValorultimopgtocr", query = "SELECT c FROM Contasreceber c WHERE c.valorultimopgtocr = :valorultimopgtocr"),
    @NamedQuery(name = "Contasreceber.findByIdvendacr", query = "SELECT c FROM Contasreceber c WHERE c.idvendacr = :idvendacr"),
    @NamedQuery(name = "Contasreceber.findByFlagnaocobrar", query = "SELECT c FROM Contasreceber c WHERE c.flagnaocobrar = :flagnaocobrar"),
    @NamedQuery(name = "Contasreceber.findByStatusrecebidocr", query = "SELECT c FROM Contasreceber c WHERE c.statusrecebidocr = :statusrecebidocr"),
    @NamedQuery(name = "Contasreceber.findByStatuscr", query = "SELECT c FROM Contasreceber c WHERE c.statuscr = :statuscr")})
public class Contasreceber implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDCONTASRECEBER", nullable = false)
    private Integer idcontasreceber;
    @Basic(optional = false)
    @Column(name = "DATALANCAMENTOCR", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date datalancamentocr;
    @Column(name = "NUMERODOCUMENTOCR", length = 50)
    private String numerodocumentocr;
    @Basic(optional = false)
    @Column(name = "DESCRICAOCR", nullable = false, length = 100)
    private String descricaocr;
    @Basic(optional = false)
    @Column(name = "VALORDOCUMENTOCR", nullable = false, precision = 11, scale = 2)
    private BigDecimal valordocumentocr;
    @Column(name = "NUMEROCHEQUECR")
    private Integer numerochequecr;
    @Basic(optional = false)
    @Column(name = "DATAVENCIMENTOCR", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date datavencimentocr;
    @Lob
    @Column(name = "OBSERVACAOCR", length = 65535)
    private String observacaocr;
    @Column(name = "DATARECEBIMENTOCR")
    @Temporal(TemporalType.DATE)
    private Date datarecebimentocr;
    @Column(name = "VALORDESCONTOCR", precision = 11, scale = 2)
    private BigDecimal valordescontocr;
    @Column(name = "VALORJUROSCR", precision = 11, scale = 2)
    private BigDecimal valorjuroscr;
    @Column(name = "VALORMULTACR", precision = 11, scale = 2)
    private BigDecimal valormultacr;
    @Column(name = "VALORRECEBIDOCR", precision = 11, scale = 2)
    private BigDecimal valorrecebidocr;
    @Column(name = "VALORPENDENTECR", precision = 11, scale = 2)
    private BigDecimal valorpendentecr;
    @Column(name = "TIPOBAIXACR", length = 1)
    private String tipobaixacr;
    @Column(name = "DATAULTIMOREBTOCR")
    @Temporal(TemporalType.DATE)
    private Date dataultimorebtocr;
    @Column(name = "VALORULTIMOPGTOCR", precision = 11, scale = 2)
    private BigDecimal valorultimopgtocr;
    @Column(name = "IDVENDACR")
    private Integer idvendacr;
    @Column(name = "FLAGNAOCOBRAR")
    private Boolean flagnaocobrar;
    @Column(name = "STATUSRECEBIDOCR")
    private Boolean statusrecebidocr;
    @Column(name = "STATUSCR")
    private Integer statuscr;
    @OneToMany(mappedBy = "idcontasrecebermf")
    private List<Movimentofinanceiro> movimentofinanceiroList;
    @JoinColumn(name = "IDTIPOMOVFINANCEIROCR", referencedColumnName = "IDTIPOMOVFINANCEIRO", nullable = false)
    @ManyToOne(optional = false)
    private Tipomovimentofinanceiro idtipomovfinanceirocr;
    @JoinColumn(name = "IDPESSOACLIENTECR", referencedColumnName = "IDPESSOACLIENTE", nullable = false)
    @ManyToOne(optional = false)
    private Cliente idpessoaclientecr;
    @JoinColumn(name = "IDCONTACORRENTECR", referencedColumnName = "IDCONTACORRENTE")
    @ManyToOne
    private Contacorrente idcontacorrentecr;
    @JoinColumn(name = "IDMOVIMENTOCAIXACR", referencedColumnName = "IDMOVIMENTOCAIXA")
    @ManyToOne
    private Movimentocaixa idmovimentocaixacr;

    public Contasreceber() {
    }

    public Contasreceber(Integer idcontasreceber) {
        this.idcontasreceber = idcontasreceber;
    }

    public Contasreceber(Integer idcontasreceber, Date datalancamentocr, String descricaocr, BigDecimal valordocumentocr, Date datavencimentocr) {
        this.idcontasreceber = idcontasreceber;
        this.datalancamentocr = datalancamentocr;
        this.descricaocr = descricaocr;
        this.valordocumentocr = valordocumentocr;
        this.datavencimentocr = datavencimentocr;
    }

    public Integer getIdcontasreceber() {
        return idcontasreceber;
    }

    public void setIdcontasreceber(Integer idcontasreceber) {
        this.idcontasreceber = idcontasreceber;
    }

    public Date getDatalancamentocr() {
        return datalancamentocr;
    }

    public void setDatalancamentocr(Date datalancamentocr) {
        this.datalancamentocr = datalancamentocr;
    }

    public String getNumerodocumentocr() {
        return numerodocumentocr;
    }

    public void setNumerodocumentocr(String numerodocumentocr) {
        this.numerodocumentocr = numerodocumentocr;
    }

    public String getDescricaocr() {
        return descricaocr;
    }

    public void setDescricaocr(String descricaocr) {
        this.descricaocr = descricaocr;
    }

    public BigDecimal getValordocumentocr() {
        return valordocumentocr;
    }

    public void setValordocumentocr(BigDecimal valordocumentocr) {
        this.valordocumentocr = valordocumentocr;
    }

    public Integer getNumerochequecr() {
        return numerochequecr;
    }

    public void setNumerochequecr(Integer numerochequecr) {
        this.numerochequecr = numerochequecr;
    }

    public Date getDatavencimentocr() {
        return datavencimentocr;
    }

    public void setDatavencimentocr(Date datavencimentocr) {
        this.datavencimentocr = datavencimentocr;
    }

    public String getObservacaocr() {
        return observacaocr;
    }

    public void setObservacaocr(String observacaocr) {
        this.observacaocr = observacaocr;
    }

    public Date getDatarecebimentocr() {
        return datarecebimentocr;
    }

    public void setDatarecebimentocr(Date datarecebimentocr) {
        this.datarecebimentocr = datarecebimentocr;
    }

    public BigDecimal getValordescontocr() {
        return valordescontocr;
    }

    public void setValordescontocr(BigDecimal valordescontocr) {
        this.valordescontocr = valordescontocr;
    }

    public BigDecimal getValorjuroscr() {
        return valorjuroscr;
    }

    public void setValorjuroscr(BigDecimal valorjuroscr) {
        this.valorjuroscr = valorjuroscr;
    }

    public BigDecimal getValormultacr() {
        return valormultacr;
    }

    public void setValormultacr(BigDecimal valormultacr) {
        this.valormultacr = valormultacr;
    }

    public BigDecimal getValorrecebidocr() {
        return valorrecebidocr;
    }

    public void setValorrecebidocr(BigDecimal valorrecebidocr) {
        this.valorrecebidocr = valorrecebidocr;
    }

    public BigDecimal getValorpendentecr() {
        return valorpendentecr;
    }

    public void setValorpendentecr(BigDecimal valorpendentecr) {
        this.valorpendentecr = valorpendentecr;
    }

    public String getTipobaixacr() {
        return tipobaixacr;
    }

    public void setTipobaixacr(String tipobaixacr) {
        this.tipobaixacr = tipobaixacr;
    }

    public Date getDataultimorebtocr() {
        return dataultimorebtocr;
    }

    public void setDataultimorebtocr(Date dataultimorebtocr) {
        this.dataultimorebtocr = dataultimorebtocr;
    }

    public BigDecimal getValorultimopgtocr() {
        return valorultimopgtocr;
    }

    public void setValorultimopgtocr(BigDecimal valorultimopgtocr) {
        this.valorultimopgtocr = valorultimopgtocr;
    }

    public Integer getIdvendacr() {
        return idvendacr;
    }

    public void setIdvendacr(Integer idvendacr) {
        this.idvendacr = idvendacr;
    }

    public Boolean getFlagnaocobrar() {
        return flagnaocobrar;
    }

    public void setFlagnaocobrar(Boolean flagnaocobrar) {
        this.flagnaocobrar = flagnaocobrar;
    }

    public Boolean getStatusrecebidocr() {
        return statusrecebidocr;
    }

    public void setStatusrecebidocr(Boolean statusrecebidocr) {
        this.statusrecebidocr = statusrecebidocr;
    }

    public Integer getStatuscr() {
        return statuscr;
    }

    public void setStatuscr(Integer statuscr) {
        this.statuscr = statuscr;
    }

    public List<Movimentofinanceiro> getMovimentofinanceiroList() {
        return movimentofinanceiroList;
    }

    public void setMovimentofinanceiroList(List<Movimentofinanceiro> movimentofinanceiroList) {
        this.movimentofinanceiroList = movimentofinanceiroList;
    }

    public Tipomovimentofinanceiro getIdtipomovfinanceirocr() {
        return idtipomovfinanceirocr;
    }

    public void setIdtipomovfinanceirocr(Tipomovimentofinanceiro idtipomovfinanceirocr) {
        this.idtipomovfinanceirocr = idtipomovfinanceirocr;
    }

    public Cliente getIdpessoaclientecr() {
        return idpessoaclientecr;
    }

    public void setIdpessoaclientecr(Cliente idpessoaclientecr) {
        this.idpessoaclientecr = idpessoaclientecr;
    }

    public Contacorrente getIdcontacorrentecr() {
        return idcontacorrentecr;
    }

    public void setIdcontacorrentecr(Contacorrente idcontacorrentecr) {
        this.idcontacorrentecr = idcontacorrentecr;
    }

    public Movimentocaixa getIdmovimentocaixacr() {
        return idmovimentocaixacr;
    }

    public void setIdmovimentocaixacr(Movimentocaixa idmovimentocaixacr) {
        this.idmovimentocaixacr = idmovimentocaixacr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcontasreceber != null ? idcontasreceber.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contasreceber)) {
            return false;
        }
        Contasreceber other = (Contasreceber) object;
        if ((this.idcontasreceber == null && other.idcontasreceber != null) || (this.idcontasreceber != null && !this.idcontasreceber.equals(other.idcontasreceber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sgps.classeMapeada.Contasreceber[idcontasreceber=" + idcontasreceber + "]";
    }

}
