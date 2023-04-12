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
			System.out.println("Código do curso: ");
			int codigo = s.nextInt();
			System.out.println("Número de vagas: ");
			int vagas = s.nextInt();
			System.out.println("Número de homens: ");
			double homens = s.nextInt();
			System.out.println("Número de mulheres: ");
			double mulheres = s.nextInt();
						
			
			// numero de candidatos por vaga
			double candidatosPorVaga = (homens + mulheres)/vagas;	
			System.out.println("Número de candidatos por vaga: "+df.format(candidatosPorVaga));
			
			// porcentagem de candidatos do sexo feminino (escreva também o código correspondente do curso)
			double porcMulheres = (mulheres / (homens + mulheres)*100);
			System.out.println("Porcentagem de mulheres: "+df.format(porcMulheres)+"%");
			
			// o maior número de candidatos por vaga e escreva esse número juntamente com o código do curso correspondente
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
		System.out.println("Maior número de candidatos por vaga: "+df.format(maiorRelacao)+" | Curso : "+maiorCurso);
		
	}

}
