package lista;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int dividendo = -1;
		while(dividendo < 0 || dividendo > 99999) {
			System.out.println("Número na base decimal: ");
			dividendo = s.nextInt();
			
			if (dividendo < 0 || dividendo > 99999) {
				System.out.println("Digite um valor de até cinco digitos");
			}
		}
		
		String binario = "";	
		
		binario = (dividendo % 2) + binario;
		dividendo = dividendo / 2;
		while(dividendo >= 2) {			
			binario = dividendo % 2 + binario;
			dividendo = dividendo / 2;
		}
		
		if (dividendo == 1) {
			binario = dividendo % 2 + binario;
		}		
		
		System.out.println("Número na base 2: "+binario);

	}

}
