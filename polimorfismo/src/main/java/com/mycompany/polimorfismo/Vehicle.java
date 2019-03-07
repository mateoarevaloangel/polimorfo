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
public abstract class Vehicle implements IVehicle{
    String mybrand;
    String mymodel;

    public Vehicle(String mybrand, String mymodel) {
        this.mybrand = mybrand;
        this.mymodel = mymodel;
    }    
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
