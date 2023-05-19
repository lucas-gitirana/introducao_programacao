package listaMatrizes;

import java.util.Random;

public class Ex01 {

	public static void main(String[] args) {
		Random random = new Random();
		int m[][] = new int[5][5];
		
		// preenhcendo a matriz automaticamente com números aleatórios
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[0].length; j++) {
				m[i][j] = random.nextInt(10,99);
			}
		}
		
		// apresentando a matriz
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[0].length; j++) {
				System.out.print(m[i][j]+" ");
			}
			System.out.println("");
		}
		
		// encontrando maior e menor valor
		int maior = m[0][0];
		int menor = m[0][0];
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[0].length; j++) {
				if(m[i][j] > maior) {
					maior = m[i][j];
				}
				if(m[i][j] < menor) {
					menor = m[i][j];
				}
			}
		}
		System.out.println("Maior valor: "+maior);
		System.out.println("Menor valor: "+menor);

	}

}
