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
public class exercicio02 {

    static int[] vetor = {10, 32, 41, 12, 53, 14, 52, 65, 76, 0};
    static int aux;
    static String resultado;
    static int qnt = 9;

    public static String trocar(int inicio, int fim) {
        if (inicio == 9 || fim == 9) {
            resultado = "Posição invalida.";
        } else {
            aux = vetor[inicio];
            if (fim > inicio) {
                for (int i = inicio; i < fim; i++) {
                    vetor[i] = vetor[i + 1];
                }

            } else {
                for (int i = inicio; i > fim; i--) {
                    vetor[i] = vetor[i - 1];
                }
            }
            vetor[fim] = aux;
            resultado = "Valor alterado";
        }
        return resultado;
    }

    public static String listar() {
        resultado = "";
        for (int i = 0; i < vetor.length; i++) {
            resultado += " " + vetor[i];
        }
        return resultado;
    }

    public static void main(String[] args) {
        int n = 0;
        int origem = 0;
        int fim = 0;

        do {
            n = Integer.parseInt(JOptionPane.showInputDialog("1. Trocar valores."
                    + "\n 2. Listar vetor."
                    + "\n 3. Sair."));

            switch (n) {
                case 1:
                    origem = Integer.parseInt(JOptionPane.showInputDialog("Digite o indice de origem: "));
                    fim = Integer.parseInt(JOptionPane.showInputDialog("Digite o indice final: "));
                    System.out.println(trocar(origem, fim));
                    break;
                case 2:
                    System.out.println(listar());
                    break;
                case 3:
                    System.out.println("Até logo!");
                    break;
                default:
                    System.out.println("Opção invalida.");
                    break;
            }
        } while (n != 3);
    }
}
