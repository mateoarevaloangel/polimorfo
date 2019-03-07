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
public class Jet extends PoweredVehicle{
    int enginecount;

    public Jet(int enginecount, String tipefuel, String mybrand, String mymodel) {
        super(tipefuel, mybrand, mymodel);
        this.enginecount = enginecount;
    }
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
