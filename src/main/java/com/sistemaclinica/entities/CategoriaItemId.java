package com.sistemaclinica.entities;
// Generated 09/07/2015 17:16:10 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CategoriaItemId generated by hbm2java
 */
@Embeddable
public class CategoriaItemId  implements java.io.Serializable {


     private BigDecimal id;
     private BigDecimal empId;

    public CategoriaItemId() {
    }

    public CategoriaItemId(BigDecimal id, BigDecimal empId) {
       this.id = id;
       this.empId = empId;
    }
   


    @Column(name="ID", nullable=false, precision=22, scale=0)
    public BigDecimal getId() {
        return this.id;
    }
    
    public void setId(BigDecimal id) {
        this.id = id;
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
		 if ( !(other instanceof CategoriaItemId) ) return false;
		 CategoriaItemId castOther = ( CategoriaItemId ) other; 
         
		 return ( (this.getId()==castOther.getId()) || ( this.getId()!=null && castOther.getId()!=null && this.getId().equals(castOther.getId()) ) )
 && ( (this.getEmpId()==castOther.getEmpId()) || ( this.getEmpId()!=null && castOther.getEmpId()!=null && this.getEmpId().equals(castOther.getEmpId()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getId() == null ? 0 : this.getId().hashCode() );
         result = 37 * result + ( getEmpId() == null ? 0 : this.getEmpId().hashCode() );
         return result;
   }   


}


