import java.util.Scanner;

public class Ejer2 {
	public static void main(String[] args) {
		//Declaracion de variables
		Scanner intro = new Scanner(System.in);
		int[] num = new int[10];
		int mayor = 11;
		boolean primo;

		//Captura de datos ingresados por el usuario
		for (int i = 0; i <= num.length - 1; i ++) {
			primo = true;
			System.out.println("Ingesar numero " + (i + 1));
			num[i] = intro.nextInt();
			
			//Determinacion de si el valor ingresado es primo
			for (int j = 2; j < num[i]; j ++) {
				if (num[i] % j == 0) {
					primo = false;
					break;
				}
			}

			//Resguardo de la posicion del mayor primo
			if (primo == true) {
				if (mayor == 11) {
					mayor = i;
				} else if (num[i] > num[mayor]) {
					mayor = i;
				}
			}
		}

		System.out.println("");

		//Impresion de todos los valores ingresados por teclado marcando al mayor primo
		for (int i = 0; i <= num.length - 1; i++) {
			if (i == mayor) {
				System.out.println((i + 1) + ": " + num[i] + " ---------> MAYOR PRIMO");
			} else {
				System.out.println((i + 1) + ": " + num[i]);
			}
		}

		//Impresion de la posicion del mayor primo
		if (mayor == 11) {
			System.out.println("ERROR: No se han ingresado numeros primos");
		} else {
			System.out.println("Posicion del mayor primo en el vector: " + mayor);
		}
	}
}