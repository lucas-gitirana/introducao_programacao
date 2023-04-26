package listaVetores;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] v = new int[10];
		
		int impares = 1;
		for (int i = 0; i < v.length; i ++) {
			v[i] = impares;
			impares+=2;
		}
		
		for(int i = 0; i < v.length; i++) {
			System.out.println("v["+i+"] = "+v[i]);
		}

	}

}
