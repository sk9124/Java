/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calcular_precio_con_descuento;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class Calcular_Precio_Con_Descuento {

    public static void main(String[] args) {
     
        Scanner teclado=new Scanner(System.in);
        
    System.out.println("Ingrese el precio del producto: ");
    float precio = teclado.nextFloat();
    
    if (precio<=100){
     System.out.println("No se realizo ningun descuento el precio es: "+precio);
   
    }else if (precio >100 && precio <= 200){
    float descuento=(float) (precio*0.10);
            float resultado = precio-descuento;
        System.out.println("Con el descuento aplicado usted pagara : "+resultado);
    
    }else if(precio >200 && precio <=500){
    float descuento=(float) (precio*0.20);
            float resultado = precio-descuento;
            System.out.println("Con el descuento aplicado usted pagara: "+resultado);
            
    }else if (precio>500){
    float descuento=(float) (precio*0.25);
            float resultado = precio-descuento;
            System.out.println("Con el descuento aplicado usted pagara: "+resultado);
    }       
    }
}
