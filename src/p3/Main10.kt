package p3

fun main() {
    println("Введите делимое:")
    val n1 = readln().toInt()
    println("Введите делитель:")
    val n2 = readln().toInt()

    if(n1%n2==0) println("$n2 является делителем числа $n1")
    else println("$n2 не является делителем числа $n1")
}