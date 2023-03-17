fun main(){
    /**
     * As estruturas de controle de fluxo mais comuns em Kotlin são:
     */

    val comecar = null

    /**
     * If-else:
     * A estrutura If-else em Kotlin é semelhante à de outras linguagens de programação.
     * Ele executa um bloco de código se a condição especificada for verdadeira e
     * executa outro bloco de código se a condição for falsa. Veja um exemplo:
     */

    val a = 5
    val b = 10
    if (a > b) {
        println("a é maior que b")
    } else {
        println("a é menor ou igual a b")
    }

    /**
     * When:
     * O When é uma estrutura de controle de fluxo em Kotlin
     * que funciona como um switch em outras linguagens.
     * Ele executa um bloco de código com base no valor de uma expressão. Veja um exemplo:
     */

    val x = 2
    when (x) {
        1 -> println("x é 1")
        2 -> println("x é 2")
        else -> println("x não é nem 1 nem 2")
    }

    /**
     * For:
     * A estrutura de controle de fluxo For é usada
     * para iterar por uma coleção de objetos em Kotlin.
     * Veja um exemplo:
     */

    val numbers = arrayOf(1, 2, 3, 4, 5)
    for (number in numbers) {
        println(number)
    }

    /**
     * While:
     * A estrutura de controle de fluxo While é usada para executar
     * um bloco de código enquanto uma condição especificada for verdadeira.
     * Veja um exemplo:
     */

    var y = 1
    while (y <= 5) {
        println(y)
        y++
    }

    /**
     * Do-While:
     * A estrutura de controle de fluxo Do-While é usada para executar
     * um bloco de código pelo menos uma vez e, em seguida, continuar a executá-lo
     * enquanto uma condição especificada for verdadeira.
     * Veja um exemplo:
     */

    var z = 1
    do {
        println(z)
        z++
    } while (z <= 5)
}