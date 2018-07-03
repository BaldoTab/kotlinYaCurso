package basics
fun main(params: Array<String>) {
    val digit = 1..9
    val dozen = 1..12
    var letras = "a".."z"

    println(5 in dozen) // true
    println(13 in dozen) // false

    for (i in digit) {
        println(i)
    }

    for (i in 1..9 step 2) {
        println(i)
    }

    for (i in 10 downTo 1) {
        println(i)
    }
}