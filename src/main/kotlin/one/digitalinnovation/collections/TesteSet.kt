package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("João", 1500.0, "CLT")
    val pedro = Funcionario("Pedro", 2500.0, "PJ")
    val maria = Funcionario("Maria", 2000.0, "CLT")

    val funcionarios1 = setOf(joao, pedro)      // esse setOf está relacionado ao conjunto funcionarios1
    val funcionarios2 = setOf( maria)

    val resultUnion = funcionarios1.union(funcionarios2)  // unindo os conjuntos em um só
    resultUnion.forEach{ println(it) }

    println("-----------------")
    val funcionarios3 = setOf(joao, pedro, maria)
    val resultSubtract = funcionarios3.subtract(funcionarios2) // tirando um conjunto de outro
    resultSubtract.forEach{ println(it) }

    println("-----------------")
    val resultIntersect = funcionarios3.intersect(funcionarios2) // vai mostrar o que tem em comum entre os dois conjuntos
    resultIntersect.forEach{ println(it) }
}