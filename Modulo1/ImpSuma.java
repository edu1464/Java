public class ImpSuma {
	public static void main(String[] args) {
		int suma = 0;
		for(int i = 100; i >= 00; i--) {
			if (i % 2 == 1) {
				System.out.println(i);
				suma += i;
			}
		}
		System.out.println("Suma de impares: " + suma);
	}
}

