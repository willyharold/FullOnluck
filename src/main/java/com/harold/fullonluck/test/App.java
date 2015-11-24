/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.harold.fullonluck.test;

import com.harold.fullonluck.entities.Categorie;
import com.harold.fullonluck.entities.Marque;
import com.harold.fullonluck.service.CategorieServ;
import com.harold.fullonluck.service.MarqueServ;
import com.royken.generic.dao.DataAccessException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author harold
 */
public class App {
    public static void main( String[] args ) throws DataAccessException{

//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("fullonluck");
//        EntityManager em = emf.createEntityManager();
//        MarqueDao marqueDao = new MarqueDaoImpl();
//        ((GenericDao) marqueDao).setManager(em);
//        EntityTransaction tx = em.getTransaction();
//        
//        tx.begin();
//            Marque marque = new Marque();
//            marque.setMar_nom("motorola");
//            marqueDao.create(marque);
//            
//        tx.commit();
//        em.close();
        ApplicationContext ctx = new ClassPathXmlApplicationContext("Spring-Config.xml");
        CategorieServ categorieServ = (CategorieServ)ctx.getBean("CategorieServ");
        Categorie categorie = new Categorie();
        categorie.setCat_nom("Modem");
        categorieServ.save(categorie);
    }
    
    
}
