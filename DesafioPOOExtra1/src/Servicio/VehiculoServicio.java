/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Vehiculo;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class VehiculoServicio {
    public Vehiculo crearVehiculo()
    {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Vehiculo vh = new Vehiculo();
        System.out.println("Digite la marca del vehículo");
        vh.setMarca(leer.next());
        System.out.println("Digite el modelo del vehículo");
        vh.setModelo(leer.next());
        System.out.println("Digite el año del vehículo");
        vh.setAño(leer.nextInt());
        do
        {
            System.out.println("Digite el tipo del vehículo (Automovil,motocicleta o bicicleta)");
            vh.setTipo(leer.next());
        }while(!vh.getTipo().equalsIgnoreCase("automovil") && !vh.getTipo().equalsIgnoreCase("motocicleta") && !vh.getTipo().equalsIgnoreCase("bicicleta"));
        return vh;
    }
    
    public void Moverse(Vehiculo vh,int segundos){
        int metros = 0;
        switch(vh.getTipo().toLowerCase())
        {
            case "automovil":
                metros = 3;
                break;
            case "motocicleta":
                metros = 2;
                break;
            case "bicicleta":
                metros = 1;
                break;
        }
        
        vh.setDistanciaRecorrida(metros*segundos);
    }
    
    public void Frenar(Vehiculo vh){
        if(!vh.getTipo().toLowerCase().equals("bicicleta"))
            vh.setDistanciaRecorrida(vh.getDistanciaRecorrida()+2);
    }
    
}
