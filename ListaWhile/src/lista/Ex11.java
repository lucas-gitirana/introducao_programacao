package lista;

public class Ex11 {

	public static void main(String[] args) {
		int x = 1;
		while(x <= 500) {
			if(x % 5 == 0 && x % 3 == 0){
				System.out.println(x);
			}
			x++;
		}
	}
}
