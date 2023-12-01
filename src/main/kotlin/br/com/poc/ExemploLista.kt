package br.com.poc

fun main() {
    // Criando uma lista em Kotlin
    val numerosKotlin = listOf(1, 2, 3, 4, 5)

    // Imprimindo os elementos da lista
    println("Elementos da lista em Kotlin:")
    numerosKotlin.forEach(System.out::println)

//    for (numero in numerosKotlin) {
//        println(numero)
//    }

    // Filtrando apenas números pares
    val numerosParesKotlin = numerosKotlin.filter { it % 2 == 0 }

    // Imprimindo os números pares
    println("Números pares em Kotlin:")
    println(numerosParesKotlin)

    // Somando todos os elementos da lista
    val somaKotlin = numerosKotlin.sum()
    println("Soma dos números em Kotlin: $somaKotlin")

    // Calculando o produto dos elementos da lista usando reduce
    val produto = numerosKotlin.reduce { acc, numero -> acc * numero }
    // Imprimindo o produto
    println("Produto dos números em Kotlin: $produto")

}
