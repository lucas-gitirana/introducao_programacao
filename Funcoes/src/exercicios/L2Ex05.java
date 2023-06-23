package funcoes;

import java.util.Scanner;

public class L2Ex05 {
	private static double calcula_esfera(double raio) {
		return (Math.PI * (4/3) * Math.pow(raio, 3));
	}
	private static double calcula_paralelepipido(double largura, double comprimento, double altura) {
		return (largura*comprimento*altura);
	}
	private static String calcula(double volumeCaixa) {
		double volEsfera10 = calcula_esfera(5);
		double volEsfera15 = calcula_esfera(7.5);
		double volEsfera20 = calcula_esfera(10);
		double volEsfera25 = calcula_esfera(12.5);
		
		double totalCaixas = 0;
		double totalCaixas10 = 0;
		double totalCaixas15 = 0;
		double totalCaixas20 = 0;
		double totalCaixas25 = 0;
		
		
		if(volumeCaixa >= volEsfera25) {
			totalCaixas += (volumeCaixa / volEsfera25);
			totalCaixas25 = (volumeCaixa / volEsfera25);
			volumeCaixa = (volumeCaixa % volEsfera25);
		}
		if(volumeCaixa >= volEsfera20) {
			totalCaixas += (volumeCaixa / volEsfera20);
			totalCaixas20 = (volumeCaixa / volEsfera20);
			volumeCaixa = (volumeCaixa % volEsfera20);
		}
		if(volumeCaixa >= volEsfera15) {
			totalCaixas += (volumeCaixa / volEsfera15);
			totalCaixas15 = (volumeCaixa / volEsfera15);
			volumeCaixa = (volumeCaixa % volEsfera15);
		}
		if(volumeCaixa >= volEsfera10) {
			totalCaixas += (volumeCaixa / volEsfera10);
			totalCaixas10 = (volumeCaixa / volEsfera10);
			volumeCaixa = (volumeCaixa % volEsfera10);
		}
		
		return "Total de esferas: "+(int)totalCaixas+"\n"
				+ "Esfera10: "+(int)totalCaixas10+"\n"
				+ "Esfera15: "+(int)totalCaixas15+"\n"
				+ "Esfera20: "+(int)totalCaixas20+"\n"
				+ "Esfera25: "+(int)totalCaixas25;					
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);		
		System.out.println("Altura: ");
		double h = s.nextDouble();
		System.out.println("Comprimento: ");
		double c = s.nextDouble();
		System.out.println("Largura: ");
		double l = s.nextDouble();
		
		System.out.println("Resultado: "+ calcula(calcula_paralelepipido(h,c,l)));

	}

}
