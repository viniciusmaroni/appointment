package com.sistemaclinica.entities;
// Generated 09/07/2015 17:16:10 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * GuiaFechamento generated by hbm2java
 */
@Entity
@Table(name="GUIA_FECHAMENTO"
    ,schema="DESENV"
)
public class GuiaFechamento  implements java.io.Serializable {


     private BigDecimal guiaId;
     private FechamentoConvenio fechamentoConvenio;
     private GuiaPaciente guiaPaciente;
     private Empresa empresa;
     private BigDecimal valorPago;
     private BigDecimal valorGlosa;
     private BigDecimal vlReceberProfissional;
     private BigDecimal vlPagoProfissional;
     private Date dtPagamentoProfissional;
     private BigDecimal valorIgnorado;
     private BigDecimal cdCriadoPor;
     private Date dtCriacao;
     private BigDecimal cdAlteradoPor;
     private Date dtUltimaAlteracao;
     private BigDecimal vlTributacao;
     private Set procedimentoGuiaFechamentos = new HashSet(0);

    public GuiaFechamento() {
    }

	
    public GuiaFechamento(FechamentoConvenio fechamentoConvenio, GuiaPaciente guiaPaciente, Empresa empresa, BigDecimal valorPago, BigDecimal valorGlosa, BigDecimal vlReceberProfissional, BigDecimal valorIgnorado, BigDecimal vlTributacao) {
        this.fechamentoConvenio = fechamentoConvenio;
        this.guiaPaciente = guiaPaciente;
        this.empresa = empresa;
        this.valorPago = valorPago;
        this.valorGlosa = valorGlosa;
        this.vlReceberProfissional = vlReceberProfissional;
        this.valorIgnorado = valorIgnorado;
        this.vlTributacao = vlTributacao;
    }
    public GuiaFechamento(FechamentoConvenio fechamentoConvenio, GuiaPaciente guiaPaciente, Empresa empresa, BigDecimal valorPago, BigDecimal valorGlosa, BigDecimal vlReceberProfissional, BigDecimal vlPagoProfissional, Date dtPagamentoProfissional, BigDecimal valorIgnorado, BigDecimal cdCriadoPor, Date dtCriacao, BigDecimal cdAlteradoPor, Date dtUltimaAlteracao, BigDecimal vlTributacao, Set procedimentoGuiaFechamentos) {
       this.fechamentoConvenio = fechamentoConvenio;
       this.guiaPaciente = guiaPaciente;
       this.empresa = empresa;
       this.valorPago = valorPago;
       this.valorGlosa = valorGlosa;
       this.vlReceberProfissional = vlReceberProfissional;
       this.vlPagoProfissional = vlPagoProfissional;
       this.dtPagamentoProfissional = dtPagamentoProfissional;
       this.valorIgnorado = valorIgnorado;
       this.cdCriadoPor = cdCriadoPor;
       this.dtCriacao = dtCriacao;
       this.cdAlteradoPor = cdAlteradoPor;
       this.dtUltimaAlteracao = dtUltimaAlteracao;
       this.vlTributacao = vlTributacao;
       this.procedimentoGuiaFechamentos = procedimentoGuiaFechamentos;
    }
   
     @GenericGenerator(name="generator", strategy="foreign", parameters=@Parameter(name="property", value="guiaPaciente"))@Id @GeneratedValue(generator="generator")

    
    @Column(name="GUIA_ID", unique=true, nullable=false, precision=22, scale=0)
    public BigDecimal getGuiaId() {
        return this.guiaId;
    }
    
    public void setGuiaId(BigDecimal guiaId) {
        this.guiaId = guiaId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="FECO_ID", nullable=false)
    public FechamentoConvenio getFechamentoConvenio() {
        return this.fechamentoConvenio;
    }
    
    public void setFechamentoConvenio(FechamentoConvenio fechamentoConvenio) {
        this.fechamentoConvenio = fechamentoConvenio;
    }

@OneToOne(fetch=FetchType.LAZY)@PrimaryKeyJoinColumn
    public GuiaPaciente getGuiaPaciente() {
        return this.guiaPaciente;
    }
    
    public void setGuiaPaciente(GuiaPaciente guiaPaciente) {
        this.guiaPaciente = guiaPaciente;
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

    
    @Column(name="VALOR_GLOSA", nullable=false, precision=15)
    public BigDecimal getValorGlosa() {
        return this.valorGlosa;
    }
    
    public void setValorGlosa(BigDecimal valorGlosa) {
        this.valorGlosa = valorGlosa;
    }

    
    @Column(name="VL_RECEBER_PROFISSIONAL", nullable=false, precision=15)
    public BigDecimal getVlReceberProfissional() {
        return this.vlReceberProfissional;
    }
    
    public void setVlReceberProfissional(BigDecimal vlReceberProfissional) {
        this.vlReceberProfissional = vlReceberProfissional;
    }

    
    @Column(name="VL_PAGO_PROFISSIONAL", precision=15)
    public BigDecimal getVlPagoProfissional() {
        return this.vlPagoProfissional;
    }
    
    public void setVlPagoProfissional(BigDecimal vlPagoProfissional) {
        this.vlPagoProfissional = vlPagoProfissional;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="DT_PAGAMENTO_PROFISSIONAL", length=7)
    public Date getDtPagamentoProfissional() {
        return this.dtPagamentoProfissional;
    }
    
    public void setDtPagamentoProfissional(Date dtPagamentoProfissional) {
        this.dtPagamentoProfissional = dtPagamentoProfissional;
    }

    
    @Column(name="VALOR_IGNORADO", nullable=false, precision=15)
    public BigDecimal getValorIgnorado() {
        return this.valorIgnorado;
    }
    
    public void setValorIgnorado(BigDecimal valorIgnorado) {
        this.valorIgnorado = valorIgnorado;
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

    
    @Column(name="VL_TRIBUTACAO", nullable=false, precision=15)
    public BigDecimal getVlTributacao() {
        return this.vlTributacao;
    }
    
    public void setVlTributacao(BigDecimal vlTributacao) {
        this.vlTributacao = vlTributacao;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="guiaFechamento")
    public Set getProcedimentoGuiaFechamentos() {
        return this.procedimentoGuiaFechamentos;
    }
    
    public void setProcedimentoGuiaFechamentos(Set procedimentoGuiaFechamentos) {
        this.procedimentoGuiaFechamentos = procedimentoGuiaFechamentos;
    }




}


