package listaMatrizes;

import java.util.Random;

public class Ex04 {

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
		
		// encontrando valores primos na matriz
		String primos = "";
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[0].length; j++) {
				boolean primo = true;
				for(int x = 2; x < m[i][j]; x++) {
					if(m[i][j] % x == 0) {
						primo = false;
					}
				}
				if(primo) {
					primos += m[i][j]+" ";
				}
			}				
		}
		System.out.println("Números primos da matriz: "+primos);

	}

}
