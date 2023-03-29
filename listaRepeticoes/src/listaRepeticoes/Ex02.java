package listaRepeticoes;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int negativos = 0;
		for(int i = 1; i <= 5; i++) {
			System.out.println("Valor "+i);
			int valor = s.nextInt();
			
			if (valor < 0) {
				negativos++;
			}
		}		
		System.out.println("Quantidade de negativos: "+negativos);
	}

}
