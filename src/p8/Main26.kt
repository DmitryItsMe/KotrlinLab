package p8

fun main() {
    val list = arrayListOf(1, 4, 2, 5, 6, 0)
    println(s26(list))
}

fun s26(n1: List<Int>): Int{
    return n1.last()
}