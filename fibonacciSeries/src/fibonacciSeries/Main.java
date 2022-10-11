package fibonacciSeries;

public class Main {

	public static void main(String[] args) {
		long n1 = 0, n2 = 1, n3;
		System.out.println("0\n1");
		for (int i = 2; i <= 11; i++) {
			n3 = n1 + n2;
			System.out.println((long) n3);
			n1 = n2;
			n2 = n3;
		}

	}

}
