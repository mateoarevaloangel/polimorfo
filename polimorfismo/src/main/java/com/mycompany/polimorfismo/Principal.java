/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.polimorfismo;

/**
 *
 * @author daniel
 * @author MateoG
 * @version 1.0
 */


public class Principal {
    /**
     * Objeto tipo SkateBoard
     */
    SkateBoard patineta,p;
    /**
     * Método principal donde se agregan patinetas
     * 
     */ 
    public void principal(){
        patineta=new SkateBoard((float)5.5,"DC","M17");
        p=new SkateBoard((float)5.5,"DC","M17");
    }
    
}
