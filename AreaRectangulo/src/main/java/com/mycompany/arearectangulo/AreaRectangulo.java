/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arearectangulo;

/**
 *
 * @author USER
 */
import java.util.Scanner; 
public class AreaRectangulo {

    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        
        System.out.println("Ingrese el ancho del rectangulo: ");
        int num1=teclado.nextInt();
        System.out.println("Ingrese el largo del rectangulo: ");
        int num2=teclado.nextInt();
        int area=num1*num2;
        System.out.println("El area del rectangulo es: "+area);        
         
    }
}
