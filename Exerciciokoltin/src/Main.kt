import java.util.Scanner
fun main() {
    println("*************************************************************************************")
    println("*************************************************************************************")
    println("Exercicio01")
    println("*************************************************************************************")
    println("*************************************************************************************")
    val scanner = Scanner(System.`in`)
    var duvida=0
    val cambioodolar=5.00f
    val cambioReal=0.18f
    var valormoeda=0.00f

    println("Digite a quantidade De Reais(R$) que você deseja converter em dolar(U$\n" +
            "1- Real(R$) Para Dolar(USD)\n" +
            "2- Dolar(USD) para Real(R$)")
    duvida=scanner.nextInt()
    if (duvida==1){
        println("Digite o valor Real(R$) que sera convertido em Dolar(USD)")
        valormoeda=scanner.nextFloat()
        valormoeda=valormoeda*cambioReal
        var fomarto=String.format("%.2f", valormoeda)
        println("O valor em dolar ficou ${fomarto} USD")
    }else if (duvida==2){
        println("Digite o valor Dolar(USD) que sera convertido em Real(R$)")
        valormoeda=scanner.nextFloat()
        valormoeda=valormoeda*cambioodolar
        var fomarto=String.format("%.2f", valormoeda)
        println("O valor em Real ficou ${fomarto} R$")
    }
    Exerciio02().main()
}