/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class CircunferenciaServicio {
    public Circunferencia crearCircunferencia()
    {
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite el radio de la circunferencia");
        Circunferencia cir = new Circunferencia(leer.nextDouble());
        return cir;
    }
    
    public void area(Circunferencia cir)
    {
        cir.area = Math.PI * Math.pow(cir.getRadio(), 2);
    }
    
    public void perimetro(Circunferencia cir)
    {
        cir.perimetro = 2 * Math.PI * cir.getRadio();
    }
}
