/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog02_ejercicio10;

import static java.time.Clock.system;

/**
 * 10.- Diseña un programa Java que realice las siguientes operaciones, en el orden que se muestran. 
 * Se indica la variable y el tipo de dato que recibe el valor o resultado de la operación indicada:
 */


/**
 *
 * @author Nauzet
 */
public class PROG02_ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      System.out.println("\n------- Conversiones entre enteros y coma flotante -------");
      float x = 4.5f;
      float y = 3.0f;
      int i = 2;
      int j;
      j = (int) (i * x); //Conversión de un int * float
      System.out.println("\nProducto de int por float: j = i * x = " + j);
      
      double dx = 2.0d;
      double dz;
      dz = dx * y; //Double * float =double
      System.out.print("Producto de float por double: dz=dx * y = " + dz);
      //-------------------------------------------------------------------------------
      System.out.println("\n------- Operaciones con byte -------");
      byte bx =	5;
      byte by =	2;
      byte bz = (byte) (bx - by); //Las operaciones entre tipos byte el resultado es int
      System.out.print("\nbyte: 5 - 2 = " + bz);
      bx = (byte) 128; //rango -128 a 127
      by = 1;
      bz = (byte) (bx - by); //convertimos a byte
      System.out.print("\nbyte -128 - 1 =  " +bz );
      bx = -128;
      by = 1;
      int entero = (bx - by);//Uso una variable intermedia de tipo entero para la conversión de tipos
      System.out.print("\n(int)(-128 - 1) =   " + entero);
      //---------------------------------------------------------------------------------------------
      System.out.println("\n------- Operaciones con short -------");
      short sx = 5;
      short sy = 2;
      short sz = (short) (sx - sy); //COnversion a short 
      System.out.print("\nshort: 10 - 1 = " + sz);
      sx = 32767; //rango de short -32,768 a 32,767
      sy = 1;
      sz = (short) (sx +sy);
      System.out.print("\nshort 32767 + 1 = " + sz);
     //--------------------------------------------------------------------------------------------------
      System.out.println("\n------- Operaciones con char -------");
      char cx = '\u000F'; //Declaramos una variable char siempre usamos comilla simple dentro
      char cy = '\u0001'; 
      int z = (char) (cx - cy);
      System.out.print("\nchar: - =  " +z);
      z = ((int)cx) - 1;
      System.out.printf("\nchar(%X) - 1 = %d  ",(int) cx,z);
      cx = '\uFFFF';
      z = cx;
      System.out.print("\n(int)= " +z);
      sx = (short) cx; //Conversión explicita requerida
      System.out.print("\n(short" +sx);
      sx = -32768;
      cx = (char) sx;
      z = (int) cx;
      sx = (short) cx; //Conversion
      System.out.print("\n "+sx+" short-char-int = " +z);
      sx = - 1;
      cx = (char) sx; //Conversión
      z = (int) cx; //Conversión
      System.out.print("\n"+sx+" short-char-int = " +z);
      //------------------------------------------------------------------------
        
        
    }
    
}
