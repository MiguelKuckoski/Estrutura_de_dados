package recursividade;

public class Soma {

	public static void main(String[] args) {
		int n  = soma(10);
		System.out.println(n);
	}
	
	public static int soma(int n) {
		if(n <= 1) {
			return 1;
		}else {
			n = n + soma(n-1);
		}
		
		return n;
	}
	
}