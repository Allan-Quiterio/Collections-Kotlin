package one.digitalinnovation.collections

import com.sun.xml.internal.fastinfoset.util.StringArray

fun main() {
    val nomes = Array(3) {""}

    nomes[0] = "Maria"
    nomes[1] = "José"
    nomes[2] = "Zico"

    for(i in nomes) {
        println(i)
    }
    println("--------------")
    nomes.sort()
    nomes.forEach {
        println(it)
    }

    println("-----------------")
    val nomes2 = arrayOf("Maria", "José", "Paulo")
    nomes2.sort()
    nomes2.forEach {
        println(it)
    }
}