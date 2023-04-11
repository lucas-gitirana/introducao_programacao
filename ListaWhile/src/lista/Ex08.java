package listaWhile;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Valor: ");
		int valor = s.nextInt();
		
		String serie = "1 1 2 ";
		int aux = 2;
		int anterior = 1;
		int soma = 0;
		while(soma + anterior <= valor) {
			soma = aux + anterior;
			serie += soma+" ";
			anterior = aux;
			aux = soma;			
		}
		
		System.out.println(serie);

	}

}
