package hash;

public class ListaEncadeada {
	private No inicio;
	private int qnt;
	private No fim;

	public No getInicio() {
		return inicio;
	}

	public void setInicio(No inicio) {
		this.inicio = inicio;
	}

	public int getQnt() {
		return qnt;
	}

	public void setQnt(int qnt) {
		this.qnt = qnt;
	}

	public No getFim() {
		return fim;
	}

	public void setFim(No fim) {
		this.fim = fim;
	}

	public void inserir(No novoNo) {
		if (inicio == null) {
			inicio = novoNo;
			fim = novoNo;
			qnt++;
		} else {
			fim.setProximo(novoNo);
			fim = novoNo;
			qnt++;
		}

	}

	public boolean pesquisar(int valor) {
		No aux = inicio;

		while (aux != null) {
			if (aux.getValor() == valor) {
				return true;
			}
			aux = aux.getProximo();
		}

		return false;
	}

	
	public void remover(int valor) {
		No aux = inicio;
		No noAnt = null;
		boolean achou = false;
		
		while (aux != null) {
			if(aux.getValor() == valor) {
				achou = true;
				if(noAnt == null) {
					inicio = null;
					fim = null;
					break;
				}
				
				noAnt.setProximo(aux.getProximo());
				aux.setProximo(null);
				if(noAnt.getProximo() == null) {
					fim = noAnt;
				}
				break;
			}
			noAnt = aux;
			aux = aux.getProximo();
		}
		
		if(achou) {
			System.out.println("Valor removido.");
		}else {
			System.out.println("Valor não encontrado.");
		}
	}

}
