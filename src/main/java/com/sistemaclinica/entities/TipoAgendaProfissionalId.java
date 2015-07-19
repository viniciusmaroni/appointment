package com.sistemaclinica.entities;
// Generated 09/07/2015 17:16:10 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TipoAgendaProfissionalId generated by hbm2java
 */
@Embeddable
public class TipoAgendaProfissionalId  implements java.io.Serializable {


     private BigDecimal tiageId;
     private BigDecimal profId;

    public TipoAgendaProfissionalId() {
    }

    public TipoAgendaProfissionalId(BigDecimal tiageId, BigDecimal profId) {
       this.tiageId = tiageId;
       this.profId = profId;
    }
   


    @Column(name="TIAGE_ID", nullable=false, precision=22, scale=0)
    public BigDecimal getTiageId() {
        return this.tiageId;
    }
    
    public void setTiageId(BigDecimal tiageId) {
        this.tiageId = tiageId;
    }


    @Column(name="PROF_ID", nullable=false, precision=22, scale=0)
    public BigDecimal getProfId() {
        return this.profId;
    }
    
    public void setProfId(BigDecimal profId) {
        this.profId = profId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof TipoAgendaProfissionalId) ) return false;
		 TipoAgendaProfissionalId castOther = ( TipoAgendaProfissionalId ) other; 
         
		 return ( (this.getTiageId()==castOther.getTiageId()) || ( this.getTiageId()!=null && castOther.getTiageId()!=null && this.getTiageId().equals(castOther.getTiageId()) ) )
 && ( (this.getProfId()==castOther.getProfId()) || ( this.getProfId()!=null && castOther.getProfId()!=null && this.getProfId().equals(castOther.getProfId()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getTiageId() == null ? 0 : this.getTiageId().hashCode() );
         result = 37 * result + ( getProfId() == null ? 0 : this.getProfId().hashCode() );
         return result;
   }   


}


