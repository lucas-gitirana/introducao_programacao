package listaRepeticoes;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int contComercio = 0;
		int contIndustria = 0;
		int contInaptosComercio = 0;
		int contInaptosIndustria = 0;
		int contAptosComercio = 0;
		int contAptosIndustria = 0;
		
		int i = 0;
		for(i=1;i<4;i++) {
			
		}
		
		
		
		
		
		System.out.println("ÁREA: \n"
				+ "[1] Comércio\n"
				+ "[2] Indústria");
		int op = s.nextInt();
		
		int segundoGrau = 0;
		int superior = 0;
		int experiencia = 0;
		int anosCidade = 0;
		String exigencias = "";
		int contAprovacoes = 0;
		String situacao = "";
		
		switch(op) {
			case 1:
				contComercio++;
				
				System.out.println("Anos residindo na cidade: ");
				anosCidade = s.nextInt();
				System.out.println("Segundo grau completo? \n1- sim e 2 - não");
				segundoGrau = s.nextInt();
				System.out.println("Experiência comprovada? \n1- sim e 2 - não");
				experiencia = s.nextInt();
				
				if(anosCidade >= 1){
					contAprovacoes++;					
				}else {
					exigencias += "Tempo residindo na cidade menor que 1 ano \n";
				}
				
				if(segundoGrau == 1){
					contAprovacoes++;					
				}else {
					exigencias += "Segundo grau incompleto \n";
				}
				
				if(experiencia == 1){
					contAprovacoes++;					
				}else {
					exigencias += "Falta de experiência comprovada \n";
				}
				
				if(contAprovacoes == 3) {
					situacao = "APTO";
				}else {
					situacao = "INAPTO";
				}							
				break;
			
			case 2:
				contIndustria++;
				System.out.println("Área: \n 1-Operacional 2-Gerência");
				int area = s.nextInt();
				
				switch(area) {
					case 1:
						System.out.println("Segundo grau completo? \n1- sim e 2 - não");
						segundoGrau = s.nextInt();
						
						
						if( segundoGrau == 1) {
							situacao = "APTO";
						}else {
							situacao = "INAPTO";
							exigencias = "Segundo grau incompleto";
						}
						
						break;
						
					case 2:
						System.out.println("Superior completo? \n1- sim e 2 - não");
						superior = s.nextInt();
						System.out.println("Experiência comprovada? \n1- sim e 2 - não");
						experiencia = s.nextInt();
						
						if(superior == 1){
							contAprovacoes++;					
						}else {
							exigencias += "Falta de superior completo \n";
						}
						
						if(experiencia == 1){
							contAprovacoes++;					
						}else {
							exigencias += "Falta de experiência \n";
						}
						
						if(contAprovacoes == 2) {
							situacao = "APTO";
						}else {
							situacao = "INAPTO";
						}	
						
				}
							
				
				break;
			
			default:
				System.out.println("Opção inválida");
					
		}
		
		System.out.println("======================");
		if(situacao == "APTO") {
			System.out.println("Situação: "+situacao);
		}else {
			System.out.println("Situação: "+situacao);
			System.out.println("Motivos: \n"+exigencias);
		}

	}

}
