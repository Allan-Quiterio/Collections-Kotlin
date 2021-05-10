package one.digitalinnovation.collections

fun main() {
    val salarios = DoubleArray(4)
    salarios[0] = 150.0
    salarios[1] = 180.0
    salarios[2] = 160.0
    salarios[3] = 110.0

    for (i in salarios) {
        println(i)
    }
    println("--------------")
    salarios.forEachIndexed{ index, salario ->      // nesse caso, ele já está preparado com o index
        salarios[index] = salario * 1.1
    }
    salarios.forEach{ println(it)}

    println("--------------")
    val salarios2 = doubleArrayOf( 500.0, 320.0, 850.0, 445.0)
    salarios2.sort()
    salarios2.forEach{ println(it)}
}
