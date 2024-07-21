/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rectangulo;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Rectangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Ingresa la longitud del rectángulo: ");
        int longitud = scanner.nextInt();

        System.out.print("Ingresa la anchura del rectángulo: ");
        int anchura = scanner.nextInt();

       
        int area = longitud * anchura;

      
        System.out.println("El área del rectángulo es: " + area);
    }
}
