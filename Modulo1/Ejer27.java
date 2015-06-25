import java.util.Scanner;

public class Ejer27 {
	public static void main(String[] args) {
		Scanner intro = new Scanner(System.in);
		int cont = 0;
		System.out.println("Ingresar numero");
		int num = intro.nextInt();
		for (int i = 1; i <= num; i++) {
			if ((i % 2 == 0) && (i % 3 == 0)) {
				System.out.println(i);
				cont++;
			}
		}
		System.out.println("Hay " + cont + " numeros multiplos de 2 y 3");
	}
}