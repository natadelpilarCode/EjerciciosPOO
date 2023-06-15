/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class OperacionServicio {
    
   public Operacion CrearOperacion(){
        Scanner leer = new Scanner(System.in);
        Operacion oper = new Operacion();
        System.out.println("Digite el primer número");
        oper.setNumero1(leer.nextInt());
        System.out.println("Digite el segundo número");
        oper.setNumero2(leer.nextInt());
        return oper;
   } 
   
   public int suma(Operacion oper){
       return oper.getNumero1() + oper.getNumero2();
   }
   
   public int resta(Operacion oper){
       return oper.getNumero1() - oper.getNumero2();
   }
   
   public int multiplicar(Operacion oper){
       if(oper.getNumero1()==0 || oper.getNumero2()==0)
           return 0;
       else
           return oper.getNumero1()*oper.getNumero2();
   }
   
   public double dividir(Operacion oper){
       if(oper.getNumero1()==0 || oper.getNumero2()==0)
           return 0;
       else
           return (double)oper.getNumero1()/oper.getNumero2();
   }
}
