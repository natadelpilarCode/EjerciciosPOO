/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class RectanguloServicio {
    public Rectangulo crearRectangulo()
    {
        Scanner leer = new Scanner(System.in);
        Rectangulo rec = new Rectangulo();
        System.out.println("Digite la base del rectángulo");
        rec.setBase(leer.nextInt());
        System.out.println("Digite la altura del rectángulo");
        rec.setAltura(leer.nextInt());
        return rec;
    }
    
    public int CalcularSuperficie(Rectangulo rec)
    {
        return rec.getBase()*rec.getAltura();
    }
    
    public int CalcularPerimetro(Rectangulo rec)
    {
        return (rec.getBase()+rec.getAltura()) * 2;
    }
    
    public void DibujarRectangulo(Rectangulo rec){
        System.out.println("Dibujando rectángulo de base " + rec.getBase() + " y altura " + rec.getAltura());
        for (int i = 0; i < rec.getAltura(); i++) {
            for (int j = 0; j < rec.getBase(); j++) {
                if(i==0 || i==rec.getAltura()-1 || j== 0 || j==rec.getBase()-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println("");
        }
    }
}
