/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.harold.fullonluck.service;

import com.harold.fullonluck.entities.Marque;
import com.royken.generic.dao.DataAccessException;
import java.util.List;

/**
 *
 * @author harold
 */
public interface MarqueServ {
    
    public Marque findByid(Long id) throws DataAccessException;
    
    public void delete(Long id) throws DataAccessException;
    
    public Marque update(Marque a) throws DataAccessException;
    
    public Marque save(Marque a) throws DataAccessException;
   
    public List<Marque> findAll() throws DataAccessException;
    
    public Long size() throws DataAccessException;
}
