package oop

fun main(parametro: Array<String>) {
    val persona1: Persona
    persona1 = Persona()
    persona1.inicializar("Juan", 12)
    persona1.imprimir()
    val persona2: Persona
    persona2 = Persona()
    persona2.inicializar("Ana", 50)
    persona2.imprimir()
    println(persona2.nombre)
}

class Persona {
    var nombre: String = ""
    var edad : Int = 0
    var adult: Boolean = isAdult()

    fun inicializar (nombre: String, edad: Int) {
        this.nombre = nombre
        this.edad = edad
        this.adult = isAdult()
    }

    fun imprimir() {
        println("Persona con nombre ${this.nombre} y edad $edad")
    }

    private fun isAdult():Boolean {
        return edad >= 18
    }
}