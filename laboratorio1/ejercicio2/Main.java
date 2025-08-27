package ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// PRIMERA ECUACIÓN (con valores ingresados)
		System.out.println("Ingrese a para la ecuación 1");
		double a1 = sc.nextDouble();
		System.out.println("Ingrese b para la ecuación 1");
		double b1 = sc.nextDouble();
		System.out.println("Ingrese c para la ecuación 1");
		double c1 = sc.nextDouble();

		System.out.println("ECUACION CUADRATICA 1");
		EcuacionCuadratica ec1 = new EcuacionCuadratica(a1, b1, c1);
		if (ec1.getDiscriminante() > 0) {
			System.out.println("La ecuacion tiene dos raices: " +
					ec1.formatear(ec1.getRaiz1()) + " y " + ec1.formatear(ec1.getRaiz2()));
		} else if (ec1.getDiscriminante() == 0) {
			System.out.println("La ecuacion tiene una raiz: " + ec1.formatear(ec1.getRaiz1()));
		} else {
			System.out.println("La ecuacion no tiene raices reales");
		}

		// SEGUNDA ECUACIÓN (con diferentes valores)
		System.out.println("\nIngrese a para la ecuación 2");
		double a2 = sc.nextDouble();
		System.out.println("Ingrese b para la ecuación 2");
		double b2 = sc.nextDouble();
		System.out.println("Ingrese c para la ecuación 2");
		double c2 = sc.nextDouble();

		System.out.println("ECUACION CUADRATICA 2");
		EcuacionCuadratica ec2 = new EcuacionCuadratica(a2, b2, c2);
		if (ec2.getDiscriminante() > 0) {
			System.out.println("La ecuacion tiene dos raices: " +
					ec2.formatear(ec2.getRaiz1()) + " y " + ec2.formatear(ec2.getRaiz2()));
		} else if (ec2.getDiscriminante() == 0) {
			System.out.println("La ecuacion tiene una raiz: " + ec2.formatear(ec2.getRaiz1()));
		} else {
			System.out.println("La ecuacion no tiene raices reales");
		}

		// TERCERA ECUACIÓN (con diferentes valores)
		System.out.println("\nIngrese a para la ecuación 3");
		double a3 = sc.nextDouble();
		System.out.println("Ingrese b para la ecuación 3");
		double b3 = sc.nextDouble();
		System.out.println("Ingrese c para la ecuación 3");
		double c3 = sc.nextDouble();

		System.out.println("ECUACION CUADRATICA 3");
		EcuacionCuadratica ec3 = new EcuacionCuadratica(a3, b3, c3);
		if (ec3.getDiscriminante() > 0) {
			System.out.println("La ecuacion tiene dos raices: " +
					ec3.formatear(ec3.getRaiz1()) + " y " + ec3.formatear(ec3.getRaiz2()));
		} else if (ec3.getDiscriminante() == 0) {
			System.out.println("La ecuacion tiene una raiz: " + ec3.formatear(ec3.getRaiz1()));
		} else {
			System.out.println("La ecuacion no tiene raices reales");
		}

		sc.close();
	}
}