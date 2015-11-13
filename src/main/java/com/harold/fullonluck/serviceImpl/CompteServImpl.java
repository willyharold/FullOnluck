/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.harold.fullonluck.serviceImpl;

import com.harold.fullonluck.dao.CompteDao;
import com.harold.fullonluck.entities.Compte;
import com.harold.fullonluck.service.CompteServ;
import com.royken.generic.dao.DataAccessException;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author harold
 */
@Transactional
public class CompteServImpl implements CompteServ{
    
    private CompteDao compteDao;
    public Compte findByid(Long id) throws DataAccessException {
        return compteDao.findById(id);
    }

    public void delete(Long id) throws DataAccessException {
        compteDao.delete(compteDao.findById(id));
    }

    public Compte update(Compte a) throws DataAccessException {
        return compteDao.update(a);
    }

    public Compte save(Compte a) throws DataAccessException {
        return compteDao.create(a);
    }

    public List<Compte> findAll() throws DataAccessException {
        return compteDao.findAll();
    }

    public Long size() throws DataAccessException {
        return compteDao.count();
    }

    public CompteDao getCompteDao() {
        return compteDao;
    }

    public void setCompteDao(CompteDao compteDao) {
        this.compteDao = compteDao;
    }
    
    
}
