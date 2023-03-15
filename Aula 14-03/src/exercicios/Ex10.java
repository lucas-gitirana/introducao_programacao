package lista01_condicionais;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Peso dos peixes: ");
		double peso = s.nextDouble();
		
		double excesso = 0;
		double multa = 0;
		String mensagem = "";
				
		if (peso > 500) {
			excesso = peso - 500;
			multa = excesso * 4;
			mensagem = "Excesso de peso: "+excesso+" kg\n"
					+"Multa: R$ "+multa;
		}else {
			mensagem = "Não há multa por excesso de peso.";
		}
		
		System.out.println(mensagem);
		
		
	}

}
