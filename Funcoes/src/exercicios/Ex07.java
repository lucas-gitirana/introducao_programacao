package funcoes;

import java.util.Scanner;

public class Ex07 {
	public static String getCategoria(int idade) {
		String categoria;
			if(idade >= 5 && idade <= 7){
				categoria = "Infantil A";
			}else if(idade >= 8 && idade <= 10) {
				categoria = "Infantil B";
			}else if(idade >= 11 && idade <= 13) {
				categoria = "Juvenil A";
			}else if(idade >= 14 && idade <= 17) {
				categoria = "Juvenil B";
			}else if(idade > 17){
				categoria = "Adulto";
			}else {
				categoria = "Inválido";
			}
		return categoria;
	}

	public static void main(String[] args) {		
		Scanner s = new Scanner(System.in);
		System.out.println("Idade do nadador: ");
		int idade = s.nextInt();
		System.out.println("Categoria do nadador: "+getCategoria(idade));
	}

}
