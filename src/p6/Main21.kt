package p6

fun main() {
    var list = arrayListOf(3, 5, 6, 2, 10, 8, 21)
    println(list)
    println("Введите число")
    val n = readln().toInt()

    list.remove(n)

    println(list)

}