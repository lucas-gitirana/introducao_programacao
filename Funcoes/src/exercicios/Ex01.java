package exercicios;

import java.util.Scanner;

public class Ex01 {
	public static double volume(double raio) {
		double vol = 4/3 * Math.PI * Math.pow(raio, 3);
		return vol;
	}
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("informe o raio da esfera: ");
		double raio = s.nextDouble();
		
		System.out.println("O volume da esfera é "+volume(raio));

	}

}
