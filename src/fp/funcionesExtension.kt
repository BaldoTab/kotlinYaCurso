package fp

/*
    Las funciones de extensión nos permiten agregar otros métodos
    a una clase existente sin tener que heredar de la misma
 */

fun main(args: Array<String>) {
    val cadena1 = "Viento"
    println(cadena1.mitadPrimera())
    println(cadena1.segundaMitad())
}

fun String.mitadPrimera(): String {
    return this.substring(0..this.length/2-1)
}

fun String.segundaMitad(): String{
    return this.substring(this.length/2..this.length-1)
}
