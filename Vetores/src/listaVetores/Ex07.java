package listaVetores;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		/*int a[] = new int[20];
		int b[] = new int[20];
		int c[] = new int[40];*/
		
		int a[] = {5,6,7,8};
		int b[] = {1,2,3,4};
		int c[] = new int[8];
		
		for(int i = 0; i < a.length; i++) {
			c[2*i] = a[i];
			c[2*i + 1] = b[i];			
		}
		
		
		for(int i = 0; i < c.length; i++) {
			System.out.println(c[i]);			
		}		
	}
}
