package listaMatrizes;

import java.util.Random;

public class Ex05 {

	public static void main(String[] args) {
		Random random = new Random();
		int m[][] = new int[5][5];
		
		// preenhcendo a matriz automaticamente com números aleatórios
		System.out.println("Matriz original: ");
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[0].length; j++) {
				m[i][j] = i;
			}
		}
		
		// apresentando a matriz
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[0].length; j++) {
				System.out.print(m[i][j]+" ");
			}
			System.out.println("");
		}
		
		// fazendo a troca de linhas por colunas
		int x = 0;
		for(int i = 0; i < m.length; i++) {
			for(int j = x; j < m[0].length; j++) {
				int aux = m[i][j];
				m[i][j] = m[j][i];
				m[j][i] = aux;
			}
			x++;
		}
		
		System.out.println("Matriz alterada: ");
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[0].length; j++) {
				System.out.print(m[i][j]+" ");
			}
			System.out.println("");
		}

	}

}
