/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sgps.classeMapeada;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author martins
 */
@Entity
@Table(name = "MOVIMENTOSERVICO", catalog = "sgps", schema = "")
@NamedQueries({
    @NamedQuery(name = "Movimentoservico.findAll", query = "SELECT m FROM Movimentoservico m"),
    @NamedQuery(name = "Movimentoservico.findByIdmovservico", query = "SELECT m FROM Movimentoservico m WHERE m.idmovservico = :idmovservico"),
    @NamedQuery(name = "Movimentoservico.findByDatamovservico", query = "SELECT m FROM Movimentoservico m WHERE m.datamovservico = :datamovservico"),
    @NamedQuery(name = "Movimentoservico.findByQuantidademovservico", query = "SELECT m FROM Movimentoservico m WHERE m.quantidademovservico = :quantidademovservico"),
    @NamedQuery(name = "Movimentoservico.findByUmmovservico", query = "SELECT m FROM Movimentoservico m WHERE m.ummovservico = :ummovservico"),
    @NamedQuery(name = "Movimentoservico.findByValorservicomovservico", query = "SELECT m FROM Movimentoservico m WHERE m.valorservicomovservico = :valorservicomovservico"),
    @NamedQuery(name = "Movimentoservico.findByPercentualdescontomovservico", query = "SELECT m FROM Movimentoservico m WHERE m.percentualdescontomovservico = :percentualdescontomovservico"),
    @NamedQuery(name = "Movimentoservico.findByPercentualcomissaomovservico", query = "SELECT m FROM Movimentoservico m WHERE m.percentualcomissaomovservico = :percentualcomissaomovservico"),
    @NamedQuery(name = "Movimentoservico.findByValortotalservicomovservico", query = "SELECT m FROM Movimentoservico m WHERE m.valortotalservicomovservico = :valortotalservicomovservico"),
    @NamedQuery(name = "Movimentoservico.findByValorcomissaomovservico", query = "SELECT m FROM Movimentoservico m WHERE m.valorcomissaomovservico = :valorcomissaomovservico"),
    @NamedQuery(name = "Movimentoservico.findByDataexcecucaomovservico", query = "SELECT m FROM Movimentoservico m WHERE m.dataexcecucaomovservico = :dataexcecucaomovservico"),
    @NamedQuery(name = "Movimentoservico.findByStatusmovservico", query = "SELECT m FROM Movimentoservico m WHERE m.statusmovservico = :statusmovservico")})
public class Movimentoservico implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDMOVSERVICO", nullable = false)
    private Integer idmovservico;
    @Column(name = "DATAMOVSERVICO")
    @Temporal(TemporalType.DATE)
    private Date datamovservico;
    @Basic(optional = false)
    @Column(name = "QUANTIDADEMOVSERVICO", nullable = false, precision = 4, scale = 2)
    private BigDecimal quantidademovservico;
    @Column(name = "UMMOVSERVICO", length = 2)
    private String ummovservico;
    @Column(name = "VALORSERVICOMOVSERVICO", precision = 11, scale = 2)
    private BigDecimal valorservicomovservico;
    @Column(name = "PERCENTUALDESCONTOMOVSERVICO", precision = 4, scale = 2)
    private BigDecimal percentualdescontomovservico;
    @Column(name = "PERCENTUALCOMISSAOMOVSERVICO", precision = 4, scale = 2)
    private BigDecimal percentualcomissaomovservico;
    @Column(name = "VALORTOTALSERVICOMOVSERVICO", precision = 11, scale = 2)
    private BigDecimal valortotalservicomovservico;
    @Column(name = "VALORCOMISSAOMOVSERVICO", precision = 11, scale = 2)
    private BigDecimal valorcomissaomovservico;
    @Column(name = "DATAEXCECUCAOMOVSERVICO")
    @Temporal(TemporalType.DATE)
    private Date dataexcecucaomovservico;
    @Column(name = "STATUSMOVSERVICO")
    private Integer statusmovservico;
    @JoinColumn(name = "IDVENDAMOVSERVICO", referencedColumnName = "IDVENDA", nullable = false)
    @ManyToOne(optional = false)
    private Venda idvendamovservico;
    @JoinColumn(name = "IDAGENDAMENTOMOVSERVICO", referencedColumnName = "IDAGENDAMENTO")
    @ManyToOne
    private Agendamento idagendamentomovservico;
    @JoinColumn(name = "IDAGENDITEMMOVSERVICO", referencedColumnName = "IDAGENDITEM")
    @ManyToOne
    private Itemagendamento idagenditemmovservico;
    @JoinColumn(name = "IDSERVICOMOVSERVICO", referencedColumnName = "IDSERVICO", nullable = false)
    @ManyToOne(optional = false)
    private Servico idservicomovservico;
    @JoinColumn(name = "IDUNIDADEMEDIDAMOVSERVICO", referencedColumnName = "IDUNIDADEMEDIDA")
    @ManyToOne
    private Unidademedida idunidademedidamovservico;

    public Movimentoservico() {
    }

    public Movimentoservico(Integer idmovservico) {
        this.idmovservico = idmovservico;
    }

    public Movimentoservico(Integer idmovservico, BigDecimal quantidademovservico) {
        this.idmovservico = idmovservico;
        this.quantidademovservico = quantidademovservico;
    }

    public Integer getIdmovservico() {
        return idmovservico;
    }

    public void setIdmovservico(Integer idmovservico) {
        this.idmovservico = idmovservico;
    }

    public Date getDatamovservico() {
        return datamovservico;
    }

    public void setDatamovservico(Date datamovservico) {
        this.datamovservico = datamovservico;
    }

    public BigDecimal getQuantidademovservico() {
        return quantidademovservico;
    }

    public void setQuantidademovservico(BigDecimal quantidademovservico) {
        this.quantidademovservico = quantidademovservico;
    }

    public String getUmmovservico() {
        return ummovservico;
    }

    public void setUmmovservico(String ummovservico) {
        this.ummovservico = ummovservico;
    }

    public BigDecimal getValorservicomovservico() {
        return valorservicomovservico;
    }

    public void setValorservicomovservico(BigDecimal valorservicomovservico) {
        this.valorservicomovservico = valorservicomovservico;
    }

    public BigDecimal getPercentualdescontomovservico() {
        return percentualdescontomovservico;
    }

    public void setPercentualdescontomovservico(BigDecimal percentualdescontomovservico) {
        this.percentualdescontomovservico = percentualdescontomovservico;
    }

    public BigDecimal getPercentualcomissaomovservico() {
        return percentualcomissaomovservico;
    }

    public void setPercentualcomissaomovservico(BigDecimal percentualcomissaomovservico) {
        this.percentualcomissaomovservico = percentualcomissaomovservico;
    }

    public BigDecimal getValortotalservicomovservico() {
        return valortotalservicomovservico;
    }

    public void setValortotalservicomovservico(BigDecimal valortotalservicomovservico) {
        this.valortotalservicomovservico = valortotalservicomovservico;
    }

    public BigDecimal getValorcomissaomovservico() {
        return valorcomissaomovservico;
    }

    public void setValorcomissaomovservico(BigDecimal valorcomissaomovservico) {
        this.valorcomissaomovservico = valorcomissaomovservico;
    }

    public Date getDataexcecucaomovservico() {
        return dataexcecucaomovservico;
    }

    public void setDataexcecucaomovservico(Date dataexcecucaomovservico) {
        this.dataexcecucaomovservico = dataexcecucaomovservico;
    }

    public Integer getStatusmovservico() {
        return statusmovservico;
    }

    public void setStatusmovservico(Integer statusmovservico) {
        this.statusmovservico = statusmovservico;
    }

    public Venda getIdvendamovservico() {
        return idvendamovservico;
    }

    public void setIdvendamovservico(Venda idvendamovservico) {
        this.idvendamovservico = idvendamovservico;
    }

    public Agendamento getIdagendamentomovservico() {
        return idagendamentomovservico;
    }

    public void setIdagendamentomovservico(Agendamento idagendamentomovservico) {
        this.idagendamentomovservico = idagendamentomovservico;
    }

    public Itemagendamento getIdagenditemmovservico() {
        return idagenditemmovservico;
    }

    public void setIdagenditemmovservico(Itemagendamento idagenditemmovservico) {
        this.idagenditemmovservico = idagenditemmovservico;
    }

    public Servico getIdservicomovservico() {
        return idservicomovservico;
    }

    public void setIdservicomovservico(Servico idservicomovservico) {
        this.idservicomovservico = idservicomovservico;
    }

    public Unidademedida getIdunidademedidamovservico() {
        return idunidademedidamovservico;
    }

    public void setIdunidademedidamovservico(Unidademedida idunidademedidamovservico) {
        this.idunidademedidamovservico = idunidademedidamovservico;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmovservico != null ? idmovservico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Movimentoservico)) {
            return false;
        }
        Movimentoservico other = (Movimentoservico) object;
        if ((this.idmovservico == null && other.idmovservico != null) || (this.idmovservico != null && !this.idmovservico.equals(other.idmovservico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sgps.classeMapeada.Movimentoservico[idmovservico=" + idmovservico + "]";
    }

}
