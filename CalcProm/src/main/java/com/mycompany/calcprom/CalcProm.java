/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calcprom;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */

public class CalcProm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double parciales, proyecto, examenFinal;

        do {
            System.out.print("Ingresa la calificación de los parciales: ");
            parciales = scanner.nextDouble();
        } while (parciales < 0 || parciales > 100);
      
        do {
            System.out.print("Ingresa la calificación del proyecto: ");
            proyecto = scanner.nextDouble();
        } while (proyecto < 0 || proyecto > 100);

        do {
            System.out.print("Ingresa la calificación del examen final: ");
            examenFinal = scanner.nextDouble();
        } while (examenFinal < 0 || examenFinal > 100);


        double Final = (parciales * 0.4) + (proyecto * 0.3) + (examenFinal * 0.3);


        System.out.println("Tu calificación final es: " + Final);
    }
}
