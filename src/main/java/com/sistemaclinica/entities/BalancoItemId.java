package com.sistemaclinica.entities;
// Generated 09/07/2015 17:16:10 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * BalancoItemId generated by hbm2java
 */
@Embeddable
public class BalancoItemId  implements java.io.Serializable {


     private Date data;
     private BigDecimal itemId;
     private BigDecimal uniId;

    public BalancoItemId() {
    }

    public BalancoItemId(Date data, BigDecimal itemId, BigDecimal uniId) {
       this.data = data;
       this.itemId = itemId;
       this.uniId = uniId;
    }
   


    @Column(name="DATA", nullable=false, length=7)
    public Date getData() {
        return this.data;
    }
    
    public void setData(Date data) {
        this.data = data;
    }


    @Column(name="ITEM_ID", nullable=false, precision=22, scale=0)
    public BigDecimal getItemId() {
        return this.itemId;
    }
    
    public void setItemId(BigDecimal itemId) {
        this.itemId = itemId;
    }


    @Column(name="UNI_ID", nullable=false, precision=22, scale=0)
    public BigDecimal getUniId() {
        return this.uniId;
    }
    
    public void setUniId(BigDecimal uniId) {
        this.uniId = uniId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof BalancoItemId) ) return false;
		 BalancoItemId castOther = ( BalancoItemId ) other; 
         
		 return ( (this.getData()==castOther.getData()) || ( this.getData()!=null && castOther.getData()!=null && this.getData().equals(castOther.getData()) ) )
 && ( (this.getItemId()==castOther.getItemId()) || ( this.getItemId()!=null && castOther.getItemId()!=null && this.getItemId().equals(castOther.getItemId()) ) )
 && ( (this.getUniId()==castOther.getUniId()) || ( this.getUniId()!=null && castOther.getUniId()!=null && this.getUniId().equals(castOther.getUniId()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getData() == null ? 0 : this.getData().hashCode() );
         result = 37 * result + ( getItemId() == null ? 0 : this.getItemId().hashCode() );
         result = 37 * result + ( getUniId() == null ? 0 : this.getUniId().hashCode() );
         return result;
   }   


}


