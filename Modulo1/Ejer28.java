import java.util.Scanner;
import java.lang.Integer.*;

public class Ejer28 {
	public static void main(String[] args) {
		Scanner intro = new Scanner(System.in);
		int cont = 0;
		int suma = 0;
		int mayor = 0;
		int valor;
		boolean test = true;
		while (true) {
			System.out.println("Ingrese un numero o ingrese salir");
			String num = intro.next();
			if (num == "salir") {
				break;
			} else {
				valor = Integer.parseInt(num);
				cont++;
			}

			if (valor % 5 == 0) {
				suma += valor;
			}
			if (mayor == 0) {
				mayor = valor;
			} else {
				if (valor > mayor) {
					mayor = valor;
				}
			}

		}

		System.out.println("Numeros ingresados: " + cont);
		System.out.println("Suma multiplos de 5: " + suma);
		System.out.println("Mayor ingresado: " + mayor);
	}
}
