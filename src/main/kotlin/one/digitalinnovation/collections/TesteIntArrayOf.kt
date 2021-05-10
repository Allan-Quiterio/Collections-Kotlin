package one.digitalinnovation.collections

fun main() {
    val values = intArrayOf(2, 3, 4, 7, 11, 6) // Nesse caso é mais flexível o intArrayOf que o IntArray
                                              // pois dá pra alterar o tamanho do array na declaração
    values.forEach {
        println(it)
    }
    println("------------------")
    values.sort()
    for (valor in values) {
        println(valor)
    }
}
