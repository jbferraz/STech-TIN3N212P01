/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3n212pj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author jbferraz
 */
public class ListaCompras {

    static ArrayList<String> listaItens = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        int opM;
        do {
            menu();
            opM = leia.nextInt();
            switch (opM) {
                case 1:
                    addItem();
                    break;
                case 2:
                    removeItem();
                    break;
                case 3:
                    imprimeLista();
                    break;
                case 0:
                    System.out.println("Aplicação encerrada!");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente!");
            }//fim switch
        } while (opM != 0);
    }//fim main

    public static void menu() {
        System.out.println(".: Lista de Compras :.");
        System.out.println("1 - Adicionar item");
        System.out.println("2 - Remover item");
        System.out.println("3 - Imprimir lista");
        System.out.println("0 - Sair");
        System.out.print("Digite aqui: ");
    }//fim menu

    public static void addItem() {
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite um item: ");
        listaItens.add(leia.nextLine());
    }//fim addItem

    public static void removeItem() {
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite um item a remover: ");
        listaItens.remove(leia.nextLine());
    }//fim removeItem

    public static void imprimeLista() {
        System.out.println("Lista de Itens");
        Collections.sort(listaItens);
        for (String listaIten : listaItens) {
            System.out.println(listaIten);
        }
    }// fim imprime

}
