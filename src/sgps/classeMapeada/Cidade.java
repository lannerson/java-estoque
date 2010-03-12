/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sgps.classeMapeada;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Daniel
 */
@Entity
@Table(name = "cidade")
@NamedQueries({
    @NamedQuery(name = "Cidade.findAll", query = "SELECT c FROM Cidade c"),
    @NamedQuery(name = "Cidade.findByIdcidade", query = "SELECT c FROM Cidade c WHERE c.cidadePK.idcidade = :idcidade"),
    @NamedQuery(name = "Cidade.findByNomecidade", query = "SELECT c FROM Cidade c WHERE c.cidadePK.nomecidade = :nomecidade")})
public class Cidade implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CidadePK cidadePK;
    @JoinColumn(name = "SIGLAESTADOCIDADE", referencedColumnName = "IDESTADO")
    @ManyToOne
    private Uf siglaestadocidade;
    @OneToMany(mappedBy = "cidade")
    private Collection<Endereco> enderecoCollection;

    public Cidade() {
    }

    public Cidade(CidadePK cidadePK) {
        this.cidadePK = cidadePK;
    }

    public Cidade(int idcidade, String nomecidade) {
        this.cidadePK = new CidadePK(idcidade, nomecidade);
    }

    public CidadePK getCidadePK() {
        return cidadePK;
    }

    public void setCidadePK(CidadePK cidadePK) {
        this.cidadePK = cidadePK;
    }

    public Uf getSiglaestadocidade() {
        return siglaestadocidade;
    }

    public void setSiglaestadocidade(Uf siglaestadocidade) {
        this.siglaestadocidade = siglaestadocidade;
    }

    public Collection<Endereco> getEnderecoCollection() {
        return enderecoCollection;
    }

    public void setEnderecoCollection(Collection<Endereco> enderecoCollection) {
        this.enderecoCollection = enderecoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cidadePK != null ? cidadePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cidade)) {
            return false;
        }
        Cidade other = (Cidade) object;
        if ((this.cidadePK == null && other.cidadePK != null) || (this.cidadePK != null && !this.cidadePK.equals(other.cidadePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sgps.classeMapeada.Cidade[cidadePK=" + cidadePK + "]";
    }

}
