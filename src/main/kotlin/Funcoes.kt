fun main() {
    /**
     *  As funções em Kotlin são definidas usando a palavra-chave fun,
     *  seguida pelo nome da função e seus parâmetros entre parênteses.
     *  O corpo da função é delimitado por chaves {} e pode conter uma ou mais instruções.
     *
     *  Exemplos:
     */

    fun saudacao(nome: String): String {
        return "Olá, $nome!"
    }

    /*************************************************************************/

    fun calcularMedia(nota1: Float, nota2: Float, nota3: Float = 7.0f): Float {
        return (nota1 + nota2 + nota3) / 3.0f
    }

    val media1 = calcularMedia(8.0f, 7.5f) // média = 7.5
    val media2 = calcularMedia(8.0f, 7.5f, 9.0f) // média = 8.17

    /*************************************************************************/

    fun encontrarNome(id: Int): String? {
        val nomes = mapOf(1 to "Alice", 2 to "Bob", 3 to "Carol")
        return nomes[id]
    }
}