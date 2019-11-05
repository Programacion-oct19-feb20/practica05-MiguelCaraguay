/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5;

import java.util.Scanner;

/**
 *
 * @author UTPL
 * Un padre de familia ha pagado tres cuotas de navidad de sus hijos la cuota1
 * fue de 15 dolares la cuota2 de 10 dolares y la cuota3 de 16 dorales
 * Generar un programa en lenguaje java que permita ingresar por teclado los 
 * valores de las cuotas, luego presentar el promedio de dolares pagados entre
 * las cuotas, a demas presentar un mensaje en pantalla (true o false)
 * dependiendo del promedio, si el promedio es mayor o igual a 11 deberia salir 
 * true, si el promedio es menor a 11 debe ser false
 * 
 */
public class Ejercicio1 {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
        
            int cuota1;
            int cuota2;
            int cuota3;
            
            
            System.out.println("Ingrese valor de cuota uno: ");
            cuota1 = entrada.nextInt();
            System.out.println("Ingrese valor de cuota dos: ");
            cuota2 = entrada.nextInt();
            System.out.println("Ingrese valor de cuota tres: ");
            cuota3 = entrada.nextInt();
            
            int promedio = (cuota1 + cuota2 + cuota3)/3;

            System.out.printf("El promedio de pago de cuotas es: %d\n"
                    + "Promedio: %s\n", promedio, promedio >= 11 );
                    //se realiza un condicional para dar valor de true o false
            
            
            
        }

    
}
