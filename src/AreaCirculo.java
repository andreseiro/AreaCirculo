/**
 * 
 * @author andreseiro
 * @version 1.0 feb 2022
 *
 * Programa que dado el radio, calcula su area y perimetro
 *
 */

import java.util.Scanner;

public class AreaCirculo {

	/**
	 * @see java.util.Scanner
	 */
	public static void main(String[] args) {
		//Declaración de variables
		double area, radio, perimetro; // área y radio
		Scanner leer = new Scanner(System.in);
		
		//Solicitar al usuario el dato
		System.out.print("Introduce el radio de un circulo: "); 
		radio =  leer.nextDouble();
		
		//Calcular el area y el perimetro
		area = Math.PI * (radio * radio); // para elevar al cuadrado otra opción es: Math.pow (r, 2)
		perimetro = 2 * Math.PI * radio;
		
		//mostrar la informacion en pantalla		
		System.out.println("El área de una circunferencia de radio " + radio + " es: " + area);
		System.out.println("Y el perimetro es: " + perimetro);

	}

}
