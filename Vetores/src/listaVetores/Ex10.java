package listaVetores;

public class Ex10 {

	public static void main(String[] args) {
		String a[] = {"a","b","c","d","e"};
		String b[] = {"a","b","c","d","e"};
		int cont = 0;
		
		for (int x = 0; x < a.length; x++) {
			for(int y = 0; y < b.length; y++) {
				if(a[x].equalsIgnoreCase(b[y])){
					cont++;
				}
			}
		}
		
		if(cont == a.length){
			System.out.println("Os vetores têm o mesmo conteúdo");
		}else {
			System.out.println("Os vetores NÃO têm o mesmo conteúdo");
		}

	}

}
