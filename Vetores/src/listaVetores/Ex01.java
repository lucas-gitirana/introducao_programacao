package listaVetores;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] vetor = new int[12];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Valor para a posição "+i);
			vetor[i] = s.nextInt();
		}
		
		System.out.println("Informe um valor para X: ");
		int x = s.nextInt();
		
		System.out.println("Informe um valor para Y; ");
		int y = s.nextInt();
		
		System.out.println("Soma das posições v["+x+"] + v["+y+"] = "+(vetor[x] + vetor[y]));
	}

}
