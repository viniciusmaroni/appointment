package com.sistemaclinica.entities;
// Generated 09/07/2015 17:16:10 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * MovimentacaoCheque generated by hbm2java
 */
@Entity
@Table(name="MOVIMENTACAO_CHEQUE"
    ,schema="DESENV"
)
public class MovimentacaoCheque  implements java.io.Serializable {


     private MovimentacaoChequeId id;
     private Cheque cheque;
     private Fornecedor fornecedor;
     private Portador portador;
     private SituacaoCheque situacaoCheque;
     private Empresa empresa;
     private BigDecimal cdCriadoPor;
     private Date dtCriacao;
     private BigDecimal cdAlteradoPor;
     private Date dtUltimaAlteracao;
     private Set movimentoCaixas = new HashSet(0);

    public MovimentacaoCheque() {
    }

	
    public MovimentacaoCheque(MovimentacaoChequeId id, Cheque cheque, Portador portador, SituacaoCheque situacaoCheque, Empresa empresa) {
        this.id = id;
        this.cheque = cheque;
        this.portador = portador;
        this.situacaoCheque = situacaoCheque;
        this.empresa = empresa;
    }
    public MovimentacaoCheque(MovimentacaoChequeId id, Cheque cheque, Fornecedor fornecedor, Portador portador, SituacaoCheque situacaoCheque, Empresa empresa, BigDecimal cdCriadoPor, Date dtCriacao, BigDecimal cdAlteradoPor, Date dtUltimaAlteracao, Set movimentoCaixas) {
       this.id = id;
       this.cheque = cheque;
       this.fornecedor = fornecedor;
       this.portador = portador;
       this.situacaoCheque = situacaoCheque;
       this.empresa = empresa;
       this.cdCriadoPor = cdCriadoPor;
       this.dtCriacao = dtCriacao;
       this.cdAlteradoPor = cdAlteradoPor;
       this.dtUltimaAlteracao = dtUltimaAlteracao;
       this.movimentoCaixas = movimentoCaixas;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="cheId", column=@Column(name="CHE_ID", nullable=false, precision=22, scale=0) ), 
        @AttributeOverride(name="dtMovimentacao", column=@Column(name="DT_MOVIMENTACAO", nullable=false, length=7) ) } )
    public MovimentacaoChequeId getId() {
        return this.id;
    }
    
    public void setId(MovimentacaoChequeId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CHE_ID", nullable=false, insertable=false, updatable=false)
    public Cheque getCheque() {
        return this.cheque;
    }
    
    public void setCheque(Cheque cheque) {
        this.cheque = cheque;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="FORN_ID")
    public Fornecedor getFornecedor() {
        return this.fornecedor;
    }
    
    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="POR_ID", nullable=false)
    public Portador getPortador() {
        return this.portador;
    }
    
    public void setPortador(Portador portador) {
        this.portador = portador;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="SICHE_ID", nullable=false)
    public SituacaoCheque getSituacaoCheque() {
        return this.situacaoCheque;
    }
    
    public void setSituacaoCheque(SituacaoCheque situacaoCheque) {
        this.situacaoCheque = situacaoCheque;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="EMP_ID", nullable=false)
    public Empresa getEmpresa() {
        return this.empresa;
    }
    
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="movimentacaoCheque")
    public Set getMovimentoCaixas() {
        return this.movimentoCaixas;
    }
    
    public void setMovimentoCaixas(Set movimentoCaixas) {
        this.movimentoCaixas = movimentoCaixas;
    }




}


