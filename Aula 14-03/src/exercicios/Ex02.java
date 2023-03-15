package exercicios;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Informe uma altura: ");
		double altura = s.nextDouble();
		System.out.println("Informe um peso: ");
		double peso = s.nextDouble();
		
		
		double imc = peso/(altura * altura);
		
		
		String situacao = "";
		if (imc < 20) {
			situacao = "Abaixo do peso";
		}else if (imc < 25) {
			situacao = "Peso normal";		
		}else if(imc < 30) {
			situacao = "Sobrepeso";
		}else if(imc < 40) {
			situacao = "Obeso";
		}else {
			situacao = "Obeso mórbido";
		}
		
		
		System.out.println("A sua situação é: " +situacao);
	}

}
