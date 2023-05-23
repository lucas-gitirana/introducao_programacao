package matrizes;

import java.util.Random;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Random random = new Random();		
		int m[][] = {
				{1,2,3,4,5},
				{10,9,7,1,2},
				{90,56,3,2,4},
				{7,6,5,4,3},
				{101,8,8,8,8},
		};
		
		/*
		// preenhcendo a matriz automaticamente com n�meros aleat�rios
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[0].length; j++) {
				m[i][j] = random.nextInt(10,99);
			}
		}*/
		
		// apresentando a matriz
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[0].length; j++) {
				System.out.print(m[i][j]+" ");
			}
			System.out.println("");
		}
		
		// encontrando valores primos na matriz
		String primos = "";
		int maior = Integer.MIN_VALUE;
		int contPares = 0;
		int cont3Digitos = 0;
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[0].length; j++) {
				boolean primo = true;
				for(int x = 2; x < m[i][j]; x++) {
					if(m[i][j] % x == 0) {
						primo = false;
						break;
					}
				}
				if(primo) {
					primos += m[i][j]+" ";
					if(m[i][j] >= 100) {
						cont3Digitos++;
					}
				}else {
					if(m[i][j] > maior) {
						maior = m[i][j];
					}
					if(m[i][j] % 2 == 0) {
						contPares++;
					}
				}
			}				
		}
		
		System.out.println("N�meros primos da matriz: "+primos);

		//Dentre os n�meros n�o primos da matriz, qual o maior
		System.out.println("Maior n�mero n�o primo da matriz: "+maior);
		
		//b) Dentre os n�meros n�o primos da matriz, quantos s�o pares
		System.out.println("N�meros n�o primos pares: "+contPares);
		
		//c) Dentre os n�meros primos da matriz, quantos t�m pelo menos tr�s d�gitos
		System.out.println("N�meros primos com pelo menos 3 d�gitos: "+cont3Digitos);
	
	}
}
