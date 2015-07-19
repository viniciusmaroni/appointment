package com.sistemaclinica.entities;
// Generated 09/07/2015 17:16:10 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * MaterialProcedimentoId generated by hbm2java
 */
@Embeddable
public class MaterialProcedimentoId  implements java.io.Serializable {


     private BigDecimal procId;
     private BigDecimal matId;

    public MaterialProcedimentoId() {
    }

    public MaterialProcedimentoId(BigDecimal procId, BigDecimal matId) {
       this.procId = procId;
       this.matId = matId;
    }
   


    @Column(name="PROC_ID", nullable=false, precision=22, scale=0)
    public BigDecimal getProcId() {
        return this.procId;
    }
    
    public void setProcId(BigDecimal procId) {
        this.procId = procId;
    }


    @Column(name="MAT_ID", nullable=false, precision=22, scale=0)
    public BigDecimal getMatId() {
        return this.matId;
    }
    
    public void setMatId(BigDecimal matId) {
        this.matId = matId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof MaterialProcedimentoId) ) return false;
		 MaterialProcedimentoId castOther = ( MaterialProcedimentoId ) other; 
         
		 return ( (this.getProcId()==castOther.getProcId()) || ( this.getProcId()!=null && castOther.getProcId()!=null && this.getProcId().equals(castOther.getProcId()) ) )
 && ( (this.getMatId()==castOther.getMatId()) || ( this.getMatId()!=null && castOther.getMatId()!=null && this.getMatId().equals(castOther.getMatId()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getProcId() == null ? 0 : this.getProcId().hashCode() );
         result = 37 * result + ( getMatId() == null ? 0 : this.getMatId().hashCode() );
         return result;
   }   


}

