package funcoes;

import java.util.Scanner;

public class Ex12 {
	public static String getTipoTriangulo(double x, double y, double z) {
		// verificando se se é possível formar um triângulo
		if(x < (y+z) && y < (x+z) && z < (x+y)) {
			if(x == y && y == z) {
				return "Equilátero";
			}else if((x==y) || (x==z) || (y==z)) {
				return "Isósceles";
			}else {
				return "Escaleno";
			}
		}else {
			return "Inválido";
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("X: ");
		double x = s.nextDouble();
		System.out.println("Y: ");
		double y = s.nextDouble();
		System.out.println("Z: ");
		double z = s.nextDouble();
		
		System.out.println("Tipo de triângulo: "+getTipoTriangulo(x,y,z));

	}

}
