import java.util.Scanner
class Exercicio06 {

    fun exercice() {
        val scanner = Scanner(System.`in`)
        val lista = ArrayList<String>()
        var quantidade=0
        var texto=""

        println("Quantas palavras você quer concatenar?")
        quantidade = scanner.nextInt()
        scanner.nextLine()

        for (i in 1..quantidade) {
            println("Digite a palavra que será concatenada:")
            texto = scanner.nextLine()
            lista.add(texto)
        }

        val resultado = lista.joinToString(separator = " ")
        println("O texto ficou: $resultado")
    }
    }fun main() {
        Exercicio07().exercicie()
        Exercicio06().exercice()
    }


