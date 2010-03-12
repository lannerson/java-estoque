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
@Table(name = "contacorrente")
@NamedQueries({
    @NamedQuery(name = "Contacorrente.findAll", query = "SELECT c FROM Contacorrente c"),
    @NamedQuery(name = "Contacorrente.findByIdcontacorrente", query = "SELECT c FROM Contacorrente c WHERE c.idcontacorrente = :idcontacorrente"),
    @NamedQuery(name = "Contacorrente.findByNomecontacorrente", query = "SELECT c FROM Contacorrente c WHERE c.nomecontacorrente = :nomecontacorrente"),
    @NamedQuery(name = "Contacorrente.findByIdtipocontacorrente", query = "SELECT c FROM Contacorrente c WHERE c.idtipocontacorrente = :idtipocontacorrente"),
    @NamedQuery(name = "Contacorrente.findByCodigobancocc", query = "SELECT c FROM Contacorrente c WHERE c.codigobancocc = :codigobancocc"),
    @NamedQuery(name = "Contacorrente.findByNomebancocc", query = "SELECT c FROM Contacorrente c WHERE c.nomebancocc = :nomebancocc"),
    @NamedQuery(name = "Contacorrente.findByCodigocarteiracc", query = "SELECT c FROM Contacorrente c WHERE c.codigocarteiracc = :codigocarteiracc"),
    @NamedQuery(name = "Contacorrente.findByCodigocedentecc", query = "SELECT c FROM Contacorrente c WHERE c.codigocedentecc = :codigocedentecc"),
    @NamedQuery(name = "Contacorrente.findByDigitocodcendentecc", query = "SELECT c FROM Contacorrente c WHERE c.digitocodcendentecc = :digitocodcendentecc"),
    @NamedQuery(name = "Contacorrente.findByNomecedentecc", query = "SELECT c FROM Contacorrente c WHERE c.nomecedentecc = :nomecedentecc"),
    @NamedQuery(name = "Contacorrente.findByAgenciabancocc", query = "SELECT c FROM Contacorrente c WHERE c.agenciabancocc = :agenciabancocc"),
    @NamedQuery(name = "Contacorrente.findByDigitoagenciacc", query = "SELECT c FROM Contacorrente c WHERE c.digitoagenciacc = :digitoagenciacc"),
    @NamedQuery(name = "Contacorrente.findByNumerocontacc", query = "SELECT c FROM Contacorrente c WHERE c.numerocontacc = :numerocontacc"),
    @NamedQuery(name = "Contacorrente.findByDigitocontacc", query = "SELECT c FROM Contacorrente c WHERE c.digitocontacc = :digitocontacc"),
    @NamedQuery(name = "Contacorrente.findByDescricaocontacorrentcc", query = "SELECT c FROM Contacorrente c WHERE c.descricaocontacorrentcc = :descricaocontacorrentcc"),
    @NamedQuery(name = "Contacorrente.findByLocalpagamentocc", query = "SELECT c FROM Contacorrente c WHERE c.localpagamentocc = :localpagamentocc")})
public class Contacorrente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDCONTACORRENTE")
    private Integer idcontacorrente;
    @Basic(optional = false)
    @Column(name = "NOMECONTACORRENTE")
    private String nomecontacorrente;
    @Basic(optional = false)
    @Column(name = "IDTIPOCONTACORRENTE")
    private int idtipocontacorrente;
    @Column(name = "CODIGOBANCOCC")
    private String codigobancocc;
    @Column(name = "NOMEBANCOCC")
    private String nomebancocc;
    @Column(name = "CODIGOCARTEIRACC")
    private String codigocarteiracc;
    @Column(name = "CODIGOCEDENTECC")
    private String codigocedentecc;
    @Column(name = "DIGITOCODCENDENTECC")
    private String digitocodcendentecc;
    @Column(name = "NOMECEDENTECC")
    private String nomecedentecc;
    @Column(name = "AGENCIABANCOCC")
    private String agenciabancocc;
    @Column(name = "DIGITOAGENCIACC")
    private String digitoagenciacc;
    @Column(name = "NUMEROCONTACC")
    private String numerocontacc;
    @Column(name = "DIGITOCONTACC")
    private String digitocontacc;
    @Column(name = "DESCRICAOCONTACORRENTCC")
    private String descricaocontacorrentcc;
    @Column(name = "LOCALPAGAMENTOCC")
    private String localpagamentocc;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idcontacorrentemf")
    private Collection<Movimentofinanceiro> movimentofinanceiroCollection;
    @OneToMany(mappedBy = "idcontacorrentecr")
    private Collection<Contasreceber> contasreceberCollection;
    @OneToMany(mappedBy = "idcontacorrentecp")
    private Collection<Contaspagar> contaspagarCollection;
    @OneToMany(mappedBy = "idcontacorrentecontrolecaixa")
    private Collection<Controlecaixa> controlecaixaCollection;

    public Contacorrente() {
    }

    public Contacorrente(Integer idcontacorrente) {
        this.idcontacorrente = idcontacorrente;
    }

    public Contacorrente(Integer idcontacorrente, String nomecontacorrente, int idtipocontacorrente) {
        this.idcontacorrente = idcontacorrente;
        this.nomecontacorrente = nomecontacorrente;
        this.idtipocontacorrente = idtipocontacorrente;
    }

    public Integer getIdcontacorrente() {
        return idcontacorrente;
    }

    public void setIdcontacorrente(Integer idcontacorrente) {
        this.idcontacorrente = idcontacorrente;
    }

    public String getNomecontacorrente() {
        return nomecontacorrente;
    }

    public void setNomecontacorrente(String nomecontacorrente) {
        this.nomecontacorrente = nomecontacorrente;
    }

    public int getIdtipocontacorrente() {
        return idtipocontacorrente;
    }

    public void setIdtipocontacorrente(int idtipocontacorrente) {
        this.idtipocontacorrente = idtipocontacorrente;
    }

    public String getCodigobancocc() {
        return codigobancocc;
    }

    public void setCodigobancocc(String codigobancocc) {
        this.codigobancocc = codigobancocc;
    }

    public String getNomebancocc() {
        return nomebancocc;
    }

    public void setNomebancocc(String nomebancocc) {
        this.nomebancocc = nomebancocc;
    }

    public String getCodigocarteiracc() {
        return codigocarteiracc;
    }

    public void setCodigocarteiracc(String codigocarteiracc) {
        this.codigocarteiracc = codigocarteiracc;
    }

    public String getCodigocedentecc() {
        return codigocedentecc;
    }

    public void setCodigocedentecc(String codigocedentecc) {
        this.codigocedentecc = codigocedentecc;
    }

    public String getDigitocodcendentecc() {
        return digitocodcendentecc;
    }

    public void setDigitocodcendentecc(String digitocodcendentecc) {
        this.digitocodcendentecc = digitocodcendentecc;
    }

    public String getNomecedentecc() {
        return nomecedentecc;
    }

    public void setNomecedentecc(String nomecedentecc) {
        this.nomecedentecc = nomecedentecc;
    }

    public String getAgenciabancocc() {
        return agenciabancocc;
    }

    public void setAgenciabancocc(String agenciabancocc) {
        this.agenciabancocc = agenciabancocc;
    }

    public String getDigitoagenciacc() {
        return digitoagenciacc;
    }

    public void setDigitoagenciacc(String digitoagenciacc) {
        this.digitoagenciacc = digitoagenciacc;
    }

    public String getNumerocontacc() {
        return numerocontacc;
    }

    public void setNumerocontacc(String numerocontacc) {
        this.numerocontacc = numerocontacc;
    }

    public String getDigitocontacc() {
        return digitocontacc;
    }

    public void setDigitocontacc(String digitocontacc) {
        this.digitocontacc = digitocontacc;
    }

    public String getDescricaocontacorrentcc() {
        return descricaocontacorrentcc;
    }

    public void setDescricaocontacorrentcc(String descricaocontacorrentcc) {
        this.descricaocontacorrentcc = descricaocontacorrentcc;
    }

    public String getLocalpagamentocc() {
        return localpagamentocc;
    }

    public void setLocalpagamentocc(String localpagamentocc) {
        this.localpagamentocc = localpagamentocc;
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
        hash += (idcontacorrente != null ? idcontacorrente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contacorrente)) {
            return false;
        }
        Contacorrente other = (Contacorrente) object;
        if ((this.idcontacorrente == null && other.idcontacorrente != null) || (this.idcontacorrente != null && !this.idcontacorrente.equals(other.idcontacorrente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sgps.classeMapeada.Contacorrente[idcontacorrente=" + idcontacorrente + "]";
    }

}
