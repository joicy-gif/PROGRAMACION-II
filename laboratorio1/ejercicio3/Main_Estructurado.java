package ejercicio3;

import java.util.Scanner;

public class Main_Estructurado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca 10 numeros separados por un espacio");
        System.out.println("Ejemplo: 1.9 2.5 3.7 2 1 6 3 4 5 2");
        String cadena = sc.nextLine();
        String vector[] = cadena.split(" ");
        
        double datos[] = new double[vector.length];
        
        for (int i = 0; i < vector.length; i++) {
            datos[i] = Double.parseDouble(vector[i]); 
        }
        
        double promedio = calcularPromedio(datos);
        double desviacion = calcularDesviacion(datos, promedio);
        
        System.out.printf("El promedio es: %.2f%n", promedio);
        System.out.printf("La desviacion estandard es: %.5f%n", desviacion);
        
    }

    public static double calcularPromedio(double[] valores) {
        int n = valores.length;
        double sumatoria = 0;
        for (double valor : valores) {
            sumatoria += valor;
        }
        return sumatoria / n;
    }

    public static double calcularDesviacion(double[] valores, double promedio) {
        int n = valores.length;
        if (n <= 1) {
            return 0.0;
        }
        
        double sumatoria = 0;
        for (double valor : valores) {
            sumatoria += Math.pow((valor - promedio), 2);
        }
        return Math.sqrt(sumatoria / (n - 1));
    }
}