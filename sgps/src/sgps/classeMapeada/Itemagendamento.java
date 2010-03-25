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
@Table(name = "ITEMAGENDAMENTO", catalog = "sgps", schema = "")
@NamedQueries({
    @NamedQuery(name = "Itemagendamento.findAll", query = "SELECT i FROM Itemagendamento i"),
    @NamedQuery(name = "Itemagendamento.findByIdagenditem", query = "SELECT i FROM Itemagendamento i WHERE i.idagenditem = :idagenditem"),
    @NamedQuery(name = "Itemagendamento.findByDataagendamentoagenditem", query = "SELECT i FROM Itemagendamento i WHERE i.dataagendamentoagenditem = :dataagendamentoagenditem"),
    @NamedQuery(name = "Itemagendamento.findByHorarioagendamentoagenditem", query = "SELECT i FROM Itemagendamento i WHERE i.horarioagendamentoagenditem = :horarioagendamentoagenditem"),
    @NamedQuery(name = "Itemagendamento.findByDatahoraagenditem", query = "SELECT i FROM Itemagendamento i WHERE i.datahoraagenditem = :datahoraagenditem"),
    @NamedQuery(name = "Itemagendamento.findByValorservicoagenditem", query = "SELECT i FROM Itemagendamento i WHERE i.valorservicoagenditem = :valorservicoagenditem"),
    @NamedQuery(name = "Itemagendamento.findByPercentualdescontoagenditem", query = "SELECT i FROM Itemagendamento i WHERE i.percentualdescontoagenditem = :percentualdescontoagenditem"),
    @NamedQuery(name = "Itemagendamento.findByPercentualcomissaoagenditem", query = "SELECT i FROM Itemagendamento i WHERE i.percentualcomissaoagenditem = :percentualcomissaoagenditem"),
    @NamedQuery(name = "Itemagendamento.findByValortotalservicoagenditem", query = "SELECT i FROM Itemagendamento i WHERE i.valortotalservicoagenditem = :valortotalservicoagenditem"),
    @NamedQuery(name = "Itemagendamento.findByDataexcecucaoagenditem", query = "SELECT i FROM Itemagendamento i WHERE i.dataexcecucaoagenditem = :dataexcecucaoagenditem"),
    @NamedQuery(name = "Itemagendamento.findByStatusagenditem", query = "SELECT i FROM Itemagendamento i WHERE i.statusagenditem = :statusagenditem"),
    @NamedQuery(name = "Itemagendamento.findByCortesiaagenditem", query = "SELECT i FROM Itemagendamento i WHERE i.cortesiaagenditem = :cortesiaagenditem"),
    @NamedQuery(name = "Itemagendamento.findByFlagcanceladoagenditem", query = "SELECT i FROM Itemagendamento i WHERE i.flagcanceladoagenditem = :flagcanceladoagenditem"),
    @NamedQuery(name = "Itemagendamento.findByItempagoagenditem", query = "SELECT i FROM Itemagendamento i WHERE i.itempagoagenditem = :itempagoagenditem"),
    @NamedQuery(name = "Itemagendamento.findByNumerovenda", query = "SELECT i FROM Itemagendamento i WHERE i.numerovenda = :numerovenda")})
public class Itemagendamento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDAGENDITEM", nullable = false)
    private Integer idagenditem;
    @Column(name = "DATAAGENDAMENTOAGENDITEM")
    @Temporal(TemporalType.DATE)
    private Date dataagendamentoagenditem;
    @Column(name = "HORARIOAGENDAMENTOAGENDITEM")
    @Temporal(TemporalType.TIME)
    private Date horarioagendamentoagenditem;
    @Basic(optional = false)
    @Column(name = "DATAHORAAGENDITEM", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date datahoraagenditem;
    @Column(name = "VALORSERVICOAGENDITEM", precision = 11, scale = 2)
    private BigDecimal valorservicoagenditem;
    @Column(name = "PERCENTUALDESCONTOAGENDITEM", precision = 4, scale = 2)
    private BigDecimal percentualdescontoagenditem;
    @Column(name = "PERCENTUALCOMISSAOAGENDITEM", precision = 4, scale = 2)
    private BigDecimal percentualcomissaoagenditem;
    @Column(name = "VALORTOTALSERVICOAGENDITEM", precision = 11, scale = 2)
    private BigDecimal valortotalservicoagenditem;
    @Column(name = "DATAEXCECUCAOAGENDITEM")
    @Temporal(TemporalType.DATE)
    private Date dataexcecucaoagenditem;
    @Column(name = "STATUSAGENDITEM")
    private Integer statusagenditem;
    @Lob
    @Column(name = "OBSERVACAOAGENDITEM", length = 65535)
    private String observacaoagenditem;
    @Column(name = "CORTESIAAGENDITEM")
    private Boolean cortesiaagenditem;
    @Column(name = "FLAGCANCELADOAGENDITEM")
    private Boolean flagcanceladoagenditem;
    @Column(name = "ITEMPAGOAGENDITEM")
    private Integer itempagoagenditem;
    @Column(name = "NUMEROVENDA")
    private Integer numerovenda;
    @OneToMany(mappedBy = "idagenditemmovservico")
    private List<Movimentoservico> movimentoservicoList;
    @JoinColumn(name = "IDSERVICOAGENDITEM", referencedColumnName = "IDSERVICO")
    @ManyToOne
    private Servico idservicoagenditem;
    @JoinColumn(name = "IDAGENDAMENTOAGENDITEM", referencedColumnName = "IDAGENDAMENTO")
    @ManyToOne
    private Agendamento idagendamentoagenditem;
    @JoinColumn(name = "IDANIMALAGENDITEM", referencedColumnName = "IDANIMAL")
    @ManyToOne
    private Animal idanimalagenditem;
    @JoinColumn(name = "IDPESSOAFUNCIONARIOAGENDITEM", referencedColumnName = "IDPESSOAFUNCIONARIO")
    @ManyToOne
    private Funcionario idpessoafuncionarioagenditem;

    public Itemagendamento() {
    }

    public Itemagendamento(Integer idagenditem) {
        this.idagenditem = idagenditem;
    }

    public Itemagendamento(Integer idagenditem, Date datahoraagenditem) {
        this.idagenditem = idagenditem;
        this.datahoraagenditem = datahoraagenditem;
    }

    public Integer getIdagenditem() {
        return idagenditem;
    }

    public void setIdagenditem(Integer idagenditem) {
        this.idagenditem = idagenditem;
    }

    public Date getDataagendamentoagenditem() {
        return dataagendamentoagenditem;
    }

    public void setDataagendamentoagenditem(Date dataagendamentoagenditem) {
        this.dataagendamentoagenditem = dataagendamentoagenditem;
    }

    public Date getHorarioagendamentoagenditem() {
        return horarioagendamentoagenditem;
    }

    public void setHorarioagendamentoagenditem(Date horarioagendamentoagenditem) {
        this.horarioagendamentoagenditem = horarioagendamentoagenditem;
    }

    public Date getDatahoraagenditem() {
        return datahoraagenditem;
    }

    public void setDatahoraagenditem(Date datahoraagenditem) {
        this.datahoraagenditem = datahoraagenditem;
    }

    public BigDecimal getValorservicoagenditem() {
        return valorservicoagenditem;
    }

    public void setValorservicoagenditem(BigDecimal valorservicoagenditem) {
        this.valorservicoagenditem = valorservicoagenditem;
    }

    public BigDecimal getPercentualdescontoagenditem() {
        return percentualdescontoagenditem;
    }

    public void setPercentualdescontoagenditem(BigDecimal percentualdescontoagenditem) {
        this.percentualdescontoagenditem = percentualdescontoagenditem;
    }

    public BigDecimal getPercentualcomissaoagenditem() {
        return percentualcomissaoagenditem;
    }

    public void setPercentualcomissaoagenditem(BigDecimal percentualcomissaoagenditem) {
        this.percentualcomissaoagenditem = percentualcomissaoagenditem;
    }

    public BigDecimal getValortotalservicoagenditem() {
        return valortotalservicoagenditem;
    }

    public void setValortotalservicoagenditem(BigDecimal valortotalservicoagenditem) {
        this.valortotalservicoagenditem = valortotalservicoagenditem;
    }

    public Date getDataexcecucaoagenditem() {
        return dataexcecucaoagenditem;
    }

    public void setDataexcecucaoagenditem(Date dataexcecucaoagenditem) {
        this.dataexcecucaoagenditem = dataexcecucaoagenditem;
    }

    public Integer getStatusagenditem() {
        return statusagenditem;
    }

    public void setStatusagenditem(Integer statusagenditem) {
        this.statusagenditem = statusagenditem;
    }

    public String getObservacaoagenditem() {
        return observacaoagenditem;
    }

    public void setObservacaoagenditem(String observacaoagenditem) {
        this.observacaoagenditem = observacaoagenditem;
    }

    public Boolean getCortesiaagenditem() {
        return cortesiaagenditem;
    }

    public void setCortesiaagenditem(Boolean cortesiaagenditem) {
        this.cortesiaagenditem = cortesiaagenditem;
    }

    public Boolean getFlagcanceladoagenditem() {
        return flagcanceladoagenditem;
    }

    public void setFlagcanceladoagenditem(Boolean flagcanceladoagenditem) {
        this.flagcanceladoagenditem = flagcanceladoagenditem;
    }

    public Integer getItempagoagenditem() {
        return itempagoagenditem;
    }

    public void setItempagoagenditem(Integer itempagoagenditem) {
        this.itempagoagenditem = itempagoagenditem;
    }

    public Integer getNumerovenda() {
        return numerovenda;
    }

    public void setNumerovenda(Integer numerovenda) {
        this.numerovenda = numerovenda;
    }

    public List<Movimentoservico> getMovimentoservicoList() {
        return movimentoservicoList;
    }

    public void setMovimentoservicoList(List<Movimentoservico> movimentoservicoList) {
        this.movimentoservicoList = movimentoservicoList;
    }

    public Servico getIdservicoagenditem() {
        return idservicoagenditem;
    }

    public void setIdservicoagenditem(Servico idservicoagenditem) {
        this.idservicoagenditem = idservicoagenditem;
    }

    public Agendamento getIdagendamentoagenditem() {
        return idagendamentoagenditem;
    }

    public void setIdagendamentoagenditem(Agendamento idagendamentoagenditem) {
        this.idagendamentoagenditem = idagendamentoagenditem;
    }

    public Animal getIdanimalagenditem() {
        return idanimalagenditem;
    }

    public void setIdanimalagenditem(Animal idanimalagenditem) {
        this.idanimalagenditem = idanimalagenditem;
    }

    public Funcionario getIdpessoafuncionarioagenditem() {
        return idpessoafuncionarioagenditem;
    }

    public void setIdpessoafuncionarioagenditem(Funcionario idpessoafuncionarioagenditem) {
        this.idpessoafuncionarioagenditem = idpessoafuncionarioagenditem;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idagenditem != null ? idagenditem.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Itemagendamento)) {
            return false;
        }
        Itemagendamento other = (Itemagendamento) object;
        if ((this.idagenditem == null && other.idagenditem != null) || (this.idagenditem != null && !this.idagenditem.equals(other.idagenditem))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sgps.classeMapeada.Itemagendamento[idagenditem=" + idagenditem + "]";
    }

}
