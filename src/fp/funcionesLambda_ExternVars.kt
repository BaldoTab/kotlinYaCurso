package fp

fun main(params: Array<String>) {
    val array1 = IntArray(10)
    for (i in array1.indices)
        array1[i] = ((Math.random() * 100)).toInt()
    println("Impresion de todo el arreglo")
    for (elemento in array1)
        print("$elemento ")
    println()
    var cantidad = 0
    recorrerTodo(array1) {
        if (it % 3 == 0)
            cantidad++
    }
    println("La cantidad de elementos múltiplos de 3 son $cantidad")
    var suma = 0
    recorrerTodo(array1) {
        if (it > 50)
            suma += it
    }
    println("La suma de todos los elementos mayores a 50 es $suma")
}

/*
    No es común indicar el objeto Unit si la función no retorna dato,
    por defecto Kotlin sabe que debe retornar un objeto Unit.
 */
fun recorrerTodo(array: IntArray, fn:(Int) -> Unit) {
    for(element in array)
        (fn(element))
}
