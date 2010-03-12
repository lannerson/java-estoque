/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sgps.classeMapeada;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
 * @author Daniel
 */
@Entity
@Table(name = "entrada")
@NamedQueries({
    @NamedQuery(name = "Entrada.findAll", query = "SELECT e FROM Entrada e"),
    @NamedQuery(name = "Entrada.findByIdentrada", query = "SELECT e FROM Entrada e WHERE e.identrada = :identrada"),
    @NamedQuery(name = "Entrada.findByDataentrada", query = "SELECT e FROM Entrada e WHERE e.dataentrada = :dataentrada"),
    @NamedQuery(name = "Entrada.findByNumeroreferenciaentrada", query = "SELECT e FROM Entrada e WHERE e.numeroreferenciaentrada = :numeroreferenciaentrada"),
    @NamedQuery(name = "Entrada.findByNumeronotafiscalentrada", query = "SELECT e FROM Entrada e WHERE e.numeronotafiscalentrada = :numeronotafiscalentrada"),
    @NamedQuery(name = "Entrada.findBySerienfentrada", query = "SELECT e FROM Entrada e WHERE e.serienfentrada = :serienfentrada"),
    @NamedQuery(name = "Entrada.findByDataemissaonfentrada", query = "SELECT e FROM Entrada e WHERE e.dataemissaonfentrada = :dataemissaonfentrada"),
    @NamedQuery(name = "Entrada.findBySubtotalnfentradaa", query = "SELECT e FROM Entrada e WHERE e.subtotalnfentradaa = :subtotalnfentradaa"),
    @NamedQuery(name = "Entrada.findByQuantidadetotalcaixaentrada", query = "SELECT e FROM Entrada e WHERE e.quantidadetotalcaixaentrada = :quantidadetotalcaixaentrada"),
    @NamedQuery(name = "Entrada.findByValorbaseicmsentrada", query = "SELECT e FROM Entrada e WHERE e.valorbaseicmsentrada = :valorbaseicmsentrada"),
    @NamedQuery(name = "Entrada.findByValorbaseipientrada", query = "SELECT e FROM Entrada e WHERE e.valorbaseipientrada = :valorbaseipientrada"),
    @NamedQuery(name = "Entrada.findByValortotalipientrada", query = "SELECT e FROM Entrada e WHERE e.valortotalipientrada = :valortotalipientrada"),
    @NamedQuery(name = "Entrada.findByValortotalicmsentrada", query = "SELECT e FROM Entrada e WHERE e.valortotalicmsentrada = :valortotalicmsentrada"),
    @NamedQuery(name = "Entrada.findByValoroutronfentrada", query = "SELECT e FROM Entrada e WHERE e.valoroutronfentrada = :valoroutronfentrada"),
    @NamedQuery(name = "Entrada.findByDescontonfentrada", query = "SELECT e FROM Entrada e WHERE e.descontonfentrada = :descontonfentrada"),
    @NamedQuery(name = "Entrada.findByValorfretenfentrada", query = "SELECT e FROM Entrada e WHERE e.valorfretenfentrada = :valorfretenfentrada"),
    @NamedQuery(name = "Entrada.findByPesobrutoentrada", query = "SELECT e FROM Entrada e WHERE e.pesobrutoentrada = :pesobrutoentrada"),
    @NamedQuery(name = "Entrada.findByPesoliquidoentrada", query = "SELECT e FROM Entrada e WHERE e.pesoliquidoentrada = :pesoliquidoentrada"),
    @NamedQuery(name = "Entrada.findByValortotalnfentrada", query = "SELECT e FROM Entrada e WHERE e.valortotalnfentrada = :valortotalnfentrada"),
    @NamedQuery(name = "Entrada.findByStatusentrada", query = "SELECT e FROM Entrada e WHERE e.statusentrada = :statusentrada")})
public class Entrada implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDENTRADA")
    private Integer identrada;
    @Column(name = "DATAENTRADA")
    @Temporal(TemporalType.DATE)
    private Date dataentrada;
    @Column(name = "NUMEROREFERENCIAENTRADA")
    private String numeroreferenciaentrada;
    @Column(name = "NUMERONOTAFISCALENTRADA")
    private String numeronotafiscalentrada;
    @Column(name = "SERIENFENTRADA")
    private String serienfentrada;
    @Column(name = "DATAEMISSAONFENTRADA")
    @Temporal(TemporalType.DATE)
    private Date dataemissaonfentrada;
    @Column(name = "SUBTOTALNFENTRADAA")
    private BigDecimal subtotalnfentradaa;
    @Column(name = "QUANTIDADETOTALCAIXAENTRADA")
    private BigDecimal quantidadetotalcaixaentrada;
    @Column(name = "VALORBASEICMSENTRADA")
    private BigDecimal valorbaseicmsentrada;
    @Column(name = "VALORBASEIPIENTRADA")
    private BigDecimal valorbaseipientrada;
    @Column(name = "VALORTOTALIPIENTRADA")
    private BigDecimal valortotalipientrada;
    @Column(name = "VALORTOTALICMSENTRADA")
    private BigDecimal valortotalicmsentrada;
    @Column(name = "VALOROUTRONFENTRADA")
    private BigDecimal valoroutronfentrada;
    @Column(name = "DESCONTONFENTRADA")
    private BigDecimal descontonfentrada;
    @Column(name = "VALORFRETENFENTRADA")
    private BigDecimal valorfretenfentrada;
    @Column(name = "PESOBRUTOENTRADA")
    private BigDecimal pesobrutoentrada;
    @Column(name = "PESOLIQUIDOENTRADA")
    private BigDecimal pesoliquidoentrada;
    @Column(name = "VALORTOTALNFENTRADA")
    private BigDecimal valortotalnfentrada;
    @Lob
    @Column(name = "OBSERVACAOENTRADA")
    private String observacaoentrada;
    @Column(name = "STATUSENTRADA")
    private Integer statusentrada;
    @OneToMany(mappedBy = "identradacp")
    private Collection<Contaspagar> contaspagarCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "identradaitementrada")
    private Collection<Itementrada> itementradaCollection;
    @JoinColumn(name = "IDPESSOAFORNECEDOR", referencedColumnName = "IDPESSOAFORNECEDOR")
    @ManyToOne(optional = false)
    private Fornecedor idpessoafornecedor;

    public Entrada() {
    }

    public Entrada(Integer identrada) {
        this.identrada = identrada;
    }

    public Integer getIdentrada() {
        return identrada;
    }

    public void setIdentrada(Integer identrada) {
        this.identrada = identrada;
    }

    public Date getDataentrada() {
        return dataentrada;
    }

    public void setDataentrada(Date dataentrada) {
        this.dataentrada = dataentrada;
    }

    public String getNumeroreferenciaentrada() {
        return numeroreferenciaentrada;
    }

    public void setNumeroreferenciaentrada(String numeroreferenciaentrada) {
        this.numeroreferenciaentrada = numeroreferenciaentrada;
    }

    public String getNumeronotafiscalentrada() {
        return numeronotafiscalentrada;
    }

    public void setNumeronotafiscalentrada(String numeronotafiscalentrada) {
        this.numeronotafiscalentrada = numeronotafiscalentrada;
    }

    public String getSerienfentrada() {
        return serienfentrada;
    }

    public void setSerienfentrada(String serienfentrada) {
        this.serienfentrada = serienfentrada;
    }

    public Date getDataemissaonfentrada() {
        return dataemissaonfentrada;
    }

    public void setDataemissaonfentrada(Date dataemissaonfentrada) {
        this.dataemissaonfentrada = dataemissaonfentrada;
    }

    public BigDecimal getSubtotalnfentradaa() {
        return subtotalnfentradaa;
    }

    public void setSubtotalnfentradaa(BigDecimal subtotalnfentradaa) {
        this.subtotalnfentradaa = subtotalnfentradaa;
    }

    public BigDecimal getQuantidadetotalcaixaentrada() {
        return quantidadetotalcaixaentrada;
    }

    public void setQuantidadetotalcaixaentrada(BigDecimal quantidadetotalcaixaentrada) {
        this.quantidadetotalcaixaentrada = quantidadetotalcaixaentrada;
    }

    public BigDecimal getValorbaseicmsentrada() {
        return valorbaseicmsentrada;
    }

    public void setValorbaseicmsentrada(BigDecimal valorbaseicmsentrada) {
        this.valorbaseicmsentrada = valorbaseicmsentrada;
    }

    public BigDecimal getValorbaseipientrada() {
        return valorbaseipientrada;
    }

    public void setValorbaseipientrada(BigDecimal valorbaseipientrada) {
        this.valorbaseipientrada = valorbaseipientrada;
    }

    public BigDecimal getValortotalipientrada() {
        return valortotalipientrada;
    }

    public void setValortotalipientrada(BigDecimal valortotalipientrada) {
        this.valortotalipientrada = valortotalipientrada;
    }

    public BigDecimal getValortotalicmsentrada() {
        return valortotalicmsentrada;
    }

    public void setValortotalicmsentrada(BigDecimal valortotalicmsentrada) {
        this.valortotalicmsentrada = valortotalicmsentrada;
    }

    public BigDecimal getValoroutronfentrada() {
        return valoroutronfentrada;
    }

    public void setValoroutronfentrada(BigDecimal valoroutronfentrada) {
        this.valoroutronfentrada = valoroutronfentrada;
    }

    public BigDecimal getDescontonfentrada() {
        return descontonfentrada;
    }

    public void setDescontonfentrada(BigDecimal descontonfentrada) {
        this.descontonfentrada = descontonfentrada;
    }

    public BigDecimal getValorfretenfentrada() {
        return valorfretenfentrada;
    }

    public void setValorfretenfentrada(BigDecimal valorfretenfentrada) {
        this.valorfretenfentrada = valorfretenfentrada;
    }

    public BigDecimal getPesobrutoentrada() {
        return pesobrutoentrada;
    }

    public void setPesobrutoentrada(BigDecimal pesobrutoentrada) {
        this.pesobrutoentrada = pesobrutoentrada;
    }

    public BigDecimal getPesoliquidoentrada() {
        return pesoliquidoentrada;
    }

    public void setPesoliquidoentrada(BigDecimal pesoliquidoentrada) {
        this.pesoliquidoentrada = pesoliquidoentrada;
    }

    public BigDecimal getValortotalnfentrada() {
        return valortotalnfentrada;
    }

    public void setValortotalnfentrada(BigDecimal valortotalnfentrada) {
        this.valortotalnfentrada = valortotalnfentrada;
    }

    public String getObservacaoentrada() {
        return observacaoentrada;
    }

    public void setObservacaoentrada(String observacaoentrada) {
        this.observacaoentrada = observacaoentrada;
    }

    public Integer getStatusentrada() {
        return statusentrada;
    }

    public void setStatusentrada(Integer statusentrada) {
        this.statusentrada = statusentrada;
    }

    public Collection<Contaspagar> getContaspagarCollection() {
        return contaspagarCollection;
    }

    public void setContaspagarCollection(Collection<Contaspagar> contaspagarCollection) {
        this.contaspagarCollection = contaspagarCollection;
    }

    public Collection<Itementrada> getItementradaCollection() {
        return itementradaCollection;
    }

    public void setItementradaCollection(Collection<Itementrada> itementradaCollection) {
        this.itementradaCollection = itementradaCollection;
    }

    public Fornecedor getIdpessoafornecedor() {
        return idpessoafornecedor;
    }

    public void setIdpessoafornecedor(Fornecedor idpessoafornecedor) {
        this.idpessoafornecedor = idpessoafornecedor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (identrada != null ? identrada.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Entrada)) {
            return false;
        }
        Entrada other = (Entrada) object;
        if ((this.identrada == null && other.identrada != null) || (this.identrada != null && !this.identrada.equals(other.identrada))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sgps.classeMapeada.Entrada[identrada=" + identrada + "]";
    }

}
