public class Ejer19 {
	public static void main(String[] args) {
		int par = 0;
		int impar = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				par += i;
			} else {
				impar += i;
			}
			System.out.println(i);
		}
		System.out.println("Suma Pares: " + par);
		System.out.println("Suma Impares: " + impar);
	}
}