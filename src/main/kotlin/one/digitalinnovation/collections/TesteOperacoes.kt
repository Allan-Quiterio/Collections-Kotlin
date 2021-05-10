package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(100.0, 150.0, 125.0)

    for (i in salarios) {
        println(i)
    }

    println("-----------------")
    println("O maior salário é: ${salarios.maxOrNull()}")             // .maxOrNull para maior valor
    println("O menor salário é: ${salarios.minOrNull()}")             // .minOrNull para menor valor
    println("A média de salário é: ${salarios.average()}")      // .average para media

    val salariosMaiorQue2500 = salarios.filter { it > 130.0}    // .filter serve para filtrar uma condição comparada a outra
    println("---------------")

    salariosMaiorQue2500.forEach{ println("O salário maior que 130.0 é: $it")}

    println("---------------")
    println(salarios.count { it in 120.0..160.0 })              // .count serve para contar quantos valores existem dentro desse intervalo

    println("---------------")
    println(salarios.find { it == 150.0})                       // .find é um tipo de filtro mais específico para coletar valor dentro do array
    println(salarios.find { it == 140.0})

    println("---------------")
    println(salarios.any { it == 100.0})                        // .any, diferente do find ele procura em toda o array, mas não dando o valor,
    println(salarios.any { it == 110.0})                        //  validando se for true.
}
