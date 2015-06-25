public class Ejer16 {
	public static void main(String[] args) {
		int sum;
		for (int i = 1; i <= 1000; i++) {
			sum = 0;
			for (int j = 1; j <=i; j++) {
				if (j % 2 == 1) {
					sum += j;
				}
			}
			System.out.println("Suma de los impares de 1 hasta " + i + ": " + sum);
		}
	}
}