package p8

fun main() {
    println("Введите строку: ")
    var s1 = readln()
    println("Введите подстроку: ")
    var s2 = readln()
    println(p36(s1, s2))
}

fun p36(n1: String, n2: String): Boolean{
    return n1.contains(n2)
}