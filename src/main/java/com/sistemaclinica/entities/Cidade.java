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
@Entity(name = "CIDADE")
@Table(indexes =  {@Index(name="CID_UF_FK_I", unique = false, columnList = "uf_id")})
@SequenceGenerator(name = "sqCidade", sequenceName = "SQ_CIDADE")
//ALIAS CID
public class Cidade {
    @Column(nullable = false, unique = true)
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sqCidade")
    private Long id;
    
    @Column(nullable = false, length = 40)
    private String nome;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "UF_ID")
    private UnidadeFederativa unidadeFederativa;
 
    @OneToMany(mappedBy = "cidade")
    private List<Bairro> bairros;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public UnidadeFederativa getUnidadeFederativa() {
        return unidadeFederativa;
    }

    public void setUnidadeFederativa(UnidadeFederativa unidadeFederativa) {
        this.unidadeFederativa = unidadeFederativa;
    }

    public List<Bairro> getBairros() {
        return bairros;
    }

    public void setBairros(List<Bairro> bairros) {
        this.bairros = bairros;
    }

    
}
