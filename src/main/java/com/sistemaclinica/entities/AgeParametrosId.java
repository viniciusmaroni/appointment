package com.sistemaclinica.entities;
// Generated 09/07/2015 17:16:10 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * AgeParametrosId generated by hbm2java
 */
@Embeddable
public class AgeParametrosId  implements java.io.Serializable {


     private String nmParametro;
     private BigDecimal progCdPrograma;

    public AgeParametrosId() {
    }

    public AgeParametrosId(String nmParametro, BigDecimal progCdPrograma) {
       this.nmParametro = nmParametro;
       this.progCdPrograma = progCdPrograma;
    }
   


    @Column(name="NM_PARAMETRO", nullable=false, length=100)
    public String getNmParametro() {
        return this.nmParametro;
    }
    
    public void setNmParametro(String nmParametro) {
        this.nmParametro = nmParametro;
    }


    @Column(name="PROG_CD_PROGRAMA", nullable=false, precision=22, scale=0)
    public BigDecimal getProgCdPrograma() {
        return this.progCdPrograma;
    }
    
    public void setProgCdPrograma(BigDecimal progCdPrograma) {
        this.progCdPrograma = progCdPrograma;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AgeParametrosId) ) return false;
		 AgeParametrosId castOther = ( AgeParametrosId ) other; 
         
		 return ( (this.getNmParametro()==castOther.getNmParametro()) || ( this.getNmParametro()!=null && castOther.getNmParametro()!=null && this.getNmParametro().equals(castOther.getNmParametro()) ) )
 && ( (this.getProgCdPrograma()==castOther.getProgCdPrograma()) || ( this.getProgCdPrograma()!=null && castOther.getProgCdPrograma()!=null && this.getProgCdPrograma().equals(castOther.getProgCdPrograma()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getNmParametro() == null ? 0 : this.getNmParametro().hashCode() );
         result = 37 * result + ( getProgCdPrograma() == null ? 0 : this.getProgCdPrograma().hashCode() );
         return result;
   }   


}

