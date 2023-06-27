/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import Entidad.Persona;
import Servicio.PersonaServicio;

/**
 * Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
 Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
 Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas

cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores
 * @author DELL
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersonaServicio perServ = new PersonaServicio();
        Persona p1 = perServ.crearPersona();        
        Persona p2 = perServ.crearPersona();        
        Persona p3 = perServ.crearPersona();        
        Persona p4 = perServ.crearPersona();
        
        perServ.MostrarValidacionPesoEdad(p1, 1);
        perServ.MostrarValidacionPesoEdad(p2, 2);
        perServ.MostrarValidacionPesoEdad(p3, 3);
        perServ.MostrarValidacionPesoEdad(p4, 4);
        
        int cantBajoPeso = 0,cantPesoIdeal = 0,cantSobrePeso=0,mayorEdad=0,menorEdad=0;
        if(perServ.calcularIMC(p1)== -1)
            cantBajoPeso ++;
        else if(perServ.calcularIMC(p1)== 0)
            cantPesoIdeal++;
        else
            cantSobrePeso++;
        
        if(perServ.calcularIMC(p2)== -1)
            cantBajoPeso ++;
        else if(perServ.calcularIMC(p2)== 0)
            cantPesoIdeal++;
        else
            cantSobrePeso++;
        
        if(perServ.calcularIMC(p3)== -1)
            cantBajoPeso ++;
        else if(perServ.calcularIMC(p3)== 0)
            cantPesoIdeal++;
        else
            cantSobrePeso++;
        
        if(perServ.calcularIMC(p4)== -1)
            cantBajoPeso ++;
        else if(perServ.calcularIMC(p4)== 0)
            cantPesoIdeal++;
        else
            cantSobrePeso++;
        
        if(p1.isMayorEdad())
            mayorEdad ++;
        else
            menorEdad ++;
        
        if(p2.isMayorEdad())
            mayorEdad ++;
        else
            menorEdad ++;
        
        if(p3.isMayorEdad())
            mayorEdad ++;
        else
            menorEdad ++;
        
        if(p4.isMayorEdad())
            mayorEdad ++;
        else
            menorEdad ++;
        
        double porcentajeBajoPeso = cantBajoPeso * 25;
        double porcentajePesoIdeal = cantPesoIdeal * 25;
        double porcentajeSobrepeso = cantSobrePeso * 25;
        double porcentajeMayorEdad = mayorEdad * 25;
        double porcentajeMenorEdad = menorEdad * 25;
        
        System.out.println("Porcentaje de personas con bajo peso:" + porcentajeBajoPeso);
        System.out.println("Porcentaje de personas con peso ideal:" + porcentajePesoIdeal);
        System.out.println("Porcentaje de personas con sobrepeso:" + porcentajeSobrepeso);
        System.out.println("Porcentaje de personas mayores de edad:" + porcentajeMayorEdad);
        System.out.println("Porcentaje de personas menores de edad:" + porcentajeMenorEdad);
        
    }
    
    
    
}
