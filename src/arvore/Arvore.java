package arvore;

public class Arvore {

	private No raiz;

	private No incluir(No noAtual, No novoNo) {
		if (noAtual == null) {
			if (raiz == null) {
				raiz = novoNo;
			} else {
				noAtual = novoNo;
			}
		} else if (noAtual.getValor() > novoNo.getValor()) {
			noAtual.setEsquerda(incluir(noAtual.getEsquerda(), novoNo));
		} else if (noAtual.getValor() < novoNo.getValor()) {
			noAtual.setDireita(incluir(noAtual.getDireita(), novoNo));
		} else {
			System.out.println("Valor já existe.");
		}

		return noAtual;
	}

	public void incluir(No novoNo) {
		if (novoNo != null) {
			incluir(raiz, novoNo);
		} else {
			System.out.println("novoNo é nulo");
		}

	}

	private No preOrdem(No noAtual) {
		if (noAtual != null) {
			System.out.println(noAtual.getValor());
			if (noAtual.getEsquerda() != null) {
				preOrdem(noAtual.getEsquerda());
			}
			if (noAtual.getDireita() != null) {
				preOrdem(noAtual.getDireita());
			}
		}
		return noAtual;
	}

	public void preOrdem() {

		if (raiz != null) {
			preOrdem(raiz);
			System.out.println("");
		} else {
			System.out.println("Lista vazia.");
		}
	}

	private No central(No noAtual) {
		if (noAtual.getEsquerda() != null) {
			central(noAtual.getEsquerda());

		}

		System.out.println(noAtual.getValor());

		if (noAtual.getDireita() != null) {
			central(noAtual.getDireita());
		}

		return noAtual;

	}

	public void central() {
		if (raiz != null) {
			central(raiz);
			System.out.println("");
		} else {
			System.out.println("Lista vazia.");
		}
	}

	private No posOrdem(No noAtual) {
		if(noAtual.getEsquerda() != null) {
			posOrdem(noAtual.getEsquerda());
		}
		
		if(noAtual.getDireita() != null) {
			posOrdem(noAtual.getDireita());
		}
		
		System.out.println(noAtual.getValor());
		
		return noAtual;
	}
	
	public void posOrdem() {
		if(raiz != null) {
			posOrdem(raiz);
			System.out.println("");
		}else {
			System.out.println("Lista vazia");
		}
	}

}
