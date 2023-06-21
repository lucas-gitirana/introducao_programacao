package funcoes;

import java.util.Scanner;

public class Ex08 {
	public static boolean isPositive(int val) {
		if(val > 0) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Valor: ");
		int valor = s.nextInt();
		
		if(isPositive(valor)) {
			System.out.println("O valor é positivo");
		}else {
			System.out.println("O valor é negativo");
		}

	}

}
