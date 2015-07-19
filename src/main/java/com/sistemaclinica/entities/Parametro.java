package com.sistemaclinica.entities;
// Generated 09/07/2015 17:16:10 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Parametro generated by hbm2java
 */
@Entity
@Table(name="PARAMETRO"
    ,schema="DESENV"
    , uniqueConstraints = @UniqueConstraint(columnNames="NOME") 
)
public class Parametro  implements java.io.Serializable {


     private ParametroId id;
     private GrupoParametro grupoParametro;
     private String descricao;
     private String valor;
     private BigDecimal cdCriadoPor;
     private Date dtCriacao;
     private BigDecimal cdAlteradoPor;
     private Date dtUltimaAlteracao;

    public Parametro() {
    }

	
    public Parametro(ParametroId id, GrupoParametro grupoParametro, String descricao, String valor) {
        this.id = id;
        this.grupoParametro = grupoParametro;
        this.descricao = descricao;
        this.valor = valor;
    }
    public Parametro(ParametroId id, GrupoParametro grupoParametro, String descricao, String valor, BigDecimal cdCriadoPor, Date dtCriacao, BigDecimal cdAlteradoPor, Date dtUltimaAlteracao) {
       this.id = id;
       this.grupoParametro = grupoParametro;
       this.descricao = descricao;
       this.valor = valor;
       this.cdCriadoPor = cdCriadoPor;
       this.dtCriacao = dtCriacao;
       this.cdAlteradoPor = cdAlteradoPor;
       this.dtUltimaAlteracao = dtUltimaAlteracao;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="nome", column=@Column(name="NOME", unique=true, nullable=false, length=100) ), 
        @AttributeOverride(name="grupaNome", column=@Column(name="GRUPA_NOME", nullable=false, length=100) ) } )
    public ParametroId getId() {
        return this.id;
    }
    
    public void setId(ParametroId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="GRUPA_NOME", nullable=false, insertable=false, updatable=false)
    public GrupoParametro getGrupoParametro() {
        return this.grupoParametro;
    }
    
    public void setGrupoParametro(GrupoParametro grupoParametro) {
        this.grupoParametro = grupoParametro;
    }

    
    @Column(name="DESCRICAO", nullable=false, length=4000)
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    
    @Column(name="VALOR", nullable=false, length=4000)
    public String getValor() {
        return this.valor;
    }
    
    public void setValor(String valor) {
        this.valor = valor;
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


