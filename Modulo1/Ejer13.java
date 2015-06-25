import java.util.Scanner;

public class Ejer13 {
	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		int num = 0;
		int cont = 0;
		int suma = 0;
		boolean test = true;
		while (test) {
			System.out.println("Ingresar un valor");
			num = numero.nextInt();
			if (num <= 500) {
				test = false;
			}
		}
		for(int i = 0; i <= num ; i+=8) {
			System.out.println(i);
			cont++;
			suma += i;
		}
		System.out.println("Hay " + cont + " valores entre 0 y " + num);
		System.out.println("Suma: " + suma);
	}
}