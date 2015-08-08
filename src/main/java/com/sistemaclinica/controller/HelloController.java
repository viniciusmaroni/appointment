/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemaclinica.controller;

import com.sistemaclinica.dao.ItemDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author maroni
 */
@Controller
public class HelloController {
 /*  
   @Autowired
   private ItemDao itemDao;
   */ 
   @RequestMapping(value = "/exemplo", method = RequestMethod.GET)
   @Transactional
   public String printHello(ModelMap model) {
   //   List<Item> list = itemDao.list();
    //   System.out.println("LISTA SIZE: " + list.size());
      //model.addAttribute("list", list);
      model.addAttribute("message", "Hello Spring MVC Framework!");
      return "cadastrarItens/cadastrarItens";
   }
}
