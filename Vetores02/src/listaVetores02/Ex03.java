package listaVetores02;

public class Ex03 {

	public static void main(String[] args) {
		int v[] = new int[40];		
		
		// Populando o vetor
		for (int i = 0; i < v.length; i++) {
			v[i] = i + 1;
			
		}
		
		// Apresentando o vetor
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i]+" ");
		}

		// Calculando quantos valores pares o vetor possui
		int contPares = 0;
		float somaPares = 0;
		for (int i = 0; i < v.length; i++) {			
			if(v[i]%2==0) {
				contPares++;
				
				// Média dos valores pares econtrados
				somaPares += v[i];
			}
		}
		float mediaPares = somaPares/contPares;
		System.out.println("\nO vetor possui "+contPares+" valores pares.");
		System.out.println("Média dos valores pares encontrados: "+mediaPares);
		
		// Valores ímpares abaixo da média
		int contAbaixoMedia = 0;
		for (int i = 0; i < v.length; i++) {
			if(v[i]%2!=0) {
				if(v[i] < mediaPares) {
					contAbaixoMedia++;
				}
			}
		}
		System.out.println("Quantidade de ímpares abaixo da média: "+contAbaixoMedia);
	}

}
