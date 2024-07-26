/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calcular_raiz;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class Calcular_Raiz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        double numero = scanner.nextDouble();

        double raizCuadrada = Math.sqrt(numero);

        System.out.println("La raíz cuadrada de " + numero + " es: " + raizCuadrada);
    }
}