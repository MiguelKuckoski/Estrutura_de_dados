package exercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author Miguel Freitas
 */
public class Exercicio1 {

    static int[] lista = new int[10];
    static int qnt = 0;

    public static void listarElementos() {
        if (qnt > 0) {
            for (int i = 0; i < qnt; i++) {
                System.out.print(lista[i] + " - ");
            }
        } else {
            System.out.println("lista vazia");
        }
        System.out.println("");
    }

    public static void inserirInicio(int valor) {
        for (int i = qnt; i > 0; i--) {
            lista[i] = lista[i - 1];
        }
        lista[0] = valor;
        qnt++;

    }

    public static void inserirFim(int valor) {
        lista[qnt] = valor;
        qnt++;
    }

    public static void inserirPos(int valor, int pos) {
        for (int i = qnt; i > pos; i--) {
            lista[i] = lista[i - 1];
        }
        lista[pos] = valor;
        qnt++;
    }

    public static void removerFim() {
        lista[qnt - 1] = 0;
        System.out.println("Posiçao[" + (qnt - 1) + "] Removida.");
        qnt--;

    }

    public static void removerInicio() {

        for (int i = 0; i < (qnt - 1); i++) {
            lista[i] = lista[i + 1];
        }
        lista[qnt - 1] = 0;
        qnt--;
        System.out.println("Posição[0] removida.");

    }

    public static void removerX(int pos) {

        for (int i = pos; i < (qnt - 1); i++) {
            lista[i] = lista[i + 1];
        }
        lista[qnt - 1] = 0;
        System.out.println("posição[" + pos + "] removida.");
        qnt--;
    }

    public static String testeValor(int valor) {
        for (int i = 0; i < qnt; i++) {
            if (lista[i] == valor) {
                return "Valor encontrado na posição[" + i + "].";
            }
        }
        return "Valor não encontrado";

    }

    public static void main(String[] args) {
        int n = 0;
        int pos;
        int novoValor;

        do {
            n = Integer.parseInt(JOptionPane.showInputDialog("Selecione uma das funções"
                    + "\n 1. Listar elementos"
                    + "\n 2. Inserir elemento no inicio"
                    + "\n 3. Inserir elemento no final"
                    + "\n 4. Inserir elementoem posição especifica"
                    + "\n 5. Remover elemento do final"
                    + "\n 6. Remover elemento no inicio"
                    + "\n 7. Remover elemento em posição especifica"
                    + "\n 8. Verificar valor existente"
                    + "\n 9. Sair."));
            switch (n) {
                case 1:
                    listarElementos();
                    break;

                case 2:
                    if (qnt < lista.length) {
                        novoValor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor a ser inserido: "));
                        inserirInicio(novoValor);
                    } else {
                        System.out.println("lista cheia");
                    }
                    break;

                case 3:
                    if (qnt < lista.length) {
                        novoValor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor a ser inserido: "));
                        inserirFim(novoValor);
                    } else {
                        System.out.println("lista cheia");
                    }
                    break;

                case 4:
                    pos = Integer.parseInt(JOptionPane.showInputDialog("Digite indice da posição: "));
                    if (qnt < lista.length && pos <= qnt) {
                        novoValor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor a ser inserido: "));
                        inserirPos(novoValor, pos);
                    } else {
                        System.out.println("Operação invalida.");
                    }
                    break;

                case 5:
                    if (qnt > 0) {
                        removerFim();
                    } else {
                        System.out.println("Lista vazia.");
                    }
                    break;

                case 6:
                    if (qnt > 0) {
                        removerInicio();
                    } else {
                        System.out.println("Lista vazia");
                    }
                    break;

                case 7:
                    pos = Integer.parseInt(JOptionPane.showInputDialog("Qual posição a ser removida?"));
                    if (pos < qnt) {
                        removerX(pos);
                    } else {
                        System.out.println("Posição invalida.");
                    }

                    break;
                case 8:
                    if (qnt > 0) {
                        novoValor = Integer.parseInt(JOptionPane.showInputDialog("Valor a ser testado: "));
                        System.out.println(testeValor(novoValor));
                    } else {
                        System.out.println("Lista vazia.");
                    }
                    break;

                case 9:
                    System.out.println("Até logo!");
                    break;

                default:
                    System.out.println("Opção incorreta.");
                    break;
            }
        } while (n != 9);

    }

}
