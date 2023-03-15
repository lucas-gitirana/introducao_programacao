package lista01_condicionais;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Escolha o prato: ");
		System.out.println("1 - Vegetariano\n"
				+ "2 - Peixen\n"
				+ "3 - Frango\n"
				+ "4 - Carne\n");
		int prato = s.nextInt();
		
		System.out.println("Escolha a sobremesa: ");
		System.out.println("1 - Abacaxi\n"
				+ "2 - Sorvete diet\n"
				+ "3 - Mouse diet\n"
				+ "4 - Mouse chocolate\n");
		int sobremesa = s.nextInt();
		
		System.out.println("Escolha a bebida: ");
		System.out.println("1 - Chá\n"
				+ "2 - Suco de laranja\n"
				+ "3 - Suco de melão\n"
				+ "4 - Refrigerante diet\n");
		int bebida = s.nextInt();
		
		int calorias = 0;
		
		switch(prato) 
		{		
			case 1:
				calorias += 180;
				break;
			
			case 2:
				calorias += 230;
				break;
			
			case 3:
				calorias += 250;
				break;
			
			case 4:
				calorias += 350;
				break;
			
			default:
				calorias += 0;
				break;		
		}
		
		switch(sobremesa) 
		{		
			case 1:
				calorias += 75;
				break;
			
			case 2:
				calorias += 110;
				break;
			
			case 3:
				calorias += 170;
				break;
			
			case 4:
				calorias += 200;
				break;
			
			default:
				calorias += 0;
				break;		
		}
		
		switch(bebida) 
		{		
			case 1:
				calorias += 20;
				break;
			
			case 2:
				calorias += 70;
				break;
			
			case 3:
				calorias += 100;
				break;
			
			case 4:
				calorias += 65;
				break;
			
			default:
				calorias += 0;
				break;		
		}
		
		System.out.println("A refeição tem "+calorias+" calorias.");

	}

}
