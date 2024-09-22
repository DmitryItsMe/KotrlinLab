package p3

fun main() {
    println("Введите делимое:")
    val n1 = readln().toInt()
    println("Введите делитель:")
    val n2 = readln().toInt()

    if(n1%n2==0) println(n1/n2)
    else println("$n1 на $n2 не делится")

}