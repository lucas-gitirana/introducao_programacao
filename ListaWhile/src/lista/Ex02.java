package lista;

import java.text.DecimalFormat;

public class Ex02 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("R$ ######0.00");
		
		double f = 50;
		while (f <= 150) {
			double c = (5.0/9.0)*(f-32);
			
			System.out.println("| "+ f + " | " + df.format(c) + " |");			
			f++;
		}

	}

}
