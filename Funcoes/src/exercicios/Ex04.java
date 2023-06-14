package exercicios;

import java.util.Scanner;

public class Ex04 {
	public static double somaRaizes(double a, double b, double c) {
		if(a != 0) {
			double delta = Math.pow(b, 2) - (4 * a * c);
			// se delta < 0 parar
			double x1 = (-b + Math.sqrt(delta)) / 2*a;
			double x2 = (-b - Math.sqrt(delta)) / 2*a;
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
		
		double soma = somaRaizes(a,b,c);
		
		if(soma != Double.NaN) {
			System.out.println("Soma das raízes: "+soma);
		}else {
			System.out.println("Não é possível calcular a raiz");
		}
		

	}

}
