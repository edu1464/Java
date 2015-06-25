import java.util.Scanner;

public class Ejer10 {
	public static void main(String[] args) {
		Scanner intro = new Scanner(System.in);
		System.out.println("Ingresar numero");
		int num = intro.nextInt();
		int primo = 0;
		//Ciclo for para descubrir divisores del valor ingresado
		for (int i = 2; i < num; i ++) {
			boolean test = true;
			if (num % i == 0) {
				//Ciclo for para descubrir si el divisor del valor ingresado en primo
				for (int j = 2; j < i; j ++) {
					if (i % j == 0) {
						test = false;
					}
				}
				if (test) {
					primo = i;
					break;
				}
			}
		}
		if (primo == 0) {
			System.out.println("Menor primo de " + num + " es: " + num);
		} else {
			System.out.println("Menor primo de " + num + " es: " + primo);
		}
	}
}