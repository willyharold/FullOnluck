/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.harold.fullonluck.beans;

import com.harold.fullonluck.entities.Article;
import com.harold.fullonluck.entities.Utilisateur;
import com.harold.fullonluck.service.UtilisateurServ;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author harold
 */
@ManagedBean
@RequestScoped
public class UtilisateurBean {
    
    @ManagedProperty(value = "#{UtilisateurServ}")
    UtilisateurServ utisateurServ;
    private List<Utilisateur> UtilisateurServ;
    private Utilisateur utilisateur;

    
    
    public List<Utilisateur> getUtilisateurServ() {
        return UtilisateurServ;
    }

    public void setUtilisateurServ(List<Utilisateur> UtilisateurServ) {
        this.UtilisateurServ = UtilisateurServ;
    }

    
    public UtilisateurServ getUtisateurServ() {
        return utisateurServ;
    }

    public void setUtisateurServ(UtilisateurServ utisateurServ) {
        this.utisateurServ = utisateurServ;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }
    
    
}
