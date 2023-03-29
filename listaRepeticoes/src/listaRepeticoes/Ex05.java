package listaRepeticoes;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int primos = 0;
		for (int i = 1; i <= 5; i++) {
			System.out.println("Valor "+i);
			int valor = s.nextInt();
			
			int divisores = 0;
			for (int j = 1; j <= valor; j++) {
				if ((valor % j) == 0) {
					divisores++;
				}				
			}
			
			if (divisores == 2) {
				primos++;
			}
		}
		
		System.out.println("Quantidade de valores primos: "+primos);
	}

}
