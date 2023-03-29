package listaRepeticoes;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double positivos = 0;
		double negativos = 0;
		
		int i = 0;
		for (i = 1; i <= 4; i++) {
			System.out.println("Valor "+i);
			int valor = s.nextInt();
			
			if (valor > 0) {
				positivos++;
			}else {
				negativos++;
			}
		}
		
		double percPositivos = (positivos / (i - 1)) * 100;
		double percNegativos = (negativos / (i - 1)) * 100;
		
		System.out.println("Percentual de positivos: "+percPositivos+"%");
		System.out.println("Percentual de negativos: "+percNegativos+"%");

	}

}
