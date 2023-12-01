package br.com.poc

fun main() {
    val items = listOf(1, 2, 3, 4, 5)
    val viaSequence = items
        .filter { it%2 == 0 }
        .map { it*2 }

    println(viaSequence)

    val viaIterable = items.asIterable()
        .filter { it%2 == 0 }
        .map { it*2 }
        .toList()
    println(viaIterable)

    val viaStream = items.stream()
        .filter { it%2 == 0 }
        .map { it*2 }
        .toList()
    println(viaStream)
}