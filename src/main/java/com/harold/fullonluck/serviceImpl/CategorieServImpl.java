/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.harold.fullonluck.serviceImpl;

import com.harold.fullonluck.dao.CategorieDao;
import com.harold.fullonluck.entities.Categorie;
import com.harold.fullonluck.service.CategorieSev;
import com.royken.generic.dao.DataAccessException;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author harold
 */
@Transactional
public class CategorieServImpl implements CategorieSev{
    
    private CategorieDao categorieDao;
    public Categorie findByid(Long id) throws DataAccessException {
        return categorieDao.findById(id);
    }

    public void delete(Long id) throws DataAccessException {
        categorieDao.delete(categorieDao.findById(id));
    }

    public Categorie update(Categorie a) throws DataAccessException {
        return categorieDao.update(a);
    }

    public Categorie save(Categorie a) throws DataAccessException {
        return categorieDao.create(a);
    }

    public List<Categorie> findAll() throws DataAccessException {
        return categorieDao.findAll();
    }

    public Long size() throws DataAccessException {
        return categorieDao.count();
    }

    public CategorieDao getCategorieDao() {
        return categorieDao;
    }

    public void setCategorieDao(CategorieDao categorieDao) {
        this.categorieDao = categorieDao;
    }
    
    
}
