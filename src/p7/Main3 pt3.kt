package p7

fun main() {
    println("Введите первое число: ")
    val n1 = readln().toInt()
    println("Введите второе число: ")
    val n2 = readln().toInt()
    var r = if(n1==n2) true else false
    println(r)
}