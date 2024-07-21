/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sueldo;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Sueldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Ingresa tu salario bruto mensual: ");
        double salarioBruto = scanner.nextDouble();

        
        System.out.print("Ingresa el porcentaje de impuestos: ");
        double porcentajeImpuestos = scanner.nextDouble();

       
        System.out.print("Ingresa las deducciones adicionales: ");
        double deduccionesAdicionales = scanner.nextDouble();

        
        double impuesto = salarioBruto * (porcentajeImpuestos /     100);

        
        double salarioNeto = salarioBruto - impuesto - deduccionesAdicionales;

        
        System.out.println("Tu salario neto es: " + salarioNeto);
    }
}

