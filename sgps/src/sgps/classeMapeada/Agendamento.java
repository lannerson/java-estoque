/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sgps.classeMapeada;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
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
 * @author martins
 */
@Entity
@Table(name = "AGENDAMENTO", catalog = "sgps", schema = "")
@NamedQueries({
    @NamedQuery(name = "Agendamento.findAll", query = "SELECT a FROM Agendamento a"),
    @NamedQuery(name = "Agendamento.findByIdagendamento", query = "SELECT a FROM Agendamento a WHERE a.idagendamento = :idagendamento"),
    @NamedQuery(name = "Agendamento.findByDescricaoagendamento", query = "SELECT a FROM Agendamento a WHERE a.descricaoagendamento = :descricaoagendamento"),
    @NamedQuery(name = "Agendamento.findByDataagendamento", query = "SELECT a FROM Agendamento a WHERE a.dataagendamento = :dataagendamento"),
    @NamedQuery(name = "Agendamento.findByPeriodicidadeagendamento", query = "SELECT a FROM Agendamento a WHERE a.periodicidadeagendamento = :periodicidadeagendamento"),
    @NamedQuery(name = "Agendamento.findByStatusagendamento", query = "SELECT a FROM Agendamento a WHERE a.statusagendamento = :statusagendamento"),
    @NamedQuery(name = "Agendamento.findByFlagcanceladoagendamento", query = "SELECT a FROM Agendamento a WHERE a.flagcanceladoagendamento = :flagcanceladoagendamento"),
    @NamedQuery(name = "Agendamento.findByFlagservicopago", query = "SELECT a FROM Agendamento a WHERE a.flagservicopago = :flagservicopago")})
public class Agendamento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDAGENDAMENTO", nullable = false)
    private Integer idagendamento;
    @Column(name = "DESCRICAOAGENDAMENTO", length = 255)
    private String descricaoagendamento;
    @Column(name = "DATAAGENDAMENTO")
    @Temporal(TemporalType.DATE)
    private Date dataagendamento;
    @Column(name = "PERIODICIDADEAGENDAMENTO")
    private Integer periodicidadeagendamento;
    @Lob
    @Column(name = "OBSERVACAOAGENDAMENTO", length = 65535)
    private String observacaoagendamento;
    @Column(name = "STATUSAGENDAMENTO")
    private Integer statusagendamento;
    @Column(name = "FLAGCANCELADOAGENDAMENTO")
    private Boolean flagcanceladoagendamento;
    @Column(name = "FLAGSERVICOPAGO")
    private Boolean flagservicopago;
    @OneToMany(mappedBy = "idagendamentomovservico")
    private List<Movimentoservico> movimentoservicoList;
    @OneToMany(mappedBy = "idagendamentoagenditem")
    private List<Itemagendamento> itemagendamentoList;
    @JoinColumn(name = "IDPESSOACLIENTEAGENDAMENTO", referencedColumnName = "IDPESSOACLIENTE")
    @ManyToOne
    private Cliente idpessoaclienteagendamento;

    public Agendamento() {
    }

    public Agendamento(Integer idagendamento) {
        this.idagendamento = idagendamento;
    }

    public Integer getIdagendamento() {
        return idagendamento;
    }

    public void setIdagendamento(Integer idagendamento) {
        this.idagendamento = idagendamento;
    }

    public String getDescricaoagendamento() {
        return descricaoagendamento;
    }

    public void setDescricaoagendamento(String descricaoagendamento) {
        this.descricaoagendamento = descricaoagendamento;
    }

    public Date getDataagendamento() {
        return dataagendamento;
    }

    public void setDataagendamento(Date dataagendamento) {
        this.dataagendamento = dataagendamento;
    }

    public Integer getPeriodicidadeagendamento() {
        return periodicidadeagendamento;
    }

    public void setPeriodicidadeagendamento(Integer periodicidadeagendamento) {
        this.periodicidadeagendamento = periodicidadeagendamento;
    }

    public String getObservacaoagendamento() {
        return observacaoagendamento;
    }

    public void setObservacaoagendamento(String observacaoagendamento) {
        this.observacaoagendamento = observacaoagendamento;
    }

    public Integer getStatusagendamento() {
        return statusagendamento;
    }

    public void setStatusagendamento(Integer statusagendamento) {
        this.statusagendamento = statusagendamento;
    }

    public Boolean getFlagcanceladoagendamento() {
        return flagcanceladoagendamento;
    }

    public void setFlagcanceladoagendamento(Boolean flagcanceladoagendamento) {
        this.flagcanceladoagendamento = flagcanceladoagendamento;
    }

    public Boolean getFlagservicopago() {
        return flagservicopago;
    }

    public void setFlagservicopago(Boolean flagservicopago) {
        this.flagservicopago = flagservicopago;
    }

    public List<Movimentoservico> getMovimentoservicoList() {
        return movimentoservicoList;
    }

    public void setMovimentoservicoList(List<Movimentoservico> movimentoservicoList) {
        this.movimentoservicoList = movimentoservicoList;
    }

    public List<Itemagendamento> getItemagendamentoList() {
        return itemagendamentoList;
    }

    public void setItemagendamentoList(List<Itemagendamento> itemagendamentoList) {
        this.itemagendamentoList = itemagendamentoList;
    }

    public Cliente getIdpessoaclienteagendamento() {
        return idpessoaclienteagendamento;
    }

    public void setIdpessoaclienteagendamento(Cliente idpessoaclienteagendamento) {
        this.idpessoaclienteagendamento = idpessoaclienteagendamento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idagendamento != null ? idagendamento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Agendamento)) {
            return false;
        }
        Agendamento other = (Agendamento) object;
        if ((this.idagendamento == null && other.idagendamento != null) || (this.idagendamento != null && !this.idagendamento.equals(other.idagendamento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sgps.classeMapeada.Agendamento[idagendamento=" + idagendamento + "]";
    }

}
