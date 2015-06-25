import java.util.Scanner;

public class Ejer3 {
	public static void main(String[] args) {
		Scanner intro = new Scanner(System.in);
		int[] numeros = new int[2];
		int num;
		int cont = 0;
		int suma = 0;

		//Ingreso de datos controlados
		for (int i = 0; i <= 1; i++) {
			if (i == 0) {
				System.out.println("Ingresar numero " + (i + 1));
				num = intro.nextInt();
				numeros[i] = num;
			}
			if (i == 1) {
				while (true) {
					System.out.println("Ingresar numero " + (i + 1));
					num = intro.nextInt();
					if (num < numeros[0]) {
						System.out.println("Error: Debe ingresar un numero mayor o igual que " + numeros[0]);
					} else {
						numeros[i] = num;
						break;
					}
				}
			}
		}

		for (int i = numeros[0]; i <= numeros[1]; i++) {
			System.out.println(i);
			if (i % 2 == 0) {
				cont ++;
				suma += i;
			}	
		}

		System.out.println("Cantidad de numeros pares entre " + numeros[0] + " y " + numeros[1] + ": " + cont);
		System.out.println("Suma de numeros pares entre " + numeros[0] + " y " + numeros[1] + ": " + suma);
	}
}