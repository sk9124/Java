/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.banana;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class Banana {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese cualquier texto: ");
        String texto = scanner.nextLine();

        System.out.println("Ingrese la letra que quiere cambiar por otra: ");
        char caracterOriginal = scanner.nextLine().charAt(0);

        System.out.println("Ingrese la letra que la va a reemplazar : ");
        char caracterReemplazo = scanner.nextLine().charAt(0);

        String textoModificado = texto.replace(caracterOriginal, caracterReemplazo);

        System.out.println("Ahora dice: " + textoModificado);
    }
}