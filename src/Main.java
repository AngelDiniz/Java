//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// Exercicio 10.

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listaDeCompras = new ArrayList<>();

        System.out.println("Bem-vindo à sua lista de compras!");

        while (true) {
            System.out.println("\nLista de Compras:");
            if (listaDeCompras.isEmpty()) {
                System.out.println("Nenhum item na lista de compras.");
            } else {
                for (int i = 0; i < listaDeCompras.size(); i++) {
                    System.out.println((i + 1) + ". " + listaDeCompras.get(i));
                }
            }

            System.out.print("\nDeseja adicionar um item à lista de compras? (s/n): ");
            String resposta = scanner.nextLine();

            if (resposta.equalsIgnoreCase("s")) {
                System.out.print("Digite o nome do item a ser adicionado: ");
                String item = scanner.nextLine();
                listaDeCompras.add(item);
                System.out.println("Item '" + item + "' adicionado à lista de compras.");
            } else if (resposta.equalsIgnoreCase("n")) {
                System.out.println("Saindo do programa...");
                break;
            } else {

                System.out.println("Resposta inválida. Por favor, responda com 's' para sim ou 'n' para não.");
            }
        }

    }
}