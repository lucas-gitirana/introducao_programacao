package listaVetores;

public class Ex13 {

	public static void main(String[] args) {
		int[] v = {-1,5,7,6,9,2,8,4,0,3};
		Math.abs(-1);
		
		int pos = 0;
		int x = 0;
		while(x<v.length) {
			pos = Math.abs(v[pos]);
			System.out.println(v[pos]);									
			x++;
		}

	}

}
