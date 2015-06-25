public class Ejer10 {
	public static void main(String[] args) {
		int cont = 0; 
		for(int i = 1; i <= 500 ; i++) {
			if (i % 5 == 0) {
				System.out.println(i);
				cont++;
			}	
		}
		System.out.println("Hay " + cont + " multiplos de 5");
	}
}