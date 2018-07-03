fun main(parametro: Array<String>) {
    calcularSueldo("juan", 10.5, 120)
    calcularSueldo(costoHora = 12.0, cantidadHoras = 40, nombre="ana")
    calcularSueldo(cantidadHoras = 90, nombre = "luis", costoHora = 7.25)

    multiplos2y5()
}

fun calcularSueldo(nombre: String, costoHora: Double, cantidadHoras: Int) {
    val sueldo = costoHora * cantidadHoras
    println("$nombre trabajó $cantidadHoras horas, se le paga por hora $costoHora por lo tanto le corresponde un sueldo de $sueldo")
}

fun multiplos2y5() {
    fun multiplo(numero: Int, valor: Int) = numero % valor == 0

    var mult2 = 0
    var mult5 = 0
    for(i in 1..5) {
        print("Ingrese valor:")
        val valor = readLine()!!.toInt()
        if (multiplo(valor, 2))
            mult2++
        if (multiplo(valor, 5))
            mult5++
    }
    println("Cantidad de múltiplos de 2 : $mult2")
    println("Cantidad de múltiplos de 5 : $mult5")
}