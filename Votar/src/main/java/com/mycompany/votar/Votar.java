/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.votar;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Votar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu edad: ");
        int edad = scanner.nextInt();
        
    if (edad >= 18){
       
        System.out.println("Eres apto para votar.");
    } else {
        System.out.println("No eres apto para votar.");
    }
    }
}
