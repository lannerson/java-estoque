/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.ClassesPersistentes;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
    @NamedQuery(name = "Cliente.findByCodCliente", query = "SELECT c FROM Cliente c WHERE c.codCliente = :codCliente"),
    @NamedQuery(name = "Cliente.findByNomeCliente", query = "SELECT c FROM Cliente c WHERE c.nomeCliente = :nomeCliente"),
    @NamedQuery(name = "Cliente.findByCpfCliente", query = "SELECT c FROM Cliente c WHERE c.cpfCliente = :cpfCliente"),
    @NamedQuery(name = "Cliente.findByRgCliente", query = "SELECT c FROM Cliente c WHERE c.rgCliente = :rgCliente"),
    @NamedQuery(name = "Cliente.findByOrgaoRgCliente", query = "SELECT c FROM Cliente c WHERE c.orgaoRgCliente = :orgaoRgCliente"),
    @NamedQuery(name = "Cliente.findByNascimentoCliente", query = "SELECT c FROM Cliente c WHERE c.nascimentoCliente = :nascimentoCliente"),
    @NamedQuery(name = "Cliente.findByDesdeCliente", query = "SELECT c FROM Cliente c WHERE c.desdeCliente = :desdeCliente"),
    @NamedQuery(name = "Cliente.findByProfissaoCliente", query = "SELECT c FROM Cliente c WHERE c.profissaoCliente = :profissaoCliente"),
    @NamedQuery(name = "Cliente.findByEmpresaCliente", query = "SELECT c FROM Cliente c WHERE c.empresaCliente = :empresaCliente"),
    @NamedQuery(name = "Cliente.findByFoneEmpresa", query = "SELECT c FROM Cliente c WHERE c.foneEmpresa = :foneEmpresa"),
    @NamedQuery(name = "Cliente.findByRendaCliente", query = "SELECT c FROM Cliente c WHERE c.rendaCliente = :rendaCliente"),
    @NamedQuery(name = "Cliente.findByTipoCliente", query = "SELECT c FROM Cliente c WHERE c.tipoCliente = :tipoCliente"),
    @NamedQuery(name = "Cliente.findByCnpjCliente", query = "SELECT c FROM Cliente c WHERE c.cnpjCliente = :cnpjCliente"),
    @NamedQuery(name = "Cliente.findByReferenciaCliente", query = "SELECT c FROM Cliente c WHERE c.referenciaCliente = :referenciaCliente"),
    @NamedQuery(name = "Cliente.findByFoneReferenciaCliente", query = "SELECT c FROM Cliente c WHERE c.foneReferenciaCliente = :foneReferenciaCliente"),
    @NamedQuery(name = "Cliente.findByEmail", query = "SELECT c FROM Cliente c WHERE c.email = :email")})
public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "COD_CLIENTE")
    private Integer codCliente;
    @Column(name = "NOME_CLIENTE")
    private String nomeCliente;
    @Column(name = "CPF_CLIENTE")
    private String cpfCliente;
    @Column(name = "RG_CLIENTE")
    private String rgCliente;
    @Column(name = "ORGAO_RG_CLIENTE")
    private String orgaoRgCliente;
    @Column(name = "NASCIMENTO_CLIENTE")
    @Temporal(TemporalType.DATE)
    private Date nascimentoCliente;
    @Column(name = "DESDE_CLIENTE")
    @Temporal(TemporalType.DATE)
    private Date desdeCliente;
    @Column(name = "PROFISSAO_CLIENTE")
    private String profissaoCliente;
    @Column(name = "EMPRESA_CLIENTE")
    private String empresaCliente;
    @Column(name = "FONE_EMPRESA")
    private String foneEmpresa;
    @Column(name = "RENDA_CLIENTE")
    private Double rendaCliente;
    @Column(name = "TIPO_CLIENTE")
    private Character tipoCliente;
    @Column(name = "CNPJ_CLIENTE")
    private String cnpjCliente;
    @Column(name = "REFERENCIA_CLIENTE")
    private String referenciaCliente;
    @Column(name = "FONE_REFERENCIA_CLIENTE")
    private String foneReferenciaCliente;
    @Column(name = "EMAIL")
    private String email;

    public Cliente() {
    }

    public Cliente(Integer codCliente) {
        this.codCliente = codCliente;
    }

    public Integer getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(Integer codCliente) {
        this.codCliente = codCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getRgCliente() {
        return rgCliente;
    }

    public void setRgCliente(String rgCliente) {
        this.rgCliente = rgCliente;
    }

    public String getOrgaoRgCliente() {
        return orgaoRgCliente;
    }

    public void setOrgaoRgCliente(String orgaoRgCliente) {
        this.orgaoRgCliente = orgaoRgCliente;
    }

    public Date getNascimentoCliente() {
        return nascimentoCliente;
    }

    public void setNascimentoCliente(Date nascimentoCliente) {
        this.nascimentoCliente = nascimentoCliente;
    }

    public Date getDesdeCliente() {
        return desdeCliente;
    }

    public void setDesdeCliente(Date desdeCliente) {
        this.desdeCliente = desdeCliente;
    }

    public String getProfissaoCliente() {
        return profissaoCliente;
    }

    public void setProfissaoCliente(String profissaoCliente) {
        this.profissaoCliente = profissaoCliente;
    }

    public String getEmpresaCliente() {
        return empresaCliente;
    }

    public void setEmpresaCliente(String empresaCliente) {
        this.empresaCliente = empresaCliente;
    }

    public String getFoneEmpresa() {
        return foneEmpresa;
    }

    public void setFoneEmpresa(String foneEmpresa) {
        this.foneEmpresa = foneEmpresa;
    }

    public Double getRendaCliente() {
        return rendaCliente;
    }

    public void setRendaCliente(Double rendaCliente) {
        this.rendaCliente = rendaCliente;
    }

    public Character getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(Character tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String getCnpjCliente() {
        return cnpjCliente;
    }

    public void setCnpjCliente(String cnpjCliente) {
        this.cnpjCliente = cnpjCliente;
    }

    public String getReferenciaCliente() {
        return referenciaCliente;
    }

    public void setReferenciaCliente(String referenciaCliente) {
        this.referenciaCliente = referenciaCliente;
    }

    public String getFoneReferenciaCliente() {
        return foneReferenciaCliente;
    }

    public void setFoneReferenciaCliente(String foneReferenciaCliente) {
        this.foneReferenciaCliente = foneReferenciaCliente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codCliente != null ? codCliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.codCliente == null && other.codCliente != null) || (this.codCliente != null && !this.codCliente.equals(other.codCliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.Persistencia.Cliente[codCliente=" + codCliente + "]";
    }

}
