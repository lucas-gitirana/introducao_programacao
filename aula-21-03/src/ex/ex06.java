package ex;

import java.util.Scanner;

public class ex06 {
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			
			System.out.println("Informe um n�mero: ");
			int num = s.nextInt();
			
			boolean isPar = (num % 2) == 0;
			
			if (isPar) {
				System.out.println("O n�mero � par");
			}else {
				System.out.println("O n�mero � �mpar");
			}
		}
}
