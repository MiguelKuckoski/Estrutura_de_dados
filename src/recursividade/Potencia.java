package recursividade;

public class Potencia {
	public static void main(String[] args) {
		int n = potencia(5, 3);
		System.out.println(n);
	}

	private static int potencia(int i, int j) {
		if(j <= 1) {
			return i;
		}else {
			i =  i* potencia(i, (j-1));
		}
		return i;
	}
	
	
	
}
