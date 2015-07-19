package com.sistemaclinica.entities;
// Generated 09/07/2015 17:16:10 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * UsuGrupoTelaRelGraId generated by hbm2java
 */
@Embeddable
public class UsuGrupoTelaRelGraId  implements java.io.Serializable {


     private BigDecimal grusCdUsuario;
     private BigDecimal tereCdTelaRelatorio;

    public UsuGrupoTelaRelGraId() {
    }

    public UsuGrupoTelaRelGraId(BigDecimal grusCdUsuario, BigDecimal tereCdTelaRelatorio) {
       this.grusCdUsuario = grusCdUsuario;
       this.tereCdTelaRelatorio = tereCdTelaRelatorio;
    }
   


    @Column(name="GRUS_CD_USUARIO", nullable=false, precision=22, scale=0)
    public BigDecimal getGrusCdUsuario() {
        return this.grusCdUsuario;
    }
    
    public void setGrusCdUsuario(BigDecimal grusCdUsuario) {
        this.grusCdUsuario = grusCdUsuario;
    }


    @Column(name="TERE_CD_TELA_RELATORIO", nullable=false, precision=22, scale=0)
    public BigDecimal getTereCdTelaRelatorio() {
        return this.tereCdTelaRelatorio;
    }
    
    public void setTereCdTelaRelatorio(BigDecimal tereCdTelaRelatorio) {
        this.tereCdTelaRelatorio = tereCdTelaRelatorio;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof UsuGrupoTelaRelGraId) ) return false;
		 UsuGrupoTelaRelGraId castOther = ( UsuGrupoTelaRelGraId ) other; 
         
		 return ( (this.getGrusCdUsuario()==castOther.getGrusCdUsuario()) || ( this.getGrusCdUsuario()!=null && castOther.getGrusCdUsuario()!=null && this.getGrusCdUsuario().equals(castOther.getGrusCdUsuario()) ) )
 && ( (this.getTereCdTelaRelatorio()==castOther.getTereCdTelaRelatorio()) || ( this.getTereCdTelaRelatorio()!=null && castOther.getTereCdTelaRelatorio()!=null && this.getTereCdTelaRelatorio().equals(castOther.getTereCdTelaRelatorio()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getGrusCdUsuario() == null ? 0 : this.getGrusCdUsuario().hashCode() );
         result = 37 * result + ( getTereCdTelaRelatorio() == null ? 0 : this.getTereCdTelaRelatorio().hashCode() );
         return result;
   }   


}

