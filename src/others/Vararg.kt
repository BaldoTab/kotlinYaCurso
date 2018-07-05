package others

fun main(args: Array<String>) {
    val total = sumar(10, 20, 30, 40, 50)
    println(total)
}

// varios argumentos pueden recibirse y terminan siendo Array
fun sumar(vararg numeros: Int): Int {
    var suma = 0
    for(elemento in numeros)
        suma += elemento
    return suma
}
