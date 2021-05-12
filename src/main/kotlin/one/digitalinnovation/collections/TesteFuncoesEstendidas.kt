package one.digitalinnovation.collections

import java.math.BigDecimal

fun main() {
    val salarios = arrayOf(
        "200".toBigDecimal(),
        "150".toBigDecimal(),
        "100".toBigDecimal()
    )

    println(salarios.somatoria())           // Como aqui é uma coisa específica, precisamos criar uma função estendidada para somatória no caso

    println("------------------------")
    println(salarios.media())               // "            "               "                   "               "             media no caso
}