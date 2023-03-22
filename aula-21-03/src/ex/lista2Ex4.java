package ex;

import java.util.Scanner;

public class lista2Ex4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Informe sua idade em dias: ");
		int dias = s.nextInt();

		int anos = 0;
		int meses = 0;
		
		if (dias > 365) {
			anos = dias / 365;
			dias = dias % 365;
		}
		
		if (dias > 30) {
			meses = dias / 30;
			dias = dias % 30;
		}
		
		System.out.println("=== IDADE: === \n"
				+ "Anos: "+anos+"\n"
				+ "Meses "+meses+"\n"
				+ "Dias: "+dias);
	}

}
