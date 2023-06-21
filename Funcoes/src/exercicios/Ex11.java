package funcoes;

import java.util.Scanner;

public class Ex11 {
	public static double pesoIdeal(double alt, String sexo) {
		if(sexo.equalsIgnoreCase("M")) {
			return 72.7 * alt - 58;
		}else {
			return 62.1 * alt - 44.7;
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Altura: ");
		double alt = s.nextDouble();
		String sexo = "";
		while(!sexo.equalsIgnoreCase("F") && !sexo.equalsIgnoreCase("M")) {
			System.out.println("Sexo: [M] - Masculino [F] - Feminino");
			sexo = s.next();
			if(!sexo.equalsIgnoreCase("F") && !sexo.equalsIgnoreCase("M")) {
				System.out.println("Valor inválido!");
			}
		}			
		System.out.println("Seu peso ideal é "+pesoIdeal(alt,sexo));
	}

}
