package p8

fun main() {
    println("Введите чило: ")
    val n1 = readln().toInt()
    println(srav16(n1))
}

fun srav16(n1: Int): Boolean{
    val n = if (n1%2==0) true else false
    return n
}