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
 * @author MateoG
 * @version 1.0
 */
public class MetodoPrincipal {
    /**
     * Metodo para llenar un array de vehiculos
     * 
     */ 
    public void metodo(){
        ArrayList<Vehicle> listaVehiculos=new ArrayList<Vehicle>();
        SkateBoard patineta = new SkateBoard((float)5.5,"DC","M17");
        Vehicle vehicle = new SkateBoard((float)5.5,"DC","M17");
        Vehicle vehicle2 = new Jet(5,"GAS","DC","M17");
        //vehicle.info2();
        Car car = new Car("grande","combustible","mercedez","gtx");
        listaVehiculos.add(patineta);
        listaVehiculos.add(vehicle);
        listaVehiculos.add(vehicle2);
        listaVehiculos.add(car);
        ;
        for(Vehicle vehiculo:listaVehiculos){
            if(vehiculo instanceof Car){
                ((Car)vehiculo).info3();
            }else{
                if(vehiculo instanceof Jet){
                ((Jet)vehiculo).info3();
            }else{
                    vehiculo.info2();
                }
            }            
        }
    }
    
}
