package p7

fun main() {

    println("Первое число: ")
    var n1 = readln().toInt()
    println("Операция:\n( +  -  /  * )")
    var o = readln()
    println("Второе число: ")
    var n2 = readln().toInt()
    println("Результат: ${op(o, n1, n2)}")

}

fun op(o: String, n1: Int, n2: Int):Int {
    when (o) {
        "+" -> return n1 + n2
        "-" -> return n1 - n2
        "*" -> return n1 * n2
        "/" -> return n1 / n2
        else -> return 0
    }
}
