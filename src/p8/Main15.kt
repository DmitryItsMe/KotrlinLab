package p8

fun main(){
    println("Введите два числа (каждое с новой строки): ")
    val n1 = readln().toInt()
    val n2 = readln().toInt()
    println(srav15(n1, n2))
}

fun srav15(n1: Int, n2: Int): Int{
    if(n1 > n2) return n1
    else if(n2 > n1) return n2
    else return n1
}