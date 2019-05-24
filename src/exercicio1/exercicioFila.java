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
public class exercicioFila {

    static int[] lista = new int[10];
    static int qnt = 0;

    public static void incluirFinal() {
        if (qnt < lista.length) {
            int valor = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor para acrescentar: "));
            lista[qnt] = valor;
            qnt++;
        } else {
            System.out.println("Lista cheia.");
        }
    }

    public static void contar() {
        if(qnt >0 ){
        System.out.println("A fila possui " + qnt + " elementos.");
        }else{
            System.out.println("Lista vazia");
        }
    }

    public static void consultar() {
        System.out.println("O primeiro elemento da lista é: " + lista[0]);
    }

    public static void remover() {
        if (qnt > 0) {            
            for (int i = 0; i < qnt; i++) {
                lista[i] = lista[i + 1];
            }
            lista[qnt-1] = 0;
            qnt--;
            System.out.println("Valor removido.");
        } else {
            System.out.println("Lista vazia.");
        }
    }

    public static void main(String[] args) {
        int n = 0;

        do {
            n = Integer.parseInt(JOptionPane.showInputDialog("1. Incluir novo elemento na fila."
                    + "\n2. Remover elemento da fila."
                    + "\n3. Contar o numero de elementos."
                    + "\n4. Consultar o primeiro elemento da fila."
                    + "\n5. Sair."));

            switch (n) {
                case 1:
                    incluirFinal();
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
                    System.out.println("Opção invalida!");
                    break;
            }
        } while (n != 5);
    }
}
