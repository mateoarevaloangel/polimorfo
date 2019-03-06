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
    String myenginecount;

    public Jet(String myenginecount, String mybrand, String mymodel) {
        super(mybrand, mymodel);
        this.myenginecount = myenginecount;
    }

    public String getMyenginecount() {
        return myenginecount;
    }

    public void setMyenginecount(String myenginecount) {
        this.myenginecount = myenginecount;
    }
    
}
