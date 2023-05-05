package listaVetores;

public class Ex12 {

	public static void main(String[] args) {
		int[] v = {1,0,0,0,0,3,4,0,6,0,8,9,10};
		
		for(int i = 0; i<v.length; i++) {
			if(v[i]==0) {
				for(int x = i+1; x<v.length; x++) {
					if(v[x] != 0) {
						v[i] = v[x];
						v[x] = 0;
						break;
					}					
				}
				
			}
		}
		
		for(int i = 0; i<v.length; i++) {
			System.out.println(v[i]);
		}
		
		

	}

}
