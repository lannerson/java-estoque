/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sgps.classeMapeada;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
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
@Table(name = "RACA", catalog = "sgps", schema = "")
@NamedQueries({
    @NamedQuery(name = "Raca.findAll", query = "SELECT r FROM Raca r"),
    @NamedQuery(name = "Raca.findByIdraca", query = "SELECT r FROM Raca r WHERE r.idraca = :idraca"),
    @NamedQuery(name = "Raca.findByNomeraca", query = "SELECT r FROM Raca r WHERE r.nomeraca = :nomeraca"),
    @NamedQuery(name = "Raca.findByOrigemraca", query = "SELECT r FROM Raca r WHERE r.origemraca = :origemraca")})
public class Raca implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDRACA", nullable = false)
    private Integer idraca;
    @Column(name = "NOMERACA", length = 60)
    private String nomeraca;
    @Column(name = "ORIGEMRACA", length = 60)
    private String origemraca;
    @Lob
    @Column(name = "HISTORIARACA", length = 65535)
    private String historiaraca;
    @Lob
    @Column(name = "IMAGEMRACA")
    private byte[] imagemraca;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idraca")
    private List<Animal> animalList;
    @JoinColumn(name = "IDESPECIE", referencedColumnName = "IDESPECIE", nullable = false)
    @ManyToOne(optional = false)
    private Especie idespecie;

    public Raca() {
    }

    public Raca(Integer idraca) {
        this.idraca = idraca;
    }

    public Integer getIdraca() {
        return idraca;
    }

    public void setIdraca(Integer idraca) {
        this.idraca = idraca;
    }

    public String getNomeraca() {
        return nomeraca;
    }

    public void setNomeraca(String nomeraca) {
        this.nomeraca = nomeraca;
    }

    public String getOrigemraca() {
        return origemraca;
    }

    public void setOrigemraca(String origemraca) {
        this.origemraca = origemraca;
    }

    public String getHistoriaraca() {
        return historiaraca;
    }

    public void setHistoriaraca(String historiaraca) {
        this.historiaraca = historiaraca;
    }

    public byte[] getImagemraca() {
        return imagemraca;
    }

    public void setImagemraca(byte[] imagemraca) {
        this.imagemraca = imagemraca;
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }

    public void setAnimalList(List<Animal> animalList) {
        this.animalList = animalList;
    }

    public Especie getIdespecie() {
        return idespecie;
    }

    public void setIdespecie(Especie idespecie) {
        this.idespecie = idespecie;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idraca != null ? idraca.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Raca)) {
            return false;
        }
        Raca other = (Raca) object;
        if ((this.idraca == null && other.idraca != null) || (this.idraca != null && !this.idraca.equals(other.idraca))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sgps.classeMapeada.Raca[idraca=" + idraca + "]";
    }

}
