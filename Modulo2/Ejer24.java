import java.util.Scanner;

public class Ejer24 {
	public static void main(String[] args) {
		//Declaracion de variables
		Scanner intro = new Scanner(System.in);
		int[] num = new int[2];
		int result = 0;

		//Captura de datos ingresados por teclado por usuario
		for (int i = 0; i <= 1; i++) {
			System.out.println("Ingresar numero " + (i + 1));
			num[i] = intro.nextInt();
		}
	
		//Procesamiento de datos ingresado por el usuario
		for (int i = 1; i <= num[1]; i++) {
			result += num[0];
		}

		//Imprimir resultado en pantalla
		System.out.println("Resultado: " + result);
	}
}