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
public class SkateBoard extends Vehicle{
    String myboardlength;

    public SkateBoard(String myboardlength, String mybrand, String mymodel) {
        super(mybrand, mymodel);
        this.myboardlength = myboardlength;
    }

    public String getMyboardlength() {
        return myboardlength;
    }

    public void setMyboardlength(String myboardlength) {
        this.myboardlength = myboardlength;
    }
    
}
