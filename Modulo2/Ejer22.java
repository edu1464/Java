import java.lang.Math;

public class Ejer22 {
	public static void main(String[] args) {
		double cuadrado;
		double cubo;
		for (int i = 1; i <= 10; i++) {
			cuadrado = Math.pow(i,2);
			cubo = Math.pow(i,3);
			System.out.println("Numero " + cuadrado + " " + cubo);
		}
	}
}