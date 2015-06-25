import java.util.Scanner;

public class Ejer23 {
	public static void main(String[] args) {
		//Declaracion de variables
		Scanner intro = new Scanner(System.in);
		int[] num = new int[10];
		int aux1 = 0;
		int aux2 = 0;

		//Captura de datos
		for (int i = 0; i <= num.length - 1; i ++) {
			System.out.println("Ingresar numero " + (i + 1));
			num[i] = intro.nextInt();
		}	

		for (int i = 0; i <= num.length - 1; i++) {
			System.out.println((i + 1) + ": " + num[i]);	
		}
		
		System.out.println("");

		//Procesamiento de datos
		for (int i = 0; i <= num.length - 1; i ++) {
			if (i == 0) {
				aux1 = num[i];
			} else if (i == num.length - 1) {
				aux2 = num[0];
				num[0] = aux1;
				break;
			}
			aux2 = num[i + 1];
			num[i + 1] = aux1;
			aux1 = aux2;
		}
		for (int i = 0; i <= num.length - 1; i++) {
			System.out.println((i + 1) + ": " + num[i]);	
		}
	}
}