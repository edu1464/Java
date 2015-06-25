import java.util.Scanner;

public class Ejer1 {
	public static void main(String[] args) {
		Scanner intro = new Scanner(System.in);
		System.out.println("Ingresar numero");
		int num = intro.nextInt();
		double num1 = 0;
		if (num < 500) {
			num1 = num + (num * 0.5);
		} else {
			if (num >= 500 && num < 1000) {
				num1 = num + (num * 0.07);
			} else {
				if (num > 1000 && num <= 5000) {
					num1 = num - (num * 0.05);
				}
			}
		}
		
		System.out.println("Resultado: " + num1);
	}
}