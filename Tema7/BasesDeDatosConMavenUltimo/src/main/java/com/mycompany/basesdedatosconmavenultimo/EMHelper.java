/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.basesdedatosconmavenultimo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Víctor Gabriel Carvajal Aróstegui
 */
public class EMHelper {
    private static EMHelper emhelper;
    private EntityManagerFactory emf;
    private EntityManager em;
    private EMHelper(){
        emf = Persistence.createEntityManagerFactory("unidadPersistencia");
    }
    
    public static EMHelper getInstance(){
        if( emhelper == null){
            emhelper = new EMHelper();
        }
        return emhelper;
    }
    
    public EntityManager getEntityManager(){
        if( em == null || (em != null && !em.isOpen()))
            em = emf.createEntityManager();
        return em;
    }
    
    public void close(){
        emf.close();
        emhelper=null;
        em = null;
    }
}

