import java.util.Scanner;

public class Ejer8 {
	public static void main(String[] args) {
		Scanner intro = new Scanner(System.in);
		boolean fin = true;
		while (fin) {
			System.out.println("Ingresar numero");
			String num = intro.next();
			System.out.println("El numero " + num + " tiene " + num.length() + " digitos");

			while (true) {
				System.out.println("¿Terminar? S/N");
				char test = intro.next().charAt(0);
				if (test == 'S') {
					fin = false;
					break;
				} else if (test != 'N') {
					System.out.println("ERROR: Opcion no valida");
				} else {
					break;
				}
			}
		}
	}
}