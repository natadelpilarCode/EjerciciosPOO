/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import Entidad.Operacion;
import Servicio.OperacionServicio;

/**
 *Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda
en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main

g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
 * @author DELL
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        OperacionServicio opServ = new OperacionServicio();
        Operacion op = opServ.CrearOperacion();
        System.out.println(op.getNumero1() + " + " + op.getNumero2() + " = "+opServ.suma(op));
        System.out.println(op.getNumero1() + " - " + op.getNumero2() + " = "+opServ.resta(op));
        int mult = opServ.multiplicar(op);
        double div = opServ.dividir(op);
        if(mult == 0)
            System.out.println("Error al intentar multiplicar por 0");
        else
            System.out.println(op.getNumero1() + " * " + op.getNumero2() + " = "+ mult);
        if(div == 0)
            System.out.println("Error al intentar dividir por 0");
        else
            System.out.println(op.getNumero1() + " / " + op.getNumero2() + " = "+ div);
        
    }
    
}
