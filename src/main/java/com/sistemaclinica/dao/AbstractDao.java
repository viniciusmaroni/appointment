/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemaclinica.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author maroni
 */
public abstract class AbstractDao {
 
    private SessionFactory sessionFactory;
 
    protected Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }
    
    
    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    } 
    
    
}
