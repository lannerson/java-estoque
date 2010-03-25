/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sgps.classeMapeada;

import java.io.Serializable;
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
import javax.persistence.Table;

/**
 *
 * @author martins
 */
@Entity
@Table(name = "ENDERECO", catalog = "sgps", schema = "")
@NamedQueries({
    @NamedQuery(name = "Endereco.findAll", query = "SELECT e FROM Endereco e"),
    @NamedQuery(name = "Endereco.findByIdendereco", query = "SELECT e FROM Endereco e WHERE e.idendereco = :idendereco"),
    @NamedQuery(name = "Endereco.findByTipoendereco", query = "SELECT e FROM Endereco e WHERE e.tipoendereco = :tipoendereco"),
    @NamedQuery(name = "Endereco.findByCependereco", query = "SELECT e FROM Endereco e WHERE e.cependereco = :cependereco"),
    @NamedQuery(name = "Endereco.findByEndereco", query = "SELECT e FROM Endereco e WHERE e.endereco = :endereco"),
    @NamedQuery(name = "Endereco.findByBairroendereco", query = "SELECT e FROM Endereco e WHERE e.bairroendereco = :bairroendereco"),
    @NamedQuery(name = "Endereco.findBySiglaestadoendereco", query = "SELECT e FROM Endereco e WHERE e.siglaestadoendereco = :siglaestadoendereco"),
    @NamedQuery(name = "Endereco.findByNumeroendereco", query = "SELECT e FROM Endereco e WHERE e.numeroendereco = :numeroendereco"),
    @NamedQuery(name = "Endereco.findByComplementoendereco", query = "SELECT e FROM Endereco e WHERE e.complementoendereco = :complementoendereco"),
    @NamedQuery(name = "Endereco.findByPontoreferenciaendereco", query = "SELECT e FROM Endereco e WHERE e.pontoreferenciaendereco = :pontoreferenciaendereco")})
public class Endereco implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDENDERECO", nullable = false)
    private Integer idendereco;
    @Basic(optional = false)
    @Column(name = "TIPOENDERECO", nullable = false)
    private int tipoendereco;
    @Column(name = "CEPENDERECO", length = 20)
    private String cependereco;
    @Column(name = "ENDERECO", length = 100)
    private String endereco;
    @Column(name = "BAIRROENDERECO", length = 60)
    private String bairroendereco;
    @Column(name = "SIGLAESTADOENDERECO", length = 2)
    private String siglaestadoendereco;
    @Column(name = "NUMEROENDERECO", length = 10)
    private String numeroendereco;
    @Column(name = "COMPLEMENTOENDERECO", length = 60)
    private String complementoendereco;
    @Column(name = "PONTOREFERENCIAENDERECO", length = 100)
    private String pontoreferenciaendereco;
    @JoinColumn(name = "IDPESSOAENDERECO", referencedColumnName = "IDPESSOA")
    @ManyToOne
    private Pessoa idpessoaendereco;
    @JoinColumns({
        @JoinColumn(name = "IDCIDADEENDERECO", referencedColumnName = "IDCIDADE"),
        @JoinColumn(name = "NOMECIDADE", referencedColumnName = "NOMECIDADE")})
    @ManyToOne
    private Cidade cidade;

    public Endereco() {
    }

    public Endereco(Integer idendereco) {
        this.idendereco = idendereco;
    }

    public Endereco(Integer idendereco, int tipoendereco) {
        this.idendereco = idendereco;
        this.tipoendereco = tipoendereco;
    }

    public Integer getIdendereco() {
        return idendereco;
    }

    public void setIdendereco(Integer idendereco) {
        this.idendereco = idendereco;
    }

    public int getTipoendereco() {
        return tipoendereco;
    }

    public void setTipoendereco(int tipoendereco) {
        this.tipoendereco = tipoendereco;
    }

    public String getCependereco() {
        return cependereco;
    }

    public void setCependereco(String cependereco) {
        this.cependereco = cependereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairroendereco() {
        return bairroendereco;
    }

    public void setBairroendereco(String bairroendereco) {
        this.bairroendereco = bairroendereco;
    }

    public String getSiglaestadoendereco() {
        return siglaestadoendereco;
    }

    public void setSiglaestadoendereco(String siglaestadoendereco) {
        this.siglaestadoendereco = siglaestadoendereco;
    }

    public String getNumeroendereco() {
        return numeroendereco;
    }

    public void setNumeroendereco(String numeroendereco) {
        this.numeroendereco = numeroendereco;
    }

    public String getComplementoendereco() {
        return complementoendereco;
    }

    public void setComplementoendereco(String complementoendereco) {
        this.complementoendereco = complementoendereco;
    }

    public String getPontoreferenciaendereco() {
        return pontoreferenciaendereco;
    }

    public void setPontoreferenciaendereco(String pontoreferenciaendereco) {
        this.pontoreferenciaendereco = pontoreferenciaendereco;
    }

    public Pessoa getIdpessoaendereco() {
        return idpessoaendereco;
    }

    public void setIdpessoaendereco(Pessoa idpessoaendereco) {
        this.idpessoaendereco = idpessoaendereco;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idendereco != null ? idendereco.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Endereco)) {
            return false;
        }
        Endereco other = (Endereco) object;
        if ((this.idendereco == null && other.idendereco != null) || (this.idendereco != null && !this.idendereco.equals(other.idendereco))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sgps.classeMapeada.Endereco[idendereco=" + idendereco + "]";
    }

}
