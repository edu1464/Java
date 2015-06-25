import java.util.Scanner;

public class Ejer29 {
	public static void main(String[] args) {
		Scanner intro = new Scanner(System.in);
		int[] lista = new int[2];
		int cont = 0;
		int par = 0;
		int suma = 0;
		//Ingreso de datos
		for (int i = 0; i <= 1; i++) {
			System.out.println("Ingresar numero " + (i+1));
			int num = intro.nextInt();
			lista[i] = num;
			if (i == 1) {
				while (true) {
					if ((num < lista[0]) || (num == lista[0])) {
						System.out.println("Error: El segundo numero debe ser mayor que el primero");
						System.out.println("Ingresar numero " + (i+1));
						num = intro.nextInt();
					} else {					
						if (num > lista[0]) {
							lista [1] = num;
							break;
						}
					}
				}
			}
		}

		for (int i = lista[0]; i <= lista[1]; i += 7) {
			cont ++;
			if (i % 2 == 0) {
				par ++;
			} else {
				suma += i;
			}
		}

		System.out.println("Cantidad de numeros separados por 7 unidades entre " + lista[0] + " y " + lista[1] + ": " + cont);
		System.out.println("Cantidad de numeros pares entre " + lista[0] + " y " + lista[1] + ": " + par);
		System.out.println("Suma de numeros impares entre " + lista[0] + " y " + lista[1] + ": " + suma);
	}
}