import java.util.Scanner;

public class Ejer12 {
	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		int num = 0;
		int cont = 0;
		int suma = 0;
		System.out.println("Ingresar un valor");
		num = numero.nextInt(); 
		for(int i = 0; i <= num ; i++) {
			if (i % 10 == 0) {
				System.out.println(i);
				cont++;
				suma += i;
			}	
		}
		System.out.println("Hay " + cont + " multiplos de 10");
		System.out.println("Suma de los multiplos de 10: " + suma);
	}
}