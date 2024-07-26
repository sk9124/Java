/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.maximo_comun_divisor;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class Maximo_Comun_Divisor {

    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int numero1 = teclado.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int numero2 = teclado.nextInt();
        int MCD = calcular_maximo_comun_divisor(numero1, numero2);
        System.out.println("El maximo comun divisor de " + numero1 + " y " + numero2 + " es: " + MCD);
        teclado.close();
    }

    public static int calcular_maximo_comun_divisor(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}