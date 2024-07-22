/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.brindar_informacion;

/**
 *
 * @author USER
 */
import java.util.*;
public class Brindar_Informacion {

    public static void main(String[] args) {
       Scanner scanner=new Scanner (System.in);
       System.out.println("Ingrese el primer nombre de su actor hombre favorito de Son Como Children en minusculas ");
       String entrada=scanner.nextLine();       
       
        switch (entrada) {
                case "adam" -> System.out.println("Adam Richard Sandler es un comediante, actor, escritor, cantante y productor estadounidense. Despues de convertirse en miembro del elenco de Saturday Night Live, ha protagonizado una gran cantidad de peliculas de Hollywood que han recaudado cerca de dos mil millones de dolares de taquilla.");
                case "kevin" -> System.out.println("Kevin James, es un actor y comediante estadounidense nominado al Emmy, conocido por su actuacion como Doug Heffernan en la serie The King of Queens y como Paul Blart en Heroe de centro comercial.");
                case "david" -> System.out.println("David Wayne Spade es un actor, comediante, escritor, presentador de television y productor estadounidense. Fue miembro del elenco de Saturday Night Live en los años 1990, iniciando mas tarde su carrera como actor tanto en television como en el cine.");
                case "chris" -> System.out.println("Christopher Julius Rock mas conocido como Chris Rock es un actor, comediante, guionista, productor y director de cine estadounidense. Fue elegido en los Estados Unidos como el quinto mejor comico monologuista de todos los tiempos por Comedy Central.");
                case "rob" -> System.out.println("Robert Michael Schneider  es un actor, comediante y guionista estadounidense ha protagonizado peliculas de comedia satirica tales como Estoy hecho un animal, Este cuerpo no es el mio,etc.");
                case "steve" -> System.out.println("Steven Vincent Buscemi, mas conocido como Steve Buscemi, es un actor, productor y director de cine y television estadounidense.");
                default -> System.out.println("No se encuentra informacion del actor que ingreso");
       }
    }
}
    
