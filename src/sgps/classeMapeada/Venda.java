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
 * @author Daniel
 */
@Entity
@Table(name = "venda")
@NamedQueries({
    @NamedQuery(name = "Venda.findAll", query = "SELECT v FROM Venda v"),
    @NamedQuery(name = "Venda.findByIdvenda", query = "SELECT v FROM Venda v WHERE v.idvenda = :idvenda"),
    @NamedQuery(name = "Venda.findByDocumentovenda", query = "SELECT v FROM Venda v WHERE v.documentovenda = :documentovenda"),
    @NamedQuery(name = "Venda.findByDatahrvenda", query = "SELECT v FROM Venda v WHERE v.datahrvenda = :datahrvenda"),
    @NamedQuery(name = "Venda.findBySubtotalvenda", query = "SELECT v FROM Venda v WHERE v.subtotalvenda = :subtotalvenda"),
    @NamedQuery(name = "Venda.findByAcrescimovenda", query = "SELECT v FROM Venda v WHERE v.acrescimovenda = :acrescimovenda"),
    @NamedQuery(name = "Venda.findByDescontovenda", query = "SELECT v FROM Venda v WHERE v.descontovenda = :descontovenda"),
    @NamedQuery(name = "Venda.findByValortotalvenda", query = "SELECT v FROM Venda v WHERE v.valortotalvenda = :valortotalvenda"),
    @NamedQuery(name = "Venda.findByValortotalprazovenda", query = "SELECT v FROM Venda v WHERE v.valortotalprazovenda = :valortotalprazovenda"),
    @NamedQuery(name = "Venda.findByNumparecelavenda", query = "SELECT v FROM Venda v WHERE v.numparecelavenda = :numparecelavenda"),
    @NamedQuery(name = "Venda.findByValortotalsevicovenda", query = "SELECT v FROM Venda v WHERE v.valortotalsevicovenda = :valortotalsevicovenda"),
    @NamedQuery(name = "Venda.findByValorrecebidovenda", query = "SELECT v FROM Venda v WHERE v.valorrecebidovenda = :valorrecebidovenda"),
    @NamedQuery(name = "Venda.findByTrocovenda", query = "SELECT v FROM Venda v WHERE v.trocovenda = :trocovenda"),
    @NamedQuery(name = "Venda.findByValorpendentevenda", query = "SELECT v FROM Venda v WHERE v.valorpendentevenda = :valorpendentevenda"),
    @NamedQuery(name = "Venda.findByValorcomissaovenda", query = "SELECT v FROM Venda v WHERE v.valorcomissaovenda = :valorcomissaovenda"),
    @NamedQuery(name = "Venda.findByFlagstatus", query = "SELECT v FROM Venda v WHERE v.flagstatus = :flagstatus"),
    @NamedQuery(name = "Venda.findByObservacaovenda", query = "SELECT v FROM Venda v WHERE v.observacaovenda = :observacaovenda"),
    @NamedQuery(name = "Venda.findByFlagstatusnfvenda", query = "SELECT v FROM Venda v WHERE v.flagstatusnfvenda = :flagstatusnfvenda")})
public class Venda implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDVENDA")
    private Integer idvenda;
    @Column(name = "DOCUMENTOVENDA")
    private Integer documentovenda;
    @Basic(optional = false)
    @Column(name = "DATAHRVENDA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datahrvenda;
    @Column(name = "SUBTOTALVENDA")
    private BigDecimal subtotalvenda;
    @Column(name = "ACRESCIMOVENDA")
    private BigDecimal acrescimovenda;
    @Column(name = "DESCONTOVENDA")
    private BigDecimal descontovenda;
    @Column(name = "VALORTOTALVENDA")
    private BigDecimal valortotalvenda;
    @Column(name = "VALORTOTALPRAZOVENDA")
    private BigDecimal valortotalprazovenda;
    @Column(name = "NUMPARECELAVENDA")
    private Integer numparecelavenda;
    @Column(name = "VALORTOTALSEVICOVENDA")
    private BigDecimal valortotalsevicovenda;
    @Column(name = "VALORRECEBIDOVENDA")
    private BigDecimal valorrecebidovenda;
    @Column(name = "TROCOVENDA")
    private BigDecimal trocovenda;
    @Column(name = "VALORPENDENTEVENDA")
    private BigDecimal valorpendentevenda;
    @Column(name = "VALORCOMISSAOVENDA")
    private BigDecimal valorcomissaovenda;
    @Column(name = "FLAGSTATUS")
    private Boolean flagstatus;
    @Column(name = "OBSERVACAOVENDA")
    private String observacaovenda;
    @Column(name = "FLAGSTATUSNFVENDA")
    private Integer flagstatusnfvenda;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idvendamovservico")
    private Collection<Movimentoservico> movimentoservicoCollection;
    @OneToMany(mappedBy = "idvenda")
    private Collection<Movimentocaixa> movimentocaixaCollection;
    @JoinColumn(name = "IDPESSOAFUNCIONARIOVENDEDOR", referencedColumnName = "IDPESSOAFUNCIONARIO")
    @ManyToOne
    private Funcionario idpessoafuncionariovendedor;
    @JoinColumn(name = "IDPESSOACLIENTEVENDA", referencedColumnName = "IDPESSOACLIENTE")
    @ManyToOne(optional = false)
    private Cliente idpessoaclientevenda;

    public Venda() {
    }

    public Venda(Integer idvenda) {
        this.idvenda = idvenda;
    }

    public Venda(Integer idvenda, Date datahrvenda) {
        this.idvenda = idvenda;
        this.datahrvenda = datahrvenda;
    }

    public Integer getIdvenda() {
        return idvenda;
    }

    public void setIdvenda(Integer idvenda) {
        this.idvenda = idvenda;
    }

    public Integer getDocumentovenda() {
        return documentovenda;
    }

    public void setDocumentovenda(Integer documentovenda) {
        this.documentovenda = documentovenda;
    }

    public Date getDatahrvenda() {
        return datahrvenda;
    }

    public void setDatahrvenda(Date datahrvenda) {
        this.datahrvenda = datahrvenda;
    }

    public BigDecimal getSubtotalvenda() {
        return subtotalvenda;
    }

    public void setSubtotalvenda(BigDecimal subtotalvenda) {
        this.subtotalvenda = subtotalvenda;
    }

    public BigDecimal getAcrescimovenda() {
        return acrescimovenda;
    }

    public void setAcrescimovenda(BigDecimal acrescimovenda) {
        this.acrescimovenda = acrescimovenda;
    }

    public BigDecimal getDescontovenda() {
        return descontovenda;
    }

    public void setDescontovenda(BigDecimal descontovenda) {
        this.descontovenda = descontovenda;
    }

    public BigDecimal getValortotalvenda() {
        return valortotalvenda;
    }

    public void setValortotalvenda(BigDecimal valortotalvenda) {
        this.valortotalvenda = valortotalvenda;
    }

    public BigDecimal getValortotalprazovenda() {
        return valortotalprazovenda;
    }

    public void setValortotalprazovenda(BigDecimal valortotalprazovenda) {
        this.valortotalprazovenda = valortotalprazovenda;
    }

    public Integer getNumparecelavenda() {
        return numparecelavenda;
    }

    public void setNumparecelavenda(Integer numparecelavenda) {
        this.numparecelavenda = numparecelavenda;
    }

    public BigDecimal getValortotalsevicovenda() {
        return valortotalsevicovenda;
    }

    public void setValortotalsevicovenda(BigDecimal valortotalsevicovenda) {
        this.valortotalsevicovenda = valortotalsevicovenda;
    }

    public BigDecimal getValorrecebidovenda() {
        return valorrecebidovenda;
    }

    public void setValorrecebidovenda(BigDecimal valorrecebidovenda) {
        this.valorrecebidovenda = valorrecebidovenda;
    }

    public BigDecimal getTrocovenda() {
        return trocovenda;
    }

    public void setTrocovenda(BigDecimal trocovenda) {
        this.trocovenda = trocovenda;
    }

    public BigDecimal getValorpendentevenda() {
        return valorpendentevenda;
    }

    public void setValorpendentevenda(BigDecimal valorpendentevenda) {
        this.valorpendentevenda = valorpendentevenda;
    }

    public BigDecimal getValorcomissaovenda() {
        return valorcomissaovenda;
    }

    public void setValorcomissaovenda(BigDecimal valorcomissaovenda) {
        this.valorcomissaovenda = valorcomissaovenda;
    }

    public Boolean getFlagstatus() {
        return flagstatus;
    }

    public void setFlagstatus(Boolean flagstatus) {
        this.flagstatus = flagstatus;
    }

    public String getObservacaovenda() {
        return observacaovenda;
    }

    public void setObservacaovenda(String observacaovenda) {
        this.observacaovenda = observacaovenda;
    }

    public Integer getFlagstatusnfvenda() {
        return flagstatusnfvenda;
    }

    public void setFlagstatusnfvenda(Integer flagstatusnfvenda) {
        this.flagstatusnfvenda = flagstatusnfvenda;
    }

    public Collection<Movimentoservico> getMovimentoservicoCollection() {
        return movimentoservicoCollection;
    }

    public void setMovimentoservicoCollection(Collection<Movimentoservico> movimentoservicoCollection) {
        this.movimentoservicoCollection = movimentoservicoCollection;
    }

    public Collection<Movimentocaixa> getMovimentocaixaCollection() {
        return movimentocaixaCollection;
    }

    public void setMovimentocaixaCollection(Collection<Movimentocaixa> movimentocaixaCollection) {
        this.movimentocaixaCollection = movimentocaixaCollection;
    }

    public Funcionario getIdpessoafuncionariovendedor() {
        return idpessoafuncionariovendedor;
    }

    public void setIdpessoafuncionariovendedor(Funcionario idpessoafuncionariovendedor) {
        this.idpessoafuncionariovendedor = idpessoafuncionariovendedor;
    }

    public Cliente getIdpessoaclientevenda() {
        return idpessoaclientevenda;
    }

    public void setIdpessoaclientevenda(Cliente idpessoaclientevenda) {
        this.idpessoaclientevenda = idpessoaclientevenda;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idvenda != null ? idvenda.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Venda)) {
            return false;
        }
        Venda other = (Venda) object;
        if ((this.idvenda == null && other.idvenda != null) || (this.idvenda != null && !this.idvenda.equals(other.idvenda))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sgps.classeMapeada.Venda[idvenda=" + idvenda + "]";
    }

}
