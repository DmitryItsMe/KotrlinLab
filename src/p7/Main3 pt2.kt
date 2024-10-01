package p7

fun main() {
    val list = arrayListOf<Int>()
    for(i in 0 .. 10) list.add((0..100).random())
    println(list)
    println("Наименьше число: ${list.min()}")
}