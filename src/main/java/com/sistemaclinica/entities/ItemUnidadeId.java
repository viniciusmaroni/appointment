package com.sistemaclinica.entities;
// Generated 09/07/2015 17:16:10 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ItemUnidadeId generated by hbm2java
 */
@Embeddable
public class ItemUnidadeId  implements java.io.Serializable {


     private BigDecimal uniId;
     private BigDecimal itemId;

    public ItemUnidadeId() {
    }

    public ItemUnidadeId(BigDecimal uniId, BigDecimal itemId) {
       this.uniId = uniId;
       this.itemId = itemId;
    }
   


    @Column(name="UNI_ID", nullable=false, precision=22, scale=0)
    public BigDecimal getUniId() {
        return this.uniId;
    }
    
    public void setUniId(BigDecimal uniId) {
        this.uniId = uniId;
    }


    @Column(name="ITEM_ID", nullable=false, precision=22, scale=0)
    public BigDecimal getItemId() {
        return this.itemId;
    }
    
    public void setItemId(BigDecimal itemId) {
        this.itemId = itemId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ItemUnidadeId) ) return false;
		 ItemUnidadeId castOther = ( ItemUnidadeId ) other; 
         
		 return ( (this.getUniId()==castOther.getUniId()) || ( this.getUniId()!=null && castOther.getUniId()!=null && this.getUniId().equals(castOther.getUniId()) ) )
 && ( (this.getItemId()==castOther.getItemId()) || ( this.getItemId()!=null && castOther.getItemId()!=null && this.getItemId().equals(castOther.getItemId()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getUniId() == null ? 0 : this.getUniId().hashCode() );
         result = 37 * result + ( getItemId() == null ? 0 : this.getItemId().hashCode() );
         return result;
   }   


}


