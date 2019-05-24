package arvore;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Arvore arvore = new Arvore();
		int n;

		do {
			n = Integer.parseInt(JOptionPane.showInputDialog("1. Inserir \n" + "2. Pré ordem. \n" + "3. Central. \n"
					+ "4. Pós ordem. \n" + "5. Remover. \n" + "6. Sair."));

			switch (n) {
			case 1:
				int a = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor: "));
				No no = new No(a);
				arvore.incluir(no);
				break;
			case 2:
				arvore.preOrdem();
				break;
			case 3:
				arvore.central();
				break;
			case 4:
				arvore.posOrdem();
				break;
			case 5:
				//TODO remover;
			case 6:
				System.out.println("Até logo.");
				break;
			default:
				System.out.println("Opção invalida.");
				break;
			}
		} while (n != 6);

	}

}
