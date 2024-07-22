/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.factorial_numero;

/**
 *
 * @author USER
 */
import java.util.*;
public class Factorial_Numero {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int n=teclado.nextInt();
        int factorial=1;
        for (int i=1;i<=n;i++){
            factorial=factorial*i;
        }
     System.out.println("El factorial de: "+n+" es: "+factorial);
    }
       }
    
   