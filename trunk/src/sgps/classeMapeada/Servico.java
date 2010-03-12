/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sgps.classeMapeada;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
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

/**
 *
 * @author Daniel
 */
@Entity
@Table(name = "servico")
@NamedQueries({
    @NamedQuery(name = "Servico.findAll", query = "SELECT s FROM Servico s"),
    @NamedQuery(name = "Servico.findByIdservico", query = "SELECT s FROM Servico s WHERE s.idservico = :idservico"),
    @NamedQuery(name = "Servico.findByNomeservico", query = "SELECT s FROM Servico s WHERE s.nomeservico = :nomeservico"),
    @NamedQuery(name = "Servico.findByIdservicoprincipal", query = "SELECT s FROM Servico s WHERE s.idservicoprincipal = :idservicoprincipal"),
    @NamedQuery(name = "Servico.findByPorteanimalservico", query = "SELECT s FROM Servico s WHERE s.porteanimalservico = :porteanimalservico"),
    @NamedQuery(name = "Servico.findByNomecompletoservico", query = "SELECT s FROM Servico s WHERE s.nomecompletoservico = :nomecompletoservico"),
    @NamedQuery(name = "Servico.findByPrecoservico", query = "SELECT s FROM Servico s WHERE s.precoservico = :precoservico"),
    @NamedQuery(name = "Servico.findByComissaoservico", query = "SELECT s FROM Servico s WHERE s.comissaoservico = :comissaoservico")})
public class Servico implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDSERVICO")
    private Integer idservico;
    @Basic(optional = false)
    @Column(name = "NOMESERVICO")
    private String nomeservico;
    @Column(name = "IDSERVICOPRINCIPAL")
    private Integer idservicoprincipal;
    @Column(name = "PORTEANIMALSERVICO")
    private Integer porteanimalservico;
    @Column(name = "NOMECOMPLETOSERVICO")
    private String nomecompletoservico;
    @Column(name = "PRECOSERVICO")
    private BigDecimal precoservico;
    @Column(name = "COMISSAOSERVICO")
    private BigDecimal comissaoservico;
    @OneToMany(mappedBy = "idservicoagenditem")
    private Collection<Itemagendamento> itemagendamentoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idservicomovservico")
    private Collection<Movimentoservico> movimentoservicoCollection;
    @JoinColumn(name = "IDUNIDADEMEDIDA", referencedColumnName = "IDUNIDADEMEDIDA")
    @ManyToOne
    private Unidademedida idunidademedida;

    public Servico() {
    }

    public Servico(Integer idservico) {
        this.idservico = idservico;
    }

    public Servico(Integer idservico, String nomeservico) {
        this.idservico = idservico;
        this.nomeservico = nomeservico;
    }

    public Integer getIdservico() {
        return idservico;
    }

    public void setIdservico(Integer idservico) {
        this.idservico = idservico;
    }

    public String getNomeservico() {
        return nomeservico;
    }

    public void setNomeservico(String nomeservico) {
        this.nomeservico = nomeservico;
    }

    public Integer getIdservicoprincipal() {
        return idservicoprincipal;
    }

    public void setIdservicoprincipal(Integer idservicoprincipal) {
        this.idservicoprincipal = idservicoprincipal;
    }

    public Integer getPorteanimalservico() {
        return porteanimalservico;
    }

    public void setPorteanimalservico(Integer porteanimalservico) {
        this.porteanimalservico = porteanimalservico;
    }

    public String getNomecompletoservico() {
        return nomecompletoservico;
    }

    public void setNomecompletoservico(String nomecompletoservico) {
        this.nomecompletoservico = nomecompletoservico;
    }

    public BigDecimal getPrecoservico() {
        return precoservico;
    }

    public void setPrecoservico(BigDecimal precoservico) {
        this.precoservico = precoservico;
    }

    public BigDecimal getComissaoservico() {
        return comissaoservico;
    }

    public void setComissaoservico(BigDecimal comissaoservico) {
        this.comissaoservico = comissaoservico;
    }

    public Collection<Itemagendamento> getItemagendamentoCollection() {
        return itemagendamentoCollection;
    }

    public void setItemagendamentoCollection(Collection<Itemagendamento> itemagendamentoCollection) {
        this.itemagendamentoCollection = itemagendamentoCollection;
    }

    public Collection<Movimentoservico> getMovimentoservicoCollection() {
        return movimentoservicoCollection;
    }

    public void setMovimentoservicoCollection(Collection<Movimentoservico> movimentoservicoCollection) {
        this.movimentoservicoCollection = movimentoservicoCollection;
    }

    public Unidademedida getIdunidademedida() {
        return idunidademedida;
    }

    public void setIdunidademedida(Unidademedida idunidademedida) {
        this.idunidademedida = idunidademedida;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idservico != null ? idservico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Servico)) {
            return false;
        }
        Servico other = (Servico) object;
        if ((this.idservico == null && other.idservico != null) || (this.idservico != null && !this.idservico.equals(other.idservico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sgps.classeMapeada.Servico[idservico=" + idservico + "]";
    }

}
