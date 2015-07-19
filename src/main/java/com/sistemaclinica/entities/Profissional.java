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
 * Profissional generated by hbm2java
 */
@Entity
@Table(name="PROFISSIONAL"
    ,schema="DESENV"
)
public class Profissional  implements java.io.Serializable {


     private BigDecimal id;
     private Empresa empresa;
     private String nome;
     private String flAtivo;
     private String cro;
     private String cpf;
     private String bancoNumero;
     private String bancoNome;
     private String agencia;
     private String conta;
     private BigDecimal cdCriadoPor;
     private Date dtCriacao;
     private BigDecimal cdAlteradoPor;
     private Date dtUltimaAlteracao;
     private String googleCalendar;
     private Set agendas = new HashSet(0);
     private Set aberturaAgendas = new HashSet(0);
     private Set consumoItems = new HashSet(0);
     private Set tipoAgendaProfissionals = new HashSet(0);
     private Set bloqueioAgendas = new HashSet(0);
     private Set consumoMaterials = new HashSet(0);
     private Set repasseProfissionals = new HashSet(0);
     private Set procedimentoPacientes = new HashSet(0);
     private Set especialidadeProfissionals = new HashSet(0);
     private Set guiaPacientes = new HashSet(0);
     private Set pagamentoProfissionals = new HashSet(0);

    public Profissional() {
    }

	
    public Profissional(BigDecimal id, Empresa empresa, String nome, String flAtivo, String cro) {
        this.id = id;
        this.empresa = empresa;
        this.nome = nome;
        this.flAtivo = flAtivo;
        this.cro = cro;
    }
    public Profissional(BigDecimal id, Empresa empresa, String nome, String flAtivo, String cro, String cpf, String bancoNumero, String bancoNome, String agencia, String conta, BigDecimal cdCriadoPor, Date dtCriacao, BigDecimal cdAlteradoPor, Date dtUltimaAlteracao, String googleCalendar, Set agendas, Set aberturaAgendas, Set consumoItems, Set tipoAgendaProfissionals, Set bloqueioAgendas, Set consumoMaterials, Set repasseProfissionals, Set procedimentoPacientes, Set especialidadeProfissionals, Set guiaPacientes, Set pagamentoProfissionals) {
       this.id = id;
       this.empresa = empresa;
       this.nome = nome;
       this.flAtivo = flAtivo;
       this.cro = cro;
       this.cpf = cpf;
       this.bancoNumero = bancoNumero;
       this.bancoNome = bancoNome;
       this.agencia = agencia;
       this.conta = conta;
       this.cdCriadoPor = cdCriadoPor;
       this.dtCriacao = dtCriacao;
       this.cdAlteradoPor = cdAlteradoPor;
       this.dtUltimaAlteracao = dtUltimaAlteracao;
       this.googleCalendar = googleCalendar;
       this.agendas = agendas;
       this.aberturaAgendas = aberturaAgendas;
       this.consumoItems = consumoItems;
       this.tipoAgendaProfissionals = tipoAgendaProfissionals;
       this.bloqueioAgendas = bloqueioAgendas;
       this.consumoMaterials = consumoMaterials;
       this.repasseProfissionals = repasseProfissionals;
       this.procedimentoPacientes = procedimentoPacientes;
       this.especialidadeProfissionals = especialidadeProfissionals;
       this.guiaPacientes = guiaPacientes;
       this.pagamentoProfissionals = pagamentoProfissionals;
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

    
    @Column(name="NOME", nullable=false, length=100)
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    @Column(name="FL_ATIVO", nullable=false, length=1)
    public String getFlAtivo() {
        return this.flAtivo;
    }
    
    public void setFlAtivo(String flAtivo) {
        this.flAtivo = flAtivo;
    }

    
    @Column(name="CRO", nullable=false, length=10)
    public String getCro() {
        return this.cro;
    }
    
    public void setCro(String cro) {
        this.cro = cro;
    }

    
    @Column(name="CPF", length=11)
    public String getCpf() {
        return this.cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
    @Column(name="BANCO_NUMERO", length=3)
    public String getBancoNumero() {
        return this.bancoNumero;
    }
    
    public void setBancoNumero(String bancoNumero) {
        this.bancoNumero = bancoNumero;
    }

    
    @Column(name="BANCO_NOME", length=50)
    public String getBancoNome() {
        return this.bancoNome;
    }
    
    public void setBancoNome(String bancoNome) {
        this.bancoNome = bancoNome;
    }

    
    @Column(name="AGENCIA", length=20)
    public String getAgencia() {
        return this.agencia;
    }
    
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    
    @Column(name="CONTA", length=20)
    public String getConta() {
        return this.conta;
    }
    
    public void setConta(String conta) {
        this.conta = conta;
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

    
    @Column(name="GOOGLE_CALENDAR", length=300)
    public String getGoogleCalendar() {
        return this.googleCalendar;
    }
    
    public void setGoogleCalendar(String googleCalendar) {
        this.googleCalendar = googleCalendar;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="profissional")
    public Set getAgendas() {
        return this.agendas;
    }
    
    public void setAgendas(Set agendas) {
        this.agendas = agendas;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="profissional")
    public Set getAberturaAgendas() {
        return this.aberturaAgendas;
    }
    
    public void setAberturaAgendas(Set aberturaAgendas) {
        this.aberturaAgendas = aberturaAgendas;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="profissional")
    public Set getConsumoItems() {
        return this.consumoItems;
    }
    
    public void setConsumoItems(Set consumoItems) {
        this.consumoItems = consumoItems;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="profissional")
    public Set getTipoAgendaProfissionals() {
        return this.tipoAgendaProfissionals;
    }
    
    public void setTipoAgendaProfissionals(Set tipoAgendaProfissionals) {
        this.tipoAgendaProfissionals = tipoAgendaProfissionals;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="profissional")
    public Set getBloqueioAgendas() {
        return this.bloqueioAgendas;
    }
    
    public void setBloqueioAgendas(Set bloqueioAgendas) {
        this.bloqueioAgendas = bloqueioAgendas;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="profissional")
    public Set getConsumoMaterials() {
        return this.consumoMaterials;
    }
    
    public void setConsumoMaterials(Set consumoMaterials) {
        this.consumoMaterials = consumoMaterials;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="profissional")
    public Set getRepasseProfissionals() {
        return this.repasseProfissionals;
    }
    
    public void setRepasseProfissionals(Set repasseProfissionals) {
        this.repasseProfissionals = repasseProfissionals;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="profissional")
    public Set getProcedimentoPacientes() {
        return this.procedimentoPacientes;
    }
    
    public void setProcedimentoPacientes(Set procedimentoPacientes) {
        this.procedimentoPacientes = procedimentoPacientes;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="profissional")
    public Set getEspecialidadeProfissionals() {
        return this.especialidadeProfissionals;
    }
    
    public void setEspecialidadeProfissionals(Set especialidadeProfissionals) {
        this.especialidadeProfissionals = especialidadeProfissionals;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="profissional")
    public Set getGuiaPacientes() {
        return this.guiaPacientes;
    }
    
    public void setGuiaPacientes(Set guiaPacientes) {
        this.guiaPacientes = guiaPacientes;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="profissional")
    public Set getPagamentoProfissionals() {
        return this.pagamentoProfissionals;
    }
    
    public void setPagamentoProfissionals(Set pagamentoProfissionals) {
        this.pagamentoProfissionals = pagamentoProfissionals;
    }




}


