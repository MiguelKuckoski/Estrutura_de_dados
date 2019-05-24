package hash;

public class TabelaHash {
	private ListaEncadeada[] lista = new ListaEncadeada[25];
	private int limite = 25;
	private int pos;
	
	public int funcaoHash(int valor) {
		pos = valor % limite;
		return pos;
	}
	
	public void inserir(int valor) {
		int pos = funcaoHash(valor);
		No novoNo = new No();
		novoNo.setValor(valor);
		
		if (lista[pos] == null) 
			lista[pos] = new ListaEncadeada();
		lista[pos].inserir(novoNo);
	
	}


	public void pesquisar(int valor) {
		pos = funcaoHash(valor);
		boolean pesquisar = false;
		if(lista[pos] != null) {
			pesquisar = lista[pos].pesquisar(valor);
		}
		
		if(pesquisar) {
			System.out.println("Valor encontrado.");
		}else {
			System.out.println("Valor não encontrado.");
		}
		
	}

	public void remover(int valor) {
		pos = funcaoHash(valor);
		
		if(lista[pos] != null) {
			lista[pos].remover(valor);
		}else {
			System.out.println("Valor não encontrado.");
		}
		
	}
}
