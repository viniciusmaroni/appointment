/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemaclinica.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author maroni
 */
//@Repository
public class CategoriaDao extends AbstractDao {
   /*
    @Transactional
    public List<CategoriaItem> list() {
            List<CategoriaItem> listCat = (List<CategoriaItem>) getCurrentSession().getNamedQuery("CategoriaItem.findAll").list();
       
        @SuppressWarnings("unchecked")
                
                List<CategoriaItem> listCat = (List<CategoriaItem>) sessionFactory.getCurrentSession()
                .createCriteria(CategoriaItem.class)
                .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
 
        return listCat;
    }
 */   
    
}