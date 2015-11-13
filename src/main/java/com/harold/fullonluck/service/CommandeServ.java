/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.harold.fullonluck.service;

import com.harold.fullonluck.entities.Commande;
import com.royken.generic.dao.DataAccessException;
import java.util.List;

/**
 *
 * @author harold
 */
public interface CommandeServ {
    
    public Commande findByid(Long id) throws DataAccessException;
    
    public void delete(Long id) throws DataAccessException;
    
    public Commande update(Commande a) throws DataAccessException;
    
    public Commande save(Commande a) throws DataAccessException;
   
    public List<Commande> findAll() throws DataAccessException;
    
    public Long size() throws DataAccessException;
}
