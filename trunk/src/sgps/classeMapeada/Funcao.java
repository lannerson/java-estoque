/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sgps.classeMapeada;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
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
@Table(name = "funcao")
@NamedQueries({
    @NamedQuery(name = "Funcao.findAll", query = "SELECT f FROM Funcao f"),
    @NamedQuery(name = "Funcao.findByIdfuncao", query = "SELECT f FROM Funcao f WHERE f.idfuncao = :idfuncao"),
    @NamedQuery(name = "Funcao.findByNomefuncao", query = "SELECT f FROM Funcao f WHERE f.nomefuncao = :nomefuncao")})
public class Funcao implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDFUNCAO")
    private Integer idfuncao;
    @Basic(optional = false)
    @Column(name = "NOMEFUNCAO")
    private String nomefuncao;
    @OneToMany(mappedBy = "idfuncaofuncionario")
    private Collection<Funcionario> funcionarioCollection;

    public Funcao() {
    }

    public Funcao(Integer idfuncao) {
        this.idfuncao = idfuncao;
    }

    public Funcao(Integer idfuncao, String nomefuncao) {
        this.idfuncao = idfuncao;
        this.nomefuncao = nomefuncao;
    }

    public Integer getIdfuncao() {
        return idfuncao;
    }

    public void setIdfuncao(Integer idfuncao) {
        this.idfuncao = idfuncao;
    }

    public String getNomefuncao() {
        return nomefuncao;
    }

    public void setNomefuncao(String nomefuncao) {
        this.nomefuncao = nomefuncao;
    }

    public Collection<Funcionario> getFuncionarioCollection() {
        return funcionarioCollection;
    }

    public void setFuncionarioCollection(Collection<Funcionario> funcionarioCollection) {
        this.funcionarioCollection = funcionarioCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idfuncao != null ? idfuncao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Funcao)) {
            return false;
        }
        Funcao other = (Funcao) object;
        if ((this.idfuncao == null && other.idfuncao != null) || (this.idfuncao != null && !this.idfuncao.equals(other.idfuncao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sgps.classeMapeada.Funcao[idfuncao=" + idfuncao + "]";
    }

}
