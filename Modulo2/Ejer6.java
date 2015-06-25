import java.util.Scanner;

public class Ejer6 {
	public static void main(String[] args) {
		Scanner intro = new Scanner(System.in);
		System.out.println("Ingresar Dividendo");
		int num1, aux = intro.nextInt();
		System.out.println("Ingresar Divisor");
		int num2 = intro.nextInt();
		int cociente = 0;
		while (true) {
			aux -= num2;
			cociente ++;
			if (aux < num2) {
				break;
			}
		}
		System.out.println("Cociente: " + cociente);
		System.out.println("Resto: " + aux);
	}
}
