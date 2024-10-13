package p8

fun main() {
    println("Введите чило: ")
    val n1 = readln().toInt()
    println(s35(n1))
}

fun s35(n1: Int): Int{
    var n = 0
    for(i in 0 .. n1) n+=i
    return n
}