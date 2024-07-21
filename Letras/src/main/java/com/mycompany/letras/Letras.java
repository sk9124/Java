/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.letras;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Letras{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa tu calificacion numerica (0-100):");
        int calificacion = scanner.nextInt();
        
        if (calificacion < 0 || calificacion > 100) {
            System.out.println("La calificacion debe estar entre 0 y 100.");
        } else {
            char letra;
            
            if (calificacion >= 90) {
                letra = 'A';
            } else if (calificacion >= 80) {
                letra = 'B';
            } else if (calificacion >= 70) {
                letra = 'C';
            } else if (calificacion >= 60) {
                letra = 'D';
            } else {
                letra = 'F';
            }
            
           
            System.out.println("Tu calificación es: " + letra);
        }
    }
}
