package ex;

import java.util.Scanner;

public class lista2Ex05 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		// entrada
		System.out.println("Valor A: ");
		int a = s.nextInt();
		
		System.out.println("Valor B: ");
		int b = s.nextInt();
		
		System.out.println("Valor C: ");
		int c = s.nextInt();
		
		// processamento
		int maior = 0;
		int medio = 0;
		int menor = 0;
		
		if (a > b) {
			if (a > c) {
				maior = a;
				if (b > c){
					medio = b;
					menor = c;
				}
				else {
					medio = c;
					menor = b;
				}
			}
			else {
				medio = a;
				menor = b;
				maior = c;
			}						
		}
		else {
			if (b > c) {
				maior = b;
				if (a > c){
					medio = a;
					menor = c;
				}
				else {
					medio = c;
					menor = a;
				}				
			}
			else {
				medio = b;
				menor = a;
				maior = c;
			}
		}
		
		// saída
		System.out.println("Como deseja imprimir? \n"
				+ "1 - Crescente\n"
				+ "2 Decrescente");
		int resposta = s.nextInt();
		
		switch(resposta) {
		case 1:
			System.out.println(menor+" "+medio+" "+ maior);
			break;
		
		case 2:
			System.out.println(maior+" "+medio+" "+ menor);
			break;
			
		default:
			System.out.println("Valor inválido!");
		}	
		

	}

}
