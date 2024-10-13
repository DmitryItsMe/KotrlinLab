package p8

fun main() {
    println("Введите температуру в цельсиях: ")
    val n = readln().toInt()
    println(s31(n))
}

fun s31(n1: Int): Double{
    return n1 * 1.8 + 32
}