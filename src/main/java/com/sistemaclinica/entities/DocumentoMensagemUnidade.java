package com.sistemaclinica.entities;
// Generated 09/07/2015 17:16:10 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.sql.Blob;
import java.sql.Clob;
import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * DocumentoMensagemUnidade generated by hbm2java
 */
@Entity
@Table(name="DOCUMENTO_MENSAGEM_UNIDADE"
    ,schema="DESENV"
)
public class DocumentoMensagemUnidade  implements java.io.Serializable {


     private DocumentoMensagemUnidadeId id;
     private DocumentoEspaco documentoEspaco;
     private Unidade unidade;
     private Empresa empresa;
     private Blob imMensagem;
     private Clob dsMensagem;
     private BigDecimal cdCriadoPor;
     private Date dtCriacao;
     private BigDecimal cdAlteradoPor;
     private Date dtUltimaAlteracao;

    public DocumentoMensagemUnidade() {
    }

	
    public DocumentoMensagemUnidade(DocumentoMensagemUnidadeId id, DocumentoEspaco documentoEspaco, Unidade unidade, Empresa empresa) {
        this.id = id;
        this.documentoEspaco = documentoEspaco;
        this.unidade = unidade;
        this.empresa = empresa;
    }
    public DocumentoMensagemUnidade(DocumentoMensagemUnidadeId id, DocumentoEspaco documentoEspaco, Unidade unidade, Empresa empresa, Blob imMensagem, Clob dsMensagem, BigDecimal cdCriadoPor, Date dtCriacao, BigDecimal cdAlteradoPor, Date dtUltimaAlteracao) {
       this.id = id;
       this.documentoEspaco = documentoEspaco;
       this.unidade = unidade;
       this.empresa = empresa;
       this.imMensagem = imMensagem;
       this.dsMensagem = dsMensagem;
       this.cdCriadoPor = cdCriadoPor;
       this.dtCriacao = dtCriacao;
       this.cdAlteradoPor = cdAlteradoPor;
       this.dtUltimaAlteracao = dtUltimaAlteracao;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="dtInicioVigencia", column=@Column(name="DT_INICIO_VIGENCIA", nullable=false, length=7) ), 
        @AttributeOverride(name="docesDocId", column=@Column(name="DOCES_DOC_ID", nullable=false, length=20) ), 
        @AttributeOverride(name="docesId", column=@Column(name="DOCES_ID", nullable=false, length=20) ), 
        @AttributeOverride(name="uniId", column=@Column(name="UNI_ID", nullable=false, precision=22, scale=0) ) } )
    public DocumentoMensagemUnidadeId getId() {
        return this.id;
    }
    
    public void setId(DocumentoMensagemUnidadeId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumns( { 
        @JoinColumn(name="DOCES_ID", referencedColumnName="ID", nullable=false, insertable=false, updatable=false), 
        @JoinColumn(name="DOCES_DOC_ID", referencedColumnName="DOC_ID", nullable=false, insertable=false, updatable=false) } )
    public DocumentoEspaco getDocumentoEspaco() {
        return this.documentoEspaco;
    }
    
    public void setDocumentoEspaco(DocumentoEspaco documentoEspaco) {
        this.documentoEspaco = documentoEspaco;
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

    
    @Column(name="IM_MENSAGEM")
    public Blob getImMensagem() {
        return this.imMensagem;
    }
    
    public void setImMensagem(Blob imMensagem) {
        this.imMensagem = imMensagem;
    }

    
    @Column(name="DS_MENSAGEM")
    public Clob getDsMensagem() {
        return this.dsMensagem;
    }
    
    public void setDsMensagem(Clob dsMensagem) {
        this.dsMensagem = dsMensagem;
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

