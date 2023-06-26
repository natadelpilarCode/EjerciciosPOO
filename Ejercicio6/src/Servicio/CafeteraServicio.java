/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class CafeteraServicio {
    public void llenarCafetera(Cafetera cafe)
    {
        cafe.setCantidadActual(cafe.getCapacidadMaxima());
    }
    
    public int servirTaza(int taza,Cafetera cafe)
    {
        if(cafe.getCantidadActual()>= taza)
        {
            cafe.setCantidadActual(cafe.getCantidadActual() - taza);
            return cafe.getCantidadActual();
        }
        else
        {
            int cantidad = cafe.getCantidadActual();
            cafe.setCantidadActual(-1);
            return cantidad;
        }       
        
    }
    
    public void vaciarCafetera(Cafetera cafe){
        cafe.setCantidadActual(0);
    }
    
    public void agregarCafe(int agregar,Cafetera cafe)
    {
        cafe.setCantidadActual(cafe.getCantidadActual()+agregar);
    }
    
    public void Menu(Cafetera cafe)
    {
        Scanner leer = new Scanner(System.in);

        System.out.println("Bienvenido a Nesspreso \n Digite la opción que desea");
        System.out.println("1. Llenar Cafetera");
        System.out.println("2. Servir Taza");
        System.out.println("3. Vaciar Cafetera");
        System.out.println("4. Agregar Café");
        System.out.println("5. Salir");
        int opc = leer.nextInt();
        switch(opc)
        {
            case 1:
                llenarCafetera(cafe);
                System.out.println("Cafetera llena:" + cafe.getCapacidadMaxima());
                Menu(cafe);
                break;
            case 2:
                if(cafe.getCantidadActual()>0)
                {
                    System.out.println("Digite la cantidad que desea servir");

                    int cantidad = servirTaza(leer.nextInt(), cafe);
                    if(cafe.getCantidadActual()<0)
                        System.out.println("No hay suficiente cafe, solamente se llenó:"+ cantidad);
                    else
                        System.out.println("Se sirvió la taza con éxito");
                }
                else
                    System.out.println("La cafetera está vacía. Debe llenarla o agregar café");
                Menu(cafe);
                break;
            case 3:
                vaciarCafetera(cafe);
                System.out.println("Se vació la cafetera con éxito");
                Menu(cafe);
                break;
            case 4:        
                System.out.println("Digite la cantidad de café que desea agregar");
                int agregar = leer.nextInt();
                agregarCafe(agregar, cafe);
                if(cafe.getCantidadActual()>cafe.getCapacidadMaxima())
                {
                    System.out.println("Sobraron " + (cafe.getCantidadActual() - cafe.getCapacidadMaxima()) + ", la cafetera quedó llena");
                    llenarCafetera(cafe);
                }                
                else
                {                    
                    System.out.println("Se agregó " + agregar + " a la cafetera, quedó en total " + cafe.getCantidadActual());
                }
                Menu(cafe);
                break;
            
            case 5:
                System.out.println("Fue un gusto ayudarte, vuelve pronto");
                break;
            default:
                System.out.println("Opción incorrecta, vuelva a intentar");
                Menu(cafe);
                break;
        }
        
    }
}
