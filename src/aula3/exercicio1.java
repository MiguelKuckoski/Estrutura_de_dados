/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3;

import javax.swing.JOptionPane;

/**
 *
 * @author Miguel Freitas
 */
public class exercicio1 {

    static int[] vetor = new int[10];
    static int qnt = 0;

    public static int encontraNum(int valor) {
        for (int i = 0; i < qnt; i++) {
            if (vetor[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    public static String insercao(int valor) {
        if (qnt < vetor.length) { // Verifica se o vetor ta cheio
            if (qnt == 0 || vetor[qnt - 1] < valor) {
                vetor[qnt] = valor;
                qnt++;
                return "Valor inserido.";
            } else {
                for (int i = 0; i < qnt; i++) { // varre o vetor
                    if (valor == vetor[i]) { // caso o valor ja esteja inserido, encerra o programa
                        return "O valor já existe";
                    } else if (valor < vetor[i]) { // caso o valor seja menor que o valor i, insere na posição anterior e realoca os demais.
                        for (int j = qnt; j > i; j--) {
                            vetor[j] = vetor[j - 1];
                        }
                        vetor[i] = valor;
                        qnt++;
                        return "Valor inserido.";
                    }
                }
            }
        } else { // caso vetor esteja cheio, informa ao usuario.
            return "Vetor cheio";
        }
        return "";
    }

    public static String listar() {
        String resultado = "";
        if (qnt > 0) {
            for (int i = 0; i < qnt; i++) {
                resultado += " " + vetor[i];
            }
        } else {
            resultado = "Vetor vazio";
        }
        return resultado;
    }

    public static String remover(int valor) {
        String resultado = "";
        int posicao = encontraNum(valor);
        if (posicao >= 0) {
            for (int i = posicao; i < (qnt - 1); i++) {
                vetor[i] = vetor[i + 1];
            }
            vetor[qnt - 1] = 0;
            qnt--;
            resultado = "Valor removido";

        } else {
            resultado = "Valor inexistente.";
        }
        return resultado;
    }

    public static void BuscaBinaria(int valor) {
        String resultado = "";
        if (qnt > 0) {
            int inicio = 0;
            int fim = qnt - 1;
            int meio;
            do {
                meio = (fim + inicio) / 2;

                if (valor > vetor[meio]) {
                    inicio = meio + 1;

                } else if (valor < vetor[meio]) {
                    fim = meio - 1;
                }else{
                    break;
                }

            } while (vetor[meio] != valor);
            if (vetor[meio] == valor) {
                System.out.println("indice: " + meio + "\nValor: " + vetor[meio]);
            } else {
                System.out.println("Valor Invalido.");
            }
        } else {
            resultado = "lista vazia";
        }

    }

    public static String buscar(int valor) {
        String resultado = "";
        if (qnt > 0) {
            for (int i = 0; i < qnt; i++) {
                if (valor == vetor[i]) {
                    resultado = "o Valor " + valor + " foi encontrado na posição " + i;
                    break;
                }
            }
        } else {
            resultado = "vetor vazio";
        }
        return resultado;
    }

    public static void main(String[] args) {
        int n = 0;
        int num = 0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog("1. Inserir um numero."
                    + "\n2. Listar vetor."
                    + "\n3. Remover valor."
                    + "\n4. Busca Binaria."
                    + "\n5. Buscar."
                    + "\n6. Sair."));

            switch (n) {
                case 1:
                    num = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero: "));
                    System.out.println(insercao(num));
                    break;
                case 2:
                    System.out.println(listar());
                    break;
                case 3:
                    num = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor: "));
                    System.out.println(remover(num));
                    break;
                case 4:
                    num = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor: "));
                    BuscaBinaria(num);
                    break;
                case 5:
                    num = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para busca: "));
                    System.out.println(buscar(num));
                    break;
                case 6:
                    System.out.println("Até logo!");
                    break;
                default:
                    System.out.println("Opção invalida!");
                    break;
            }

        } while (n != 6);
    }
}
