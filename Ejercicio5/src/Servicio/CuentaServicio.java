/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cuenta;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class CuentaServicio {
    public Cuenta CrearCuenta()
    {
        Scanner leer = new Scanner(System.in);
        Cuenta cuenta = new Cuenta();
        System.out.println("Digite su número de cuenta");
        cuenta.setNumeroCuenta(leer.nextInt());
        System.out.println("Digite su DNI");
        cuenta.setDni(leer.nextLong());
        System.out.println("Digite su saldo actual");
        cuenta.setSaldoActual(leer.nextDouble());
        return cuenta;
    }
    
    public void Ingresar(double ingreso, Cuenta cuenta){
        cuenta.setSaldoActual(ingreso+cuenta.getSaldoActual());
    }
    
    public void Retirar(double retiro, Cuenta cuenta){
        double total = cuenta.getSaldoActual()-retiro;
        if(total>0)
            cuenta.setSaldoActual(total);
        else
            cuenta.setSaldoActual(0);            
    }
    
    public double extraccionRapida(Cuenta cuenta)
    {
        double retiro = cuenta.getSaldoActual() * 0.2;
        double total = cuenta.getSaldoActual()-retiro;
        if(total>0)
            cuenta.setSaldoActual(total);
        return total; 
        
    }
    
    public double ConsultarSaldo(Cuenta cuenta)
    {
        return cuenta.getSaldoActual();
    }
    
    public void consultarDatos(Cuenta cuenta){
        System.out.println("El número de cuenta es:"+ cuenta.getNumeroCuenta());
        System.out.println("El DNI es:" + cuenta.getDni());
        System.out.println("El saldo actual es:" + cuenta.getSaldoActual());        
    }
    
    public void Menu(Cuenta cuenta)
    {
        Scanner leer = new Scanner(System.in);

        System.out.println("Digite la opción que desea");
        System.out.println("1. Consignar");
        System.out.println("2. Retirar");
        System.out.println("3. Extracción Rapida");
        System.out.println("4. Consultar Saldo");
        System.out.println("5. Consultar Datos");
        System.out.println("6. Salir");
        int opc = leer.nextInt();
        switch(opc)
        {
            case 1:
                    System.out.println("Digite el valor a consignar");
                    double abonar = leer.nextDouble();
                    Ingresar(abonar,cuenta);                
                Menu(cuenta);
                break;
            case 2:
                System.out.println("Digite el valor a retirar");
                    double retirar = leer.nextDouble();
                    Retirar(retirar,cuenta);
                    Menu(cuenta);
                break;
            case 3:
                double saldo = extraccionRapida(cuenta);
                if(saldo<=0)
                    System.out.println("No se puede retirar el 20% de su saldo, saldo insuficiente");
                Menu(cuenta);
                break;
            case 4:                
                System.out.println("Su saldo actual es:" + ConsultarSaldo(cuenta));
                Menu(cuenta);
                break;
            case 5:
                consultarDatos(cuenta);
                Menu(cuenta);
                break;
            case 6:
                System.out.println("Fue un gusto ayudarte, vuelve pronto");
                break;
            default:
                System.out.println("Opción incorrecta, vuelva a intentar");
                Menu(cuenta);
                break;
        }
        
    }
    
}
