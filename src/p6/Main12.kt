package p6

fun main() {
    var list = arrayListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val n = list[0]
    list[0] = list[1]
    list[1] = n
    println(list)
}