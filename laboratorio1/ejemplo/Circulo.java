package ejemplo;


public class Circulo {
	private double radio;

	public Circulo() {
		this.radio=3;
	}
	
	public Circulo(double radio) {
		this.radio = radio;
	}
	
	public double getArea() {
		double area = Math.PI * Math.pow(radio, 2);
		return area;
	}
	
	public double getPerimetro() {
		double perimetro = 2 * Math.PI * radio;
		return perimetro;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	
	public void mostrar() {
		System.out.println("radio: "+ radio);
	}
	
	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}	
	
}
