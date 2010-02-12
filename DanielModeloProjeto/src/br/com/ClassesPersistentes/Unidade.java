/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.ClassesPersistentes;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Daniel
 */
@Entity
@Table(name = "unidade")
@NamedQueries({
    @NamedQuery(name = "Unidade.findAll", query = "SELECT u FROM Unidade u"),
    @NamedQuery(name = "Unidade.findByCodUnidade", query = "SELECT u FROM Unidade u WHERE u.codUnidade = :codUnidade"),
    @NamedQuery(name = "Unidade.findByDescricaoUnidade", query = "SELECT u FROM Unidade u WHERE u.descricaoUnidade = :descricaoUnidade")})
public class Unidade implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "COD_UNIDADE")
    private Integer codUnidade;
    @Column(name = "DESCRICAO_UNIDADE")
    private String descricaoUnidade;
    @OneToMany(mappedBy = "codUnidade")
    private Collection<Produto> produtoCollection;

    public Unidade() {
    }

    public Unidade(Integer codUnidade) {
        this.codUnidade = codUnidade;
    }

    public Integer getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(Integer codUnidade) {
        this.codUnidade = codUnidade;
    }

    public String getDescricaoUnidade() {
        return descricaoUnidade;
    }

    public void setDescricaoUnidade(String descricaoUnidade) {
        this.descricaoUnidade = descricaoUnidade;
    }

    public Collection<Produto> getProdutoCollection() {
        return produtoCollection;
    }

    public void setProdutoCollection(Collection<Produto> produtoCollection) {
        this.produtoCollection = produtoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codUnidade != null ? codUnidade.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Unidade)) {
            return false;
        }
        Unidade other = (Unidade) object;
        if ((this.codUnidade == null && other.codUnidade != null) || (this.codUnidade != null && !this.codUnidade.equals(other.codUnidade))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.Persistencia.Unidade[codUnidade=" + codUnidade + "]";
    }

}
