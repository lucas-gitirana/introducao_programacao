package funcoes;

import java.util.Scanner;

public class Ex05 {
	public static String converteTempoProcesso(int segundos) {
		int segundosP = segundos;
		int minutosP = 0;
		int horasP = 0;
		if (segundosP >= 60) {
			minutosP = segundosP / 60;
			segundosP = segundosP % 60;
		}
		if(minutosP >= 60) {
			horasP = minutosP / 60;
			minutosP = minutosP % 60;
		}
		return (horasP+":"+minutosP+":"+segundosP);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Tempo de duração do processo em segundos: ");
		int tempoProcesso = s.nextInt();
		System.out.println("Tempo do processo em horas: "+converteTempoProcesso(tempoProcesso));
	}

}
