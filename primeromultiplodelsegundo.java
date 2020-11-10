/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "PRIMEROMULTIPLODELSEGUNDO.java."

import java.io.*;

public class primeromultiplodelsegundo {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int number;
		int number2;
		System.out.println("Introduce un número para saber si es multiplo del sguiente número");
		number = Integer.parseInt(bufEntrada.readLine());
		System.out.println("Introde el segundo número para saber si es multiplo del primero número");
		number2 = Integer.parseInt(bufEntrada.readLine());
		if (number%number2==0) {
			System.out.println(" El número 1 es multiplo del número 2 ");
		} else {
			System.out.println(" El número 1 no es multiplo del número 2 ");
		}
	}


}

