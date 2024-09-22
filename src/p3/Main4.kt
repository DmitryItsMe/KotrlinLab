package p3

fun main() {
    println("Введите 2 числа, сначала больше, затем меньшее (каждое с новой строки):")
    val n1 = readln().toInt()
    val n2 = readln().toInt()

    if(n1%n2==0) println("Число кратно")
    else println("Число не кратно, остаток: ${n1%n2}")
}