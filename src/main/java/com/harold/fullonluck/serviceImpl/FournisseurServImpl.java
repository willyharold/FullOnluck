/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.harold.fullonluck.serviceImpl;

import com.harold.fullonluck.dao.FournisseurDao;
import com.harold.fullonluck.entities.Fournisseur;
import com.harold.fullonluck.service.FournisseurServ;
import com.royken.generic.dao.DataAccessException;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author harold
 */
@Transactional
public class FournisseurServImpl implements FournisseurServ{
    
    private FournisseurDao fournisseurDao;
    
    public Fournisseur findByid(Long id) throws DataAccessException {
        return fournisseurDao.findById(id);
    }

    public void delete(Long id) throws DataAccessException {
        fournisseurDao.delete(fournisseurDao.findById(id));
    }

    public Fournisseur update(Fournisseur a) throws DataAccessException {
        return fournisseurDao.update(a);
    }

    public Fournisseur save(Fournisseur a) throws DataAccessException {
        return fournisseurDao.create(a);
    }

    public List<Fournisseur> findAll() throws DataAccessException {
        return fournisseurDao.findAll();
    }

    public Long size() throws DataAccessException {
        return fournisseurDao.count();
    }

    public FournisseurDao getFournisseurDao() {
        return fournisseurDao;
    }

    public void setFournisseurDao(FournisseurDao fournisseurDao) {
        this.fournisseurDao = fournisseurDao;
    }
    
    
}
