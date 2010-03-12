/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sgps.classeMapeada;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Daniel
 */
@Entity
@Table(name = "grupoproduto")
@NamedQueries({
    @NamedQuery(name = "Grupoproduto.findAll", query = "SELECT g FROM Grupoproduto g"),
    @NamedQuery(name = "Grupoproduto.findByIdgrupo", query = "SELECT g FROM Grupoproduto g WHERE g.idgrupo = :idgrupo"),
    @NamedQuery(name = "Grupoproduto.findByNomegrupo", query = "SELECT g FROM Grupoproduto g WHERE g.nomegrupo = :nomegrupo"),
    @NamedQuery(name = "Grupoproduto.findByIdprincipalgrupo", query = "SELECT g FROM Grupoproduto g WHERE g.idprincipalgrupo = :idprincipalgrupo"),
    @NamedQuery(name = "Grupoproduto.findByDescricaocompletagrupo", query = "SELECT g FROM Grupoproduto g WHERE g.descricaocompletagrupo = :descricaocompletagrupo")})
public class Grupoproduto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDGRUPO")
    private Integer idgrupo;
    @Basic(optional = false)
    @Column(name = "NOMEGRUPO")
    private String nomegrupo;
    @Column(name = "IDPRINCIPALGRUPO")
    private Integer idprincipalgrupo;
    @Column(name = "DESCRICAOCOMPLETAGRUPO")
    private String descricaocompletagrupo;

    public Grupoproduto() {
    }

    public Grupoproduto(Integer idgrupo) {
        this.idgrupo = idgrupo;
    }

    public Grupoproduto(Integer idgrupo, String nomegrupo) {
        this.idgrupo = idgrupo;
        this.nomegrupo = nomegrupo;
    }

    public Integer getIdgrupo() {
        return idgrupo;
    }

    public void setIdgrupo(Integer idgrupo) {
        this.idgrupo = idgrupo;
    }

    public String getNomegrupo() {
        return nomegrupo;
    }

    public void setNomegrupo(String nomegrupo) {
        this.nomegrupo = nomegrupo;
    }

    public Integer getIdprincipalgrupo() {
        return idprincipalgrupo;
    }

    public void setIdprincipalgrupo(Integer idprincipalgrupo) {
        this.idprincipalgrupo = idprincipalgrupo;
    }

    public String getDescricaocompletagrupo() {
        return descricaocompletagrupo;
    }

    public void setDescricaocompletagrupo(String descricaocompletagrupo) {
        this.descricaocompletagrupo = descricaocompletagrupo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idgrupo != null ? idgrupo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Grupoproduto)) {
            return false;
        }
        Grupoproduto other = (Grupoproduto) object;
        if ((this.idgrupo == null && other.idgrupo != null) || (this.idgrupo != null && !this.idgrupo.equals(other.idgrupo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sgps.classeMapeada.Grupoproduto[idgrupo=" + idgrupo + "]";
    }

}
