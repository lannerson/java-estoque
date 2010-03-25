/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sgps.classeMapeada;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
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
 * @author martins
 */
@Entity
@Table(name = "CLIENTE", catalog = "sgps", schema = "")
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
    @Column(name = "IDPESSOACLIENTE", nullable = false)
    private Integer idpessoacliente;
    @Column(name = "RGOUINSCRICAOCLIENTE", length = 30)
    private String rgouinscricaocliente;
    @Column(name = "RAZAOSOCIALCLIENTE", length = 60)
    private String razaosocialcliente;
    @Column(name = "ESTADOCIVILCLIENTE")
    private Integer estadocivilcliente;
    @Column(name = "CONJUNGECLIENTE", length = 60)
    private String conjungecliente;
    @Column(name = "NOMEPAICLIENTE", length = 60)
    private String nomepaicliente;
    @Column(name = "NOMEMAECLIENTE", length = 60)
    private String nomemaecliente;
    @Column(name = "LIMITECREDITOCLIENTE", precision = 11, scale = 2)
    private BigDecimal limitecreditocliente;
    @Column(name = "SITUACAOCREDITO")
    private Integer situacaocredito;
    @Column(name = "DATANASCIMENTOCLIENTE")
    @Temporal(TemporalType.DATE)
    private Date datanascimentocliente;
    @Column(name = "IDCATEGORIACLIENTE")
    private Integer idcategoriacliente;
    @Column(name = "OBSERVACAOCLIENTE", length = 250)
    private String observacaocliente;
    @OneToMany(mappedBy = "idpessoaclienteanimal")
    private List<Animal> animalList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idpessoaclientevenda")
    private List<Venda> vendaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idpessoaclientecr")
    private List<Contasreceber> contasreceberList;
    @OneToMany(mappedBy = "idpessoaclienteagendamento")
    private List<Agendamento> agendamentoList;
    @JoinColumn(name = "IDPESSOACLIENTE", referencedColumnName = "IDPESSOA", nullable = false, insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Pessoa pessoa;

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

    public List<Animal> getAnimalList() {
        return animalList;
    }

    public void setAnimalList(List<Animal> animalList) {
        this.animalList = animalList;
    }

    public List<Venda> getVendaList() {
        return vendaList;
    }

    public void setVendaList(List<Venda> vendaList) {
        this.vendaList = vendaList;
    }

    public List<Contasreceber> getContasreceberList() {
        return contasreceberList;
    }

    public void setContasreceberList(List<Contasreceber> contasreceberList) {
        this.contasreceberList = contasreceberList;
    }

    public List<Agendamento> getAgendamentoList() {
        return agendamentoList;
    }

    public void setAgendamentoList(List<Agendamento> agendamentoList) {
        this.agendamentoList = agendamentoList;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
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
