/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.harold.fullonluck.service;

import com.harold.fullonluck.entities.Article;
import com.royken.generic.dao.DataAccessException;
import java.util.List;

/**
 *
 * @author harold
 */
public interface ArticleSev {
   
    public Article findByid(Long id) throws DataAccessException;
    
    public void delete(Long id) throws DataAccessException;
    
    public Article update(Article a) throws DataAccessException;
    
    public Article save(Article a) throws DataAccessException;
   
    public List<Article> findAll() throws DataAccessException;
    
    public Long size() throws DataAccessException;
    
    
}
