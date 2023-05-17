package exemplos;

import java.util.Random;
import java.util.Scanner;

public class ExemploAula {

	public static void main(String[] args) {
		int[][] m = {
				{8,1,2,5,4},
				{10,11,20,2,3},
				{12,8,23,1,23},
				{23,1,11,12,20},
				{8,12,18,11,20}
		};
		Scanner s = new Scanner(System.in);
		
		// VALOR RANDÔMICO
		//Random gerador = new Random();
		
		// DECLARANDO MATRIZ PREENCHIDA
		/*
		int m[][] = { {1,2,3,4},
		 			  {5,6,7,8}
		 			 };
		 
		*/
		
		int maior = m[0][0];
		int menor = m[0][0];
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[0].length; j++) {
				if (m[i][j] > maior) {
					maior = m[i][j];
				}
				if(m[i][j] < menor) {
					menor = m[i][j];
				}
			}
		}
		
		System.out.println("==================");
		System.out.println("Matriz: ");
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[0].length; j++) {
				System.out.print(m[i][j]+" ");
			}	
			System.out.println("");
		}
		System.out.println("==================");
		
		int contMaior = 0;
		int soma = 0;
		for(int i = 0; i<m.length; i++) {
			
			for(int j = 0; j<m[0].length; j++) {
				
				if(m[i][j] == maior) {
					contMaior++;
				}
				
				if(i < j) {
					soma += m[i][j];
				}
				
				// encontrando primo
				String binario = "";
				if(m[i][j] != 1) {
					boolean primo = true;
					for(int x = 2; x < m[i][j]; x++) {
						if(m[i][j] % x == 0) {
							primo = false;
						}
					}													
					if(primo) {
						// transformando em binário
						int divisor = m[i][j];				
						while(divisor >= 2) {								
							binario = (divisor % 2) + binario;			
							divisor = divisor / 2;						
						}
						binario = (divisor % 2) + binario;
						System.out.println(m[i][j] +" é primo e seu valor em binário é "+binario);
					}
				}				
				
								
			}
			
		}						
		
		System.out.println("==================");
		System.out.println("Maior valor: "+maior);
		System.out.println("Menor valor: "+menor);
		System.out.println("O maior valor aparece "+contMaior+" vez(es)");
		System.out.println("Somatório dos valores acima da diagonal principal: "+soma);
	}

}
