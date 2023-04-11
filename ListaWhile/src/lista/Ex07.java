package listaWhile;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Número: ");
		int num = s.nextInt();
		
		int situacao1 = (num / 100) + (num % 100);
		int situacao2 = (int) Math.pow(situacao1, 2);
		
		if (num == situacao2) {
			System.out.println("O número apresenta as mesmas características");
		}else {
			System.out.println("O número NÃO apresenta as mesmas características");
		}

	}

}
