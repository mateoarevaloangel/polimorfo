/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.polimorfismo;

import java.util.ArrayList;

/**
 *
 * @author daniel
 */
public class MetodoPrincipal {
    public void metodo(){
        ArrayList<Vehicle> listaVehiculos=new ArrayList<Vehicle>();
        SkateBoard patineta = new SkateBoard((float)5.5,"DC","M17");
        Vehicle vehicle = new SkateBoard((float)5.5,"DC","M17");
        //vehicle.info2();
        Car car = new Car("grande","combustible","mercedez","gtx");
        listaVehiculos.add(patineta);
        listaVehiculos.add(vehicle);
        listaVehiculos.add(car);
        for(Vehicle tabla:listaVehiculos){
            tabla.info2();
        }
        car.info();
        //System.out.println(car.getMyenginesize()); 
    }
    
}
