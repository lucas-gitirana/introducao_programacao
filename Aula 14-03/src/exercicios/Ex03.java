package exercicios;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Informe o saldo médio: ");
		double saldo_medio = s.nextDouble();
		
		int percentual = 0;
		
		if (saldo_medio <= 500) {
			percentual = 0;
		} else if(saldo_medio <= 1000) {
			percentual = 30;
		} else if(saldo_medio <= 3000) {
			percentual = 40;
		}else {
			percentual = 50;
		}
		
		double credito = saldo_medio * (percentual / 100);
		
		System.out.println("Saldo médio: "+saldo_medio);
		System.out.println("Crédito: "+credito);

	}

}
