package funcoes;

import java.util.Scanner;

public class Ex13 {
	public static int fatorial(int val) {
		int fat = 1;
		for(int i = val; i > 1; i--) {
			fat *= i;
		}
		return fat;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Valor: ");
		int val = s.nextInt();
		System.out.println("Fatorial: "+fatorial(val));

	}

}
