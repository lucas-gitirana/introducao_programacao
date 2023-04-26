package listaVetores;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int v[] = new int[6];
		
		for(int i = 0; i < v.length; i++) {
			System.out.println("Valor para a posição "+i);
			v[i] = s.nextInt();
		}
		
		for(int i = 0; i<v.length; i++) {
			if(v[i] < 0) {
				v[i] = 0;
			}
		}
		
		System.out.println("Vetor final: ");
		String vFinal = "";
		for(int i = 0; i<v.length; i++) {
			vFinal += v[i]+" ";
		}
		
		System.out.println(vFinal);
	}

}
