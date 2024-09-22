package p3

fun main() {
    println("Введите 2 числа с разной четностью (каждое с новой строки):")
    val n1 = readln().toInt()
    val n2 = readln().toInt()

    if(n1%2==0) println(n2)
    else println(n1)
}