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
@Table(name = "CONTASPAGAR", catalog = "sgps", schema = "")
@NamedQueries({
    @NamedQuery(name = "Contaspagar.findAll", query = "SELECT c FROM Contaspagar c"),
    @NamedQuery(name = "Contaspagar.findByIdcontaspagar", query = "SELECT c FROM Contaspagar c WHERE c.idcontaspagar = :idcontaspagar"),
    @NamedQuery(name = "Contaspagar.findByDatalancamentocp", query = "SELECT c FROM Contaspagar c WHERE c.datalancamentocp = :datalancamentocp"),
    @NamedQuery(name = "Contaspagar.findByNumerodocumentocp", query = "SELECT c FROM Contaspagar c WHERE c.numerodocumentocp = :numerodocumentocp"),
    @NamedQuery(name = "Contaspagar.findByDescricaocp", query = "SELECT c FROM Contaspagar c WHERE c.descricaocp = :descricaocp"),
    @NamedQuery(name = "Contaspagar.findByValordocumentocp", query = "SELECT c FROM Contaspagar c WHERE c.valordocumentocp = :valordocumentocp"),
    @NamedQuery(name = "Contaspagar.findByNumerochequecp", query = "SELECT c FROM Contaspagar c WHERE c.numerochequecp = :numerochequecp"),
    @NamedQuery(name = "Contaspagar.findByDatavencimentocp", query = "SELECT c FROM Contaspagar c WHERE c.datavencimentocp = :datavencimentocp"),
    @NamedQuery(name = "Contaspagar.findByDatapagamentocp", query = "SELECT c FROM Contaspagar c WHERE c.datapagamentocp = :datapagamentocp"),
    @NamedQuery(name = "Contaspagar.findByDescontocp", query = "SELECT c FROM Contaspagar c WHERE c.descontocp = :descontocp"),
    @NamedQuery(name = "Contaspagar.findByValorjuroscp", query = "SELECT c FROM Contaspagar c WHERE c.valorjuroscp = :valorjuroscp"),
    @NamedQuery(name = "Contaspagar.findByValormultacp", query = "SELECT c FROM Contaspagar c WHERE c.valormultacp = :valormultacp"),
    @NamedQuery(name = "Contaspagar.findByValorpagocp", query = "SELECT c FROM Contaspagar c WHERE c.valorpagocp = :valorpagocp"),
    @NamedQuery(name = "Contaspagar.findByValorpendentecp", query = "SELECT c FROM Contaspagar c WHERE c.valorpendentecp = :valorpendentecp"),
    @NamedQuery(name = "Contaspagar.findByTipobaixacp", query = "SELECT c FROM Contaspagar c WHERE c.tipobaixacp = :tipobaixacp"),
    @NamedQuery(name = "Contaspagar.findByDataultimopgtocp", query = "SELECT c FROM Contaspagar c WHERE c.dataultimopgtocp = :dataultimopgtocp"),
    @NamedQuery(name = "Contaspagar.findByValorultimopgtocp", query = "SELECT c FROM Contaspagar c WHERE c.valorultimopgtocp = :valorultimopgtocp"),
    @NamedQuery(name = "Contaspagar.findByStatuspagocp", query = "SELECT c FROM Contaspagar c WHERE c.statuspagocp = :statuspagocp"),
    @NamedQuery(name = "Contaspagar.findByStatuscp", query = "SELECT c FROM Contaspagar c WHERE c.statuscp = :statuscp")})
public class Contaspagar implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDCONTASPAGAR", nullable = false)
    private Integer idcontaspagar;
    @Column(name = "DATALANCAMENTOCP")
    @Temporal(TemporalType.DATE)
    private Date datalancamentocp;
    @Column(name = "NUMERODOCUMENTOCP", length = 25)
    private String numerodocumentocp;
    @Column(name = "DESCRICAOCP", length = 100)
    private String descricaocp;
    @Basic(optional = false)
    @Column(name = "VALORDOCUMENTOCP", nullable = false, precision = 11, scale = 2)
    private BigDecimal valordocumentocp;
    @Column(name = "NUMEROCHEQUECP")
    private Integer numerochequecp;
    @Basic(optional = false)
    @Column(name = "DATAVENCIMENTOCP", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date datavencimentocp;
    @Lob
    @Column(name = "OBSERVACAOCP", length = 65535)
    private String observacaocp;
    @Column(name = "DATAPAGAMENTOCP")
    @Temporal(TemporalType.DATE)
    private Date datapagamentocp;
    @Column(name = "DESCONTOCP", precision = 11, scale = 2)
    private BigDecimal descontocp;
    @Column(name = "VALORJUROSCP", precision = 11, scale = 2)
    private BigDecimal valorjuroscp;
    @Column(name = "VALORMULTACP", precision = 11, scale = 2)
    private BigDecimal valormultacp;
    @Column(name = "VALORPAGOCP", precision = 11, scale = 2)
    private BigDecimal valorpagocp;
    @Column(name = "VALORPENDENTECP", precision = 11, scale = 2)
    private BigDecimal valorpendentecp;
    @Column(name = "TIPOBAIXACP", length = 1)
    private String tipobaixacp;
    @Column(name = "DATAULTIMOPGTOCP")
    @Temporal(TemporalType.DATE)
    private Date dataultimopgtocp;
    @Column(name = "VALORULTIMOPGTOCP", precision = 11, scale = 2)
    private BigDecimal valorultimopgtocp;
    @Column(name = "STATUSPAGOCP")
    private Boolean statuspagocp;
    @Column(name = "STATUSCP")
    private Integer statuscp;
    @JoinColumn(name = "IDTIPOMOVFINANCEIROCP", referencedColumnName = "IDTIPOMOVFINANCEIRO", nullable = false)
    @ManyToOne(optional = false)
    private Tipomovimentofinanceiro idtipomovfinanceirocp;
    @JoinColumn(name = "IDCONTACORRENTECP", referencedColumnName = "IDCONTACORRENTE")
    @ManyToOne
    private Contacorrente idcontacorrentecp;
    @JoinColumn(name = "IDENTRADACP", referencedColumnName = "IDENTRADA")
    @ManyToOne
    private Entrada identradacp;
    @JoinColumn(name = "IDPESSOAFORNECEDORCP", referencedColumnName = "IDPESSOAFORNECEDOR", nullable = false)
    @ManyToOne(optional = false)
    private Fornecedor idpessoafornecedorcp;
    @OneToMany(mappedBy = "idcontaspagarmf")
    private List<Movimentofinanceiro> movimentofinanceiroList;

    public Contaspagar() {
    }

    public Contaspagar(Integer idcontaspagar) {
        this.idcontaspagar = idcontaspagar;
    }

    public Contaspagar(Integer idcontaspagar, BigDecimal valordocumentocp, Date datavencimentocp) {
        this.idcontaspagar = idcontaspagar;
        this.valordocumentocp = valordocumentocp;
        this.datavencimentocp = datavencimentocp;
    }

    public Integer getIdcontaspagar() {
        return idcontaspagar;
    }

    public void setIdcontaspagar(Integer idcontaspagar) {
        this.idcontaspagar = idcontaspagar;
    }

    public Date getDatalancamentocp() {
        return datalancamentocp;
    }

    public void setDatalancamentocp(Date datalancamentocp) {
        this.datalancamentocp = datalancamentocp;
    }

    public String getNumerodocumentocp() {
        return numerodocumentocp;
    }

    public void setNumerodocumentocp(String numerodocumentocp) {
        this.numerodocumentocp = numerodocumentocp;
    }

    public String getDescricaocp() {
        return descricaocp;
    }

    public void setDescricaocp(String descricaocp) {
        this.descricaocp = descricaocp;
    }

    public BigDecimal getValordocumentocp() {
        return valordocumentocp;
    }

    public void setValordocumentocp(BigDecimal valordocumentocp) {
        this.valordocumentocp = valordocumentocp;
    }

    public Integer getNumerochequecp() {
        return numerochequecp;
    }

    public void setNumerochequecp(Integer numerochequecp) {
        this.numerochequecp = numerochequecp;
    }

    public Date getDatavencimentocp() {
        return datavencimentocp;
    }

    public void setDatavencimentocp(Date datavencimentocp) {
        this.datavencimentocp = datavencimentocp;
    }

    public String getObservacaocp() {
        return observacaocp;
    }

    public void setObservacaocp(String observacaocp) {
        this.observacaocp = observacaocp;
    }

    public Date getDatapagamentocp() {
        return datapagamentocp;
    }

    public void setDatapagamentocp(Date datapagamentocp) {
        this.datapagamentocp = datapagamentocp;
    }

    public BigDecimal getDescontocp() {
        return descontocp;
    }

    public void setDescontocp(BigDecimal descontocp) {
        this.descontocp = descontocp;
    }

    public BigDecimal getValorjuroscp() {
        return valorjuroscp;
    }

    public void setValorjuroscp(BigDecimal valorjuroscp) {
        this.valorjuroscp = valorjuroscp;
    }

    public BigDecimal getValormultacp() {
        return valormultacp;
    }

    public void setValormultacp(BigDecimal valormultacp) {
        this.valormultacp = valormultacp;
    }

    public BigDecimal getValorpagocp() {
        return valorpagocp;
    }

    public void setValorpagocp(BigDecimal valorpagocp) {
        this.valorpagocp = valorpagocp;
    }

    public BigDecimal getValorpendentecp() {
        return valorpendentecp;
    }

    public void setValorpendentecp(BigDecimal valorpendentecp) {
        this.valorpendentecp = valorpendentecp;
    }

    public String getTipobaixacp() {
        return tipobaixacp;
    }

    public void setTipobaixacp(String tipobaixacp) {
        this.tipobaixacp = tipobaixacp;
    }

    public Date getDataultimopgtocp() {
        return dataultimopgtocp;
    }

    public void setDataultimopgtocp(Date dataultimopgtocp) {
        this.dataultimopgtocp = dataultimopgtocp;
    }

    public BigDecimal getValorultimopgtocp() {
        return valorultimopgtocp;
    }

    public void setValorultimopgtocp(BigDecimal valorultimopgtocp) {
        this.valorultimopgtocp = valorultimopgtocp;
    }

    public Boolean getStatuspagocp() {
        return statuspagocp;
    }

    public void setStatuspagocp(Boolean statuspagocp) {
        this.statuspagocp = statuspagocp;
    }

    public Integer getStatuscp() {
        return statuscp;
    }

    public void setStatuscp(Integer statuscp) {
        this.statuscp = statuscp;
    }

    public Tipomovimentofinanceiro getIdtipomovfinanceirocp() {
        return idtipomovfinanceirocp;
    }

    public void setIdtipomovfinanceirocp(Tipomovimentofinanceiro idtipomovfinanceirocp) {
        this.idtipomovfinanceirocp = idtipomovfinanceirocp;
    }

    public Contacorrente getIdcontacorrentecp() {
        return idcontacorrentecp;
    }

    public void setIdcontacorrentecp(Contacorrente idcontacorrentecp) {
        this.idcontacorrentecp = idcontacorrentecp;
    }

    public Entrada getIdentradacp() {
        return identradacp;
    }

    public void setIdentradacp(Entrada identradacp) {
        this.identradacp = identradacp;
    }

    public Fornecedor getIdpessoafornecedorcp() {
        return idpessoafornecedorcp;
    }

    public void setIdpessoafornecedorcp(Fornecedor idpessoafornecedorcp) {
        this.idpessoafornecedorcp = idpessoafornecedorcp;
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
        hash += (idcontaspagar != null ? idcontaspagar.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contaspagar)) {
            return false;
        }
        Contaspagar other = (Contaspagar) object;
        if ((this.idcontaspagar == null && other.idcontaspagar != null) || (this.idcontaspagar != null && !this.idcontaspagar.equals(other.idcontaspagar))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sgps.classeMapeada.Contaspagar[idcontaspagar=" + idcontaspagar + "]";
    }

}
