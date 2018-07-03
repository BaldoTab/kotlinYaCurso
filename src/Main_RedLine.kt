
fun main(params: Array<String>) {
    println("Ingrese la nota del examen:")
    val grade = readLine()!!.toInt()

    if (isPassed(grade)) {
        println("Passed!")
        println(congratulationsMessage(grade))
    } else {
        println("Not passed!")
    }

}

fun isPassed(grade: Int) : Boolean {
    val minPassGrade = 5
    return (grade >= minPassGrade)
}

fun congratulationsMessage(grade: Int) :String {
    if (grade == 10) {
        return "You are a fucking boss"
    }

    if (grade > 7) {
        return "You are a great student"
    }

    if (grade > 5) {
        return "You are a good student"
    }

    return "You should study a bit more"
}