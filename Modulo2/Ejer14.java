import java.util.Scanner;

public class Ejer14 {
	public static void main(String[] args) {
		//Definicion de variables
		Scanner intro = new Scanner(System.in);
		int [] num = new int[2];
		int mayor = 0;
		int menor = 0;
		int cant = 0;
		int par = 0;
		int sumImp = 0;

		//Ingreso de datos
		for (int i = 0; i <= 1; i++) {
			System.out.println("Ingresar numero " + (i + 1));
			num[i] = intro.nextInt();
		}

		//Asignacion de mayor y menor
		if (num[0] > num[1]) {
			mayor = num[0];
			menor = num[1];
		} else {
			mayor = num[1];
			menor = num[0];
		}

		//Proceso de datos
		for (int i = (menor + 1); i < mayor; i++) {
			System.out.println(i);
			if (i % 2 == 0) {
				par ++;
			} else {
				sumImp += i;
			}
		}
		cant = mayor - menor - 1;

		//Salida por pantalla de los resultados
		System.out.println("Cantidad de numeros entre " + menor + " y " + mayor + ": " + cant);
		System.out.println("Cantidad de numeros pares: " + par);
		System.out.println("Suma de numeros impares: " + sumImp);
	}
}