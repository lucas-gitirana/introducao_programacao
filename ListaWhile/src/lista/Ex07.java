package listaWhile;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("N�mero: ");
		int num = s.nextInt();
		
		int situacao1 = (num / 100) + (num % 100);
		int situacao2 = (int) Math.pow(situacao1, 2);
		
		if (num == situacao2) {
			System.out.println("O n�mero apresenta as mesmas caracter�sticas");
		}else {
			System.out.println("O n�mero N�O apresenta as mesmas caracter�sticas");
		}

	}

}
