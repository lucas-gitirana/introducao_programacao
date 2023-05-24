package matrizesLista2;

import java.util.Random;

public class Ex05 {

	public static void main(String[] args) {
		Random random = new Random();		
		int m[][] = {
				{1,3,2,0,8},
				{1,9,7,1,4},
				{9,6,3,2,2},
				{7,6,5,4,1},
				{8,4,2,1,0},
		};
		
		/*// preenhcendo a matriz automaticamente com números aleatórios
		System.out.println("Matriz original: ");
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[0].length; j++) {
				m[i][j] = i;
			}
		}*/
		
		// apresentando a matriz
		int contTrocas = 0;
		int contIguais = 0;
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[0].length; j++) {
				System.out.print(m[i][j]+" ");
				if(m[i][j] != m[j][i]) {
					contTrocas++;
				}else {
					contIguais++;					
				}
			}
			System.out.println("");
		}
		
		// fazendo a troca de linhas por colunas		
		for(int i = 0; i < m.length; i++) {
			for(int j = i; j < m[0].length; j++) {								
				int aux = m[i][j];
				m[i][j] = m[j][i];
				m[j][i] = aux;				
			}
		}
		
		System.out.println("Matriz alterada: ");
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[0].length; j++) {
				System.out.print(m[i][j]+" ");
			}
			System.out.println("");
		}
		
		//a)  Quantos valores trocados de posição são iguais entre si		
		System.out.println("Valores trocados iguais entre si: "+(contIguais - m.length));

		//b) Quantas trocas foram feitas no total
		System.out.println("Total de trocas: "+(contTrocas));


	}

}
