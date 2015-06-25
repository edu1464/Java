import java.util.Scanner;

public class Ejer25 {
	public static void main(String[] args) {
		Scanner intro = new Scanner(System.in);
		boolean salir = true;
		while (salir) {
			System.out.println("Ingresar un numero");
			int num = intro.nextInt();
			if (num % 2 == 0) {
				System.out.println("ERROR 502:Ingresaste un multiplo de 2");
			}

			// Ciclo pregunta
			while (true) {
				System.out.println("¿Seguir ingresando numeros? S/N");
				char test = intro.next().charAt(0);
				if (test == 'N') {
					salir = false;
					break;
				} else {
					if (test == 'S') {
						break;
					} else {
						System.out.println("ERROR 625: Opcion no válida");
					}
				}
			}
		}
	}
}