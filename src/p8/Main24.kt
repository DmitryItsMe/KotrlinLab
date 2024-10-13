package p8

fun main() {
    println("Введите строку: ")
    var s = readln()
    println(p24(s))
}

fun p24(n: String): String{
    return n.toUpperCase()
}