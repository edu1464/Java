import java.util.Scanner;

public class Ejer17 {
	public static void main(String[] args) {
		//Declaracion de variables
		Scanner intro = new Scanner(System.in);
		int[] num = new int[2];
		int suma;
		int producto;
		int diferencia;
		int cociente;
		int resto;
		
		//Carga de valores
		for (int i = 0; i <= 1; i ++) {
			System.out.println("Ingresar numero " + (i + 1));
			num[i] = intro.nextInt();
		}

		suma = num[0] + num[1];
		producto = num[0] * num[1];
		diferencia = num[0] - num[1];
		cociente = num[0] / num[1];
		resto = num[0] % num[1];
		
		System.out.println("Suma: " + suma);
		System.out.println("Producto: " + producto);
		System.out.println("Diferencia: " + diferencia);
		System.out.println("Cociente: " + cociente);
		System.out.println("Resto: " + resto);
	}

}