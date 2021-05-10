package one.digitalinnovation.collections

fun main() {
    val joao = funcionario("João", 1500.0, "CLT")
    val pedro = funcionario("Pedro", 2500.0, "PJ")
    val maria = funcionario("Maria", 2000.0, "CLT")

    val funcionarios = listOf(joao, pedro, maria)       // listOf serve para ordenar em uma lista os objetos

    funcionarios.forEach{ println(it) }        // <- Aqui o it representa o funcionário e não uma String ou um Double

    println("--------------")
    println(funcionarios.find { it.nome == "Maria" })    // Aqui ele procura especificamente dentro de funcionários a Maria.
    println("--------------")
    println(funcionarios.find { it.salario == 2000.0 })  // Aqui é a mesma coisa de cima porém procurando pelo salário agora e não pelo nome

    println("--------------")
    funcionarios
        .sortedBy { it.salario }        // .sortedBy é um recurso de encadeamento, que faz a revisão dos salários do menor para o maior
        .forEach { println(it)}         // nesse caso o forEach tem a responsabilidade de terminar todas as ações que estão sendo atreladas a
                                        //  nossa coleção

    println("--------------")
    funcionarios
        .groupBy { it.tipoContratacao }   // .groupBy faz o agrupamento de uma determinada ordem, No caso de quem é PJ e CLT
        .forEach { println(it)}
}


data class funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
) {
    override fun toString(): String =
        """
            Nome:    $nome 
            Salário: $salario
        """.trimIndent()
  }