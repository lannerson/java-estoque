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
@Table(name = "especie")
@NamedQueries({
    @NamedQuery(name = "Especie.findAll", query = "SELECT e FROM Especie e"),
    @NamedQuery(name = "Especie.findByIdespecie", query = "SELECT e FROM Especie e WHERE e.idespecie = :idespecie"),
    @NamedQuery(name = "Especie.findByNomeespecie", query = "SELECT e FROM Especie e WHERE e.nomeespecie = :nomeespecie")})
public class Especie implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDESPECIE")
    private Integer idespecie;
    @Basic(optional = false)
    @Column(name = "NOMEESPECIE")
    private String nomeespecie;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idespecie")
    private Collection<Raca> racaCollection;

    public Especie() {
    }

    public Especie(Integer idespecie) {
        this.idespecie = idespecie;
    }

    public Especie(Integer idespecie, String nomeespecie) {
        this.idespecie = idespecie;
        this.nomeespecie = nomeespecie;
    }

    public Integer getIdespecie() {
        return idespecie;
    }

    public void setIdespecie(Integer idespecie) {
        this.idespecie = idespecie;
    }

    public String getNomeespecie() {
        return nomeespecie;
    }

    public void setNomeespecie(String nomeespecie) {
        this.nomeespecie = nomeespecie;
    }

    public Collection<Raca> getRacaCollection() {
        return racaCollection;
    }

    public void setRacaCollection(Collection<Raca> racaCollection) {
        this.racaCollection = racaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idespecie != null ? idespecie.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Especie)) {
            return false;
        }
        Especie other = (Especie) object;
        if ((this.idespecie == null && other.idespecie != null) || (this.idespecie != null && !this.idespecie.equals(other.idespecie))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sgps.classeMapeada.Especie[idespecie=" + idespecie + "]";
    }

}
