import java.util.Scanner;

public class Ejer15 {
	public static void main (String[] args) {
		Scanner numero = new Scanner(System.in);
		int num = 0;
		boolean test = true;
		int suma = 0;
		while (test) {
			System.out.println("Ingresar numero menor a 100");
			num = numero.nextInt();
			if (num <= 100) {
				test = false;
			}
		}
		for (int i = 0; i <= num; i += 4) {
			if (i % 2 == 0) {
				suma += i * i;
			}
		}
		System.out.println("Suma de los Cuadrados Menores que 100: " + suma);
	}
}