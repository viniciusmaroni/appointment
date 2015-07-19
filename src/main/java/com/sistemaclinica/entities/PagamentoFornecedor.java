package com.sistemaclinica.entities;
// Generated 09/07/2015 17:16:10 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PagamentoFornecedor generated by hbm2java
 */
@Entity
@Table(name="PAGAMENTO_FORNECEDOR"
    ,schema="DESENV"
)
public class PagamentoFornecedor  implements java.io.Serializable {


     private BigDecimal id;
     private Conta conta;
     private Fornecedor fornecedor;
     private Empresa empresa;
     private Date data;
     private BigDecimal valorPago;
     private BigDecimal valorAplicado;
     private String flAplicado;
     private BigDecimal cdCriadoPor;
     private BigDecimal cdAlteradoPor;
     private Date dtCriacao;
     private Date dtUltimaAlteracao;
     private Set pagamentoNotaFiscals = new HashSet(0);

    public PagamentoFornecedor() {
    }

	
    public PagamentoFornecedor(BigDecimal id, Conta conta, Fornecedor fornecedor, Empresa empresa, Date data, BigDecimal valorPago, BigDecimal valorAplicado, String flAplicado) {
        this.id = id;
        this.conta = conta;
        this.fornecedor = fornecedor;
        this.empresa = empresa;
        this.data = data;
        this.valorPago = valorPago;
        this.valorAplicado = valorAplicado;
        this.flAplicado = flAplicado;
    }
    public PagamentoFornecedor(BigDecimal id, Conta conta, Fornecedor fornecedor, Empresa empresa, Date data, BigDecimal valorPago, BigDecimal valorAplicado, String flAplicado, BigDecimal cdCriadoPor, BigDecimal cdAlteradoPor, Date dtCriacao, Date dtUltimaAlteracao, Set pagamentoNotaFiscals) {
       this.id = id;
       this.conta = conta;
       this.fornecedor = fornecedor;
       this.empresa = empresa;
       this.data = data;
       this.valorPago = valorPago;
       this.valorAplicado = valorAplicado;
       this.flAplicado = flAplicado;
       this.cdCriadoPor = cdCriadoPor;
       this.cdAlteradoPor = cdAlteradoPor;
       this.dtCriacao = dtCriacao;
       this.dtUltimaAlteracao = dtUltimaAlteracao;
       this.pagamentoNotaFiscals = pagamentoNotaFiscals;
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
    @JoinColumn(name="CON_ID", nullable=false)
    public Conta getConta() {
        return this.conta;
    }
    
    public void setConta(Conta conta) {
        this.conta = conta;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="FORN_ID", nullable=false)
    public Fornecedor getFornecedor() {
        return this.fornecedor;
    }
    
    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
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
    @Column(name="DATA", nullable=false, length=7)
    public Date getData() {
        return this.data;
    }
    
    public void setData(Date data) {
        this.data = data;
    }

    
    @Column(name="VALOR_PAGO", nullable=false, precision=15)
    public BigDecimal getValorPago() {
        return this.valorPago;
    }
    
    public void setValorPago(BigDecimal valorPago) {
        this.valorPago = valorPago;
    }

    
    @Column(name="VALOR_APLICADO", nullable=false, precision=15)
    public BigDecimal getValorAplicado() {
        return this.valorAplicado;
    }
    
    public void setValorAplicado(BigDecimal valorAplicado) {
        this.valorAplicado = valorAplicado;
    }

    
    @Column(name="FL_APLICADO", nullable=false, length=1)
    public String getFlAplicado() {
        return this.flAplicado;
    }
    
    public void setFlAplicado(String flAplicado) {
        this.flAplicado = flAplicado;
    }

    
    @Column(name="CD_CRIADO_POR", precision=22, scale=0)
    public BigDecimal getCdCriadoPor() {
        return this.cdCriadoPor;
    }
    
    public void setCdCriadoPor(BigDecimal cdCriadoPor) {
        this.cdCriadoPor = cdCriadoPor;
    }

    
    @Column(name="CD_ALTERADO_POR", precision=22, scale=0)
    public BigDecimal getCdAlteradoPor() {
        return this.cdAlteradoPor;
    }
    
    public void setCdAlteradoPor(BigDecimal cdAlteradoPor) {
        this.cdAlteradoPor = cdAlteradoPor;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="DT_CRIACAO", length=7)
    public Date getDtCriacao() {
        return this.dtCriacao;
    }
    
    public void setDtCriacao(Date dtCriacao) {
        this.dtCriacao = dtCriacao;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="DT_ULTIMA_ALTERACAO", length=7)
    public Date getDtUltimaAlteracao() {
        return this.dtUltimaAlteracao;
    }
    
    public void setDtUltimaAlteracao(Date dtUltimaAlteracao) {
        this.dtUltimaAlteracao = dtUltimaAlteracao;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="pagamentoFornecedor")
    public Set getPagamentoNotaFiscals() {
        return this.pagamentoNotaFiscals;
    }
    
    public void setPagamentoNotaFiscals(Set pagamentoNotaFiscals) {
        this.pagamentoNotaFiscals = pagamentoNotaFiscals;
    }




}

