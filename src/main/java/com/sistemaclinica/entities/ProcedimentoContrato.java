package com.sistemaclinica.entities;
// Generated 09/07/2015 17:16:10 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ProcedimentoContrato generated by hbm2java
 */
@Entity
@Table(name="PROCEDIMENTO_CONTRATO"
    ,schema="DESENV"
)
public class ProcedimentoContrato  implements java.io.Serializable {


     private BigDecimal id;
     private Contrato contrato;
     private ListaRegiaoProcedimento listaRegiaoProcedimento;
     private Procedimento procedimento;
     private Empresa empresa;
     private BigDecimal valor;
     private BigDecimal valorEncargos;
     private BigDecimal cdCriadoPor;
     private Date dtCriacao;
     private BigDecimal cdAlteradoPor;
     private Date dtUltimaAlteracao;

    public ProcedimentoContrato() {
    }

	
    public ProcedimentoContrato(BigDecimal id, Contrato contrato, Procedimento procedimento, Empresa empresa, BigDecimal valor, BigDecimal valorEncargos) {
        this.id = id;
        this.contrato = contrato;
        this.procedimento = procedimento;
        this.empresa = empresa;
        this.valor = valor;
        this.valorEncargos = valorEncargos;
    }
    public ProcedimentoContrato(BigDecimal id, Contrato contrato, ListaRegiaoProcedimento listaRegiaoProcedimento, Procedimento procedimento, Empresa empresa, BigDecimal valor, BigDecimal valorEncargos, BigDecimal cdCriadoPor, Date dtCriacao, BigDecimal cdAlteradoPor, Date dtUltimaAlteracao) {
       this.id = id;
       this.contrato = contrato;
       this.listaRegiaoProcedimento = listaRegiaoProcedimento;
       this.procedimento = procedimento;
       this.empresa = empresa;
       this.valor = valor;
       this.valorEncargos = valorEncargos;
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
    @JoinColumn(name="CONT_ID", nullable=false)
    public Contrato getContrato() {
        return this.contrato;
    }
    
    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumns( { 
        @JoinColumn(name="LIREP_REGIAO", referencedColumnName="REGIAO"), 
        @JoinColumn(name="LIREP_REGP_ID", referencedColumnName="REGP_ID") } )
    public ListaRegiaoProcedimento getListaRegiaoProcedimento() {
        return this.listaRegiaoProcedimento;
    }
    
    public void setListaRegiaoProcedimento(ListaRegiaoProcedimento listaRegiaoProcedimento) {
        this.listaRegiaoProcedimento = listaRegiaoProcedimento;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="PROC_ID", nullable=false)
    public Procedimento getProcedimento() {
        return this.procedimento;
    }
    
    public void setProcedimento(Procedimento procedimento) {
        this.procedimento = procedimento;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="EMP_ID", nullable=false)
    public Empresa getEmpresa() {
        return this.empresa;
    }
    
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    
    @Column(name="VALOR", nullable=false, precision=17)
    public BigDecimal getValor() {
        return this.valor;
    }
    
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    
    @Column(name="VALOR_ENCARGOS", nullable=false, precision=17)
    public BigDecimal getValorEncargos() {
        return this.valorEncargos;
    }
    
    public void setValorEncargos(BigDecimal valorEncargos) {
        this.valorEncargos = valorEncargos;
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


