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
public class Car extends PoweredVehicle{
    /**
     * Variable tipo string para el tamaño del motor
     */
    String enginesize;
    /**
     * Constructor con tamaño del motor, tipo de combustible, marca y modelo
     * @param enginesize guarda el tamaño del motor
     * @param tipefuel guarda el combustible
     * @param mybrand guarda la marca
     * @param mymodel guarda el modelo
     */ 
    public Car(String enginesize, String tipefuel, String mybrand, String mymodel) {
        super(tipefuel, mybrand, mymodel);
        this.enginesize = enginesize;
    }
    /**
     * Método soy carro
     * 
     */  
    public void info3(){
        System.out.print("SOY CARRO\n");
    }
    
    public String getMyenginesize() {
        return enginesize;
    }

    public void setMyenginesize(String myenginesize) {
        this.enginesize = myenginesize;
    }
    
}
