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
@Table(name = "unidademedida")
@NamedQueries({
    @NamedQuery(name = "Unidademedida.findAll", query = "SELECT u FROM Unidademedida u"),
    @NamedQuery(name = "Unidademedida.findByIdunidademedida", query = "SELECT u FROM Unidademedida u WHERE u.idunidademedida = :idunidademedida"),
    @NamedQuery(name = "Unidademedida.findByDescricaounidademedida", query = "SELECT u FROM Unidademedida u WHERE u.descricaounidademedida = :descricaounidademedida"),
    @NamedQuery(name = "Unidademedida.findBySiglaunidademedida", query = "SELECT u FROM Unidademedida u WHERE u.siglaunidademedida = :siglaunidademedida")})
public class Unidademedida implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDUNIDADEMEDIDA")
    private Integer idunidademedida;
    @Basic(optional = false)
    @Column(name = "DESCRICAOUNIDADEMEDIDA")
    private String descricaounidademedida;
    @Basic(optional = false)
    @Column(name = "SIGLAUNIDADEMEDIDA")
    private String siglaunidademedida;
    @OneToMany(mappedBy = "idunidademedidamovservico")
    private Collection<Movimentoservico> movimentoservicoCollection;
    @OneToMany(mappedBy = "idunidademedida")
    private Collection<Servico> servicoCollection;

    public Unidademedida() {
    }

    public Unidademedida(Integer idunidademedida) {
        this.idunidademedida = idunidademedida;
    }

    public Unidademedida(Integer idunidademedida, String descricaounidademedida, String siglaunidademedida) {
        this.idunidademedida = idunidademedida;
        this.descricaounidademedida = descricaounidademedida;
        this.siglaunidademedida = siglaunidademedida;
    }

    public Integer getIdunidademedida() {
        return idunidademedida;
    }

    public void setIdunidademedida(Integer idunidademedida) {
        this.idunidademedida = idunidademedida;
    }

    public String getDescricaounidademedida() {
        return descricaounidademedida;
    }

    public void setDescricaounidademedida(String descricaounidademedida) {
        this.descricaounidademedida = descricaounidademedida;
    }

    public String getSiglaunidademedida() {
        return siglaunidademedida;
    }

    public void setSiglaunidademedida(String siglaunidademedida) {
        this.siglaunidademedida = siglaunidademedida;
    }

    public Collection<Movimentoservico> getMovimentoservicoCollection() {
        return movimentoservicoCollection;
    }

    public void setMovimentoservicoCollection(Collection<Movimentoservico> movimentoservicoCollection) {
        this.movimentoservicoCollection = movimentoservicoCollection;
    }

    public Collection<Servico> getServicoCollection() {
        return servicoCollection;
    }

    public void setServicoCollection(Collection<Servico> servicoCollection) {
        this.servicoCollection = servicoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idunidademedida != null ? idunidademedida.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Unidademedida)) {
            return false;
        }
        Unidademedida other = (Unidademedida) object;
        if ((this.idunidademedida == null && other.idunidademedida != null) || (this.idunidademedida != null && !this.idunidademedida.equals(other.idunidademedida))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sgps.classeMapeada.Unidademedida[idunidademedida=" + idunidademedida + "]";
    }

}
