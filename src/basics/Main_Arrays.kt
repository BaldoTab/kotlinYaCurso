package basics

fun main(params: Array<String>) {
    /*
    IntArray
    ByteArray
    ShortArray
    LongArray
    FloatArray
    DoubleArray
    BooleanArray
    CharArray
    Array<String>
     */

    val salaries: IntArray
    salaries = IntArray(5)

    //carga de sus elementos por teclado
    for(i in 0..4) {
        print("Ingrese sueldo:")
        salaries[i] = readLine()!!.toInt()
    }
    //impresion de sus elementos
    for(i in 0..salaries.size - 1) {
        println(salaries[i])
    }

    for (salary in salaries) {
        println(salary)
    }

    for (i in salaries.indices) { // 0..4
        println(i)
    }
}