/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.harold.fullonluck.service;

import com.harold.fullonluck.entities.Compte;
import com.royken.generic.dao.DataAccessException;
import java.util.List;

/**
 *
 * @author harold
 */
public interface CompteServ {
    
    public Compte findByid(Long id) throws DataAccessException;
    
    public void delete(Long id) throws DataAccessException;
    
    public Compte update(Compte a) throws DataAccessException;
    
    public Compte save(Compte a) throws DataAccessException;
   
    public List<Compte> findAll() throws DataAccessException;
    
    public Long size() throws DataAccessException;
}
