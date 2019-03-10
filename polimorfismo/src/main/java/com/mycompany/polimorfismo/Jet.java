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
public class Jet extends PoweredVehicle{
    /**
     * Variable tipo entero para el motor
     */
    int enginecount;
    /**
     * Constructor con motor, tipo de combustible, marca y modelo
     * @param  enginecount guarda motor
     * @param tipefuel guarda combustible
     * @param mybrand guarda marca
     * @param mymodel guarda modelo
     */ 
    public Jet(int enginecount, String tipefuel, String mybrand, String mymodel) {
        super(tipefuel, mybrand, mymodel);
        this.enginecount = enginecount;
    }
    /**
     * Método soy jet
     * 
     */ 
    public void info3(){
        System.out.print("SOY JET\n");
    }

    public int getEnginecount() {
        return enginecount;
    }

    public void setEnginecount(int enginecount) {
        this.enginecount = enginecount;
    }
}
