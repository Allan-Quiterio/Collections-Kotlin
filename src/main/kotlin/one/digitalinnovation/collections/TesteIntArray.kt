package one.digitalinnovation.collections

fun main() {
    val values = IntArray(5)

    values[0] = 5
    values[1] = 4
    values[2] = 3
    values[3] = 2
    values[4] = 1

    for (valor in values) {     // Uso de iteração para validar valores, "Variável in Array"
        println(valor)
    }

    println("--------------------")
    values.forEach {
        println(it)             // <- O it nesse caso serve como a variável valor da parte de cima, sem precisar ser declarada como a valor
    }

    println("--------------------")
    for (index in values.indices) {
        println(values[index])          // <- Nesse caso a gente tem o índice pra imprimir o valor que está naquela posição, utilizando a
                                        //    referência do Array passando o índice []
    }
    println("--------------------")

    values.sort()                       // <- Esse recurso organiza os arrays do menor para o maior
    for (valor in values) {
        println(valor)
    }
}
