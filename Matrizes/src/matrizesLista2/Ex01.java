package matrizesLista2;

import java.util.Random;

public class Ex01 {

	public static void main(String[] args) {
		Random random = new Random();
		//int m[][] = new int[5][5];
		int m[][] = {
				{1,1,1,1,1},
				{10,9,7,1,-2},
				{90,56,3,2,4},
				{7,6,5,4,3},
				{8,8,8,8,8},
		};
		
		// preenhcendo a matriz automaticamente com números aleatórios
		/*for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[0].length; j++) {
				m[i][j] = random.nextInt(10,99);
			}
		}*/
		
		// apresentando a matriz
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[0].length; j++) {
				System.out.print(m[i][j]+" ");
			}
			System.out.println("");
		}
		
		System.out.println("================================");
		
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
		System.out.println("================================");
		
		//Se existe pelo menos uma linha da matriz onde os valores são todos iguais
		for(int i = 0; i < m.length; i++) {
			boolean iguais = true;
			for(int j = 0; j < m[0].length-1; j++) {
				if(m[i][j] != m[i][j+1]) {
					iguais = false;
				}
			}
			if(iguais) {
				System.out.println("A linha "+(i+1)+" possui somente valores iguais");
			}
		}
		
		System.out.println("================================");
		
		//Se existe pelo menos uma linha da matriz onde a ordem dos valores é decrescente
		for(int i = 0; i < m.length; i++) {
			boolean descrescente = true;
			for(int j = 0; j < m[0].length-1; j++) {
				if(m[i][j] <= m[i][j+1]) {
					descrescente = false;
				}
			}
			if(descrescente) {
				System.out.println("A linha "+(i+1)+" está em ordem decrescente");
			}
		}

	}

}
