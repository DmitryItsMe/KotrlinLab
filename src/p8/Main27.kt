package p8

fun main() {
    val list = arrayListOf(1, 4, 2, 5, 6, 0)
    println("Введите число: ")
    val n = readln().toInt()
    println(s27(list, n))
}

fun s27(list: List<Int>, n1: Int): Boolean{
    return list.contains(n1)
}