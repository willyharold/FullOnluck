/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.harold.fullonluck.service;

import com.harold.fullonluck.entities.Categorie;
import com.royken.generic.dao.DataAccessException;
import java.util.List;

/**
 *
 * @author harold
 */
public interface CategorieServ {
    public Categorie findByid(Long id) throws DataAccessException;
    
    public void delete(Long id) throws DataAccessException;
    
    public Categorie update(Categorie a) throws DataAccessException;
    
    public Categorie save(Categorie a) throws DataAccessException;
   
    public List<Categorie> findAll() throws DataAccessException;
    
    public Long size() throws DataAccessException;
    
}
