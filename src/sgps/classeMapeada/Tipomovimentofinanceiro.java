/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sgps.classeMapeada;

import java.io.Serializable;
import java.util.Collection;
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
import javax.persistence.Table;

/**
 *
 * @author Daniel
 */
@Entity
@Table(name = "tipomovimentofinanceiro")
@NamedQueries({
    @NamedQuery(name = "Tipomovimentofinanceiro.findAll", query = "SELECT t FROM Tipomovimentofinanceiro t"),
    @NamedQuery(name = "Tipomovimentofinanceiro.findByIdtipomovfinanceiro", query = "SELECT t FROM Tipomovimentofinanceiro t WHERE t.idtipomovfinanceiro = :idtipomovfinanceiro"),
    @NamedQuery(name = "Tipomovimentofinanceiro.findByIdoperacaotipomovfinanceiro", query = "SELECT t FROM Tipomovimentofinanceiro t WHERE t.idoperacaotipomovfinanceiro = :idoperacaotipomovfinanceiro"),
    @NamedQuery(name = "Tipomovimentofinanceiro.findByNometipomovfinanceiro", query = "SELECT t FROM Tipomovimentofinanceiro t WHERE t.nometipomovfinanceiro = :nometipomovfinanceiro"),
    @NamedQuery(name = "Tipomovimentofinanceiro.findByHistoricopadraotipomovfinanceiro", query = "SELECT t FROM Tipomovimentofinanceiro t WHERE t.historicopadraotipomovfinanceiro = :historicopadraotipomovfinanceiro")})
public class Tipomovimentofinanceiro implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDTIPOMOVFINANCEIRO")
    private Integer idtipomovfinanceiro;
    @Column(name = "IDOPERACAOTIPOMOVFINANCEIRO")
    private Integer idoperacaotipomovfinanceiro;
    @Basic(optional = false)
    @Column(name = "NOMETIPOMOVFINANCEIRO")
    private String nometipomovfinanceiro;
    @Column(name = "HISTORICOPADRAOTIPOMOVFINANCEIRO")
    private String historicopadraotipomovfinanceiro;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idtipomovfinanceiromf")
    private Collection<Movimentofinanceiro> movimentofinanceiroCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idtipomovfinanceirocr")
    private Collection<Contasreceber> contasreceberCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idtipomovfinanceirocp")
    private Collection<Contaspagar> contaspagarCollection;
    @OneToMany(mappedBy = "idtipomovfinanceirocontrolecaixa")
    private Collection<Controlecaixa> controlecaixaCollection;

    public Tipomovimentofinanceiro() {
    }

    public Tipomovimentofinanceiro(Integer idtipomovfinanceiro) {
        this.idtipomovfinanceiro = idtipomovfinanceiro;
    }

    public Tipomovimentofinanceiro(Integer idtipomovfinanceiro, String nometipomovfinanceiro) {
        this.idtipomovfinanceiro = idtipomovfinanceiro;
        this.nometipomovfinanceiro = nometipomovfinanceiro;
    }

    public Integer getIdtipomovfinanceiro() {
        return idtipomovfinanceiro;
    }

    public void setIdtipomovfinanceiro(Integer idtipomovfinanceiro) {
        this.idtipomovfinanceiro = idtipomovfinanceiro;
    }

    public Integer getIdoperacaotipomovfinanceiro() {
        return idoperacaotipomovfinanceiro;
    }

    public void setIdoperacaotipomovfinanceiro(Integer idoperacaotipomovfinanceiro) {
        this.idoperacaotipomovfinanceiro = idoperacaotipomovfinanceiro;
    }

    public String getNometipomovfinanceiro() {
        return nometipomovfinanceiro;
    }

    public void setNometipomovfinanceiro(String nometipomovfinanceiro) {
        this.nometipomovfinanceiro = nometipomovfinanceiro;
    }

    public String getHistoricopadraotipomovfinanceiro() {
        return historicopadraotipomovfinanceiro;
    }

    public void setHistoricopadraotipomovfinanceiro(String historicopadraotipomovfinanceiro) {
        this.historicopadraotipomovfinanceiro = historicopadraotipomovfinanceiro;
    }

    public Collection<Movimentofinanceiro> getMovimentofinanceiroCollection() {
        return movimentofinanceiroCollection;
    }

    public void setMovimentofinanceiroCollection(Collection<Movimentofinanceiro> movimentofinanceiroCollection) {
        this.movimentofinanceiroCollection = movimentofinanceiroCollection;
    }

    public Collection<Contasreceber> getContasreceberCollection() {
        return contasreceberCollection;
    }

    public void setContasreceberCollection(Collection<Contasreceber> contasreceberCollection) {
        this.contasreceberCollection = contasreceberCollection;
    }

    public Collection<Contaspagar> getContaspagarCollection() {
        return contaspagarCollection;
    }

    public void setContaspagarCollection(Collection<Contaspagar> contaspagarCollection) {
        this.contaspagarCollection = contaspagarCollection;
    }

    public Collection<Controlecaixa> getControlecaixaCollection() {
        return controlecaixaCollection;
    }

    public void setControlecaixaCollection(Collection<Controlecaixa> controlecaixaCollection) {
        this.controlecaixaCollection = controlecaixaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipomovfinanceiro != null ? idtipomovfinanceiro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipomovimentofinanceiro)) {
            return false;
        }
        Tipomovimentofinanceiro other = (Tipomovimentofinanceiro) object;
        if ((this.idtipomovfinanceiro == null && other.idtipomovfinanceiro != null) || (this.idtipomovfinanceiro != null && !this.idtipomovfinanceiro.equals(other.idtipomovfinanceiro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sgps.classeMapeada.Tipomovimentofinanceiro[idtipomovfinanceiro=" + idtipomovfinanceiro + "]";
    }

}
