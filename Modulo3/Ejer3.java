import java.util.Scanner;

public class Ejer3 {
	public static void main(String[] args) {
		Scanner intro = new Scanner(System.in);
		int[] num = new int[10];
		int resg;
		int menor = num.length;
		int indice = num.length;

		for (int i = 0; i <= num.length - 1; i++) {
			System.out.println("Ingresar numero " + (i + 1));
			num[i] = intro.nextInt();
		}

		for (int i = 0; i <= num.length - 1; i++) {
			resg = 0;
			for (int j = i + 1; j <= num.length - 1; j++) {
				resg ++;
				if (num[i] + 1 == num[j]) {
					if (j - i < menor) {
						menor = resg;
						indice = i;
						break;
					}
				}
			}
		}
		
		System.out.println("");

		for (int i = 0; i <= num.length - 1; i++) {
			if (menor == num.length) {
				System.out.println("ERROR: No existen numeros vecinos en el arreglo");
			} else {
				if (i == indice) {
					System.out.println((i + 1) + ": " + num[i] + " -----> INDICE");	
				} else if (i < indice + menor && i > indice) {
					System.out.println((i + 1) + ": " + num[i] + "      *");	
				} else if (indice + menor == i) {
					System.out.println((i + 1) + ": " + num[i] + " -----> VECINO");
				} else {
					System.out.println((i + 1) + ": " + num[i]);
				}
			}
		}
		System.out.println("");
		System.out.println("Indice del menor vecino: " + indice);
		System.out.println("Distancia: " + menor);
	}
}