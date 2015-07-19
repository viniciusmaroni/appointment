package com.sistemaclinica.entities;
// Generated 09/07/2015 17:16:10 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * LogAcessoTela generated by hbm2java
 */
@Entity
@Table(name="LOG_ACESSO_TELA"
    ,schema="DESENV"
)
public class LogAcessoTela  implements java.io.Serializable {


     private BigDecimal id;
     private GrupoUsuario grupoUsuario;
     private Empresa empresa;
     private BigDecimal sid;
     private String nmTela;
     private Date dtEntrada;
     private Date dtSaida;
     private String cl$osUser;
     private String cl$ip;
     private String cl$host;
     private BigDecimal cdCriadoPor;
     private Date dtCriacao;
     private BigDecimal cdAlteradoPor;
     private Date dtUltimaAlteracao;

    public LogAcessoTela() {
    }

	
    public LogAcessoTela(BigDecimal id, GrupoUsuario grupoUsuario, Empresa empresa, BigDecimal sid, String nmTela, Date dtEntrada, String cl$osUser, String cl$ip, String cl$host) {
        this.id = id;
        this.grupoUsuario = grupoUsuario;
        this.empresa = empresa;
        this.sid = sid;
        this.nmTela = nmTela;
        this.dtEntrada = dtEntrada;
        this.cl$osUser = cl$osUser;
        this.cl$ip = cl$ip;
        this.cl$host = cl$host;
    }
    public LogAcessoTela(BigDecimal id, GrupoUsuario grupoUsuario, Empresa empresa, BigDecimal sid, String nmTela, Date dtEntrada, Date dtSaida, String cl$osUser, String cl$ip, String cl$host, BigDecimal cdCriadoPor, Date dtCriacao, BigDecimal cdAlteradoPor, Date dtUltimaAlteracao) {
       this.id = id;
       this.grupoUsuario = grupoUsuario;
       this.empresa = empresa;
       this.sid = sid;
       this.nmTela = nmTela;
       this.dtEntrada = dtEntrada;
       this.dtSaida = dtSaida;
       this.cl$osUser = cl$osUser;
       this.cl$ip = cl$ip;
       this.cl$host = cl$host;
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
    @JoinColumn(name="GRUS_CD_USUARIO", nullable=false)
    public GrupoUsuario getGrupoUsuario() {
        return this.grupoUsuario;
    }
    
    public void setGrupoUsuario(GrupoUsuario grupoUsuario) {
        this.grupoUsuario = grupoUsuario;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="EMP_ID", nullable=false)
    public Empresa getEmpresa() {
        return this.empresa;
    }
    
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    
    @Column(name="SID", nullable=false, precision=22, scale=0)
    public BigDecimal getSid() {
        return this.sid;
    }
    
    public void setSid(BigDecimal sid) {
        this.sid = sid;
    }

    
    @Column(name="NM_TELA", nullable=false, length=240)
    public String getNmTela() {
        return this.nmTela;
    }
    
    public void setNmTela(String nmTela) {
        this.nmTela = nmTela;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="DT_ENTRADA", nullable=false, length=7)
    public Date getDtEntrada() {
        return this.dtEntrada;
    }
    
    public void setDtEntrada(Date dtEntrada) {
        this.dtEntrada = dtEntrada;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="DT_SAIDA", length=7)
    public Date getDtSaida() {
        return this.dtSaida;
    }
    
    public void setDtSaida(Date dtSaida) {
        this.dtSaida = dtSaida;
    }

    
    @Column(name="CL$OS_USER", nullable=false, length=50)
    public String getCl$osUser() {
        return this.cl$osUser;
    }
    
    public void setCl$osUser(String cl$osUser) {
        this.cl$osUser = cl$osUser;
    }

    
    @Column(name="CL$IP", nullable=false, length=15)
    public String getCl$ip() {
        return this.cl$ip;
    }
    
    public void setCl$ip(String cl$ip) {
        this.cl$ip = cl$ip;
    }

    
    @Column(name="CL$HOST", nullable=false, length=50)
    public String getCl$host() {
        return this.cl$host;
    }
    
    public void setCl$host(String cl$host) {
        this.cl$host = cl$host;
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


