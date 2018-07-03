package oop

fun main(parametro: Array<String>) {
    val persona1 = PersonaWithConstructor("Juan", 12)
    persona1.imprimir()
    println(persona1.esMayorEdad())
    //val persona2 = PersonaWithConstructor("Ana", 50)
    val persona2 = PersonaWithConstructor(edad = -1, nombre = "Ana")
    persona2.imprimir()
    println(persona2.esMayorEdad())
}

class PersonaWithConstructor (nombre: String, edad: Int) {
    var nombre: String = nombre
    var edad : Int = edad

    init {
        if (edad < 0) {
            this.edad = 0
        }
    }

    fun imprimir() {
        println("Persona con nombre ${this.nombre} y edad $edad")
    }

    fun esMayorEdad():Boolean {
        return edad >= 18
    }
}