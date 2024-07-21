/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.media;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double suma = 0;
        int contador = 0;
        System.out.println("Ingresa numeros positivos.");
        while (true) {
            System.out.print("Ingresa un numero: ");
            double numero = scanner.nextDouble();            
            if (numero < 0) {
                break;
            }      
            if (numero >= 0) {
                suma += numero;
                contador++;
            }
        }
        if (contador > 0) {
            double media = suma / contador;
            System.out.println("La media de los numeros ingresados es: " + media);
        } else {
            System.out.println("No se ingresaron numeros positivos.");
        }
    }
}

