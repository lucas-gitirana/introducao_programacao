package listaVetores;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);		
		int v[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		
		System.out.println("Informe um valor qualquer: ");
		int x = s.nextInt();
		
		boolean inVetor = false;
		int posicao = 0;
		
		
		for(int i = 0; i < v.length; i++) {
			if(v[i] == x) {
				posicao = i;
				inVetor = true;
			}
		}
		
		if(inVetor) {
			System.out.println("O número "+x+" foi encontrado na posição v["+posicao+"]");
		}else {
			System.out.println("O valor não foi encontrado no vetor.");
		}

	}

}
