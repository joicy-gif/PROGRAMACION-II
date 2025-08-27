package ejercicio_1;

public class Ecuacion {
	private double a, b, c, d, e, f;

	public Ecuacion(double a, double b, double c, double d, double e, double f) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}

	public boolean tieneSolucion() {
		double solucion = (a * d) - (b * c);
		if (solucion != 0) {
			return true;
		}
		return false;
	}

	public double getX() {
		double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
		return x;
	}

	public double getY() {
		double y = ((a * f) - (e * c)) / ((a * d) - (b * c));
		return y;
	}

	@Override
	public String toString() {
		return "Ecuacion [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + ", e=" + e + ", f=" + f + "]";
	}

}
