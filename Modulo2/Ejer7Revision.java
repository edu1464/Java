import java.util.Scanner;

public class Ejer7 {
	public static void main(String[] args) {
		Scanner intro = new Scanner(System.in);
		while (true) {
			int[] lista = new int[5];
			double raiz1 = 0;
			double raiz2 = 0;
			System.out.println("valor 1 = a, valor 2 = b, valor 3 = c");
			//Ingreso de datos
			for (int i = 0; i < 3; i++) {
				System.out.println("Ingresar valor " + (i+1));
				lista[i] = intro.nextInt();
			}

			raiz1 = (lista[1] + Math.sqrt((Math.pow(lista[1],2)) - (4 * lista[0] * lista[2]))) / (2 * lista[0]);
			raiz2 = (lista[1] - Math.sqrt((Math.pow(lista[1],2)) - (4 * lista[0] * lista[2]))) / (2 * lista[0]);
			
			System.out.println("Raiz 1 = " + raiz1);
			System.out.println("Raiz 2 = " + raiz2);
		}

	}
}