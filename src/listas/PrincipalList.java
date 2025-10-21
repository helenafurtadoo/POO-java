package listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// EXEMPLOS BASICOS DE USO DO ARRAYLIST
public class PrincipalList {
    public static void main(String[] args) {
        // CRIAÇÃO DA LISTA
        ArrayList<String> carros = new ArrayList<>();
        carros.add("Volvo");
        carros.add("BMW");
        carros.add("Ford");

        // ACESSAR ITEM
        System.out.println("PRIMEIRO: " + carros.get(0));

        // ALTERAR ITEM
        carros.set(0, "Opel");

        // REMOVER ITEM
        carros.remove("Ford");

        // TAMANHO
        System.out.println("TAMANHO: " + carros.size());

        // FOR-EACH
        for (String c : carros) {
            System.out.println("CARRO: " + c);
        }

        // LISTA DE OBJETOS E ORDENACAO
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Caneta", 1.5));
        produtos.add(new Produto("Teclado", 120.0));
        produtos.add(new Produto("Livro", 35.0));

        // ORDENA POR PRECO (PRECISA IMPLEMENTAR Comparable)
        Collections.sort(produtos);
        System.out.println("PRODUTOS ORDENADOS:");
        for (Produto p : produtos) {
            System.out.println(p);
        }
    }
}
