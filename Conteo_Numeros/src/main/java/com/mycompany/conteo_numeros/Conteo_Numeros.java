/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conteo_numeros;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class Conteo_Numeros {

    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        System.out.println("Ingrese la cantidad de numeros");
        int numeros=teclado.nextInt();
        int mayores=0;
        int menores=0;
        int iguales=0;
        
        for (int i=0;i<numeros; i++){
            System.out.println("Ingrese el numero "+(i+1)+":");
            int numero=teclado.nextInt();
           
            if (numero>0){
                mayores++;
            }else if (numero<0){
                menores++;
            }else {
                iguales++;
            }
        }  
    System.out.println("Los numeros mayores a 0 son: "+mayores);
    System.out.println("Los numeros menores a 0 son: "+menores);
    System.out.println("Los numeros iguales a 0 son: "+iguales);
    }
}
