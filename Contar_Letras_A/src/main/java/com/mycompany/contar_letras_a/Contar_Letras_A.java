/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contar_letras_a;

/**
 *
 * @author USER
 */
import java.util.*;
public class Contar_Letras_A {

    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        System.out.println("Ingrese una palabra: ");
        String palabra=teclado.nextLine();
        palabra=palabra.toLowerCase();
        
        int contador=0;
        for (int i=0; i<palabra.length(); i++){
            char letra=palabra.charAt(i);
            if (letra=='a'){
                contador++;
            }
        }
        System.out.println("La letra a en el texto que ingreso aparece: "+contador);
    }
}
