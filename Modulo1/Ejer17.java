import java.util.Scanner;

public class Ejer17 {
	public static void main (String[] args) {
		Scanner numero = new Scanner(System.in);
		int num;
		System.out.println("Ingrese un numero");
		num = numero.nextInt();
		if (num % 2 == 0) {
			System.out.println("El numero ingresado en par");
		} else {
			System.out.println("El numero ingresado es impar");
		}
	}
}