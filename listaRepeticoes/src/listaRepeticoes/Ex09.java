package listaRepeticoes;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int contBomAp = 0;
		double contExemplar = 0;
		
		double i = 0;
		for(i = 1; i <= 2; i++) {
			System.out.println("==========================");
			System.out.println("Bimestre 1: ");
			double b1 = s.nextDouble();
			System.out.println("Bimestre 2: ");
			double b2 = s.nextDouble();
			System.out.println("Bimestre 3: ");
			double b3 = s.nextDouble();
			System.out.println("Bimestre 4: ");
			double b4 = s.nextDouble();
			
			double media = (b1+b2+b3+b4)/4;			
			String citacao = "";
			
			if(media >= 7 && media <= 7.9) {
				citacao = "Honras pelo bom aproveitamento";
				contBomAp++;
				
			}else if(media >= 8 && media <= 8.9){
				citacao = "Honras pelo ótimo aproveitamento";
				
			}else if(media >= 9 && media <= 10) {
				int cont10 = 0;
				
				if(b1 == 10) {
					cont10++;
				}
				if(b2 == 10) {
					cont10++;
				}
				if(b3 == 10) {
					cont10++;
				}
				if(b4 == 10) {
					cont10++;
				}
				
				if (cont10 >=2) {
					citacao = "Aluno exemplar";
					contExemplar++;
				}else {
					citacao = "Honras pelo excelente aproveitamento";
				}
			}else {
				citacao = "Não há citação";
			}			
			System.out.println("Média: "+media);
			System.out.println("Citação: "+citacao);			
		}
		
		double percExemplar = (contExemplar / (i-1))*100;
		
		System.out.println("================");
		System.out.println("Alunos com 'Honras pelo bom aproveitamento': "+contBomAp);
		System.out.println("Percentual de alunos exemplares: "+percExemplar+"%");
		
		
		

	}

}
