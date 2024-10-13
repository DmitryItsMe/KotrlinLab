package p8

fun main(){
    println("Введите два числа (каждое с новой строки): ")
    val n1 = readln().toInt()
    val n2 = readln().toInt()
    println(sum(n1, n2))
}

fun sum(n1: Int, n2: Int): Int{
    return n1 + n2
}