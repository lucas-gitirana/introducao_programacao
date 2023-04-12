package listaWhile;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String continuar = "s";
		int contU10 = 0;
		int contO20 = 0;
		int cont10to20 = 0;
		while (continuar.equalsIgnoreCase("s")) {
			System.out.println("Nome do produto: ");
			String nome = s.next();
			System.out.println("Preço de compra: ");
			double precoCompra = s.nextDouble();
			System.out.println("Preço de venda: ");
			double precoVenda = s.nextDouble();
			
			double porcLucro = ((precoVenda - precoCompra)/precoCompra)*100;
			
			if (porcLucro<10) {
				contU10++;
			}else if(porcLucro <= 20) {
				cont10to20++;
			}else {
				contO20++;
			}
			
			System.out.println("Deseja continuar? ");
			continuar = s.next();
		}
		
		System.out.println("================================");
		System.out.println("Abaixo de 10%: "+contU10);
		System.out.println("Entre 10% e 30%: "+cont10to20);
		System.out.println("Acima de 20%: "+contO20);
	}

}
