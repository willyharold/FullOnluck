/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.harold.fullonluck.beans;

import com.harold.fullonluck.entities.Article;
import com.royken.generic.dao.DataAccessException;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import com.harold.fullonluck.service.ArticleServ;

/**
 *
 * @author harold
 */
@ManagedBean
@RequestScoped
public class AccueilBean {
    
    private List<String> images;
    @ManagedProperty(value = "#{ArticleServ}")
    ArticleServ articleSev;
    private List<Article> articles;
    
    
    @PostConstruct
    public void init() {
        images = new ArrayList<String>();      
        images.add("1.png");
        images.add("2.png");
        images.add("3.png");

    }
 
    public List<String> getImages() {
        return images;
    }
    
    
    public ArticleServ getArticleSev() {
        return articleSev;
    }

    public void setArticleSev(ArticleServ articleSev) {
        this.articleSev = articleSev;
    }

    public List<Article> getArticles() throws DataAccessException {
        return articleSev.findAll();
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }
}
