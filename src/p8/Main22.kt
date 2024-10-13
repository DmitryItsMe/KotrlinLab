package p8

fun main() {
    println("Введите строку: ")
    val s = readln()
    println(p22(s))
}

fun p22(n: String): Boolean{
    if(n == n.reversed()) return true else return false
}