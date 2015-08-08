/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemaclinica.entities;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author maroni
 */
@Entity(name = "UNIDADE_FEDERATIVA")
@Table(indexes =  {@Index(name="UF_PAIS_FK_I", unique = false, columnList = "pais_id")})
@SequenceGenerator(name = "sqUnidadeFederativa", sequenceName = "SQ_UNIDADE_FEDERATIVA")
// ALIAS UF
public class UnidadeFederativa {
    @Column(nullable = false, unique = true)
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sqUnidadeFederativa")
    private Long id;
    
    @Column(nullable = false, length = 2, unique = true)
    private String sigla;
    
    @Column(nullable = false, length = 30)
    private String nome;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PAIS_ID")
    private Pais pais;

    @OneToMany(mappedBy = "unidadeFederativa")
    private List<Cidade> cidades;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public List<Cidade> getCidades() {
        return cidades;
    }

    public void setCidades(List<Cidade> cidades) {
        this.cidades = cidades;
    }
    
}
