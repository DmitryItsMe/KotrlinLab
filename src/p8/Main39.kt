package p8

fun main() {
    val list = arrayListOf(1, 4, 2, 5, 6, 0)
    println(s39(list))
}

fun s39(n1: List<Int>): List<Int>{
    return n1.reversed()
}