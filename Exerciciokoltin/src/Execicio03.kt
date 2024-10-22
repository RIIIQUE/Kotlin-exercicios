import java.util.Scanner
class exercicicio03 {
    fun main() {
        println("*************************************************************************************")
        println("*************************************************************************************")
        println("Exercicio03")
        println("*************************************************************************************")
        println("*************************************************************************************")
        var decisao = true
        val scanner = Scanner(System.`in`)
        while (decisao == true) {
            println("Digite o valor a ser verificado se é negativo ou positivo ou se é == 0")
            var valor = scanner.nextFloat()

            if (valor == 0.00f) {
                println("o valor digitado é zero")
            } else if (valor > 0) {
                println("O valor digitado é posistivo(+)")
            } else if (valor < 0) {
                println("o valor digitado é negativo")
            }
            println("Deseja continuar? 1=SIM 2=Não")
            var index = scanner.nextInt()
            if (index == 1) {
                decisao = true
            } else if (index == 2) {
                decisao = false
            }

        }
        Exercicio04().exercice()
    }
}