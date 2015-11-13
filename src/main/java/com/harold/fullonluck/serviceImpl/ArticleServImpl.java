/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.harold.fullonluck.serviceImpl;

import com.harold.fullonluck.dao.ArticleDao;
import com.harold.fullonluck.entities.Article;
import com.harold.fullonluck.service.ArticleSev;
import com.royken.generic.dao.DataAccessException;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author harold
 */
@Transactional
public class ArticleServImpl implements ArticleSev{
    
    private ArticleDao articleDao;

    public Article findByid(Long id) throws DataAccessException {
        return articleDao.findById(id);
    }

    public void delete(Long id) throws DataAccessException {
        articleDao.delete(articleDao.findById(id));
    }

    public Article update(Article a) throws DataAccessException {
        return articleDao.update(a);
    }

    public Article save(Article a) throws DataAccessException {
        return articleDao.create(a);
    }

    public List<Article> findAll() throws DataAccessException {
        return articleDao.findAll();
    }

    public Long size() throws DataAccessException {
        return articleDao.count();
    }

    public ArticleDao getArticleDao() {
        return articleDao;
    }

    public void setArticleDao(ArticleDao articleDao) {
        this.articleDao = articleDao;
    }
    
}
