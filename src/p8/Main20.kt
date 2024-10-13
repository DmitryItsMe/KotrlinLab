package p8

fun main() {
    val list = arrayListOf(1, 4, 2, 5, 6)
    println(max20(list))
}

fun max20(n1: List<Int>): Int{
    val a = n1.maxOrNull() ?: 0
    return a
}