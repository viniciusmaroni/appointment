package com.sistemaclinica.entities;
// Generated 09/07/2015 17:16:10 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * ComposicaoPagamentoProf generated by hbm2java
 */
@Entity
@Table(name="COMPOSICAO_PAGAMENTO_PROF"
    ,schema="DESENV"
    , uniqueConstraints = @UniqueConstraint(columnNames={"GUIA_ID", "PROPAC_ID"}) 
)
public class ComposicaoPagamentoProf  implements java.io.Serializable {


     private BigDecimal id;
     private GuiaPaciente guiaPaciente;
     private PagamentoProfissional pagamentoProfissional;
     private ProcedimentoPaciente procedimentoPaciente;
     private Empresa empresa;
     private BigDecimal cdCriadoPor;
     private Date dtCriacao;
     private BigDecimal cdAlteradoPor;
     private Date dtUltimaAlteracao;

    public ComposicaoPagamentoProf() {
    }

	
    public ComposicaoPagamentoProf(BigDecimal id, PagamentoProfissional pagamentoProfissional, Empresa empresa) {
        this.id = id;
        this.pagamentoProfissional = pagamentoProfissional;
        this.empresa = empresa;
    }
    public ComposicaoPagamentoProf(BigDecimal id, GuiaPaciente guiaPaciente, PagamentoProfissional pagamentoProfissional, ProcedimentoPaciente procedimentoPaciente, Empresa empresa, BigDecimal cdCriadoPor, Date dtCriacao, BigDecimal cdAlteradoPor, Date dtUltimaAlteracao) {
       this.id = id;
       this.guiaPaciente = guiaPaciente;
       this.pagamentoProfissional = pagamentoProfissional;
       this.procedimentoPaciente = procedimentoPaciente;
       this.empresa = empresa;
       this.cdCriadoPor = cdCriadoPor;
       this.dtCriacao = dtCriacao;
       this.cdAlteradoPor = cdAlteradoPor;
       this.dtUltimaAlteracao = dtUltimaAlteracao;
    }
   
     @Id 

    
    @Column(name="ID", unique=true, nullable=false, precision=22, scale=0)
    public BigDecimal getId() {
        return this.id;
    }
    
    public void setId(BigDecimal id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="GUIA_ID")
    public GuiaPaciente getGuiaPaciente() {
        return this.guiaPaciente;
    }
    
    public void setGuiaPaciente(GuiaPaciente guiaPaciente) {
        this.guiaPaciente = guiaPaciente;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="PAGPRO_ID", nullable=false)
    public PagamentoProfissional getPagamentoProfissional() {
        return this.pagamentoProfissional;
    }
    
    public void setPagamentoProfissional(PagamentoProfissional pagamentoProfissional) {
        this.pagamentoProfissional = pagamentoProfissional;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="PROPAC_ID")
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

