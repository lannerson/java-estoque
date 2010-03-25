/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sgps.classeMapeada;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author martins
 */
@Entity
@Table(name = "VACINA", catalog = "sgps", schema = "")
@NamedQueries({
    @NamedQuery(name = "Vacina.findAll", query = "SELECT v FROM Vacina v"),
    @NamedQuery(name = "Vacina.findByIdvacina", query = "SELECT v FROM Vacina v WHERE v.idvacina = :idvacina"),
    @NamedQuery(name = "Vacina.findByDatavacina", query = "SELECT v FROM Vacina v WHERE v.datavacina = :datavacina"),
    @NamedQuery(name = "Vacina.findByNomevacina", query = "SELECT v FROM Vacina v WHERE v.nomevacina = :nomevacina"),
    @NamedQuery(name = "Vacina.findByFabricantevacina", query = "SELECT v FROM Vacina v WHERE v.fabricantevacina = :fabricantevacina"),
    @NamedQuery(name = "Vacina.findByVacinacontra", query = "SELECT v FROM Vacina v WHERE v.vacinacontra = :vacinacontra"),
    @NamedQuery(name = "Vacina.findByDatarevacinar", query = "SELECT v FROM Vacina v WHERE v.datarevacinar = :datarevacinar")})
public class Vacina implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDVACINA", nullable = false)
    private Integer idvacina;
    @Column(name = "DATAVACINA")
    @Temporal(TemporalType.DATE)
    private Date datavacina;
    @Column(name = "NOMEVACINA", length = 60)
    private String nomevacina;
    @Column(name = "FABRICANTEVACINA", length = 60)
    private String fabricantevacina;
    @Column(name = "VACINACONTRA", length = 60)
    private String vacinacontra;
    @Column(name = "DATAREVACINAR")
    @Temporal(TemporalType.DATE)
    private Date datarevacinar;
    @JoinColumn(name = "IDANIMALVACINA", referencedColumnName = "IDANIMAL")
    @ManyToOne
    private Animal idanimalvacina;

    public Vacina() {
    }

    public Vacina(Integer idvacina) {
        this.idvacina = idvacina;
    }

    public Integer getIdvacina() {
        return idvacina;
    }

    public void setIdvacina(Integer idvacina) {
        this.idvacina = idvacina;
    }

    public Date getDatavacina() {
        return datavacina;
    }

    public void setDatavacina(Date datavacina) {
        this.datavacina = datavacina;
    }

    public String getNomevacina() {
        return nomevacina;
    }

    public void setNomevacina(String nomevacina) {
        this.nomevacina = nomevacina;
    }

    public String getFabricantevacina() {
        return fabricantevacina;
    }

    public void setFabricantevacina(String fabricantevacina) {
        this.fabricantevacina = fabricantevacina;
    }

    public String getVacinacontra() {
        return vacinacontra;
    }

    public void setVacinacontra(String vacinacontra) {
        this.vacinacontra = vacinacontra;
    }

    public Date getDatarevacinar() {
        return datarevacinar;
    }

    public void setDatarevacinar(Date datarevacinar) {
        this.datarevacinar = datarevacinar;
    }

    public Animal getIdanimalvacina() {
        return idanimalvacina;
    }

    public void setIdanimalvacina(Animal idanimalvacina) {
        this.idanimalvacina = idanimalvacina;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idvacina != null ? idvacina.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vacina)) {
            return false;
        }
        Vacina other = (Vacina) object;
        if ((this.idvacina == null && other.idvacina != null) || (this.idvacina != null && !this.idvacina.equals(other.idvacina))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sgps.classeMapeada.Vacina[idvacina=" + idvacina + "]";
    }

}
