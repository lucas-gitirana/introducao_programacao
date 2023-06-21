package funcoes;

import java.util.Scanner;

public class Ex09 {
	public static boolean isPar(int val) {
		if(val % 2 == 0) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Valor: ");
		int valor = s.nextInt();
		
		if(isPar(valor)) {
			System.out.println("O valor é par");
		}else {
			System.out.println("O valor é ímpar");
		}

	}

}
