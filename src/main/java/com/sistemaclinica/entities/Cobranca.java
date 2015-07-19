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
 * Cobranca generated by hbm2java
 */
@Entity
@Table(name="COBRANCA"
    ,schema="DESENV"
)
public class Cobranca  implements java.io.Serializable {


     private CobrancaId id;
     private Contrato contrato;
     private Empresa empresa;
     private Date dtVencimento;
     private BigDecimal valor;
     private BigDecimal valorPago;
     private BigDecimal valorSaldoDevedor;
     private BigDecimal valorPrincipalAmortizado;
     private BigDecimal valorEncargo;
     private BigDecimal cdCriadoPor;
     private Date dtCriacao;
     private BigDecimal cdAlteradoPor;
     private Date dtUltimaAlteracao;
     private BigDecimal valorAjuste;
     private Set pagamentoCobrancas = new HashSet(0);
     private Set tituloses = new HashSet(0);

    public Cobranca() {
    }

	
    public Cobranca(CobrancaId id, Contrato contrato, Empresa empresa, Date dtVencimento, BigDecimal valor, BigDecimal valorPago, BigDecimal valorEncargo, BigDecimal valorAjuste) {
        this.id = id;
        this.contrato = contrato;
        this.empresa = empresa;
        this.dtVencimento = dtVencimento;
        this.valor = valor;
        this.valorPago = valorPago;
        this.valorEncargo = valorEncargo;
        this.valorAjuste = valorAjuste;
    }
    public Cobranca(CobrancaId id, Contrato contrato, Empresa empresa, Date dtVencimento, BigDecimal valor, BigDecimal valorPago, BigDecimal valorSaldoDevedor, BigDecimal valorPrincipalAmortizado, BigDecimal valorEncargo, BigDecimal cdCriadoPor, Date dtCriacao, BigDecimal cdAlteradoPor, Date dtUltimaAlteracao, BigDecimal valorAjuste, Set pagamentoCobrancas, Set tituloses) {
       this.id = id;
       this.contrato = contrato;
       this.empresa = empresa;
       this.dtVencimento = dtVencimento;
       this.valor = valor;
       this.valorPago = valorPago;
       this.valorSaldoDevedor = valorSaldoDevedor;
       this.valorPrincipalAmortizado = valorPrincipalAmortizado;
       this.valorEncargo = valorEncargo;
       this.cdCriadoPor = cdCriadoPor;
       this.dtCriacao = dtCriacao;
       this.cdAlteradoPor = cdAlteradoPor;
       this.dtUltimaAlteracao = dtUltimaAlteracao;
       this.valorAjuste = valorAjuste;
       this.pagamentoCobrancas = pagamentoCobrancas;
       this.tituloses = tituloses;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="parcela", column=@Column(name="PARCELA", nullable=false, precision=22, scale=0) ), 
        @AttributeOverride(name="contId", column=@Column(name="CONT_ID", nullable=false, precision=22, scale=0) ) } )
    public CobrancaId getId() {
        return this.id;
    }
    
    public void setId(CobrancaId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CONT_ID", nullable=false, insertable=false, updatable=false)
    public Contrato getContrato() {
        return this.contrato;
    }
    
    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
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
    @Column(name="DT_VENCIMENTO", nullable=false, length=7)
    public Date getDtVencimento() {
        return this.dtVencimento;
    }
    
    public void setDtVencimento(Date dtVencimento) {
        this.dtVencimento = dtVencimento;
    }

    
    @Column(name="VALOR", nullable=false, precision=17)
    public BigDecimal getValor() {
        return this.valor;
    }
    
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    
    @Column(name="VALOR_PAGO", nullable=false, precision=17)
    public BigDecimal getValorPago() {
        return this.valorPago;
    }
    
    public void setValorPago(BigDecimal valorPago) {
        this.valorPago = valorPago;
    }

    
    @Column(name="VALOR_SALDO_DEVEDOR", precision=17)
    public BigDecimal getValorSaldoDevedor() {
        return this.valorSaldoDevedor;
    }
    
    public void setValorSaldoDevedor(BigDecimal valorSaldoDevedor) {
        this.valorSaldoDevedor = valorSaldoDevedor;
    }

    
    @Column(name="VALOR_PRINCIPAL_AMORTIZADO", precision=17)
    public BigDecimal getValorPrincipalAmortizado() {
        return this.valorPrincipalAmortizado;
    }
    
    public void setValorPrincipalAmortizado(BigDecimal valorPrincipalAmortizado) {
        this.valorPrincipalAmortizado = valorPrincipalAmortizado;
    }

    
    @Column(name="VALOR_ENCARGO", nullable=false, precision=17)
    public BigDecimal getValorEncargo() {
        return this.valorEncargo;
    }
    
    public void setValorEncargo(BigDecimal valorEncargo) {
        this.valorEncargo = valorEncargo;
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

    
    @Column(name="VALOR_AJUSTE", nullable=false, precision=17)
    public BigDecimal getValorAjuste() {
        return this.valorAjuste;
    }
    
    public void setValorAjuste(BigDecimal valorAjuste) {
        this.valorAjuste = valorAjuste;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="cobranca")
    public Set getPagamentoCobrancas() {
        return this.pagamentoCobrancas;
    }
    
    public void setPagamentoCobrancas(Set pagamentoCobrancas) {
        this.pagamentoCobrancas = pagamentoCobrancas;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="cobranca")
    public Set getTituloses() {
        return this.tituloses;
    }
    
    public void setTituloses(Set tituloses) {
        this.tituloses = tituloses;
    }




}


