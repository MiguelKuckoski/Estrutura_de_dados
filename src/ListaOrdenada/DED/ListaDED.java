package ListaOrdenada.DED;

public class ListaDED {
	
	private No inicio;
	private int qnt;
	private No fim;

	public void inserirInicio(No novoNo) {
		if(inicio == null) {
			inicio = novoNo;
			fim= novoNo;
			qnt++;
		}else {
			novoNo.setProximo(inicio);
			inicio.setAnterior(novoNo);
			inicio = novoNo;
			qnt++;
		}
		
	}

	public void removerNoInicio() {
		if(inicio == null) {
			System.out.println("Lista vazia");
		}else {
			if(qnt == 1) {
				inicio = null;
				fim = null;
				qnt--;
			}else {
				inicio = inicio.getProximo();
				inicio.getAnterior().setProximo(null);
				inicio.setAnterior(null);
				qnt--;
			}
		}
		
	}

	public void inserirFim(No novoNo) {
		if(inicio == null) {
			inicio = novoNo;
			fim = novoNo;
			qnt++;
		}else{
			fim.setProximo(novoNo);
			novoNo.setAnterior(fim);
			fim = novoNo;
			qnt++;
		}
		
	}

	public void removerNoFim() {
		if(inicio == null) {
			System.out.println("Lista vazia.");
		}else {
			if(qnt == 1) {
				inicio = null;
				fim = null;
				qnt--;
			}else {
				fim.getAnterior().setProximo(null);
				fim.setAnterior(null);
				qnt--;	
			}
			
		}
		
	}

	public void inserirPosicaoEspecifica(No novoNo, int pos) {
		if(pos < 0) {
			System.out.println("Posição invalida.");
		}else if(inicio == null) {
			inicio = novoNo;
			fim = novoNo;
			qnt++;
		}else if(pos == 0 ) {
				novoNo.setProximo(inicio);
				inicio.setAnterior(novoNo);
				inicio = novoNo;
				qnt++;			
		}else if(pos >= qnt) {
			fim.setProximo(novoNo);
			novoNo.setAnterior(fim);
			qnt++;
		}else {
			No auxInicio = inicio;
			for(int i =0; i < qnt-1 ; i++) {
				auxInicio = auxInicio.getProximo();
			}
			auxInicio.getAnterior().setProximo(novoNo);
			novoNo.setProximo(auxInicio);
			novoNo.setAnterior(auxInicio.getAnterior());
			auxInicio.setAnterior(novoNo);
			qnt++;
		}
		
	}

	public void removerPosicaoEspecifica(int pos) {

	}

	public void contarElementos() {
		System.out.println(qnt);
	}

//	public void buscarElemento(int valor) {
//		No auxInicio = inicio;
//		for(int i = 0; i < qnt; i++) {
//			if(valor = auxInicio.getValor()) {
//				
//			}
//		}
// 	}

	public void listar() {
		if(inicio == null) {
			System.out.println("Lista vazia.");
		}else {
			No auxInicio = inicio;
			String valor = "";
			for(int i =0; i < qnt; i++) {
				valor += auxInicio.getValor() + " - ";
				auxInicio = auxInicio.getProximo();
			}

			System.out.println(valor);
		}
		
	}

}
