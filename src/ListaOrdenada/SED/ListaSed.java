/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaOrdenada.SED;

/**
 *
 * @author Miguel Freitas
 */
public class ListaSed {

	private No inicio = null;
	private No fim;
	private int qnt = 0;

	public No getInicio() {
		return inicio;
	}

	public void setInicio(No inicio) {
		this.inicio = inicio;
	}

	public No getFim() {
		return fim;
	}

	public void setFim(No fim) {
		this.fim = fim;
	}

	public int getQnt() {
		return qnt;
	}

	public void setQnt(int qnt) {
		this.qnt = qnt;
	}

	public void listar() {
		if (qnt > 0) {
			No auxInicio = inicio;
			for (int i = 0; i < qnt; i++) {
				System.out.print(auxInicio.getValor() + " - ");
				auxInicio = auxInicio.getProximo();
			}
			System.out.println("");
		} else {
			System.out.println("Lista vazia.");
		}
	}

	public void inserirInicio(No novoNo) {
		if (qnt == 0) {
			inicio = novoNo;
			qnt++;
			fim = novoNo;
		} else {
			novoNo.setProximo(inicio);
			inicio = novoNo;
			qnt++;
		}
	}

	public void removerNoInicio() {
		if (inicio == null) {
			System.out.println("Lista vazia.");
		} else {
			inicio = inicio.getProximo();
			if (qnt == 1) {
				fim = null;
			}
			qnt--;

		}
	}

	public void removerNoFim() {
		if (qnt == 0) {
			System.out.println("Lista vazia.");
		} else {
			No auxInicio = inicio;
			for (int i = 0; i < qnt - 1; i++) {
				auxInicio = auxInicio.getProximo();
			}

			fim = auxInicio;
			auxInicio.setProximo(null);
			qnt--;
		}

	}

	public void inserirPosicaoEspecifica(No novoNo, int pos) {
		if (pos < 0) {
			System.out.println("Posição invalida.");
		} else if (inicio == null) {
			inicio = novoNo;
			fim = novoNo;
			qnt++;
		} else if (pos == 0) {
			novoNo.setProximo(inicio);
			inicio = novoNo;
			qnt++;
		} else if (pos >= qnt) {
			fim.setProximo(novoNo);
			fim = novoNo;
			qnt++;
		} else {
			No auxInicio = inicio;
			for (int i = 0; i < pos - 1; i++) {
				auxInicio = auxInicio.getProximo();
			}
			novoNo.setProximo(auxInicio.getProximo());
			auxInicio.setProximo(novoNo);
			qnt++;
		}
	}

	
	public void removerPosicaoEspecifica(int pos) {
		if (qnt == 0) {
			System.out.println("Lista vazia.");
		} else if (pos == 0 || pos < 0) {
			No noAux = inicio;
			inicio = inicio.getProximo();
			noAux.setProximo(null);
			qnt--;
			if(qnt <= 1) {
				fim = inicio;
			} 
		} else {
			No auxInicio = inicio;
			No auxAnt = null;
			
			for (int i = 0; i < pos && auxInicio.getProximo() != null; i++) {
				auxAnt = auxInicio;
				auxInicio = auxInicio.getProximo();
			}
			if(auxAnt == null) {
				inicio = null;
				fim = null;
			} else {
				auxAnt.setProximo(auxInicio.getProximo());
				auxInicio.setProximo(null);
				if(auxAnt.getProximo() == null) {
					fim = auxAnt;
				}
			}
			qnt--;	
		}

	}

	public void contarElementos() {
		System.out.println(qnt);

	}

	public void buscarElemento(int valor) {
		if(qnt ==0 ) {
			System.out.println("lista vazia.");
		}else {
			No auxInicio = inicio;
			String message = "Valor não encontrado";
			for(int i =0; i < qnt; i ++) {
				if(auxInicio.getValor() == valor) {
					message = "Valor encontrado na posição " + i;
					break;
				}
				auxInicio = auxInicio.getProximo();
			}
			System.out.println(message);
		}
	}

	public void inserirFim(No novoNo) {
		if (qnt == 0) {
			inicio = novoNo;
			fim = novoNo;
			qnt++;
		} else {
			fim.setProximo(novoNo);
			fim = novoNo;
			qnt++;
		}

	}

}
