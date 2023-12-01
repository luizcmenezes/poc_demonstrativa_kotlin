package br.com.poc;

import java.util.List;

public class ExemploLista {
    public static void main(String[] args) {
        // Criando uma lista em Java
        List<Integer> numerosJava = List.of(1, 2, 3, 4, 5);

        // Imprimindo os elementos da lista
        System.out.println("Elementos da lista em Java:");
        numerosJava.forEach(System.out::println);

        // Filtrando apenas números pares usando lambda
        List<Integer> numerosParesJava = numerosJava.stream()
                .filter(numero -> numero % 2 == 0)
                .toList();

        // Imprimindo os números pares
        System.out.println("Números pares em Java:");
        System.out.println(numerosParesJava);

        // Somando todos os elementos da lista usando lambda
        int somaJava = numerosJava.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Soma dos números em Java: " + somaJava);

        // Calculando o produto dos elementos da lista usando reduce
        int produtoJava = numerosJava.stream().reduce(1, (acc, numero) -> acc * numero);

        // Imprimindo o produto
        System.out.println("Produto dos números em Java: " + produtoJava);

    }
}
