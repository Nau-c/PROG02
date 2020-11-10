/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* Diseña un programa Java que solicite un número de 5 dígitos del teclado, 
 separe el número en sus dígitos individuales y los muestre por pantalla. 
 Por ejemplo, si el número es 53123 que muestre:
 5 3 1 2 3
 */


package prog02_ejercicio9;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Nauzet
 */
public class PROG02_ejercicio9 {
    private static int cantidad;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   boolean entrynumber = true;
    String entrykeyboard = "";
        
        /**
o primero que tenemos que conocer es que la clase Scanner nos permite leer contenido insertado por consola de una forma sencilla. 
* Lo que tenemos que hacer es crear un Scanner sobre el elemento de consola que es el System.in
 */
      Scanner keyboard = new Scanner (System.in);
   /**
    * A partir de ese momento cada vez que queramos que el usuario nos de una entrada por teclado, 
    * en nuestro caso un número deberemos de llamar al método .nextInt()
    */
    
      
      // SOlicitamso que se introduzca el número
      System.out.print( "Introduzca un número de 5 digitos: " );
   
      entrykeyboard= keyboard.nextLine (); //Invocamos un método sobre un objeto Scanner
     
        if (entrykeyboard.length() != 5) {
            System.out.println ("No tiene longitud 5, entrada no válida");
        } else { System.out.println ("La longitud es correcta");}
   
 
      //Lo siguiente que vamos a hacer es convertirlo en una cadena String. 
      //Para ello utilizamos el método toString de Integer.
      String[] parts = entrykeyboard.split("");              
      System.out.println(Arrays.toString(parts));
      
    
        
    }
    
}
