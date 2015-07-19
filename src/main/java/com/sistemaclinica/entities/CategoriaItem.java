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
 * CategoriaItem generated by hbm2java
 */
@Entity
@Table(name="CATEGORIA_ITEM"
    ,schema="DESENV"
)
public class CategoriaItem  implements java.io.Serializable {


     private CategoriaItemId id;
     private Empresa empresa;
     private String nome;
     private char flMovimentaEstoque;
     private BigDecimal cdCriadoPor;
     private BigDecimal cdAlteradoPor;
     private Date dtCriacao;
     private Date dtUltimaAlteracao;
     private Set items = new HashSet(0);

    public CategoriaItem() {
    }

	
    public CategoriaItem(CategoriaItemId id, Empresa empresa, String nome, char flMovimentaEstoque, BigDecimal cdCriadoPor, BigDecimal cdAlteradoPor, Date dtCriacao, Date dtUltimaAlteracao) {
        this.id = id;
        this.empresa = empresa;
        this.nome = nome;
        this.flMovimentaEstoque = flMovimentaEstoque;
        this.cdCriadoPor = cdCriadoPor;
        this.cdAlteradoPor = cdAlteradoPor;
        this.dtCriacao = dtCriacao;
        this.dtUltimaAlteracao = dtUltimaAlteracao;
    }
    public CategoriaItem(CategoriaItemId id, Empresa empresa, String nome, char flMovimentaEstoque, BigDecimal cdCriadoPor, BigDecimal cdAlteradoPor, Date dtCriacao, Date dtUltimaAlteracao, Set items) {
       this.id = id;
       this.empresa = empresa;
       this.nome = nome;
       this.flMovimentaEstoque = flMovimentaEstoque;
       this.cdCriadoPor = cdCriadoPor;
       this.cdAlteradoPor = cdAlteradoPor;
       this.dtCriacao = dtCriacao;
       this.dtUltimaAlteracao = dtUltimaAlteracao;
       this.items = items;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="id", column=@Column(name="ID", nullable=false, precision=22, scale=0) ), 
        @AttributeOverride(name="empId", column=@Column(name="EMP_ID", nullable=false, precision=22, scale=0) ) } )
    public CategoriaItemId getId() {
        return this.id;
    }
    
    public void setId(CategoriaItemId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="EMP_ID", nullable=false, insertable=false, updatable=false)
    public Empresa getEmpresa() {
        return this.empresa;
    }
    
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    
    @Column(name="NOME", nullable=false, length=100)
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    @Column(name="FL_MOVIMENTA_ESTOQUE", nullable=false, length=1)
    public char getFlMovimentaEstoque() {
        return this.flMovimentaEstoque;
    }
    
    public void setFlMovimentaEstoque(char flMovimentaEstoque) {
        this.flMovimentaEstoque = flMovimentaEstoque;
    }

    
    @Column(name="CD_CRIADO_POR", nullable=false, precision=22, scale=0)
    public BigDecimal getCdCriadoPor() {
        return this.cdCriadoPor;
    }
    
    public void setCdCriadoPor(BigDecimal cdCriadoPor) {
        this.cdCriadoPor = cdCriadoPor;
    }

    
    @Column(name="CD_ALTERADO_POR", nullable=false, precision=22, scale=0)
    public BigDecimal getCdAlteradoPor() {
        return this.cdAlteradoPor;
    }
    
    public void setCdAlteradoPor(BigDecimal cdAlteradoPor) {
        this.cdAlteradoPor = cdAlteradoPor;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="DT_CRIACAO", nullable=false, length=7)
    public Date getDtCriacao() {
        return this.dtCriacao;
    }
    
    public void setDtCriacao(Date dtCriacao) {
        this.dtCriacao = dtCriacao;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="DT_ULTIMA_ALTERACAO", nullable=false, length=7)
    public Date getDtUltimaAlteracao() {
        return this.dtUltimaAlteracao;
    }
    
    public void setDtUltimaAlteracao(Date dtUltimaAlteracao) {
        this.dtUltimaAlteracao = dtUltimaAlteracao;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="categoriaItem")
    public Set getItems() {
        return this.items;
    }
    
    public void setItems(Set items) {
        this.items = items;
    }




}


