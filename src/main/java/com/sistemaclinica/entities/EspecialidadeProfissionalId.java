package com.sistemaclinica.entities;
// Generated 09/07/2015 17:16:10 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * EspecialidadeProfissionalId generated by hbm2java
 */
@Embeddable
public class EspecialidadeProfissionalId  implements java.io.Serializable {


     private BigDecimal espId;
     private BigDecimal profissionalId;
     private BigDecimal empId;

    public EspecialidadeProfissionalId() {
    }

    public EspecialidadeProfissionalId(BigDecimal espId, BigDecimal profissionalId, BigDecimal empId) {
       this.espId = espId;
       this.profissionalId = profissionalId;
       this.empId = empId;
    }
   


    @Column(name="ESP_ID", nullable=false, precision=22, scale=0)
    public BigDecimal getEspId() {
        return this.espId;
    }
    
    public void setEspId(BigDecimal espId) {
        this.espId = espId;
    }


    @Column(name="PROFISSIONAL_ID", nullable=false, precision=22, scale=0)
    public BigDecimal getProfissionalId() {
        return this.profissionalId;
    }
    
    public void setProfissionalId(BigDecimal profissionalId) {
        this.profissionalId = profissionalId;
    }


    @Column(name="EMP_ID", nullable=false, precision=22, scale=0)
    public BigDecimal getEmpId() {
        return this.empId;
    }
    
    public void setEmpId(BigDecimal empId) {
        this.empId = empId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof EspecialidadeProfissionalId) ) return false;
		 EspecialidadeProfissionalId castOther = ( EspecialidadeProfissionalId ) other; 
         
		 return ( (this.getEspId()==castOther.getEspId()) || ( this.getEspId()!=null && castOther.getEspId()!=null && this.getEspId().equals(castOther.getEspId()) ) )
 && ( (this.getProfissionalId()==castOther.getProfissionalId()) || ( this.getProfissionalId()!=null && castOther.getProfissionalId()!=null && this.getProfissionalId().equals(castOther.getProfissionalId()) ) )
 && ( (this.getEmpId()==castOther.getEmpId()) || ( this.getEmpId()!=null && castOther.getEmpId()!=null && this.getEmpId().equals(castOther.getEmpId()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getEspId() == null ? 0 : this.getEspId().hashCode() );
         result = 37 * result + ( getProfissionalId() == null ? 0 : this.getProfissionalId().hashCode() );
         result = 37 * result + ( getEmpId() == null ? 0 : this.getEmpId().hashCode() );
         return result;
   }   


}


