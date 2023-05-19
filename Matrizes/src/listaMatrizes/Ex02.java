package listaMatrizes;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a[][] = new int[5][5];
		int b[][] = new int[5][5];
		
		System.out.println("Matriz A: ");
		for (int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++) {
				System.out.println("Valor para a posição "+i+""+j);
				a[i][j] = s.nextInt();
			}
			
		}
		
		System.out.println("Matriz B: ");
		for (int i = 0; i < b.length; i++) {
			for(int j = 0; j < b[0].length; j++) {
				System.out.println("Valor para a posição "+i+""+j);
				b[i][j] = s.nextInt();
			}
			
		}
		
		System.out.println("A: ");
		for (int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j]);				
			}
			System.out.println("");
			
		}
		
		System.out.println("B: ");
		for (int i = 0; i < b.length; i++) {
			for(int j = 0; j < b[0].length; j++) {
				System.out.print(b[i][j]);				
			}
			System.out.println("");
		}
		
		System.out.println("Somatório linha/coluna: ");
		for (int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++) {
				System.out.println("Soma da posição "+i+""+j+" = "+(a[i][j]+b[i][j]));				
			}
			
		}
		
	}

}
