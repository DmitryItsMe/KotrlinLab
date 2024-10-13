package p8

fun main() {
    println("Введите число: ")
    val n = readln().toInt()
    println(s30(n))
}

fun s30(n1: Int): Int{
    var sum = 0
    for(i in 0 .. n1) sum+=i
    return sum
}