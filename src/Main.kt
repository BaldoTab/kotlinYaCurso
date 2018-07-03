
fun main(params: Array<String>) {
    println("Hello Kotlin!")
    valuesAndVariables()
    println(exercise1())
    println(exercise2())
}

fun valuesAndVariables() {
    val value1: Int
    val value2: Int
    value1 = 100
    value2 = 200
    var result: Int
    result = value1 + value2
    println("$value1 + $value2 = $result")
    result = value1 * value2
    println("$value1 x $value2 = $result")
}

fun exercise1(): String {
    val squareSide = 50
    val surface : Int
    val perimeter: Int

    surface = getSquareSurface(squareSide)
    perimeter = getSquarePerimeter(squareSide)

    return "Surface: $surface & Perimeter: $perimeter"
}

fun getSquarePerimeter(squareSide: Int) : Int {
    return squareSide * 4
}

fun getSquareSurface(squareSide: Int) : Int {
    return squareSide * squareSide
}

fun exercise2(): Float {
    val weight1 = 62.5f
    val weight2 = 71.2f
    val weight3 = 74.8f

    return (weight1 + weight2 + weight3) / 3
}