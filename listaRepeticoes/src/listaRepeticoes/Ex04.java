package listaRepeticoes;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		// entrada
		int maior = 0;
		int menor = 0;
		double somador = 0;
		
		int i = 0;
		for (i = 1; i <= 500; i++) {
			System.out.println("Valor "+i);
			int valor = s.nextInt();
			somador += valor;
			
			if (i == 1) {
				maior = valor;
				menor = valor;
			}else {
				if (valor > maior) {
					maior = valor;
				}
				if (valor < menor) {
					menor = valor;
				}
			}
		}
		
		double media = somador / (i-1);
		
		// saída
		System.out.println("Maior valor: "+maior);
		System.out.println("Menor valor: "+menor);
		System.out.println("Média: "+media);
		
	

	}

}
