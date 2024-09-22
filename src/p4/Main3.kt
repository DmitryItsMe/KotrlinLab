package p4

fun main(){
    println("Введите оценку: ")
    val n = readln().toInt()

    when(n){
        1 -> println("Ужасно")
        2 -> println("Плохо")
        3 -> println("Удовлетворительно")
        4 -> println("Хорошо")
        5 -> println("Отлично")
        else -> println("Неизвестная оценка")

    }
}