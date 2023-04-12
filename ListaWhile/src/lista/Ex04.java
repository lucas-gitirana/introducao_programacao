package listaWhile;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("######0.00");
		
		String continuar = "s";
		double maiorRelacao = 0;
		int maiorCurso = 0;
		int cont = 1;
		while(continuar.equalsIgnoreCase("s")) {
			System.out.println("C�digo do curso: ");
			int codigo = s.nextInt();
			System.out.println("N�mero de vagas: ");
			int vagas = s.nextInt();
			System.out.println("N�mero de homens: ");
			double homens = s.nextInt();
			System.out.println("N�mero de mulheres: ");
			double mulheres = s.nextInt();
						
			
			// numero de candidatos por vaga
			double candidatosPorVaga = (homens + mulheres)/vagas;	
			System.out.println("N�mero de candidatos por vaga: "+df.format(candidatosPorVaga));
			
			// porcentagem de candidatos do sexo feminino (escreva tamb�m o c�digo correspondente do curso)
			double porcMulheres = (mulheres / (homens + mulheres)*100);
			System.out.println("Porcentagem de mulheres: "+df.format(porcMulheres)+"%");
			
			// o maior n�mero de candidatos por vaga e escreva esse n�mero juntamente com o c�digo do curso correspondente
			if (cont == 1) {
				maiorRelacao = candidatosPorVaga;
				maiorCurso = codigo;
			}else {
				if (candidatosPorVaga > maiorRelacao) {
					maiorRelacao = candidatosPorVaga;
					maiorCurso = codigo;
				}
			}
			 cont++;
			
			System.out.println("Deseja continuar?");
			continuar = s.next();
		}
		
		System.out.println("============================================================================");
		System.out.println("Maior n�mero de candidatos por vaga: "+df.format(maiorRelacao)+" | Curso : "+maiorCurso);
		
	}

}
