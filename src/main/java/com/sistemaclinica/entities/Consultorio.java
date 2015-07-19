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
 * Consultorio generated by hbm2java
 */
@Entity
@Table(name="CONSULTORIO"
    ,schema="DESENV"
)
public class Consultorio  implements java.io.Serializable {


     private ConsultorioId id;
     private Unidade unidade;
     private Empresa empresa;
     private String nome;
     private String nomeResumido;
     private char ativo;
     private BigDecimal cdCriadoPor;
     private Date dtCriacao;
     private BigDecimal cdAlteradoPor;
     private Date dtUltimaAlteracao;
     private Set consumoItems = new HashSet(0);
     private Set agendas = new HashSet(0);

    public Consultorio() {
    }

	
    public Consultorio(ConsultorioId id, Unidade unidade, Empresa empresa, String nome, String nomeResumido, char ativo) {
        this.id = id;
        this.unidade = unidade;
        this.empresa = empresa;
        this.nome = nome;
        this.nomeResumido = nomeResumido;
        this.ativo = ativo;
    }
    public Consultorio(ConsultorioId id, Unidade unidade, Empresa empresa, String nome, String nomeResumido, char ativo, BigDecimal cdCriadoPor, Date dtCriacao, BigDecimal cdAlteradoPor, Date dtUltimaAlteracao, Set consumoItems, Set agendas) {
       this.id = id;
       this.unidade = unidade;
       this.empresa = empresa;
       this.nome = nome;
       this.nomeResumido = nomeResumido;
       this.ativo = ativo;
       this.cdCriadoPor = cdCriadoPor;
       this.dtCriacao = dtCriacao;
       this.cdAlteradoPor = cdAlteradoPor;
       this.dtUltimaAlteracao = dtUltimaAlteracao;
       this.consumoItems = consumoItems;
       this.agendas = agendas;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="uniId", column=@Column(name="UNI_ID", nullable=false, precision=22, scale=0) ), 
        @AttributeOverride(name="id", column=@Column(name="ID", nullable=false, precision=22, scale=0) ) } )
    public ConsultorioId getId() {
        return this.id;
    }
    
    public void setId(ConsultorioId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="UNI_ID", nullable=false, insertable=false, updatable=false)
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

    
    @Column(name="NOME", nullable=false, length=50)
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    @Column(name="NOME_RESUMIDO", nullable=false, length=10)
    public String getNomeResumido() {
        return this.nomeResumido;
    }
    
    public void setNomeResumido(String nomeResumido) {
        this.nomeResumido = nomeResumido;
    }

    
    @Column(name="ATIVO", nullable=false, length=1)
    public char getAtivo() {
        return this.ativo;
    }
    
    public void setAtivo(char ativo) {
        this.ativo = ativo;
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="consultorio")
    public Set getConsumoItems() {
        return this.consumoItems;
    }
    
    public void setConsumoItems(Set consumoItems) {
        this.consumoItems = consumoItems;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="consultorio")
    public Set getAgendas() {
        return this.agendas;
    }
    
    public void setAgendas(Set agendas) {
        this.agendas = agendas;
    }




}


