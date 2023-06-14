package exercicios;

import java.util.Scanner;

public class Ex03 {
	public static boolean isPrimo(int num) {
		boolean rsp = num >= 2;
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				rsp = false;
			}
		}
		return rsp;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Informe um valor: ");
		int num = s.nextInt();
		
		if(isPrimo(num)) {
			System.out.println("É primo");
		}else {
			System.out.println("NÃO É primo");
		}
	}

}
