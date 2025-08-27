package ejercicio3;

import java.util.Arrays;


public class Estadistica {

	private double vector[];

	public Estadistica(double[] vector) {
		super();
		this.vector = vector;
	}

	public double getPromedio() {
		int n = vector.length;
		double sumatoria=0;
		for (int i = 0; i < n; i++) {
			sumatoria = sumatoria + vector[i];
		}
		return sumatoria/n;
	}
	
	public double getDesviacion() {
		int n = vector.length;
		double sumatoria=0;
		for (int i = 0; i < n; i++) {
			sumatoria = sumatoria + ((vector[i]- getPromedio())*(vector[i]- getPromedio()));
		}
		double desviacion = Math.sqrt(sumatoria/(n-1));
		return desviacion;
	}

	@Override
	public String toString() {
		return "Estadistica [vector=" + Arrays.toString(vector) + "]";
	}
	
	
	
}
