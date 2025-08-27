package ejercicio3;

import java.util.Scanner;

public class Main_Orientado_Objetos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca 10 numeros serparados por un espacio");
		System.out.println("Ejemplo: 1.9 2.5 3.7 2 1 6 3 4 5 2");
		String cadena = sc.nextLine(); 
		String vector[]=cadena.split(" ");
		double datos [] = new double[10];
		for (int i = 0; i < vector.length; i++) {
			datos[i]=Double.parseDouble(vector[i]);
		}
		
		Estadistica est = new Estadistica(datos);
		System.out.printf("El promedio es: %.2f%n",est.getPromedio());
		System.out.printf("La desviacion estandard es: %.5f%n",est.getDesviacion());

	}

}
