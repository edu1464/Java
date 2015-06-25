public class Ejer9 {
	public static void main(String[] args) {
		int fn = 0;
		int n1 = 0;
		int n2 = 1;
		for (int i = 0; i <= 30; i++) {
			if (i <= 1) {
				System.out.println("f"+ i +"= " + i);

			} else {
				fn = (n1) + (n2);
				n1 = n2;
				n2 = fn;
				System.out.println("f"+ i +"= " + fn);
			}
		}
	}
}