package p4

fun main(){
    println("Введите номер недели: ")
    val n = readln().toInt()

    when(n){
        1 -> println("Понедельник")
        2 -> println("Вторник")
        3 -> println("Среда")
        4 -> println("Четверг")
        5 -> println("Пятница")
        6 -> println("Суббота")
        7 -> println("Воскресенье")
        else -> println("Несуществующий номер недели")

    }
}