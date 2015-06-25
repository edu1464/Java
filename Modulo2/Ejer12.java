import java.util.Scanner;

public class Ejer12 {
	public static void main(String[] args) {
		Scanner intro = new Scanner(System.in);
		System.out.println("Ingresar numero");
		int num = intro.nextInt();
		int resg = num;
		int aux = 0; 
		String num1 = "";
		String fin = "";
		System.out.println(num1);
		while (true) {
			if (num  == 0 || num == 1) {
				aux = num % 2;
				num /= 2;
				num1 += Integer.toString(aux);
				break;
			} else if (num == 2) {
				aux = num % 2;
				num /= 2;
				num1 += Integer.toString(aux);
				num1 += Integer.toString(num);
				break;
			} else {
				aux = num % 2;
				num /= 2;
				num1 += Integer.toString(aux);
			}
		}
		
		for (int i = 1; i <= num1.length(); i++) {
			fin += num1.charAt(num1.length() - i);
		}
		System.out.println("Numero en Decimal: " + resg);
		System.out.println("Numero en Binario: " + fin);
	}
}