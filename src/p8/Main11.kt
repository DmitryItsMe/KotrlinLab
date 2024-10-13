package p8

fun main(){
    println("Ведите уравнение: ")
    val y = readln()
    println(yr(y))
}

fun yr(y: String):Int {
    val n1 = y.get(0).digitToInt()
    val n2 = y.get(2).digitToInt()
    val o = y.get(1)

    when (o) {
        '+' -> return n1 + n2
        '-' -> return n1 + n2
        '/' -> return n1 + n2
        '*' -> return n1 + n2
        else -> return 0
    }
}
