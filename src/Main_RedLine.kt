
fun main(params: Array<String>) {
    println("Ingrese el primer valor:")
    val value1 = readLine()!!.toInt()
    println("Ingrese el segundo valor:")
    val value2 = readLine()!!.toInt()
    var result = value1 + value2
    println("$value1 + $value2 = $result")
    result = value1 * value2
    println("$value1 x $value2 = $result")
}