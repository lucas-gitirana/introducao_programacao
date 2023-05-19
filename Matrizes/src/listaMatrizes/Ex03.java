package listaMatrizes;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int m[][] = new int[5][5];
				
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[0].length; j++) {
				System.out.println("Valor para a posição "+i+""+j);
				m[i][j] = s.nextInt();				
			}
		}
		
		int somaPrincipal = 0;
		int somaSecundaria = 0;
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[0].length; j++) {				
				if(i == j) {
					somaPrincipal += m[i][j];
				}
				if((i+j) == 4) {
					somaSecundaria += m[i][j];
				}
			}
		}
		
		for (int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[0].length; j++) {
				System.out.print(m[i][j]+" ");				
			}
			System.out.println("");
			
		}
		
		// somatório da diagonal principal
		System.out.println("Somatório da diagonal principal: "+somaPrincipal);
		
		// somatório da diagonal secundária
		System.out.println("Somatório da diagonal principal: "+somaSecundaria);
		
		// principal - secundaria 
		System.out.println("SP - SS = "+(somaPrincipal-somaSecundaria));
		
	}

}
