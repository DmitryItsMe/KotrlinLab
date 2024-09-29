package p6

fun main() {
    var list = arrayListOf(1, 2, 3, 9, 5)
    val list2 = arrayListOf(3, 10, 6, 8, 4, 5)

    val listR = list.intersect(list2)
    println(listR)
}