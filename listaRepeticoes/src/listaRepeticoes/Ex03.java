package listaRepeticoes;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
			
		int menoresQueZero = 0;
		int valores5e50 = 0;
		
		int i = 0;
		float somador = 0;
		for (i = 1; i <= 4; i++) {
			System.out.println("Valor "+i);
			int valor = s.nextInt();
			
			if (valor > 0) {
				somador += valor;
				if (valor >= 5 && valor <= 50) {
					valores5e50++;
				}
			}else {
				menoresQueZero ++;
			}
		}
		double media = (somador / (i - 1));
		System.out.println("Média: "+media);
		System.out.println("Valores menores que zero: "+menoresQueZero);
		System.out.println("Valores de 5 a 50: "+valores5e50);

	}

}
