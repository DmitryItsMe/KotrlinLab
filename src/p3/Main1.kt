package p3

fun main() {
    println("Введите 3 разных числа (каждое с новой строки):")
    val n1 = readln().toInt()
    val n2 = readln().toInt()
    val n3 = readln().toInt()

    if((n1 > n2) and (n1 > n3)) println(n1)
    else if((n2 > n1) and (n2 > n3)) println(n2)
    else if((n3 > n1) and (n3 > n2)) println(n3)
    else println("Числа не разные")
}