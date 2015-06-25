import java.util.Scanner;

public class Ejer22 {
	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		int mayor = 0;
		int menor = 999999999;
		int num;
		for (int i = 1; i <= 5; i++) {
			System.out.println("Ingresar numero " + i);
			num = numero.nextInt();
			if (num >= mayor) {
				mayor = num;
			}
			if (num <= menor) {
				menor = num;
			}
		}
		System.out.println("Mayor: " + mayor);
		System.out.println("Menor: " + menor);
	}
}