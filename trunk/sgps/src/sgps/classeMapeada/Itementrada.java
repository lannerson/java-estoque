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
@Table(name = "ITEMENTRADA", catalog = "sgps", schema = "")
@NamedQueries({
    @NamedQuery(name = "Itementrada.findAll", query = "SELECT i FROM Itementrada i"),
    @NamedQuery(name = "Itementrada.findByIditementrada", query = "SELECT i FROM Itementrada i WHERE i.iditementrada = :iditementrada"),
    @NamedQuery(name = "Itementrada.findByUmitementrada", query = "SELECT i FROM Itementrada i WHERE i.umitementrada = :umitementrada"),
    @NamedQuery(name = "Itementrada.findByQuantidadeitementrada", query = "SELECT i FROM Itementrada i WHERE i.quantidadeitementrada = :quantidadeitementrada"),
    @NamedQuery(name = "Itementrada.findByValorcustoitementrada", query = "SELECT i FROM Itementrada i WHERE i.valorcustoitementrada = :valorcustoitementrada"),
    @NamedQuery(name = "Itementrada.findByIcmsitementrada", query = "SELECT i FROM Itementrada i WHERE i.icmsitementrada = :icmsitementrada"),
    @NamedQuery(name = "Itementrada.findByIpiitementrada", query = "SELECT i FROM Itementrada i WHERE i.ipiitementrada = :ipiitementrada"),
    @NamedQuery(name = "Itementrada.findByCfopitementrada", query = "SELECT i FROM Itementrada i WHERE i.cfopitementrada = :cfopitementrada"),
    @NamedQuery(name = "Itementrada.findByValorcustototalitementrada", query = "SELECT i FROM Itementrada i WHERE i.valorcustototalitementrada = :valorcustototalitementrada"),
    @NamedQuery(name = "Itementrada.findByLoteitementrada", query = "SELECT i FROM Itementrada i WHERE i.loteitementrada = :loteitementrada"),
    @NamedQuery(name = "Itementrada.findByDatavencimentotementrada", query = "SELECT i FROM Itementrada i WHERE i.datavencimentotementrada = :datavencimentotementrada"),
    @NamedQuery(name = "Itementrada.findByValorvendaitementrada", query = "SELECT i FROM Itementrada i WHERE i.valorvendaitementrada = :valorvendaitementrada"),
    @NamedQuery(name = "Itementrada.findByFlagbrindeitemvenda", query = "SELECT i FROM Itementrada i WHERE i.flagbrindeitemvenda = :flagbrindeitemvenda"),
    @NamedQuery(name = "Itementrada.findByStatusitementrada", query = "SELECT i FROM Itementrada i WHERE i.statusitementrada = :statusitementrada")})
public class Itementrada implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDITEMENTRADA", nullable = false)
    private Integer iditementrada;
    @Column(name = "UMITEMENTRADA", length = 2)
    private String umitementrada;
    @Basic(optional = false)
    @Column(name = "QUANTIDADEITEMENTRADA", nullable = false, precision = 4, scale = 2)
    private BigDecimal quantidadeitementrada;
    @Column(name = "VALORCUSTOITEMENTRADA", precision = 11, scale = 2)
    private BigDecimal valorcustoitementrada;
    @Column(name = "ICMSITEMENTRADA", precision = 4, scale = 2)
    private BigDecimal icmsitementrada;
    @Column(name = "IPIITEMENTRADA", precision = 4, scale = 2)
    private BigDecimal ipiitementrada;
    @Column(name = "CFOPITEMENTRADA")
    private Integer cfopitementrada;
    @Column(name = "VALORCUSTOTOTALITEMENTRADA", precision = 11, scale = 2)
    private BigDecimal valorcustototalitementrada;
    @Column(name = "LOTEITEMENTRADA", length = 10)
    private String loteitementrada;
    @Column(name = "DATAVENCIMENTOTEMENTRADA")
    @Temporal(TemporalType.DATE)
    private Date datavencimentotementrada;
    @Column(name = "VALORVENDAITEMENTRADA", precision = 11, scale = 2)
    private BigDecimal valorvendaitementrada;
    @Column(name = "FLAGBRINDEITEMVENDA")
    private Boolean flagbrindeitemvenda;
    @Column(name = "STATUSITEMENTRADA")
    private Integer statusitementrada;
    @OneToMany(mappedBy = "iditementradaestoque")
    private List<Estoque> estoqueList;
    @JoinColumn(name = "IDPRODUTOITEMENTRADA", referencedColumnName = "IDPRODUTO", nullable = false)
    @ManyToOne(optional = false)
    private Produto idprodutoitementrada;
    @JoinColumn(name = "IDENTRADAITEMENTRADA", referencedColumnName = "IDENTRADA", nullable = false)
    @ManyToOne(optional = false)
    private Entrada identradaitementrada;

    public Itementrada() {
    }

    public Itementrada(Integer iditementrada) {
        this.iditementrada = iditementrada;
    }

    public Itementrada(Integer iditementrada, BigDecimal quantidadeitementrada) {
        this.iditementrada = iditementrada;
        this.quantidadeitementrada = quantidadeitementrada;
    }

    public Integer getIditementrada() {
        return iditementrada;
    }

    public void setIditementrada(Integer iditementrada) {
        this.iditementrada = iditementrada;
    }

    public String getUmitementrada() {
        return umitementrada;
    }

    public void setUmitementrada(String umitementrada) {
        this.umitementrada = umitementrada;
    }

    public BigDecimal getQuantidadeitementrada() {
        return quantidadeitementrada;
    }

    public void setQuantidadeitementrada(BigDecimal quantidadeitementrada) {
        this.quantidadeitementrada = quantidadeitementrada;
    }

    public BigDecimal getValorcustoitementrada() {
        return valorcustoitementrada;
    }

    public void setValorcustoitementrada(BigDecimal valorcustoitementrada) {
        this.valorcustoitementrada = valorcustoitementrada;
    }

    public BigDecimal getIcmsitementrada() {
        return icmsitementrada;
    }

    public void setIcmsitementrada(BigDecimal icmsitementrada) {
        this.icmsitementrada = icmsitementrada;
    }

    public BigDecimal getIpiitementrada() {
        return ipiitementrada;
    }

    public void setIpiitementrada(BigDecimal ipiitementrada) {
        this.ipiitementrada = ipiitementrada;
    }

    public Integer getCfopitementrada() {
        return cfopitementrada;
    }

    public void setCfopitementrada(Integer cfopitementrada) {
        this.cfopitementrada = cfopitementrada;
    }

    public BigDecimal getValorcustototalitementrada() {
        return valorcustototalitementrada;
    }

    public void setValorcustototalitementrada(BigDecimal valorcustototalitementrada) {
        this.valorcustototalitementrada = valorcustototalitementrada;
    }

    public String getLoteitementrada() {
        return loteitementrada;
    }

    public void setLoteitementrada(String loteitementrada) {
        this.loteitementrada = loteitementrada;
    }

    public Date getDatavencimentotementrada() {
        return datavencimentotementrada;
    }

    public void setDatavencimentotementrada(Date datavencimentotementrada) {
        this.datavencimentotementrada = datavencimentotementrada;
    }

    public BigDecimal getValorvendaitementrada() {
        return valorvendaitementrada;
    }

    public void setValorvendaitementrada(BigDecimal valorvendaitementrada) {
        this.valorvendaitementrada = valorvendaitementrada;
    }

    public Boolean getFlagbrindeitemvenda() {
        return flagbrindeitemvenda;
    }

    public void setFlagbrindeitemvenda(Boolean flagbrindeitemvenda) {
        this.flagbrindeitemvenda = flagbrindeitemvenda;
    }

    public Integer getStatusitementrada() {
        return statusitementrada;
    }

    public void setStatusitementrada(Integer statusitementrada) {
        this.statusitementrada = statusitementrada;
    }

    public List<Estoque> getEstoqueList() {
        return estoqueList;
    }

    public void setEstoqueList(List<Estoque> estoqueList) {
        this.estoqueList = estoqueList;
    }

    public Produto getIdprodutoitementrada() {
        return idprodutoitementrada;
    }

    public void setIdprodutoitementrada(Produto idprodutoitementrada) {
        this.idprodutoitementrada = idprodutoitementrada;
    }

    public Entrada getIdentradaitementrada() {
        return identradaitementrada;
    }

    public void setIdentradaitementrada(Entrada identradaitementrada) {
        this.identradaitementrada = identradaitementrada;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iditementrada != null ? iditementrada.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Itementrada)) {
            return false;
        }
        Itementrada other = (Itementrada) object;
        if ((this.iditementrada == null && other.iditementrada != null) || (this.iditementrada != null && !this.iditementrada.equals(other.iditementrada))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sgps.classeMapeada.Itementrada[iditementrada=" + iditementrada + "]";
    }

}
