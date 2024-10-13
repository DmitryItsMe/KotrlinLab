package p8

fun main() {
    println("Введите строку: ")
    val s = readln()
    println(p23(s))
}

fun p23(n: String): Int{
    return n.length
}