package funcoes;

import java.util.Scanner;

public class Ex14 {
	public static String getTabuada(int val) {
		String tabuada = "";
		for (int i = 1; i <= val; i++) {
			tabuada += i+" X "+val+" = "+(i*val)+"\n";
		}
		return tabuada;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Valor: ");
		int val = s.nextInt();
		
		System.out.println("Tabuada : \n" + getTabuada(val));

	}

}
