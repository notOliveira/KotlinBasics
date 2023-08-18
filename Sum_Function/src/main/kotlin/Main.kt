import kotlin.properties.Delegates

fun main() {
    fun soma(l: List<Double>): Double {

        var  sum = 0.00
        for (item in l) {
            sum += item
        }
        return sum
    }
    val a: Double
    val b: Double
    println("Digite um valor: ")
    a = readln().toDouble()
    println("Digite um valor: ")
    b = readln().toDouble()
    val lista = listOf(a,b)
    println(soma(lista))
}