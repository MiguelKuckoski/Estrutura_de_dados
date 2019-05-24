package hash;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		int n;
		TabelaHash hash = new TabelaHash();
		int valor;
		do {
			n = Integer.parseInt(
					JOptionPane.showInputDialog("1. Inserir." + "\n2. Remover." + "\n3. Pesquisar." + "\n4. Sair."));

			switch (n) {
			case 1:
				valor = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor: "));
				hash.inserir(valor);
				break;
			case 2:
				valor = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor: "));
				hash.remover(valor);
				break;
			case 3:
				valor = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor: "));
				hash.pesquisar(valor);
				break;

			case 4:
				System.out.println("Até logo.");
				break;
			default:
				System.out.println("Opção invalida.");
			}
		} while (n != 4);
	}
}
