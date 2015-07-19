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
 * CfgBancariaUnidade generated by hbm2java
 */
@Entity
@Table(name="CFG_BANCARIA_UNIDADE"
    ,schema="DESENV"
)
public class CfgBancariaUnidade  implements java.io.Serializable {


     private BigDecimal id;
     private ConvenioBancario convenioBancario;
     private IndiceAtualizacao indiceAtualizacaoByIndCorrMoraId;
     private IndiceAtualizacao indiceAtualizacaoByIndCorrMultaId;
     private Unidade unidade;
     private Empresa empresa;
     private String nome;
     private String instrucaoParcela1;
     private String instrucaoParcelas;
     private char ativo;
     private BigDecimal nuDiasProtesto;
     private BigDecimal cdCriadoPor;
     private Date dtCriacao;
     private BigDecimal cdAlteradoPor;
     private Date dtUltimaAlteracao;

    public CfgBancariaUnidade() {
    }

	
    public CfgBancariaUnidade(BigDecimal id, ConvenioBancario convenioBancario, IndiceAtualizacao indiceAtualizacaoByIndCorrMoraId, IndiceAtualizacao indiceAtualizacaoByIndCorrMultaId, Unidade unidade, Empresa empresa, String nome, String instrucaoParcela1, char ativo) {
        this.id = id;
        this.convenioBancario = convenioBancario;
        this.indiceAtualizacaoByIndCorrMoraId = indiceAtualizacaoByIndCorrMoraId;
        this.indiceAtualizacaoByIndCorrMultaId = indiceAtualizacaoByIndCorrMultaId;
        this.unidade = unidade;
        this.empresa = empresa;
        this.nome = nome;
        this.instrucaoParcela1 = instrucaoParcela1;
        this.ativo = ativo;
    }
    public CfgBancariaUnidade(BigDecimal id, ConvenioBancario convenioBancario, IndiceAtualizacao indiceAtualizacaoByIndCorrMoraId, IndiceAtualizacao indiceAtualizacaoByIndCorrMultaId, Unidade unidade, Empresa empresa, String nome, String instrucaoParcela1, String instrucaoParcelas, char ativo, BigDecimal nuDiasProtesto, BigDecimal cdCriadoPor, Date dtCriacao, BigDecimal cdAlteradoPor, Date dtUltimaAlteracao) {
       this.id = id;
       this.convenioBancario = convenioBancario;
       this.indiceAtualizacaoByIndCorrMoraId = indiceAtualizacaoByIndCorrMoraId;
       this.indiceAtualizacaoByIndCorrMultaId = indiceAtualizacaoByIndCorrMultaId;
       this.unidade = unidade;
       this.empresa = empresa;
       this.nome = nome;
       this.instrucaoParcela1 = instrucaoParcela1;
       this.instrucaoParcelas = instrucaoParcelas;
       this.ativo = ativo;
       this.nuDiasProtesto = nuDiasProtesto;
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
    @JoinColumns( { 
        @JoinColumn(name="CONV_BANCO", referencedColumnName="BANCO", nullable=false), 
        @JoinColumn(name="CONV_AGENCIA", referencedColumnName="AGENCIA", nullable=false), 
        @JoinColumn(name="CONV_CEDENTE", referencedColumnName="CEDENTE", nullable=false), 
        @JoinColumn(name="CONV_CARTEIRA", referencedColumnName="CARTEIRA", nullable=false), 
        @JoinColumn(name="CONV_CONVENIO", referencedColumnName="CONVENIO", nullable=false) } )
    public ConvenioBancario getConvenioBancario() {
        return this.convenioBancario;
    }
    
    public void setConvenioBancario(ConvenioBancario convenioBancario) {
        this.convenioBancario = convenioBancario;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="IND_CORR_MORA_ID", nullable=false)
    public IndiceAtualizacao getIndiceAtualizacaoByIndCorrMoraId() {
        return this.indiceAtualizacaoByIndCorrMoraId;
    }
    
    public void setIndiceAtualizacaoByIndCorrMoraId(IndiceAtualizacao indiceAtualizacaoByIndCorrMoraId) {
        this.indiceAtualizacaoByIndCorrMoraId = indiceAtualizacaoByIndCorrMoraId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="IND_CORR_MULTA_ID", nullable=false)
    public IndiceAtualizacao getIndiceAtualizacaoByIndCorrMultaId() {
        return this.indiceAtualizacaoByIndCorrMultaId;
    }
    
    public void setIndiceAtualizacaoByIndCorrMultaId(IndiceAtualizacao indiceAtualizacaoByIndCorrMultaId) {
        this.indiceAtualizacaoByIndCorrMultaId = indiceAtualizacaoByIndCorrMultaId;
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

    
    @Column(name="NOME", nullable=false)
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    @Column(name="INSTRUCAO_PARCELA1", nullable=false, length=4000)
    public String getInstrucaoParcela1() {
        return this.instrucaoParcela1;
    }
    
    public void setInstrucaoParcela1(String instrucaoParcela1) {
        this.instrucaoParcela1 = instrucaoParcela1;
    }

    
    @Column(name="INSTRUCAO_PARCELAS", length=4000)
    public String getInstrucaoParcelas() {
        return this.instrucaoParcelas;
    }
    
    public void setInstrucaoParcelas(String instrucaoParcelas) {
        this.instrucaoParcelas = instrucaoParcelas;
    }

    
    @Column(name="ATIVO", nullable=false, length=1)
    public char getAtivo() {
        return this.ativo;
    }
    
    public void setAtivo(char ativo) {
        this.ativo = ativo;
    }

    
    @Column(name="NU_DIAS_PROTESTO", precision=22, scale=0)
    public BigDecimal getNuDiasProtesto() {
        return this.nuDiasProtesto;
    }
    
    public void setNuDiasProtesto(BigDecimal nuDiasProtesto) {
        this.nuDiasProtesto = nuDiasProtesto;
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


