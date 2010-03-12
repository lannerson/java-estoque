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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Daniel
 */
@Entity
@Table(name = "movimentocaixa")
@NamedQueries({
    @NamedQuery(name = "Movimentocaixa.findAll", query = "SELECT m FROM Movimentocaixa m"),
    @NamedQuery(name = "Movimentocaixa.findByIdmovimentocaixa", query = "SELECT m FROM Movimentocaixa m WHERE m.idmovimentocaixa = :idmovimentocaixa"),
    @NamedQuery(name = "Movimentocaixa.findByDatahoramovcaixa", query = "SELECT m FROM Movimentocaixa m WHERE m.datahoramovcaixa = :datahoramovcaixa"),
    @NamedQuery(name = "Movimentocaixa.findByValoraberturacaixamovcaixa", query = "SELECT m FROM Movimentocaixa m WHERE m.valoraberturacaixamovcaixa = :valoraberturacaixamovcaixa"),
    @NamedQuery(name = "Movimentocaixa.findByValorsangriacaixamovcaixa", query = "SELECT m FROM Movimentocaixa m WHERE m.valorsangriacaixamovcaixa = :valorsangriacaixamovcaixa"),
    @NamedQuery(name = "Movimentocaixa.findByTipooperacaomovcaixa", query = "SELECT m FROM Movimentocaixa m WHERE m.tipooperacaomovcaixa = :tipooperacaomovcaixa"),
    @NamedQuery(name = "Movimentocaixa.findByTiporecebimentomovcaixa", query = "SELECT m FROM Movimentocaixa m WHERE m.tiporecebimentomovcaixa = :tiporecebimentomovcaixa"),
    @NamedQuery(name = "Movimentocaixa.findByValordinheiromovcaixa", query = "SELECT m FROM Movimentocaixa m WHERE m.valordinheiromovcaixa = :valordinheiromovcaixa"),
    @NamedQuery(name = "Movimentocaixa.findByValorchequemovcaixa", query = "SELECT m FROM Movimentocaixa m WHERE m.valorchequemovcaixa = :valorchequemovcaixa"),
    @NamedQuery(name = "Movimentocaixa.findByValorcartaomovcaixa", query = "SELECT m FROM Movimentocaixa m WHERE m.valorcartaomovcaixa = :valorcartaomovcaixa"),
    @NamedQuery(name = "Movimentocaixa.findByValorduplicatamovcaixa", query = "SELECT m FROM Movimentocaixa m WHERE m.valorduplicatamovcaixa = :valorduplicatamovcaixa"),
    @NamedQuery(name = "Movimentocaixa.findByValortotalmovcaixa", query = "SELECT m FROM Movimentocaixa m WHERE m.valortotalmovcaixa = :valortotalmovcaixa"),
    @NamedQuery(name = "Movimentocaixa.findByStatusitemmovcaixa", query = "SELECT m FROM Movimentocaixa m WHERE m.statusitemmovcaixa = :statusitemmovcaixa")})
public class Movimentocaixa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDMOVIMENTOCAIXA")
    private Integer idmovimentocaixa;
    @Basic(optional = false)
    @Column(name = "DATAHORAMOVCAIXA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datahoramovcaixa;
    @Column(name = "VALORABERTURACAIXAMOVCAIXA")
    private BigDecimal valoraberturacaixamovcaixa;
    @Column(name = "VALORSANGRIACAIXAMOVCAIXA")
    private BigDecimal valorsangriacaixamovcaixa;
    @Column(name = "TIPOOPERACAOMOVCAIXA")
    private Character tipooperacaomovcaixa;
    @Column(name = "TIPORECEBIMENTOMOVCAIXA")
    private Integer tiporecebimentomovcaixa;
    @Column(name = "VALORDINHEIROMOVCAIXA")
    private BigDecimal valordinheiromovcaixa;
    @Column(name = "VALORCHEQUEMOVCAIXA")
    private BigDecimal valorchequemovcaixa;
    @Column(name = "VALORCARTAOMOVCAIXA")
    private BigDecimal valorcartaomovcaixa;
    @Column(name = "VALORDUPLICATAMOVCAIXA")
    private BigDecimal valorduplicatamovcaixa;
    @Column(name = "VALORTOTALMOVCAIXA")
    private BigDecimal valortotalmovcaixa;
    @Column(name = "STATUSITEMMOVCAIXA")
    private Integer statusitemmovcaixa;
    @OneToMany(mappedBy = "idmovimentocaixacr")
    private Collection<Contasreceber> contasreceberCollection;
    @JoinColumn(name = "IDVENDA", referencedColumnName = "IDVENDA")
    @ManyToOne
    private Venda idvenda;
    @JoinColumns({
        @JoinColumn(name = "IDCONTROLECAIXAMOVCAIXA", referencedColumnName = "IDCONTROLECAIXA"),
        @JoinColumn(name = "DATAABERTURACONTROLECAIXAMOVCAIXA", referencedColumnName = "DATAABERTURACONTROLECAIXA")})
    @ManyToOne
    private Controlecaixa controlecaixa;

    public Movimentocaixa() {
    }

    public Movimentocaixa(Integer idmovimentocaixa) {
        this.idmovimentocaixa = idmovimentocaixa;
    }

    public Movimentocaixa(Integer idmovimentocaixa, Date datahoramovcaixa) {
        this.idmovimentocaixa = idmovimentocaixa;
        this.datahoramovcaixa = datahoramovcaixa;
    }

    public Integer getIdmovimentocaixa() {
        return idmovimentocaixa;
    }

    public void setIdmovimentocaixa(Integer idmovimentocaixa) {
        this.idmovimentocaixa = idmovimentocaixa;
    }

    public Date getDatahoramovcaixa() {
        return datahoramovcaixa;
    }

    public void setDatahoramovcaixa(Date datahoramovcaixa) {
        this.datahoramovcaixa = datahoramovcaixa;
    }

    public BigDecimal getValoraberturacaixamovcaixa() {
        return valoraberturacaixamovcaixa;
    }

    public void setValoraberturacaixamovcaixa(BigDecimal valoraberturacaixamovcaixa) {
        this.valoraberturacaixamovcaixa = valoraberturacaixamovcaixa;
    }

    public BigDecimal getValorsangriacaixamovcaixa() {
        return valorsangriacaixamovcaixa;
    }

    public void setValorsangriacaixamovcaixa(BigDecimal valorsangriacaixamovcaixa) {
        this.valorsangriacaixamovcaixa = valorsangriacaixamovcaixa;
    }

    public Character getTipooperacaomovcaixa() {
        return tipooperacaomovcaixa;
    }

    public void setTipooperacaomovcaixa(Character tipooperacaomovcaixa) {
        this.tipooperacaomovcaixa = tipooperacaomovcaixa;
    }

    public Integer getTiporecebimentomovcaixa() {
        return tiporecebimentomovcaixa;
    }

    public void setTiporecebimentomovcaixa(Integer tiporecebimentomovcaixa) {
        this.tiporecebimentomovcaixa = tiporecebimentomovcaixa;
    }

    public BigDecimal getValordinheiromovcaixa() {
        return valordinheiromovcaixa;
    }

    public void setValordinheiromovcaixa(BigDecimal valordinheiromovcaixa) {
        this.valordinheiromovcaixa = valordinheiromovcaixa;
    }

    public BigDecimal getValorchequemovcaixa() {
        return valorchequemovcaixa;
    }

    public void setValorchequemovcaixa(BigDecimal valorchequemovcaixa) {
        this.valorchequemovcaixa = valorchequemovcaixa;
    }

    public BigDecimal getValorcartaomovcaixa() {
        return valorcartaomovcaixa;
    }

    public void setValorcartaomovcaixa(BigDecimal valorcartaomovcaixa) {
        this.valorcartaomovcaixa = valorcartaomovcaixa;
    }

    public BigDecimal getValorduplicatamovcaixa() {
        return valorduplicatamovcaixa;
    }

    public void setValorduplicatamovcaixa(BigDecimal valorduplicatamovcaixa) {
        this.valorduplicatamovcaixa = valorduplicatamovcaixa;
    }

    public BigDecimal getValortotalmovcaixa() {
        return valortotalmovcaixa;
    }

    public void setValortotalmovcaixa(BigDecimal valortotalmovcaixa) {
        this.valortotalmovcaixa = valortotalmovcaixa;
    }

    public Integer getStatusitemmovcaixa() {
        return statusitemmovcaixa;
    }

    public void setStatusitemmovcaixa(Integer statusitemmovcaixa) {
        this.statusitemmovcaixa = statusitemmovcaixa;
    }

    public Collection<Contasreceber> getContasreceberCollection() {
        return contasreceberCollection;
    }

    public void setContasreceberCollection(Collection<Contasreceber> contasreceberCollection) {
        this.contasreceberCollection = contasreceberCollection;
    }

    public Venda getIdvenda() {
        return idvenda;
    }

    public void setIdvenda(Venda idvenda) {
        this.idvenda = idvenda;
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
        hash += (idmovimentocaixa != null ? idmovimentocaixa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Movimentocaixa)) {
            return false;
        }
        Movimentocaixa other = (Movimentocaixa) object;
        if ((this.idmovimentocaixa == null && other.idmovimentocaixa != null) || (this.idmovimentocaixa != null && !this.idmovimentocaixa.equals(other.idmovimentocaixa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sgps.classeMapeada.Movimentocaixa[idmovimentocaixa=" + idmovimentocaixa + "]";
    }

}
