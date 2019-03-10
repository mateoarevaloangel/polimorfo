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
public class Biccycle extends Vehicle{
    String mygearcount;
    
    /**
     * Constructor con engranaje marca y modelo
     * @param mygearcount guarda el engranaje
     * @param mybrand guarda la marca
     * @param mymodel guarda el modelo
     */   
    public Biccycle(String mygearcount, String mybrand, String mymodel) {
        super(mybrand, mymodel);
        this.mygearcount = mygearcount;
    }
    
    public String getMygearcount() {
        return mygearcount;
    }

    public void setMygearcount(String mygearcount) {
        this.mygearcount = mygearcount;
    }
    /**
     * Método soy bicicleta
     * 
     */   
    @Override
    public void info2() {
        System.out.print("SOY BICICLETA\n");
    }
}
