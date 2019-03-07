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
public class Biccycle extends Vehicle{
    String mygearcount;

    public Biccycle(String mygearcount, String mybrand, String mymodel) {
        super(mybrand, mymodel);
        this.mygearcount = mygearcount;
    }

    public String getMygearcount() {
        return mygearcount;
    }

    public void setMygearcount(String mygearcount) {
        this.mygearcount = mygearcount;
    }

    @Override
    public void info2() {
        System.out.print("SOY BICICLETA\n");
    }
}
