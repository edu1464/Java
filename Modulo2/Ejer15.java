import java.util.Scanner;

public class Ejer15 {
	public static void main(String[] args) {
		//Declaracion de variables
		Scanner intro = new Scanner(System.in);
		int[] num = new int[2];
		int cont = 0;
		int par = 0;
		int sumImp = 0;

		//Ingreso de datos
		for (int i = 0;  i <= 1; i++) {
			if (i == 0) {
				System.out.println("Ingresar numero " + (i + 1));
				num[i] = intro.nextInt();
			} else {
				while (true) {
					System.out.println("Ingresar numero " + (i + 1));
					num[i] = intro.nextInt();
					if (num[i] <= num[0]) {
						System.out.println("ERROR: Ingresar numero mayor que " + num[0]);
					} else {
						break;
					}
				}
			}	
		}

		//Procesamiento de datos
		for (int i = num[0]; i <= num[1]; i += 7) {
			System.out.println(i);
			cont ++;
			if (i % 2 == 0) {
				par ++;
			} else {
				sumImp += i;
			}
		}

		//Impresion de resultados en pantalla
		System.out.println("Cantidad de numeros: " + cont);
		System.out.println("Cantidad de numeros pares: " + par);
		System.out.println("Suma de numeros impares: " + sumImp);
	}
}