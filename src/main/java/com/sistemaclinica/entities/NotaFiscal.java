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
import javax.persistence.UniqueConstraint;

/**
 * NotaFiscal generated by hbm2java
 */
@Entity
@Table(name="NOTA_FISCAL"
    ,schema="DESENV"
    , uniqueConstraints = @UniqueConstraint(columnNames={"NUMERO", "FORN_ID"}) 
)
public class NotaFiscal  implements java.io.Serializable {


     private BigDecimal id;
     private Fornecedor fornecedor;
     private TipoNotaFiscal tipoNotaFiscal;
     private Unidade unidade;
     private Empresa empresa;
     private String flPrevisao;
     private String numero;
     private String descricao;
     private BigDecimal valorItens;
     private BigDecimal valorFrete;
     private BigDecimal valorSeguro;
     private BigDecimal valorDesconto;
     private BigDecimal valorOutrasDespesas;
     private String flStatus;
     private String flDocumentoFisico;
     private BigDecimal cdCriadoPor;
     private BigDecimal cdAlteradoPor;
     private Date dtCriacao;
     private Date dtUltimaAlteracao;
     private Date data;
     private BigDecimal valorPago;
     private String flCnpjUnidade;
     private Set programacaoPagamentoNfs = new HashSet(0);
     private Set linhaNotaFiscals = new HashSet(0);

    public NotaFiscal() {
    }

	
    public NotaFiscal(BigDecimal id, Fornecedor fornecedor, TipoNotaFiscal tipoNotaFiscal, Unidade unidade, Empresa empresa, String flPrevisao, String numero, BigDecimal valorItens, BigDecimal valorFrete, BigDecimal valorSeguro, BigDecimal valorDesconto, BigDecimal valorOutrasDespesas, String flStatus, String flDocumentoFisico, Date data, BigDecimal valorPago, String flCnpjUnidade) {
        this.id = id;
        this.fornecedor = fornecedor;
        this.tipoNotaFiscal = tipoNotaFiscal;
        this.unidade = unidade;
        this.empresa = empresa;
        this.flPrevisao = flPrevisao;
        this.numero = numero;
        this.valorItens = valorItens;
        this.valorFrete = valorFrete;
        this.valorSeguro = valorSeguro;
        this.valorDesconto = valorDesconto;
        this.valorOutrasDespesas = valorOutrasDespesas;
        this.flStatus = flStatus;
        this.flDocumentoFisico = flDocumentoFisico;
        this.data = data;
        this.valorPago = valorPago;
        this.flCnpjUnidade = flCnpjUnidade;
    }
    public NotaFiscal(BigDecimal id, Fornecedor fornecedor, TipoNotaFiscal tipoNotaFiscal, Unidade unidade, Empresa empresa, String flPrevisao, String numero, String descricao, BigDecimal valorItens, BigDecimal valorFrete, BigDecimal valorSeguro, BigDecimal valorDesconto, BigDecimal valorOutrasDespesas, String flStatus, String flDocumentoFisico, BigDecimal cdCriadoPor, BigDecimal cdAlteradoPor, Date dtCriacao, Date dtUltimaAlteracao, Date data, BigDecimal valorPago, String flCnpjUnidade, Set programacaoPagamentoNfs, Set linhaNotaFiscals) {
       this.id = id;
       this.fornecedor = fornecedor;
       this.tipoNotaFiscal = tipoNotaFiscal;
       this.unidade = unidade;
       this.empresa = empresa;
       this.flPrevisao = flPrevisao;
       this.numero = numero;
       this.descricao = descricao;
       this.valorItens = valorItens;
       this.valorFrete = valorFrete;
       this.valorSeguro = valorSeguro;
       this.valorDesconto = valorDesconto;
       this.valorOutrasDespesas = valorOutrasDespesas;
       this.flStatus = flStatus;
       this.flDocumentoFisico = flDocumentoFisico;
       this.cdCriadoPor = cdCriadoPor;
       this.cdAlteradoPor = cdAlteradoPor;
       this.dtCriacao = dtCriacao;
       this.dtUltimaAlteracao = dtUltimaAlteracao;
       this.data = data;
       this.valorPago = valorPago;
       this.flCnpjUnidade = flCnpjUnidade;
       this.programacaoPagamentoNfs = programacaoPagamentoNfs;
       this.linhaNotaFiscals = linhaNotaFiscals;
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
    @JoinColumn(name="FORN_ID", nullable=false)
    public Fornecedor getFornecedor() {
        return this.fornecedor;
    }
    
    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="TIPNF_ID", nullable=false)
    public TipoNotaFiscal getTipoNotaFiscal() {
        return this.tipoNotaFiscal;
    }
    
    public void setTipoNotaFiscal(TipoNotaFiscal tipoNotaFiscal) {
        this.tipoNotaFiscal = tipoNotaFiscal;
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

    
    @Column(name="FL_PREVISAO", nullable=false, length=1)
    public String getFlPrevisao() {
        return this.flPrevisao;
    }
    
    public void setFlPrevisao(String flPrevisao) {
        this.flPrevisao = flPrevisao;
    }

    
    @Column(name="NUMERO", nullable=false, length=50)
    public String getNumero() {
        return this.numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }

    
    @Column(name="DESCRICAO", length=300)
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    
    @Column(name="VALOR_ITENS", nullable=false, precision=15)
    public BigDecimal getValorItens() {
        return this.valorItens;
    }
    
    public void setValorItens(BigDecimal valorItens) {
        this.valorItens = valorItens;
    }

    
    @Column(name="VALOR_FRETE", nullable=false, precision=15)
    public BigDecimal getValorFrete() {
        return this.valorFrete;
    }
    
    public void setValorFrete(BigDecimal valorFrete) {
        this.valorFrete = valorFrete;
    }

    
    @Column(name="VALOR_SEGURO", nullable=false, precision=15)
    public BigDecimal getValorSeguro() {
        return this.valorSeguro;
    }
    
    public void setValorSeguro(BigDecimal valorSeguro) {
        this.valorSeguro = valorSeguro;
    }

    
    @Column(name="VALOR_DESCONTO", nullable=false, precision=15)
    public BigDecimal getValorDesconto() {
        return this.valorDesconto;
    }
    
    public void setValorDesconto(BigDecimal valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    
    @Column(name="VALOR_OUTRAS_DESPESAS", nullable=false, precision=15)
    public BigDecimal getValorOutrasDespesas() {
        return this.valorOutrasDespesas;
    }
    
    public void setValorOutrasDespesas(BigDecimal valorOutrasDespesas) {
        this.valorOutrasDespesas = valorOutrasDespesas;
    }

    
    @Column(name="FL_STATUS", nullable=false, length=1)
    public String getFlStatus() {
        return this.flStatus;
    }
    
    public void setFlStatus(String flStatus) {
        this.flStatus = flStatus;
    }

    
    @Column(name="FL_DOCUMENTO_FISICO", nullable=false, length=1)
    public String getFlDocumentoFisico() {
        return this.flDocumentoFisico;
    }
    
    public void setFlDocumentoFisico(String flDocumentoFisico) {
        this.flDocumentoFisico = flDocumentoFisico;
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

    
    @Column(name="FL_CNPJ_UNIDADE", nullable=false, length=1)
    public String getFlCnpjUnidade() {
        return this.flCnpjUnidade;
    }
    
    public void setFlCnpjUnidade(String flCnpjUnidade) {
        this.flCnpjUnidade = flCnpjUnidade;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="notaFiscal")
    public Set getProgramacaoPagamentoNfs() {
        return this.programacaoPagamentoNfs;
    }
    
    public void setProgramacaoPagamentoNfs(Set programacaoPagamentoNfs) {
        this.programacaoPagamentoNfs = programacaoPagamentoNfs;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="notaFiscal")
    public Set getLinhaNotaFiscals() {
        return this.linhaNotaFiscals;
    }
    
    public void setLinhaNotaFiscals(Set linhaNotaFiscals) {
        this.linhaNotaFiscals = linhaNotaFiscals;
    }




}

