package one.digitalinnovation.collections

import java.math.BigDecimal

fun Array<BigDecimal>.somatoria() = this.reduce{                //Usando função estendida chamada somatória
            acc, valor -> acc + valor
}

fun Array<BigDecimal>.media() =                                 // Criando outra função estrendida
    if (this.isEmpty()) BigDecimal.ZERO                         // Se for 0 vai receber 0
    else this.somatoria() / this.size.toBigDecimal()            // Senao vai reber a some dividir pelo tamanho do Array
