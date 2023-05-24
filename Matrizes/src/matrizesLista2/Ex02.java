package matrizesLista2;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a[][] = {
				{1,1,1,1,1},
				{10,10,7,1,-2},
				{90,56,3,2,4},
				{7,6,5,4,3},
				{8,8,8,8,5},
		};
		int b[][] = {
				{2,1,1,1,1},
				{10,5,7,1,-2},
				{90,56,3,2,4},
				{7,6,5,4,3},
				{8,8,8,8,5},
		};
		
		/*
		System.out.println("Matriz A: ");
		for (int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++) {
				System.out.println("Valor para a posi��o "+i+""+j);
				a[i][j] = s.nextInt();
			}
			
		}
		
		System.out.println("Matriz B: ");
		for (int i = 0; i < b.length; i++) {
			for(int j = 0; j < b[0].length; j++) {
				System.out.println("Valor para a posi��o "+i+""+j);
				b[i][j] = s.nextInt();
			}
			
		}
		*/
		
		System.out.println("A: ");
		for (int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j]+" ");				
			}
			System.out.println("");
			
		}
		
		System.out.println("================================");
		
		System.out.println("B: ");
		for (int i = 0; i < b.length; i++) {
			for(int j = 0; j < b[0].length; j++) {
				System.out.print(b[i][j]+" ");				
			}
			System.out.println("");
		}
		
		System.out.println("================================");
		
		System.out.println("Somat�rio linha/coluna: ");
		int somasImpares = 0;
		int multCinco = 0;
		for (int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++) {
				System.out.println("Soma da posi��o "+i+""+j+" = "+(a[i][j]+b[i][j]));
				
				// a) Em quantas ocorr�ncias a soma de dois elementos correspondentes resultou em um n�mero �mpar
				if((a[i][j]+b[i][j]) % 2 != 0) {
					somasImpares++;
				}
				
				if((i == j) && ((a[i][j]+b[i][j]) % 5 == 0)) {
					multCinco++;
				}
			}
			
		}
		System.out.println("================================");
		System.out.println("Somas que resultaram em valores �mpares: "+somasImpares);
		
		// b) Apenas para elementos das diagonais principais, em quantas ocorr�ncias a soma de dois elementos correspondentes resultou em um n�mero m�ltiplo de cinco 
		System.out.println("================================");
		System.out.println("Somas da diagonal principal que resultam em m�ltiplos de 5: "+multCinco);
		
	}

}
