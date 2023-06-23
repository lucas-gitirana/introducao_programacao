package funcoes;

import java.util.Scanner;

public class L2Ex04 {
	private static String perfeito(int num) {
		int somaDivisores = 0;
		String listaDivisores = "";
		for(int i = num-1; i >= 1; i--) {
			if(num % i == 0) {
				somaDivisores += i;
				listaDivisores += i+" ";
			}
		}
		if(somaDivisores != num) {
			listaDivisores = "";
		}
		
		return listaDivisores;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Valor: ");
		int val = s.nextInt();
		if (!perfeito(val).equalsIgnoreCase("")) {
			System.out.println("O número é perfeito e seus divisores são: "+perfeito(val));
		}

	}

}
