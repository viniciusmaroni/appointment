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
@Entity(name = "BAIRRO")
@Table(indexes =  {@Index(name="BAI_CID_FK_I", unique = false, columnList = "cid_id")})
@SequenceGenerator(name = "sqBairro", sequenceName = "SQ_BAIRRO")
// ALIAS BAI
public class Bairro {
    @Column(nullable = false, unique = true)
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sqBairro")
    private Long id;
    
    @Column(nullable = false, length = 30)
    private String nome;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CID_ID")
    private Cidade cidade;

    @OneToMany(mappedBy = "bairro")
    private List<Empresa> empresas;

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

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public List<Empresa> getEmpresas() {
        return empresas;
    }

    public void setEmpresas(List<Empresa> empresas) {
        this.empresas = empresas;
    }
 
}
