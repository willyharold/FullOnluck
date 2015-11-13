/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.harold.fullonluck.serviceImpl;

import com.harold.fullonluck.dao.CommandeDao;
import com.harold.fullonluck.entities.Commande;
import com.harold.fullonluck.service.CommandeServ;
import com.royken.generic.dao.DataAccessException;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author harold
 */
@Transactional
public class CommandeServImpl implements CommandeServ{

    private CommandeDao commandeDao;

    public Commande findByid(Long id) throws DataAccessException {
        return commandeDao.findById(id);
    }

    public void delete(Long id) throws DataAccessException {
        commandeDao.delete(commandeDao.findById(id));
    }

    public Commande update(Commande a) throws DataAccessException {
        return commandeDao.update(a);
    }

    public Commande save(Commande a) throws DataAccessException {
        return commandeDao.create(a);
    }

    public List<Commande> findAll() throws DataAccessException {
        return commandeDao.findAll();
    }

    public Long size() throws DataAccessException {
        return commandeDao.count();
    }

    public CommandeDao getCommandeDao() {
        return commandeDao;
    }

    public void setCommandeDao(CommandeDao commandeDao) {
        this.commandeDao = commandeDao;
    }
    
    
    
}
