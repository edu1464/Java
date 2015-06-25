import java.util.Scanner;

public class Ejer18 {
	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		int num;
		int cont = 0;
		System.out.println("Ingresar un numero");
		num = numero.nextInt();
		for (int i = 1; i <= num; i++) {
			if (i % 3 == 0) {
				cont++;
				System.out.println(i);
			}
		}
		System.out.println("Hay " + cont + " numeros multiplos de 3 entre 1 y " + num);
	}
}
