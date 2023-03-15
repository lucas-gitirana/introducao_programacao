package lista01_condicionais;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Valor 1: ");
		int num1 = s.nextInt();
		
		System.out.println("Valor 2: ");
		int num2 = s.nextInt();
		
		System.out.println("Valor 3: ");
		int num3 = s.nextInt();
		
		System.out.println("Valor 4: ");
		int num4 = s.nextInt();
		
		System.out.println("Valor 5: ");
		int num5 = s.nextInt();
		
		double media = (num1+num2+num3+num4+num5) / 5;
		
		String mensagem = "";
		
		if (num1 > media) {
			mensagem += "O número "+num1+" é maior que a média \n";
		}
		
		if (num2 > media) {
			mensagem += "O número "+num2+" é maior que a média \n";
		}
		
		if (num3 > media) {
			mensagem += "O número "+num3+" é maior que a média \n";
		}
		
		if (num4 > media) {
			mensagem += "O número "+num4+" é maior que a média \n";
		}
		
		if (num5 > media) {
			mensagem += "O número "+num5+" é maior que a média \n";
		}
		
		System.out.println("Média final: "+media);
		System.out.println(mensagem);

	}

}
