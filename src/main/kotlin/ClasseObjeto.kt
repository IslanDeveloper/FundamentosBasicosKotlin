fun main() {
    /**
     * Classes em Kotlin são definidas usando a palavra-chave class
     * seguida do nome da classe.
     * A seguir, um exemplo de declaração de classe simples em Kotlin:
     */

    class Pessoa {
        var nome: String = ""
        var idade: Int = 0
    }

    /**
     * Objetos em Kotlin são criados a partir de classes
     * usando a palavra-chave 'new' ou simplesmente chamando o construtor da classe.
     * Kotlin também suporta a criação de objetos usando a notação de inicialização,
     * onde os valores dos campos da classe são passados durante a criação do objeto.
     * A seguir, exemplos de criação de objetos em Kotlin:
     */

    // criando objeto usando construtor padrão
    val pessoa1 = Pessoa()

    // criando objeto usando notação de inicialização
    val pessoa2 = Pessoa().apply {
        nome = "João"
        idade = 30
    }

    // criando objeto usando construtor personalizado
    class Pessoa1(val nome: String, val idade: Int)

    val pessoa3 = Pessoa1("Maria", 25)

    /**
     * Além disso, em Kotlin, é possível declarar funções dentro de uma classe,
     * as quais são chamadas de métodos.
     * A seguir, um exemplo de definição de método em uma classe em Kotlin:
     */

    class Pessoa2 {
        var nome: String = ""
        var idade: Int = 0

        fun falar(mensagem: String) {
            println("$nome diz: $mensagem")
        }
    }
}