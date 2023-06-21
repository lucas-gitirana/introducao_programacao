package funcoes;

import java.util.Scanner;

public class Ex16 {
	public static long fatorial(int val) {
		long fat = 1;
		for(int i = val; i > 1; i--) {
			fat *= i;
		}
		return fat;
	}

	public static double getS(int val) {
		double s = 1;		
		for (int i = 1; i <= 3; i++) {			
			s += (double)1/(double)fatorial(i);
		}				
		s += (double)1/(double)fatorial(val);
		return s;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Valor: ");
		int val = s.nextInt();
		
		System.out.println("S : \n" + getS(val));

	}

}
