package listaVetores02;

public class Ex01 {

	public static void main(String[] args) {
		int v[] = new int[10];

		int num = 1;
		for (int i=0;i<v.length;i++) {
			v[i] = num;
			
			int divisor = num;
			String binario = "";
			while(divisor >= 1) {				
				if(divisor == 1) {
					binario = 1 +" "+binario;
				}
				else {
					binario = (divisor % 2) +" "+ binario;
				}				
				divisor = divisor / 2;						
			}
			
			System.out.println("Valor informado: "+v[i]);
			System.out.println("Correspondente em binário: "+binario);
			System.out.println("======================================");
			
			num += 2;
		}
		
		for(int i = 0; i<v.length; i++) {
			System.out.println(v[i]);
		}

	}

}
