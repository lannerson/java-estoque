/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sgps.classeMapeada;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Daniel
 */
@Entity
@Table(name = "animal")
@NamedQueries({
    @NamedQuery(name = "Animal.findAll", query = "SELECT a FROM Animal a"),
    @NamedQuery(name = "Animal.findByIdanimal", query = "SELECT a FROM Animal a WHERE a.idanimal = :idanimal"),
    @NamedQuery(name = "Animal.findByNomeanimal", query = "SELECT a FROM Animal a WHERE a.nomeanimal = :nomeanimal"),
    @NamedQuery(name = "Animal.findByDatacadastroanimal", query = "SELECT a FROM Animal a WHERE a.datacadastroanimal = :datacadastroanimal"),
    @NamedQuery(name = "Animal.findByDatanascimentoanimal", query = "SELECT a FROM Animal a WHERE a.datanascimentoanimal = :datanascimentoanimal"),
    @NamedQuery(name = "Animal.findByIdadeanimal", query = "SELECT a FROM Animal a WHERE a.idadeanimal = :idadeanimal"),
    @NamedQuery(name = "Animal.findBySexoanimal", query = "SELECT a FROM Animal a WHERE a.sexoanimal = :sexoanimal"),
    @NamedQuery(name = "Animal.findByPorteanimal", query = "SELECT a FROM Animal a WHERE a.porteanimal = :porteanimal"),
    @NamedQuery(name = "Animal.findByCoranimal", query = "SELECT a FROM Animal a WHERE a.coranimal = :coranimal"),
    @NamedQuery(name = "Animal.findByPedigreeanimal", query = "SELECT a FROM Animal a WHERE a.pedigreeanimal = :pedigreeanimal"),
    @NamedQuery(name = "Animal.findByVivoanimal", query = "SELECT a FROM Animal a WHERE a.vivoanimal = :vivoanimal"),
    @NamedQuery(name = "Animal.findByObservacaoanimal", query = "SELECT a FROM Animal a WHERE a.observacaoanimal = :observacaoanimal")})
public class Animal implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDANIMAL")
    private Integer idanimal;
    @Column(name = "NOMEANIMAL")
    private String nomeanimal;
    @Column(name = "DATACADASTROANIMAL")
    @Temporal(TemporalType.DATE)
    private Date datacadastroanimal;
    @Column(name = "DATANASCIMENTOANIMAL")
    @Temporal(TemporalType.DATE)
    private Date datanascimentoanimal;
    @Column(name = "IDADEANIMAL")
    private Integer idadeanimal;
    @Column(name = "SEXOANIMAL")
    private Integer sexoanimal;
    @Column(name = "PORTEANIMAL")
    private Integer porteanimal;
    @Column(name = "CORANIMAL")
    private Integer coranimal;
    @Column(name = "PEDIGREEANIMAL")
    private String pedigreeanimal;
    @Column(name = "VIVOANIMAL")
    private Boolean vivoanimal;
    @Lob
    @Column(name = "FOTOANIMAL")
    private byte[] fotoanimal;
    @Column(name = "OBSERVACAOANIMAL")
    private String observacaoanimal;
    @OneToMany(mappedBy = "idanimalagenditem")
    private Collection<Itemagendamento> itemagendamentoCollection;
    @JoinColumn(name = "IDRACA", referencedColumnName = "IDRACA")
    @ManyToOne(optional = false)
    private Raca idraca;
    @JoinColumn(name = "IDPESSOACLIENTEANIMAL", referencedColumnName = "IDPESSOACLIENTE")
    @ManyToOne
    private Cliente idpessoaclienteanimal;
    @OneToMany(mappedBy = "idanimalvermifugo")
    private Collection<Vermifugo> vermifugoCollection;
    @OneToMany(mappedBy = "idanimalvacina")
    private Collection<Vacina> vacinaCollection;

    public Animal() {
    }

    public Animal(Integer idanimal) {
        this.idanimal = idanimal;
    }

    public Integer getIdanimal() {
        return idanimal;
    }

    public void setIdanimal(Integer idanimal) {
        this.idanimal = idanimal;
    }

    public String getNomeanimal() {
        return nomeanimal;
    }

    public void setNomeanimal(String nomeanimal) {
        this.nomeanimal = nomeanimal;
    }

    public Date getDatacadastroanimal() {
        return datacadastroanimal;
    }

    public void setDatacadastroanimal(Date datacadastroanimal) {
        this.datacadastroanimal = datacadastroanimal;
    }

    public Date getDatanascimentoanimal() {
        return datanascimentoanimal;
    }

    public void setDatanascimentoanimal(Date datanascimentoanimal) {
        this.datanascimentoanimal = datanascimentoanimal;
    }

    public Integer getIdadeanimal() {
        return idadeanimal;
    }

    public void setIdadeanimal(Integer idadeanimal) {
        this.idadeanimal = idadeanimal;
    }

    public Integer getSexoanimal() {
        return sexoanimal;
    }

    public void setSexoanimal(Integer sexoanimal) {
        this.sexoanimal = sexoanimal;
    }

    public Integer getPorteanimal() {
        return porteanimal;
    }

    public void setPorteanimal(Integer porteanimal) {
        this.porteanimal = porteanimal;
    }

    public Integer getCoranimal() {
        return coranimal;
    }

    public void setCoranimal(Integer coranimal) {
        this.coranimal = coranimal;
    }

    public String getPedigreeanimal() {
        return pedigreeanimal;
    }

    public void setPedigreeanimal(String pedigreeanimal) {
        this.pedigreeanimal = pedigreeanimal;
    }

    public Boolean getVivoanimal() {
        return vivoanimal;
    }

    public void setVivoanimal(Boolean vivoanimal) {
        this.vivoanimal = vivoanimal;
    }

    public byte[] getFotoanimal() {
        return fotoanimal;
    }

    public void setFotoanimal(byte[] fotoanimal) {
        this.fotoanimal = fotoanimal;
    }

    public String getObservacaoanimal() {
        return observacaoanimal;
    }

    public void setObservacaoanimal(String observacaoanimal) {
        this.observacaoanimal = observacaoanimal;
    }

    public Collection<Itemagendamento> getItemagendamentoCollection() {
        return itemagendamentoCollection;
    }

    public void setItemagendamentoCollection(Collection<Itemagendamento> itemagendamentoCollection) {
        this.itemagendamentoCollection = itemagendamentoCollection;
    }

    public Raca getIdraca() {
        return idraca;
    }

    public void setIdraca(Raca idraca) {
        this.idraca = idraca;
    }

    public Cliente getIdpessoaclienteanimal() {
        return idpessoaclienteanimal;
    }

    public void setIdpessoaclienteanimal(Cliente idpessoaclienteanimal) {
        this.idpessoaclienteanimal = idpessoaclienteanimal;
    }

    public Collection<Vermifugo> getVermifugoCollection() {
        return vermifugoCollection;
    }

    public void setVermifugoCollection(Collection<Vermifugo> vermifugoCollection) {
        this.vermifugoCollection = vermifugoCollection;
    }

    public Collection<Vacina> getVacinaCollection() {
        return vacinaCollection;
    }

    public void setVacinaCollection(Collection<Vacina> vacinaCollection) {
        this.vacinaCollection = vacinaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idanimal != null ? idanimal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Animal)) {
            return false;
        }
        Animal other = (Animal) object;
        if ((this.idanimal == null && other.idanimal != null) || (this.idanimal != null && !this.idanimal.equals(other.idanimal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sgps.classeMapeada.Animal[idanimal=" + idanimal + "]";
    }

}
