/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.harold.fullonluck.serviceImpl;

import com.harold.fullonluck.dao.MarqueDao;
import com.harold.fullonluck.entities.Marque;
import com.harold.fullonluck.service.MarqueServ;
import com.royken.generic.dao.DataAccessException;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;


/**
 *
 * @author harold
 */
@Transactional
public class MarqueServImpl implements MarqueServ{
    private MarqueDao marqueDao;

    public Marque findByid(Long id) throws DataAccessException {
        return marqueDao.findById(id);
        }

    public void delete(Long id) throws DataAccessException {
        marqueDao.delete(marqueDao.findById(id));
    }

    public Marque update(Marque a) throws DataAccessException {
        return marqueDao.update(a);
        }

    public Marque save(Marque a) throws DataAccessException {
        return marqueDao.create(a);
    }

    public List<Marque> findAll() throws DataAccessException {
        return marqueDao.findAll();
    }

    public Long size() throws DataAccessException {
        return marqueDao.count();
    }

    public MarqueDao getMarqueDao() {
        return marqueDao;
    }

    public void setMarqueDao(MarqueDao marqueDao) {
        this.marqueDao = marqueDao;
    }
    
    
}
