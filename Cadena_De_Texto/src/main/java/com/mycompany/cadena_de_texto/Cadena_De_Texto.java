/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cadena_de_texto;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class Cadena_De_Texto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String palabra;

        while (true) {
            System.out.println("Ingrese cualquier palabra o si quiere salir del programa no ingrese nada y de enter 7w7");
            palabra = scanner.nextLine();

            if (palabra.equals("")) {
                break;
            }

            String palabraEnMayusculas = palabra.toUpperCase();
            System.out.println("La palabra que ingreso en mayusculas: " + palabraEnMayusculas);
        }

        System.out.println("Este programa lamentablemente ha llegado a su fin :v ");
    }
}
