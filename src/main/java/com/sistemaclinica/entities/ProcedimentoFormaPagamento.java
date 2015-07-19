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
 * ProcedimentoFormaPagamento generated by hbm2java
 */
@Entity
@Table(name="PROCEDIMENTO_FORMA_PAGAMENTO"
    ,schema="DESENV"
)
public class ProcedimentoFormaPagamento  implements java.io.Serializable {


     private ProcedimentoFormaPagamentoId id;
     private FormaPagamento formaPagamento;
     private ProcedimentoPaciente procedimentoPaciente;
     private Empresa empresa;
     private BigDecimal cdCriadoPor;
     private Date dtCriacao;
     private BigDecimal cdAlteradoPor;
     private Date dtUltimaAlteracao;

    public ProcedimentoFormaPagamento() {
    }

	
    public ProcedimentoFormaPagamento(ProcedimentoFormaPagamentoId id, FormaPagamento formaPagamento, ProcedimentoPaciente procedimentoPaciente, Empresa empresa) {
        this.id = id;
        this.formaPagamento = formaPagamento;
        this.procedimentoPaciente = procedimentoPaciente;
        this.empresa = empresa;
    }
    public ProcedimentoFormaPagamento(ProcedimentoFormaPagamentoId id, FormaPagamento formaPagamento, ProcedimentoPaciente procedimentoPaciente, Empresa empresa, BigDecimal cdCriadoPor, Date dtCriacao, BigDecimal cdAlteradoPor, Date dtUltimaAlteracao) {
       this.id = id;
       this.formaPagamento = formaPagamento;
       this.procedimentoPaciente = procedimentoPaciente;
       this.empresa = empresa;
       this.cdCriadoPor = cdCriadoPor;
       this.dtCriacao = dtCriacao;
       this.cdAlteradoPor = cdAlteradoPor;
       this.dtUltimaAlteracao = dtUltimaAlteracao;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="propacId", column=@Column(name="PROPAC_ID", nullable=false, precision=22, scale=0) ), 
        @AttributeOverride(name="forpaId", column=@Column(name="FORPA_ID", nullable=false, precision=22, scale=0) ) } )
    public ProcedimentoFormaPagamentoId getId() {
        return this.id;
    }
    
    public void setId(ProcedimentoFormaPagamentoId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="FORPA_ID", nullable=false, insertable=false, updatable=false)
    public FormaPagamento getFormaPagamento() {
        return this.formaPagamento;
    }
    
    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="PROPAC_ID", nullable=false, insertable=false, updatable=false)
    public ProcedimentoPaciente getProcedimentoPaciente() {
        return this.procedimentoPaciente;
    }
    
    public void setProcedimentoPaciente(ProcedimentoPaciente procedimentoPaciente) {
        this.procedimentoPaciente = procedimentoPaciente;
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




}

