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
public class SkateBoard extends Vehicle{
    /**
     * Variable tipo float para la longitud de la patineta
     */
    private float boardlength;
    /**
     * Constructor con longitud de la patineta, marca y modelo
     * @param  myboardlength guarda longitud
     * @param mybrand guarda marca
     * @param mymodel guarda modelo
     */ 
    public SkateBoard(float myboardlength, String mybrand, String mymodel) {
        super(mybrand, mymodel);
        this.boardlength = myboardlength;
    }
    public float getMyboardlength() {
        return boardlength;
    }

    public void setMyboardlength(float myboardlength) {
        this.boardlength = myboardlength;
    }
    /**
     * Metodo soy patineta
     * 
     */ 
    public void info2(){
        System.out.print("SOY PATINETA\n");
    }
    
}
