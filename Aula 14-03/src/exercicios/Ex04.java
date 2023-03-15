package lista01_condicionais;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Informe sua idade: ");
		int idade = s.nextInt();
		
		String classe_eleitoral = "";
		
		if (idade < 16) {
			classe_eleitoral = "Não eleitor";
		}else if(idade >= 18 && idade <= 65) {
			classe_eleitoral = "Eleitor obrigatório";
		}else{
			classe_eleitoral = "Eleitor facultativo";
		}
		
		System.out.println("Sua classe eleitoral é: "+classe_eleitoral);

	}

}
