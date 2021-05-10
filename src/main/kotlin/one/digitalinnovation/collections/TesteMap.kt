package one.digitalinnovation.collections

fun main() {
    val pair: Pair<String, Double> = Pair("João", 100.0) // Recurso do Koltin para criar um par, nesse caso de String com Double

    val map1 = mapOf(pair)                               // Aqui cria-se um mapa, e para cada par criado no Pair, esse par é adicionado no mapa

    map1.forEach{ (k, v) -> println("Chaves: $k - Valor: $v")}

    val map2 = mapOf(
        "Pedro" to  2500.0,     // Parafunções infix: "to" permite criar a mesma coisa do Pair de cima
        "Maria" to  3000.0
    )
    println("------------------")
    map2.forEach{ (k, v) -> println("Chaves: $k - Valor: $v")}
}