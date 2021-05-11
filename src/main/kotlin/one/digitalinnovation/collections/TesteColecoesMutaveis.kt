package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("João", 1500.0, "CLT")
    val pedro = Funcionario("Pedro", 2500.0, "PJ")
    val maria = Funcionario("Maria", 2000.0, "CLT")

    println("--------LIST-------------")
    val funcionarios = mutableListOf(joao, maria)   // Diferente das listOf, na mutableListOf dá pra fazer alterações mesmo depois de ser iniciada
    funcionarios.forEach { println(it) }

    println("---------------------")
    funcionarios.add(pedro)                         //Adicionando Pedro -- A alteração sendo feita, pois é uma mutableListOf
    funcionarios.forEach { println(it) }

    println("---------------------")
    funcionarios.remove(maria)                      //Removendo Maria da MutableListOf
    funcionarios.forEach { println(it) }

    val funcionarioSet = mutableSetOf(joao)         // Aqui é uma MutableSet, parecido com a MutableList, podendo alterar as variáveis
    println("-------SET-------------")
    funcionarioSet.forEach { println(it) }

    println("---------------------")
    funcionarioSet.add(pedro)
    funcionarioSet.forEach { println(it) }

    println("---------------------")
    funcionarioSet.remove(joao)
    funcionarioSet.forEach { println(it) }
}