package funcoes;

import java.util.Scanner;

public class Ex15 {

	public static double getS(int val) {
		double s = 0;
		for (double i = 1; i <= 5; i++) {
			s += 1/i;
		}
		s += 1/val;
		return s;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Valor: ");
		int val = s.nextInt();
		
		System.out.println("S : \n" + getS(val));

	}

}
