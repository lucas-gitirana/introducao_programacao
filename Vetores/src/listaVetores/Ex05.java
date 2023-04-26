package listaVetores;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int v[] = new int[40];
		int contPares = 0;
		
		for(int i = 0; i < v.length; i++) {
			System.out.println("Valor para a posição "+i);
			v[i] = s.nextInt();					
		}
		
		for(int i = 0; i < v.length; i++) {
			if(v[i] % 2 == 0) {
				contPares++;
			}
		}
		
		System.out.println("O vetor possui "+contPares+" valor(es) par(es).");
		

	}

}
