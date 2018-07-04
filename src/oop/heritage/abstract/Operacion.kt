package oop.heritage.abstract

/*
En algunas situaciones tenemos métodos y propiedades comunes a un conjunto de clases,
podemos agrupar dichos métodos y propiedades en una clase abstracta.

No se pueden definir objetos de una clase abstracta
seguramente será heredada por otras clases de las que si podremos definir objetos.
 */
abstract class Operacion(val valor1: Int, val valor2: Int) {
    protected var resultado: Int = 0

    abstract fun operar()

    fun imprimir() {
        println("Resultado: $resultado")
    }
}