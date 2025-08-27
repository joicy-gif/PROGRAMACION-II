package ejercicio2;

public class EcuacionCuadratica {
	private double a, b, c;

	public EcuacionCuadratica(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getDiscriminante() {
		double discriminante = (b * b) - (4 * a * c);
		return discriminante;
	}

	public double getRaiz1() {
		// CORRECCIÓN: Agregar paréntesis
		double raiz1 = (-b + Math.sqrt(getDiscriminante())) / (2 * a);
		return raiz1;
	}

	public double getRaiz2() {
		// CORRECCIÓN: Agregar paréntesis
		double raiz2 = (-b - Math.sqrt(getDiscriminante())) / (2 * a);
		return raiz2;
	}

	// Método para formatear números a 6 decimales
	public String formatear(double numero) {
		return String.format("%.6f", numero);
	}

	@Override
	public String toString() {
		return "EcuacionCuadratica [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
}