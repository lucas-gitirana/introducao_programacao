package matrizes;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//int m[][] = new int[5][5];
		int m[][] = {
				{1,1,1,1,1},
				{10,9,7,1,-2},
				{90,56,3,2,4},
				{7,6,5,4,3},
				{8,8,8,8,8},
		};
		
		/*
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[0].length; j++) {
				System.out.println("Valor para a posição "+i+""+j);
				m[i][j] = s.nextInt();				
			}
		}*/
		
		int somaPrincipal = 0;		
		for(int i = 0; i < m.length; i++) {
			somaPrincipal += m[i][i];
		}
		
		int somaSecundaria = 0;
		int col = m.length-1;;
		for(int i = 0; i < m.length; i++) {
			somaSecundaria += m[i][col];
			col--;
		}
		
		for (int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[0].length; j++) {
				System.out.print(m[i][j]+" ");				
			}
			System.out.println("");
			
		}
		
		// somatório da diagonal principal
		System.out.println("Somatório da diagonal principal: "+somaPrincipal);
		
		// somatório da diagonal secundária
		System.out.println("Somatório da diagonal secundaria: "+somaSecundaria);
		
		// principal - secundaria 
		System.out.println("SP - SS = "+(somaPrincipal-somaSecundaria));
		
		
		//a) Quantos elementos que compõem SP estão abaixo da media destes valores
		System.out.println("Média da SP: "+(somaPrincipal / m.length));
		int contMenorSP = 0;
		for(int i = 0; i < m.length; i++) {
			if(m[i][i] < (somaPrincipal / m.length)) {
				contMenorSP++;
			}
		}
		System.out.println("Valores abaixo da média da SP: "+contMenorSP);
		
		
		//b) O equivalente binário de SS
		String binario = "";
		int divisor = somaSecundaria;				
		while(divisor >= 2) {								
			binario = (divisor % 2) + binario;			
			divisor = divisor / 2;						
		}
		binario = (divisor % 2) + binario;			
		
		System.out.println("Equivalente binário de SS: "+binario);
		

	}

}
