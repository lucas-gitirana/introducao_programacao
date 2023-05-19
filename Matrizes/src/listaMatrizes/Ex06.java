package listaMatrizes;

import java.util.Random;

public class Ex06 {
	// Gerador de quadro de sudoku
	public static void main(String[] args) {
		Random random = new Random();
		int m[][] = new int[3][3];
		int[] initialValues = new int[3];
		int[][] initialPositions = new int[3][2];
		
		// preenhcendo a matriz automaticamente com números aleatórios
		int contValores = 0;
		int contPosicoes = 0;
		while(contValores < 3){
			int rX = 0;
			int rY = 0;
			
			// gerando posição aleatória no quadro
			boolean exists = true;
			while(exists) {
				rX = random.nextInt(0,m.length);
				rY = random.nextInt(0,m[0].length);
				
				// verificando se a posição já foi preenhcida
				exists = false;
				for(int x = 0; x < initialPositions.length; x++) {
					if(rX == initialPositions[x][0] && rY == initialPositions[x][1]) {
						exists = true;
					}
				}
				
				if(!exists) {
					initialPositions[contPosicoes][0] = rX;
					initialPositions[contPosicoes][1] = rY;
					contPosicoes++;
				}
				
			}						
			
			// gerando valor aleatório para a posição
			exists = true;
			while(exists) {
				m[rX][rY] = random.nextInt(1,9);
				
				// verificando se o valor já existe
				exists = false;
				for(int x = 0; x < initialValues.length; x++) {
					if(m[rX][rY] == initialValues[x]) {
						exists = true;
					}
				}
				
				if(!exists) {
					initialValues[contValores] = m[rX][rY];
					contValores++;
				}
			}			
		}
		
		
		// apresentando o quadro
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[0].length; j++) {
				System.out.print(m[i][j]+"  ");
			}
			System.out.println("");
		}

	}

}
