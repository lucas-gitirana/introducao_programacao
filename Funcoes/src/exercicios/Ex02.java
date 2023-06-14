package exercicios;

import java.util.Scanner;

public class Ex02 {
	
	public static float media(float n1,float n2,float n3,char tipo) {
		float mediaFinal = 0;
		if(tipo == 'A' || tipo == 'a') {
			mediaFinal = (n1+n2+n3)/3;
		}else if(tipo == 'P' || tipo == 'p'){
			mediaFinal = (n1*5 + n2*3 + n3*2)/10;
		}
		return mediaFinal;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Nota 1: ");
		float n1 = s.nextFloat();
		System.out.println("Nota 2:");
		float n2 = s.nextFloat();
		System.out.println("Nota 3: ");
		float n3 = s.nextFloat();
		
		System.out.println("Tipo da média \n [A] - Aritmética \n [P] - Ponderada");
		char tipo = s.next().charAt(0);
		
		System.out.println("A média final do aluno é: "+media(n1,n2,n3,tipo));

	}

}
