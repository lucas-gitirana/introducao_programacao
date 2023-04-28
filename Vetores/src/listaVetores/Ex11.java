package listaVetores;

public class Ex11 {

	public static void main(String[] args) {
		int[] v = {1,2,3,3,2,3,7,8,9,9};
		int[] repetidos = new int[10];
		int contRepetidos = 0;
		int indice = 0;
				
		
		
		for(int x = 0; x < v.length; x++){
			int repeticoes = 0;
			for(int y = 0; y < v.length; y++) {
				if(v[x] == v[y]) {
					repeticoes++;					
				}						
			}			
			if(repeticoes > 1) {
				for(int i = 0; i<repetidos.length; i++) {
					if(v[x] == repetidos[i]) {
						contRepetidos++;
					}
				}
				if(contRepetidos == 0) {
					System.out.println("O número "+v[x]+" aparece "+repeticoes+" vezes");					
					repetidos[indice] = v[x];
					indice++;
				}
				contRepetidos = 0;
				
			}

		}

	}

}
