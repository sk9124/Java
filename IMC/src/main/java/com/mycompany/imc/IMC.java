/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.imc;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class IMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu peso en kilogramos: ");
        double peso = scanner.nextDouble();

        System.out.print("Ingresa tu altura en metros: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("Tu IMC es: " + imc);
    }
}