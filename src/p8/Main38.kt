package p8

fun main() {
    println("Введите строку: ")
    val s = readln()
    println(p38(s))
}

fun p38(n: String): Int{
    return n.length
}