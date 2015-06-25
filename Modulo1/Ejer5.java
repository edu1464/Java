public class Ejer5 {
	public static void main(String[] args) {
		int cont = 0;
		for(int i = 0; i <= 100; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
				cont++;
			}
		}
		System.out.println("Hay " + cont + " impares");
	}
}