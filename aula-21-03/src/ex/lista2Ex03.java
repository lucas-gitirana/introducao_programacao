package ex;

import java.util.Scanner;

public class lista2Ex03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Anos: ");
		int anos = s.nextInt();
		
		System.out.println("Meses: ");
		int meses = s.nextInt();
		
		System.out.println("Dias: ");
		int dias = s.nextInt();
		
		int conversao = (anos * 365) + (meses * 30) + dias;
		
		System.out.println("Sua idade convertida para dias é: "+conversao);
		

	}

}
