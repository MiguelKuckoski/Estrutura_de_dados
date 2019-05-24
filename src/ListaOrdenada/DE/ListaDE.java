package ListaOrdenada.DE;

public class ListaDE {
	private No inicio;

	public No getInicio() {
		return inicio;
	}

	public void setInicio(No inicio) {
		this.inicio = inicio;
	}

	public void inserirInicio(No novoNo) {
		if (inicio == null) {
			inicio = novoNo;
		} else {
			novoNo.setProximo(inicio);
			inicio.setAnterior(novoNo);
			inicio = novoNo;
		}

	}

	public void removerNoInicio() {
		if (inicio == null) {
			System.out.println("Lista vazia");
		} else {
			if (inicio.getProximo() == null) {
				inicio = null;
			} else {
				No auxInicio = inicio;
				inicio = inicio.getProximo();
				auxInicio.setProximo(null);
				inicio.setAnterior(null);
			}
		}
	}

	public void inserirFim(No novoNo) {
		if (inicio == null) {
			inicio = novoNo;
		} else {
			No auxInicio = inicio;
			while (auxInicio.getProximo() != null) {
				auxInicio = auxInicio.getProximo();
			}
			auxInicio.setProximo(novoNo);
			novoNo.setAnterior(auxInicio);
		}
	}

	public void removerNoFim() {
		if (inicio == null) {
			System.out.println("Lista vazia.");
		} else {
			No auxInicio = inicio;
			while (auxInicio.getProximo() != null) {
				auxInicio = auxInicio.getProximo();
			}
			if (auxInicio.getAnterior() == null) {
				inicio = null;
			} else {
				No noAnt = auxInicio.getAnterior();
				noAnt.setProximo(null);
				auxInicio.setAnterior(null);
			}
		}

	}

	public void inserirPosicaoEspecifica(No novoNo, int pos) {
		if (inicio == null) {
			inicio = novoNo;
		} else if (pos < 0) {
			System.out.println("Posição invalida");
		} else if (pos == 0) {
			novoNo.setProximo(inicio);
			inicio.setAnterior(novoNo);
			inicio = novoNo;
		}else {
			//TODO posição acima da existente insere na penultima.
				
			No auxInicio = inicio;
			int cont =0;
			while(auxInicio.getProximo() != null && cont < pos) {
				auxInicio = auxInicio.getProximo();
				cont++;
			}
			
			if(cont < pos) {
				auxInicio.setProximo(novoNo);
				novoNo.setAnterior(auxInicio);
			} else {
				No noAnt = auxInicio.getAnterior();
				if(noAnt != null) {
					noAnt.setProximo(novoNo);
					novoNo.setAnterior(noAnt);
					novoNo.setProximo(auxInicio);
					auxInicio.setAnterior(novoNo);
				}//verifica se tem como o noAnt == null
			}			
		}
	}

	public void removerPosicaoEspecifica(int pos) {
		//TODO não roda.
		if(inicio == null) {
			System.out.println("Lista vazia.");
		}else if(pos < 0 ) {
			System.out.println("Posição invalida.");
		}else if(pos == 0){
			if(inicio.getProximo() != null) {
				inicio = inicio.getProximo();
				inicio.getAnterior().setProximo(null);
				inicio.setAnterior(null);
			}else {
				inicio = null;
			}
		}else {
			No auxInicio = inicio;
			int cont = 0;
			while(auxInicio.getProximo() != null && cont < pos) {
				auxInicio = auxInicio.getProximo();
				cont++;
			}
			
			if(cont ==0) {
				inicio = null;
			}else if(cont < pos) {
				auxInicio.getAnterior().setProximo(null);
				auxInicio.setAnterior(null);
			}else { 			
				auxInicio.getAnterior().setProximo(auxInicio.getProximo());
				auxInicio.getProximo().setAnterior(auxInicio.getAnterior());
				auxInicio.setAnterior(null);
				auxInicio.setProximo(null);
			}
			
		}

	}

	public void contarElementos() {
		if (inicio == null) {
			System.out.println("Lista vazia.");
		} else {
			int cont = 0;
			No auxInicio = inicio;
			while (auxInicio != null) {
				auxInicio = auxInicio.getProximo();
				cont++;
			}
			System.out.println(cont);
		}

	}

	public void buscarElemento(int valor) {
		if (inicio == null) {
			System.out.println("Lista vazia.");
		} else {
			String resultado = "Valor não encontrado.";
			No auxInicio = inicio;
			int cont = 0;
			while (auxInicio != null) {
				if (auxInicio.getValor() == valor) {
					resultado = "Valor encontrado na posição " + cont;
					break;
				}
				auxInicio = auxInicio.getProximo();
			}
			System.out.println(resultado);
		}
	}

	public void listar() {
		if (inicio == null) {
			System.out.println("Lista vazia");
		} else {
			No auxInicio = inicio;

			while (auxInicio != null) {
				System.out.println(auxInicio.getValor());
				auxInicio = auxInicio.getProximo();
			}
			System.out.println("");
		}
	}
}
