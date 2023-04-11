package listaWhile;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a = 5000;		
		int b = 7000;		
		int x = 0;
		
		while(a < b){
			a += (a * 0.03);
			b += (b * 0.02);
			x++;
		}
		
		System.out.println("Tempo necessário: "+x+" anos");

	}

}
