import java.util.Scanner;

public class Ejer16 {
	public static void main (String[] args) {
		Scanner numero = new Scanner(System.in);
		int num;
		System.out.println("Ingresar un numero");
		num = numero.nextInt();
		if (num < 0) {
			System.out.println("El numero ingresado es negativo");
		} else {
			System.out.println("El numero ingresado es positivo");
		}
	}
}