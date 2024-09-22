package p3

fun main() {
    println("Введите 2 вещественных числа (каждое с новой строки):")
    val n1 = readln().toInt()
    val n2 = readln().toInt()

    if(n1>n2) println("$n1 > $n2")
    else if(n2>n1) println("$n2 > $n1")
    else println("Числа равны")
}