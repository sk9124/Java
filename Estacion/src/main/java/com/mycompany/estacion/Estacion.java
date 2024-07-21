/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estacion;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */


public class Estacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Ingresa un número de mes (1-12): ");
        int mes = scanner.nextInt();

        String estacion;

        
        if (mes == 12 || mes == 1 || mes == 2) {
            estacion = "Invierno";
        } else if (mes >= 3 && mes <= 5) {
            estacion = "Primavera";
        } else if (mes >= 6 && mes <= 8) {
            estacion = "Verano";
        } else if (mes >= 9 && mes <= 11) {
            estacion = "Otoño";
        } else {
            estacion = "Mes no válido";
        }

        
        System.out.println("La estación del año es: " + estacion);
    }
}

