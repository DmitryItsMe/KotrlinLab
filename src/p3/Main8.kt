package p3

fun main() {
    println("Введите расстояние в километрах:")
    val n1 = readln().toInt()
    println("Введите расстояние в футах:")
    val n2 = readln().toInt()

    if((n1*1000) > (n2 * 305)) println("$n1 > $n2")
    else if((n1*1000) < (n2 * 305)) println("$n1 < $n2")
    else println("$n1 = $n2")

}