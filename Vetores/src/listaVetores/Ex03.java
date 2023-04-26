package listaVetores;

public class Ex03 {

	public static void main(String[] args) {
		// v[0] -> v[8]
		// v[1] -> v[9]
		// v[2] -> v[10]
		
		int[] lista = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		
		System.out.println("Before the loop: ");		
		for (int i = 0; i < lista.length; i++) {
			System.out.println("v["+i+"] = "+ lista[i]);
		}
		
		for(int i = 0; i < lista.length/2; i++) {
			int aux = lista[i];
			lista[i] = lista[i + 8];
			lista[i + 8] = aux;
		}
		
		System.out.println("After the loop: ");
		for (int i = 0; i < lista.length; i++) {
			System.out.println("v["+i+"] = "+ lista[i]);
		}

	}

}
