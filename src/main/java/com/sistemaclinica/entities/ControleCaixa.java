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
 * ControleCaixa generated by hbm2java
 */
@Entity
@Table(name="CONTROLE_CAIXA"
    ,schema="DESENV"
    , uniqueConstraints = @UniqueConstraint(columnNames={"DT_ABERTURA", "CON_ID"}) 
)
public class ControleCaixa  implements java.io.Serializable {


     private String id;
     private Empresa empresa;
     private BigDecimal conId;
     private Date dtAbertura;
     private BigDecimal valorSaldoInicial;
     private Date dtFechamento;
     private BigDecimal valorReceita;
     private BigDecimal valorDespesa;
     private BigDecimal valorSaldoFinal;
     private BigDecimal cdCriadoPor;
     private Date dtCriacao;
     private BigDecimal cdAlteradoPor;
     private Date dtUltimaAlteracao;

    public ControleCaixa() {
    }

	
    public ControleCaixa(String id, Empresa empresa, BigDecimal conId, Date dtAbertura, BigDecimal valorSaldoInicial) {
        this.id = id;
        this.empresa = empresa;
        this.conId = conId;
        this.dtAbertura = dtAbertura;
        this.valorSaldoInicial = valorSaldoInicial;
    }
    public ControleCaixa(String id, Empresa empresa, BigDecimal conId, Date dtAbertura, BigDecimal valorSaldoInicial, Date dtFechamento, BigDecimal valorReceita, BigDecimal valorDespesa, BigDecimal valorSaldoFinal, BigDecimal cdCriadoPor, Date dtCriacao, BigDecimal cdAlteradoPor, Date dtUltimaAlteracao) {
       this.id = id;
       this.empresa = empresa;
       this.conId = conId;
       this.dtAbertura = dtAbertura;
       this.valorSaldoInicial = valorSaldoInicial;
       this.dtFechamento = dtFechamento;
       this.valorReceita = valorReceita;
       this.valorDespesa = valorDespesa;
       this.valorSaldoFinal = valorSaldoFinal;
       this.cdCriadoPor = cdCriadoPor;
       this.dtCriacao = dtCriacao;
       this.cdAlteradoPor = cdAlteradoPor;
       this.dtUltimaAlteracao = dtUltimaAlteracao;
    }
   
     @Id 

    
    @Column(name="ID", unique=true, nullable=false, length=240)
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="EMP_ID", nullable=false)
    public Empresa getEmpresa() {
        return this.empresa;
    }
    
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    
    @Column(name="CON_ID", nullable=false, precision=22, scale=0)
    public BigDecimal getConId() {
        return this.conId;
    }
    
    public void setConId(BigDecimal conId) {
        this.conId = conId;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="DT_ABERTURA", nullable=false, length=7)
    public Date getDtAbertura() {
        return this.dtAbertura;
    }
    
    public void setDtAbertura(Date dtAbertura) {
        this.dtAbertura = dtAbertura;
    }

    
    @Column(name="VALOR_SALDO_INICIAL", nullable=false, precision=15)
    public BigDecimal getValorSaldoInicial() {
        return this.valorSaldoInicial;
    }
    
    public void setValorSaldoInicial(BigDecimal valorSaldoInicial) {
        this.valorSaldoInicial = valorSaldoInicial;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="DT_FECHAMENTO", length=7)
    public Date getDtFechamento() {
        return this.dtFechamento;
    }
    
    public void setDtFechamento(Date dtFechamento) {
        this.dtFechamento = dtFechamento;
    }

    
    @Column(name="VALOR_RECEITA", precision=15)
    public BigDecimal getValorReceita() {
        return this.valorReceita;
    }
    
    public void setValorReceita(BigDecimal valorReceita) {
        this.valorReceita = valorReceita;
    }

    
    @Column(name="VALOR_DESPESA", precision=15)
    public BigDecimal getValorDespesa() {
        return this.valorDespesa;
    }
    
    public void setValorDespesa(BigDecimal valorDespesa) {
        this.valorDespesa = valorDespesa;
    }

    
    @Column(name="VALOR_SALDO_FINAL", precision=15)
    public BigDecimal getValorSaldoFinal() {
        return this.valorSaldoFinal;
    }
    
    public void setValorSaldoFinal(BigDecimal valorSaldoFinal) {
        this.valorSaldoFinal = valorSaldoFinal;
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


