package lista01_condicionais;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Nota 1: ");
		double nota1 = s.nextDouble();
		
		System.out.println("Nota 2: ");
		double nota2 = s.nextDouble();
		
		System.out.println("Nota 3: ");
		double nota3 = s.nextDouble();
		
		System.out.println("Nota 4: ");
		double nota4 = s.nextDouble();
		
		double media = (nota1 + nota2 + nota3 + nota4)/4;
		String situacao = "";
		
		if (media >= 7) {
			situacao = "Aprovado(a)";
		}else {
			System.out.println("Nota de exame: ");
			double exame = s.nextDouble();
			
			media = (media + exame) / 2;
			
			if(media >= 5) {
				situacao = "Aprovado(a) em exame";
			}else {
				situacao = "Reprovado(a)";
			}
		}
		
		System.out.println("Sua situação é: "+situacao+"\n"
				+ "Sua média final é: "+media);
	}

}
