package listaWhile;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);		
		
		int totalResidencial = 0;
		int totalComercial = 0;
		int totalIndustrial = 0;
		double somaConsumo = 0;
		int contUsuarios = 0;
		double maior = 0;
		double menor = 0;
		String continuar = "s";
				
		while(continuar.equalsIgnoreCase("s")) {
			System.out.println("Preço do kWh: ");
			double precokwh = s.nextDouble();
			System.out.println("Número do consumidor: ");
			int numConsumidor = s.nextInt();
			System.out.println("Quantidade de kWh consumidos no mês: ");
			double consumo = s.nextDouble();
			
			contUsuarios++;
			double totalPagar = precokwh * consumo;
			somaConsumo += consumo;
			
			String cod = "";
			while (!cod.equalsIgnoreCase("residencial") && !cod.equalsIgnoreCase("comercial") && !cod.equalsIgnoreCase("industrial")) {
				System.out.println("Código do tipo de consumidor: ");
				cod = s.next();
				
				if (!cod.equalsIgnoreCase("residencial") && !cod.equalsIgnoreCase("comercial") && !cod.equalsIgnoreCase("industrial")) {
					System.out.println("Código inválido. Digite residencial, comercial ou industrial ");
				}
			}
			
			if (cod.equalsIgnoreCase("residencial")) {
				totalResidencial+=consumo;
			}else if (cod.equalsIgnoreCase("comercial")) {
				totalComercial+=consumo;
			}else {
				totalIndustrial+=consumo;
			}
			
			if(contUsuarios == 1){
				maior = consumo;
				menor = consumo;
			}else {
				if (consumo < menor) {
					menor = consumo;
				}
				if(consumo > maior) {
					maior = consumo;
				}
			}
			
			System.out.println("O total a pagar do consumidor "+numConsumidor+" é: "+totalPagar);
			
			System.out.println("Deseja continuar? ");
			continuar = s.next();
		}
		
		System.out.println("Maior consumo: "+maior);
		System.out.println("Menor consumo: "+menor);
		System.out.println("Média geral de consumo: "+(somaConsumo/contUsuarios));
		System.out.println("Consumo residencial: "+totalResidencial+" kWh");
		System.out.println("Consumo comercial: "+totalComercial+" kWh");
		System.out.println("Consumo industrial: "+totalIndustrial+" kWh");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
