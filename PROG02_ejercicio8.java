/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog02_ejercicio8;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import java.util.Scanner;

/**
8.- Diseña un programa Java que calcule la suma, resta, multiplicación y división de dos números introducidos por teclado. 
* Incorpora también las funciones que permitan realizar la potencia de un número y la raíz cuadrada del otro. 
* Salida del programa para x=9, y=3:
Introducir primer numero: 9
Introducir segundo numero: 3
x = 9.0 y = 3.0
x + y = 12.0
x - y = 6.0
x * y = 27.0
x / y = 3.0
x ^ 2 = 81.0
√ x = 3.0

*/


/**
 *
 * @author Nauzet
 */
public class PROG02_ejercicio8 {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
            float x,y;
           
            //Creamos la clase en el paquete de java , que recogera las entradas primitivas 
            Scanner keyboard = new Scanner(System.in);
            //Creamos tipo de datos float con coma para la recogida de datos
            System.out.print("\tIntroduce un número: ");
            x = keyboard.nextInt();
            System.out.print("\tIntroduce otro número: ");
            y = keyboard.nextInt();
                
       
            System.out.printf(" \nEl resultado de la suma es: " + (x + y));
            System.out.printf(" \nEl resultado de la resta es: " + (x - y));
            System.out.printf(" \nEl resultado de la multiplicación es: " + (x * y));
            System.out.printf(" \nEl resultado de la división es: " + (x / y));
            System.out.printf(" \nEl resultado de la potencia es: " + (Math.pow(x,2)));
            System.out.printf("\nEl resultado de la raiz cuadrada de :" + (Math.pow(x,0.5)));
           
        
    }
    
}
