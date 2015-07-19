package com.sistemaclinica.entities;
// Generated 09/07/2015 17:16:10 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * AgeConjuntoValidacao generated by hbm2java
 */
@Entity
@Table(name="AGE_CONJUNTO_VALIDACAO"
    ,schema="DESENV"
)
public class AgeConjuntoValidacao  implements java.io.Serializable {


     private AgeConjuntoValidacaoId id;
     private AgeValidacao ageValidacao;
     private String dsConjuntoValidacao;
     private BigDecimal cdCriadoPor;
     private BigDecimal cdAlteradoPor;
     private Date dtCriacao;
     private Date dtUltimaAlteracao;

    public AgeConjuntoValidacao() {
    }

	
    public AgeConjuntoValidacao(AgeConjuntoValidacaoId id, AgeValidacao ageValidacao, BigDecimal cdCriadoPor, BigDecimal cdAlteradoPor, Date dtCriacao, Date dtUltimaAlteracao) {
        this.id = id;
        this.ageValidacao = ageValidacao;
        this.cdCriadoPor = cdCriadoPor;
        this.cdAlteradoPor = cdAlteradoPor;
        this.dtCriacao = dtCriacao;
        this.dtUltimaAlteracao = dtUltimaAlteracao;
    }
    public AgeConjuntoValidacao(AgeConjuntoValidacaoId id, AgeValidacao ageValidacao, String dsConjuntoValidacao, BigDecimal cdCriadoPor, BigDecimal cdAlteradoPor, Date dtCriacao, Date dtUltimaAlteracao) {
       this.id = id;
       this.ageValidacao = ageValidacao;
       this.dsConjuntoValidacao = dsConjuntoValidacao;
       this.cdCriadoPor = cdCriadoPor;
       this.cdAlteradoPor = cdAlteradoPor;
       this.dtCriacao = dtCriacao;
       this.dtUltimaAlteracao = dtUltimaAlteracao;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="cdConjuntoValidacao", column=@Column(name="CD_CONJUNTO_VALIDACAO", nullable=false, length=30) ), 
        @AttributeOverride(name="validaCdValidacao", column=@Column(name="VALIDA_CD_VALIDACAO", nullable=false, precision=22, scale=0) ) } )
    public AgeConjuntoValidacaoId getId() {
        return this.id;
    }
    
    public void setId(AgeConjuntoValidacaoId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="VALIDA_CD_VALIDACAO", nullable=false, insertable=false, updatable=false)
    public AgeValidacao getAgeValidacao() {
        return this.ageValidacao;
    }
    
    public void setAgeValidacao(AgeValidacao ageValidacao) {
        this.ageValidacao = ageValidacao;
    }

    
    @Column(name="DS_CONJUNTO_VALIDACAO", length=200)
    public String getDsConjuntoValidacao() {
        return this.dsConjuntoValidacao;
    }
    
    public void setDsConjuntoValidacao(String dsConjuntoValidacao) {
        this.dsConjuntoValidacao = dsConjuntoValidacao;
    }

    
    @Column(name="CD_CRIADO_POR", nullable=false, precision=22, scale=0)
    public BigDecimal getCdCriadoPor() {
        return this.cdCriadoPor;
    }
    
    public void setCdCriadoPor(BigDecimal cdCriadoPor) {
        this.cdCriadoPor = cdCriadoPor;
    }

    
    @Column(name="CD_ALTERADO_POR", nullable=false, precision=22, scale=0)
    public BigDecimal getCdAlteradoPor() {
        return this.cdAlteradoPor;
    }
    
    public void setCdAlteradoPor(BigDecimal cdAlteradoPor) {
        this.cdAlteradoPor = cdAlteradoPor;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="DT_CRIACAO", nullable=false, length=7)
    public Date getDtCriacao() {
        return this.dtCriacao;
    }
    
    public void setDtCriacao(Date dtCriacao) {
        this.dtCriacao = dtCriacao;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="DT_ULTIMA_ALTERACAO", nullable=false, length=7)
    public Date getDtUltimaAlteracao() {
        return this.dtUltimaAlteracao;
    }
    
    public void setDtUltimaAlteracao(Date dtUltimaAlteracao) {
        this.dtUltimaAlteracao = dtUltimaAlteracao;
    }




}

