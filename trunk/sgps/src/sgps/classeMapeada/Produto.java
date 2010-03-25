/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sgps.classeMapeada;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
@Table(name = "PRODUTO", catalog = "sgps", schema = "")
@NamedQueries({
    @NamedQuery(name = "Produto.findAll", query = "SELECT p FROM Produto p"),
    @NamedQuery(name = "Produto.findByIdproduto", query = "SELECT p FROM Produto p WHERE p.idproduto = :idproduto"),
    @NamedQuery(name = "Produto.findByCodigobarraproduto", query = "SELECT p FROM Produto p WHERE p.codigobarraproduto = :codigobarraproduto"),
    @NamedQuery(name = "Produto.findByTipoproduto", query = "SELECT p FROM Produto p WHERE p.tipoproduto = :tipoproduto"),
    @NamedQuery(name = "Produto.findByNomeproduto", query = "SELECT p FROM Produto p WHERE p.nomeproduto = :nomeproduto"),
    @NamedQuery(name = "Produto.findByDescricaoabreviadaproduto", query = "SELECT p FROM Produto p WHERE p.descricaoabreviadaproduto = :descricaoabreviadaproduto"),
    @NamedQuery(name = "Produto.findByUnidademedidaproduto", query = "SELECT p FROM Produto p WHERE p.unidademedidaproduto = :unidademedidaproduto"),
    @NamedQuery(name = "Produto.findByValorcustoproduto", query = "SELECT p FROM Produto p WHERE p.valorcustoproduto = :valorcustoproduto"),
    @NamedQuery(name = "Produto.findByPercentuallucroproduto", query = "SELECT p FROM Produto p WHERE p.percentuallucroproduto = :percentuallucroproduto"),
    @NamedQuery(name = "Produto.findByValorvendaproduto", query = "SELECT p FROM Produto p WHERE p.valorvendaproduto = :valorvendaproduto"),
    @NamedQuery(name = "Produto.findByValorminimovenda", query = "SELECT p FROM Produto p WHERE p.valorminimovenda = :valorminimovenda"),
    @NamedQuery(name = "Produto.findByEstoqueproduto", query = "SELECT p FROM Produto p WHERE p.estoqueproduto = :estoqueproduto"),
    @NamedQuery(name = "Produto.findByEstoqueminimoproduto", query = "SELECT p FROM Produto p WHERE p.estoqueminimoproduto = :estoqueminimoproduto"),
    @NamedQuery(name = "Produto.findBySituacaotributariaproduto", query = "SELECT p FROM Produto p WHERE p.situacaotributariaproduto = :situacaotributariaproduto"),
    @NamedQuery(name = "Produto.findByAlicotaicmsproduto", query = "SELECT p FROM Produto p WHERE p.alicotaicmsproduto = :alicotaicmsproduto"),
    @NamedQuery(name = "Produto.findByIpiproduto", query = "SELECT p FROM Produto p WHERE p.ipiproduto = :ipiproduto"),
    @NamedQuery(name = "Produto.findByCodigofiscalproduto", query = "SELECT p FROM Produto p WHERE p.codigofiscalproduto = :codigofiscalproduto"),
    @NamedQuery(name = "Produto.findByMaoobraproduto", query = "SELECT p FROM Produto p WHERE p.maoobraproduto = :maoobraproduto"),
    @NamedQuery(name = "Produto.findByDataultimovalorproduto", query = "SELECT p FROM Produto p WHERE p.dataultimovalorproduto = :dataultimovalorproduto"),
    @NamedQuery(name = "Produto.findByValorultimocustoproduto", query = "SELECT p FROM Produto p WHERE p.valorultimocustoproduto = :valorultimocustoproduto"),
    @NamedQuery(name = "Produto.findByQuantidadeultimacompraproduto", query = "SELECT p FROM Produto p WHERE p.quantidadeultimacompraproduto = :quantidadeultimacompraproduto"),
    @NamedQuery(name = "Produto.findByPesobrutoproduto", query = "SELECT p FROM Produto p WHERE p.pesobrutoproduto = :pesobrutoproduto"),
    @NamedQuery(name = "Produto.findByPesoliquidoproduto", query = "SELECT p FROM Produto p WHERE p.pesoliquidoproduto = :pesoliquidoproduto"),
    @NamedQuery(name = "Produto.findByMarcaproduto", query = "SELECT p FROM Produto p WHERE p.marcaproduto = :marcaproduto"),
    @NamedQuery(name = "Produto.findByCorproduto", query = "SELECT p FROM Produto p WHERE p.corproduto = :corproduto"),
    @NamedQuery(name = "Produto.findByTamanhoproduto", query = "SELECT p FROM Produto p WHERE p.tamanhoproduto = :tamanhoproduto"),
    @NamedQuery(name = "Produto.findByAlturaproduto", query = "SELECT p FROM Produto p WHERE p.alturaproduto = :alturaproduto"),
    @NamedQuery(name = "Produto.findByCumprimentoproduto", query = "SELECT p FROM Produto p WHERE p.cumprimentoproduto = :cumprimentoproduto"),
    @NamedQuery(name = "Produto.findByDiasvencimentoproduto", query = "SELECT p FROM Produto p WHERE p.diasvencimentoproduto = :diasvencimentoproduto"),
    @NamedQuery(name = "Produto.findByStatusinativoproduto", query = "SELECT p FROM Produto p WHERE p.statusinativoproduto = :statusinativoproduto"),
    @NamedQuery(name = "Produto.findByStatusproduto", query = "SELECT p FROM Produto p WHERE p.statusproduto = :statusproduto")})
public class Produto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDPRODUTO", nullable = false)
    private Integer idproduto;
    @Column(name = "CODIGOBARRAPRODUTO", length = 60)
    private String codigobarraproduto;
    @Column(name = "TIPOPRODUTO")
    private Integer tipoproduto;
    @Basic(optional = false)
    @Column(name = "NOMEPRODUTO", nullable = false, length = 60)
    private String nomeproduto;
    @Column(name = "DESCRICAOABREVIADAPRODUTO", length = 40)
    private String descricaoabreviadaproduto;
    @Basic(optional = false)
    @Column(name = "UNIDADEMEDIDAPRODUTO", nullable = false, length = 2)
    private String unidademedidaproduto;
    @Column(name = "VALORCUSTOPRODUTO", precision = 11, scale = 2)
    private BigDecimal valorcustoproduto;
    @Column(name = "PERCENTUALLUCROPRODUTO", precision = 4, scale = 2)
    private BigDecimal percentuallucroproduto;
    @Column(name = "VALORVENDAPRODUTO", precision = 11, scale = 2)
    private BigDecimal valorvendaproduto;
    @Column(name = "VALORMINIMOVENDA", precision = 11, scale = 2)
    private BigDecimal valorminimovenda;
    @Column(name = "ESTOQUEPRODUTO", precision = 11, scale = 2)
    private BigDecimal estoqueproduto;
    @Column(name = "ESTOQUEMINIMOPRODUTO", precision = 11, scale = 2)
    private BigDecimal estoqueminimoproduto;
    @Column(name = "SITUACAOTRIBUTARIAPRODUTO", length = 10)
    private String situacaotributariaproduto;
    @Column(name = "ALICOTAICMSPRODUTO", precision = 4, scale = 2)
    private BigDecimal alicotaicmsproduto;
    @Column(name = "IPIPRODUTO", precision = 4, scale = 2)
    private BigDecimal ipiproduto;
    @Column(name = "CODIGOFISCALPRODUTO", length = 2)
    private String codigofiscalproduto;
    @Column(name = "MAOOBRAPRODUTO", precision = 11, scale = 2)
    private BigDecimal maoobraproduto;
    @Column(name = "DATAULTIMOVALORPRODUTO", precision = 11, scale = 2)
    private BigDecimal dataultimovalorproduto;
    @Column(name = "VALORULTIMOCUSTOPRODUTO", precision = 11, scale = 2)
    private BigDecimal valorultimocustoproduto;
    @Column(name = "QUANTIDADEULTIMACOMPRAPRODUTO", precision = 11, scale = 2)
    private BigDecimal quantidadeultimacompraproduto;
    @Column(name = "PESOBRUTOPRODUTO", precision = 11, scale = 2)
    private BigDecimal pesobrutoproduto;
    @Column(name = "PESOLIQUIDOPRODUTO", precision = 11, scale = 2)
    private BigDecimal pesoliquidoproduto;
    @Column(name = "MARCAPRODUTO", length = 35)
    private String marcaproduto;
    @Column(name = "CORPRODUTO", length = 10)
    private String corproduto;
    @Column(name = "TAMANHOPRODUTO", length = 10)
    private String tamanhoproduto;
    @Column(name = "ALTURAPRODUTO", precision = 11, scale = 2)
    private BigDecimal alturaproduto;
    @Column(name = "CUMPRIMENTOPRODUTO", precision = 11, scale = 2)
    private BigDecimal cumprimentoproduto;
    @Column(name = "DIASVENCIMENTOPRODUTO")
    private Integer diasvencimentoproduto;
    @Column(name = "STATUSINATIVOPRODUTO")
    private Boolean statusinativoproduto;
    @Column(name = "STATUSPRODUTO")
    private Integer statusproduto;
    @OneToMany(mappedBy = "idprodutoestoque")
    private List<Estoque> estoqueList;
    @JoinColumn(name = "IDUNIDADEMEDIDAPRODUTO", referencedColumnName = "IDUNIDADEMEDIDA", nullable = false)
    @ManyToOne(optional = false)
    private Unidademedida idunidademedidaproduto;
    @JoinColumn(name = "IDPESSOAFORNECEDOR", referencedColumnName = "IDPESSOAFORNECEDOR")
    @ManyToOne
    private Fornecedor idpessoafornecedor;
    @JoinColumn(name = "IDGRUPOPRODUTO", referencedColumnName = "IDGRUPO", nullable = false)
    @ManyToOne(optional = false)
    private Grupoproduto idgrupoproduto;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idprodutoitementrada")
    private List<Itementrada> itementradaList;
    @OneToMany(mappedBy = "idprodutoitemvenda")
    private List<Itemvenda> itemvendaList;

    public Produto() {
    }

    public Produto(Integer idproduto) {
        this.idproduto = idproduto;
    }

    public Produto(Integer idproduto, String nomeproduto, String unidademedidaproduto) {
        this.idproduto = idproduto;
        this.nomeproduto = nomeproduto;
        this.unidademedidaproduto = unidademedidaproduto;
    }

    public Integer getIdproduto() {
        return idproduto;
    }

    public void setIdproduto(Integer idproduto) {
        this.idproduto = idproduto;
    }

    public String getCodigobarraproduto() {
        return codigobarraproduto;
    }

    public void setCodigobarraproduto(String codigobarraproduto) {
        this.codigobarraproduto = codigobarraproduto;
    }

    public Integer getTipoproduto() {
        return tipoproduto;
    }

    public void setTipoproduto(Integer tipoproduto) {
        this.tipoproduto = tipoproduto;
    }

    public String getNomeproduto() {
        return nomeproduto;
    }

    public void setNomeproduto(String nomeproduto) {
        this.nomeproduto = nomeproduto;
    }

    public String getDescricaoabreviadaproduto() {
        return descricaoabreviadaproduto;
    }

    public void setDescricaoabreviadaproduto(String descricaoabreviadaproduto) {
        this.descricaoabreviadaproduto = descricaoabreviadaproduto;
    }

    public String getUnidademedidaproduto() {
        return unidademedidaproduto;
    }

    public void setUnidademedidaproduto(String unidademedidaproduto) {
        this.unidademedidaproduto = unidademedidaproduto;
    }

    public BigDecimal getValorcustoproduto() {
        return valorcustoproduto;
    }

    public void setValorcustoproduto(BigDecimal valorcustoproduto) {
        this.valorcustoproduto = valorcustoproduto;
    }

    public BigDecimal getPercentuallucroproduto() {
        return percentuallucroproduto;
    }

    public void setPercentuallucroproduto(BigDecimal percentuallucroproduto) {
        this.percentuallucroproduto = percentuallucroproduto;
    }

    public BigDecimal getValorvendaproduto() {
        return valorvendaproduto;
    }

    public void setValorvendaproduto(BigDecimal valorvendaproduto) {
        this.valorvendaproduto = valorvendaproduto;
    }

    public BigDecimal getValorminimovenda() {
        return valorminimovenda;
    }

    public void setValorminimovenda(BigDecimal valorminimovenda) {
        this.valorminimovenda = valorminimovenda;
    }

    public BigDecimal getEstoqueproduto() {
        return estoqueproduto;
    }

    public void setEstoqueproduto(BigDecimal estoqueproduto) {
        this.estoqueproduto = estoqueproduto;
    }

    public BigDecimal getEstoqueminimoproduto() {
        return estoqueminimoproduto;
    }

    public void setEstoqueminimoproduto(BigDecimal estoqueminimoproduto) {
        this.estoqueminimoproduto = estoqueminimoproduto;
    }

    public String getSituacaotributariaproduto() {
        return situacaotributariaproduto;
    }

    public void setSituacaotributariaproduto(String situacaotributariaproduto) {
        this.situacaotributariaproduto = situacaotributariaproduto;
    }

    public BigDecimal getAlicotaicmsproduto() {
        return alicotaicmsproduto;
    }

    public void setAlicotaicmsproduto(BigDecimal alicotaicmsproduto) {
        this.alicotaicmsproduto = alicotaicmsproduto;
    }

    public BigDecimal getIpiproduto() {
        return ipiproduto;
    }

    public void setIpiproduto(BigDecimal ipiproduto) {
        this.ipiproduto = ipiproduto;
    }

    public String getCodigofiscalproduto() {
        return codigofiscalproduto;
    }

    public void setCodigofiscalproduto(String codigofiscalproduto) {
        this.codigofiscalproduto = codigofiscalproduto;
    }

    public BigDecimal getMaoobraproduto() {
        return maoobraproduto;
    }

    public void setMaoobraproduto(BigDecimal maoobraproduto) {
        this.maoobraproduto = maoobraproduto;
    }

    public BigDecimal getDataultimovalorproduto() {
        return dataultimovalorproduto;
    }

    public void setDataultimovalorproduto(BigDecimal dataultimovalorproduto) {
        this.dataultimovalorproduto = dataultimovalorproduto;
    }

    public BigDecimal getValorultimocustoproduto() {
        return valorultimocustoproduto;
    }

    public void setValorultimocustoproduto(BigDecimal valorultimocustoproduto) {
        this.valorultimocustoproduto = valorultimocustoproduto;
    }

    public BigDecimal getQuantidadeultimacompraproduto() {
        return quantidadeultimacompraproduto;
    }

    public void setQuantidadeultimacompraproduto(BigDecimal quantidadeultimacompraproduto) {
        this.quantidadeultimacompraproduto = quantidadeultimacompraproduto;
    }

    public BigDecimal getPesobrutoproduto() {
        return pesobrutoproduto;
    }

    public void setPesobrutoproduto(BigDecimal pesobrutoproduto) {
        this.pesobrutoproduto = pesobrutoproduto;
    }

    public BigDecimal getPesoliquidoproduto() {
        return pesoliquidoproduto;
    }

    public void setPesoliquidoproduto(BigDecimal pesoliquidoproduto) {
        this.pesoliquidoproduto = pesoliquidoproduto;
    }

    public String getMarcaproduto() {
        return marcaproduto;
    }

    public void setMarcaproduto(String marcaproduto) {
        this.marcaproduto = marcaproduto;
    }

    public String getCorproduto() {
        return corproduto;
    }

    public void setCorproduto(String corproduto) {
        this.corproduto = corproduto;
    }

    public String getTamanhoproduto() {
        return tamanhoproduto;
    }

    public void setTamanhoproduto(String tamanhoproduto) {
        this.tamanhoproduto = tamanhoproduto;
    }

    public BigDecimal getAlturaproduto() {
        return alturaproduto;
    }

    public void setAlturaproduto(BigDecimal alturaproduto) {
        this.alturaproduto = alturaproduto;
    }

    public BigDecimal getCumprimentoproduto() {
        return cumprimentoproduto;
    }

    public void setCumprimentoproduto(BigDecimal cumprimentoproduto) {
        this.cumprimentoproduto = cumprimentoproduto;
    }

    public Integer getDiasvencimentoproduto() {
        return diasvencimentoproduto;
    }

    public void setDiasvencimentoproduto(Integer diasvencimentoproduto) {
        this.diasvencimentoproduto = diasvencimentoproduto;
    }

    public Boolean getStatusinativoproduto() {
        return statusinativoproduto;
    }

    public void setStatusinativoproduto(Boolean statusinativoproduto) {
        this.statusinativoproduto = statusinativoproduto;
    }

    public Integer getStatusproduto() {
        return statusproduto;
    }

    public void setStatusproduto(Integer statusproduto) {
        this.statusproduto = statusproduto;
    }

    public List<Estoque> getEstoqueList() {
        return estoqueList;
    }

    public void setEstoqueList(List<Estoque> estoqueList) {
        this.estoqueList = estoqueList;
    }

    public Unidademedida getIdunidademedidaproduto() {
        return idunidademedidaproduto;
    }

    public void setIdunidademedidaproduto(Unidademedida idunidademedidaproduto) {
        this.idunidademedidaproduto = idunidademedidaproduto;
    }

    public Fornecedor getIdpessoafornecedor() {
        return idpessoafornecedor;
    }

    public void setIdpessoafornecedor(Fornecedor idpessoafornecedor) {
        this.idpessoafornecedor = idpessoafornecedor;
    }

    public Grupoproduto getIdgrupoproduto() {
        return idgrupoproduto;
    }

    public void setIdgrupoproduto(Grupoproduto idgrupoproduto) {
        this.idgrupoproduto = idgrupoproduto;
    }

    public List<Itementrada> getItementradaList() {
        return itementradaList;
    }

    public void setItementradaList(List<Itementrada> itementradaList) {
        this.itementradaList = itementradaList;
    }

    public List<Itemvenda> getItemvendaList() {
        return itemvendaList;
    }

    public void setItemvendaList(List<Itemvenda> itemvendaList) {
        this.itemvendaList = itemvendaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idproduto != null ? idproduto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produto)) {
            return false;
        }
        Produto other = (Produto) object;
        if ((this.idproduto == null && other.idproduto != null) || (this.idproduto != null && !this.idproduto.equals(other.idproduto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sgps.classeMapeada.Produto[idproduto=" + idproduto + "]";
    }

}
