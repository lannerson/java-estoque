/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sgps.classeMapeada;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Daniel
 */
@Entity
@Table(name = "cliente")
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c"),
    @NamedQuery(name = "Cliente.findByIdpessoacliente", query = "SELECT c FROM Cliente c WHERE c.idpessoacliente = :idpessoacliente"),
    @NamedQuery(name = "Cliente.findByRgouinscricaocliente", query = "SELECT c FROM Cliente c WHERE c.rgouinscricaocliente = :rgouinscricaocliente"),
    @NamedQuery(name = "Cliente.findByRazaosocialcliente", query = "SELECT c FROM Cliente c WHERE c.razaosocialcliente = :razaosocialcliente"),
    @NamedQuery(name = "Cliente.findByEstadocivilcliente", query = "SELECT c FROM Cliente c WHERE c.estadocivilcliente = :estadocivilcliente"),
    @NamedQuery(name = "Cliente.findByConjungecliente", query = "SELECT c FROM Cliente c WHERE c.conjungecliente = :conjungecliente"),
    @NamedQuery(name = "Cliente.findByNomepaicliente", query = "SELECT c FROM Cliente c WHERE c.nomepaicliente = :nomepaicliente"),
    @NamedQuery(name = "Cliente.findByNomemaecliente", query = "SELECT c FROM Cliente c WHERE c.nomemaecliente = :nomemaecliente"),
    @NamedQuery(name = "Cliente.findByLimitecreditocliente", query = "SELECT c FROM Cliente c WHERE c.limitecreditocliente = :limitecreditocliente"),
    @NamedQuery(name = "Cliente.findBySituacaocredito", query = "SELECT c FROM Cliente c WHERE c.situacaocredito = :situacaocredito"),
    @NamedQuery(name = "Cliente.findByDatanascimentocliente", query = "SELECT c FROM Cliente c WHERE c.datanascimentocliente = :datanascimentocliente"),
    @NamedQuery(name = "Cliente.findByIdcategoriacliente", query = "SELECT c FROM Cliente c WHERE c.idcategoriacliente = :idcategoriacliente"),
    @NamedQuery(name = "Cliente.findByObservacaocliente", query = "SELECT c FROM Cliente c WHERE c.observacaocliente = :observacaocliente")})
public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDPESSOACLIENTE")
    private Integer idpessoacliente;
    @Column(name = "RGOUINSCRICAOCLIENTE")
    private String rgouinscricaocliente;
    @Column(name = "RAZAOSOCIALCLIENTE")
    private String razaosocialcliente;
    @Column(name = "ESTADOCIVILCLIENTE")
    private Integer estadocivilcliente;
    @Column(name = "CONJUNGECLIENTE")
    private String conjungecliente;
    @Column(name = "NOMEPAICLIENTE")
    private String nomepaicliente;
    @Column(name = "NOMEMAECLIENTE")
    private String nomemaecliente;
    @Column(name = "LIMITECREDITOCLIENTE")
    private BigDecimal limitecreditocliente;
    @Column(name = "SITUACAOCREDITO")
    private Integer situacaocredito;
    @Column(name = "DATANASCIMENTOCLIENTE")
    @Temporal(TemporalType.DATE)
    private Date datanascimentocliente;
    @Column(name = "IDCATEGORIACLIENTE")
    private Integer idcategoriacliente;
    @Column(name = "OBSERVACAOCLIENTE")
    private String observacaocliente;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idpessoaclientecr")
    private Collection<Contasreceber> contasreceberCollection;
    @OneToMany(mappedBy = "idpessoaclienteanimal")
    private Collection<Animal> animalCollection;
    @JoinColumn(name = "IDPESSOACLIENTE", referencedColumnName = "IDPESSOA", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Pessoa pessoa;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idpessoaclientevenda")
    private Collection<Venda> vendaCollection;
    @OneToMany(mappedBy = "idpessoaclienteagendamento")
    private Collection<Agendamento> agendamentoCollection;

    public Cliente() {
    }

    public Cliente(Integer idpessoacliente) {
        this.idpessoacliente = idpessoacliente;
    }

    public Integer getIdpessoacliente() {
        return idpessoacliente;
    }

    public void setIdpessoacliente(Integer idpessoacliente) {
        this.idpessoacliente = idpessoacliente;
    }

    public String getRgouinscricaocliente() {
        return rgouinscricaocliente;
    }

    public void setRgouinscricaocliente(String rgouinscricaocliente) {
        this.rgouinscricaocliente = rgouinscricaocliente;
    }

    public String getRazaosocialcliente() {
        return razaosocialcliente;
    }

    public void setRazaosocialcliente(String razaosocialcliente) {
        this.razaosocialcliente = razaosocialcliente;
    }

    public Integer getEstadocivilcliente() {
        return estadocivilcliente;
    }

    public void setEstadocivilcliente(Integer estadocivilcliente) {
        this.estadocivilcliente = estadocivilcliente;
    }

    public String getConjungecliente() {
        return conjungecliente;
    }

    public void setConjungecliente(String conjungecliente) {
        this.conjungecliente = conjungecliente;
    }

    public String getNomepaicliente() {
        return nomepaicliente;
    }

    public void setNomepaicliente(String nomepaicliente) {
        this.nomepaicliente = nomepaicliente;
    }

    public String getNomemaecliente() {
        return nomemaecliente;
    }

    public void setNomemaecliente(String nomemaecliente) {
        this.nomemaecliente = nomemaecliente;
    }

    public BigDecimal getLimitecreditocliente() {
        return limitecreditocliente;
    }

    public void setLimitecreditocliente(BigDecimal limitecreditocliente) {
        this.limitecreditocliente = limitecreditocliente;
    }

    public Integer getSituacaocredito() {
        return situacaocredito;
    }

    public void setSituacaocredito(Integer situacaocredito) {
        this.situacaocredito = situacaocredito;
    }

    public Date getDatanascimentocliente() {
        return datanascimentocliente;
    }

    public void setDatanascimentocliente(Date datanascimentocliente) {
        this.datanascimentocliente = datanascimentocliente;
    }

    public Integer getIdcategoriacliente() {
        return idcategoriacliente;
    }

    public void setIdcategoriacliente(Integer idcategoriacliente) {
        this.idcategoriacliente = idcategoriacliente;
    }

    public String getObservacaocliente() {
        return observacaocliente;
    }

    public void setObservacaocliente(String observacaocliente) {
        this.observacaocliente = observacaocliente;
    }

    public Collection<Contasreceber> getContasreceberCollection() {
        return contasreceberCollection;
    }

    public void setContasreceberCollection(Collection<Contasreceber> contasreceberCollection) {
        this.contasreceberCollection = contasreceberCollection;
    }

    public Collection<Animal> getAnimalCollection() {
        return animalCollection;
    }

    public void setAnimalCollection(Collection<Animal> animalCollection) {
        this.animalCollection = animalCollection;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Collection<Venda> getVendaCollection() {
        return vendaCollection;
    }

    public void setVendaCollection(Collection<Venda> vendaCollection) {
        this.vendaCollection = vendaCollection;
    }

    public Collection<Agendamento> getAgendamentoCollection() {
        return agendamentoCollection;
    }

    public void setAgendamentoCollection(Collection<Agendamento> agendamentoCollection) {
        this.agendamentoCollection = agendamentoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpessoacliente != null ? idpessoacliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.idpessoacliente == null && other.idpessoacliente != null) || (this.idpessoacliente != null && !this.idpessoacliente.equals(other.idpessoacliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sgps.classeMapeada.Cliente[idpessoacliente=" + idpessoacliente + "]";
    }

}
