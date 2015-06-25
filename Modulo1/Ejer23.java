import java.util.Scanner;

public class Ejer23 {
	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int cont = 0;
		int par = 0;
		int mayor;
		int menor;
		boolean test1 = true;
		boolean test2 = false;
		for (int i = 1; i <= 2; i++) {
			if (test1) {
				System.out.println("Ingresar numero " + i);
				num1 = numero.nextInt();
				test1 = false;
				test2 = true;
			} else {
				if (test2) {
					System.out.println("Ingresar numero " + i);
					num2 = numero.nextInt();
				}
			}
		}
		if (num1 >= num2) {
			mayor = num1;
			menor = num2;
		} else {
			mayor = num2;
			menor = num1;
		}
		for (int i = menor; i <= mayor; i++) {
			System.out.println(i);
			cont++;
			if (i % 2 == 0) {
				par++;
			}
		}
		System.out.println("Hay " + cont + " numeros entre " + menor + " y " + mayor);
		System.out.println("Hay " + par + " numeros pares entre " + menor + " y " + mayor);
	}
}