package ex;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("R$ ######0.00");
		
		System.out.println("Peso dos peixes: ");
		double peso = s.nextDouble();
		
		double excesso = 0;
		double multa = 0;
		String mensagem = "";
				
		if (peso > 500) {
			excesso = peso - 500;
			multa = excesso * 4;
			mensagem = "Excesso de peso: "+excesso+" kg\n"
					+"Multa: R$ "+df.format(multa);
		}else {
			mensagem = "N�o h� multa por excesso de peso.";
		}
		
		System.out.println(mensagem);

	}

}
