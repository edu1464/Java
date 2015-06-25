import java.util.Scanner;

public class Ejer24 {
	public static void main(String[] args) {
		//Declaracion de variables
		Scanner numero = new Scanner(System.in);
		boolean test = true;
		
		//Ciclo de repeticion para carga de datos
		while (test) {
			boolean test2 = true;
			System.out.println("Ingresar numero");
			int num = numero.nextInt();
			if (num > 10) {
				System.out.println(num + " es mayor que 10");
			} else {
				if (num < 10) {
					System.out.println(num + " es menor que 10");
				} else {
					System.out.println(num + " es igual a 10");
				}
			}

			//Control de repeticion para ingreso de datos
			while (test2) {
				System.out.println("¿Quieres parar? S/N");
				char letra = numero.next().charAt(0);
				if (letra == 'S') {
					test = false;
					test2 = false;
				} else {
					if (letra == 'N') {
						test2 = false;
					} else {
						System.out.println("Opcion no valida");
					}
				}
			}
		}
	}
}