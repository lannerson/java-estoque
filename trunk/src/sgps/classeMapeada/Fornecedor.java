/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sgps.classeMapeada;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Daniel
 */
@Entity
@Table(name = "fornecedor")
@NamedQueries({
    @NamedQuery(name = "Fornecedor.findAll", query = "SELECT f FROM Fornecedor f"),
    @NamedQuery(name = "Fornecedor.findByIdpessoafornecedor", query = "SELECT f FROM Fornecedor f WHERE f.idpessoafornecedor = :idpessoafornecedor"),
    @NamedQuery(name = "Fornecedor.findByRazaosocialfornecedor", query = "SELECT f FROM Fornecedor f WHERE f.razaosocialfornecedor = :razaosocialfornecedor"),
    @NamedQuery(name = "Fornecedor.findByInscricaoourgfornecedor", query = "SELECT f FROM Fornecedor f WHERE f.inscricaoourgfornecedor = :inscricaoourgfornecedor"),
    @NamedQuery(name = "Fornecedor.findByContatofornecedor", query = "SELECT f FROM Fornecedor f WHERE f.contatofornecedor = :contatofornecedor"),
    @NamedQuery(name = "Fornecedor.findByEmailcontatofornecedor", query = "SELECT f FROM Fornecedor f WHERE f.emailcontatofornecedor = :emailcontatofornecedor"),
    @NamedQuery(name = "Fornecedor.findByContato2fornecedor", query = "SELECT f FROM Fornecedor f WHERE f.contato2fornecedor = :contato2fornecedor"),
    @NamedQuery(name = "Fornecedor.findByEmailcontato2fornecedor", query = "SELECT f FROM Fornecedor f WHERE f.emailcontato2fornecedor = :emailcontato2fornecedor"),
    @NamedQuery(name = "Fornecedor.findByIdcategoriafornecedor", query = "SELECT f FROM Fornecedor f WHERE f.idcategoriafornecedor = :idcategoriafornecedor"),
    @NamedQuery(name = "Fornecedor.findByObservacaofornecedor", query = "SELECT f FROM Fornecedor f WHERE f.observacaofornecedor = :observacaofornecedor")})
public class Fornecedor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDPESSOAFORNECEDOR")
    private Integer idpessoafornecedor;
    @Basic(optional = false)
    @Column(name = "RAZAOSOCIALFORNECEDOR")
    private String razaosocialfornecedor;
    @Column(name = "INSCRICAOOURGFORNECEDOR")
    private String inscricaoourgfornecedor;
    @Column(name = "CONTATOFORNECEDOR")
    private String contatofornecedor;
    @Column(name = "EMAILCONTATOFORNECEDOR")
    private String emailcontatofornecedor;
    @Column(name = "CONTATO2FORNECEDOR")
    private String contato2fornecedor;
    @Column(name = "EMAILCONTATO2FORNECEDOR")
    private String emailcontato2fornecedor;
    @Column(name = "IDCATEGORIAFORNECEDOR")
    private Integer idcategoriafornecedor;
    @Column(name = "OBSERVACAOFORNECEDOR")
    private String observacaofornecedor;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idpessoafornecedorcp")
    private Collection<Contaspagar> contaspagarCollection;
    @JoinColumn(name = "IDPESSOAFORNECEDOR", referencedColumnName = "IDPESSOA", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Pessoa pessoa;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idpessoafornecedor")
    private Collection<Entrada> entradaCollection;

    public Fornecedor() {
    }

    public Fornecedor(Integer idpessoafornecedor) {
        this.idpessoafornecedor = idpessoafornecedor;
    }

    public Fornecedor(Integer idpessoafornecedor, String razaosocialfornecedor) {
        this.idpessoafornecedor = idpessoafornecedor;
        this.razaosocialfornecedor = razaosocialfornecedor;
    }

    public Integer getIdpessoafornecedor() {
        return idpessoafornecedor;
    }

    public void setIdpessoafornecedor(Integer idpessoafornecedor) {
        this.idpessoafornecedor = idpessoafornecedor;
    }

    public String getRazaosocialfornecedor() {
        return razaosocialfornecedor;
    }

    public void setRazaosocialfornecedor(String razaosocialfornecedor) {
        this.razaosocialfornecedor = razaosocialfornecedor;
    }

    public String getInscricaoourgfornecedor() {
        return inscricaoourgfornecedor;
    }

    public void setInscricaoourgfornecedor(String inscricaoourgfornecedor) {
        this.inscricaoourgfornecedor = inscricaoourgfornecedor;
    }

    public String getContatofornecedor() {
        return contatofornecedor;
    }

    public void setContatofornecedor(String contatofornecedor) {
        this.contatofornecedor = contatofornecedor;
    }

    public String getEmailcontatofornecedor() {
        return emailcontatofornecedor;
    }

    public void setEmailcontatofornecedor(String emailcontatofornecedor) {
        this.emailcontatofornecedor = emailcontatofornecedor;
    }

    public String getContato2fornecedor() {
        return contato2fornecedor;
    }

    public void setContato2fornecedor(String contato2fornecedor) {
        this.contato2fornecedor = contato2fornecedor;
    }

    public String getEmailcontato2fornecedor() {
        return emailcontato2fornecedor;
    }

    public void setEmailcontato2fornecedor(String emailcontato2fornecedor) {
        this.emailcontato2fornecedor = emailcontato2fornecedor;
    }

    public Integer getIdcategoriafornecedor() {
        return idcategoriafornecedor;
    }

    public void setIdcategoriafornecedor(Integer idcategoriafornecedor) {
        this.idcategoriafornecedor = idcategoriafornecedor;
    }

    public String getObservacaofornecedor() {
        return observacaofornecedor;
    }

    public void setObservacaofornecedor(String observacaofornecedor) {
        this.observacaofornecedor = observacaofornecedor;
    }

    public Collection<Contaspagar> getContaspagarCollection() {
        return contaspagarCollection;
    }

    public void setContaspagarCollection(Collection<Contaspagar> contaspagarCollection) {
        this.contaspagarCollection = contaspagarCollection;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Collection<Entrada> getEntradaCollection() {
        return entradaCollection;
    }

    public void setEntradaCollection(Collection<Entrada> entradaCollection) {
        this.entradaCollection = entradaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpessoafornecedor != null ? idpessoafornecedor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fornecedor)) {
            return false;
        }
        Fornecedor other = (Fornecedor) object;
        if ((this.idpessoafornecedor == null && other.idpessoafornecedor != null) || (this.idpessoafornecedor != null && !this.idpessoafornecedor.equals(other.idpessoafornecedor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sgps.classeMapeada.Fornecedor[idpessoafornecedor=" + idpessoafornecedor + "]";
    }

}
