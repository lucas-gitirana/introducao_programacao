package listaVetores02;

public class Ex04 {

	public static void main(String[] args) {
		int a[] = new int[20];
		int b[] = new int[20];
		int c[] = new int[40];
		
		// Populando os vetores
		for (int i = 0; i < a.length; i++) {
			a[i] = i + 1;
			b[i] = i + 21;					
		}
		
		// Apresentando os vetores
		int somaA = 0;
		
		System.out.println("=== VETOR A: ===");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
			somaA += a[i];
		}
		
		double somaB = 0;
		double mediaB = 0;
		System.out.println("\n\n=== VETOR B: ===");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");	
			somaB += b[i];
		}
		
		//Transferindo conteúdo para c					
		for(int i = 0; i < a.length; i++) {
			c[2*i] = a[i];
			c[(2*i)+1] = b[i];
		}
		
		System.out.println("\n\n=== VETOR C: ===");
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]+" ");			
		}	
		
		// Somatório dos valores movimentados de A
		System.out.println("\n\nSomatório dos valores de A: "+somaA);
		
		// valores do vetor B maiores que a média dos valores neste vetor
		mediaB = somaB / b.length;
		String maioresQueMediaB = "";
		for (int i = 0; i < b.length; i++) {
			if(b[i] > mediaB) {
				maioresQueMediaB += b[i]+" ";
			}
		}
		System.out.println("Valores de B maiores que a média do vetor: "+maioresQueMediaB);

	}

}
