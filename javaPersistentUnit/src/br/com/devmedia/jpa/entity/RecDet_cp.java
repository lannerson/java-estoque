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

@Entity(name = "ORC_DET")

public class RecDet_cp implements java.io.Serializable {


    private static final long serialVersionUID = 1L;

    /*
     *
     * @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   private Integer COD_BANCO;
   private  int AGENCIA_BANCO;
   private int CONTA_BANCO;
   private String GERENTE_BANCO;
   private String FONE_BANCO;
     */
     @EmbeddedId
     private RecDet_cp_pk id;
    
    @Column(nullable=true, name = "QTDE_ORC_DET")
    private Integer qtdeOrcDet;
    @Column(nullable=true, name = "VRL_UNIT_ORC_DET")
    private Double vlrUnitOrcDet;
    @Column(nullable=true, name = "VRL_TOTAL_ORC_DET")
    private Double vlrTotalOrcDet;
    public RecDet_cp() {
    }

    public RecDet_cp(RecDet_cp_pk id, Integer qtdeOrcDet, Double vlrUnitOrcDet, Double vlrTotalOrcDet) {
        this.id = id;
        this.qtdeOrcDet = qtdeOrcDet;
        this.vlrUnitOrcDet = vlrUnitOrcDet;
        this.vlrTotalOrcDet = vlrTotalOrcDet;
    }

    public RecDet_cp_pk getId() {
        return id;
    }

    public void setId(RecDet_cp_pk id) {
        this.id = id;
    }

    public Integer getQtdeOrcDet() {
        return qtdeOrcDet;
    }

    public void setQtdeOrcDet(Integer qtdeOrcDet) {
        this.qtdeOrcDet = qtdeOrcDet;
    }

    public Double getVlrTotalOrcDet() {
        return vlrTotalOrcDet;
    }

    public void setVlrTotalOrcDet(Double vlrTotalOrcDet) {
        this.vlrTotalOrcDet = vlrTotalOrcDet;
    }

    public Double getVlrUnitOrcDet() {
        return vlrUnitOrcDet;
    }

    public void setVlrUnitOrcDet(Double vlrUnitOrcDet) {
        this.vlrUnitOrcDet = vlrUnitOrcDet;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final RecDet_cp other = (RecDet_cp) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }





}
