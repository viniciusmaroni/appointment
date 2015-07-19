package com.sistemaclinica.entities;
// Generated 09/07/2015 17:16:10 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ProximaSituacaoChequeId generated by hbm2java
 */
@Embeddable
public class ProximaSituacaoChequeId  implements java.io.Serializable {


     private BigDecimal sicheIdProxima;
     private BigDecimal sicheId;

    public ProximaSituacaoChequeId() {
    }

    public ProximaSituacaoChequeId(BigDecimal sicheIdProxima, BigDecimal sicheId) {
       this.sicheIdProxima = sicheIdProxima;
       this.sicheId = sicheId;
    }
   


    @Column(name="SICHE_ID_PROXIMA", nullable=false, precision=22, scale=0)
    public BigDecimal getSicheIdProxima() {
        return this.sicheIdProxima;
    }
    
    public void setSicheIdProxima(BigDecimal sicheIdProxima) {
        this.sicheIdProxima = sicheIdProxima;
    }


    @Column(name="SICHE_ID", nullable=false, precision=22, scale=0)
    public BigDecimal getSicheId() {
        return this.sicheId;
    }
    
    public void setSicheId(BigDecimal sicheId) {
        this.sicheId = sicheId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ProximaSituacaoChequeId) ) return false;
		 ProximaSituacaoChequeId castOther = ( ProximaSituacaoChequeId ) other; 
         
		 return ( (this.getSicheIdProxima()==castOther.getSicheIdProxima()) || ( this.getSicheIdProxima()!=null && castOther.getSicheIdProxima()!=null && this.getSicheIdProxima().equals(castOther.getSicheIdProxima()) ) )
 && ( (this.getSicheId()==castOther.getSicheId()) || ( this.getSicheId()!=null && castOther.getSicheId()!=null && this.getSicheId().equals(castOther.getSicheId()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getSicheIdProxima() == null ? 0 : this.getSicheIdProxima().hashCode() );
         result = 37 * result + ( getSicheId() == null ? 0 : this.getSicheId().hashCode() );
         return result;
   }   


}

