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
    String enginesize;

    public Car(String enginesize, String tipefuel, String mybrand, String mymodel) {
        super(tipefuel, mybrand, mymodel);
        this.enginesize = enginesize;
    }
    
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
