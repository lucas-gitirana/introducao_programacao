package lista01_condicionais;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		int num = s.nextInt();
		
		boolean isPar = (num % 2) == 0;
		
		if (isPar) {
			System.out.println("O número é par");
		}else {
			System.out.println("O número é ímpar");
		}
	}

}
