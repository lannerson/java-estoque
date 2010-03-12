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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "funcionario")
@NamedQueries({
    @NamedQuery(name = "Funcionario.findAll", query = "SELECT f FROM Funcionario f"),
    @NamedQuery(name = "Funcionario.findByIdpessoafuncionario", query = "SELECT f FROM Funcionario f WHERE f.idpessoafuncionario = :idpessoafuncionario"),
    @NamedQuery(name = "Funcionario.findByRgfuncionario", query = "SELECT f FROM Funcionario f WHERE f.rgfuncionario = :rgfuncionario"),
    @NamedQuery(name = "Funcionario.findByDataaniversariofuncionario", query = "SELECT f FROM Funcionario f WHERE f.dataaniversariofuncionario = :dataaniversariofuncionario"),
    @NamedQuery(name = "Funcionario.findByDataadmissaofuncionario", query = "SELECT f FROM Funcionario f WHERE f.dataadmissaofuncionario = :dataadmissaofuncionario"),
    @NamedQuery(name = "Funcionario.findByDatademissaofuncionario", query = "SELECT f FROM Funcionario f WHERE f.datademissaofuncionario = :datademissaofuncionario"),
    @NamedQuery(name = "Funcionario.findByNomemaefuncionario", query = "SELECT f FROM Funcionario f WHERE f.nomemaefuncionario = :nomemaefuncionario"),
    @NamedQuery(name = "Funcionario.findByNomepaifuncionario", query = "SELECT f FROM Funcionario f WHERE f.nomepaifuncionario = :nomepaifuncionario"),
    @NamedQuery(name = "Funcionario.findByIdcivilfunionario", query = "SELECT f FROM Funcionario f WHERE f.idcivilfunionario = :idcivilfunionario"),
    @NamedQuery(name = "Funcionario.findByConjugefuncionario", query = "SELECT f FROM Funcionario f WHERE f.conjugefuncionario = :conjugefuncionario"),
    @NamedQuery(name = "Funcionario.findByFlagdemitidofuncionario", query = "SELECT f FROM Funcionario f WHERE f.flagdemitidofuncionario = :flagdemitidofuncionario"),
    @NamedQuery(name = "Funcionario.findByFlagprestadorservfuncionario", query = "SELECT f FROM Funcionario f WHERE f.flagprestadorservfuncionario = :flagprestadorservfuncionario"),
    @NamedQuery(name = "Funcionario.findByComissaofuncionario", query = "SELECT f FROM Funcionario f WHERE f.comissaofuncionario = :comissaofuncionario")})
public class Funcionario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDPESSOAFUNCIONARIO")
    private Integer idpessoafuncionario;
    @Column(name = "RGFUNCIONARIO")
    private String rgfuncionario;
    @Column(name = "DATAANIVERSARIOFUNCIONARIO")
    @Temporal(TemporalType.DATE)
    private Date dataaniversariofuncionario;
    @Column(name = "DATAADMISSAOFUNCIONARIO")
    @Temporal(TemporalType.DATE)
    private Date dataadmissaofuncionario;
    @Column(name = "DATADEMISSAOFUNCIONARIO")
    @Temporal(TemporalType.DATE)
    private Date datademissaofuncionario;
    @Column(name = "NOMEMAEFUNCIONARIO")
    private String nomemaefuncionario;
    @Column(name = "NOMEPAIFUNCIONARIO")
    private String nomepaifuncionario;
    @Column(name = "IDCIVILFUNIONARIO")
    private Integer idcivilfunionario;
    @Column(name = "CONJUGEFUNCIONARIO")
    private String conjugefuncionario;
    @Column(name = "FLAGDEMITIDOFUNCIONARIO")
    private Boolean flagdemitidofuncionario;
    @Column(name = "FLAGPRESTADORSERVFUNCIONARIO")
    private Boolean flagprestadorservfuncionario;
    @Column(name = "COMISSAOFUNCIONARIO")
    private BigDecimal comissaofuncionario;
    @OneToMany(mappedBy = "idpessoafuncionariousuario")
    private Collection<Usuario> usuarioCollection;
    @OneToMany(mappedBy = "idpessoafuncionarioagenditem")
    private Collection<Itemagendamento> itemagendamentoCollection;
    @JoinColumn(name = "IDPESSOAFUNCIONARIO", referencedColumnName = "IDPESSOA", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Pessoa pessoa;
    @JoinColumn(name = "IDFUNCAOFUNCIONARIO", referencedColumnName = "IDFUNCAO")
    @ManyToOne
    private Funcao idfuncaofuncionario;
    @OneToMany(mappedBy = "idpessoafuncionariovendedor")
    private Collection<Venda> vendaCollection;

    public Funcionario() {
    }

    public Funcionario(Integer idpessoafuncionario) {
        this.idpessoafuncionario = idpessoafuncionario;
    }

    public Integer getIdpessoafuncionario() {
        return idpessoafuncionario;
    }

    public void setIdpessoafuncionario(Integer idpessoafuncionario) {
        this.idpessoafuncionario = idpessoafuncionario;
    }

    public String getRgfuncionario() {
        return rgfuncionario;
    }

    public void setRgfuncionario(String rgfuncionario) {
        this.rgfuncionario = rgfuncionario;
    }

    public Date getDataaniversariofuncionario() {
        return dataaniversariofuncionario;
    }

    public void setDataaniversariofuncionario(Date dataaniversariofuncionario) {
        this.dataaniversariofuncionario = dataaniversariofuncionario;
    }

    public Date getDataadmissaofuncionario() {
        return dataadmissaofuncionario;
    }

    public void setDataadmissaofuncionario(Date dataadmissaofuncionario) {
        this.dataadmissaofuncionario = dataadmissaofuncionario;
    }

    public Date getDatademissaofuncionario() {
        return datademissaofuncionario;
    }

    public void setDatademissaofuncionario(Date datademissaofuncionario) {
        this.datademissaofuncionario = datademissaofuncionario;
    }

    public String getNomemaefuncionario() {
        return nomemaefuncionario;
    }

    public void setNomemaefuncionario(String nomemaefuncionario) {
        this.nomemaefuncionario = nomemaefuncionario;
    }

    public String getNomepaifuncionario() {
        return nomepaifuncionario;
    }

    public void setNomepaifuncionario(String nomepaifuncionario) {
        this.nomepaifuncionario = nomepaifuncionario;
    }

    public Integer getIdcivilfunionario() {
        return idcivilfunionario;
    }

    public void setIdcivilfunionario(Integer idcivilfunionario) {
        this.idcivilfunionario = idcivilfunionario;
    }

    public String getConjugefuncionario() {
        return conjugefuncionario;
    }

    public void setConjugefuncionario(String conjugefuncionario) {
        this.conjugefuncionario = conjugefuncionario;
    }

    public Boolean getFlagdemitidofuncionario() {
        return flagdemitidofuncionario;
    }

    public void setFlagdemitidofuncionario(Boolean flagdemitidofuncionario) {
        this.flagdemitidofuncionario = flagdemitidofuncionario;
    }

    public Boolean getFlagprestadorservfuncionario() {
        return flagprestadorservfuncionario;
    }

    public void setFlagprestadorservfuncionario(Boolean flagprestadorservfuncionario) {
        this.flagprestadorservfuncionario = flagprestadorservfuncionario;
    }

    public BigDecimal getComissaofuncionario() {
        return comissaofuncionario;
    }

    public void setComissaofuncionario(BigDecimal comissaofuncionario) {
        this.comissaofuncionario = comissaofuncionario;
    }

    public Collection<Usuario> getUsuarioCollection() {
        return usuarioCollection;
    }

    public void setUsuarioCollection(Collection<Usuario> usuarioCollection) {
        this.usuarioCollection = usuarioCollection;
    }

    public Collection<Itemagendamento> getItemagendamentoCollection() {
        return itemagendamentoCollection;
    }

    public void setItemagendamentoCollection(Collection<Itemagendamento> itemagendamentoCollection) {
        this.itemagendamentoCollection = itemagendamentoCollection;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Funcao getIdfuncaofuncionario() {
        return idfuncaofuncionario;
    }

    public void setIdfuncaofuncionario(Funcao idfuncaofuncionario) {
        this.idfuncaofuncionario = idfuncaofuncionario;
    }

    public Collection<Venda> getVendaCollection() {
        return vendaCollection;
    }

    public void setVendaCollection(Collection<Venda> vendaCollection) {
        this.vendaCollection = vendaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpessoafuncionario != null ? idpessoafuncionario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Funcionario)) {
            return false;
        }
        Funcionario other = (Funcionario) object;
        if ((this.idpessoafuncionario == null && other.idpessoafuncionario != null) || (this.idpessoafuncionario != null && !this.idpessoafuncionario.equals(other.idpessoafuncionario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sgps.classeMapeada.Funcionario[idpessoafuncionario=" + idpessoafuncionario + "]";
    }

}
