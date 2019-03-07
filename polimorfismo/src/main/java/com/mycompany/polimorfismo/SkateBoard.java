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
    private float boardlength;

    public SkateBoard(float myboardlength, String mybrand, String mymodel) {
        super(mybrand, mymodel);
        this.boardlength = myboardlength;
    }
    public float getMyboardlength() {
        return boardlength;
    }

    public void setMyboardlength(float myboardlength) {
        this.boardlength = myboardlength;
    }
    public void info2(){
        System.out.print("SOY PATINETA");
    }
    
}
