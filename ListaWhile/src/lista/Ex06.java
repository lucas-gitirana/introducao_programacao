package listaWhile;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Número: ");
		int num = s.nextInt();
		
		int x = 1;
		int subtracao = num;
		int resposta = 0;
		while(subtracao > 0) {
			subtracao = subtracao - x; 
			if (subtracao >= 0) {
				resposta++;				
			}
			x+=2;
		}
		
		System.out.println("Resposta: "+resposta);

	}

}
