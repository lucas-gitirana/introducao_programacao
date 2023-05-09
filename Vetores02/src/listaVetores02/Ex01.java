package listaVetores02;

public class Ex01 {

	public static void main(String[] args) {
		int v[] = new int[150];

		int num = 1;
		for (int i=0;i<v.length;i++) {
			v[i] = num;
			String binario = "";
			
			if(v[i] <= 255) {
				int divisor = num;				
				while(divisor >= 2) {								
					binario = (divisor % 2) + binario;			
					divisor = divisor / 2;						
				}
				binario = (divisor % 2) + binario;
				
				while(binario.length() < 8) {
					binario = 0 + binario;
				}
			}else {
				binario = "XXXXXXXX";
			}
			
			
			System.out.println(binario+" = "+v[i]);
			/*System.out.println("Valor informado: "+v[i]);
			System.out.println("Correspondente em binário: "+binario);
			System.out.println("Tamanho da string: "+binario.length());
			System.out.println("======================================");*/
			
			num += 2;
		}
	}

}
