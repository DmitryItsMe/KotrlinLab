package p8

fun main() {
    val list = arrayListOf(1, 4, 2, 5, 6, 0)
    println("Введите индекс: ")
    val n = readln().toInt()
    println(s33(list, n))
}

fun s33(list: List<Int>, n1: Int): Int{
    return list[n1]
}