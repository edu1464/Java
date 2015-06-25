import java.util.Scanner;

public class Ejer18 {
	public static void main(String[] args) {
		//Declaracion de variables
		Scanner intro = new Scanner(System.in);
		int[] num = new int[3];
		boolean test;
		int suma = 0;
		int media = 0;
		int menor = 0;
		int mayor = 0;

		//Carga de datos
		for (int i = 0; i <= 2; i++) {
			test = true;
			while (test) {
				System.out.println("Ingresar numero " + (i + 1));
				num[i] = intro.nextInt();

				//Control para datos cargados repetidos
				for (int j = 0; j <= i; j++) {
					if (i != j) {
						if (num[j] == num[i]) {
							System.out.println("ERROR: Ingresar un numero distinto a " + num[j]);
							break;
						}
					} else {
						test = false;
					}
				}
			}
			if (i == 0) {
				mayor = num[i];
				menor = num[i];
			} else {
				if (num[i] > mayor) {
					mayor = num[i];
				} else if (num[i] < menor){
					menor = num[i];
				}
			}
		}
		suma = num[0] + num[1] + num[2];
		media = suma / num.length;

		//Impresion de resultados por pantalla
		System.out.println("Mayor: " + mayor);
		System.out.println("Menor: " + menor);
		System.out.println("Suma: " + suma);
		System.out.println("Media Aritmetica: " + media);

	}
}