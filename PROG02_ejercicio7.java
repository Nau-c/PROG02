/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog02_ejercicio7;

import java.util.Scanner;

/**
 * 7.- Diseña un programa Java para resolver una ecuación de primer grado con una incógnita (x), 
 * suponiendo que los coeficientes de la ecuación (C1 y C2) se introducen desde teclado.
C1x + C2 = 0
 */



/**
 *
 * @author Nauzet López Mendoza
 */
public class PROG02_ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos la clase en el paquete de java , que recogera las entradas primitivas 
     Scanner keyboard = new Scanner(System.in); 
     float c1, c2; // Declaramos el tipo de dato que vamos a recoger, float porque puede introducirse decimales
     
     System.out.print("\tIntroduce un número: ");
     c1 = keyboard.nextInt();
    System.out.print("\tIntroduce otro número: ");
     c2 = keyboard.nextInt();
     
     System.out.println(" \tEl resultado de la división es: " +(c2/c1));
     System.out.printf("\tLa ecuación %.1fx + %.1f = 0 es: " ,c1,c2,(-(c2/c1)));
    }
}
