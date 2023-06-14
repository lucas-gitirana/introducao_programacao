package exercicios;

import java.util.Scanner;

public class Ex04 {
	public static double somaRaizes(double a, double b, double c) {
		if(a != 0) {
			double delta = Math.sqrt(Math.pow(b, 2) - 4 * a * c);
			double x1 = (-b + delta) / 2*a;
			double x2 = (-b - delta) / 2*a;
			return x1+x2;
		}else {
			return Double.NaN;
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Valor de A: ");
		double a = s.nextDouble();
		System.out.println("Valor de B: ");
		double b = s.nextDouble();
		System.out.println("Valor de C: ");
		double c = s.nextDouble();
		
		if(somaRaizes(a,b,c)!= Double.NaN) {
			System.out.println("Soma das raízes: "+somaRaizes(a, b, c));
		}else {
			System.out.println("Não é possível calcular a raiz");
		}
		

	}

}
