package p4

fun main(){
    println("Напишите цифру: ")
    val n = readln().toInt()

    when(n){
        1 -> println("Один")
        2 -> println("Два")
        3 -> println("Три")
        4 -> println("Четыре")
        5 -> println("Пять")
        6 -> println("Шесть")
        7 -> println("Семь")
        8 -> println("Восемь")
        9 -> println("Девять")
        0 -> println("Ноль")
        else -> println("Введена не цифра")

    }
}