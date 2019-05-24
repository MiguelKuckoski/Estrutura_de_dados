/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel Freitas
 */
public class sorteioPub {

    static int[] cadastro = new int[10];
    static int qnt = 0;

    public static void novoCadastro() {
        int num = 0;
        if (qnt < cadastro.length) {
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de telefone: "));
            int pos = encontrarNum(num);

            if (pos == -1) {
                cadastro[qnt] = num;
                qnt++;
                System.out.println("Cadastro realizado.");
            } else {
                System.out.println("Numero já cadastrado");
            }
        } else {
            System.out.println("Lista cheia");
        }
    }

    public static void sorteio() {
        if (qnt > 0) {
            Random randomico = new Random();
            int aux = randomico.nextInt(qnt);
            System.out.println("O numero sorteado foi " + cadastro[aux]);
            eliminarPos(aux);
        } else {
            System.out.println("Lista vazia");
        }
    }

    public static void eliminarPos(int pos) {
        for (int i = pos; i < (qnt - 1); i++) {
            cadastro[i] = cadastro[i + 1];
        }
        cadastro[qnt-1] = 0;
        qnt--;
    }

    public static int encontrarNum(int telefone) {
        for (int i = 0; i < qnt; i++) {
            if (cadastro[i] == telefone) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 0;
        int numero = 0;

        do {
            n = Integer.parseInt(JOptionPane.showInputDialog("1. Cadastrar novo numero."
                    + "\n2. Sortear numero."
                    + "\n3. Remover numero."
                    + "\n4. Sair."));

            switch (n) {
                case 1:
                    novoCadastro();
                    break;
                case 2:
                    sorteio();
                    break;
                case 3:
                    numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero a ser removido: "));
                    int pos = encontrarNum(numero);
                    if (pos >= 0) {
                        eliminarPos(pos);
                    } else {
                        System.out.println("Numero incorreto.");
                    }

                    break;
                case 4:
                    System.out.println("Até logo!");
                    break;
                default:
                    System.out.println("Opção invalida.");
                    break;

            }
        } while (n != 4);
    }

}
