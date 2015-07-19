package com.sistemaclinica.entities;
// Generated 09/07/2015 17:16:10 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * UsuarioUnidadeAgendaId generated by hbm2java
 */
@Embeddable
public class UsuarioUnidadeAgendaId  implements java.io.Serializable {


     private BigDecimal uniId;
     private BigDecimal grusCdUsuario;

    public UsuarioUnidadeAgendaId() {
    }

    public UsuarioUnidadeAgendaId(BigDecimal uniId, BigDecimal grusCdUsuario) {
       this.uniId = uniId;
       this.grusCdUsuario = grusCdUsuario;
    }
   


    @Column(name="UNI_ID", nullable=false, precision=22, scale=0)
    public BigDecimal getUniId() {
        return this.uniId;
    }
    
    public void setUniId(BigDecimal uniId) {
        this.uniId = uniId;
    }


    @Column(name="GRUS_CD_USUARIO", nullable=false, precision=22, scale=0)
    public BigDecimal getGrusCdUsuario() {
        return this.grusCdUsuario;
    }
    
    public void setGrusCdUsuario(BigDecimal grusCdUsuario) {
        this.grusCdUsuario = grusCdUsuario;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof UsuarioUnidadeAgendaId) ) return false;
		 UsuarioUnidadeAgendaId castOther = ( UsuarioUnidadeAgendaId ) other; 
         
		 return ( (this.getUniId()==castOther.getUniId()) || ( this.getUniId()!=null && castOther.getUniId()!=null && this.getUniId().equals(castOther.getUniId()) ) )
 && ( (this.getGrusCdUsuario()==castOther.getGrusCdUsuario()) || ( this.getGrusCdUsuario()!=null && castOther.getGrusCdUsuario()!=null && this.getGrusCdUsuario().equals(castOther.getGrusCdUsuario()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getUniId() == null ? 0 : this.getUniId().hashCode() );
         result = 37 * result + ( getGrusCdUsuario() == null ? 0 : this.getGrusCdUsuario().hashCode() );
         return result;
   }   


}


