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
 * RegiaoProcedimento generated by hbm2java
 */
@Entity
@Table(name="REGIAO_PROCEDIMENTO"
    ,schema="DESENV"
)
public class RegiaoProcedimento  implements java.io.Serializable {


     private BigDecimal id;
     private Empresa empresa;
     private String nome;
     private BigDecimal cdCriadoPor;
     private Date dtCriacao;
     private BigDecimal cdAlteradoPor;
     private Date dtUltimaAlteracao;
     private Set listaRegiaoProcedimentos = new HashSet(0);
     private Set procedimentos = new HashSet(0);

    public RegiaoProcedimento() {
    }

	
    public RegiaoProcedimento(BigDecimal id, Empresa empresa, String nome) {
        this.id = id;
        this.empresa = empresa;
        this.nome = nome;
    }
    public RegiaoProcedimento(BigDecimal id, Empresa empresa, String nome, BigDecimal cdCriadoPor, Date dtCriacao, BigDecimal cdAlteradoPor, Date dtUltimaAlteracao, Set listaRegiaoProcedimentos, Set procedimentos) {
       this.id = id;
       this.empresa = empresa;
       this.nome = nome;
       this.cdCriadoPor = cdCriadoPor;
       this.dtCriacao = dtCriacao;
       this.cdAlteradoPor = cdAlteradoPor;
       this.dtUltimaAlteracao = dtUltimaAlteracao;
       this.listaRegiaoProcedimentos = listaRegiaoProcedimentos;
       this.procedimentos = procedimentos;
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
    @JoinColumn(name="EMP_ID", nullable=false)
    public Empresa getEmpresa() {
        return this.empresa;
    }
    
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    
    @Column(name="NOME", nullable=false, length=50)
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="regiaoProcedimento")
    public Set getListaRegiaoProcedimentos() {
        return this.listaRegiaoProcedimentos;
    }
    
    public void setListaRegiaoProcedimentos(Set listaRegiaoProcedimentos) {
        this.listaRegiaoProcedimentos = listaRegiaoProcedimentos;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="regiaoProcedimento")
    public Set getProcedimentos() {
        return this.procedimentos;
    }
    
    public void setProcedimentos(Set procedimentos) {
        this.procedimentos = procedimentos;
    }




}

