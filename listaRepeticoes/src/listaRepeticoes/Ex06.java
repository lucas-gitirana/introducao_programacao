package listaRepeticoes;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Escreva um valor: ");
		int valor = s.nextInt();
		
		int fatorial = 1;
		for (int i = 1; i <= valor; i++) {
			fatorial *= i;
		}
		
		System.out.println("Fatorial: " +fatorial);

	}

}
