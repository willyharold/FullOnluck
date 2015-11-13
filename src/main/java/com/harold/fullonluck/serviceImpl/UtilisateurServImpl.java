/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.harold.fullonluck.serviceImpl;

import com.harold.fullonluck.dao.UtilisateurDao;
import com.harold.fullonluck.entities.Utilisateur;
import com.harold.fullonluck.service.UtilisateurServ;
import com.royken.generic.dao.DataAccessException;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author harold
 */
@Transactional
public class UtilisateurServImpl implements UtilisateurServ{

    private UtilisateurDao utilisateurDao;
    
    public Utilisateur findByid(Long id) throws DataAccessException {
        return utilisateurDao.findById(id);
    }

    public void delete(Long id) throws DataAccessException {
        utilisateurDao.delete(utilisateurDao.findById(id));
    }

    public Utilisateur update(Utilisateur a) throws DataAccessException {
        return utilisateurDao.update(a);
        
    }

    public Utilisateur save(Utilisateur a) throws DataAccessException {

        return utilisateurDao.create(a);
    }

    public List<Utilisateur> findAll() throws DataAccessException {
        return utilisateurDao.findAll();
                
    }

    public Long size() throws DataAccessException {
        return utilisateurDao.count();
    }

    public UtilisateurDao getUtilisateurDao() {
        return utilisateurDao;
    }

    public void setUtilisateurDao(UtilisateurDao utilisateurDao) {
        this.utilisateurDao = utilisateurDao;
    }
    
    
}
