/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaOrdenada.SE;

/**
 *
 * @author Miguel Freitas
 */
public class ListaSe {

	private No inicio = null;

	public No getInicio() {
		return inicio;
	}

	public void setInicio(No inicio) {
		this.inicio = inicio;
	}

	public void listar() {
		if (inicio == null) {
			System.out.println("Lista Vazia");
		} else {

			No auxInicio = inicio;

			while (auxInicio != null) {
				System.out.println(auxInicio.getValor());
				auxInicio = auxInicio.getProximo();
			}
			System.out.println("\n");

		}
	}

	public void inserirInicio(No novoNo) {
		if (inicio == null) {
			setInicio(novoNo);
		} else {
			novoNo.setProximo(inicio);
			setInicio(novoNo);
		}
	}

	public void inserirFim(No novoNo) {

		if (inicio == null) {
			inicio = novoNo;
		} else {
			No aux = inicio;

			while (aux.getProximo() != null) {
				aux = aux.getProximo();
			}

			aux.setProximo(novoNo);

		}

	}

	public void removerNoInicio() {
		if (inicio == null) {
			System.out.println("lista vazia.");
		} else {
			inicio = inicio.getProximo();
		}

	}

	public void removerNoFim() {

		if (inicio != null) {
			No auxInicio = inicio;
			No auxAnterior = null;

			while (auxInicio.getProximo() != null) {
				auxAnterior = auxInicio;
				auxInicio = auxInicio.getProximo();
			}
			if (auxAnterior != null) {
				auxAnterior.setProximo(null);
			} else {
				inicio = null;
			}

		} else {
			System.out.println("Lista vazia.");
		}

	}

	public void inserirPosicaoEspecifica(No novoNo, int pos) {
		No auxInicio = inicio;
		
		if (pos < 0) {
			System.out.println("Posição invalida.");
		}else if(inicio == null) {
			inicio = novoNo;
		}else if (pos == 0) {
			inicio = novoNo;
			inicio.setProximo(auxInicio);
		} else {
			int qnt = 0;
			while (auxInicio.getProximo() != null && qnt < pos - 1) {
				auxInicio = auxInicio.getProximo();
				qnt++;
			}
			novoNo.setProximo(auxInicio.getProximo());
			auxInicio.setProximo(novoNo);
		}
	}

	public void removerPosicaoEspecifica(int pos) {
		No auxInicio = inicio;
		No auxAnterior = null;
		
		if (inicio == null) {
			System.out.println("Lista vazia");
		} else {
			if (pos == 0) {
				inicio = inicio.getProximo();
			} else {
				int qnt = 0;
				
				while(auxInicio.getProximo() != null && qnt < pos) {
					auxAnterior = auxInicio;
					auxInicio = auxInicio.getProximo();
					qnt++;
				}
				if(auxAnterior!=null) {
					auxAnterior.setProximo(auxInicio.getProximo());
				}else {
					inicio = null;
				}
			}

		}
	}

	public void contarElementos() {
		int qnt = 0;
		No auxInicio = inicio;
		if (auxInicio != null) {
			while (auxInicio != null) {
				auxInicio = auxInicio.getProximo();
				qnt++;
			}
		}
		System.out.println(qnt);
	}

	public String buscarElemento(int valor) {
		No auxInicio = inicio;
		int pos = -1;
		while (auxInicio != null) {
			pos++;
			if (auxInicio.getValor() == valor) {
				return "Valor encontrado na posição " + pos;
			}

			auxInicio = auxInicio.getProximo();
		}
		return "Valor não encontrado";

	}

}
