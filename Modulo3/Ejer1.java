import java.util.Scanner;

public class Ejer1 {
	public static void main(String[] args) {
		//Declaracion de variables
		Scanner intro = new Scanner(System.in);
		int[] num = new int[10];
		int mayor = 0;

		//Captura de datos ingresados por el usuario
		for (int i = 0; i <= num.length - 1; i ++) {
			System.out.println("Ingesar numero " + (i + 1));
			num[i] = intro.nextInt();
			if (i == 0) {
				mayor = i;
			} else if (num[i] > num[mayor]) {
				mayor = i;
			}
		}

		System.out.println("");

		for (int i = 0; i <= num.length - 1; i++) {
			if (i == mayor) {
				System.out.println((i + 1) + ": " + num[i] + " ---------> MAYOR");
			} else {
				System.out.println((i + 1) + ": " + num[i]);
			}
		}

		System.out.println("Posicion del mayor en el vector: " + mayor);
	}
}