fun main() {
    /**
     * Em Kotlin, as variáveis são importantes por armazenar dados e são divididas em 2 tipos: val e var;
     * val: Variável imutável, ou seja, depois de declarada, o seu valor não pode ser alterado;
     * var: Variável mutável, ou seja, seu valor pode ser alterado há qualquer momento.
     * Exemplos:
     */

    val nome = "Islan"
    //nome = "João" // Ao tentar alterar o valor da variável nome, um erro aparece.
    println(nome)

    var idade = 19
    // Veja que alterei o valor da variável idade sem problemas e o valor 19 será substituido por 20.
    idade = 20
    println(idade)
}