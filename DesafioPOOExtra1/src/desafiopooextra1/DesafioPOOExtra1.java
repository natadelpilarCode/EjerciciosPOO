/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafiopooextra1;

import Entidad.Vehiculo;
import Servicio.VehiculoServicio;

/**
 *
 * @author DELL
 */
public class DesafioPOOExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VehiculoServicio vehServ = new VehiculoServicio();
        Vehiculo v1 = vehServ.crearVehiculo();
        Vehiculo v2 = vehServ.crearVehiculo();
        Vehiculo v3 = vehServ.crearVehiculo();
        //Movimiento durante 5 segundos
        vehServ.Moverse(v1, 5);
        System.out.println("El vehículo 1 de tipo: "+ v1.getTipo() + " se movió " + v1.getDistanciaRecorrida() + " durante 5 segundos");
        vehServ.Moverse(v2, 5);
        System.out.println("El vehículo 2 de tipo: "+ v2.getTipo() + " se movió " + v2.getDistanciaRecorrida() + " durante 5 segundos");
        vehServ.Moverse(v3, 5);
        System.out.println("El vehículo 3 de tipo: "+ v3.getTipo() + " se movió " + v3.getDistanciaRecorrida() + " durante 5 segundos");
        
        //Movimiento durante 10 segundos
        vehServ.Moverse(v1, 10);
        System.out.println("El vehículo 1 de tipo: "+ v1.getTipo() + " se movió " + v1.getDistanciaRecorrida() + " durante 10 segundos");
        vehServ.Moverse(v2, 10);
        System.out.println("El vehículo 2 de tipo: "+ v2.getTipo() + " se movió " + v2.getDistanciaRecorrida() + " durante 10 segundos");
        vehServ.Moverse(v3, 10);
        System.out.println("El vehículo 3 de tipo: "+ v3.getTipo() + " se movió " + v3.getDistanciaRecorrida() + " durante 10 segundos");
        
        //Movimiento durante 60 segundos
        vehServ.Moverse(v1, 60);
        System.out.println("El vehículo 1 de tipo: "+ v1.getTipo() + " se movió " + v1.getDistanciaRecorrida() + " durante 60 segundos");
        vehServ.Moverse(v2, 60);
        System.out.println("El vehículo 2 de tipo: "+ v2.getTipo() + " se movió " + v2.getDistanciaRecorrida() + " durante 60 segundos");
        vehServ.Moverse(v3, 60);
        System.out.println("El vehículo 3 de tipo: "+ v3.getTipo() + " se movió " + v3.getDistanciaRecorrida() + " durante 60 segundos");
        
        //Movimiento durante 60 segundos
        vehServ.Moverse(v1, 300);
        System.out.println("El vehículo 1 de tipo: "+ v1.getTipo() + " se movió " + v1.getDistanciaRecorrida() + " durante 300 segundos");
        vehServ.Frenar(v1);
        vehServ.Moverse(v2, 300);
        System.out.println("El vehículo 2 de tipo: "+ v2.getTipo() + " se movió " + v2.getDistanciaRecorrida() + " durante 300 segundos");
        vehServ.Frenar(v2);        
        vehServ.Moverse(v3, 300);        
        System.out.println("El vehículo 3 de tipo: "+ v3.getTipo() + " se movió " + v3.getDistanciaRecorrida() + " durante 300 segundos");
        vehServ.Frenar(v3);
        if(v1.getDistanciaRecorrida()>v2.getDistanciaRecorrida() && v1.getDistanciaRecorrida() > v3.getDistanciaRecorrida())
        {
            System.out.println("El vehículo 1 avanzó más con una distancia de " + v1.getDistanciaRecorrida() + " metros");
        }
        else if(v2.getDistanciaRecorrida()>v1.getDistanciaRecorrida() && v2.getDistanciaRecorrida() > v3.getDistanciaRecorrida())
            System.out.println("El vehículo 2 avanzó más con una distancia de " + v2.getDistanciaRecorrida() + " metros");
        else
            System.out.println("El vehículo 3 avanzó más con una distancia de " + v3.getDistanciaRecorrida() + " metros");
    }
}
