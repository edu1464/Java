public class Ejer20 {
	public static void main(String[] args) {
		int cont = 0;
		for (int i = 1; i <= 100; i++) {
			if ((i % 2 == 0) || (i % 3 == 0)) {
				System.out.println(i);
				cont++;
			}
		}
		System.out.println("Hay " + cont + " numero multiplos de 2 o 3");
	}
}