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
 * ProvisaoReceita generated by hbm2java
 */
@Entity
@Table(name="PROVISAO_RECEITA"
    ,schema="DESENV"
    , uniqueConstraints = @UniqueConstraint(columnNames={"DT_RECEITA", "PAGPAC_ID"}) 
)
public class ProvisaoReceita  implements java.io.Serializable {


     private BigDecimal id;
     private PagamentoPaciente pagamentoPaciente;
     private Empresa empresa;
     private Date dtReceita;
     private short nuParcela;
     private BigDecimal valorBruto;
     private BigDecimal valorLiquido;
     private BigDecimal cdCriadoPor;
     private Date dtCriacao;
     private BigDecimal cdAlteradoPor;
     private Date dtUltimaAlteracao;

    public ProvisaoReceita() {
    }

	
    public ProvisaoReceita(BigDecimal id, PagamentoPaciente pagamentoPaciente, Empresa empresa, Date dtReceita, short nuParcela, BigDecimal valorBruto, BigDecimal valorLiquido) {
        this.id = id;
        this.pagamentoPaciente = pagamentoPaciente;
        this.empresa = empresa;
        this.dtReceita = dtReceita;
        this.nuParcela = nuParcela;
        this.valorBruto = valorBruto;
        this.valorLiquido = valorLiquido;
    }
    public ProvisaoReceita(BigDecimal id, PagamentoPaciente pagamentoPaciente, Empresa empresa, Date dtReceita, short nuParcela, BigDecimal valorBruto, BigDecimal valorLiquido, BigDecimal cdCriadoPor, Date dtCriacao, BigDecimal cdAlteradoPor, Date dtUltimaAlteracao) {
       this.id = id;
       this.pagamentoPaciente = pagamentoPaciente;
       this.empresa = empresa;
       this.dtReceita = dtReceita;
       this.nuParcela = nuParcela;
       this.valorBruto = valorBruto;
       this.valorLiquido = valorLiquido;
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
    @JoinColumn(name="PAGPAC_ID", nullable=false)
    public PagamentoPaciente getPagamentoPaciente() {
        return this.pagamentoPaciente;
    }
    
    public void setPagamentoPaciente(PagamentoPaciente pagamentoPaciente) {
        this.pagamentoPaciente = pagamentoPaciente;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="EMP_ID", nullable=false)
    public Empresa getEmpresa() {
        return this.empresa;
    }
    
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="DT_RECEITA", nullable=false, length=7)
    public Date getDtReceita() {
        return this.dtReceita;
    }
    
    public void setDtReceita(Date dtReceita) {
        this.dtReceita = dtReceita;
    }

    
    @Column(name="NU_PARCELA", nullable=false, precision=3, scale=0)
    public short getNuParcela() {
        return this.nuParcela;
    }
    
    public void setNuParcela(short nuParcela) {
        this.nuParcela = nuParcela;
    }

    
    @Column(name="VALOR_BRUTO", nullable=false, precision=15)
    public BigDecimal getValorBruto() {
        return this.valorBruto;
    }
    
    public void setValorBruto(BigDecimal valorBruto) {
        this.valorBruto = valorBruto;
    }

    
    @Column(name="VALOR_LIQUIDO", nullable=false, precision=15)
    public BigDecimal getValorLiquido() {
        return this.valorLiquido;
    }
    
    public void setValorLiquido(BigDecimal valorLiquido) {
        this.valorLiquido = valorLiquido;
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

