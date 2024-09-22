package p3

fun main() {
    println("Введите число:")
    val n1 = readln().toInt()

    if(n1%2==0) println("Число четное")
    else println("Число нечетное")

    if(n1%10==7) println("Число оканчивается на 7")
    else println("Число не оканчивается на 7")
}