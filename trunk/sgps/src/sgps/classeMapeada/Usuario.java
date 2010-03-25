/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sgps.classeMapeada;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author martins
 */
@Entity
@Table(name = "USUARIO", catalog = "sgps", schema = "")
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u"),
    @NamedQuery(name = "Usuario.findByIdusuario", query = "SELECT u FROM Usuario u WHERE u.idusuario = :idusuario"),
    @NamedQuery(name = "Usuario.findByNomeusuariocompleto", query = "SELECT u FROM Usuario u WHERE u.nomeusuariocompleto = :nomeusuariocompleto"),
    @NamedQuery(name = "Usuario.findByNomeusuario", query = "SELECT u FROM Usuario u WHERE u.nomeusuario = :nomeusuario"),
    @NamedQuery(name = "Usuario.findBySenhausuario", query = "SELECT u FROM Usuario u WHERE u.senhausuario = :senhausuario"),
    @NamedQuery(name = "Usuario.findByDatacadastrousuario", query = "SELECT u FROM Usuario u WHERE u.datacadastrousuario = :datacadastrousuario"),
    @NamedQuery(name = "Usuario.findByDataexpirasenhausuario", query = "SELECT u FROM Usuario u WHERE u.dataexpirasenhausuario = :dataexpirasenhausuario"),
    @NamedQuery(name = "Usuario.findByStatususuario", query = "SELECT u FROM Usuario u WHERE u.statususuario = :statususuario"),
    @NamedQuery(name = "Usuario.findByStatuscanceladousuario", query = "SELECT u FROM Usuario u WHERE u.statuscanceladousuario = :statuscanceladousuario"),
    @NamedQuery(name = "Usuario.verificaLogin", query = "SELECT u FROM Usuario u WHERE u.nomeusuario = :nomeusuario and u.senhausuario = :senhausuario")
})
public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDUSUARIO", nullable = false)
    private Integer idusuario;
    @Basic(optional = false)
    @Column(name = "NOMEUSUARIOCOMPLETO", nullable = false, length = 60)
    private String nomeusuariocompleto;
    @Basic(optional = false)
    @Column(name = "NOMEUSUARIO", nullable = false, length = 15)
    private String nomeusuario;
    @Column(name = "SENHAUSUARIO", length = 100)
    private String senhausuario;
    @Column(name = "DATACADASTROUSUARIO")
    @Temporal(TemporalType.DATE)
    private Date datacadastrousuario;
    @Column(name = "DATAEXPIRASENHAUSUARIO")
    @Temporal(TemporalType.DATE)
    private Date dataexpirasenhausuario;
    @Column(name = "STATUSUSUARIO")
    private Integer statususuario;
    @Column(name = "STATUSCANCELADOUSUARIO")
    private Boolean statuscanceladousuario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idusuariocontrolecaixa")
    private List<Controlecaixa> controlecaixaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuario")
    private List<Acessousuario> acessousuarioList;
    @JoinColumn(name = "IDPESSOAFUNCIONARIOUSUARIO", referencedColumnName = "IDPESSOAFUNCIONARIO")
    @ManyToOne
    private Funcionario idpessoafuncionariousuario;

    public Usuario() {
    }

    public Usuario(Integer idusuario) {
        this.idusuario = idusuario;
    }

    public Usuario(Integer idusuario, String nomeusuariocompleto, String nomeusuario) {
        this.idusuario = idusuario;
        this.nomeusuariocompleto = nomeusuariocompleto;
        this.nomeusuario = nomeusuario;
    }

    public Integer getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Integer idusuario) {
        this.idusuario = idusuario;
    }

    public String getNomeusuariocompleto() {
        return nomeusuariocompleto;
    }

    public void setNomeusuariocompleto(String nomeusuariocompleto) {
        this.nomeusuariocompleto = nomeusuariocompleto;
    }

    public String getNomeusuario() {
        return nomeusuario;
    }

    public void setNomeusuario(String nomeusuario) {
        this.nomeusuario = nomeusuario;
    }

    public String getSenhausuario() {
        return senhausuario;
    }

    public void setSenhausuario(String senhausuario) {
        this.senhausuario = senhausuario;
    }

    public Date getDatacadastrousuario() {
        return datacadastrousuario;
    }

    public void setDatacadastrousuario(Date datacadastrousuario) {
        this.datacadastrousuario = datacadastrousuario;
    }

    public Date getDataexpirasenhausuario() {
        return dataexpirasenhausuario;
    }

    public void setDataexpirasenhausuario(Date dataexpirasenhausuario) {
        this.dataexpirasenhausuario = dataexpirasenhausuario;
    }

    public Integer getStatususuario() {
        return statususuario;
    }

    public void setStatususuario(Integer statususuario) {
        this.statususuario = statususuario;
    }

    public Boolean getStatuscanceladousuario() {
        return statuscanceladousuario;
    }

    public void setStatuscanceladousuario(Boolean statuscanceladousuario) {
        this.statuscanceladousuario = statuscanceladousuario;
    }

    public List<Controlecaixa> getControlecaixaList() {
        return controlecaixaList;
    }

    public void setControlecaixaList(List<Controlecaixa> controlecaixaList) {
        this.controlecaixaList = controlecaixaList;
    }

    public List<Acessousuario> getAcessousuarioList() {
        return acessousuarioList;
    }

    public void setAcessousuarioList(List<Acessousuario> acessousuarioList) {
        this.acessousuarioList = acessousuarioList;
    }

    public Funcionario getIdpessoafuncionariousuario() {
        return idpessoafuncionariousuario;
    }

    public void setIdpessoafuncionariousuario(Funcionario idpessoafuncionariousuario) {
        this.idpessoafuncionariousuario = idpessoafuncionariousuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idusuario != null ? idusuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.idusuario == null && other.idusuario != null) || (this.idusuario != null && !this.idusuario.equals(other.idusuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sgps.classeMapeada.Usuario[idusuario=" + idusuario + "]";
    }

}
