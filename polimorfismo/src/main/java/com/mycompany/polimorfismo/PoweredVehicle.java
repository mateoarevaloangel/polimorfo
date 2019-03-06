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
    String mytipefuel;

    public PoweredVehicle(String mybrand, String mymodel) {
        super(mybrand, mymodel);
    }

    public String getMytipefuel() {
        return mytipefuel;
    }

    public void setMytipefuel(String mytipefuel) {
        this.mytipefuel = mytipefuel;
    }
    
}
