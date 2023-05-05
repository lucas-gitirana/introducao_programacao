package listaVetores02;

public class Ex05 {

	public static void main(String[] args) {
		String a[] = {"a","b","j","d","e"};
		String b[] = {"a","b","c","d","e"};
		
		int contEquals = 0;
		int contEquivalentes = 0;	
		String valorDiferente = "";
		for(int i = 0; i < a.length; i++) {			
			int diferenca = 0;
			for(int j = 0; j < b.length; j++) {
				if(a[i].equalsIgnoreCase(b[j])) {
					contEquals++;
					diferenca++;
					if(i == j) {
						contEquivalentes++;
					}
				}				
			}	
			if(diferenca == 0) {
				valorDiferente = a[i];
			}
		}
		if(contEquals == b.length) {
			System.out.println("Iguais");
			// Quantas letras estavam em posições equivalentes
			System.out.println("Letras em posições equivalentes: "+contEquivalentes);
		}else {
			System.out.println("Não iguais");
			// Qual letra determinou a diferença
			System.out.println("Valor diferente: "+valorDiferente);
		}

	}

}
