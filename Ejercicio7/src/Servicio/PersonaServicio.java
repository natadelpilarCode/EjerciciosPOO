/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class PersonaServicio {
    public Persona crearPersona(){
        Scanner leer = new Scanner(System.in);
        Persona per = new Persona();
        System.out.println("Digite el nombre");
        per.setNombre(leer.next());
        System.out.println("Digite la edad");
        per.setEdad(leer.nextInt());
        System.out.println("Digite el peso en kilogramos");
        per.setPeso(leer.nextDouble());
        System.out.println("Digite la altura en metros");
        per.setAltura(leer.nextDouble());
        do {
            System.out.println("Digite el sexo ('M','H','O')");
            per.setSexo(leer.next().charAt(0));
            if(!String.valueOf(per.getSexo()).equalsIgnoreCase("H") && !String.valueOf(per.getSexo()).equalsIgnoreCase("M") && !String.valueOf(per.getSexo()).equalsIgnoreCase("O"))
                System.out.println("El sexo que digitaste no es válido, vuelve a intentar");
        } while (!String.valueOf(per.getSexo()).equalsIgnoreCase("H") && !String.valueOf(per.getSexo()).equalsIgnoreCase("M") && !String.valueOf(per.getSexo()).equalsIgnoreCase("O"));
        
        return per;
    }
    
    public int calcularIMC(Persona per)
    {
        per.setImc(per.getPeso()/(Math.pow(per.getAltura(), 2)));
        if(per.getImc()<20)
            return -1;
        else if(per.getImc()>=20 && per.getImc()<=25)
            return 0;
        else
            return 1;
    }
    
    public boolean esMayordeEdad(Persona per){
        if(per.getEdad()>=18)
            per.setMayorEdad(true);
        else
            per.setMayorEdad(false);
        return per.isMayorEdad();
    }
    
   public void MostrarValidacionPesoEdad(Persona per,int numPer)
   {
       switch(calcularIMC(per))
        {
            case -1:
                System.out.println("La persona " + numPer +": " + per.getNombre()+ " está por debajo de su peso ideal");
                break;
            case 0:
                System.out.println("La persona " + numPer +": " + per.getNombre()+ " está en su peso ideal");
                break;
            case 1:
                System.out.println("La persona " + numPer +": " + per.getNombre() + " está en sobrepeso");
                break;
        }
        if(esMayordeEdad(per))
            System.out.println("La persona " + numPer +": " + per.getNombre()+ " es mayor de edad");
        else
            System.out.println("La persona " + numPer +": " + per.getNombre() + " es menor de edad");
   }
}
