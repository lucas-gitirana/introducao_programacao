package listaWhile;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Termo 1: ");
		int t1 = s.nextInt();
		System.out.println("Termo 2: ");
		int t2 = s.nextInt();
		
		int a = 0;
		int i = 3;
		String serie = t1+" "+t2+" ";
		int atual = t2;
		int anterior = t1;
		int aux = 0;
		while(i <= 20) {			
			 if(i % 2 == 0) {				 
				 a = anterior - atual;
				 serie += a+" ";
				 aux = atual;
				 anterior = atual;
				 atual = a;	
			 }else {
				 a = anterior + atual;
				 serie += a+" ";
				 aux = atual;
				 anterior = atual;
				 atual = a;				 
			 }
			 i++;
		}
		System.out.println("Série: "+serie);
	}

}
