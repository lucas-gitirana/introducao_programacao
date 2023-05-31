package listaMatrizes;

public class Desafio {

	public static void main(String[] args) {
		int m[][] = {
				{ 0, -1,  0, -1,  -1,  0, -1,  0},
				{-1, -1,  0,  0,  -1,  0,  0,  0},
				{-1,  0, -1, -1,  -1,  0, -1,  0},
				{-1,  0,  0,  0,  -1, -1,  0, -1},
				{ 0,  0, -1,  0,   0,  0,- 1, -1}
		};		
		
		// descobrindo possíveis palavras na horizontal
		int posInicial = 0;
		int posFinal = 0;
		int cont = 0;
		for(int i = 0; i < m.length; i++) {
			cont = 0;			
			for(int j = 1; j < m[0].length; j++) {
				if(m[i][j] == -1) {
					cont++;					
					if (j == 1 && m[i][j-1] == -1) {
						posInicial = j-1;
						cont++;
					}					
					if(m[i][j-1] == 0) {
						posInicial = j;
					}else if (cont >= 2 && j == m[0].length-1) {						
						posFinal = j;
						System.out.println("Palavra encontrada entre as posições ["+i+"]["+posInicial+"] e ["+i+"]["+posFinal+"]");						
					}
				}else {					
					if(cont >= 2 && m[i][j-1] == -1) {
						posFinal = j-1;
						System.out.println("Palavra encontrada entre as posições ["+i+"]["+posInicial+"] e ["+i+"]["+posFinal+"]");
					}
					cont = 0;					
				}														
			}
		}
		
		// descobrindo possíveis palavras na vertical
		for(int j = 0; j < m[0].length; j++) {
			for(int i = 1; i < m.length; i++) {
				if(m[i][j] == -1) {
					cont++;				
					if (i == 1 && m[i-1][j] == -1) {
						posInicial = i-1;
						cont++;
					}					
					if(m[i-1][j] == 0) {
						posInicial = i;
					}else if (cont >= 2 && i == m.length-1) {						
						posFinal = i;
						System.out.println("Palavra vertical encontrada entre as posições ["+posInicial+"]["+j+"] e ["+posFinal+"]["+j+"]");						
					}
				}else {			
					if(cont >= 2 && m[i-1][j] == -1) {
						posFinal = i-1;
						System.out.println("Palavra vertical encontrada entre as posições ["+posInicial+"]["+j+"] e ["+posFinal+"]["+j+"]");
					}
					cont = 0;					
				}
			}
		}
	}
}
