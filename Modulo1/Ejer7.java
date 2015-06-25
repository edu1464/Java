import java.util.Scanner;

public class Ejer7 {
	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		int num;
		System.out.println("Ingresar un valor");
		num = numero.nextInt();
		for(int i = 0; i <= num ; i++) {
				System.out.println(i);
		}
	}
}