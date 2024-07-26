/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.palindromo;

/**
 *
 * @author USER
 */
import java.util.*;

    public class Palindromo {
        public static void main (String[]args) {
Scanner sc = new Scanner (System.in);
    System.out.println("Introduce una palabra: ");
    String cadena_texto = sc.nextLine().toLowerCase();
    
    
     String reverso = "";
        
        for(int i = cadena_texto.length() - 1; i >=0; --i) {
              reverso = reverso + cadena_texto.charAt(i);
          }
    
        if (cadena_texto.equals(reverso)) {
          System.out.println("La palabra que ingreso es palindromo"+cadena_texto );
        }
        else {
          System.out.println("El texto que ingreso no es palindromo"+cadena_texto );
        }
    }
}