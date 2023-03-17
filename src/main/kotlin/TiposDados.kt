fun main(){
    /**
     * Em Kotlin, existem dois tipos principais de dados: tipos primitivos e tipos não primitivos.
     *
     * Os tipos primitivos em Kotlin são:
     *
     * Byte: representa um número inteiro de 8 bits
     * Short: representa um número inteiro de 16 bits
     * Int: representa um número inteiro de 32 bits
     * Long: representa um número inteiro de 64 bits
     * Float: representa um número de ponto flutuante de 32 bits
     * Double: representa um número de ponto flutuante de 64 bits
     * Boolean: representa um valor booleano verdadeiro/falso
     * Char: representa um caractere Unicode de 16 bits
     * Os tipos não primitivos em Kotlin são:
     *
     * String: representa uma sequência de caracteres
     * Array: representa uma coleção de elementos do mesmo tipo
     * List: representa uma lista imutável de elementos do mesmo tipo
     * Set: representa um conjunto imutável de elementos do mesmo tipo
     * Map: representa um mapa imutável de pares chave/valor do mesmo tipo
     * Classe: representa uma classe definida pelo usuário
     *
     * Kotlin também suporta tipos anuláveis, que podem armazenar valores nulos, adicionando um sinal de interrogação (?) ao final do tipo. Por exemplo, "Int?" representa um inteiro anulável.
     *
     * Veja exemplos de cada tipo de dados mencionado:
     */

    //Byte:
    val b: Byte = 123

    //Short:
    val s: Short = 32767

    //Int:
    val i: Int = 2147483647

    //Long:
    val l: Long = 9223372036854775807

    //Float:
    val f: Float = 3.14159F

    //Double:
    val d: Double = 3.141592653589793

    //Boolean:
    val bool: Boolean = true

    //Char:
    val c: Char = 'a'

    //String:
    val str: String = "Hello, World!"

    //Array:
    val arr: Array<Int> = arrayOf(1, 2, 3, 4, 5)

    //List:
    val list: List<String> = listOf("apple", "banana", "orange")

    //Set:
    val set: Set<Int> = setOf(1, 2, 3, 4, 5)

    //Map:
    val map: Map<String, Int> = mapOf("apple" to 1, "banana" to 2, "orange" to 3)

    //Classe:
    class Person(val name: String, val age: Int)
    val person: Person = Person("John", 30)

    //Anulável:
    val nullableInt: Int? = null

}