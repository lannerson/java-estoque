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
@Table(name = "VERMIFUGO", catalog = "sgps", schema = "")
@NamedQueries({
    @NamedQuery(name = "Vermifugo.findAll", query = "SELECT v FROM Vermifugo v"),
    @NamedQuery(name = "Vermifugo.findByIdvermifugo", query = "SELECT v FROM Vermifugo v WHERE v.idvermifugo = :idvermifugo"),
    @NamedQuery(name = "Vermifugo.findByDatavermifugo", query = "SELECT v FROM Vermifugo v WHERE v.datavermifugo = :datavermifugo"),
    @NamedQuery(name = "Vermifugo.findByNomevermifugo", query = "SELECT v FROM Vermifugo v WHERE v.nomevermifugo = :nomevermifugo"),
    @NamedQuery(name = "Vermifugo.findByNomefabricantemedicamento", query = "SELECT v FROM Vermifugo v WHERE v.nomefabricantemedicamento = :nomefabricantemedicamento"),
    @NamedQuery(name = "Vermifugo.findByDosevermifugo", query = "SELECT v FROM Vermifugo v WHERE v.dosevermifugo = :dosevermifugo"),
    @NamedQuery(name = "Vermifugo.findByPesoanimalvermifugo", query = "SELECT v FROM Vermifugo v WHERE v.pesoanimalvermifugo = :pesoanimalvermifugo"),
    @NamedQuery(name = "Vermifugo.findByDatareforcovermifugo", query = "SELECT v FROM Vermifugo v WHERE v.datareforcovermifugo = :datareforcovermifugo")})
public class Vermifugo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDVERMIFUGO", nullable = false)
    private Integer idvermifugo;
    @Basic(optional = false)
    @Column(name = "DATAVERMIFUGO", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date datavermifugo;
    @Column(name = "NOMEVERMIFUGO", length = 60)
    private String nomevermifugo;
    @Column(name = "NOMEFABRICANTEMEDICAMENTO", length = 60)
    private String nomefabricantemedicamento;
    @Column(name = "DOSEVERMIFUGO", precision = 22)
    private Double dosevermifugo;
    @Column(name = "PESOANIMALVERMIFUGO", precision = 22)
    private Double pesoanimalvermifugo;
    @Column(name = "DATAREFORCOVERMIFUGO")
    @Temporal(TemporalType.DATE)
    private Date datareforcovermifugo;
    @JoinColumn(name = "IDANIMALVERMIFUGO", referencedColumnName = "IDANIMAL")
    @ManyToOne
    private Animal idanimalvermifugo;

    public Vermifugo() {
    }

    public Vermifugo(Integer idvermifugo) {
        this.idvermifugo = idvermifugo;
    }

    public Vermifugo(Integer idvermifugo, Date datavermifugo) {
        this.idvermifugo = idvermifugo;
        this.datavermifugo = datavermifugo;
    }

    public Integer getIdvermifugo() {
        return idvermifugo;
    }

    public void setIdvermifugo(Integer idvermifugo) {
        this.idvermifugo = idvermifugo;
    }

    public Date getDatavermifugo() {
        return datavermifugo;
    }

    public void setDatavermifugo(Date datavermifugo) {
        this.datavermifugo = datavermifugo;
    }

    public String getNomevermifugo() {
        return nomevermifugo;
    }

    public void setNomevermifugo(String nomevermifugo) {
        this.nomevermifugo = nomevermifugo;
    }

    public String getNomefabricantemedicamento() {
        return nomefabricantemedicamento;
    }

    public void setNomefabricantemedicamento(String nomefabricantemedicamento) {
        this.nomefabricantemedicamento = nomefabricantemedicamento;
    }

    public Double getDosevermifugo() {
        return dosevermifugo;
    }

    public void setDosevermifugo(Double dosevermifugo) {
        this.dosevermifugo = dosevermifugo;
    }

    public Double getPesoanimalvermifugo() {
        return pesoanimalvermifugo;
    }

    public void setPesoanimalvermifugo(Double pesoanimalvermifugo) {
        this.pesoanimalvermifugo = pesoanimalvermifugo;
    }

    public Date getDatareforcovermifugo() {
        return datareforcovermifugo;
    }

    public void setDatareforcovermifugo(Date datareforcovermifugo) {
        this.datareforcovermifugo = datareforcovermifugo;
    }

    public Animal getIdanimalvermifugo() {
        return idanimalvermifugo;
    }

    public void setIdanimalvermifugo(Animal idanimalvermifugo) {
        this.idanimalvermifugo = idanimalvermifugo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idvermifugo != null ? idvermifugo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vermifugo)) {
            return false;
        }
        Vermifugo other = (Vermifugo) object;
        if ((this.idvermifugo == null && other.idvermifugo != null) || (this.idvermifugo != null && !this.idvermifugo.equals(other.idvermifugo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sgps.classeMapeada.Vermifugo[idvermifugo=" + idvermifugo + "]";
    }

}
