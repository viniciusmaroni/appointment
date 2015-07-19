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
 * ProximaSituacaoCheque generated by hbm2java
 */
@Entity
@Table(name="PROXIMA_SITUACAO_CHEQUE"
    ,schema="DESENV"
)
public class ProximaSituacaoCheque  implements java.io.Serializable {


     private ProximaSituacaoChequeId id;
     private SituacaoCheque situacaoChequeBySicheId;
     private SituacaoCheque situacaoChequeBySicheIdProxima;
     private Empresa empresa;
     private char flMudaPortador;
     private BigDecimal cdCriadoPor;
     private Date dtCriacao;
     private BigDecimal cdAlteradoPor;
     private Date dtUltimaAlteracao;

    public ProximaSituacaoCheque() {
    }

	
    public ProximaSituacaoCheque(ProximaSituacaoChequeId id, SituacaoCheque situacaoChequeBySicheId, SituacaoCheque situacaoChequeBySicheIdProxima, Empresa empresa, char flMudaPortador) {
        this.id = id;
        this.situacaoChequeBySicheId = situacaoChequeBySicheId;
        this.situacaoChequeBySicheIdProxima = situacaoChequeBySicheIdProxima;
        this.empresa = empresa;
        this.flMudaPortador = flMudaPortador;
    }
    public ProximaSituacaoCheque(ProximaSituacaoChequeId id, SituacaoCheque situacaoChequeBySicheId, SituacaoCheque situacaoChequeBySicheIdProxima, Empresa empresa, char flMudaPortador, BigDecimal cdCriadoPor, Date dtCriacao, BigDecimal cdAlteradoPor, Date dtUltimaAlteracao) {
       this.id = id;
       this.situacaoChequeBySicheId = situacaoChequeBySicheId;
       this.situacaoChequeBySicheIdProxima = situacaoChequeBySicheIdProxima;
       this.empresa = empresa;
       this.flMudaPortador = flMudaPortador;
       this.cdCriadoPor = cdCriadoPor;
       this.dtCriacao = dtCriacao;
       this.cdAlteradoPor = cdAlteradoPor;
       this.dtUltimaAlteracao = dtUltimaAlteracao;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="sicheIdProxima", column=@Column(name="SICHE_ID_PROXIMA", nullable=false, precision=22, scale=0) ), 
        @AttributeOverride(name="sicheId", column=@Column(name="SICHE_ID", nullable=false, precision=22, scale=0) ) } )
    public ProximaSituacaoChequeId getId() {
        return this.id;
    }
    
    public void setId(ProximaSituacaoChequeId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="SICHE_ID", nullable=false, insertable=false, updatable=false)
    public SituacaoCheque getSituacaoChequeBySicheId() {
        return this.situacaoChequeBySicheId;
    }
    
    public void setSituacaoChequeBySicheId(SituacaoCheque situacaoChequeBySicheId) {
        this.situacaoChequeBySicheId = situacaoChequeBySicheId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="SICHE_ID_PROXIMA", nullable=false, insertable=false, updatable=false)
    public SituacaoCheque getSituacaoChequeBySicheIdProxima() {
        return this.situacaoChequeBySicheIdProxima;
    }
    
    public void setSituacaoChequeBySicheIdProxima(SituacaoCheque situacaoChequeBySicheIdProxima) {
        this.situacaoChequeBySicheIdProxima = situacaoChequeBySicheIdProxima;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="EMP_ID", nullable=false)
    public Empresa getEmpresa() {
        return this.empresa;
    }
    
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    
    @Column(name="FL_MUDA_PORTADOR", nullable=false, length=1)
    public char getFlMudaPortador() {
        return this.flMudaPortador;
    }
    
    public void setFlMudaPortador(char flMudaPortador) {
        this.flMudaPortador = flMudaPortador;
    }

    
    @Column(name="CD_CRIADO_POR", precision=22, scale=0)
    public BigDecimal getCdCriadoPor() {
        return this.cdCriadoPor;
    }
    
    public void setCdCriadoPor(BigDecimal cdCriadoPor) {
        this.cdCriadoPor = cdCriadoPor;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="DT_CRIACAO", length=7)
    public Date getDtCriacao() {
        return this.dtCriacao;
    }
    
    public void setDtCriacao(Date dtCriacao) {
        this.dtCriacao = dtCriacao;
    }

    
    @Column(name="CD_ALTERADO_POR", precision=22, scale=0)
    public BigDecimal getCdAlteradoPor() {
        return this.cdAlteradoPor;
    }
    
    public void setCdAlteradoPor(BigDecimal cdAlteradoPor) {
        this.cdAlteradoPor = cdAlteradoPor;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="DT_ULTIMA_ALTERACAO", length=7)
    public Date getDtUltimaAlteracao() {
        return this.dtUltimaAlteracao;
    }
    
    public void setDtUltimaAlteracao(Date dtUltimaAlteracao) {
        this.dtUltimaAlteracao = dtUltimaAlteracao;
    }




}

