/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author Miguel Freitas
 */
public class ExercicioPilha {

    static int[] lista = new int[10];
    static int qnt = 0;

    public static void inserir() {
        if (qnt < lista.length) {
            lista[qnt] = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor: "));
            qnt++;
            System.out.println("Valor inserido.");
        } else {
            System.out.println("Lista cheia.");
        }
    }

    public static void remover() {
        if (qnt > 0) {
            lista[qnt - 1] = 0;
            qnt--;
            System.out.println("Valor removido.");
        } else {
            System.out.println("Lista vazia.");
        }
    }

    public static void contar() {
        System.out.println("Elementos na pilha: " + qnt);
    }

    public static void consultar() {
        System.out.println("O ultimo elemento da lista é " + lista[qnt - 1]);
    }

    public static void main(String[] args) {
        int n = 0;

        do {
            n = Integer.parseInt(JOptionPane.showInputDialog("1. Inserir valor."
                    + "\n2. Remover valor."
                    + "\n3. Contar pilha."
                    + "\n4. Consultar ultimo valor."
                    + "\n5. Sair."));

            switch (n) {
                case 1:
                    inserir();
                    break;

                case 2:
                    remover();
                    break;
                case 3:
                    contar();
                    break;
                case 4:
                    consultar();
                    break;
                case 5:
                    System.out.println("Até logo!");
                    break;
                default:
                    System.out.println("Opção invalida.");
                    break;

            }
        }while(n != 5);
    
    
    }

}
