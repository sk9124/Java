/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.es_numero_primo;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class Es_Numero_Primo {

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un numero entero: ");
        int numero = teclado.nextInt();
        if (esPrimo(numero)) {
            System.out.println("El numero que ingreso es primo: " + numero);
        } else {
            System.out.println("El numero que ingreso no es un numero primo: " + numero);
        }
    }
}