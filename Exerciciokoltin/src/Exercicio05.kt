import java.util.Scanner

class Exercicio05{

    fun exercice(){

        val scanner = Scanner(System.`in`)
        println("Digite um número:")
        val numero = scanner.nextInt()

        if (ehPalindromo(numero)) {
            println("O número $numero é um palíndromo.")
        } else {
            println("O número $numero não é um palíndromo.")
        }
    }
    fun ehPalindromo(numero: Int): Boolean {
        val str = numero.toString()
        return str == str.reversed()
    }
}fun main() {
    Exercicio05().exercice()
    Exercicio06().exercice()

}
