package p8

fun main() {
    val list = arrayListOf(1, 4, 2, 5, 6, 0)
    println(s42(list))
}

fun s42(list: List<Int>): Int{
    return list.indexOf(0)
}