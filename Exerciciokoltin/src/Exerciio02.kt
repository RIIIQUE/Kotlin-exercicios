import java.util.Scanner
class Exerciio02 {
    fun main() {
        println("*************************************************************************************")
        println("*************************************************************************************")
        println("Exercicio02")
        println("*************************************************************************************")
        println("*************************************************************************************")
        val scanner = Scanner(System.`in`)
        val numeros = ArrayList<Int>()
        var inicio = 0
        var fim=0
        val i= inicio

        println("Por favor digite o inicio da Lista")
        inicio=scanner.nextInt()
        println("Por favor digite o Final da Lista")
        fim=scanner.nextInt()

        for (i in inicio..fim ){
            numeros.add(i)
        }

        var produto: Long =1

        for (numero in numeros) {
            produto *= numero
        }
        println("O produto dos numeros de ${inicio} a ${fim} é ${produto}")




        exercicicio03().main()
    }



}
