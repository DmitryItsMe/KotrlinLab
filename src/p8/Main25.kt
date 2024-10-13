package p8

fun main() {
    println("Введите строку: ")
    var s1 = readln()
    println("Введите строку: ")
    var s2 = readln()
    println(p25(s1, s2))
}

fun p25(s1: String, s2: String): String{
    return s1 + s2
}