/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sgps.classeMapeada;

import java.io.Serializable;
import java.math.BigDecimal;
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

/**
 *
 * @author martins
 */
@Entity
@Table(name = "ITEMVENDA", catalog = "sgps", schema = "")
@NamedQueries({
    @NamedQuery(name = "Itemvenda.findAll", query = "SELECT i FROM Itemvenda i"),
    @NamedQuery(name = "Itemvenda.findByIditemvenda", query = "SELECT i FROM Itemvenda i WHERE i.iditemvenda = :iditemvenda"),
    @NamedQuery(name = "Itemvenda.findBySequenciaitemvenda", query = "SELECT i FROM Itemvenda i WHERE i.sequenciaitemvenda = :sequenciaitemvenda"),
    @NamedQuery(name = "Itemvenda.findByUmitemvenda", query = "SELECT i FROM Itemvenda i WHERE i.umitemvenda = :umitemvenda"),
    @NamedQuery(name = "Itemvenda.findByQuantidadeitemvenda", query = "SELECT i FROM Itemvenda i WHERE i.quantidadeitemvenda = :quantidadeitemvenda"),
    @NamedQuery(name = "Itemvenda.findByPrecocustoitemvenda", query = "SELECT i FROM Itemvenda i WHERE i.precocustoitemvenda = :precocustoitemvenda"),
    @NamedQuery(name = "Itemvenda.findByTotalcustoitemvenda", query = "SELECT i FROM Itemvenda i WHERE i.totalcustoitemvenda = :totalcustoitemvenda"),
    @NamedQuery(name = "Itemvenda.findByValorunitarioitemvenda", query = "SELECT i FROM Itemvenda i WHERE i.valorunitarioitemvenda = :valorunitarioitemvenda"),
    @NamedQuery(name = "Itemvenda.findByValortotalitemvenda", query = "SELECT i FROM Itemvenda i WHERE i.valortotalitemvenda = :valortotalitemvenda"),
    @NamedQuery(name = "Itemvenda.findByPercentualcomissaoitemvenda", query = "SELECT i FROM Itemvenda i WHERE i.percentualcomissaoitemvenda = :percentualcomissaoitemvenda"),
    @NamedQuery(name = "Itemvenda.findByValorcomissaoitemvenda", query = "SELECT i FROM Itemvenda i WHERE i.valorcomissaoitemvenda = :valorcomissaoitemvenda"),
    @NamedQuery(name = "Itemvenda.findByFlagcanceladoitemvenda", query = "SELECT i FROM Itemvenda i WHERE i.flagcanceladoitemvenda = :flagcanceladoitemvenda"),
    @NamedQuery(name = "Itemvenda.findByStatusitemvenda", query = "SELECT i FROM Itemvenda i WHERE i.statusitemvenda = :statusitemvenda")})
public class Itemvenda implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDITEMVENDA", nullable = false)
    private Integer iditemvenda;
    @Basic(optional = false)
    @Column(name = "SEQUENCIAITEMVENDA", nullable = false)
    private int sequenciaitemvenda;
    @Column(name = "UMITEMVENDA", length = 2)
    private String umitemvenda;
    @Column(name = "QUANTIDADEITEMVENDA", precision = 4, scale = 2)
    private BigDecimal quantidadeitemvenda;
    @Column(name = "PRECOCUSTOITEMVENDA", precision = 11, scale = 2)
    private BigDecimal precocustoitemvenda;
    @Column(name = "TOTALCUSTOITEMVENDA", precision = 11, scale = 2)
    private BigDecimal totalcustoitemvenda;
    @Column(name = "VALORUNITARIOITEMVENDA", precision = 11, scale = 2)
    private BigDecimal valorunitarioitemvenda;
    @Column(name = "VALORTOTALITEMVENDA", precision = 11, scale = 2)
    private BigDecimal valortotalitemvenda;
    @Column(name = "PERCENTUALCOMISSAOITEMVENDA", precision = 4, scale = 2)
    private BigDecimal percentualcomissaoitemvenda;
    @Column(name = "VALORCOMISSAOITEMVENDA", precision = 11, scale = 2)
    private BigDecimal valorcomissaoitemvenda;
    @Column(name = "FLAGCANCELADOITEMVENDA")
    private Boolean flagcanceladoitemvenda;
    @Column(name = "STATUSITEMVENDA")
    private Integer statusitemvenda;
    @OneToMany(mappedBy = "iditemvendaestoque")
    private List<Estoque> estoqueList;
    @JoinColumn(name = "IDVENDAVEMDA", referencedColumnName = "IDVENDA")
    @ManyToOne
    private Venda idvendavemda;
    @JoinColumn(name = "IDPRODUTOITEMVENDA", referencedColumnName = "IDPRODUTO")
    @ManyToOne
    private Produto idprodutoitemvenda;
    @JoinColumn(name = "IDUNIDADEMEDIDAITEMVENDA", referencedColumnName = "IDUNIDADEMEDIDA")
    @ManyToOne
    private Unidademedida idunidademedidaitemvenda;

    public Itemvenda() {
    }

    public Itemvenda(Integer iditemvenda) {
        this.iditemvenda = iditemvenda;
    }

    public Itemvenda(Integer iditemvenda, int sequenciaitemvenda) {
        this.iditemvenda = iditemvenda;
        this.sequenciaitemvenda = sequenciaitemvenda;
    }

    public Integer getIditemvenda() {
        return iditemvenda;
    }

    public void setIditemvenda(Integer iditemvenda) {
        this.iditemvenda = iditemvenda;
    }

    public int getSequenciaitemvenda() {
        return sequenciaitemvenda;
    }

    public void setSequenciaitemvenda(int sequenciaitemvenda) {
        this.sequenciaitemvenda = sequenciaitemvenda;
    }

    public String getUmitemvenda() {
        return umitemvenda;
    }

    public void setUmitemvenda(String umitemvenda) {
        this.umitemvenda = umitemvenda;
    }

    public BigDecimal getQuantidadeitemvenda() {
        return quantidadeitemvenda;
    }

    public void setQuantidadeitemvenda(BigDecimal quantidadeitemvenda) {
        this.quantidadeitemvenda = quantidadeitemvenda;
    }

    public BigDecimal getPrecocustoitemvenda() {
        return precocustoitemvenda;
    }

    public void setPrecocustoitemvenda(BigDecimal precocustoitemvenda) {
        this.precocustoitemvenda = precocustoitemvenda;
    }

    public BigDecimal getTotalcustoitemvenda() {
        return totalcustoitemvenda;
    }

    public void setTotalcustoitemvenda(BigDecimal totalcustoitemvenda) {
        this.totalcustoitemvenda = totalcustoitemvenda;
    }

    public BigDecimal getValorunitarioitemvenda() {
        return valorunitarioitemvenda;
    }

    public void setValorunitarioitemvenda(BigDecimal valorunitarioitemvenda) {
        this.valorunitarioitemvenda = valorunitarioitemvenda;
    }

    public BigDecimal getValortotalitemvenda() {
        return valortotalitemvenda;
    }

    public void setValortotalitemvenda(BigDecimal valortotalitemvenda) {
        this.valortotalitemvenda = valortotalitemvenda;
    }

    public BigDecimal getPercentualcomissaoitemvenda() {
        return percentualcomissaoitemvenda;
    }

    public void setPercentualcomissaoitemvenda(BigDecimal percentualcomissaoitemvenda) {
        this.percentualcomissaoitemvenda = percentualcomissaoitemvenda;
    }

    public BigDecimal getValorcomissaoitemvenda() {
        return valorcomissaoitemvenda;
    }

    public void setValorcomissaoitemvenda(BigDecimal valorcomissaoitemvenda) {
        this.valorcomissaoitemvenda = valorcomissaoitemvenda;
    }

    public Boolean getFlagcanceladoitemvenda() {
        return flagcanceladoitemvenda;
    }

    public void setFlagcanceladoitemvenda(Boolean flagcanceladoitemvenda) {
        this.flagcanceladoitemvenda = flagcanceladoitemvenda;
    }

    public Integer getStatusitemvenda() {
        return statusitemvenda;
    }

    public void setStatusitemvenda(Integer statusitemvenda) {
        this.statusitemvenda = statusitemvenda;
    }

    public List<Estoque> getEstoqueList() {
        return estoqueList;
    }

    public void setEstoqueList(List<Estoque> estoqueList) {
        this.estoqueList = estoqueList;
    }

    public Venda getIdvendavemda() {
        return idvendavemda;
    }

    public void setIdvendavemda(Venda idvendavemda) {
        this.idvendavemda = idvendavemda;
    }

    public Produto getIdprodutoitemvenda() {
        return idprodutoitemvenda;
    }

    public void setIdprodutoitemvenda(Produto idprodutoitemvenda) {
        this.idprodutoitemvenda = idprodutoitemvenda;
    }

    public Unidademedida getIdunidademedidaitemvenda() {
        return idunidademedidaitemvenda;
    }

    public void setIdunidademedidaitemvenda(Unidademedida idunidademedidaitemvenda) {
        this.idunidademedidaitemvenda = idunidademedidaitemvenda;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iditemvenda != null ? iditemvenda.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Itemvenda)) {
            return false;
        }
        Itemvenda other = (Itemvenda) object;
        if ((this.iditemvenda == null && other.iditemvenda != null) || (this.iditemvenda != null && !this.iditemvenda.equals(other.iditemvenda))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sgps.classeMapeada.Itemvenda[iditemvenda=" + iditemvenda + "]";
    }

}
