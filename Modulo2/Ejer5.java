import java.util.Scanner;

public class Ejer5 {
	public static void main(String[] args) {
		Scanner intro = new Scanner(System.in);
		int result = 0;
		int num1 = 0;
		int num2 = 0;
		for (int i = 0; i <= 1; i++) {
			if (i == 0) {
				System.out.println("Ingresar primer valor");
				num1 = intro.nextInt();
			} else {
				System.out.println("Ingresar segundo valor");
				num2 = intro.nextInt();
			}
		}

		for (int i = 1; i <= num2; i++) {
			result += num1;
		}
		System.out.println("Resultado: " + result);
	}
}