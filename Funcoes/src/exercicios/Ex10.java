package funcoes;

import java.util.Scanner;

public class Ex10 {
	public static String getConceito(float media) {
		String conceito = "";
		if(media >= 0 && media <= 4.9) {
			conceito = "D";
		}else if(media >= 5 && media <= 6.9) {
			conceito = "C";
		}else if(media >= 7 && media <= 8.9) {
			conceito = "B";
		}else if(media >= 9 && media <= 10) {
			conceito = "A";
		}else {
			conceito = "Inválido";
		}
		
		return conceito;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Média final do aluno: ");
		float media = s.nextFloat();
		
		System.out.println("O conceito obtido foi: "+getConceito(media));
	}

}
