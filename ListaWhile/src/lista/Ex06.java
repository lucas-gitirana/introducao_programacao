package listaWhile;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String continuar = "s";
		while(continuar.equalsIgnoreCase("s")) {			
			System.out.println("Número: ");
			int num = s.nextInt();
			
			int x = 1;
			int subtracao = num;
			int resposta = 0;
			while(subtracao > 0) {
				subtracao = subtracao - x; 
				resposta++;
				x+=2;
			}
			
			System.out.println("Resposta: "+resposta);
			
			System.out.println("Continuar? ");
			continuar = s.next();
		}
		
		

	}

}
