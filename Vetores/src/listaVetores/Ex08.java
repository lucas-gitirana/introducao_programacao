package listaVetores;

public class Ex08 {

	public static void main(String[] args) {
		// int v[] = new int[40];
		int v[] = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("Vetor original");
		for(int i = 0; i < v.length; i++) {
			System.out.println(v[i]);
		}
		
		for (int i = 1; i < v.length; i++) {
			v[i] += v[i-1];
		}
		
		System.out.println("Vetor modificado");
		for(int i = 0; i < v.length; i++) {
			System.out.println(v[i]);
		}

	}

}
