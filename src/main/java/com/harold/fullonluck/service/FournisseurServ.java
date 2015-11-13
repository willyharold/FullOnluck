/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.harold.fullonluck.service;

import com.harold.fullonluck.entities.Fournisseur;
import com.royken.generic.dao.DataAccessException;
import java.util.List;

/**
 *
 * @author harold
 */
public interface FournisseurServ {
    
    public Fournisseur findByid(Long id) throws DataAccessException;
    
    public void delete(Long id) throws DataAccessException;
    
    public Fournisseur update(Fournisseur a) throws DataAccessException;
    
    public Fournisseur save(Fournisseur a) throws DataAccessException;
   
    public List<Fournisseur> findAll() throws DataAccessException;
    
    public Long size() throws DataAccessException;
}
