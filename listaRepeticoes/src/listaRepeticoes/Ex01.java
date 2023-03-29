package listaRepeticoes;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Base da tabuada: ");
		int base = s.nextInt();
		
		for(int i = 1; i<=10; i++) {
			System.out.println(i+"x"+base+"="+(i * base));
		}

	}

}
