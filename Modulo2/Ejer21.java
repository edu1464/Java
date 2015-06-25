import java.util.Scanner;

public class Ejer21 {
	public static void main(String[] args) {
		Scanner intro = new Scanner(System.in);
		int[] num = new int[2];

		for (int i = 0; i <= 1; i++) {
			System.out.println("Ingrsar numero " + (i + 1));
			num[i] = intro.nextInt();
		}

		if (num[0] > num[1] && num[0] % num[1] == 0) {
			System.out.println(num[0] + " es multiplo de " + num[1]);
		} else if (num[0] < num[1] && num[1] % num[0] == 0) {
			System.out.println(num[0] + " no es multiplo de " + num[1]);
		} else if (num[0] == num[1] && num[1] % num[0] == 0){
			System.out.println(num[0] + " es multiplo de " + num[1]);
		} else {
			System.out.println(num[0] + " no es multiplo de " + num[1]);
		}
	}
}