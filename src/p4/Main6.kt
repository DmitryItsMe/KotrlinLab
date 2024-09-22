package p4

fun main(){
    println("Угадайте цифру: ")
    val n = readln().toInt()

    when(n){
        1 -> println("нет")
        2 -> println("нет")
        3 -> println("нет")
        4 -> println("да")
        5 -> println("нет")
        6 -> println("нет")
        7 -> println("нет")
        8 -> println("нет")
        9 -> println("нет")
        0 -> println("нет")
        else -> println("Введена не цифра")

    }
}