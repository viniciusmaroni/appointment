package com.sistemaclinica.entities;
// Generated 09/07/2015 17:16:10 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CobrancaId generated by hbm2java
 */
@Embeddable
public class CobrancaId  implements java.io.Serializable {


     private BigDecimal parcela;
     private BigDecimal contId;

    public CobrancaId() {
    }

    public CobrancaId(BigDecimal parcela, BigDecimal contId) {
       this.parcela = parcela;
       this.contId = contId;
    }
   


    @Column(name="PARCELA", nullable=false, precision=22, scale=0)
    public BigDecimal getParcela() {
        return this.parcela;
    }
    
    public void setParcela(BigDecimal parcela) {
        this.parcela = parcela;
    }


    @Column(name="CONT_ID", nullable=false, precision=22, scale=0)
    public BigDecimal getContId() {
        return this.contId;
    }
    
    public void setContId(BigDecimal contId) {
        this.contId = contId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof CobrancaId) ) return false;
		 CobrancaId castOther = ( CobrancaId ) other; 
         
		 return ( (this.getParcela()==castOther.getParcela()) || ( this.getParcela()!=null && castOther.getParcela()!=null && this.getParcela().equals(castOther.getParcela()) ) )
 && ( (this.getContId()==castOther.getContId()) || ( this.getContId()!=null && castOther.getContId()!=null && this.getContId().equals(castOther.getContId()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getParcela() == null ? 0 : this.getParcela().hashCode() );
         result = 37 * result + ( getContId() == null ? 0 : this.getContId().hashCode() );
         return result;
   }   


}

