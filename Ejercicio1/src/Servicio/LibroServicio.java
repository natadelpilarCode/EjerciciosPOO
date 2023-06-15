/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class LibroServicio {
    
    public Libro CrearLibro()
    {
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite el ISBN del libro");
        String isbn = leer.nextLine();
        System.out.println("Digite el título del libro");
        String titulo = leer.nextLine();
        System.out.println("Digite el autor del libro");
        String autor = leer.nextLine();
        System.out.println("Digite el número de páginas del libro");
        int numPag = leer.nextInt();
        Libro datosLibro = new Libro(isbn,titulo,autor,numPag);
        return datosLibro;
    }
    
    public void MostrarLibro(Libro datoLibro)
    {
        System.out.println("El ISBN del libro es:"+datoLibro.isbn);
        System.out.println("El título del libro es:" + datoLibro.titulo);
        System.out.println("El autor del libro es:" + datoLibro.autor);
        System.out.println("El número de páginas del libro son:" + datoLibro.numPaginas);
    }
}
