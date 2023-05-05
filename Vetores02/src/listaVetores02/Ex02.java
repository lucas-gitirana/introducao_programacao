package listaVetores02;

public class Ex02 {

	public static void main(String[] args) {
		int v[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		
		int aux = 0;
		for(int i = 0; i < (v.length / 2); i++) {
			aux = v[i];
			v[i] = v[8+i];
			v[8+i] = aux; 
		}
				
		String vetor = "";
		int maior = 0;
		int menor = 0;
		int contPrimos = 0;
		for(int i = 0; i<v.length; i++) {
			vetor += v[i]+" ";
			
			// Maior e menor valores movimentados
			if(i == 0) {
				maior = v[i];
				menor = v[i];
			}else {
				if(v[i] > maior) {
					maior = v[i];
				}
				if(v[i] < menor) {
					menor = v[i];
				}
			}
			
			// Existe número primo?
			boolean isPrimo = true;
			for(int j = 2; j < v[i]; j++) {
				if(v[i]%j==0) {
					isPrimo = false;
				}
			}
			
			if(isPrimo) {
				contPrimos++;
			}
		}
		System.out.println("Vetor final: [ "+vetor+"]");
		System.out.println("Maior valor: "+maior);
		System.out.println("Menor valor: "+menor);
		System.out.println("Quantidade de números primos encontrados: "+contPrimos);
		
		// Média da segunda metade do vetor
		float soma = 0;
		for(int i = 8; i < v.length; i++ ) {
			soma += v[i];
		}
		System.out.println("Média da segunda metade do vetor: "+(soma/8));
	}

}
