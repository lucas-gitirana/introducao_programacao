package exercicios;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Informe um valor inteiro positivo: ");
		int num = s.nextInt();
		
		String mensagem = "";
		
		if (num % 10 == 0) {
			mensagem = "� divis�vel por 10";
		}
		if (num % 5 == 0) {
			mensagem = mensagem+"\n � divis�vel por 5";
		}
		if (num % 2 == 0) {
			mensagem = mensagem+"\n � divis�vel por 2";
		}
		
		if (mensagem.equals("")){
			System.out.println("N�o � divis�vel por ningu�m.");
		}else {
			System.out.println(mensagem);
		}
		

	}

}
