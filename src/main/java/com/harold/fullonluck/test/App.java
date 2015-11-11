/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.harold.fullonluck.test;

import com.harold.fullonluck.dao.MarqueDao;
import com.harold.fullonluck.daoImpl.MarqueDaoImpl;
import com.harold.fullonluck.entities.Marque;
import com.royken.generic.dao.DataAccessException;
import com.royken.generic.dao.impl.GenericDao;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author harold
 */
public class App {
    public static void main( String[] args ) throws DataAccessException{

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("fullonluck");
        EntityManager em = emf.createEntityManager();
        MarqueDao marqueDao = new MarqueDaoImpl();
        ((GenericDao) marqueDao).setManager(em);
        EntityTransaction tx = em.getTransaction();
        
        tx.begin();
            Marque marque = new Marque();
            marque.setMar_nom("apple");
            marqueDao.create(marque);
            
        tx.commit();
        
        
    }
    
    
}
