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
 * PagamentoProfissional generated by hbm2java
 */
@Entity
@Table(name="PAGAMENTO_PROFISSIONAL"
    ,schema="DESENV"
)
public class PagamentoProfissional  implements java.io.Serializable {


     private BigDecimal id;
     private Profissional profissional;
     private Unidade unidade;
     private Empresa empresa;
     private Date dtPagamento;
     private BigDecimal valorPago;
     private String descricao;
     private Date dtInicioParticular;
     private Date dtTerminoParticular;
     private BigDecimal cdCriadoPor;
     private Date dtCriacao;
     private BigDecimal cdAlteradoPor;
     private Date dtUltimaAlteracao;
     private Set pagamentoFechamentoConvs = new HashSet(0);
     private Set movimentoCaixas = new HashSet(0);
     private Set composicaoPagamentoProfs = new HashSet(0);

    public PagamentoProfissional() {
    }

	
    public PagamentoProfissional(BigDecimal id, Profissional profissional, Unidade unidade, Empresa empresa, Date dtPagamento, BigDecimal valorPago, String descricao) {
        this.id = id;
        this.profissional = profissional;
        this.unidade = unidade;
        this.empresa = empresa;
        this.dtPagamento = dtPagamento;
        this.valorPago = valorPago;
        this.descricao = descricao;
    }
    public PagamentoProfissional(BigDecimal id, Profissional profissional, Unidade unidade, Empresa empresa, Date dtPagamento, BigDecimal valorPago, String descricao, Date dtInicioParticular, Date dtTerminoParticular, BigDecimal cdCriadoPor, Date dtCriacao, BigDecimal cdAlteradoPor, Date dtUltimaAlteracao, Set pagamentoFechamentoConvs, Set movimentoCaixas, Set composicaoPagamentoProfs) {
       this.id = id;
       this.profissional = profissional;
       this.unidade = unidade;
       this.empresa = empresa;
       this.dtPagamento = dtPagamento;
       this.valorPago = valorPago;
       this.descricao = descricao;
       this.dtInicioParticular = dtInicioParticular;
       this.dtTerminoParticular = dtTerminoParticular;
       this.cdCriadoPor = cdCriadoPor;
       this.dtCriacao = dtCriacao;
       this.cdAlteradoPor = cdAlteradoPor;
       this.dtUltimaAlteracao = dtUltimaAlteracao;
       this.pagamentoFechamentoConvs = pagamentoFechamentoConvs;
       this.movimentoCaixas = movimentoCaixas;
       this.composicaoPagamentoProfs = composicaoPagamentoProfs;
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
    @JoinColumn(name="PROFISSIONAL_ID", nullable=false)
    public Profissional getProfissional() {
        return this.profissional;
    }
    
    public void setProfissional(Profissional profissional) {
        this.profissional = profissional;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="UNI_ID", nullable=false)
    public Unidade getUnidade() {
        return this.unidade;
    }
    
    public void setUnidade(Unidade unidade) {
        this.unidade = unidade;
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
    @Column(name="DT_PAGAMENTO", nullable=false, length=7)
    public Date getDtPagamento() {
        return this.dtPagamento;
    }
    
    public void setDtPagamento(Date dtPagamento) {
        this.dtPagamento = dtPagamento;
    }

    
    @Column(name="VALOR_PAGO", nullable=false, precision=22, scale=0)
    public BigDecimal getValorPago() {
        return this.valorPago;
    }
    
    public void setValorPago(BigDecimal valorPago) {
        this.valorPago = valorPago;
    }

    
    @Column(name="DESCRICAO", nullable=false, length=100)
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="DT_INICIO_PARTICULAR", length=7)
    public Date getDtInicioParticular() {
        return this.dtInicioParticular;
    }
    
    public void setDtInicioParticular(Date dtInicioParticular) {
        this.dtInicioParticular = dtInicioParticular;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="DT_TERMINO_PARTICULAR", length=7)
    public Date getDtTerminoParticular() {
        return this.dtTerminoParticular;
    }
    
    public void setDtTerminoParticular(Date dtTerminoParticular) {
        this.dtTerminoParticular = dtTerminoParticular;
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="pagamentoProfissional")
    public Set getPagamentoFechamentoConvs() {
        return this.pagamentoFechamentoConvs;
    }
    
    public void setPagamentoFechamentoConvs(Set pagamentoFechamentoConvs) {
        this.pagamentoFechamentoConvs = pagamentoFechamentoConvs;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="pagamentoProfissional")
    public Set getMovimentoCaixas() {
        return this.movimentoCaixas;
    }
    
    public void setMovimentoCaixas(Set movimentoCaixas) {
        this.movimentoCaixas = movimentoCaixas;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="pagamentoProfissional")
    public Set getComposicaoPagamentoProfs() {
        return this.composicaoPagamentoProfs;
    }
    
    public void setComposicaoPagamentoProfs(Set composicaoPagamentoProfs) {
        this.composicaoPagamentoProfs = composicaoPagamentoProfs;
    }




}

