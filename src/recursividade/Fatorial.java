package recursividade;

public class Fatorial {

	public static int fatorial(int n) {
		if (n == 0) {
			return 1;
		} else if (n == 1) {
			return n;
		} else {
			n = n * fatorial(n - 1);
		}

		return n;

	}

	public static void main(String[] args) {
		int n = fatorial(0);
		System.out.println(n);
	}

}
