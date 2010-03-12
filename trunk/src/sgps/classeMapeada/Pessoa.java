/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sgps.classeMapeada;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Daniel
 */
@Entity
@Table(name = "pessoa")
@NamedQueries({
    @NamedQuery(name = "Pessoa.findAll", query = "SELECT p FROM Pessoa p"),
    @NamedQuery(name = "Pessoa.findByIdpessoa", query = "SELECT p FROM Pessoa p WHERE p.idpessoa = :idpessoa"),
    @NamedQuery(name = "Pessoa.findByTipopessoa", query = "SELECT p FROM Pessoa p WHERE p.tipopessoa = :tipopessoa"),
    @NamedQuery(name = "Pessoa.findByTipoinscricao", query = "SELECT p FROM Pessoa p WHERE p.tipoinscricao = :tipoinscricao"),
    @NamedQuery(name = "Pessoa.findByCpfcnpjpessoa", query = "SELECT p FROM Pessoa p WHERE p.cpfcnpjpessoa = :cpfcnpjpessoa"),
    @NamedQuery(name = "Pessoa.findByNomepessoa", query = "SELECT p FROM Pessoa p WHERE p.nomepessoa = :nomepessoa"),
    @NamedQuery(name = "Pessoa.findByDatacadastropessoa", query = "SELECT p FROM Pessoa p WHERE p.datacadastropessoa = :datacadastropessoa"),
    @NamedQuery(name = "Pessoa.findByTelefonepessoa", query = "SELECT p FROM Pessoa p WHERE p.telefonepessoa = :telefonepessoa"),
    @NamedQuery(name = "Pessoa.findByTelefone1pessoa", query = "SELECT p FROM Pessoa p WHERE p.telefone1pessoa = :telefone1pessoa"),
    @NamedQuery(name = "Pessoa.findByTelefone2pessoa", query = "SELECT p FROM Pessoa p WHERE p.telefone2pessoa = :telefone2pessoa"),
    @NamedQuery(name = "Pessoa.findByEmailpessoa", query = "SELECT p FROM Pessoa p WHERE p.emailpessoa = :emailpessoa"),
    @NamedQuery(name = "Pessoa.findByFlaginativopessoa", query = "SELECT p FROM Pessoa p WHERE p.flaginativopessoa = :flaginativopessoa")})
public class Pessoa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDPESSOA")
    private Integer idpessoa;
    @Basic(optional = false)
    @Column(name = "TIPOPESSOA")
    private int tipopessoa;
    @Basic(optional = false)
    @Column(name = "TIPOINSCRICAO")
    private String tipoinscricao;
    @Column(name = "CPFCNPJPESSOA")
    private String cpfcnpjpessoa;
    @Column(name = "NOMEPESSOA")
    private String nomepessoa;
    @Column(name = "DATACADASTROPESSOA")
    @Temporal(TemporalType.DATE)
    private Date datacadastropessoa;
    @Column(name = "TELEFONEPESSOA")
    private String telefonepessoa;
    @Column(name = "TELEFONE1PESSOA")
    private String telefone1pessoa;
    @Column(name = "TELEFONE2PESSOA")
    private String telefone2pessoa;
    @Column(name = "EMAILPESSOA")
    private String emailpessoa;
    @Column(name = "FLAGINATIVOPESSOA")
    private Boolean flaginativopessoa;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "pessoa")
    private Fornecedor fornecedor;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "pessoa")
    private Funcionario funcionario;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "pessoa")
    private Cliente cliente;
    @OneToMany(mappedBy = "idpessoaendereco")
    private Collection<Endereco> enderecoCollection;

    public Pessoa() {
    }

    public Pessoa(Integer idpessoa) {
        this.idpessoa = idpessoa;
    }

    public Pessoa(Integer idpessoa, int tipopessoa, String tipoinscricao) {
        this.idpessoa = idpessoa;
        this.tipopessoa = tipopessoa;
        this.tipoinscricao = tipoinscricao;
    }

    public Integer getIdpessoa() {
        return idpessoa;
    }

    public void setIdpessoa(Integer idpessoa) {
        this.idpessoa = idpessoa;
    }

    public int getTipopessoa() {
        return tipopessoa;
    }

    public void setTipopessoa(int tipopessoa) {
        this.tipopessoa = tipopessoa;
    }

    public String getTipoinscricao() {
        return tipoinscricao;
    }

    public void setTipoinscricao(String tipoinscricao) {
        this.tipoinscricao = tipoinscricao;
    }

    public String getCpfcnpjpessoa() {
        return cpfcnpjpessoa;
    }

    public void setCpfcnpjpessoa(String cpfcnpjpessoa) {
        this.cpfcnpjpessoa = cpfcnpjpessoa;
    }

    public String getNomepessoa() {
        return nomepessoa;
    }

    public void setNomepessoa(String nomepessoa) {
        this.nomepessoa = nomepessoa;
    }

    public Date getDatacadastropessoa() {
        return datacadastropessoa;
    }

    public void setDatacadastropessoa(Date datacadastropessoa) {
        this.datacadastropessoa = datacadastropessoa;
    }

    public String getTelefonepessoa() {
        return telefonepessoa;
    }

    public void setTelefonepessoa(String telefonepessoa) {
        this.telefonepessoa = telefonepessoa;
    }

    public String getTelefone1pessoa() {
        return telefone1pessoa;
    }

    public void setTelefone1pessoa(String telefone1pessoa) {
        this.telefone1pessoa = telefone1pessoa;
    }

    public String getTelefone2pessoa() {
        return telefone2pessoa;
    }

    public void setTelefone2pessoa(String telefone2pessoa) {
        this.telefone2pessoa = telefone2pessoa;
    }

    public String getEmailpessoa() {
        return emailpessoa;
    }

    public void setEmailpessoa(String emailpessoa) {
        this.emailpessoa = emailpessoa;
    }

    public Boolean getFlaginativopessoa() {
        return flaginativopessoa;
    }

    public void setFlaginativopessoa(Boolean flaginativopessoa) {
        this.flaginativopessoa = flaginativopessoa;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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
        hash += (idpessoa != null ? idpessoa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pessoa)) {
            return false;
        }
        Pessoa other = (Pessoa) object;
        if ((this.idpessoa == null && other.idpessoa != null) || (this.idpessoa != null && !this.idpessoa.equals(other.idpessoa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sgps.classeMapeada.Pessoa[idpessoa=" + idpessoa + "]";
    }

}
