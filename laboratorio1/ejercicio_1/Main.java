package ejercicio_1;

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// Configurar Scanner para usar formato inglés (puntos decimales)
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("=== PRIMERA ECUACIÓN ===");
		System.out.println("Ingrese los 6 valores separados por espacios:");
		System.out.println("Ejemplo: 9.0 4.0 3.0 -5.0 -6.0 -21.0");

		// Leer toda la línea y luego procesar
		String linea = sc.nextLine();
		String[] valores = linea.split(" ");

		if (valores.length != 6) {
			System.out.println("Error: Debe ingresar exactamente 6 valores");
			return;
		}

		try {
			double a = Double.parseDouble(valores[0]);
			double b = Double.parseDouble(valores[1]);
			double c = Double.parseDouble(valores[2]);
			double d = Double.parseDouble(valores[3]);
			double e = Double.parseDouble(valores[4]);
			double f = Double.parseDouble(valores[5]);

			System.out.println("ECUACION 1");
			Ecuacion ecuacion1 = new Ecuacion(a, b, c, d, e, f);

			if (ecuacion1.tieneSolucion()) {
				System.out.println("x = " + ecuacion1.getX());
				System.out.println("y = " + ecuacion1.getY());
			} else {
				System.out.println("La ecuacion NO tiene solucion!");
			}

			System.out.println("\n=== SEGUNDA ECUACIÓN ===");
			System.out.println("Ingrese los 6 valores separados por espacios:");
			System.out.println("Ejemplo: 1.0 2.0 2.0 4.0 4.0 5.0");

			linea = sc.nextLine();
			valores = linea.split(" ");

			a = Double.parseDouble(valores[0]);
			b = Double.parseDouble(valores[1]);
			c = Double.parseDouble(valores[2]);
			d = Double.parseDouble(valores[3]);
			e = Double.parseDouble(valores[4]);
			f = Double.parseDouble(valores[5]);

			System.out.println("ECUACION 2");
			Ecuacion ecuacion2 = new Ecuacion(a, b, c, d, e, f);
			if (ecuacion2.tieneSolucion()) {
				System.out.println("x = " + ecuacion2.getX());
				System.out.println("y = " + ecuacion2.getY());
			} else {
				System.out.println("La ecuacion NO tiene solucion!");
			}

		} catch (NumberFormatException ex) {
			System.out.println("Error: Asegúrese de usar puntos decimales, no comas");
			System.out.println("Ejemplo correcto: 9.0 4.0 3.0 -5.0 -6.0 -21.0");
			System.out.println("Ejemplo incorrecto: 9,0 4,0 3,0 -5,0 -6,0 -21,0");
		}
	}
}