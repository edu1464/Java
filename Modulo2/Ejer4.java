import java.util.Scanner;

public class Ejer4 {
	public static void main(String[] args) {
		Scanner intro = new Scanner(System.in);
		System.out.println("Ingresar numero");
		int num = intro.nextInt();
		int factorial = 1;
		for (int i = 1; i <= num; i++) {
			factorial *= i;
		}
		System.out.println("Factorial de " + num +": " + factorial);
	}
}