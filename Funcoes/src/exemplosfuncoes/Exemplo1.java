package exemplosfuncoes;

public class Exemplo1 {
	public static void soma1(int v1, int v2) {
		System.out.println("Soma 1: "+(v1+v2));
	}
	public static int soma2(int v1, int v2) {
		return v1 + v2;
	}
	
	public static void main(String args[]) {
		soma1(3,7);
		System.out.println("Soma 2: " + soma2(1,5));
	}

}
