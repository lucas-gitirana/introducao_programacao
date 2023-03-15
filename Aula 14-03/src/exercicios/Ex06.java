package lista01_condicionais;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Escreva um número de 1 a 7: ");
		int num = s.nextInt();
		
		String dia = "";
		
		if (num < 1 || num > 7) {
			System.out.println("Número inválido!");
		}else {
			switch(num) {
			
			case 1:
				dia = "Segunda-feira";
				break;
				
			case 2:
				dia = "Terça-feira";
				break;
				
			case 3:
				dia = "Quarta-feira";
				break;
				
			case 4:
				dia = "Quinta-feira";
				break;
				
			case 5:
				dia = "Sexta-feira";
				break;
				
			case 6:
				dia = "Sábado";
				break;
			
			case 7:
				dia = "Domingo";
				break;			
			}
		}
		
		if (!dia.equals("")) {
			System.out.println("O número "+num+" corresponde ao dia "+dia);
		}
		
	}

}
