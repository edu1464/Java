import java.util.Scanner;

public class Ejer26 {
	public static void main(String[] args) {
		Scanner intro = new Scanner(System.in);
		int sum1 = 0;
		int sum2 = 0;
		System.out.println("Ingresar numero");
		int num = intro.nextInt();
		for (int i = 0; i <= num; i++) {
			if (i % 5 == 0) {
				sum2 += i;
			} else {
				System.out.println(i);
				sum1 += i;
			}
		}

		System.out.println("Suma No Multiplos de 5: " + sum1);
		System.out.println("Suma Multiplos de 5: " + sum2);
	}
}