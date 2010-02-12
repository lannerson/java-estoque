/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.ClassesPersistentes;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Daniel
 */
@Entity
@Table(name = "produto")
@NamedQueries({
    @NamedQuery(name = "Produto.findById", query = "SELECT p FROM Produto p WHERE p.codProduto = :id"),
    @NamedQuery(name = "Produto.findAll", query = "SELECT p FROM Produto p"),
    @NamedQuery(name = "Produto.findByCodProduto", query = "SELECT p FROM Produto p WHERE p.codProduto = :codProduto"),
    @NamedQuery(name = "Produto.findByDescricaoProduto", query = "SELECT p FROM Produto p WHERE p.descricaoProduto = :descricaoProduto"),
    @NamedQuery(name = "Produto.findByVlrCompraProduto", query = "SELECT p FROM Produto p WHERE p.vlrCompraProduto = :vlrCompraProduto"),
    @NamedQuery(name = "Produto.findByVlrVendaProduto", query = "SELECT p FROM Produto p WHERE p.vlrVendaProduto = :vlrVendaProduto"),
    @NamedQuery(name = "Produto.findByEstoqueProduto", query = "SELECT p FROM Produto p WHERE p.estoqueProduto = :estoqueProduto"),
    @NamedQuery(name = "Produto.findByCriticoProduto", query = "SELECT p FROM Produto p WHERE p.criticoProduto = :criticoProduto")})
public class Produto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_PRODUTO")
    private String codProduto;
    @Column(name = "DESCRICAO_PRODUTO")
    private String descricaoProduto;
    @Column(name = "VLR_COMPRA_PRODUTO")
    private Double vlrCompraProduto;
    @Column(name = "VLR_VENDA_PRODUTO")
    private Double vlrVendaProduto;
    @Column(name = "ESTOQUE_PRODUTO")
    private Integer estoqueProduto;
    @Column(name = "CRITICO_PRODUTO")
    private Integer criticoProduto;
    @JoinColumn(name = "COD_FORNECEDOR", referencedColumnName = "COD_FORNECEDOR")
    @ManyToOne
    private Fornecedor codFornecedor;
    @JoinColumn(name = "COD_UNIDADE", referencedColumnName = "COD_UNIDADE")
    @ManyToOne
    private Unidade codUnidade;

    public Produto() {
    }

    public Produto(String codProduto) {
        this.codProduto = codProduto;
    }

    public String getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(String codProduto) {
        this.codProduto = codProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public Double getVlrCompraProduto() {
        return vlrCompraProduto;
    }

    public void setVlrCompraProduto(Double vlrCompraProduto) {
        this.vlrCompraProduto = vlrCompraProduto;
    }

    public Double getVlrVendaProduto() {
        return vlrVendaProduto;
    }

    public void setVlrVendaProduto(Double vlrVendaProduto) {
        this.vlrVendaProduto = vlrVendaProduto;
    }

    public Integer getEstoqueProduto() {
        return estoqueProduto;
    }

    public void setEstoqueProduto(Integer estoqueProduto) {
        this.estoqueProduto = estoqueProduto;
    }

    public Integer getCriticoProduto() {
        return criticoProduto;
    }

    public void setCriticoProduto(Integer criticoProduto) {
        this.criticoProduto = criticoProduto;
    }

    public Fornecedor getCodFornecedor() {
        return codFornecedor;
    }

    public void setCodFornecedor(Fornecedor codFornecedor) {
        this.codFornecedor = codFornecedor;
    }

    public Unidade getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(Unidade codUnidade) {
        this.codUnidade = codUnidade;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codProduto != null ? codProduto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produto)) {
            return false;
        }
        Produto other = (Produto) object;
        if ((this.codProduto == null && other.codProduto != null) || (this.codProduto != null && !this.codProduto.equals(other.codProduto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.Persistencia.Produto[codProduto=" + codProduto + "]";
    }

}
