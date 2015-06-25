import java.util.Scanner;
import java.lang.*;

public class Ejer20 {
	public static void main(String[] args) {
		Scanner intro = new Scanner(System.in);
		System.out.println("Ingresar radio");
		int radio = intro.nextInt();
		int diametro = 2 * radio;
		double area = Math.PI * Math.pow(radio,2);
		double circunferencia = Math.PI * 2 * radio;

		//Impresion de resultados por pantalla
		System.out.println("Radio: " + radio);
		System.out.println("Diametro: " + diametro);
		System.out.println("Area: " + area);
		System.out.println("Circunferencia: " + circunferencia);
	}
}