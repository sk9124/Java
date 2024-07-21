/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contadordedigitos;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class ContadorDeDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Ingresa un numero entero: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            numero = -numero;
        }

        int contador = 0;
        if (numero == 0) {
            contador = 1; 
        } else {
            while (numero > 0) {
                numero /= 10;
                contador++;
            }
        }

        
        System.out.println("El numero tiene " + contador + " digitos.");
    }
}
