package p8

fun main() {
    println("Введите чило: ")
    val n1 = readln().toInt()
    println(fact17(n1))
}

fun fact17(n1: Int): Int{
    var n = 1
    for(i in 1 .. n1) n*=i
    return n
}