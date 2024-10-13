package p8

fun main() {
    println("Введите строку: ")
    var s = readln()
    println(p32(s))
}

fun p32(n: String): String{
    return n.reversed()
}