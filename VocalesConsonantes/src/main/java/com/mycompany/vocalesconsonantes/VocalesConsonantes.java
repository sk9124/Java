/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.vocalesconsonantes;
import java.util.Scanner;

public class VocalesConsonantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa una letra o un espacio para terminar.");

        while (true) {
            
            System.out.print("Ingresa una letra: ");
            String entrada = scanner.nextLine();
           
            if (entrada.trim().isEmpty()) {
                System.out.println("Programa terminado.");
                break;
            }

            char letra = entrada.charAt(0);

            if (Character.isLetter(letra)) {
                letra = Character.toLowerCase(letra);
                if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                    System.out.println(letra + " es una vocal.");
                } else {
                    System.out.println(letra + " es una consonante.");
                }
            } else {
                System.out.println(letra + " no es una letra valida.");
            }
        }
    }
}

