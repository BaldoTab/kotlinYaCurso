package fp

fun main(params: Array<String>) {
    val array1 = IntArray(10)
    for(i in array1.indices)
        array1[i] = ((Math.random() * 100)).toInt()
    println("Imprimir los valores múltiplos de 2")
    imprimirSi(array1) {x -> x % 2 == 0}
    println("Imprimir los valores múltiplos de 3 o de 5")
    /*
    cuando tenemos una expresión lambda cuya función recibe
    un  parámetro podemos obviarlo, inclusive el signo ->

    Por convención ese único parámetro podemos hacer
    referencia al mismo con la palabra "it"
     */
    imprimirSi(array1) {it % 3 == 0 || it % 5 ==0}
    println("Imprimir los valores mayores o iguales a 50")
    imprimirSi(array1) {it >= 50}
    println("Imprimir los valores comprendidos entre 1 y 10, 20 y 30, 90 y 95")
    imprimirSi(array1) {x -> when(x) { //{when(it) {
        in 1..10 -> true
        in 20..30 -> true
        in 90..95 -> true
        else -> false
    }}
    println("Imprimir todos los valores")
    imprimirSi(array1) {x -> true}
}

fun imprimirSi(array: IntArray, fn:(Int) -> Boolean) {
    for(elemento in array)
        if (fn(elemento))
            print("$elemento ")
    println()
}
