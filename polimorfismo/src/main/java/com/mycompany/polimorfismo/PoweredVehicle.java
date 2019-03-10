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
public class PoweredVehicle extends Vehicle{
    /**
     * Variable tipo string para el tipo de combustible
     */
    String tipefuel;
    /**
     * Constructor con tipo de combustible, marca y modelo
     * @param  tipefuel guarda combustible
     * @param mybrand guarda marca
     * @param mymodel guarda modelo
     */ 
    public PoweredVehicle(String tipefuel, String mybrand, String mymodel) {
        super(mybrand, mymodel);
        this.tipefuel = tipefuel;
    }

    public String getMytipefuel() {
        return tipefuel;
    }

    public void setMytipefuel(String mytipefuel) {
        this.tipefuel = mytipefuel;
    }
    /**
     * Método vehiculo motorizado
     * 
     */ 
    @Override
    public void info2() {
        System.out.print("SOY VEHICULO MOTORIZADO\n");
    }
    
}
