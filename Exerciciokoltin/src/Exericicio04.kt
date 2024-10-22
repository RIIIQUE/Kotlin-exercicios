import java.util.Scanner
class Exercicio04 {
    fun exercice() {
        val scanner = Scanner(System.`in`)
        var numero = 0
        println("Digite o numero que tera seus digitos somados:" +
                "\nEx.: 12=1+2")
        numero=scanner.nextInt()
        val resultado = somaDigitos(numero)
        println("A soma dos dígitos de $numero é $resultado")
    }

    fun somaDigitos(numero: Int): Int {
        var num = numero
        var soma = 0

        while (num != 0) {
            soma += num % 10
            num /= 10
        }
        return soma
    }
}

