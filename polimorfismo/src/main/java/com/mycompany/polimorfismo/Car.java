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
public class Car extends PoweredVehicle{
    String myenginesize;

    public Car(String myenginesize, String mybrand, String mymodel) {
        super(mybrand, mymodel);
        this.myenginesize = myenginesize;
    }

    public String getMyenginesize() {
        return myenginesize;
    }

    public void setMyenginesize(String myenginesize) {
        this.myenginesize = myenginesize;
    }
    
}
