package funcoes;

import java.util.Scanner;

public class Ex06 {
	public static int idadeEmDias(int anos, int meses, int dias) {
		return (dias + (meses * 30) + (anos * 365));
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Anos: ");
		int anos = s.nextInt();
		System.out.println("Meses: ");
		int meses = s.nextInt();
		System.out.println("Dias: ");
		int dias = s.nextInt();
		
		System.out.println("Idade em dias: "+idadeEmDias(anos,meses,dias));
	}

}
