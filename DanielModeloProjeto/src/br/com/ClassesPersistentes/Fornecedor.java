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
@Table(name = "fornecedor")
@NamedQueries({
    @NamedQuery(name = "Fornecedor.findAll", query = "SELECT f FROM Fornecedor f"),
    @NamedQuery(name = "Fornecedor.findByCodFornecedor", query = "SELECT f FROM Fornecedor f WHERE f.codFornecedor = :codFornecedor"),
    @NamedQuery(name = "Fornecedor.findByNomeFornecedor", query = "SELECT f FROM Fornecedor f WHERE f.nomeFornecedor = :nomeFornecedor"),
    @NamedQuery(name = "Fornecedor.findByCpfFornecedor", query = "SELECT f FROM Fornecedor f WHERE f.cpfFornecedor = :cpfFornecedor"),
    @NamedQuery(name = "Fornecedor.findByRgFornecedor", query = "SELECT f FROM Fornecedor f WHERE f.rgFornecedor = :rgFornecedor"),
    @NamedQuery(name = "Fornecedor.findByOrgaoRgFornecedor", query = "SELECT f FROM Fornecedor f WHERE f.orgaoRgFornecedor = :orgaoRgFornecedor"),
    @NamedQuery(name = "Fornecedor.findByCnpjFornecedor", query = "SELECT f FROM Fornecedor f WHERE f.cnpjFornecedor = :cnpjFornecedor"),
    @NamedQuery(name = "Fornecedor.findByTipoFornecedor", query = "SELECT f FROM Fornecedor f WHERE f.tipoFornecedor = :tipoFornecedor"),
    @NamedQuery(name = "Fornecedor.findByEnderecoFornecedor", query = "SELECT f FROM Fornecedor f WHERE f.enderecoFornecedor = :enderecoFornecedor"),
    @NamedQuery(name = "Fornecedor.findByBairroFornecedor", query = "SELECT f FROM Fornecedor f WHERE f.bairroFornecedor = :bairroFornecedor"),
    @NamedQuery(name = "Fornecedor.findByCidadeFornecedor", query = "SELECT f FROM Fornecedor f WHERE f.cidadeFornecedor = :cidadeFornecedor"),
    @NamedQuery(name = "Fornecedor.findByUfFornecedor", query = "SELECT f FROM Fornecedor f WHERE f.ufFornecedor = :ufFornecedor"),
    @NamedQuery(name = "Fornecedor.findByCepFornecedor", query = "SELECT f FROM Fornecedor f WHERE f.cepFornecedor = :cepFornecedor"),
    @NamedQuery(name = "Fornecedor.findByEmailFornecedor", query = "SELECT f FROM Fornecedor f WHERE f.emailFornecedor = :emailFornecedor"),
    @NamedQuery(name = "Fornecedor.findBySiteFornecedor", query = "SELECT f FROM Fornecedor f WHERE f.siteFornecedor = :siteFornecedor"),
    @NamedQuery(name = "Fornecedor.findByFoneFornecedor", query = "SELECT f FROM Fornecedor f WHERE f.foneFornecedor = :foneFornecedor"),
    @NamedQuery(name = "Fornecedor.findByCelularFornecedor", query = "SELECT f FROM Fornecedor f WHERE f.celularFornecedor = :celularFornecedor"),
    @NamedQuery(name = "Fornecedor.findByFaxFornecedor", query = "SELECT f FROM Fornecedor f WHERE f.faxFornecedor = :faxFornecedor"),
    @NamedQuery(name = "Fornecedor.findByContatoFornecedor", query = "SELECT f FROM Fornecedor f WHERE f.contatoFornecedor = :contatoFornecedor"),
    @NamedQuery(name = "Fornecedor.findByNomeFornecedor1", query = "SELECT f FROM Fornecedor f WHERE f.nomeFornecedor1 = :nomeFornecedor1")})
public class Fornecedor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "COD_FORNECEDOR")
    private Integer codFornecedor;
    @Column(name = "NOME_FORNECEDOR")
    private String nomeFornecedor;
    @Column(name = "CPF_FORNECEDOR")
    private String cpfFornecedor;
    @Column(name = "RG_FORNECEDOR")
    private String rgFornecedor;
    @Column(name = "ORGAO_RG_FORNECEDOR")
    private String orgaoRgFornecedor;
    @Column(name = "CNPJ_FORNECEDOR")
    private String cnpjFornecedor;
    @Column(name = "TIPO_FORNECEDOR")
    private Character tipoFornecedor;
    @Column(name = "ENDERECO_FORNECEDOR")
    private String enderecoFornecedor;
    @Column(name = "BAIRRO_FORNECEDOR")
    private String bairroFornecedor;
    @Column(name = "CIDADE_FORNECEDOR")
    private String cidadeFornecedor;
    @Column(name = "UF_FORNECEDOR")
    private String ufFornecedor;
    @Column(name = "CEP_FORNECEDOR")
    private String cepFornecedor;
    @Column(name = "EMAIL_FORNECEDOR")
    private String emailFornecedor;
    @Column(name = "SITE_FORNECEDOR")
    private String siteFornecedor;
    @Column(name = "FONE_FORNECEDOR")
    private String foneFornecedor;
    @Column(name = "CELULAR_FORNECEDOR")
    private String celularFornecedor;
    @Column(name = "FAX_FORNECEDOR")
    private String faxFornecedor;
    @Column(name = "CONTATO_FORNECEDOR")
    private String contatoFornecedor;
    @Column(name = "nomeFornecedor")
    private String nomeFornecedor1;
    @OneToMany(mappedBy = "codFornecedor")
    private Collection<Produto> produtoCollection;

    public Fornecedor() {
    }

    public Fornecedor(Integer codFornecedor) {
        this.codFornecedor = codFornecedor;
    }

    public Integer getCodFornecedor() {
        return codFornecedor;
    }

    public void setCodFornecedor(Integer codFornecedor) {
        this.codFornecedor = codFornecedor;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public String getCpfFornecedor() {
        return cpfFornecedor;
    }

    public void setCpfFornecedor(String cpfFornecedor) {
        this.cpfFornecedor = cpfFornecedor;
    }

    public String getRgFornecedor() {
        return rgFornecedor;
    }

    public void setRgFornecedor(String rgFornecedor) {
        this.rgFornecedor = rgFornecedor;
    }

    public String getOrgaoRgFornecedor() {
        return orgaoRgFornecedor;
    }

    public void setOrgaoRgFornecedor(String orgaoRgFornecedor) {
        this.orgaoRgFornecedor = orgaoRgFornecedor;
    }

    public String getCnpjFornecedor() {
        return cnpjFornecedor;
    }

    public void setCnpjFornecedor(String cnpjFornecedor) {
        this.cnpjFornecedor = cnpjFornecedor;
    }

    public Character getTipoFornecedor() {
        return tipoFornecedor;
    }

    public void setTipoFornecedor(Character tipoFornecedor) {
        this.tipoFornecedor = tipoFornecedor;
    }

    public String getEnderecoFornecedor() {
        return enderecoFornecedor;
    }

    public void setEnderecoFornecedor(String enderecoFornecedor) {
        this.enderecoFornecedor = enderecoFornecedor;
    }

    public String getBairroFornecedor() {
        return bairroFornecedor;
    }

    public void setBairroFornecedor(String bairroFornecedor) {
        this.bairroFornecedor = bairroFornecedor;
    }

    public String getCidadeFornecedor() {
        return cidadeFornecedor;
    }

    public void setCidadeFornecedor(String cidadeFornecedor) {
        this.cidadeFornecedor = cidadeFornecedor;
    }

    public String getUfFornecedor() {
        return ufFornecedor;
    }

    public void setUfFornecedor(String ufFornecedor) {
        this.ufFornecedor = ufFornecedor;
    }

    public String getCepFornecedor() {
        return cepFornecedor;
    }

    public void setCepFornecedor(String cepFornecedor) {
        this.cepFornecedor = cepFornecedor;
    }

    public String getEmailFornecedor() {
        return emailFornecedor;
    }

    public void setEmailFornecedor(String emailFornecedor) {
        this.emailFornecedor = emailFornecedor;
    }

    public String getSiteFornecedor() {
        return siteFornecedor;
    }

    public void setSiteFornecedor(String siteFornecedor) {
        this.siteFornecedor = siteFornecedor;
    }

    public String getFoneFornecedor() {
        return foneFornecedor;
    }

    public void setFoneFornecedor(String foneFornecedor) {
        this.foneFornecedor = foneFornecedor;
    }

    public String getCelularFornecedor() {
        return celularFornecedor;
    }

    public void setCelularFornecedor(String celularFornecedor) {
        this.celularFornecedor = celularFornecedor;
    }

    public String getFaxFornecedor() {
        return faxFornecedor;
    }

    public void setFaxFornecedor(String faxFornecedor) {
        this.faxFornecedor = faxFornecedor;
    }

    public String getContatoFornecedor() {
        return contatoFornecedor;
    }

    public void setContatoFornecedor(String contatoFornecedor) {
        this.contatoFornecedor = contatoFornecedor;
    }

    public String getNomeFornecedor1() {
        return nomeFornecedor1;
    }

    public void setNomeFornecedor1(String nomeFornecedor1) {
        this.nomeFornecedor1 = nomeFornecedor1;
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
        hash += (codFornecedor != null ? codFornecedor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fornecedor)) {
            return false;
        }
        Fornecedor other = (Fornecedor) object;
        if ((this.codFornecedor == null && other.codFornecedor != null) || (this.codFornecedor != null && !this.codFornecedor.equals(other.codFornecedor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.Persistencia.Fornecedor[codFornecedor=" + codFornecedor + "]";
    }

}
