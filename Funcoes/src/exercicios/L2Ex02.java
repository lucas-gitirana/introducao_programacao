package funcoes;

import java.util.Scanner;

public class L2Ex02 {
	private static double calcula_cubo(double lado) {
		return Math.pow(lado, 3);
	}
	private static double calcula_paralelepipido(double largura, double comprimento, double altura) {
		return (largura*comprimento*altura);
	}
	private static double calcula_cilindro(double raio, double altura) {
		return (Math.PI * Math.pow(raio, 2) * altura);
	}
	private static double calcula_esfera(double raio) {
		return (Math.PI * (4/3) * Math.pow(raio, 3));
	}
	private static double calcula_cone(double raio, double altura) {
		return (Math.PI * 1/3 * Math.pow(raio, 2) * altura);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Informe o tipo de forma geométrica: \n"
				+ "1 - Cubo \n"
				+ "2 - Paralelepípido\n"
				+ "3 - Cilindro\n"
				+ "4 - Esfera\n"
				+ "5 - Cone\n");
		int forma = s.nextInt();
		
		double altura = 0;
		double raio = 0;
		switch(forma) {
		case 1:
			System.out.println("Informe o comprimento do lado: ");
			double lado = s.nextDouble();
			System.out.println("Volume: "+ calcula_cubo(lado));
			break;
		case 2:
			System.out.println("Largura: ");
			double largura = s.nextDouble();
			System.out.println("Comprimento: ");
			double comprimento = s.nextDouble();
			System.out.println("Altura: ");
			altura = s.nextDouble();
			System.out.println("Volume: "+ calcula_paralelepipido(largura,comprimento,altura));
			break;
		case 3:
			System.out.println("Raio: ");
			raio = s.nextDouble();
			System.out.println("Altura: ");
			altura = s.nextDouble();
			System.out.println("Volume: "+ calcula_cilindro(raio,altura));
			break;
		case 4:
			System.out.println("Raio: ");
			raio = s.nextDouble();
			System.out.println("Volume: "+ calcula_esfera(raio));
			break;
		case 5:
			System.out.println("Raio: ");
			raio = s.nextDouble();
			System.out.println("Altura: ");
			altura = s.nextDouble();
			System.out.println("Volume: "+ calcula_cone(raio,altura));
			break;
		default:
			System.out.println("Valor inválido.");
		}

	}

}
