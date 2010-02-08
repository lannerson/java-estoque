/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.devmedia.jpa.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

    @Entity(name="BANCO")

    public class Banco implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    public Banco () {   }
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   private Integer COD_BANCO;
   private  int AGENCIA_BANCO;
   private int CONTA_BANCO;
   private String GERENTE_BANCO;
   private String FONE_BANCO;

    public Banco(Integer COD_BANCO) {
        this.COD_BANCO = COD_BANCO;
    }

    public Banco(Integer COD_BANCO, int AGENCIA_BANCO, int CONTA_BANCO, String GERENTE_BANCO, String FONE_BANCO) {
        this.COD_BANCO = COD_BANCO;
        this.AGENCIA_BANCO = AGENCIA_BANCO;
        this.CONTA_BANCO = CONTA_BANCO;
        this.GERENTE_BANCO = GERENTE_BANCO;
        this.FONE_BANCO = FONE_BANCO;
    }




    public int getAGENCIA_BANCO() {
        return AGENCIA_BANCO;
    }

    public void setAGENCIA_BANCO(int AGENCIA_BANCO) {
        this.AGENCIA_BANCO = AGENCIA_BANCO;
    }

    public Integer getCOD_BANCO() {
        return COD_BANCO;
    }

    public void setCOD_BANCO(Integer COD_BANCO) {
        this.COD_BANCO = COD_BANCO;
    }

    public int getCONTA_BANCO() {
        return CONTA_BANCO;
    }

    public void setCONTA_BANCO(int CONTA_BANCO) {
        this.CONTA_BANCO = CONTA_BANCO;
    }

    public String getFONE_BANCO() {
        return FONE_BANCO;
    }

    public void setFONE_BANCO(String FONE_BANCO) {
        this.FONE_BANCO = FONE_BANCO;
    }

    public String getGERENTE_BANCO() {
        return GERENTE_BANCO;
    }

    public void setGERENTE_BANCO(String GERENTE_BANCO) {
        this.GERENTE_BANCO = GERENTE_BANCO;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Banco other = (Banco) obj;
        if (this.COD_BANCO != other.COD_BANCO && (this.COD_BANCO == null || !this.COD_BANCO.equals(other.COD_BANCO))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + (this.COD_BANCO != null ? this.COD_BANCO.hashCode() : 0);
        return hash;
    }




}
