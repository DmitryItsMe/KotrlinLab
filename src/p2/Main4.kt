package p2

fun main() {
    println("Введите число")
    val n1 = readln().toInt()
    println("Введите степень")
    val n2 = readln().toInt()
    var res = 1;

    for(i in 1 .. n2) res *= n1
    println(res)
}