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
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PagamentoNotaFiscal generated by hbm2java
 */
@Entity
@Table(name="PAGAMENTO_NOTA_FISCAL"
    ,schema="DESENV"
)
public class PagamentoNotaFiscal  implements java.io.Serializable {


     private PagamentoNotaFiscalId id;
     private PagamentoFornecedor pagamentoFornecedor;
     private ProgramacaoPagamentoNf programacaoPagamentoNf;
     private Empresa empresa;
     private BigDecimal valorPago;
     private BigDecimal valorEncargo;
     private BigDecimal cdCriadoPor;
     private BigDecimal cdAlteradoPor;
     private Date dtCriacao;
     private Date dtUltimaAlteracao;
     private Set movimentoCaixas = new HashSet(0);

    public PagamentoNotaFiscal() {
    }

	
    public PagamentoNotaFiscal(PagamentoNotaFiscalId id, PagamentoFornecedor pagamentoFornecedor, ProgramacaoPagamentoNf programacaoPagamentoNf, Empresa empresa, BigDecimal valorPago, BigDecimal valorEncargo) {
        this.id = id;
        this.pagamentoFornecedor = pagamentoFornecedor;
        this.programacaoPagamentoNf = programacaoPagamentoNf;
        this.empresa = empresa;
        this.valorPago = valorPago;
        this.valorEncargo = valorEncargo;
    }
    public PagamentoNotaFiscal(PagamentoNotaFiscalId id, PagamentoFornecedor pagamentoFornecedor, ProgramacaoPagamentoNf programacaoPagamentoNf, Empresa empresa, BigDecimal valorPago, BigDecimal valorEncargo, BigDecimal cdCriadoPor, BigDecimal cdAlteradoPor, Date dtCriacao, Date dtUltimaAlteracao, Set movimentoCaixas) {
       this.id = id;
       this.pagamentoFornecedor = pagamentoFornecedor;
       this.programacaoPagamentoNf = programacaoPagamentoNf;
       this.empresa = empresa;
       this.valorPago = valorPago;
       this.valorEncargo = valorEncargo;
       this.cdCriadoPor = cdCriadoPor;
       this.cdAlteradoPor = cdAlteradoPor;
       this.dtCriacao = dtCriacao;
       this.dtUltimaAlteracao = dtUltimaAlteracao;
       this.movimentoCaixas = movimentoCaixas;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="pagforId", column=@Column(name="PAGFOR_ID", nullable=false, precision=22, scale=0) ), 
        @AttributeOverride(name="pronfParcela", column=@Column(name="PRONF_PARCELA", nullable=false, precision=22, scale=0) ), 
        @AttributeOverride(name="pronfNfId", column=@Column(name="PRONF_NF_ID", nullable=false, precision=22, scale=0) ) } )
    public PagamentoNotaFiscalId getId() {
        return this.id;
    }
    
    public void setId(PagamentoNotaFiscalId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="PAGFOR_ID", nullable=false, insertable=false, updatable=false)
    public PagamentoFornecedor getPagamentoFornecedor() {
        return this.pagamentoFornecedor;
    }
    
    public void setPagamentoFornecedor(PagamentoFornecedor pagamentoFornecedor) {
        this.pagamentoFornecedor = pagamentoFornecedor;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumns( { 
        @JoinColumn(name="PRONF_NF_ID", referencedColumnName="NF_ID", nullable=false, insertable=false, updatable=false), 
        @JoinColumn(name="PRONF_PARCELA", referencedColumnName="PARCELA", nullable=false, insertable=false, updatable=false) } )
    public ProgramacaoPagamentoNf getProgramacaoPagamentoNf() {
        return this.programacaoPagamentoNf;
    }
    
    public void setProgramacaoPagamentoNf(ProgramacaoPagamentoNf programacaoPagamentoNf) {
        this.programacaoPagamentoNf = programacaoPagamentoNf;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="EMP_ID", nullable=false)
    public Empresa getEmpresa() {
        return this.empresa;
    }
    
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    
    @Column(name="VALOR_PAGO", nullable=false, precision=15)
    public BigDecimal getValorPago() {
        return this.valorPago;
    }
    
    public void setValorPago(BigDecimal valorPago) {
        this.valorPago = valorPago;
    }

    
    @Column(name="VALOR_ENCARGO", nullable=false, precision=15)
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="pagamentoNotaFiscal")
    public Set getMovimentoCaixas() {
        return this.movimentoCaixas;
    }
    
    public void setMovimentoCaixas(Set movimentoCaixas) {
        this.movimentoCaixas = movimentoCaixas;
    }




}


