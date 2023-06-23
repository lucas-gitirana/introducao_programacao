package funcoes;

import java.util.Scanner;

public class L2Ex01 {

	public static void soma_pares(int[] valores) {
		int somaPares = 0;
		for(int i = 0; i < valores.length; i++) {
			if(valores[i] % 2 == 0) {
				somaPares += valores[i];
			}			
		}
		System.out.println("Soma dos valores pares: "+somaPares);
	}
	
	public static void conta_negativos(int[] valores) {
		int contNegativos = 0;
		for(int i = 0; i < valores.length; i++) {
			if(valores[i] < 0) {
				contNegativos += 1;
			}			
		}
		System.out.println("Quantidade de valores negativos: "+contNegativos);
	}
	
	public static void soma_intervalo(int[] valores) {
		int somaIntervalo = 0;
		for(int i = 0; i < valores.length; i++) {
			if(valores[i] >= 1 && valores[i] <= 25) {
				somaIntervalo += valores[i];
			}			
		}
		System.out.println("Soma dos valores entre 1 e 25: "+somaIntervalo);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String continua = "";
		int contNums = 0;
		int arrNums[] = new int[30]; 
		while(!continua.equalsIgnoreCase("N")) {
			System.out.println("Informe um valor inteiro: ");
			int num = s.nextInt();
			contNums += 1;
			arrNums[contNums-1] = num;
			
			if(contNums < 3) {
				continua = "";
				while(!continua.equalsIgnoreCase("N") && !continua.equalsIgnoreCase("S")) {
					System.out.println("Deseja continuar?");
					continua = s.next();
					if(!continua.equalsIgnoreCase("N") && !continua.equalsIgnoreCase("S")) {
						System.out.println("Informe valores válidos!");
					}
				}
			}else {											
				continua = "N";
			}
		}
		
		soma_pares(arrNums);
		conta_negativos(arrNums);
		soma_intervalo(arrNums);
	}

}
