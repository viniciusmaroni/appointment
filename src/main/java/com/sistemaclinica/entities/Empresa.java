/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemaclinica.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author maroni
 */
@Entity(name = "EMPRESA")
@Table(indexes =  {@Index(name="EMP_BAI_FK_I", unique = false, columnList = "bai_id")})
@SequenceGenerator(name = "sqEmpresa", sequenceName = "SQ_EMPRESA")
// Alias EMP
public class Empresa {
    
    public final String PESSOA_FISICA   = "F";
    public final String PESSOA_JURIDICA = "J";
            
    
    @Column(nullable = false, unique = true)
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sqEmpresa")    
    private Long id;
    
    @Column(nullable = false, length = 1)
    private String tipoPessoa;   

    @Column(nullable = false, length = 100)
    private String nomeRazaoSocial;

    @Column(nullable = false)
    private boolean ativo;
    
    @Column(nullable = false, length = 14)
    private String cpfCnpj;

    @Column(nullable = false, length = 100)
    private String nomeResponsavel;
    @Column(nullable = false, length = 20)
    private String telefoneResidencial;
    @Column(nullable = false, length = 20)
    private String telefoneComercial;
    @Column(nullable = false, length = 20)
    private String telefoneCelular;
    @Column(nullable = false, length = 100)
    private String email;
    @Column(nullable = false, length = 100)
    private String endereco;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BAI_ID")
    private Cidade bairro;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public String getNomeRazaoSocial() {
        return nomeRazaoSocial;
    }

    public void setNomeRazaoSocial(String nomeRazaoSocial) {
        this.nomeRazaoSocial = nomeRazaoSocial;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public String getTelefoneResidencial() {
        return telefoneResidencial;
    }

    public void setTelefoneResidencial(String telefoneResidencial) {
        this.telefoneResidencial = telefoneResidencial;
    }

    public String getTelefoneComercial() {
        return telefoneComercial;
    }

    public void setTelefoneComercial(String telefoneComercial) {
        this.telefoneComercial = telefoneComercial;
    }

    public String getTelefoneCelular() {
        return telefoneCelular;
    }

    public void setTelefoneCelular(String telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Cidade getBairro() {
        return bairro;
    }

    public void setBairro(Cidade bairro) {
        this.bairro = bairro;
    }

}
