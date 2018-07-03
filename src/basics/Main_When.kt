package basics

fun main(parametro: Array<String>) {
    print("Ingrese coordenada x del punto:")
    val x = readLine()!!.toInt()
    print("Ingrese coordenada y del punto:")
    val y = readLine()!!.toInt()
    when {
        x > 0 && y > 0 -> println("Primer cuadrate")
        x < 0 && y > 0 -> println("Segundo cuadrante")
        x < 0 && y < 0 -> println("Tercer cuadrante")
        x > 0 && y < 0 -> println("Cuarto cuadrante")
        else -> println("El punto se encuentra en un eje")
    }

    /* Lo mismo
    if (x > 0 && y > 0)
        print("Se encuentra en el primer cuadrante")
    else
        if (x < 0 && y > 0)
            print("Se encuentra en el segundo cuadrante")
        else
            if (x < 0 && y < 0)
                print("Se encuentra en el tercer cuadrante")
            else
                if (x > 0 && y < 0)
                    print("Se encuentra en el cuarto cuadrante")
                else
                    print("Se encuentra en un eje")

     */

    digits(1200)
}

fun digits(valor: Int) {
    when (valor){
        in 1..9 -> print("Tiene 1 dígito")
        in 10..99 -> print("Tiene 2 dígitos")
        in 100..999 -> print("Tiene 3 dígitos")
        in 1000..9999 -> print("Tiene 4 dígitos")
        in 10000..99999 -> print("Tiene 5 dígitos")
        else -> print("No se encuentra comprendido en el rango indicado")
    }
}