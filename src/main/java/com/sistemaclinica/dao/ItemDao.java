/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemaclinica.dao;

import com.sistemaclinica.entities.Item;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author maroni
 */
@Repository
public class ItemDao extends AbstractDao {

    @Transactional
    public List<Item> list() {
            List<Item> list = (List<Item>) getCurrentSession().createQuery("SELECT * From Item ite JOIN FETCH ite.categoriaItem ").list();
       /*
        @SuppressWarnings("unchecked")
                
                List<CategoriaItem> listCat = (List<CategoriaItem>) sessionFactory.getCurrentSession()
                .createCriteria(CategoriaItem.class)
                .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
 */
        return list;
    }    
}
