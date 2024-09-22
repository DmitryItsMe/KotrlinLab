package `5`

fun main() {
    println("Введите число: ")
    val n = readln().toInt();
    var s = 1;
    for (i in 1..n) {
        s *= i;
    }
    println(s)
}