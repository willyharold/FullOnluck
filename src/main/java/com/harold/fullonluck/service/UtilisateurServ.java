/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.harold.fullonluck.service;

import com.harold.fullonluck.entities.Utilisateur;
import com.royken.generic.dao.DataAccessException;
import java.util.List;

/**
 *
 * @author harold
 */
public interface UtilisateurServ {
    public Utilisateur findByid(Long id) throws DataAccessException;
    
    public void delete(Long id) throws DataAccessException;
    
    public Utilisateur update(Utilisateur a) throws DataAccessException;
    
    public Utilisateur save(Utilisateur a) throws DataAccessException;
   
    public List<Utilisateur> findAll() throws DataAccessException;
    
    public Long size() throws DataAccessException;
}
