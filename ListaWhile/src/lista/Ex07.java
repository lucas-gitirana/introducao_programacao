package listaWhile;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num = 0;
		while(num < 1000 || num > 9999) {
			System.out.println("Número: ");
			num = s.nextInt();
			
			if (num < 1000 || num > 9999) {
				System.out.println("Valor inválido. Digite um número entre 1000 e 9999");
			}
		}			
		
		int situacao1 = (num / 100) + (num % 100);
		int situacao2 = (int) Math.pow(situacao1, 2);
		
		if (num == situacao2) {
			System.out.println("O número apresenta as mesmas características");
		}else {
			System.out.println("O número NÃO apresenta as mesmas características");
		}

	}

}
