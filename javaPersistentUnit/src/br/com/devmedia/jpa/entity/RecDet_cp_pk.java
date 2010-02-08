/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.devmedia.jpa.entity;

import javax.persistence.*;

/**
 *
 * @author martins
 */
@Embeddable()
public class RecDet_cp_pk implements java.io.Serializable {


    
    @Column(nullable=false, name = "COD_ORC_CAB")
    private  Integer codOrcCab;
    @Column(nullable=false, name = "COD_PRODUTO")
    private String codProduto;

    public RecDet_cp_pk() {
    }

    public RecDet_cp_pk(Integer codOrcCab, String codProduto) {
        this.codOrcCab = codOrcCab;
        this.codProduto = codProduto;
    }

    public Integer getCodOrcCab() {
        return codOrcCab;
    }

    public void setCodOrcCab(Integer codOrcCab) {
        this.codOrcCab = codOrcCab;
    }

    public String getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(String codProduto) {
        this.codProduto = codProduto;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final RecDet_cp_pk other = (RecDet_cp_pk) obj;
        if (this.codOrcCab != other.codOrcCab && (this.codOrcCab == null || !this.codOrcCab.equals(other.codOrcCab))) {
            return false;
        }
        if ((this.codProduto == null) ? (other.codProduto != null) : !this.codProduto.equals(other.codProduto)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + (this.codOrcCab != null ? this.codOrcCab.hashCode() : 0);
        hash = 17 * hash + (this.codProduto != null ? this.codProduto.hashCode() : 0);
        return hash;
    }


}
