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
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * RemessaBancaria generated by hbm2java
 */
@Entity
@Table(name="REMESSA_BANCARIA"
    ,schema="DESENV"
)
public class RemessaBancaria  implements java.io.Serializable {


     private BigDecimal id;
     private ConvenioBancario convenioBancario;
     private Empresa empresa;
     private Date dtRemessa;
     private String nmArquivo;
     private BigDecimal nuRemessa;
     private BigDecimal cdCriadoPor;
     private Date dtCriacao;
     private BigDecimal cdAlteradoPor;
     private Date dtUltimaAlteracao;
     private Set movimentoTitulos = new HashSet(0);

    public RemessaBancaria() {
    }

	
    public RemessaBancaria(BigDecimal id, ConvenioBancario convenioBancario, Empresa empresa, Date dtRemessa, String nmArquivo, BigDecimal nuRemessa) {
        this.id = id;
        this.convenioBancario = convenioBancario;
        this.empresa = empresa;
        this.dtRemessa = dtRemessa;
        this.nmArquivo = nmArquivo;
        this.nuRemessa = nuRemessa;
    }
    public RemessaBancaria(BigDecimal id, ConvenioBancario convenioBancario, Empresa empresa, Date dtRemessa, String nmArquivo, BigDecimal nuRemessa, BigDecimal cdCriadoPor, Date dtCriacao, BigDecimal cdAlteradoPor, Date dtUltimaAlteracao, Set movimentoTitulos) {
       this.id = id;
       this.convenioBancario = convenioBancario;
       this.empresa = empresa;
       this.dtRemessa = dtRemessa;
       this.nmArquivo = nmArquivo;
       this.nuRemessa = nuRemessa;
       this.cdCriadoPor = cdCriadoPor;
       this.dtCriacao = dtCriacao;
       this.cdAlteradoPor = cdAlteradoPor;
       this.dtUltimaAlteracao = dtUltimaAlteracao;
       this.movimentoTitulos = movimentoTitulos;
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
    @JoinColumn(name="EMP_ID", nullable=false)
    public Empresa getEmpresa() {
        return this.empresa;
    }
    
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="DT_REMESSA", nullable=false, length=7)
    public Date getDtRemessa() {
        return this.dtRemessa;
    }
    
    public void setDtRemessa(Date dtRemessa) {
        this.dtRemessa = dtRemessa;
    }

    
    @Column(name="NM_ARQUIVO", nullable=false, length=4000)
    public String getNmArquivo() {
        return this.nmArquivo;
    }
    
    public void setNmArquivo(String nmArquivo) {
        this.nmArquivo = nmArquivo;
    }

    
    @Column(name="NU_REMESSA", nullable=false, precision=22, scale=0)
    public BigDecimal getNuRemessa() {
        return this.nuRemessa;
    }
    
    public void setNuRemessa(BigDecimal nuRemessa) {
        this.nuRemessa = nuRemessa;
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="remessaBancaria")
    public Set getMovimentoTitulos() {
        return this.movimentoTitulos;
    }
    
    public void setMovimentoTitulos(Set movimentoTitulos) {
        this.movimentoTitulos = movimentoTitulos;
    }




}


