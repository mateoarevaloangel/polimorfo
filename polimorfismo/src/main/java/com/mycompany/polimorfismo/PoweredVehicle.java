/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.polimorfismo;

/**
 *
 * @author daniel
 */
public class PoweredVehicle extends Vehicle{
    String tipefuel;

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

    @Override
    public void info2() {
        System.out.print("SOY VEHICULO MOTORIZADO");
    }
    
}
