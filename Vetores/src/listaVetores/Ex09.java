package listaVetores;

public class Ex09 {

	public static void main(String[] args) {
		String unidade[] = {"um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove"};
		
		String dezena[] = {"dez", "onze", "doze", "treze", "catorze", "quinze", "dezesseis", "dezessete",
				"dezoito", "dezenove"};
		
		String dezena2[] = {"vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa", "cem"};
		
		String centena[] = {"cento", "duzentos", "trezentos", "quatrocentos", "quinhentos", "seiscentos", 
				"setecentos", "oitocentos", "novecentos"};
		
		int v[] = {7,5,9,9,4};
		
		String res = "";
		
		if(v[0]== 1) {
			res += dezena[v[1]]+" mil";
		}else {
			res += dezena2[v[0]-2]+" e "+unidade[v[1]-1]+" mil ";
		}
		
		res += centena[v[2]-1] +" e "+dezena2[v[3]-2]+" e "+unidade[v[4]-1];
		
		
		System.out.println(res);
		

	}

}
