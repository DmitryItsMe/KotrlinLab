package p6

fun main() {
    var list = arrayListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println("Введеите число: ")

    val n = readln().toInt()
    if(list.contains(n)==true) println("Индекс элемента ${list.indexOf(n)}")
    else println("Элемента нет")

}