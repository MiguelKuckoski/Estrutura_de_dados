/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaOrdenada.SE;

import javax.swing.JOptionPane;

/**
 *
 * @author Miguel Freitas
 */
public class Main {
	
	public static void main(String[] args) {
		ListaSe lista = new ListaSe();
		int n;
		No novoNo = null;
		int valor;
		int pos;
		//Contar numero de elementos 
		// Buscar
		do {
			n = Integer.parseInt(JOptionPane.showInputDialog("1. Listar " + "\n2. Inserir no inicio. " + "\n3. Remover no inicio. \n4. Inserir no fim."
							+ "\n5. Remover no fim. \n6. Inserir em posição especifica. \n7. Remover em posição especifica. \n8. Contar elementos"
							+ "\n9 Buscar \n10.Sair"));
			switch (n) {
			case 1:
				lista.listar();
				break;
			case 2:
				valor = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor a ser inserido: "));
				novoNo = new No();
				novoNo.setValor(valor);
				lista.inserirInicio(novoNo);
				break;
			case 3:
				lista.removerNoInicio();
				break;
			case 4:
				novoNo = new No();
				novoNo.setValor(Integer.parseInt(JOptionPane.showInputDialog("Informe o valor: ")));
				
				lista.inserirFim(novoNo);
				break;
			case 5:
				lista.removerNoFim();
				break;
			case 6:
				valor = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor: "));
				pos = Integer.parseInt(JOptionPane.showInputDialog("Informe a posição: "));
				novoNo = new No();
				novoNo.setValor(valor);
				lista.inserirPosicaoEspecifica(novoNo, pos);
				break;
			case 7:
				pos = Integer.parseInt(JOptionPane.showInputDialog("Informe a posição: "));
				lista.removerPosicaoEspecifica(pos);
				break;
			case 8:
				lista.contarElementos();
				break;
			case 9:
				valor = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor: "));
				System.out.println(lista.buscarElemento(valor));
				break;
			case 10:
				System.out.println("Até logo.");
				break;
				
			default:
				System.out.println("Opção invalida.");
			}
			

		} while (n != 10);


	}

}
