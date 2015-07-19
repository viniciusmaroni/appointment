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
 * Inventario generated by hbm2java
 */
@Entity
@Table(name="INVENTARIO"
    ,schema="DESENV"
)
public class Inventario  implements java.io.Serializable {


     private InventarioId id;
     private Unidade unidade;
     private Empresa empresa;
     private String flStatus;
     private BigDecimal cdCriadoPor;
     private BigDecimal cdAlteradoPor;
     private Date dtCriacao;
     private Date dtUltimaAlteracao;
     private Set inventarioItems = new HashSet(0);

    public Inventario() {
    }

	
    public Inventario(InventarioId id, Unidade unidade, Empresa empresa, String flStatus, BigDecimal cdCriadoPor, BigDecimal cdAlteradoPor, Date dtCriacao, Date dtUltimaAlteracao) {
        this.id = id;
        this.unidade = unidade;
        this.empresa = empresa;
        this.flStatus = flStatus;
        this.cdCriadoPor = cdCriadoPor;
        this.cdAlteradoPor = cdAlteradoPor;
        this.dtCriacao = dtCriacao;
        this.dtUltimaAlteracao = dtUltimaAlteracao;
    }
    public Inventario(InventarioId id, Unidade unidade, Empresa empresa, String flStatus, BigDecimal cdCriadoPor, BigDecimal cdAlteradoPor, Date dtCriacao, Date dtUltimaAlteracao, Set inventarioItems) {
       this.id = id;
       this.unidade = unidade;
       this.empresa = empresa;
       this.flStatus = flStatus;
       this.cdCriadoPor = cdCriadoPor;
       this.cdAlteradoPor = cdAlteradoPor;
       this.dtCriacao = dtCriacao;
       this.dtUltimaAlteracao = dtUltimaAlteracao;
       this.inventarioItems = inventarioItems;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="data", column=@Column(name="DATA", nullable=false, length=7) ), 
        @AttributeOverride(name="uniId", column=@Column(name="UNI_ID", nullable=false, precision=22, scale=0) ) } )
    public InventarioId getId() {
        return this.id;
    }
    
    public void setId(InventarioId id) {
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

    
    @Column(name="FL_STATUS", nullable=false, length=2)
    public String getFlStatus() {
        return this.flStatus;
    }
    
    public void setFlStatus(String flStatus) {
        this.flStatus = flStatus;
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="inventario")
    public Set getInventarioItems() {
        return this.inventarioItems;
    }
    
    public void setInventarioItems(Set inventarioItems) {
        this.inventarioItems = inventarioItems;
    }




}

