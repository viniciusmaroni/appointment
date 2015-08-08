/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemaclinica.entities;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author maroni
 */
@Entity(name = "PAIS")
@SequenceGenerator(name = "sqPais", sequenceName = "SQ_PAIS")
// ALIAS PAIS
public class Pais {
    @Column(nullable = false, unique = true)
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sqPais")
    private String id;

    @Column(nullable = false, length = 30)
    private String nome;

    @OneToMany(mappedBy = "pais")
    private List<UnidadeFederativa> unidadesFederativas;

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<UnidadeFederativa> getUnidadesFederativas() {
        return unidadesFederativas;
    }

    public void setUnidadesFederativas(List<UnidadeFederativa> unidadesFederativas) {
        this.unidadesFederativas = unidadesFederativas;
    }
    
    
}
