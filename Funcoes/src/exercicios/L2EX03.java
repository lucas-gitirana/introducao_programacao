package funcoes;

import java.util.Scanner;

public class L2EX03 {
	private static String calcula(double massaInicial) {
		String retorno = "Massa inicial: "+massaInicial+" | ";
		int tempo = 0;
		while(massaInicial >= 0.5) {
			massaInicial = massaInicial/2;
			tempo += 50;
		}
		return  retorno + "Massa final: "+massaInicial+" | Tempo: "+tempo+" segundos";
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Massa inicial: ");
		double massaInicial = s.nextDouble();
		System.out.println("Resultado: "+calcula(massaInicial));

	}

}
