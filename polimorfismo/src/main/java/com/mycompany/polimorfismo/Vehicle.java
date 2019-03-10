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
public abstract class Vehicle implements IVehicle{
    /**
     * Variable tipo string para la marca
     */
    String mybrand;
    /**
     * Variable tipo string para el modelo
     */
    String mymodel;
    /**
     * Constructor con marca y modelo
     * @param mybrand guarda marca
     * @param mymodel guarda modelo
     */ 
    public Vehicle(String mybrand, String mymodel) {
        this.mybrand = mybrand;
        this.mymodel = mymodel;
    }    
    /**
     * Metodo soy vehiculo
     * 
     */ 
    public void info(){
        System.out.print("SOY VEHICULO");
    }
    
    public String getMybrand() {
        return mybrand;
    }

    public String getMymodel() {
        return mymodel;
    }

    public void setMybrand(String mybrand) {
        this.mybrand = mybrand;
    }

    public void setMymodel(String mymodel) {
        this.mymodel = mymodel;
    }
    
}
